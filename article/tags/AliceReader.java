package alice.io;

import java.io.Reader;

public class AliceReader {

  protected Reader input;
  protected AliceReaderListener parasite;

  public AliceReader(Reader r, AliceReaderListener parasite) {
	input = r;
	this.parasite = parasite;
  }

  public void read() {
	try {
	  AliceLexer lexer = new AliceLexer(input);
	  AliceParser parser = new AliceParser(lexer);
	  parser.addListener(parasite);
	  parser.categories();
	} catch(Exception e) {
	  System.err.println("exception: "+e);
	}
  }

}
