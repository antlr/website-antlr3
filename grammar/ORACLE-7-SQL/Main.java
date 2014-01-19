import java.io.*;
import antlr.DumpASTVisitor;

class Main {
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            if (args.length > 0) {
                in = new FileInputStream(args[0]);
            }
            SqlLexer lexer = new SqlLexer(new DataInputStream(in));
            SqlParser parser = new SqlParser(lexer);
            parser.start_rule();
            if (true) {
                if (true) {
                    System.out.println("");
                    System.out.println("==> Dump of AST <==");
                    DumpASTVisitor visitor = new DumpASTVisitor();
                    visitor.visit(parser.getAST());
                }
            }
        } catch(Exception e) {
            System.err.println("exception: "+e);
        }
    }
}
