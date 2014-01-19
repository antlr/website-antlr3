import java.util.Hashtable;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.Enumeration;

public class BuildPageIndex implements FormDataBehavior, Serializable {
  private Hashtable tags;
  private String company;
  private String date;
  private transient BufferedWriter output;
  private String filename;
  private Vector index;
  private String indexEntryLabel;
	
  class IndexEntry implements Serializable {
    String label;
    String url;
    public IndexEntry(String label, String url) {
      this.label = label;
      this.url = url;
    }
  }
	
  public BuildPageIndex(Hashtable tags, String label) {
    this.tags = tags;	// list of tag translations (if any)
    indexEntryLabel = label;
    try {
      FileInputStream fIn = new FileInputStream("index.objects");
      ObjectInputStream in = new ObjectInputStream(fIn);
      try {
	index = (Vector)in.readObject();
      }
      catch (IOException io) {
	System.err.println(io);
      }
    }
    catch (Exception io) {		// first time program is run, no persistence file
      index = new Vector(50);
    }
  }

  public void enter() {
    try {
      Calendar c = new GregorianCalendar();
      int day = c.get(Calendar.DAY_OF_MONTH);
      int month = c.get(Calendar.MONTH);
      int year = c.get(Calendar.YEAR);
      int d = c.get(Calendar.MILLISECOND);
      filename = "t"+month+"-"+day+"-"+year+"-"+d+".html";
      output = new BufferedWriter(new FileWriter(filename));
      output.write("<html>"); output.newLine();
      output.write("<body>"); output.newLine();
      output.write("<font face=\"Arial\">");
      output.write("<table border=0>"); output.newLine();
      // make the index entry now that we have file name and label
      index.addElement(new IndexEntry(indexEntryLabel, filename));
    }
    catch (IOException io) {
      System.err.println(io);
    }
  }

  public void dataPair(String tag, String value) {
    // System.out.println("tag: "+tag);
    try {
      output.write("<tr>"); output.newLine();
      output.write("<td valign=top width=175>"); output.newLine();
      String t=tag;
      if ( tags!=null ) {		// translate tags if table exists
	t = (String)tags.get(tag);
      	if ( t==null ) {
	  return;	// don't print entries for tags with no translation
	}
      }
      output.write("<b>"+t+"</b>"); output.newLine();
      output.write("</td>"); output.newLine();
      output.write("<td width=400>"); output.newLine();
      printAsHTML(value);
      output.write("</td>"); output.newLine();
      output.write("</tr>"); output.newLine();
    }
    catch (IOException io) {
      System.err.println(io);
    }
  }

  public void exit() {
    try {
      output.write("</table>"); output.newLine();
      output.write("</font>"); output.newLine();
      output.write("</body>"); output.newLine();
      output.write("</html>"); output.newLine();
      output.close();
    }
    catch (IOException io) {
      System.err.println(io);
    }
    updatePersistenceFile();
    buildIndex();
  }

  protected void updatePersistenceFile() {
    try {
      FileOutputStream fOut = new FileOutputStream("index.objects");
      ObjectOutput out = new ObjectOutputStream(fOut);
      out.writeObject(index);
      out.flush();
      out.close();
    }
    catch (IOException io) {
      System.err.println(io);
    }
  }

  protected void buildIndex() {
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("index.html"));
      out.write("<html>"); out.newLine();
      out.write("<body>"); out.newLine();
      out.write("<h2>Page List</h2>"); out.newLine();
      out.write("<ul>"); out.newLine();
      Enumeration e = index.elements();
      while ( e.hasMoreElements() ) {
	IndexEntry i = (IndexEntry)e.nextElement();
	out.write("<li><a href=\""+i.url+"\">"+i.label+"</a>");
	out.newLine();
      }
      out.write("</ul>"); out.newLine();
      out.write("</body>"); out.newLine();
      out.write("</html>"); out.newLine();
      out.close();
    }
    catch (IOException io) {
      System.err.println(io);
    }
  }

  /** Print out the string substituting <br> for newline. */
  protected void printAsHTML(String s) {
    try {
      int i=0;
      while ( i<s.length() ) {
	if ( s.charAt(i)=='\r' ) {
	  i++;
	}
	if ( s.charAt(i)=='\n' ) {
	  output.write("<br>");
	}
	else {
	  output.write(s.charAt(i));
	}
	i++;
      }
    }
    catch (IOException io) {
      System.err.println(io);
    }
  }

}

