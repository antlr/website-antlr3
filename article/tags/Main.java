package alice.io;

import java.io.*;

class Main {

  // a sample behavior object for the alice data parser
  static class printListener implements AliceReaderListener {
	public void newCategory(String pattern,
							String that,
							String template)
	{
	  System.out.println("----\n"+pattern+","+that+","+template);
	}
  }

  public static void main(String[] args) {
	BufferedReader in
	  = new BufferedReader(new InputStreamReader(System.in));
	AliceReader alice = new AliceReader(in, new printListener());
	alice.read();
  }
}
