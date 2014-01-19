import java.io.*;
import antlr.*;

public class HTMLIndex {
  protected static String TMPFILENAME = "_tmpindex";
  protected static String pathToFiles = ".";
  protected static File outputDir = new File(".");

  public static void main(String[] args) {
    try {
	// if we have at least one command-line argument
	if (args.length > 0 ) {
	  System.err.println("Parsing...");
	  // handle args, which must be first
	  int i;
	  for(i=0; i< args.length;i++) {
	    if ( args[i].charAt(0)!= '-' ) {
	      break;
	    }
	    i = doArg(args, i);
	  }
	  // for each directory/file specified on the command line
	  for(int j=i; j< args.length;j++) {
	    if ( args[j].charAt(0)== '-' ) {
	      System.out.println("options must come first: "+args[j]);
	      panic();
	    }
	    doFile(new File(args[j])); // parse it
	  }
	}
	else
	  System.err.println("Usage: java HTMLIndex "+
				 "[-output outputdir] [-path-to-files path]"+
			     "<directory/file names>");
    }
    catch(Exception e) {
      System.err.println("exception: "+e);
      System.exit(1);
    }
  }

  static void panic() {System.exit(1);}

  static int doArg(String[] args, int i) {
	// a prefix in the HTML HREF tag used normally to point
	// to a directory where the index file will find the
	// documents indexed by this utility.
    if ( args[i].equals("-path-to-files") ) {
      i++;
      String path = args[i];
      if ( path.charAt(0)=='-' ) {
	System.err.println("missing operand of -path-to-files option");
	panic();
      }
      pathToFiles = path;
      return i;
    }
    if ( args[i].equals("-output") ) {
      i++;
      String o = args[i];
      if ( o.charAt(0)=='-' ) {
	System.err.println("missing operand of -output option");
	panic();
      }
      File f = new File(args[i]);
      if ( !f.exists() ) {
	System.err.println("warning: output directory "+f.getName()+" doesn't exist; creating...");	
	f.mkdirs();  // create if doesn't exist
      }
      if ( !f.isDirectory() ) {
	System.err.println("output directory "+f.getName()+" exists as a file");	
	panic();
      }
      outputDir = f;
    }
    else {
      System.err.println("invalid argument '"+args[i]+"'");
	panic();
    }
    return i;
  }

  // This method decides what action to take based on the type of
  // file we are looking at
  public static void doFile(File f) throws Exception {
    // If this is a directory, walk each file/dir in that directory
    if (f.isDirectory()) {
      String files[] = f.list();
      for(int i=0; i < files.length; i++)
	doFile(new File(f, files[i]));
    }
    
    // otherwise, if this is a html file, parse it!
    else if ((f.getName().length()>5) &&
	     f.getName().substring(f.getName().length()-5).equals(".html")) {
      System.err.println("   "+f.getAbsolutePath());
      parseFile(f, new FileInputStream(f.getAbsolutePath()));
    }
  }
  
  // Here's where we do the real work...
  public static void parseFile(File inFile, InputStream in) throws Exception {
    try {
      File outFile;
      boolean sameDir=false;
      // check for overwrite
      if ( inFile.getParent().equals(outputDir.getAbsolutePath()) ) {
	outFile = new File(TMPFILENAME);
	sameDir=true;
      }
      else {
	outFile = new File(outputDir, inFile.getName());
      }

      PrintStream out = new PrintStream(new FileOutputStream(outFile));
      HTMLHeaderGrabber lexer = new HTMLHeaderGrabber(in);
      TokenBuffer buffer = new TokenBuffer(lexer);
      HTMLIndexer parser = new HTMLIndexer(buffer);
      parser.setOutputStream(out);
      parser.setFilePrefix(pathToFiles);
      parser.setFileName(inFile.getName());
      parser.document();
      in.close();
      out.close();

      if ( sameDir ) {
	if ( !inFile.canWrite() ) {
	  System.err.println("cannot rewrite "+inFile.getName());
	}
	else {
	  // kill existing file
	  inFile.delete();
	  // rename the tmp file into the real file name
	  outFile.renameTo(inFile);
	}
      }
    }
    catch (IOException io) {
      System.err.println("IOException: "+io);
      io.printStackTrace();   // so we can get stack trace		
    }
    catch (Exception e) {
      System.err.println("parser exception: "+e);
      e.printStackTrace();   // so we can get stack trace		
    }
  }

}

