
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import com.googlecode.sparkleg.*;

public class SparqlMain {

    public static void main(String args[]) throws Exception {

        System.out.println("Working on file " + args[0]);

        SparqlLexer lex = new SparqlLexer(new /*ANTLRUnicodePreprocessorFileStream*/ ANTLRFileStream(args[0], "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        SparqlParser parser = new SparqlParser(tokens);
        SparqlParser.query_return r = parser.query();

        System.out.println("Sparql parser tree=" + ((Tree) r.getTree()).toStringTree());
        System.out.println("-------------------------------");

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());

        nodes.setTokenStream(tokens);

        System.out.println("List of CommonTreeNodes");

        CommonTree n = null;
        while ((n = ((CommonTree) nodes.nextElement())) != null) {
            System.out.print(" "+n.toString());
            if ((n.toString()).compareTo("EOF") == 0) {
                break;
            }
        }
        System.out.println("\n-------------------------------");

        nodes.reset();

        System.out.println("CommonTreeNodes tree=" + ((Tree) nodes.getTreeSource()).toStringTree());
        System.out.println("-------------------------------");

        SparqlT walker = new SparqlT(nodes);

        SparqlT.query_return t = null;
        try {
            t = walker.query();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

        System.out.println("SparqlT tree=" + ((Tree) t.getTree()).toStringTree());
        System.out.println("-------------------------------");
    }
}
