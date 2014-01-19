header {
package templates;

import com.jguru.util.st.*;
}

/** Java 1.3 AST Recognizer Grammar
 *
 * Author: (see java.g preamble)
 *
 * This grammar is in the PUBLIC DOMAIN
 *
 * DIFFS FROM STANDARD ANTLR-JAVA GRAMMAR:
 
oooo in primaryExpression I fixed array_declarator:

			|	#(ARRAY_DECLARATOR typeSpecArray) "class" {out("class");}
			|	builtInType "class" {out("class");}

removed optionals on class for those, had to add class to first one.

oooo Changed newArrayDeclarator(s); fixed comment on newExpression
newExpression
	:	#(	"new" {out("new ");} type
			(	{out("(");} elist {out(")");} (objBlock)?
            |   (newArrayDeclarator)+ (arrayInitializer)?
			)
		)
	;
newArrayDeclarator
	:	#( ARRAY_DECLARATOR (expression)? )
	;

oooo moved ctorCall to stat; didn't belong in expr.

oooo rm comments in java.g postfixExpression
 */

class JavaOutputTreeParser extends TreeParser;

options {
	importVocab = Java;
}

{
    /** A big buffer to store output.  A single
     *  output buffer works because the order of
     *  rule calls mirrors the order in which we want
     *  to generate output for Java->Java.
     */
    protected StringBuffer output = null;

    /** Tab indent level 0..n */
    protected int tabs = 0;

    /** Track when do a newline; implies indent should happen next. */
    protected boolean lastOutputWasNewline = true;

    protected static final int MAX_TOKEN_TYPE=300; // imprecise but big enough

    /** Encodes precedence of various operators; indexed by token type.
     *  If precedence[op1] > precedence[op2] then op1 should happen
     *  before op2;
     */
    public static int precedence[] = new int[MAX_TOKEN_TYPE];

    static {
        for (int i=0; i<precedence.length; i++) {
            // anything but these operators binds super tight
            // for example METHOD_CALL binds tighter than PLUS
            precedence[i] = Integer.MAX_VALUE;
        }
        precedence[ASSIGN] = 1;
        precedence[PLUS_ASSIGN] = 1;
        precedence[MINUS_ASSIGN] = 1;
        precedence[STAR_ASSIGN] = 1;
        precedence[DIV_ASSIGN] = 1;
        precedence[MOD_ASSIGN] = 1;
        precedence[SR_ASSIGN] = 1;
        precedence[BSR_ASSIGN] = 1;
        precedence[SL_ASSIGN] = 1;
        precedence[BAND_ASSIGN] =1;
        precedence[BXOR_ASSIGN] = 1;
        precedence[BOR_ASSIGN] = 1;

        precedence[QUESTION] = 2;

        precedence[LOR] = 3;

        precedence[LAND] = 4;

        precedence[BOR] = 5;

        precedence[BXOR] = 6;

        precedence[BAND] = 7;

        precedence[NOT_EQUAL] = 8;
        precedence[EQUAL] = 8;

        precedence[LT] = 9;
        precedence[GT] = 9;
        precedence[LE] = 9;
        precedence[GE] = 9;
        precedence[INSTANCEOF] = 9; // I *think* it's here

        precedence[SL] = 10;
        precedence[SR] = 10;
        precedence[BSR] = 10;

        precedence[PLUS] = 11;
        precedence[MINUS] = 11;

        precedence[DIV] = 12;
        precedence[MOD] = 12;
        precedence[STAR] = 12;

        precedence[INC] = 13;
        precedence[DEC] = 13;
        precedence[POST_INC] = 13;
        precedence[POST_DEC] = 13;
        precedence[BNOT] = 13;
        precedence[LNOT] = 13;
        precedence[UNARY_MINUS] = 13;
        precedence[UNARY_PLUS] = 13;
    }

    public static boolean hasHigherPrecedence(int op1, int op2) {
        return precedence[op1]>precedence[op2];
    }

    protected void out(String text) {
        if ( lastOutputWasNewline ) {
            tab();
        }
        lastOutputWasNewline = false;
        output.append(text);
    }

    /** Indent to correct tab position */
    protected void tab() {
        for (int i=1; i<=tabs; i++) {
            output.append('\t');
        }
    }

    /** Indent one level */
    protected void indent() {
        tabs++;
    }

    /** Indent out one level */
    protected void undent() {
        tabs--;
    }

    protected void nl() {
        output.append('\n');
        lastOutputWasNewline = true;
    }

    public JavaOutputTreeParser(StringBuffer output) {
        this();
        this.output = output;
    }
}

compilationUnit
	:	(packageDefinition)?
		(importDefinition)*
		(typeDefinition)*
	;

packageDefinition
	:	#( PACKAGE_DEF {out("package ");} identifier )
        {out(";"); nl();}
	;

importDefinition
	:	#( IMPORT {out("import ");} identifierStar )
        {out(";"); nl();}
	;

typeDefinition
	:	#(CLASS_DEF modifiers {out("class ");}
          cid:IDENT {out(cid.getText()+" ");}
          extendsClause implementsClause
          {out(" {"); nl(); indent();}
          objBlock
          {undent(); out("}"); nl();}
         )
	|	#(INTERFACE_DEF modifiers {out("interface ");}
          iid:IDENT {out(iid.getText()+" ");}
          extendsClause
          {out(" {"); nl(); indent();}
          interfaceBlock
          {undent(); out("}"); nl();}
         )
	;

typeSpec
	:	#(TYPE typeSpecArray)
	;

typeSpecArray
	:	#( ARRAY_DECLARATOR typeSpecArray {out("[]");} )
	|	type
	;

type:	identifier {out(" ");}
	|	builtInType
	;

builtInType
{out(#builtInType.getText()+" ");}
    :   "void"
    |   "boolean"
    |   "byte"
    |   "char"
    |   "short"
    |   "int"
    |   "float"
    |   "long"
    |   "double"
    ;

modifiers
	:	#( MODIFIERS (modifier)* )
	;

modifier
{out(#modifier.getText()+" ");}
    :   "private"
    |   "public"
    |   "protected"
    |   "static"
    |   "transient"
    |   "final"
    |   "abstract"
    |   "native"
    |   "threadsafe"
    |   "synchronized"
    |   "const"
    |   "volatile"
	|	"strictfp"
    ;

extendsClause
	:	#(  EXTENDS_CLAUSE
            {if (#extendsClause.getFirstChild()!=null) out("extends ");}
            ( id:identifier {if (id.getNextSibling()!=null) out(", ");} )*
         )
	;

implementsClause
	:	#(  IMPLEMENTS_CLAUSE
            {if (#implementsClause.getFirstChild()!=null) out(" implements ");}
            (id:identifier {if (id.getNextSibling()!=null) out(", ");} )*
         )
	;

interfaceBlock
	:	#(	OBJBLOCK
			(	methodDecl
			|	variableDef
			)*
		)
	;

objBlock
	:	#(	OBJBLOCK
			(	ctorDef
			|	methodDef
			|	variableDef
			|	typeDefinition
			|	#(STATIC_INIT {out("static ");} slist)
			|	#(INSTANCE_INIT slist)
			)*
		)
	;

ctorDef
	:	#(CTOR_DEF modifiers methodHead (slist)?)
	;

methodDecl
	:	#(METHOD_DEF modifiers typeSpec methodHead)
	;

methodDef
	:	#(METHOD_DEF modifiers typeSpec methodHead (slist)?)
	;

variableDef
	:	#(VARIABLE_DEF modifiers typeSpec variableDeclarator varInitializer)
        {out(";"); nl();}
	;

parameterDef
	:	#(PARAMETER_DEF modifiers typeSpec id:IDENT {out(" "+#id.getText());} )
	;

objectinitializer
	:	#(INSTANCE_INIT slist)
	;

variableDeclarator
	:	id:IDENT {out(" "+id.getText());}
	|	LBRACK variableDeclarator {out("[]");}
	;

varInitializer
	:	#(ASSIGN {out(" = ");} initializer)
	|
	;

initializer
	:	expression
	|	arrayInitializer
	;

arrayInitializer
	:	#(  ARRAY_INIT
            {out("{"); nl(); indent();}
            (   init:initializer
                {if (init.getNextSibling()!=null) out(", ");}
            )*
            {undent(); nl(); out("}");}
         )
	;

methodHead
	:	id:IDENT {out(" "+id.getText()+"(");}
        #( PARAMETERS
            (   p:parameterDef
                {if (#p.getNextSibling()!=null) out(",");}
            )*
        )
        {out(") ");}
        (throwsClause)?
	;

throwsClause
	:	#( "throws" {out("throws ");}
            (   id:identifier
                {if (id.getNextSibling()!=null) out(", ");}
            )*
        )
	;

identifier
    :   id:IDENT {out(id.getText());}
    |   #( DOT identifier id2:IDENT ) {out("."+id2.getText());}
    ;

identifierStar
    :   id:IDENT {out(id.getText());}
    |   #( DOT identifier
           ( id2:IDENT {out("."+id2.getText());}
           | STAR      {out(".*");}
           )
         )
    ;

slist
	:	#( SLIST
           {out("{"); nl(); indent();}
           (stat)*
           {undent(); out("}"); nl();}
         )
	;

stat:	typeDefinition
	|	variableDef
	|	expression {out(";"); nl();}
	|	#(LABELED_STAT id:IDENT {out(id.getText()+":"); nl();} stat)
	|	#("if" {out("if (");} expression {out(") ");} stat
           ( {out("else ");} stat)? )
	|	#(	"for" {out("for (");}
			#(FOR_INIT (variableDef | elist | {out(";");}))
			#(FOR_CONDITION (expression)?)
            {out(";");}
			#(FOR_ITERATOR (elist)?)
            {out(") ");}
			stat
		)
	|	#("while" {out("while (");} expression {out(") ");} stat)
	|	#("do" {out("do ");} stat {out(" while (");} expression {out(");"); nl();} )
	|	#("break" {out("break ");}
            (bid:IDENT {out(#bid.getText());} )?
        )
        {out(";"); nl();}
	|	#("continue" {out("continue ");}
            (cid:IDENT {out(#cid.getText());} )?
        )
        {out(";"); nl();}
	|	#("return" {out("return ");} (expression)? ) {out(";"); nl();}
	|	#("switch" {out("switch (");} expression {out(") {"); nl(); indent();}
            (caseGroup)*
            {undent(); out("}"); nl();}
        )
	|	#("throw" {out("throw ");} expression) {out(";"); nl();}
	|	#("synchronized" {out("synchronized (");} expression {out(") ");} stat)
	|	tryBlock
	|	slist // nested SLIST

    // uncomment to make assert JDK 1.4 stuff work
    // |   #("assert" expression (expression)?)

	|	ctorCall {out(";"); nl();}

	|	EMPTY_STAT {out(";");}
	;

caseGroup
	:	#(  CASE_GROUP
            (   #("case" {out("case ");} expression {out(" :"); nl();})
            |   "default" {out("default :"); nl();}
            )+
            slist
         )
	;

tryBlock
	:	#( "try" {out("try ");}
            slist (handler)*
            ( #("finally" {out("finally ");} slist) )?
         )
	;

handler
	:	#( "catch" {out("catch (");} parameterDef {out(") ");} slist )
	;

elist
	:	#( ELIST (e:expression {if (#e.getNextSibling()!=null) out(",");} )* )
	;

expression
	:	#(EXPR expr)
	;

expr:   #(QUESTION expr {out("?");} expr {out(":");} expr)	// trinary operator
        // binary operators...
    |   (ASSIGN|PLUS_ASSIGN|MINUS_ASSIGN|STAR_ASSIGN|DIV_ASSIGN
        |MOD_ASSIGN|SR_ASSIGN|BSR_ASSIGN|SL_ASSIGN|BAND_ASSIGN
        |BXOR_ASSIGN|BOR_ASSIGN|LOR|LAND|BOR|BXOR|BAND|NOT_EQUAL
        |EQUAL|LT|GT|LE|GE|SL|SR|BSR|PLUS|MINUS|DIV|MOD|STAR|INSTANCEOF
        )
        {
        AST op = #expr;
        AST left = op.getFirstChild();
        AST right = left.getNextSibling();
        boolean lp = false;
        boolean rp = false;
        if ( hasHigherPrecedence(op.getType(),left.getType()) ) {
            lp = true;
        }
        if ( hasHigherPrecedence(op.getType(),right.getType()) ) {
            rp = true;
        }
        if ( lp ) out("(");
        expr(left);
        if ( lp ) out(")");
        if ( op.getType()==INSTANCEOF ) {
            out(" "+#op.getText()+" ");
        }
        else {
            out(#op.getText());
        }
        if ( rp ) out("(");
        expr(right); // manually invoke
        if ( rp ) out(")");
        }

    |   (INC|DEC|BNOT|LNOT|UNARY_MINUS|UNARY_PLUS)
        {
        AST op = #expr;
        AST opnd = op.getFirstChild();
        boolean p = false;
        if ( hasHigherPrecedence(op.getType(),opnd.getType()) ) {
            p = true;
        }
        out(op.getText());
        if ( p ) out("(");
        expr(opnd);
        if ( p ) out(")");
        }

    |   #( POST_INC expr {out("++");} )
    |   #( POST_DEC expr {out("--");} )
    |	primaryExpression
	;

primaryExpression
    :   id:IDENT {out(id.getText());}
    |   #(	DOT
			(	expr {out(".");}
				(	id2:IDENT {out(id2.getText());}
				|	arrayIndex
				|	"this" {out("this");}
				|	"class" {out("class");}
				|	#( "new" id3:IDENT {out("new "+id3.getText());} elist )
				|   "super" {out("super");}
				)
			|	#(ARRAY_DECLARATOR typeSpecArray) "class" {out("class");}
			|	builtInType "class" {out("class");}
			)
		)
	|	arrayIndex
	|	#(METHOD_CALL primaryExpression {out("(");} elist {out(")");} )
	|	#(TYPECAST {out("((");} typeSpec {out(")");} expr {out(")");} )
	|   newExpression
	|   constant
    |   ("super"|"true"|"false"|"this"|"null")
        {out(#primaryExpression.getText());} 
	|	typeSpec // type name used with instanceof
	;

ctorCall
	:	#( CTOR_CALL {out("this(");} elist {out(")");} )
	|	#( SUPER_CTOR_CALL {out("super(");} 
			(	elist
			|	primaryExpression {out(".");} elist
			)
            {out(")");}
		 )
	;

arrayIndex
	:	#(INDEX_OP expr {out("[");} expression {out("]");} )
	;

constant
{out(#constant.getText());}
    :   NUM_INT
    |   CHAR_LITERAL
    |   STRING_LITERAL
    |   NUM_FLOAT
    |   NUM_DOUBLE
    |   NUM_LONG
    ;

newExpression
	:	#(	"new" {out("new ");} type
			(	{out("(");} elist {out(")");}
                (
                    {out(" {"); nl(); indent();}
                    objBlock
                    {undent(); out("}"); nl();}
                )?
            |   (newArrayDeclarator)+ (arrayInitializer)?
			)
		)
	;

newArrayDeclarator
	:	#( ARRAY_DECLARATOR {out("[");} (expression)? {out("]");} )
	;
