import OCLParser;
import OCLLexer;
import java.io.*;
import antlr.collections.AST;
import antlr.collections.impl.*;
import antlr.debug.misc.*;
import antlr.*;
import java.awt.event.*;

class Main {

    public static void main(String[] args) {
		try{
			OCLLexer lexer = new OCLLexer(new BufferedInputStream(new
				FileInputStream(args[0])));
			OCLParser parser = new OCLParser(lexer);
                        
			try {
				parser.constraint();
			} catch (ANTLRException ex) {
				System.err.println(ex.getMessage());
			}
                        
			if      (       lexer.errorNumber() != 0
							||      lexer.warningNumber() != 0
							||      parser.errorNumber() != 0 
							||      parser.warningNumber() != 0){
				String [] lwarnings = lexer.warnings();
				String [] lerrors = lexer.errors();
				String [] pwarnings = parser.warnings();
				String [] perrors = parser.errors();
				StringBuffer ret = new StringBuffer();
				for (int i = 0; i < lwarnings.length; ++i){
					ret.append("Warning: ");
					ret.append(lwarnings[i]);
					ret.append('\n');
				}
				for (int i = 0; i < pwarnings.length; ++i){
					ret.append("Warning: ");
					ret.append(pwarnings[i]);
					ret.append('\n');
				}
				for (int i = 0; i < lerrors.length; ++i){
					ret.append("Error :");
					ret.append(lerrors[i]);
					ret.append('\n');
				}
				for (int i = 0; i < perrors.length; ++i){
					ret.append("Error :");
					ret.append(perrors[i]);
					ret.append('\n');
				}
				ret.append("Parsing: " + (lwarnings.length + pwarnings.length) + "
warnings and "
						   + (lerrors.length + perrors.length) + " errors.");
				System.err.println(ret.toString());
			}
                        
			CommonAST ast = (CommonAST)parser.getAST();
                        
			if (ast == null)
				System.err.println("Cannot create AST");
			else
				System.out.println(ast.toStringList());
		} catch (FileNotFoundException ex) {
			System.err.println(ex.toString());
		}       
	}       
}
