/* C# Grammar for Antlr 
 * By Todd King
 * for more info see the ECMA-334 C# Grammar posted by Microsoft at 
 * http://msdn.microsoft.com/library/default.asp?url=/library/en-us/csspec/html/CSharpSpecStart.asp
 * Lexer section taken from Robin Debreuil's C# Grammar.
 */
 
header 
{
	using RecognitionException	=	antlr.RecognitionException;
	using CommonAST							= antlr.CommonAST;
	using System.Collections;
}
options 
{	
	language = "CSharp";
	namespace = "CodeCritic.Parser";
}


/**********************************************************************************************************************************
 ******************************* PARSER *******************************************************************************************
 **********************************************************************************************************************************/
class CSParser extends Parser;

options 
{
	k = 2;                           	// two token lookahead
	defaultErrorHandler = true;     	
	buildAST = true;   
 	exportVocab=CSharp;
 	ASTLabelType = "CommonAST";
 	codeGenMakeSwitchThreshold = 3;  // Some optimizations
	codeGenBitsetTestThreshold = 4;
}
tokens
{
	//Misc
	QualIdent;
	Type;
	ProjectUnit;
	SolutionUnit;
	
	//Literals
	BooleanLiteral;
	IntegerLiteral;
	HexLiteral;
	RealLiteral;
	CharLiteral;
	StringLiteral;
	VerbatimStringLiteral;
	NullLiteral;
	
	//Expression
	Expression;
	AssignExpr;
	TernaryExpr;
	BinaryExpr;
	UnaryExpr;
	CastExpr;
	ObjCreateExpr;
	ArrayCreateExpr;
	Expressions;
	ParenExpr;
	MemberAccessExpr;
	ElementAccessExpr;
	InvokeExpr;
	TypeOfExpr;
	CheckedExpr;
	UncheckedExpr;
	SizeOfExpr;
	PointerMemberAccessExpr;
	
	ArrayRank;
	Args;
	Arg;
	
	//Statements
	Statements;
	LabeledStmt;
	VariableDeclStmt		<AST=CodeCritic.Nodes.VarDeclNode>;
	ConstantDeclStmt		<AST=CodeCritic.Nodes.VarDeclNode>;
	ExprStmt;
	IfStmt;
	SwitchStmt;
	SwitchSections			<AST=CodeCritic.Nodes.ScopeNode>;
	SwitchSection;
	IterationStmt;
	ForInit;
	LoopCondition;
	ForIncrement;
	IterVar							<AST=CodeCritic.Nodes.VarDeclNode>;
	GotoStmt;
	ThrowStmt;
	ReturnStmt;
	CheckedStmt;
	UncheckedStmt;
	LockStmt;
	UsingStmt						<AST=CodeCritic.Nodes.ScopeNode>;
	TryStmt;
	TryClauses;
	CatchClause				<AST=CodeCritic.Nodes.ScopeNode>;
	FinallyClause;
	
	//Namespace
	CompileUnit				<AST=CodeCritic.Nodes.CompileUnitNode>;
	NamespaceNode			<AST=CodeCritic.Nodes.NamespaceNode>;
	UsingNode;
	Types;
	TypeModifiers;
	
	//Class
	ClassNode					<AST=CodeCritic.Nodes.InheritanceTypeNode>;
	BaseTypes;
	Members;
	Modifiers;
	ConstantNode			<AST=CodeCritic.Nodes.MemberNode>;
	FieldNode					<AST=CodeCritic.Nodes.MemberNode>;
	MethodNode				<AST=CodeCritic.Nodes.MethodNode>;
	DeclArgs;
	DeclArg						<AST=CodeCritic.Nodes.VarDeclNode>;
	DeclArgParams			<AST=CodeCritic.Nodes.VarDeclNode>;
	PropertyNode			<AST=CodeCritic.Nodes.MemberNode>;
	AccessorNode			<AST=CodeCritic.Nodes.ScopeNode>;
	EventNode					<AST=CodeCritic.Nodes.MemberNode>;
	IndexerNode				<AST=CodeCritic.Nodes.IndexerNode>;
	IndexerBase;
	UnaryOperatorNode	<AST=CodeCritic.Nodes.MethodNode>;
	BinaryOperatorNode	<AST=CodeCritic.Nodes.MethodNode>;
	ConversionOperatorNode	<AST=CodeCritic.Nodes.MethodNode>;	
	ConstructorNode		<AST=CodeCritic.Nodes.ConstructorNode>;
	ConstructorInit;
	DestructorNode		<AST=CodeCritic.Nodes.ScopeNode>;
	
	//Struct
	StructNode			<AST=CodeCritic.Nodes.InheritanceTypeNode>;
	
	//Interface
	InterfaceNode		<AST=CodeCritic.Nodes.InheritanceTypeNode>;
	IEventNode			<AST=CodeCritic.Nodes.MemberNode>;
	IIndexerNode		<AST=CodeCritic.Nodes.IndexerNode>;
	IMethodNode			<AST=CodeCritic.Nodes.MethodNode>;
	IPropertyNode		<AST=CodeCritic.Nodes.MemberNode>;
	IAccessorNode;
	
	//Enum
	EnumNode				<AST=CodeCritic.Nodes.TypeNode>;
	EnumMemberNode	<AST=CodeCritic.Nodes.MemberNode>;
	
	//Delegates
	DelegateNode		<AST=CodeCritic.Nodes.DelegateNode>;

	//Attributes
	GlobalAttributeSection;
	AttributeSection;
	AttributeTarget;
	Attribute;
	
}
{
		private bool errorOccured = false;
		public bool ErrorOccured
		{
			get{return errorOccured;}
		}
		//This is mostly for debugging so I can place one handy breakpoint here
		public override void reportError(RecognitionException ex)
		{
			Console.Error.WriteLine(ex + "\t[CSParser.reportError]");
			errorOccured = true;
		}
		
		protected string SetTypeName(CommonAST typenode)
		{
			if(typenode != null)
			{
				string val = typenode.getText();
				CommonAST child = (CommonAST)typenode.getFirstChild();
				while(child != null)
				{
					if(child.Type == CSharpTokenTypes.ArrayRank)
					{
						val += "["+child.getText()+"]";
					}
					else if(child.Type == CSharpTokenTypes.STAR)
					{
						val += "*";
					}
					child = (CommonAST)child.getNextSibling();
				}
				typenode.setText(val);
				return val;
			}
			return "";
		}
}

identifier
	:	IDENTIFIER		
	|	mo:MODULE				{#mo.setType(IDENTIFIER);}
	|	ass:ASSEMBLY		{#ass.setType(IDENTIFIER);}
	;	

//C.1.8 Literals
literal
	:	bl:boolean_literal							{#bl.setType(BooleanLiteral);} 
	|	il:INTEGER_LITERAL							{#il.setType(IntegerLiteral);}
	|	hex:HEXADECIMAL_INTEGER_LITERAL	{#hex.setType(HexLiteral);}
	|	rl:REAL_LITERAL									{#rl.setType(RealLiteral);}
	|	cl:CHARACTER_LITERAL						{#cl.setType(CharLiteral);}
	|	rs:REGULAR_STRING_LITERAL				{#rs.setType(StringLiteral);}
	|	vs:VERBATIM_STRING_LITERAL			{#vs.setType(VerbatimStringLiteral);}
	|	nl:NULL													{#nl.setType(NullLiteral);}
	;

boolean_literal
	:	TRUE
	|	FALSE
	;

//***********************************************************************************************************************************/
// ***** C.2.1 Basic concepts *****
//***********************************************************************************************************************************/
type_name
{string name = "";}
	:	id1:identifier {name += #id1.getText();}
		(DOT! id2:identifier {name += "." + #id2.getText();} )*	
		{#type_name	=	#(#[QualIdent, name], #type_name);}
	;

//***********************************************************************************************************************************/
//C.2.2 Types
//***********************************************************************************************************************************/
type
	:	tp:non_array_type ( options{greedy=true;}:rank_specifiers )? (STAR)?
   		{#type	=	#(#[Type, tp_AST.getText()], #type); SetTypeName(#type);}
	;

rank_specifiers
	:	(options{greedy=true;}:rank_specifier)+
	;	

rank_specifier
{int cnt=1;}  
	 : lb:LBRACK^ ( COMMA! {cnt++;} )* RBRACK!
	 		{#lb.setType(ArrayRank); #lb.setText(cnt.ToString());}
   ;
	
non_array_type
   :	predefined_type
   |	type_name
   ;

predefined_type
   :	simple_type
   |	OBJECT
   |	STRING
   |	VOID
   ;

simple_type 
	:	numeric_type
	|	BOOL 
	;

numeric_type 
	:	integral_type
	|	floating_point_type
	|	DECIMAL
	;
	
integral_type 
	:	SBYTE
	|	BYTE
	|	SHORT
	|	USHORT
	|	INT
	|	UINT
	|	LONG
	|	ULONG
	|	CHAR
	;

class_type
	:	type_name
	|	OBJECT
	|	STRING
	;

floating_point_type 
	:	FLOAT
	|	DOUBLE
	;

//***********************************************************************************************************************************/	
//C.2.4 Expressions
//***********************************************************************************************************************************/
expression
   :	ce:conditional_expression	(! op:assignment_operator ex:expression
   					{#expression = #([AssignExpr, op_AST.getText()],
   													([Expression, "left"], ce),	
														op,	
														([Expression, "right"], ex));}
   															)?
   ;

assignment!
   : ce:conditional_expression op:assignment_operator ex:expression
   		{#assignment = #([AssignExpr, op_AST.getText()],
   													([Expression, "left"], ce),	
														op,	
														([Expression, "right"], ex));}
   ;
	
assignment_operator 
	:	ASSIGN
	|	PLUS_ASN
	|	MINUS_ASN
	|	STAR_ASN
	|	DIV_ASN
	|	MOD_ASN
	|	BAND_ASN
	|	BOR_ASN
	|	BXOR_ASN
	|	SL_ASN
	|	SR_ASN
	|	BSR_ASN
	;

conditional_expression
   : cexpr:conditional_or_expression 
   		(!	op:QMARK ex1:expression col:COLON ex2:conditional_expression
  			{#conditional_expression = #(#[TernaryExpr, op_AST.getText()],
	   																			(#[Expression, "condition"],	cexpr), 
																					op,
																					(#[Expression, "true"],	ex1), 
																					col,
																					(#[Expression, "false"],	ex2));}
   		)?
   ;

conditional_or_expression
   : ex1:conditional_and_expression 
   		(! op:LOR ex2:conditional_or_expression 
   			{#conditional_or_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;
	
conditional_and_expression
   : ex1:inclusive_or_expression 
   		(! op:LAND ex2:conditional_and_expression
   			{#conditional_and_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;

inclusive_or_expression
   : ex1:exclusive_or_expression 
   		(! op:BOR ex2:inclusive_or_expression 
   			{#inclusive_or_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;

exclusive_or_expression
   : ex1:and_expression 
   		(! op:CARET ex2:exclusive_or_expression 
   			{#exclusive_or_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;

and_expression
   : ex1:equality_expression 
   		(! op:AMPER ex2:and_expression 
   			{#and_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;

equality_expression
   : ex1:relational_expression 
   		(! op:equality_operator ex2:equality_expression 
   			{#equality_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;
equality_operator
	:	EQUAL | NOT_EQUAL
	;

relational_expression
   : ex1:shift_expression 
   		(! ( op1:relational_operator! ex2:relational_expression!) 
   				{#relational_expression = #(#[BinaryExpr, op1_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op1, 
			 																			(#[Expression, "right"], ex2));}
   		|! (	op2:relational_operator2! tp:type!) 
   				{#relational_expression = #([BinaryExpr, op2_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op2, 
			 																			(#[Expression, "right"], tp));}
   		)?
   ;
relational_operator
	:	LTHAN | GTHAN | LE | GE
	;
relational_operator2
	:	IS | AS
	;

shift_expression
   : ex1:additive_expression 
   		(! op:shift_operator ex2:shift_expression 
   			{#shift_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;
shift_operator
	:	SL | SR 
	;

additive_expression
   : ex1:multiplicative_expression 
   		(! op:additive_operator ex2:additive_expression 
   			{#additive_expression = #(#[BinaryExpr, op_AST.getText()],
			 																			(#[Expression, "left"], ex1),
			 																			op, 
			 																			(#[Expression, "right"], ex2));}
   		)?
   ;
additive_operator
	:	PLUS | MINUS
	;

multiplicative_expression
   : ex1:unary_expression 
   		(! op:multiplicative_operator	ex2:multiplicative_expression 
   			{#multiplicative_expression = #([BinaryExpr, op_AST.getText()],
			 																			([Expression, "left"], ex1),
			 																			op, 
			 																			([Expression, "right"], ex2));}
   		)?
   ;
multiplicative_operator
	:	STAR | DIV | MOD
	;

unary_expression 
	:	op:unary_operator	unary_expression	{#unary_expression = #(#[UnaryExpr, op_AST.getText()], #unary_expression);}
	//|	addressof_expression
	|	(cast_expression)=> cast_expression	
	|	primary_expression
	;
	
unary_operator	//While STAR is listed as a unary operator in the grammar, it appears to be undocumented in the unary expression MS C# deffinition section?!?!
	: PLUS | MINUS | BANG | TILDE | STAR| INC | DEC
  ;
	
cast_expression
	:	lp:LPAREN^   tp:type   RPAREN! unary_expression
		{#lp.setType(CastExpr); #lp.setText(tp_AST.getText());}
	;

primary_expression
	:	primary_expression_start	( primary_expression_postfix )?
	|	creation_expression
	;
	
primary_expression_start
	:	literal
	|	identifier									
	|	parenthesized_expression		//LPAREN   expression   RPAREN
	|	predefined_type member_access
	|	this_access									//THIS
	|	base_access									//BASE ((DOT identifier) | (LBRACK   expression_list   RBRACK))
	|	typeof_expression						//TYPEOF   LPAREN	(type | VOID)	RPAREN
	|	sizeof_expression						//SIZEOF   LPAREN   unmanaged_type   RPAREN	
	|	checked_expression					//CHECKED   LPAREN   expression   RPAREN
	|	unchecked_expression				//UNCHECKED   LPAREN   expression   RPAREN
	;
	
primary_expression_postfix
	:	(	member_access 							//DOT identifier
		| invocation_expression 			//LPAREN   (argument_list)?   RPAREN
		|	element_access							//LBRACK   expression_list   RBRACK
		| post_increment_expression 	//INC
		| post_decrement_expression		//DEC
		|	pointer_member_access
		)+
	;

array_creation_postfix_expression
	:	(	member_access 							//DOT identifier
		| invocation_expression 			//LPAREN   (argument_list)?   RPAREN
		| post_increment_expression 	//INC
		| post_decrement_expression		//DEC
		|	pointer_member_access
		)+
	;

creation_expression!
	:	nw:NEW tp:non_array_type ( lp:LPAREN (args:argument_list)? RPAREN	( postex1:primary_expression_postfix )?
																{#lp.setType(ObjCreateExpr); #lp.setText(tp_AST.getText()); #creation_expression	=	#(#creation_expression, (lp, tp, args), postex1);}
															| lb1:LBRACK	exprs:expression_list	RBRACK	(	rank1:rank_specifiers )? ( arrayInt1:array_initializer )?	( postex2:array_creation_postfix_expression )?  
																{#lb1.setType(ArrayCreateExpr); #lb1.setText(tp_AST.getText()); #creation_expression	=	#(#creation_expression, (lb1, tp, ([Expressions, "size"], exprs), rank1, arrayInt1), postex2);}
															|	rank2:rank_specifiers	arrayInt2:array_initializer	( postex3:array_creation_postfix_expression )?  			
																{#nw.setType(ArrayCreateExpr); #nw.setText(tp_AST.getText()); #creation_expression	=	#(#creation_expression, (nw, tp, rank2, arrayInt2), postex3);}
															)
	;

parenthesized_expression
	:	lp:LPAREN^   expression   RPAREN! 	{#lp.setType(ParenExpr); #lp.setText("");}
	;

member_access //assumes a predefined type or a primaryexpression came before this rule
	:	dt:DOT^	id:identifier	{#dt.setType(MemberAccessExpr); #dt.setText(id_AST.getText());}//{#member_access = #(#[MemberAccessExpr,id_AST.getText()], id);}
	;

invocation_expression //assumes a predefined type or a primaryexpression came before this rule
	:	lp:LPAREN^	( argument_list )?	RPAREN! 	{#lp.setType(InvokeExpr); #lp.setText("");}
	;
	
argument_list 
	:	argument (COMMA! argument)*	{#argument_list = #(#[Args], #argument_list);}
	;

argument 
	:	(REF | OUT)?	expression	{#argument	=	#(#[Arg],	#argument);}
	;

element_access
	:   lb:LBRACK^   argument_list   RBRACK!	{#lb.setType(ElementAccessExpr); #lb.setText("");}
	;
	
expression_list
	:	expression (COMMA expression)*
	;

this_access 
	:	THIS
	;

base_access 
	:	BASE (member_access | element_access)
	;

post_increment_expression 
	:	INC
	;

post_decrement_expression 
	:	DEC
	;

typeof_expression 
	:	tof:TYPEOF^ LPAREN!	type	RPAREN!	{#tof.setType(TypeOfExpr); #tof.setText("");}
	;
	
checked_expression 
	:	ch:CHECKED^   LPAREN!   expression   RPAREN! 	{#ch.setType(CheckedExpr); #ch.setText("");}
	;

unchecked_expression 
	:	uch:UNCHECKED^   LPAREN!   expression   RPAREN! {#uch.setType(UncheckedExpr); #uch.setText("");}
	;

//***********************************************************************************************************************************/
//C.2.5 Statements
//***********************************************************************************************************************************/
statement
	:!	id:identifier	col:COLON	st:statement {#statement = #([LabeledStmt, id_AST.getText()],	id, st);}	//labeled_statement
	|	(type identifier)=> local_variable_declaration	SEMI!	
	|	local_constant_declaration	SEMI!
	|	embedded_statement					
	;

local_variable_declaration 
	:	tp:type!   local_variable_declarators[tp_AST]
	;
	
local_variable_declarators[CommonAST var_type] 
	:	local_variable_declarator[var_type] (COMMA! local_variable_declarators[(CommonAST)this.getASTFactory().dupTree(var_type)])?	
	;

local_variable_declarator[CommonAST var_type] 
	:	id:identifier	(local_variable_assignment)?
			{#local_variable_declarator = #([VariableDeclStmt, id_AST.getText()],	var_type,	#local_variable_declarator);}	
	;
	
local_variable_assignment
	:	ass:ASSIGN^	local_variable_initializer
		{#ass.setType(Expression); #ass.setText("value");}
	;

local_variable_initializer 
	:	array_initializer 
	|	expression
	;

local_constant_declaration 
	:	CONST!   tp:type!   local_constant_declarators[#tp]
	;
	
local_constant_declarators[CommonAST const_type] 
	:	local_constant_declarator[const_type] (COMMA! local_constant_declarators[(CommonAST)this.getASTFactory().dupTree(const_type)])?	
	;

local_constant_declarator![CommonAST const_type] 
	:	id:identifier	ass:ASSIGN	lvar:local_variable_initializer
			{ #ass.setType(Expression); #ass.setText("value"); 
			#local_constant_declarator = #([ConstantDeclStmt, id_AST.getText()],	const_type,	id, (ass, lvar));}	
	;

embedded_statement 
	:	block									//LBRACE   (statement_list)?   RBRACE 
	|	SEMI!									//empty_statement
	|	expression_statement	//statement_expression	COMMA
	|	selection_statement		//IF   LPAREN || SWITCH   LPAREN
	|	iteration_statement		//WHILE || DO || FOR || FOREACH
	|	jump_statement				//BREAK || CONTINUE || GOTO || RETURN || THROW
	|	try_statement					//TRY   block   catch_clauses   finally_clause
	|	checked_statement			//CHECKED   block
	|	unchecked_statement		//UNCHECKED   block
	|	lock_statement				//LOCK   LPAREN   expression   RPAREN   embedded_statement
	|	using_statement				//USING   LPAREN    resource_acquisition   RPAREN    embedded_statement
	|	unsafe_statement			//UNSAFE block
	|	fixed_statement
	;
	
block
	:	lb:LBRACE^<AST=CodeCritic.Nodes.ScopeNode>   (statement)*   RBRACE
		{#lb.setType(Statements); #lb.setText("");}
	;

statement_list
	:	(statement)+	{#statement_list	=	#(#[Statements], #statement_list);}
	;
	
expression_statement 
	:	expression	SEMI!	{#expression_statement	=	#(#[ExprStmt], #expression_statement);}
	; 
	
selection_statement 
	:	if_statement
	|	switch_statement 
	;
	
if_statement! 
	:	ift:IF	lp:LPAREN	test:expression	RPAREN	tru:embedded_statement   (options {warnWhenFollowAmbig = false;}:ELSE fals:embedded_statement)? 	
		{#ift.setType(IfStmt); #ift.setText("");  #lp.setType(Expression); #lp.setText("");
		#if_statement	=	#(ift, (lp, test), (#[Statements, "true"], tru), (#[Statements, "false"], fals));}
	;
	
switch_statement! 
	:	sw:SWITCH	lp:LPAREN	test:expression	RPAREN	swblk:switch_block 
		{#sw.setType(SwitchStmt); #sw.setText(""); #lp.setType(Expression); #lp.setText("switch value");
		#switch_statement	=	#(sw, (lp, test), swblk);}
	;

switch_block 
	:	LBRACE!   (switch_section)+   RBRACE!
		{#switch_block	=	#([SwitchSections], #switch_block);}
	;

switch_section 
	:	(switch_label)+   statement_list	{#switch_section	=	#([SwitchSection],	#switch_section);}
	;

switch_label 
	:	ca:CASE^	ex:expression	COLON!
	|	DEFAULT^	COLON! 
	;

iteration_statement 
	:	while_statement		//WHILE LPAREN
	|	do_statement			//DO embedded_statement
	|	for_statement			//FOR	LPAREN
	|	foreach_statement //FOREACH   LPAREN 
	;

while_statement! 
	:	wh:WHILE	lp:LPAREN	ex:expression	RPAREN	st:embedded_statement 
		{#wh.setType(IterationStmt); #wh.setText("while"); #lp.setType(LoopCondition); #lp.setText("");
		#while_statement	=	#(wh, (lp, ex), ([Statements], st));}
	;

do_statement! 
	:	d:DO	st:embedded_statement	WHILE	lp:LPAREN	ex:expression	RPAREN
		{#d.setType(IterationStmt); #d.setText("do"); #lp.setType(LoopCondition); #lp.setText("");
		#do_statement	=	#(d, ([Statements], st), (lp, ex));}
	;

for_statement!
	:	fr:FOR<AST=CodeCritic.Nodes.ScopeNode>	lp:LPAREN	(init:for_initializer)?	se1:SEMI	(test:expression)?	se2:SEMI	(incex:expression_list)?	rp:RPAREN	st:embedded_statement 
		{#fr.setType(IterationStmt); #fr.setText("for"); #lp.setType(ForInit); #lp.setText(""); 
		 #se1.setType(LoopCondition); #se1.setText(""); #se2.setType(ForIncrement); #se2.setText("");
		 #for_statement	=	#(fr, (lp, init), (se1, test), (se2, incex), ([Statements], st));}
	;
	
for_initializer 
	:	(type identifier)=> local_variable_declaration
	|	expression_list 
	;
	
foreach_statement! 
	:	frea:FOREACH<AST=CodeCritic.Nodes.ScopeNode>   lp:LPAREN<AST=CodeCritic.Nodes.VarDeclNode>   tp:type   id:identifier   i:IN   ex:expression	RPAREN   st:embedded_statement 
		{#frea.setType(IterationStmt); #frea.setText("foreach"); #lp.setType(IterVar); #lp.setText(id_AST.getText());
		 #i.setType(Expression); #i.setText("collection");
		#foreach_statement	=	#(frea, (lp, tp, id), (i, ex), ([Statements], st));}
	;
	
jump_statement 
	:	BREAK	SEMI!
	|	CONTINUE	SEMI!
	|	goto_statement
	|	return_statement
	|	throw_statement 
	;

goto_statement! 
	:	go:GOTO^	(	id:identifier   SEMI!		{#go.setType(GotoStmt); #go.setText(id_AST.getText()); #goto_statement	=	#(go,	id);}
							|	cs:CASE   ex:expression   SEMI!		{#go.setType(GotoStmt); #go.setText(""); #goto_statement	=	#(go,	cs,	ex);}
							|	df:DEFAULT   SEMI!		{#go.setType(GotoStmt); #go.setText(""); #goto_statement	=	#(go,	df);}
							)
	;

return_statement! 
	:	ret:RETURN   (ex:expression)?   SEMI!		{#ret.setType(ReturnStmt); #ret.setText(""); #return_statement	=	#(ret,	([Expression],	ex));}
	;

throw_statement! 
	:	thr:THROW   (ex:expression)?   SEMI		{#thr.setType(ThrowStmt); #thr.setText(""); #throw_statement	=	#(thr,	([Expression], ex));}
	;

try_statement! 
	:	ty:TRY	bl:block	clauses:try_statement_clauses
		{#ty.setType(TryStmt); #ty.setText(""); #try_statement	=	#(ty,	bl,	([TryClauses], clauses));}
	;
	
try_statement_clauses
	:	catch_clauses (finally_clause)? 
	|	finally_clause	
	;

catch_clauses 
	:	( catch_clause )+
	;

catch_clause 
	:	cat:CATCH^<AST=CodeCritic.Nodes.ScopeNode>
								(!	( LPAREN!	tp:type	( id:identifier )?	RPAREN!	blk:block )
									{#cat.setType(CatchClause); #cat.setText("specific"); 
									if(#id != null)
										#catch_clause = #(cat, ([DeclArg, id_AST.getText()], tp, id), blk);
									else
										#catch_clause = #(cat, tp, id, blk);}
								|	block	{#cat.setType(CatchClause); #cat.setText("generic");}
								)
	;
/*	
catch_clause 
	:	cat:CATCH^<AST=CodeCritic.Nodes.InnerScopeNode>
								(	( LPAREN!	class_type	( identifier )?	RPAREN!	block )
									{#cat.setType(CatchClause); #cat.setText("specific");}
								|	block	{#cat.setType(CatchClause); #cat.setText("generic");}
								)
	;
*/	
finally_clause 
	:	fin:FINALLY^   block	{#fin.setType(FinallyClause); #fin.setText("");}
	;
	
checked_statement 
	:	ch:CHECKED^   block 	{#ch.setType(CheckedStmt); #ch.setText("");}
	;

unchecked_statement 
	:	uch:UNCHECKED^   block 	{#uch.setType(UncheckedStmt); #uch.setText("");}
	;

lock_statement! 
	:	lk:LOCK   lp:LPAREN   ex:expression   RPAREN   st:embedded_statement 
		{#lk.setType(LockStmt); #lk.setText(""); #lp.setType(Expression); #lp.setText(""); #lock_statement	=	#(lk,	(lp, ex), ([Statements], st));}
	;

using_statement! 
	:	us:USING<AST=CodeCritic.Nodes.ScopeNode>
	   lp:LPAREN    ra:resource_acquisition   RPAREN    st:embedded_statement 	
		{#us.setType(UsingStmt); #us.setText(""); #lp.setType(Expression); #lp.setText("resource"); #using_statement	=	#(us,	(lp, ra),	([Statements],	st));}
	;

resource_acquisition 
	:	(type identifier (COMMA|SEMI|ASSIGN))=> local_variable_declaration
	|	expression 
	;

//***********************************************************************************************************************************/
//C.2.6 Namespaces
//***********************************************************************************************************************************/
compilation_unit 
	:	(using_directive)*   (attributes_either)?   (namespace_member_declaration_no_attr (namespace_member_declaration)* )?
			{#compilation_unit	=	#([CompileUnit, this.getFilename()],	#compilation_unit);}
	;

namespace_declaration 
	:	ns:NAMESPACE^<AST=CodeCritic.Nodes.NamespaceNode>   tp:type_name   namespace_body    
			{#ns.setType(NamespaceNode); #ns.setText(tp_AST.getText());}
	;

namespace_body 
	:	lb:LBRACE^   (using_directive)*   (namespace_member_declaration)*   RBRACE 	(SEMI!)?
		{#lb.setType(Types); #lb.setText("");}
	;

using_directive
	:	us:USING^  tp:type_name (	ASSIGN! imp:type_name SEMI!
															{#us.setType(UsingNode); #us.setText("alias");}
														|	SEMI!
															{#us.setType(UsingNode); #us.setText("import");}
														)
	;
	
namespace_member_declaration_no_attr
	:	namespace_declaration
	|	(tmod:type_modifiers!)? type_declaration[null, #tmod]
	;
	
namespace_member_declaration 
	:	namespace_declaration
	|	(attr:attributes!)? (tmod:type_modifiers!)? type_declaration[#attr, #tmod]
	;

type_declaration[CommonAST attr, CommonAST tmod] 	//Type declaration that assumes parent rule has already looked for attributes and modifiers
	:	class_declaration[attr, tmod]
	|	struct_declaration[attr, tmod]
	|	interface_declaration[attr, tmod]
	|	enum_declaration[attr, tmod]
	|	delegate_declaration[attr, tmod] 
	;

type_modifiers
	:	(type_modifier)+	{#type_modifiers	=	#([TypeModifiers],	#type_modifiers);}
	;

type_modifier
	:	NEW
	|	PUBLIC
	|	PROTECTED
	|	INTERNAL
	|	PRIVATE
	|	ABSTRACT
	|	SEALED 
	|	UNSAFE
	;
	
//***********************************************************************************************************************************/
//C.2.7 Classes section
//***********************************************************************************************************************************/
class_declaration[CommonAST attr, CommonAST mods] 
	:	cl:CLASS!<AST=CodeCritic.Nodes.InheritanceTypeNode>	id:identifier   (class_base)?   class_body	(SEMI!)? 
			{	#cl.setType(ClassNode); #cl.setText(id_AST.getText()); #class_declaration = #(cl, attr, mods, #class_declaration);}
	;

class_base 
	:	col:COLON^ class_type (COMMA! type_name)*	
			{#col.setType(BaseTypes); #col.setText("");}
	;

interface_type_list 
	:	type_name (COMMA! type_name)*
	;

class_body 
	:	lb:LBRACE^   (class_member_declaration)*   RBRACE 
		{#lb.setType(Members); #lb.setText("");}
	;

class_member_declaration 
	:	(attr:attributes!)?	(mods:member_modifiers!)?
		(	constant_declaration[#attr, #mods]									//CONST type   constant_declarators   SEMI
		|	event_declaration[#attr, #mods]											//EVENT   type   variable_declarators   SEMI
		|	destructor_declaration[#attr, #mods]								//TILDE   identifier   LPAREN   RPAREN    body
		|	conversion_operator_declaration[#attr, #mods]				
		|	type_declaration[#attr, #mods] 			
		|	tp:type!	(	constructor_declaration[#attr, #mods, #tp]
								|	indexer_declaration_no_interface[#attr, #mods, #tp]
								|	operator_declaration[#attr, #mods, #tp]
								|	(indexer_base LBRACK)=> indexer_declaration_interface[#attr, #mods, #tp]
								|	tnm:type_name!	( method_declaration[#attr, #mods, #tp, #tnm]
																	|	property_declaration[#attr, #mods, #tp, #tnm]
																	|	field_declaration[#attr, #mods, #tp, #tnm]
																	)
								)
		)
		;

member_modifiers
	:	(member_modifier)+	{#member_modifiers	=	#([Modifiers],	#member_modifiers);}
	;

member_modifier 
	:	NEW
	|	PUBLIC
	|	PROTECTED
	|	INTERNAL
	|	PRIVATE
	|	STATIC
	|	VIRTUAL
	|	SEALED
	|	OVERRIDE
	|	ABSTRACT
	|	EXTERN 
	| READONLY
	|	UNSAFE
	;

constant_declaration[CommonAST attr, CommonAST mods] 
	:	CONST!	tp:type!	constant_declarators[attr, mods, tp_AST]	SEMI!
	;
	
constant_declarators[CommonAST attr, CommonAST mods, CommonAST const_type] 
	:	constant_declarator[attr, mods, const_type]	(COMMA!	constant_declarator[(CommonAST)this.getASTFactory().dupTree(attr), (CommonAST)this.getASTFactory().dupTree(mods), (CommonAST)this.getASTFactory().dupTree(const_type)])*
	;
	
constant_declarator![CommonAST attr, CommonAST mods, CommonAST const_type] 
	:	id:identifier	ass:ASSIGN	ex:expression 
		{#constant_declarator = #([ConstantNode, id_AST.getText()],	attr, mods, const_type, id, ([Expression, "value"], ex));}
	;

field_declaration[CommonAST attr, CommonAST mods, CommonAST var_type, CommonAST var_name]		//okay I know this is ugly, but as long as it all works out I have saved us an arbitrary look ahead operation
	:	field_declaration_start[attr, mods, var_type, var_name]	(COMMA!	field_declarators[(CommonAST)this.getASTFactory().dupTree(attr), (CommonAST)this.getASTFactory().dupTree(mods), (CommonAST)this.getASTFactory().dupTree(var_type)])?	SEMI!			
	;
	
field_declaration_start[CommonAST attr, CommonAST mods, CommonAST var_type, CommonAST var_name]
	:	(ASSIGN!	variable_initializer)?
				{#field_declaration_start	=	#([FieldNode, var_name.getText()], attr, mods, var_type, var_name, #field_declaration_start);}
	;

field_declarators[CommonAST attr, CommonAST mods, CommonAST var_type] 
	:	field_declarator[attr, mods, var_type] (COMMA!   field_declarator[(CommonAST)this.getASTFactory().dupTree(attr), (CommonAST)this.getASTFactory().dupTree(mods), (CommonAST)this.getASTFactory().dupTree(var_type)])*  
	;

field_declarator[CommonAST attr, CommonAST mods, CommonAST var_type] 
	:	id:identifier  (ASSIGN!   variable_initializer)?
		{#field_declarator	=	#([FieldNode, id_AST.getText()], attr, mods, var_type, #field_declarator);}
	;

variable_initializer 
	:	(	array_initializer
		|	expression
		|	stackalloc_initializer
		)
		{#variable_initializer	=	#(#[Expression, "value"], #variable_initializer);}
	;

method_declaration![CommonAST attr, CommonAST mods, CommonAST return_type, CommonAST name] 
	:	LPAREN!	(args:formal_parameter_list)?	RPAREN!	bd:body 
		{#method_declaration	=	#([MethodNode, name.getText()], attr, mods, return_type, name, args, bd);}
	;

body 
	:	( block | SEMI! )
	;

formal_parameter_list
	:	( attr1:attributes! )?	( ( fixed_parameter[#attr1]	( COMMA!	( attr2:attributes! )?	( fixed_parameter[#attr2] | parameter_array[#attr2] ) )* )
														|	parameter_array[#attr1] )
			{#formal_parameter_list	=	#([DeclArgs], #formal_parameter_list);}
	;

fixed_parameter[CommonAST attr] 
	:	(parameter_modifier)?	type	id:identifier 
				{#fixed_parameter	=	#([DeclArg, id_AST.getText()], attr, #fixed_parameter);}
	;

parameter_modifier 
	:	REF
	|	OUT 
	;

parameter_array[CommonAST attr] 
	//:	PARAMS	non_array_type	rank_specifiers	identifier 
		:	PARAMS!	type	id:identifier 
			{#parameter_array	=	#([DeclArgParams, id_AST.getText()], attr, #parameter_array);}
	;

property_declaration[CommonAST attr, CommonAST mods, CommonAST return_type, CommonAST name] 
	:	LBRACE!	accessor_declarations	RBRACE! 
		{#property_declaration	=	#([PropertyNode, name.getText()],	attr, mods, return_type, name, #property_declaration);}
	;

accessor_declarations
	:	accessor_declaration (accessor_declaration)?
	;

accessor_declaration
	:	(attributes)?	dir:IDENTIFIER	body 
			{#accessor_declaration	=	#([AccessorNode, dir_AST.getText()], #accessor_declaration);}
	;

event_declaration[CommonAST attr, CommonAST mods]
	:	EVENT!	tp:type!	(		(event_variable_declarator[attr, mods, #tp] (COMMA!	event_variable_declarator[(CommonAST)this.getASTFactory().dupTree(attr), (CommonAST)this.getASTFactory().dupTree(mods), (CommonAST)this.getASTFactory().dupTree(#tp)] )*	SEMI! )
										|!	(id:type_name	LBRACE	eadecl:event_accessor_declarations	RBRACE
												{#event_declaration	=	#([EventNode, id_AST.getText()], attr, mods, tp, id, eadecl);} )
										)
	;

event_variable_declarator![CommonAST attr, CommonAST mods, CommonAST tp] 
	:	id:identifier  (ass:ASSIGN   var_init:variable_initializer)?
		{#event_variable_declarator	=	#([EventNode, id_AST.getText()], attr, mods, tp, id, ass, var_init);}
	;

event_accessor_declarations 
	:	accessor_declaration accessor_declaration
	;

indexer_declaration_no_interface![CommonAST attr, CommonAST mods, CommonAST tp]
	:	THIS!	lb:LBRACK!<AST=CodeCritic.Nodes.IndexerNode>	fpl:formal_parameter_list	RBRACK!	LBRACE!	adecl:accessor_declarations	RBRACE! 
			{#lb.setType(IndexerNode); #lb.setText("indexer"); #indexer_declaration_no_interface	=	#(lb, attr, mods, tp, fpl, adecl);}
			//{#indexer_declaration_no_interface	=	#([IndexerNode], attr, mods, tp, fpl, adecl);}
	;
	
indexer_declaration_interface![CommonAST attr, CommonAST mods, CommonAST tp]
	:	base:indexer_base	lb:LBRACK<AST=CodeCritic.Nodes.IndexerNode>	fpl:formal_parameter_list	RBRACK	LBRACE	adecl:accessor_declarations	RBRACE
			{#lb.setType(IndexerNode); #lb.setText("indexer"); #indexer_declaration_interface	=	#(lb, attr, mods, tp, base, fpl, adecl);}
			//{#indexer_declaration_interface	=	#([IndexerNode], attr, mods, tp, base, fpl, adecl);}
	;
	
indexer_base
	:	identifier (DOT! (identifier|THIS))*
		{#indexer_base = #([IndexerBase], #indexer_base);}
	;
	
operator_declaration[CommonAST attr, CommonAST mods, CommonAST tp] 
	:	OPERATOR!	(	(overloadable_unary_operator	LPAREN	type	identifier	RPAREN)=>	unary_operator_declaration[attr, mods, tp] 
							|	binary_operator_declaration[attr, mods, tp]  )
	;

unary_operator_declaration![CommonAST attr, CommonAST mods, CommonAST return_tp]
	:	op:overloadable_unary_operator	LPAREN	tp2:type	id:identifier	RPAREN	bd:body
			{#op.setType(UnaryOperatorNode); #unary_operator_declaration	=	#(op, attr, mods, return_tp, ([DeclArgs], ([DeclArg, id_AST.getText()], tp2, id)), bd);}
	;

overloadable_unary_operator
	:	PLUS<AST=CodeCritic.Nodes.MethodNode>
	|	MINUS<AST=CodeCritic.Nodes.MethodNode>
	|	BANG<AST=CodeCritic.Nodes.MethodNode>
	|	TILDE<AST=CodeCritic.Nodes.MethodNode>
	|	INC<AST=CodeCritic.Nodes.MethodNode>
	|	DEC<AST=CodeCritic.Nodes.MethodNode>
	|	TRUE<AST=CodeCritic.Nodes.MethodNode>
	| FALSE<AST=CodeCritic.Nodes.MethodNode>
	;
	
binary_operator_declaration![CommonAST attr, CommonAST mods, CommonAST return_tp]
	:	op:overloadable_binary_operator	LPAREN	tp1:type	id1:identifier	COMMA	tp2:type	id2:identifier	RPAREN	bd:body
			{#op.setType(BinaryOperatorNode); #binary_operator_declaration	=	#(op, attr, mods, return_tp, ([DeclArgs], ([DeclArg, id1_AST.getText()], tp1, id1), ([DeclArg, id2_AST.getText()], tp2, id2)), bd);}
	;
	
overloadable_binary_operator
	:	PLUS<AST=CodeCritic.Nodes.MethodNode>
	|	MINUS<AST=CodeCritic.Nodes.MethodNode>
	|	STAR<AST=CodeCritic.Nodes.MethodNode>
	|	DIV<AST=CodeCritic.Nodes.MethodNode>
	|	MOD<AST=CodeCritic.Nodes.MethodNode>
	|	AMPER<AST=CodeCritic.Nodes.MethodNode>
	|	BOR<AST=CodeCritic.Nodes.MethodNode>
	|	CARET<AST=CodeCritic.Nodes.MethodNode>
	|	SL<AST=CodeCritic.Nodes.MethodNode>
	|	SR<AST=CodeCritic.Nodes.MethodNode>
	|	EQUAL<AST=CodeCritic.Nodes.MethodNode>
	|	NOT_EQUAL<AST=CodeCritic.Nodes.MethodNode>
	|	GTHAN<AST=CodeCritic.Nodes.MethodNode>
	|	LTHAN<AST=CodeCritic.Nodes.MethodNode>
	|	GE<AST=CodeCritic.Nodes.MethodNode>
	|	LE<AST=CodeCritic.Nodes.MethodNode>
	;

conversion_operator_declaration![CommonAST attr, CommonAST mods]
	:	conv_op:conversion_operator	op:OPERATOR<AST=CodeCritic.Nodes.MethodNode>	tp_out:type	LPAREN	tp_in:type	id:identifier	RPAREN	bd:body
			{#op.setType(ConversionOperatorNode); #op.setText(tp_out_AST.getText() + "<-" + tp_in_AST.getText());
			#conversion_operator_declaration	=	#(op, attr, mods, conv_op, tp_out, ([DeclArgs], ([DeclArg, id_AST.getText()], tp_in, id)), bd);}
	;

conversion_operator
	:	IMPLICIT
	|	EXPLICIT
	;

constructor_declaration[CommonAST attr, CommonAST mods, CommonAST name] 
	:	LPAREN!	(formal_parameter_list)?	RPAREN!	(constructor_initializer)?	body 
			{#constructor_declaration	=	#([ConstructorNode,	name.getText()], attr, mods, name, #constructor_declaration);}
	;

constructor_initializer 
	:	COLON!	(BASE | THIS)	LPAREN!	(argument_list)?	RPAREN!
		{#constructor_initializer	=	#([ConstructorInit], #constructor_initializer);}
	;

destructor_declaration[CommonAST attr, CommonAST mods] 
	:	TILDE!	id:identifier	LPAREN!	RPAREN!	body 
		{#destructor_declaration	=	#([DestructorNode, id_AST.getText()], attr, mods, #destructor_declaration);}
	;

//***********************************************************************************************************************************/
//C.2.8 Structs
//***********************************************************************************************************************************/
struct_declaration[CommonAST attr, CommonAST mods]
	:	st:STRUCT!<AST=CodeCritic.Nodes.InheritanceTypeNode>   id:identifier   (base_interfaces)?   class_body   (SEMI!)? 
		{#st.setType(StructNode); #st.setText(id_AST.getText()); #struct_declaration	=	#(st, attr, mods, #struct_declaration);}
	;

base_interfaces 
	:	col:COLON^   interface_type_list {#col.setType(BaseTypes); #col.setText("");}
	;
	
//***********************************************************************************************************************************/
//C.2.9 Arrays
//***********************************************************************************************************************************/
array_initializer
	:	LBRACE! rest_of_array_initializer
	;
rest_of_array_initializer
	:	RBRACE!
	|	variable_initializer	(	RBRACE! | ( COMMA!	rest_of_array_initializer))
	;

//***********************************************************************************************************************************/
//C.2.10 Interfaces
//***********************************************************************************************************************************/
interface_declaration[CommonAST attr, CommonAST mods]
	:	inf:INTERFACE!<AST=CodeCritic.Nodes.InheritanceTypeNode>	id:identifier	(base_interfaces)?	interface_body   (SEMI!)?
			{#inf.setType(InterfaceNode); #inf.setText(id_AST.getText()); 
			#interface_declaration	=	#(inf, attr, mods, #interface_declaration);}
	;
	
interface_body 
	:	lb:LBRACE^   (interface_member_declaration)*   RBRACE 
		{#lb.setType(Members); #lb.setText("");}
	;

interface_member_declaration 
	:	(attr:attributes!)?	(mods:interface_member_modifiers!)?
		(	interface_event_declaration[#attr, #mods]			//EVENT   type   identifier   SEMI 
		|	tp:type!	(	interface_indexer_declaration[#attr, #mods, #tp] 	//type   THIS   LBRACK   formal_parameter_list   RBRACK   LBRACE   interface_accessors   RBRACE
							|	id:identifier!	(	interface_method_declaration[#attr, #mods, #tp, #id]	//type   identifier   LPAREN   (formal_parameter_list)?   RPAREN   SEMI 
															|	interface_property_declaration[#attr, #mods, #tp, #id]	//type   identifier   LBRACE   interface_accessors   RBRACE
															)
							)
		)
	;

interface_member_modifiers
	:	(NEW | UNSAFE)+	{#interface_member_modifiers	=	#([Modifiers],	#interface_member_modifiers);}
	;

interface_event_declaration![CommonAST attr, CommonAST mods] 
	:	EVENT   tp:type   id:identifier   SEMI 
			{#interface_event_declaration	=	#([IEventNode, id_AST.getText()], attr, mods, tp, id);}
	;
	
interface_indexer_declaration![CommonAST attr, CommonAST mods, CommonAST tp] 
	:	THIS	LBRACK	fpl:formal_parameter_list	RBRACK	LBRACE	iac:interface_accessors	RBRACE 
			{#interface_indexer_declaration	=	#([IIndexerNode, "indexer"], attr, mods, tp,	fpl, iac);}
	;
	
interface_method_declaration![CommonAST attr, CommonAST mods, CommonAST tp, CommonAST id] 
	:	LPAREN	(fpl:formal_parameter_list)?	RPAREN	SEMI 
			{#interface_method_declaration	=	#([IMethodNode, id.getText()], attr, mods, tp, id, fpl);}
	;

interface_property_declaration![CommonAST attr, CommonAST mods, CommonAST tp, CommonAST id]  
	:	LBRACE	iac:interface_accessors	RBRACE 
			{#interface_property_declaration	=	#([IPropertyNode, id.getText()], attr, mods, tp, id, iac);}
	;

interface_accessors 
	:	interface_accessor (interface_accessor)?
	;

interface_accessor
	:	(attributes)?	dir:IDENTIFIER	SEMI! 
			{#interface_accessor	=	#([IAccessorNode, dir_AST.getText()], #interface_accessor);}
	;

//***********************************************************************************************************************************/
//C.2.11 Enums
//***********************************************************************************************************************************/
enum_declaration[CommonAST attr, CommonAST mods] 
	:	en:ENUM^<AST=CodeCritic.Nodes.TypeNode>   id:identifier   (enum_base)?   enum_body   (SEMI!)? 
			{#en.setType(EnumNode); #en.setText(id_AST.getText());}
	;
	
enum_base 
	:	col:COLON^   integral_type {#col.setType(BaseTypes); #col.setText("");}
	;

enum_body
	:	lb:LBRACE^	rest_of_enum_body	{#lb.setType(Members); #lb.setText("");}
	;

rest_of_enum_body
	:	RBRACE
	|	enum_member_declaration	(	RBRACE | ( COMMA!	rest_of_enum_body))
	;

enum_member_declaration! 
	:	(attr:attributes)?	id:identifier	(enass:enum_member_assignment)?
			{#enum_member_declaration	=	#([EnumMemberNode, id_AST.getText()],	attr,	id,	enass);}
	;

enum_member_assignment
	:	ass:ASSIGN^	ex:expression	{#ass.setType(Expression);}
	;

//***********************************************************************************************************************************/	
//C.2.12 Delegates
//***********************************************************************************************************************************/
delegate_declaration![CommonAST attr, CommonAST mods] 
	:	del:DELEGATE<AST=CodeCritic.Nodes.DelegateNode>   tp:type   id:identifier   LPAREN   (params:formal_parameter_list)?   RPAREN   SEMI 
		{#del.setType(DelegateNode); #del.setText(id_AST.getText()); #delegate_declaration = #(del, attr, mods, tp, id, params);}
	;

//***********************************************************************************************************************************/	
//C.2.13 Attributes
//***********************************************************************************************************************************/	
attributes_either
	:	(attribute_section_start)+
	;

attribute_section_start
	:	lb:LBRACK^	(	((ASSEMBLY|MODULE) COLON)=> global_attribute_target_specifier	attribute_section
									{#lb.setType(GlobalAttributeSection); #lb.setText("");}
								|	(attribute_target_specifier)?	attribute_section
									{#lb.setType(AttributeSection); #lb.setText("");}
								)
							
	;

global_attribute_target_specifier
	:	gat:global_attribute_target	COLON!	
			{#global_attribute_target_specifier	=	#([AttributeTarget, gat_AST.getText()], #global_attribute_target_specifier);}
	;

global_attribute_target
	:	ASSEMBLY
	|	MODULE
	;

attributes
	:	(local_attribute)+	
	;
	
local_attribute	
	:	lb:LBRACK^	(target:attribute_target_specifier)?	attribute_section
			{#lb.setType(AttributeSection); #lb.setText("");}
	;

attribute_section
	:	attribute	(RBRACK!	|	COMMA!	(RBRACK!	|	attribute_section))
	;

attribute_target_specifier
	:	at:attribute_target   COLON!
			{#attribute_target_specifier	=	#([AttributeTarget, at_AST.getText()], #attribute_target_specifier);}
	;

attribute_target
	:	EVENT
	|	RETURN
	|	IDENTIFIER
	;

attribute
	:	tp:type_name	(attribute_arguments)?
		{#attribute	=	#([Attribute, tp_AST.getText()], #attribute);}
	;

attribute_arguments
	:	LPAREN! (expression_list)? RPAREN!
			{#attribute_arguments	=	#([Args], #attribute_arguments);}
	;

//***********************************************************************************************************************************/	
//C.3 Grammar extensions for unsafe code
//***********************************************************************************************************************************/	
sizeof_expression 
	:	sz:SIZEOF^ LPAREN!  type   RPAREN!	{#sz.setType(SizeOfExpr); #sz.setText("");} 
	;
	
unsafe_statement
	:	UNSAFE^	block
	;
	
pointer_member_access
	:	ar:ARROW^	id:IDENTIFIER	{#ar.setType(PointerMemberAccessExpr); #ar.setText(id_AST.getText());}
	;

/*
addressof_expression
	:	AMPER	unary_expression
	;
*/

fixed_statement
	:	FIXED	LPAREN	type	fixed_pointer_declarators	RPAREN	embedded_statement
	;

fixed_pointer_declarators
	:	fixed_pointer_declarator	( COMMA	fixed_pointer_declarator )*
	;

fixed_pointer_declarator
	:	identifier	ASSIGN	fixed_pointer_initializer
	;
 
fixed_pointer_initializer
 	:	(AMPER)?	expression
 	;

stackalloc_initializer
	:	STACKALLOC	non_array_type	LBRACK	expression	RBRACK
	;

// =======================================================
// == LEXER ==============================================
// =======================================================
	
class CSLexer extends Lexer;

options 
{
	k=4;                       // four characters of lookahead
	charVocabulary='\u0003'..'\uFFFF';
	exportVocab=CSharp;
	testLiterals=false;
	codeGenBitsetTestThreshold=20;
}

	
// ***** A.1.7 Keywords *****
tokens
{
	ABSTRACT	=	"abstract";			LONG		=	"long";
	AS			=	"as";				NAMESPACE	=	"namespace";
	BASE		=	"base";				NEW			=	"new";
	BOOL		=	"bool";				NULL		=	"null";
	BREAK		=	"break";			OBJECT		=	"object";
	BYTE		=	"byte";				OPERATOR	=	"operator";
	CASE		=	"case";				OUT			=	"out";
	CATCH		=	"catch";			OVERRIDE	=	"override";
	CHAR		=	"char";				PARAMS		=	"params";
	CHECKED		=	"checked";			PRIVATE		=	"private";
	CLASS		=	"class";			PROTECTED	=	"protected";
	CONST		=	"const";			PUBLIC		=	"public";
	CONTINUE	=	"continue";			READONLY	=	"readonly";
	DECIMAL		=	"decimal";			REF			=	"ref";
	DEFAULT		=	"default";			RETURN		=	"return";
	DELEGATE	=	"delegate";			SBYTE		=	"sbyte";
	DO			=	"do";				SEALED		=	"sealed";
	DOUBLE		=	"double";			SHORT		=	"short";
	ELSE		=	"else";				SIZEOF		=	"sizeof";
	ENUM		=	"enum";				STACKALLOC	=	"stackalloc";
	EVENT		=	"event";			STATIC		=	"static";
	EXPLICIT	=	"explicit";			STRING		=	"string";
	EXTERN		=	"extern";			STRUCT		=	"struct";
	FALSE		=	"false";			SWITCH		=	"switch";
	FINALLY		=	"finally";			THIS		=	"this";
	FIXED		=	"fixed";			THROW		=	"throw";
	FLOAT		=	"float";			TRUE		=	"true";
	FOR			=	"for";				TRY			=	"try";
	FOREACH		=	"foreach";			TYPEOF		=	"typeof";
	GOTO		=	"goto";				UINT		=	"uint";
	IF			=	"if";				ULONG		=	"ulong";
	IMPLICIT	=	"implicit";			UNCHECKED	=	"unchecked";
	IN			=	"in";				UNSAFE		=	"unsafe";
	INT			=	"int";				USHORT		=	"ushort";
	INTERFACE	=	"interface";		USING		=	"using";
	INTERNAL	=	"internal";			VIRTUAL		=	"virtual";
	IS			=	"is";				VOID		=	"void";
	LOCK		=	"lock";				WHILE		=	"while";
	VOLATILE = "volatile";	MODULE = "module";
	ASSEMBLY = "assembly";
}


// ***** Lexical Grammar *****
/*
Input
	:	(Input_section)*
	;
Input_section
	:	(Input_element)*   New_line
	;
Input_element
	:	Whitespace
	|	Comment
	|	Token
	;
*/
// ***** A.1.1 LINE TERMINATORS *****
protected
NEW_LINE
	:	(	// carriage return character followed by possible line feed character	
			{ LA(2)=='\u000A' }? '\u000D' '\u000A'			
		|	'\u000D'			// line feed character							
		|	'\u000A'			// line feed character							
		|	'\u2028'			// line separator character
		|	'\u2029'			// paragraph separator character 
		)
		{newline();}
	;
	
protected
NEW_LINE_CHARACTER
	:	('\u000D' | '\u000A' | '\u2028' | '\u2029')
	;
	
protected
NOT_NEW_LINE
	:	~( '\u000D' | '\u000A' | '\u2028' | '\u2029')
	;
	
	
// ***** A.1.2 WHITESPACE *****
WHITESPACE
	:	(	' '
		|	'\u0009' // horizontal tab character
		|	'\u000B' // vertical tab character
		|	'\u000C' // form feed character 
		|	NEW_LINE 
		)+
		{ _ttype = Token.SKIP; }
	;	
	
	
// ***** A.1.3 COMMENTS *****
SINGLE_LINE_COMMENT
	:	"//" 
		(NOT_NEW_LINE)* 
		(NEW_LINE)
		{_ttype = Token.SKIP;}
	;
	
DELIMITED_COMMENT
	:	"/*"  
		(	{ LA(2)!='/' }? '*'
		|	NEW_LINE		
		|	~('*'|'\u000D'|'\u000A'|'\u2028'|'\u2029')
		)*
		"*/"
		{ _ttype = Token.SKIP; }
	;	

/*	
// ***** A.1.4 TOKENS *****
TOKEN
	:	identifier
	|	KEYWORD
	|	INTEGER_LITERAL
	|	REAL_LITERAL
	|	CHARACTER_LITERAL
	|	STRING_LITERAL
	|	OPERATOR_OR_PUNCTUATOR
	;
*/	
	
// ***** A.1.5 UNICODE character escape sequences *****
UNICODE_ESCAPE_SEQUENCE
	:	('\\' 'u'   HEX_DIGIT   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT)
	|	('\\' 'U'   HEX_DIGIT   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT  
					HEX_DIGIT   HEX_DIGIT   HEX_DIGIT  HEX_DIGIT)
	;

// ***** A.1.6 identifierS *****

IDENTIFIER
options { testLiterals=true; }
	:	IDENTIFIER_START_CHARACTER (IDENTIFIER_PART_CHARACTER)*
//	|	'@' (identifier_PART_CHARACTER)*
	;
	
protected
IDENTIFIER_START_CHARACTER
	:	('a'..'z'|'A'..'Z'|'_'|'$'|'@') //TODO: IDENTIFIER literals can have starting @
	;
	
protected
IDENTIFIER_PART_CHARACTER
	:	('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'$') 
	;
	
// ***** A.1.8 LITERALS *****

/* // move to parser - TODO: look into this...

BOOLEAN_LITERAL
	:	TRUE
	|	FALSE
	;
NULL_LITERAL
	:	NULL
	;
*/

NUMERIC_LITERAL

	// real
	:	('.' DECIMAL_DIGIT) =>
		 '.' (DECIMAL_DIGIT)+ (EXPONENT_PART)? (REAL_TYPE_SUFFIX)?
		{$setType(REAL_LITERAL);}
			
	|	((DECIMAL_DIGIT)+ '.' DECIMAL_DIGIT) =>
		 (DECIMAL_DIGIT)+ '.' (DECIMAL_DIGIT)+ (EXPONENT_PART)? (REAL_TYPE_SUFFIX)?
		{$setType(REAL_LITERAL);}
		
	|	((DECIMAL_DIGIT)+ (EXPONENT_PART)) =>
		 (DECIMAL_DIGIT)+ (EXPONENT_PART) (REAL_TYPE_SUFFIX)?
		{$setType(REAL_LITERAL);}
		
	|	((DECIMAL_DIGIT)+ (REAL_TYPE_SUFFIX)) =>
		 (DECIMAL_DIGIT)+ (REAL_TYPE_SUFFIX)		
		{$setType(REAL_LITERAL);}
		 
	// integer
	|	 (DECIMAL_DIGIT)+ (INTEGER_TYPE_SUFFIX)?	
		{$setType(INTEGER_LITERAL);}
	
	// just a dot
	| '.'{$setType(DOT);}
	;

	
HEXADECIMAL_INTEGER_LITERAL
	:	"0x"   (HEX_DIGIT)+   (INTEGER_TYPE_SUFFIX)?
	|	"0X"   (HEX_DIGIT)+   (INTEGER_TYPE_SUFFIX)?
	;

CHARACTER_LITERAL
	:	"'"!   CHARACTER   "'"!
	;	

/*
STRING_LITERAL
	:	REGULAR_STRING_LITERAL
	|	VERBATIM_STRING_LITERAL
	;
*/

REGULAR_STRING_LITERAL
	:	'\"'!   
		(	rs:REGULAR_STRING_LITERAL_CHARACTER
		)*   
		'\"'!
	;
	
VERBATIM_STRING_LITERAL
{string s="";}
	:	 '@' '"'  	
		(	"\"\""			{s+=("\"");}
		|	'\\'				{s+=("\\\\");}
		|	{ LA(2)=='\u000A' }? '\u000D' '\u000A'	{s+=("\u000D\u000A"); newline();}
		| '\u000D'		{s+=('\u000D'); newline();}
		| '\u000A'		{s+=('\u000A'); newline();}
		| '\u2028'		{s+=('\u2028'); newline();}
		| '\u2029'		{s+=('\u2029'); newline();}
		|	ch:~('\"'|'\\'|'\u000D'|'\u000A'|'\u2028'|'\u2029')	{s+=(ch);}
		)* 
		'"'
		{$setText(s);}
	;

// ===== literal (protected) helpers ============

// nums
protected
DECIMAL_DIGIT
	: 	'0'	|	'1'	|	'2'	|	'3'	|	'4'	|	'5'	|	'6'	|	'7'	|	'8'	|	'9'
	;
protected	
INTEGER_TYPE_SUFFIX
	:
	(	options {generateAmbigWarnings=false;}
		:	"UL"	| "LU" 	| "ul"	| "lu"
		|	"UL"	| "LU" 	| "uL"	| "lU"
		|	"U"		| "L"	| "u"	| "l"
	)
	;
		
protected
HEX_DIGIT
	:	'0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | 
		'A' | 'B' | 'C' | 'D' | 'E' | 'F'  |
		'a' | 'b' | 'c' | 'd' | 'e' | 'f'
	;	
	
protected	
EXPONENT_PART
	:	"e"  (SIGN)*  (DECIMAL_DIGIT)+
	|	"E"  (SIGN)*  (DECIMAL_DIGIT)+
	;	
	
protected
SIGN
	:	'+' | '-'
	;
	
protected
REAL_TYPE_SUFFIX
	: 'F' | 'f' | 'D' | 'd' | 'M' | 'm'
	;

// chars
protected
CHARACTER
	:	SINGLE_CHARACTER
	|	SIMPLE_ESCAPE_SEQUENCE
	|	HEXADECIMAL_ESCAPE_SEQUENCE
	|	UNICODE_ESCAPE_SEQUENCE
	;

protected
SINGLE_CHARACTER
	:	 ~( '\'' | '\\' | '\u000D' | '\u000A' | '\u2028' | '\u2029')
	;
	
protected
SIMPLE_ESCAPE_SEQUENCE
	:	"\\'" | "\\\"" | "\\\\" | "\\0" | "\\a"  
	|	"\\b" | "\\f"  | "\\n"  | "\\r" | "\\t" | "\\v"
	;
	
protected	
HEXADECIMAL_ESCAPE_SEQUENCE	
	:	('\\' 'x' HEX_DIGIT)
		( options {warnWhenFollowAmbig = false;}: 
		HEX_DIGIT 
			( options {warnWhenFollowAmbig = false;}:
			HEX_DIGIT 
				( options {warnWhenFollowAmbig = false;}:
				HEX_DIGIT
				)?
			)?
		)? // oh antlr syntax
	;

// strings

	
protected	
REGULAR_STRING_LITERAL_CHARACTER
	:	SINGLE_REGULAR_STRING_LITERAL_CHARACTER
	|	SIMPLE_ESCAPE_SEQUENCE
	|	HEXADECIMAL_ESCAPE_SEQUENCE
	|	UNICODE_ESCAPE_SEQUENCE
	;
	
protected	
SINGLE_REGULAR_STRING_LITERAL_CHARACTER
	:	 ~( '\"' | '\\' | '\u000D' | '\u000A' | '\u2028' | '\u2029')
	;

/*
protected 
VERBATIM_STRING_LITERAL
	:	'@'!	'\"'!
		( VERBATIM_QUOTE_ESCAPE_SEQUENCE | SINGLE_VERBATIM_STRING_LITERAL_CHARACTER )*
		'\"'!
	;

VERBATIM_QUOTE_ESCAPE_SEQUENCE
	:	'\"'	'\"'
	;

SINGLE_VERBATIM_STRING_LITERAL_CHARACTER
	:	~( '\"' )
	;
*/

	
	
// ***** A.1.9 Operators and punctuators *****
/*
Operator_or_punctuator
	:	'{'	|	'}'	|	'['	|	']'	|	'('	|	')'	|			','	|	':'	|	';'
	|	'+'	|	'-'	|	'*'	|	'/'	|	'%'	|	'&'	|	'|'	|	'^'	|	'!'	|	'~'
	|	'='	|	'<'	|	'>'	|	'?'	|	"++"|	"--"|	"&&"|	"||"|	"<<"|	">>"
	|	"=="|	"!="|	"<="|	">="|	"+="|	"-="|	"*="|	"/="|	"%="|	"&="
	|	"|="|	"^="| "<<="	| ">>=" |	"->"
	;
*/
LBRACE		:	'{'		;	RBRACE		:	'}'		;
LBRACK		:	'['		;	RBRACK		:	']'		;
LPAREN		:	'('		;	RPAREN		:	')'		;

PLUS		:	'+'		;		PLUS_ASN	:	"+="	;	
MINUS		:	'-'		;		MINUS_ASN	:	"-="	;	
STAR		:	'*'		;		STAR_ASN	:	"*="	;
DIV			:	'/'		;		DIV_ASN		:	"/="	;
MOD			:	'%'		;		MOD_ASN		:	"%="	;
INC			:	"++"	;		DEC			:	"--"	;

SL			:	"<<"	;		SL_ASN		:	"<<="	;
SR			:	">>"	;		SR_ASN		:	">>="	;
BSR			:	">>>"	;		BSR_ASN		:	">>>="	;

AMPER		:	'&'		;		BAND_ASN	:	"&="	;	
BOR			:	'|'		;		BOR_ASN		:	"|="	;	
CARET		:	'^'		;		BXOR_ASN	:	"^="	;
TILDE		:	'~'		;

ASSIGN	:	'='		;		EQUAL			:	"=="	;
LTHAN		:	'<'		;		LE				:	"<="	;
GTHAN		:	">"		;		GE				:	">="	;
BANG		:	'!'		;		NOT_EQUAL	:	"!="	;
LOR			:	"||"	;		LAND			:	"&&"	;

COMMA		:	','		;		COLON		:	':'		;	
SEMI		:	';'		;		HASH		:	"#"     ;
QUOTE		:	"\""  ;		QMARK		:	'?'		;

ARROW		:	"->"	;


// ***** A.1.10 Pre_processing directives *****
PP_DIRECTIVE									//screw pre processors, ignore them all
	:	HASH	(PP_MESSAGE_CHAR)+	(NEW_LINE)?
		{ _ttype = Token.SKIP; }
	;
	
protected
PP_MESSAGE_CHAR
	:	('a'..'z'|'A'..'Z'|' '|'	'|'0'..'9'|'`'|'~'|'!'|'@'|'#'|'$'|'%'|'^'|'&'|'*'|'('|')'|'-'|'_'|'='|'+'|'['|']'|'{'|'}'|'|'|':'|';'|'\''|'\"'|'?'|'/'|'\\'|','|'<'|'.'|'>')
	;
	
/*
PP_DIRECTIVE									//screw pre processors, ignore them all
	:	HASH	PP_MESSAGE
		{ _ttype = Token.SKIP; }
	;
protected
PP_MESSAGE
	:	(NOT_NEW_LINE)+ //(NEW_LINE)?
	;
*/
	
/*
PP_DIRECTIVE
	:	 HASH (PP_WHITESPACE)?
		(	dc:PP_DECLARATION	{Console.Write("===>decl: "+dc.getText());}
		| 	rg:PP_REGION		{Console.Write("===>regn: "+rg.getText());}
//		|	PP_CONDITIONAL
//		|	PP_LINE
//		|	PP_DIAGNOSTIC
		)
	{ _ttype = Token.SKIP; }
	;

protected	
PP_NEW_LINE
	:	(PP_WHITESPACE)?	(SINGLE_LINE_COMMENT | NEW_LINE_CHARACTER)
	;

protected	
PP_DECLARATION
	:	(PPT_DEFINE | PPT_UNDEF)	(PP_WHITESPACE)?	CONDITIONAL_SYMBOL PP_NEW_LINE
	;
protected
PPT_DEFINE
	:	"define"
	;
protected
PPT_UNDEF
	:	"undef"
	;
protected
CONDITIONAL_SYMBOL
	:	IDENTIFIER_START_CHARACTER (IDENTIFIER_PART_CHARACTER)*
	;

protected
PP_CONDITIONAL
	:	PP_IF_SECTION	(PP_ELIF_SECTIONS)?	(PP_ELSE_SECTION)?	PP_ENDIF
	;
protected
PP_CONDITIONAL
	:	PP_CONDITIONAL_OP	(PP_WHITESPACE)?	PP_EXPRESSION	PP_NEW_LINE
	;
PP_CONDITIONAL_OP
	:	"if"
	|	"elif"
	;


protected	
PP_REGION
	:	(PPT_REGION | PPT_END_REGION)	PP_MESSAGE	
	;
protected
PPT_REGION
	:	"region"
	;
protected
PPT_END_REGION
	:	"endregion"
	;
protected
PP_MESSAGE
	:	(NOT_NEW_LINE)* NEW_LINE
	;



/*
// skip conditional compilation for now 
protected	
PP_CONDITIONAL
	:	PP_IF_SECTION PP_ENDIF
	;
protected	
PP_IF_SECTION
	:	PPT_IF PP_EXPRESSION PP_NEW_LINE// (CONDITIONAL_SECTION)?
	;
protected	
PP_ENDIF
	:	HASH PPT_ENDIF PP_NEW_LINE
	;
	
protected	
PP_SIGN  
	:	(LOR | LAND | EQUAL | NOT_EQUAL | LNOT)
	;

protected	
PP_EXPRESSION  
	:	PP_PRIMARY_EXPRESSION
		(PP_SIGN PP_PRIMARY_EXPRESSION)?
	;

protected	
PP_OR_EXPRESSION
	:	PP_AND_EXPRESSION (LOR PP_AND_EXPRESSION)?
	;
protected	
PP_AND_EXPRESSION
	:	PP_EQUALITY_EXPRESSION ((PP_WHITESPACE)? LAND  (PP_WHITESPACE)? PP_EQUALITY_EXPRESSION)?
	;
protected	
PP_EQUALITY_EXPRESSION
	:	PP_UNARY_EXPRESSION ((EQUAL | NOT_EQUAL)  PP_UNARY_EXPRESSION)? 
	;
protected	
PP_UNARY_EXPRESSION
	:	PP_PRIMARY_EXPRESSION (LNOT  PP_PRIMARY_EXPRESSION)?
	;

protected	
PP_PRIMARY_EXPRESSION
	:	(PPT_TRUE)=>PPT_TRUE 		{Console.WriteLine("  ===>true ");}
	|	(PPT_FALSE)=>PPT_FALSE 		{Console.WriteLine("  ===>false ");}
	|	LPAREN 
		ex:PP_EXPRESSION 
		RPAREN 						{Console.WriteLine("  ===>expr "+ex.getText());}
	|	((PP_WHITESPACE)? 
		cs:CONDITIONAL_SYMBOL 
		(PP_WHITESPACE)?)  			{Console.WriteLine("  ===>symbol "+cs.getText());}
	;

	
protected
PPT_IF
	:	"if"
	;
protected
PPT_ENDIF
	:	"endif"
	;
protected
PPT_TRUE
	:	"true"
	;
protected
PPT_FALSE
	:	"false"
	;


protected	
PP_ELIF_SECTIONS:
	:	PP_ELIF_SECTION
	|	PP_ELIF_SECTIONS PP_ELIF_SECTION
	;

PP_ELIF_SECTION:
	:	(WHITESPACE)? # (WHITESPACE)? ELIF WHITESPACE PP_EXPRESSION PP_NEW_LINE (CONDITIONAL_SECTION)?
	;
PP_ELSE_SECTION:
	:	(WHITESPACE)? # (WHITESPACE)? ELSE PP_NEW_LINE (CONDITIONAL_SECTION)?
	;
*/