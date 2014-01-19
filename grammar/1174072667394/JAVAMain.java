import java.io.*;
import antlr.DumpASTVisitor;
/*****************************************************************************
 * SoftwareMetrics driver for PL/SQL
 * -   Populates the rule table
 * -   Invokes the analyser on the argument source files
 */

class JAVAMain {
public static void main(String[] args)
{
int i;
InputStream in = System.in;

    SoftwareMetrics.start("Whole", "Run", 0); // Make sure singleton exists
    SoftwareMetrics.addRule("^=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("^", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("~", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("<<=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("<<", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("<=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("<", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("==", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(">=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(">>=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(">>>=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(">>>", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(">>", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(">", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("|=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("||", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("|", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("-=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("--", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("-", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(",", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(";", 0.0, 0, 0, true);
    SoftwareMetrics.addRule(":", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("!=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("!", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("?", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("/=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("/", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(".", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("(", 0.0, 1, 0, true);
    SoftwareMetrics.addRule(")", 0.0, 0, 0, true);
    SoftwareMetrics.addRule("[", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("]", 0.0, 0, 0, true);
    SoftwareMetrics.addRule("{", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("}", 0.0, 0, 0, true);
    SoftwareMetrics.addRule("*=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("*", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("**", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("&=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("&", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("&&", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("%=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("%", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("+=", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("+", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("++", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("abstract", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("boolean", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("break", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("byte", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("case", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("catch", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("char", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("class", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("const", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("continue", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("default", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("do", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("double", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("else", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("extends", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("true", 0.0, 1, 0, false);
    SoftwareMetrics.addRule("final", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("finally", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("float", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("for", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("if", 1.0, 1, 0, true);
    SoftwareMetrics.addRule("implements", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("import", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("instanceof", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("int", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("interface", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("long", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("native", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("new", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("null", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("package", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("private", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("protected", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("public", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("return", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("short", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("static", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("strictfp", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("string", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("super", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("switch", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("synchronized", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("this", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("threadsafe", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("throw", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("throws", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("transient", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("true", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("try", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("void", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("volatile", 0.0, 1, 0, true);
    SoftwareMetrics.addRule("while", 1.0, 1, 0, true);

    for (i = 0; i < args.length; i++) 
    {
        try
        {
            System.out.println("Processing File: " + args[i]);
            SoftwareMetrics.start(args[i], "Source", 0);
            in = new FileInputStream(args[i]);
            JavaLexer lexer = new JavaLexer(new DataInputStream(in));
            JavaRecognizer parser = new JavaRecognizer(lexer);
            parser.compilationUnit();
//            System.out.println("==> Dump of AST <==");
//            DumpASTVisitor visitor = new DumpASTVisitor();
//            visitor.visit(parser.getAST());
        }
        catch(Exception e)
        {
            System.err.println("Exception: "+e);
            e.printStackTrace();
            System.err.println("Problem Parsing File: " + args[i]);

        }
        finally
        {
            SoftwareMetrics.finishAll();
        }
    }
}
}
