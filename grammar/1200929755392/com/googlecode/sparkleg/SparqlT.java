// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com\\googlecode\\sparkleg\\SparqlT.g 2011-07-24 22:37:24

    package com.googlecode.sparkleg;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


/**
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 * @version $Id: Sparql.g 161 2011-05-23 22:14:39Z Juergen.Pfundt@web.de $
 */
public class SparqlT extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUERY", "UPDATE", "PROLOGUE", "MODIFY", "SUBSELECT", "SELECT_CLAUSE", "WHERE_CLAUSE", "VAR", "GROUP_BY", "ORDER_BY", "ORDER_CONDITION", "BINDING_VALUE", "TRIPLES_TEMPLATE", "TRIPLES_BLOCK", "GROUP_GRAPH_PATTERN", "ARG_LIST", "EXPRESSION_LIST", "CONSTRUCT_TRIPLES", "TRIPLES_NODE", "COLLECTION", "TRIPLES_SAME_SUBJECT", "SUBJECT", "PREDICATE", "OBJECT", "NOT_EXISTS", "FUNCTION", "PATH", "PATH_SEQUENCE", "PATH_PRIMARY", "PATH_NEGATED", "UNARY_NOT", "UNARY_PLUS", "UNARY_MINUS", "UNARY", "BLANK_NODE", "SEMICOLON", "BASE", "IRI_REF", "PREFIX", "PNAME_NS", "SELECT", "DISTINCT", "REDUCED", "ASTERISK", "OPEN_BRACE", "AS", "CLOSE_BRACE", "CONSTRUCT", "WHERE", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", "DESCRIBE", "ASK", "FROM", "NAMED", "GROUP", "BY", "HAVING", "ORDER", "ASC", "DESC", "LIMIT", "INTEGER", "OFFSET", "BINDINGS", "UNDEF", "LOAD", "SILENT", "INTO", "CLEAR", "DROP", "CREATE", "ADD", "TO", "MOVE", "COPY", "INSERT", "DATA", "DELETE", "WITH", "USING", "DEFAULT", "GRAPH", "ALL", "DOT", "OPTIONAL", "SERVICE", "BIND", "MINUS_KEYWORD", "UNION", "FILTER", "COMMA", "A", "PIPE", "DIVIDE", "INVERSE", "QUESTION_MARK", "PLUS", "NEGATION", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "VAR1", "VAR2", "OR", "AND", "EQUAL", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "IN", "NOT", "MINUS", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "IRI", "URI", "BNODE", "RAND", "ABS", "CEIL", "FLOOR", "ROUND", "CONCAT", "STRLEN", "UCASE", "LCASE", "ENCODE_FOR_URI", "CONTAINS", "STRSTARTS", "STRENDS", "YEAR", "MONTH", "DAY", "HOURS", "MINUTES", "SECONDS", "TIMEZONE", "TZ", "NOW", "MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "COALESCE", "IF", "STRLANG", "STRDT", "SAMETERM", "ISIRI", "ISURI", "ISBLANK", "ISLITERAL", "ISNUMERIC", "REGEX", "SUBSTR", "EXISTS", "COUNT", "SUM", "MIN", "MAX", "AVG", "SAMPLE", "GROUP_CONCAT", "SEPARATOR", "LANGTAG", "REFERENCE", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "PNAME_LN", "BLANK_NODE_LABEL", "EOL", "WS", "PN_PREFIX", "PN_LOCAL", "VARNAME", "DIGIT", "EXPONENT", "SIGN", "ECHAR", "IRI_REF_CHARACTERS", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "COMMENT", "ANY"
    };
    public static final int FUNCTION=29;
    public static final int GRAPH=86;
    public static final int CONTAINS=136;
    public static final int REGEX=164;
    public static final int NOW=147;
    public static final int PNAME_LN=191;
    public static final int CONSTRUCT=51;
    public static final int SEPARATOR=174;
    public static final int NOT=116;
    public static final int EOF=-1;
    public static final int STRLEN=132;
    public static final int MONTH=140;
    public static final int UNARY_PLUS=35;
    public static final int CLEAR=73;
    public static final int ISLITERAL=162;
    public static final int CREATE=75;
    public static final int EOL=193;
    public static final int USING=84;
    public static final int BINDING_VALUE=15;
    public static final int NOT_EQUAL=110;
    public static final int BIND=91;
    public static final int QUESTION_MARK=100;
    public static final int TRIPLES_TEMPLATE=16;
    public static final int PN_CHARS_U=204;
    public static final int UNARY_NOT=34;
    public static final int SELECT_CLAUSE=9;
    public static final int CLOSE_CURLY_BRACE=54;
    public static final int TZ=146;
    public static final int DOUBLE_POSITIVE=181;
    public static final int DIVIDE=98;
    public static final int BOUND=122;
    public static final int A=96;
    public static final int ASC=63;
    public static final int LOAD=70;
    public static final int ASK=56;
    public static final int UNARY_MINUS=36;
    public static final int SEMICOLON=39;
    public static final int CONSTRUCT_TRIPLES=21;
    public static final int ABS=127;
    public static final int GROUP=59;
    public static final int WS=194;
    public static final int SERVICE=90;
    public static final int INTEGER_POSITIVE=179;
    public static final int PATH_PRIMARY=32;
    public static final int DESCRIBE=55;
    public static final int PN_CHARS=205;
    public static final int SUBSELECT=8;
    public static final int DATATYPE=121;
    public static final int GROUP_GRAPH_PATTERN=18;
    public static final int DOUBLE_NEGATIVE=184;
    public static final int LANG=119;
    public static final int SUBJECT=25;
    public static final int MODIFY=7;
    public static final int IRI_REF=41;
    public static final int BNODE=125;
    public static final int SHA224=150;
    public static final int SUM=168;
    public static final int PREDICATE=26;
    public static final int ENCODE_FOR_URI=135;
    public static final int ASTERISK=47;
    public static final int STR=118;
    public static final int AS=49;
    public static final int SAMPLE=172;
    public static final int WHERE_CLAUSE=10;
    public static final int TRIPLES_NODE=22;
    public static final int EXPRESSION_LIST=20;
    public static final int SUBSTR=165;
    public static final int OFFSET=67;
    public static final int AVG=171;
    public static final int RAND=126;
    public static final int DECIMAL_POSITIVE=180;
    public static final int GROUP_CONCAT=173;
    public static final int PLUS=101;
    public static final int PIPE=97;
    public static final int EXISTS=166;
    public static final int UNARY=37;
    public static final int STRLANG=156;
    public static final int ADD=76;
    public static final int INTEGER=66;
    public static final int BY=60;
    public static final int TO=77;
    public static final int BLANK_NODE=38;
    public static final int PNAME_NS=43;
    public static final int HAVING=61;
    public static final int MIN=169;
    public static final int CLOSE_BRACE=50;
    public static final int MINUS=117;
    public static final int UNION=93;
    public static final int MINUTES=143;
    public static final int PATH_SEQUENCE=31;
    public static final int GROUP_BY=12;
    public static final int STRING_LITERAL_LONG2=190;
    public static final int NEGATION=102;
    public static final int DECIMAL=177;
    public static final int DROP=74;
    public static final int STRING_LITERAL_LONG1=189;
    public static final int MOVE=78;
    public static final int ORDER_BY=13;
    public static final int GREATER_EQUAL=114;
    public static final int HOURS=142;
    public static final int LANGTAG=175;
    public static final int SIGN=200;
    public static final int PREFIX=42;
    public static final int EXPONENT=199;
    public static final int SILENT=71;
    public static final int SHA256=151;
    public static final int BINDINGS=68;
    public static final int STRENDS=138;
    public static final int LCASE=134;
    public static final int SHA512=153;
    public static final int DAY=141;
    public static final int COUNT=167;
    public static final int VARNAME=197;
    public static final int STRDT=157;
    public static final int GREATER=112;
    public static final int INSERT=80;
    public static final int PATH=30;
    public static final int ORDER_CONDITION=14;
    public static final int LESS=111;
    public static final int LANGMATCHES=120;
    public static final int DOUBLE=178;
    public static final int BASE=40;
    public static final int VAR=11;
    public static final int COMMENT=206;
    public static final int OPEN_CURLY_BRACE=53;
    public static final int SELECT=44;
    public static final int INTO=72;
    public static final int ISIRI=159;
    public static final int COALESCE=154;
    public static final int CONCAT=131;
    public static final int STRSTARTS=137;
    public static final int BLANK_NODE_LABEL=192;
    public static final int TRIPLES_SAME_SUBJECT=24;
    public static final int ARG_LIST=19;
    public static final int DELETE=82;
    public static final int MINUS_KEYWORD=92;
    public static final int FLOOR=129;
    public static final int ISBLANK=161;
    public static final int CLOSE_SQUARE_BRACKET=104;
    public static final int URI=124;
    public static final int UCASE=133;
    public static final int INVERSE=99;
    public static final int NAMED=58;
    public static final int STRING_LITERAL2=188;
    public static final int OR=107;
    public static final int FILTER=94;
    public static final int STRING_LITERAL1=187;
    public static final int QUERY=4;
    public static final int ROUND=130;
    public static final int LESS_EQUAL=113;
    public static final int FROM=57;
    public static final int FALSE=186;
    public static final int DISTINCT=45;
    public static final int WHERE=52;
    public static final int YEAR=139;
    public static final int ORDER=62;
    public static final int TIMEZONE=145;
    public static final int LIMIT=65;
    public static final int UPDATE=5;
    public static final int MAX=170;
    public static final int SECONDS=144;
    public static final int AND=108;
    public static final int IF=155;
    public static final int ISURI=160;
    public static final int SAMETERM=158;
    public static final int IN=115;
    public static final int OBJECT=27;
    public static final int MD5=148;
    public static final int COMMA=95;
    public static final int COPY=79;
    public static final int IRI=123;
    public static final int ALL=87;
    public static final int EQUAL=109;
    public static final int COLLECTION=23;
    public static final int DIGIT=198;
    public static final int UNDEF=69;
    public static final int DOT=88;
    public static final int PROLOGUE=6;
    public static final int WITH=83;
    public static final int ISNUMERIC=163;
    public static final int OPEN_SQUARE_BRACKET=103;
    public static final int REDUCED=46;
    public static final int DEFAULT=85;
    public static final int INTEGER_NEGATIVE=182;
    public static final int PN_LOCAL=196;
    public static final int REFERENCE=176;
    public static final int PATH_NEGATED=33;
    public static final int SHA1=149;
    public static final int TRIPLES_BLOCK=17;
    public static final int TRUE=185;
    public static final int NOT_EXISTS=28;
    public static final int ECHAR=201;
    public static final int OPTIONAL=89;
    public static final int IRI_REF_CHARACTERS=202;
    public static final int ANY=207;
    public static final int PN_CHARS_BASE=203;
    public static final int VAR1=105;
    public static final int VAR2=106;
    public static final int DECIMAL_NEGATIVE=183;
    public static final int PN_PREFIX=195;
    public static final int CEIL=128;
    public static final int DESC=64;
    public static final int SHA384=152;
    public static final int OPEN_BRACE=48;
    public static final int DATA=81;

    // delegates
    // delegators


        public SparqlT(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public SparqlT(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SparqlT.tokenNames; }
    public String getGrammarFileName() { return "com\\googlecode\\sparkleg\\SparqlT.g"; }


    public static class query_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // com\\googlecode\\sparkleg\\SparqlT.g:37:1: query : ( ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | ^( UPDATE ( update )+ ) );
    public final SparqlT.query_return query() throws RecognitionException {
        SparqlT.query_return retval = new SparqlT.query_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUERY1=null;
        CommonTree UPDATE8=null;
        SparqlT.prologue_return prologue2 = null;

        SparqlT.selectQuery_return selectQuery3 = null;

        SparqlT.constructQuery_return constructQuery4 = null;

        SparqlT.describeQuery_return describeQuery5 = null;

        SparqlT.askQuery_return askQuery6 = null;

        SparqlT.bindingsClause_return bindingsClause7 = null;

        SparqlT.update_return update9 = null;


        CommonTree QUERY1_tree=null;
        CommonTree UPDATE8_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:38:5: ( ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | ^( UPDATE ( update )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUERY) ) {
                alt7=1;
            }
            else if ( (LA7_0==UPDATE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:38:7: ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    QUERY1=(CommonTree)match(input,QUERY,FOLLOW_QUERY_in_query53); 
                    QUERY1_tree = (CommonTree)adaptor.dupNode(QUERY1);

                    root_1 = (CommonTree)adaptor.becomeRoot(QUERY1_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_prologue_in_query55);
                    prologue2=prologue();

                    state._fsp--;

                    adaptor.addChild(root_1, prologue2.getTree());
                    // com\\googlecode\\sparkleg\\SparqlT.g:38:24: ( selectQuery )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==SELECT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:38:24: selectQuery
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_selectQuery_in_query57);
                    	    selectQuery3=selectQuery();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, selectQuery3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:38:37: ( constructQuery )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==CONSTRUCT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:38:37: constructQuery
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_constructQuery_in_query60);
                    	    constructQuery4=constructQuery();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, constructQuery4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:38:53: ( describeQuery )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==DESCRIBE) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:38:53: describeQuery
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_describeQuery_in_query63);
                    	    describeQuery5=describeQuery();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, describeQuery5.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:38:68: ( askQuery )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ASK) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:38:68: askQuery
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_askQuery_in_query66);
                    	    askQuery6=askQuery();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, askQuery6.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    // com\\googlecode\\sparkleg\\SparqlT.g:38:79: ( bindingsClause )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==BINDINGS) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:38:79: bindingsClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_bindingsClause_in_query70);
                    	    bindingsClause7=bindingsClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, bindingsClause7.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:39:7: ^( UPDATE ( update )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UPDATE8=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_query80); 
                    UPDATE8_tree = (CommonTree)adaptor.dupNode(UPDATE8);

                    root_1 = (CommonTree)adaptor.becomeRoot(UPDATE8_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:39:16: ( update )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==PROLOGUE) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:39:16: update
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_update_in_query82);
                    	    update9=update();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, update9.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "query"

    public static class prologue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prologue"
    // com\\googlecode\\sparkleg\\SparqlT.g:42:1: prologue : ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) ;
    public final SparqlT.prologue_return prologue() throws RecognitionException {
        SparqlT.prologue_return retval = new SparqlT.prologue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PROLOGUE10=null;
        SparqlT.baseDecl_return baseDecl11 = null;

        SparqlT.prefixDecl_return prefixDecl12 = null;


        CommonTree PROLOGUE10_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:43:5: ( ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:43:7: ^( PROLOGUE ( baseDecl )* ( prefixDecl )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PROLOGUE10=(CommonTree)match(input,PROLOGUE,FOLLOW_PROLOGUE_in_prologue102); 
            PROLOGUE10_tree = (CommonTree)adaptor.dupNode(PROLOGUE10);

            root_1 = (CommonTree)adaptor.becomeRoot(PROLOGUE10_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:43:18: ( baseDecl )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==BASE) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:43:18: baseDecl
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_baseDecl_in_prologue104);
                	    baseDecl11=baseDecl();

                	    state._fsp--;

                	    adaptor.addChild(root_1, baseDecl11.getTree());

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);

                // com\\googlecode\\sparkleg\\SparqlT.g:43:28: ( prefixDecl )*
                loop9:
                do {
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==PREFIX) ) {
                        alt9=1;
                    }


                    switch (alt9) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:43:28: prefixDecl
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_prefixDecl_in_prologue107);
                	    prefixDecl12=prefixDecl();

                	    state._fsp--;

                	    adaptor.addChild(root_1, prefixDecl12.getTree());

                	    }
                	    break;

                	default :
                	    break loop9;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prologue"

    public static class baseDecl_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "baseDecl"
    // com\\googlecode\\sparkleg\\SparqlT.g:46:1: baseDecl : ^( BASE IRI_REF ) ;
    public final SparqlT.baseDecl_return baseDecl() throws RecognitionException {
        SparqlT.baseDecl_return retval = new SparqlT.baseDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BASE13=null;
        CommonTree IRI_REF14=null;

        CommonTree BASE13_tree=null;
        CommonTree IRI_REF14_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:47:5: ( ^( BASE IRI_REF ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:47:7: ^( BASE IRI_REF )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BASE13=(CommonTree)match(input,BASE,FOLLOW_BASE_in_baseDecl127); 
            BASE13_tree = (CommonTree)adaptor.dupNode(BASE13);

            root_1 = (CommonTree)adaptor.becomeRoot(BASE13_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            IRI_REF14=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_baseDecl129); 
            IRI_REF14_tree = (CommonTree)adaptor.dupNode(IRI_REF14);

            adaptor.addChild(root_1, IRI_REF14_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "baseDecl"

    public static class prefixDecl_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixDecl"
    // com\\googlecode\\sparkleg\\SparqlT.g:50:1: prefixDecl : ^( PREFIX PNAME_NS IRI_REF ) ;
    public final SparqlT.prefixDecl_return prefixDecl() throws RecognitionException {
        SparqlT.prefixDecl_return retval = new SparqlT.prefixDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PREFIX15=null;
        CommonTree PNAME_NS16=null;
        CommonTree IRI_REF17=null;

        CommonTree PREFIX15_tree=null;
        CommonTree PNAME_NS16_tree=null;
        CommonTree IRI_REF17_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:51:5: ( ^( PREFIX PNAME_NS IRI_REF ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:51:7: ^( PREFIX PNAME_NS IRI_REF )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PREFIX15=(CommonTree)match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl148); 
            PREFIX15_tree = (CommonTree)adaptor.dupNode(PREFIX15);

            root_1 = (CommonTree)adaptor.becomeRoot(PREFIX15_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            PNAME_NS16=(CommonTree)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl150); 
            PNAME_NS16_tree = (CommonTree)adaptor.dupNode(PNAME_NS16);

            adaptor.addChild(root_1, PNAME_NS16_tree);

            _last = (CommonTree)input.LT(1);
            IRI_REF17=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl152); 
            IRI_REF17_tree = (CommonTree)adaptor.dupNode(IRI_REF17);

            adaptor.addChild(root_1, IRI_REF17_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixDecl"

    public static class selectQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:54:1: selectQuery : ^( SELECT selectClause ( datasetClause )* ( whereClause )* solutionModifier ) ;
    public final SparqlT.selectQuery_return selectQuery() throws RecognitionException {
        SparqlT.selectQuery_return retval = new SparqlT.selectQuery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT18=null;
        SparqlT.selectClause_return selectClause19 = null;

        SparqlT.datasetClause_return datasetClause20 = null;

        SparqlT.whereClause_return whereClause21 = null;

        SparqlT.solutionModifier_return solutionModifier22 = null;


        CommonTree SELECT18_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:55:5: ( ^( SELECT selectClause ( datasetClause )* ( whereClause )* solutionModifier ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:55:7: ^( SELECT selectClause ( datasetClause )* ( whereClause )* solutionModifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SELECT18=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectQuery171); 
            SELECT18_tree = (CommonTree)adaptor.dupNode(SELECT18);

            root_1 = (CommonTree)adaptor.becomeRoot(SELECT18_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_selectQuery173);
            selectClause19=selectClause();

            state._fsp--;

            adaptor.addChild(root_1, selectClause19.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:55:29: ( datasetClause )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==FROM) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:55:29: datasetClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_datasetClause_in_selectQuery175);
            	    datasetClause20=datasetClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, datasetClause20.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:55:44: ( whereClause )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WHERE_CLAUSE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:55:44: whereClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_whereClause_in_selectQuery178);
            	    whereClause21=whereClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, whereClause21.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_solutionModifier_in_selectQuery181);
            solutionModifier22=solutionModifier();

            state._fsp--;

            adaptor.addChild(root_1, solutionModifier22.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectQuery"

    public static class subSelect_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subSelect"
    // com\\googlecode\\sparkleg\\SparqlT.g:58:1: subSelect : ^( SUBSELECT ( whereClause )* solutionModifier ) ;
    public final SparqlT.subSelect_return subSelect() throws RecognitionException {
        SparqlT.subSelect_return retval = new SparqlT.subSelect_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBSELECT23=null;
        SparqlT.whereClause_return whereClause24 = null;

        SparqlT.solutionModifier_return solutionModifier25 = null;


        CommonTree SUBSELECT23_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:59:5: ( ^( SUBSELECT ( whereClause )* solutionModifier ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:59:7: ^( SUBSELECT ( whereClause )* solutionModifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SUBSELECT23=(CommonTree)match(input,SUBSELECT,FOLLOW_SUBSELECT_in_subSelect200); 
            SUBSELECT23_tree = (CommonTree)adaptor.dupNode(SUBSELECT23);

            root_1 = (CommonTree)adaptor.becomeRoot(SUBSELECT23_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:59:19: ( whereClause )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==WHERE_CLAUSE) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:59:19: whereClause
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_whereClause_in_subSelect202);
                	    whereClause24=whereClause();

                	    state._fsp--;

                	    adaptor.addChild(root_1, whereClause24.getTree());

                	    }
                	    break;

                	default :
                	    break loop12;
                    }
                } while (true);

                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_solutionModifier_in_subSelect205);
                solutionModifier25=solutionModifier();

                state._fsp--;

                adaptor.addChild(root_1, solutionModifier25.getTree());

                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subSelect"

    public static class selectClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:62:1: selectClause : ( ^( SELECT_CLAUSE ASTERISK ) | ^( SELECT_CLAUSE DISTINCT ASTERISK ) | ^( SELECT_CLAUSE REDUCED ASTERISK ) | ^( SELECT_CLAUSE ( selectVariables )* ) | ^( SELECT_CLAUSE DISTINCT ( selectVariables )* ) | ^( SELECT_CLAUSE REDUCED ( selectVariables )* ) );
    public final SparqlT.selectClause_return selectClause() throws RecognitionException {
        SparqlT.selectClause_return retval = new SparqlT.selectClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_CLAUSE26=null;
        CommonTree ASTERISK27=null;
        CommonTree SELECT_CLAUSE28=null;
        CommonTree DISTINCT29=null;
        CommonTree ASTERISK30=null;
        CommonTree SELECT_CLAUSE31=null;
        CommonTree REDUCED32=null;
        CommonTree ASTERISK33=null;
        CommonTree SELECT_CLAUSE34=null;
        CommonTree SELECT_CLAUSE36=null;
        CommonTree DISTINCT37=null;
        CommonTree SELECT_CLAUSE39=null;
        CommonTree REDUCED40=null;
        SparqlT.selectVariables_return selectVariables35 = null;

        SparqlT.selectVariables_return selectVariables38 = null;

        SparqlT.selectVariables_return selectVariables41 = null;


        CommonTree SELECT_CLAUSE26_tree=null;
        CommonTree ASTERISK27_tree=null;
        CommonTree SELECT_CLAUSE28_tree=null;
        CommonTree DISTINCT29_tree=null;
        CommonTree ASTERISK30_tree=null;
        CommonTree SELECT_CLAUSE31_tree=null;
        CommonTree REDUCED32_tree=null;
        CommonTree ASTERISK33_tree=null;
        CommonTree SELECT_CLAUSE34_tree=null;
        CommonTree SELECT_CLAUSE36_tree=null;
        CommonTree DISTINCT37_tree=null;
        CommonTree SELECT_CLAUSE39_tree=null;
        CommonTree REDUCED40_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:63:5: ( ^( SELECT_CLAUSE ASTERISK ) | ^( SELECT_CLAUSE DISTINCT ASTERISK ) | ^( SELECT_CLAUSE REDUCED ASTERISK ) | ^( SELECT_CLAUSE ( selectVariables )* ) | ^( SELECT_CLAUSE DISTINCT ( selectVariables )* ) | ^( SELECT_CLAUSE REDUCED ( selectVariables )* ) )
            int alt16=6;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:63:7: ^( SELECT_CLAUSE ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE26=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause229); 
                    SELECT_CLAUSE26_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE26);

                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE26_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASTERISK27=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause231); 
                    ASTERISK27_tree = (CommonTree)adaptor.dupNode(ASTERISK27);

                    adaptor.addChild(root_1, ASTERISK27_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:64:7: ^( SELECT_CLAUSE DISTINCT ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE28=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause241); 
                    SELECT_CLAUSE28_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE28);

                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE28_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    DISTINCT29=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause243); 
                    DISTINCT29_tree = (CommonTree)adaptor.dupNode(DISTINCT29);

                    adaptor.addChild(root_1, DISTINCT29_tree);

                    _last = (CommonTree)input.LT(1);
                    ASTERISK30=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause245); 
                    ASTERISK30_tree = (CommonTree)adaptor.dupNode(ASTERISK30);

                    adaptor.addChild(root_1, ASTERISK30_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:65:7: ^( SELECT_CLAUSE REDUCED ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE31=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause255); 
                    SELECT_CLAUSE31_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE31);

                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE31_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    REDUCED32=(CommonTree)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause257); 
                    REDUCED32_tree = (CommonTree)adaptor.dupNode(REDUCED32);

                    adaptor.addChild(root_1, REDUCED32_tree);

                    _last = (CommonTree)input.LT(1);
                    ASTERISK33=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause259); 
                    ASTERISK33_tree = (CommonTree)adaptor.dupNode(ASTERISK33);

                    adaptor.addChild(root_1, ASTERISK33_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:66:7: ^( SELECT_CLAUSE ( selectVariables )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE34=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause269); 
                    SELECT_CLAUSE34_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE34);

                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE34_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:66:23: ( selectVariables )*
                        loop13:
                        do {
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==VAR||LA13_0==AS) ) {
                                alt13=1;
                            }


                            switch (alt13) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:66:23: selectVariables
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_selectVariables_in_selectClause271);
                        	    selectVariables35=selectVariables();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, selectVariables35.getTree());

                        	    }
                        	    break;

                        	default :
                        	    break loop13;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:67:7: ^( SELECT_CLAUSE DISTINCT ( selectVariables )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE36=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause282); 
                    SELECT_CLAUSE36_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE36);

                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE36_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    DISTINCT37=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause284); 
                    DISTINCT37_tree = (CommonTree)adaptor.dupNode(DISTINCT37);

                    adaptor.addChild(root_1, DISTINCT37_tree);

                    // com\\googlecode\\sparkleg\\SparqlT.g:67:32: ( selectVariables )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==VAR||LA14_0==AS) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:67:32: selectVariables
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause286);
                    	    selectVariables38=selectVariables();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, selectVariables38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:68:7: ^( SELECT_CLAUSE REDUCED ( selectVariables )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SELECT_CLAUSE39=(CommonTree)match(input,SELECT_CLAUSE,FOLLOW_SELECT_CLAUSE_in_selectClause297); 
                    SELECT_CLAUSE39_tree = (CommonTree)adaptor.dupNode(SELECT_CLAUSE39);

                    root_1 = (CommonTree)adaptor.becomeRoot(SELECT_CLAUSE39_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    REDUCED40=(CommonTree)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause299); 
                    REDUCED40_tree = (CommonTree)adaptor.dupNode(REDUCED40);

                    adaptor.addChild(root_1, REDUCED40_tree);

                    // com\\googlecode\\sparkleg\\SparqlT.g:68:31: ( selectVariables )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==VAR||LA15_0==AS) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:68:31: selectVariables
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause301);
                    	    selectVariables41=selectVariables();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, selectVariables41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectClause"

    public static class selectVariables_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectVariables"
    // com\\googlecode\\sparkleg\\SparqlT.g:71:1: selectVariables : ( ^( VAR var ) | ^( AS expression var ) );
    public final SparqlT.selectVariables_return selectVariables() throws RecognitionException {
        SparqlT.selectVariables_return retval = new SparqlT.selectVariables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR42=null;
        CommonTree AS44=null;
        SparqlT.var_return var43 = null;

        SparqlT.expression_return expression45 = null;

        SparqlT.var_return var46 = null;


        CommonTree VAR42_tree=null;
        CommonTree AS44_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:72:5: ( ^( VAR var ) | ^( AS expression var ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==VAR) ) {
                alt17=1;
            }
            else if ( (LA17_0==AS) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:72:7: ^( VAR var )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR42=(CommonTree)match(input,VAR,FOLLOW_VAR_in_selectVariables321); 
                    VAR42_tree = (CommonTree)adaptor.dupNode(VAR42);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR42_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_selectVariables323);
                    var43=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var43.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:73:7: ^( AS expression var )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AS44=(CommonTree)match(input,AS,FOLLOW_AS_in_selectVariables334); 
                    AS44_tree = (CommonTree)adaptor.dupNode(AS44);

                    root_1 = (CommonTree)adaptor.becomeRoot(AS44_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_selectVariables336);
                    expression45=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression45.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_selectVariables338);
                    var46=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var46.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectVariables"

    public static class constructQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:76:1: constructQuery : ( ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* solutionModifier ) | ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) solutionModifier ) );
    public final SparqlT.constructQuery_return constructQuery() throws RecognitionException {
        SparqlT.constructQuery_return retval = new SparqlT.constructQuery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSTRUCT47=null;
        CommonTree CONSTRUCT52=null;
        CommonTree WHERE54=null;
        SparqlT.constructTemplate_return constructTemplate48 = null;

        SparqlT.datasetClause_return datasetClause49 = null;

        SparqlT.whereClause_return whereClause50 = null;

        SparqlT.solutionModifier_return solutionModifier51 = null;

        SparqlT.datasetClause_return datasetClause53 = null;

        SparqlT.triplesTemplate_return triplesTemplate55 = null;

        SparqlT.solutionModifier_return solutionModifier56 = null;


        CommonTree CONSTRUCT47_tree=null;
        CommonTree CONSTRUCT52_tree=null;
        CommonTree WHERE54_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:77:5: ( ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* solutionModifier ) | ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) solutionModifier ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:77:7: ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* solutionModifier )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSTRUCT47=(CommonTree)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery359); 
                    CONSTRUCT47_tree = (CommonTree)adaptor.dupNode(CONSTRUCT47);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCT47_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:77:19: ( constructTemplate )*
                        loop18:
                        do {
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==CONSTRUCT_TRIPLES) ) {
                                alt18=1;
                            }


                            switch (alt18) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:77:19: constructTemplate
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_constructTemplate_in_constructQuery361);
                        	    constructTemplate48=constructTemplate();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, constructTemplate48.getTree());

                        	    }
                        	    break;

                        	default :
                        	    break loop18;
                            }
                        } while (true);

                        // com\\googlecode\\sparkleg\\SparqlT.g:77:38: ( datasetClause )*
                        loop19:
                        do {
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==FROM) ) {
                                alt19=1;
                            }


                            switch (alt19) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:77:38: datasetClause
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_datasetClause_in_constructQuery364);
                        	    datasetClause49=datasetClause();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, datasetClause49.getTree());

                        	    }
                        	    break;

                        	default :
                        	    break loop19;
                            }
                        } while (true);

                        // com\\googlecode\\sparkleg\\SparqlT.g:77:53: ( whereClause )*
                        loop20:
                        do {
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==WHERE_CLAUSE) ) {
                                alt20=1;
                            }


                            switch (alt20) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:77:53: whereClause
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_whereClause_in_constructQuery367);
                        	    whereClause50=whereClause();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, whereClause50.getTree());

                        	    }
                        	    break;

                        	default :
                        	    break loop20;
                            }
                        } while (true);

                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_solutionModifier_in_constructQuery370);
                        solutionModifier51=solutionModifier();

                        state._fsp--;

                        adaptor.addChild(root_1, solutionModifier51.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:78:7: ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) solutionModifier )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSTRUCT52=(CommonTree)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery380); 
                    CONSTRUCT52_tree = (CommonTree)adaptor.dupNode(CONSTRUCT52);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCT52_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:78:19: ( datasetClause )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==FROM) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:78:19: datasetClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery382);
                    	    datasetClause53=datasetClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, datasetClause53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WHERE54=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_constructQuery386); 
                    WHERE54_tree = (CommonTree)adaptor.dupNode(WHERE54);

                    root_2 = (CommonTree)adaptor.becomeRoot(WHERE54_tree, root_2);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:78:42: ( triplesTemplate )*
                        loop22:
                        do {
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==TRIPLES_TEMPLATE) ) {
                                alt22=1;
                            }


                            switch (alt22) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:78:42: triplesTemplate
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_triplesTemplate_in_constructQuery388);
                        	    triplesTemplate55=triplesTemplate();

                        	    state._fsp--;

                        	    adaptor.addChild(root_2, triplesTemplate55.getTree());

                        	    }
                        	    break;

                        	default :
                        	    break loop22;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery392);
                    solutionModifier56=solutionModifier();

                    state._fsp--;

                    adaptor.addChild(root_1, solutionModifier56.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructQuery"

    public static class describeQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:81:1: describeQuery : ^( DESCRIBE ( varOrIRIref )* ( ASTERISK )* ( datasetClause )* ( whereClause )? solutionModifier ) ;
    public final SparqlT.describeQuery_return describeQuery() throws RecognitionException {
        SparqlT.describeQuery_return retval = new SparqlT.describeQuery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DESCRIBE57=null;
        CommonTree ASTERISK59=null;
        SparqlT.varOrIRIref_return varOrIRIref58 = null;

        SparqlT.datasetClause_return datasetClause60 = null;

        SparqlT.whereClause_return whereClause61 = null;

        SparqlT.solutionModifier_return solutionModifier62 = null;


        CommonTree DESCRIBE57_tree=null;
        CommonTree ASTERISK59_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:82:5: ( ^( DESCRIBE ( varOrIRIref )* ( ASTERISK )* ( datasetClause )* ( whereClause )? solutionModifier ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:82:7: ^( DESCRIBE ( varOrIRIref )* ( ASTERISK )* ( datasetClause )* ( whereClause )? solutionModifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DESCRIBE57=(CommonTree)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery411); 
            DESCRIBE57_tree = (CommonTree)adaptor.dupNode(DESCRIBE57);

            root_1 = (CommonTree)adaptor.becomeRoot(DESCRIBE57_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:82:18: ( varOrIRIref )*
                loop24:
                do {
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IRI_REF||LA24_0==PNAME_NS||(LA24_0>=VAR1 && LA24_0<=VAR2)||LA24_0==PNAME_LN) ) {
                        alt24=1;
                    }


                    switch (alt24) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:18: varOrIRIref
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_varOrIRIref_in_describeQuery413);
                	    varOrIRIref58=varOrIRIref();

                	    state._fsp--;

                	    adaptor.addChild(root_1, varOrIRIref58.getTree());

                	    }
                	    break;

                	default :
                	    break loop24;
                    }
                } while (true);

                // com\\googlecode\\sparkleg\\SparqlT.g:82:31: ( ASTERISK )*
                loop25:
                do {
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==ASTERISK) ) {
                        alt25=1;
                    }


                    switch (alt25) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:31: ASTERISK
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    ASTERISK59=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_describeQuery416); 
                	    ASTERISK59_tree = (CommonTree)adaptor.dupNode(ASTERISK59);

                	    adaptor.addChild(root_1, ASTERISK59_tree);


                	    }
                	    break;

                	default :
                	    break loop25;
                    }
                } while (true);

                // com\\googlecode\\sparkleg\\SparqlT.g:82:41: ( datasetClause )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==FROM) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:82:41: datasetClause
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_datasetClause_in_describeQuery419);
                	    datasetClause60=datasetClause();

                	    state._fsp--;

                	    adaptor.addChild(root_1, datasetClause60.getTree());

                	    }
                	    break;

                	default :
                	    break loop26;
                    }
                } while (true);

                // com\\googlecode\\sparkleg\\SparqlT.g:82:56: ( whereClause )?
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==WHERE_CLAUSE) ) {
                    alt27=1;
                }
                switch (alt27) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:82:56: whereClause
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_whereClause_in_describeQuery422);
                        whereClause61=whereClause();

                        state._fsp--;

                        adaptor.addChild(root_1, whereClause61.getTree());

                        }
                        break;

                }

                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_solutionModifier_in_describeQuery425);
                solutionModifier62=solutionModifier();

                state._fsp--;

                adaptor.addChild(root_1, solutionModifier62.getTree());

                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeQuery"

    public static class askQuery_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "askQuery"
    // com\\googlecode\\sparkleg\\SparqlT.g:85:1: askQuery : ^( ASK ( datasetClause )* whereClause ) ;
    public final SparqlT.askQuery_return askQuery() throws RecognitionException {
        SparqlT.askQuery_return retval = new SparqlT.askQuery_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASK63=null;
        SparqlT.datasetClause_return datasetClause64 = null;

        SparqlT.whereClause_return whereClause65 = null;


        CommonTree ASK63_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:86:5: ( ^( ASK ( datasetClause )* whereClause ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:86:7: ^( ASK ( datasetClause )* whereClause )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ASK63=(CommonTree)match(input,ASK,FOLLOW_ASK_in_askQuery444); 
            ASK63_tree = (CommonTree)adaptor.dupNode(ASK63);

            root_1 = (CommonTree)adaptor.becomeRoot(ASK63_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:86:13: ( datasetClause )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==FROM) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:86:13: datasetClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_datasetClause_in_askQuery446);
            	    datasetClause64=datasetClause();

            	    state._fsp--;

            	    adaptor.addChild(root_1, datasetClause64.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_whereClause_in_askQuery449);
            whereClause65=whereClause();

            state._fsp--;

            adaptor.addChild(root_1, whereClause65.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "askQuery"

    public static class datasetClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datasetClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:89:1: datasetClause : ^( FROM ( NAMED )? iriRef ) ;
    public final SparqlT.datasetClause_return datasetClause() throws RecognitionException {
        SparqlT.datasetClause_return retval = new SparqlT.datasetClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FROM66=null;
        CommonTree NAMED67=null;
        SparqlT.iriRef_return iriRef68 = null;


        CommonTree FROM66_tree=null;
        CommonTree NAMED67_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:90:5: ( ^( FROM ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:90:7: ^( FROM ( NAMED )? iriRef )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FROM66=(CommonTree)match(input,FROM,FOLLOW_FROM_in_datasetClause468); 
            FROM66_tree = (CommonTree)adaptor.dupNode(FROM66);

            root_1 = (CommonTree)adaptor.becomeRoot(FROM66_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:90:14: ( NAMED )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==NAMED) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:90:14: NAMED
                    {
                    _last = (CommonTree)input.LT(1);
                    NAMED67=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_datasetClause470); 
                    NAMED67_tree = (CommonTree)adaptor.dupNode(NAMED67);

                    adaptor.addChild(root_1, NAMED67_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_datasetClause473);
            iriRef68=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef68.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datasetClause"

    public static class whereClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:93:1: whereClause : ^( WHERE_CLAUSE groupGraphPattern ) ;
    public final SparqlT.whereClause_return whereClause() throws RecognitionException {
        SparqlT.whereClause_return retval = new SparqlT.whereClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE_CLAUSE69=null;
        SparqlT.groupGraphPattern_return groupGraphPattern70 = null;


        CommonTree WHERE_CLAUSE69_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:94:5: ( ^( WHERE_CLAUSE groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:94:7: ^( WHERE_CLAUSE groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            WHERE_CLAUSE69=(CommonTree)match(input,WHERE_CLAUSE,FOLLOW_WHERE_CLAUSE_in_whereClause492); 
            WHERE_CLAUSE69_tree = (CommonTree)adaptor.dupNode(WHERE_CLAUSE69);

            root_1 = (CommonTree)adaptor.becomeRoot(WHERE_CLAUSE69_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_whereClause494);
            groupGraphPattern70=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern70.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whereClause"

    public static class solutionModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "solutionModifier"
    // com\\googlecode\\sparkleg\\SparqlT.g:97:1: solutionModifier : ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? ;
    public final SparqlT.solutionModifier_return solutionModifier() throws RecognitionException {
        SparqlT.solutionModifier_return retval = new SparqlT.solutionModifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.groupClause_return groupClause71 = null;

        SparqlT.havingClause_return havingClause72 = null;

        SparqlT.orderClause_return orderClause73 = null;

        SparqlT.limitOffsetClauses_return limitOffsetClauses74 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:98:5: ( ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:98:7: ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:98:7: ( groupClause )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==GROUP_BY) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:7: groupClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupClause_in_solutionModifier516);
                    groupClause71=groupClause();

                    state._fsp--;

                    adaptor.addChild(root_0, groupClause71.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\SparqlT.g:98:20: ( havingClause )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==HAVING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:20: havingClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_havingClause_in_solutionModifier519);
                    havingClause72=havingClause();

                    state._fsp--;

                    adaptor.addChild(root_0, havingClause72.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\SparqlT.g:98:34: ( orderClause )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ORDER_BY) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:34: orderClause
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderClause_in_solutionModifier522);
                    orderClause73=orderClause();

                    state._fsp--;

                    adaptor.addChild(root_0, orderClause73.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\SparqlT.g:98:47: ( limitOffsetClauses )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LIMIT||LA33_0==OFFSET) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:98:47: limitOffsetClauses
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier525);
                    limitOffsetClauses74=limitOffsetClauses();

                    state._fsp--;

                    adaptor.addChild(root_0, limitOffsetClauses74.getTree());

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "solutionModifier"

    public static class groupClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:101:1: groupClause : ^( GROUP_BY ( groupCondition )+ ) ;
    public final SparqlT.groupClause_return groupClause() throws RecognitionException {
        SparqlT.groupClause_return retval = new SparqlT.groupClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_BY75=null;
        SparqlT.groupCondition_return groupCondition76 = null;


        CommonTree GROUP_BY75_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:102:5: ( ^( GROUP_BY ( groupCondition )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:102:7: ^( GROUP_BY ( groupCondition )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GROUP_BY75=(CommonTree)match(input,GROUP_BY,FOLLOW_GROUP_BY_in_groupClause544); 
            GROUP_BY75_tree = (CommonTree)adaptor.dupNode(GROUP_BY75);

            root_1 = (CommonTree)adaptor.becomeRoot(GROUP_BY75_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:102:18: ( groupCondition )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=NOT_EXISTS && LA34_0<=FUNCTION)||LA34_0==AS||(LA34_0>=VAR1 && LA34_0<=VAR2)||(LA34_0>=STR && LA34_0<=EXISTS)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:102:18: groupCondition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_groupCondition_in_groupClause546);
            	    groupCondition76=groupCondition();

            	    state._fsp--;

            	    adaptor.addChild(root_1, groupCondition76.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupClause"

    public static class groupCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupCondition"
    // com\\googlecode\\sparkleg\\SparqlT.g:105:1: groupCondition : ( builtInCall | functionCall | ^( AS expression ( var )* ) | var );
    public final SparqlT.groupCondition_return groupCondition() throws RecognitionException {
        SparqlT.groupCondition_return retval = new SparqlT.groupCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AS79=null;
        SparqlT.builtInCall_return builtInCall77 = null;

        SparqlT.functionCall_return functionCall78 = null;

        SparqlT.expression_return expression80 = null;

        SparqlT.var_return var81 = null;

        SparqlT.var_return var82 = null;


        CommonTree AS79_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:106:5: ( builtInCall | functionCall | ^( AS expression ( var )* ) | var )
            int alt36=4;
            switch ( input.LA(1) ) {
            case NOT_EXISTS:
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case IRI:
            case URI:
            case BNODE:
            case RAND:
            case ABS:
            case CEIL:
            case FLOOR:
            case ROUND:
            case CONCAT:
            case STRLEN:
            case UCASE:
            case LCASE:
            case ENCODE_FOR_URI:
            case CONTAINS:
            case STRSTARTS:
            case STRENDS:
            case YEAR:
            case MONTH:
            case DAY:
            case HOURS:
            case MINUTES:
            case SECONDS:
            case TIMEZONE:
            case TZ:
            case NOW:
            case MD5:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case COALESCE:
            case IF:
            case STRLANG:
            case STRDT:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case ISNUMERIC:
            case REGEX:
            case SUBSTR:
            case EXISTS:
                {
                alt36=1;
                }
                break;
            case FUNCTION:
                {
                alt36=2;
                }
                break;
            case AS:
                {
                alt36=3;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:106:7: builtInCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_builtInCall_in_groupCondition572);
                    builtInCall77=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall77.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:107:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_groupCondition580);
                    functionCall78=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall78.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:108:7: ^( AS expression ( var )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AS79=(CommonTree)match(input,AS,FOLLOW_AS_in_groupCondition589); 
                    AS79_tree = (CommonTree)adaptor.dupNode(AS79);

                    root_1 = (CommonTree)adaptor.becomeRoot(AS79_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_groupCondition591);
                    expression80=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression80.getTree());
                    // com\\googlecode\\sparkleg\\SparqlT.g:108:23: ( var )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=VAR1 && LA35_0<=VAR2)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:108:23: var
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_var_in_groupCondition593);
                    	    var81=var();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, var81.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:109:7: var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_groupCondition603);
                    var82=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var82.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupCondition"

    public static class havingClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "havingClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:112:1: havingClause : ^( HAVING ( constraint )+ ) ;
    public final SparqlT.havingClause_return havingClause() throws RecognitionException {
        SparqlT.havingClause_return retval = new SparqlT.havingClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree HAVING83=null;
        SparqlT.constraint_return constraint84 = null;


        CommonTree HAVING83_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:113:5: ( ^( HAVING ( constraint )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:113:7: ^( HAVING ( constraint )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            HAVING83=(CommonTree)match(input,HAVING,FOLLOW_HAVING_in_havingClause621); 
            HAVING83_tree = (CommonTree)adaptor.dupNode(HAVING83);

            root_1 = (CommonTree)adaptor.becomeRoot(HAVING83_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:113:16: ( constraint )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=NOT_EXISTS && LA37_0<=FUNCTION)||(LA37_0>=UNARY_NOT && LA37_0<=UNARY)||LA37_0==ASTERISK||LA37_0==DIVIDE||LA37_0==PLUS||(LA37_0>=OR && LA37_0<=EXISTS)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:113:16: constraint
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_constraint_in_havingClause623);
            	    constraint84=constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_1, constraint84.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "havingClause"

    public static class orderClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:116:1: orderClause : ^( ORDER_BY ( orderCondition )+ ) ;
    public final SparqlT.orderClause_return orderClause() throws RecognitionException {
        SparqlT.orderClause_return retval = new SparqlT.orderClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDER_BY85=null;
        SparqlT.orderCondition_return orderCondition86 = null;


        CommonTree ORDER_BY85_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:117:5: ( ^( ORDER_BY ( orderCondition )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:117:7: ^( ORDER_BY ( orderCondition )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ORDER_BY85=(CommonTree)match(input,ORDER_BY,FOLLOW_ORDER_BY_in_orderClause648); 
            ORDER_BY85_tree = (CommonTree)adaptor.dupNode(ORDER_BY85);

            root_1 = (CommonTree)adaptor.becomeRoot(ORDER_BY85_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:117:18: ( orderCondition )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ORDER_CONDITION) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:117:18: orderCondition
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_orderCondition_in_orderClause650);
            	    orderCondition86=orderCondition();

            	    state._fsp--;

            	    adaptor.addChild(root_1, orderCondition86.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderClause"

    public static class orderCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderCondition"
    // com\\googlecode\\sparkleg\\SparqlT.g:120:1: orderCondition : ( ^( ORDER_CONDITION ASC expression ) | ^( ORDER_CONDITION DESC expression ) | ^( ORDER_CONDITION constraint ) | ^( ORDER_CONDITION var ) );
    public final SparqlT.orderCondition_return orderCondition() throws RecognitionException {
        SparqlT.orderCondition_return retval = new SparqlT.orderCondition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDER_CONDITION87=null;
        CommonTree ASC88=null;
        CommonTree ORDER_CONDITION90=null;
        CommonTree DESC91=null;
        CommonTree ORDER_CONDITION93=null;
        CommonTree ORDER_CONDITION95=null;
        SparqlT.expression_return expression89 = null;

        SparqlT.expression_return expression92 = null;

        SparqlT.constraint_return constraint94 = null;

        SparqlT.var_return var96 = null;


        CommonTree ORDER_CONDITION87_tree=null;
        CommonTree ASC88_tree=null;
        CommonTree ORDER_CONDITION90_tree=null;
        CommonTree DESC91_tree=null;
        CommonTree ORDER_CONDITION93_tree=null;
        CommonTree ORDER_CONDITION95_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:121:5: ( ^( ORDER_CONDITION ASC expression ) | ^( ORDER_CONDITION DESC expression ) | ^( ORDER_CONDITION constraint ) | ^( ORDER_CONDITION var ) )
            int alt39=4;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ORDER_CONDITION) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case ASC:
                        {
                        alt39=1;
                        }
                        break;
                    case DESC:
                        {
                        alt39=2;
                        }
                        break;
                    case VAR1:
                    case VAR2:
                        {
                        alt39=4;
                        }
                        break;
                    case NOT_EXISTS:
                    case FUNCTION:
                    case UNARY_NOT:
                    case UNARY_PLUS:
                    case UNARY_MINUS:
                    case UNARY:
                    case ASTERISK:
                    case DIVIDE:
                    case PLUS:
                    case OR:
                    case AND:
                    case EQUAL:
                    case NOT_EQUAL:
                    case LESS:
                    case GREATER:
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case IN:
                    case NOT:
                    case MINUS:
                    case STR:
                    case LANG:
                    case LANGMATCHES:
                    case DATATYPE:
                    case BOUND:
                    case IRI:
                    case URI:
                    case BNODE:
                    case RAND:
                    case ABS:
                    case CEIL:
                    case FLOOR:
                    case ROUND:
                    case CONCAT:
                    case STRLEN:
                    case UCASE:
                    case LCASE:
                    case ENCODE_FOR_URI:
                    case CONTAINS:
                    case STRSTARTS:
                    case STRENDS:
                    case YEAR:
                    case MONTH:
                    case DAY:
                    case HOURS:
                    case MINUTES:
                    case SECONDS:
                    case TIMEZONE:
                    case TZ:
                    case NOW:
                    case MD5:
                    case SHA1:
                    case SHA224:
                    case SHA256:
                    case SHA384:
                    case SHA512:
                    case COALESCE:
                    case IF:
                    case STRLANG:
                    case STRDT:
                    case SAMETERM:
                    case ISIRI:
                    case ISURI:
                    case ISBLANK:
                    case ISLITERAL:
                    case ISNUMERIC:
                    case REGEX:
                    case SUBSTR:
                    case EXISTS:
                        {
                        alt39=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:121:7: ^( ORDER_CONDITION ASC expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ORDER_CONDITION87=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition670); 
                    ORDER_CONDITION87_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION87);

                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION87_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASC88=(CommonTree)match(input,ASC,FOLLOW_ASC_in_orderCondition672); 
                    ASC88_tree = (CommonTree)adaptor.dupNode(ASC88);

                    adaptor.addChild(root_1, ASC88_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_orderCondition674);
                    expression89=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression89.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:122:7: ^( ORDER_CONDITION DESC expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ORDER_CONDITION90=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition684); 
                    ORDER_CONDITION90_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION90);

                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION90_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    DESC91=(CommonTree)match(input,DESC,FOLLOW_DESC_in_orderCondition686); 
                    DESC91_tree = (CommonTree)adaptor.dupNode(DESC91);

                    adaptor.addChild(root_1, DESC91_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_orderCondition688);
                    expression92=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression92.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:123:7: ^( ORDER_CONDITION constraint )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ORDER_CONDITION93=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition698); 
                    ORDER_CONDITION93_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION93);

                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION93_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_constraint_in_orderCondition700);
                    constraint94=constraint();

                    state._fsp--;

                    adaptor.addChild(root_1, constraint94.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:124:7: ^( ORDER_CONDITION var )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ORDER_CONDITION95=(CommonTree)match(input,ORDER_CONDITION,FOLLOW_ORDER_CONDITION_in_orderCondition710); 
                    ORDER_CONDITION95_tree = (CommonTree)adaptor.dupNode(ORDER_CONDITION95);

                    root_1 = (CommonTree)adaptor.becomeRoot(ORDER_CONDITION95_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_orderCondition712);
                    var96=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var96.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderCondition"

    public static class limitOffsetClauses_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "limitOffsetClauses"
    // com\\googlecode\\sparkleg\\SparqlT.g:127:1: limitOffsetClauses : ( ^( LIMIT INTEGER ) ( ^( OFFSET INTEGER ) )* | ^( OFFSET INTEGER ) ( ^( LIMIT INTEGER ) )* );
    public final SparqlT.limitOffsetClauses_return limitOffsetClauses() throws RecognitionException {
        SparqlT.limitOffsetClauses_return retval = new SparqlT.limitOffsetClauses_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LIMIT97=null;
        CommonTree INTEGER98=null;
        CommonTree OFFSET99=null;
        CommonTree INTEGER100=null;
        CommonTree OFFSET101=null;
        CommonTree INTEGER102=null;
        CommonTree LIMIT103=null;
        CommonTree INTEGER104=null;

        CommonTree LIMIT97_tree=null;
        CommonTree INTEGER98_tree=null;
        CommonTree OFFSET99_tree=null;
        CommonTree INTEGER100_tree=null;
        CommonTree OFFSET101_tree=null;
        CommonTree INTEGER102_tree=null;
        CommonTree LIMIT103_tree=null;
        CommonTree INTEGER104_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:128:5: ( ^( LIMIT INTEGER ) ( ^( OFFSET INTEGER ) )* | ^( OFFSET INTEGER ) ( ^( LIMIT INTEGER ) )* )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==LIMIT) ) {
                alt42=1;
            }
            else if ( (LA42_0==OFFSET) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:128:7: ^( LIMIT INTEGER ) ( ^( OFFSET INTEGER ) )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LIMIT97=(CommonTree)match(input,LIMIT,FOLLOW_LIMIT_in_limitOffsetClauses736); 
                    LIMIT97_tree = (CommonTree)adaptor.dupNode(LIMIT97);

                    root_1 = (CommonTree)adaptor.becomeRoot(LIMIT97_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    INTEGER98=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses738); 
                    INTEGER98_tree = (CommonTree)adaptor.dupNode(INTEGER98);

                    adaptor.addChild(root_1, INTEGER98_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    // com\\googlecode\\sparkleg\\SparqlT.g:128:24: ( ^( OFFSET INTEGER ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==OFFSET) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:128:25: ^( OFFSET INTEGER )
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    {
                    	    CommonTree _save_last_1 = _last;
                    	    CommonTree _first_1 = null;
                    	    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    	    OFFSET99=(CommonTree)match(input,OFFSET,FOLLOW_OFFSET_in_limitOffsetClauses743); 
                    	    OFFSET99_tree = (CommonTree)adaptor.dupNode(OFFSET99);

                    	    root_1 = (CommonTree)adaptor.becomeRoot(OFFSET99_tree, root_1);



                    	    match(input, Token.DOWN, null); 
                    	    _last = (CommonTree)input.LT(1);
                    	    INTEGER100=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses745); 
                    	    INTEGER100_tree = (CommonTree)adaptor.dupNode(INTEGER100);

                    	    adaptor.addChild(root_1, INTEGER100_tree);


                    	    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:129:7: ^( OFFSET INTEGER ) ( ^( LIMIT INTEGER ) )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OFFSET101=(CommonTree)match(input,OFFSET,FOLLOW_OFFSET_in_limitOffsetClauses757); 
                    OFFSET101_tree = (CommonTree)adaptor.dupNode(OFFSET101);

                    root_1 = (CommonTree)adaptor.becomeRoot(OFFSET101_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    INTEGER102=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses759); 
                    INTEGER102_tree = (CommonTree)adaptor.dupNode(INTEGER102);

                    adaptor.addChild(root_1, INTEGER102_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    // com\\googlecode\\sparkleg\\SparqlT.g:129:25: ( ^( LIMIT INTEGER ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==LIMIT) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:129:26: ^( LIMIT INTEGER )
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    {
                    	    CommonTree _save_last_1 = _last;
                    	    CommonTree _first_1 = null;
                    	    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    	    LIMIT103=(CommonTree)match(input,LIMIT,FOLLOW_LIMIT_in_limitOffsetClauses764); 
                    	    LIMIT103_tree = (CommonTree)adaptor.dupNode(LIMIT103);

                    	    root_1 = (CommonTree)adaptor.becomeRoot(LIMIT103_tree, root_1);



                    	    match(input, Token.DOWN, null); 
                    	    _last = (CommonTree)input.LT(1);
                    	    INTEGER104=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_limitOffsetClauses766); 
                    	    INTEGER104_tree = (CommonTree)adaptor.dupNode(INTEGER104);

                    	    adaptor.addChild(root_1, INTEGER104_tree);


                    	    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "limitOffsetClauses"

    public static class bindingsClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingsClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:133:1: bindingsClause : ^( BINDINGS ( var )* ( bindingValueList )* ) ;
    public final SparqlT.bindingsClause_return bindingsClause() throws RecognitionException {
        SparqlT.bindingsClause_return retval = new SparqlT.bindingsClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BINDINGS105=null;
        SparqlT.var_return var106 = null;

        SparqlT.bindingValueList_return bindingValueList107 = null;


        CommonTree BINDINGS105_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:134:5: ( ^( BINDINGS ( var )* ( bindingValueList )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:134:7: ^( BINDINGS ( var )* ( bindingValueList )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BINDINGS105=(CommonTree)match(input,BINDINGS,FOLLOW_BINDINGS_in_bindingsClause788); 
            BINDINGS105_tree = (CommonTree)adaptor.dupNode(BINDINGS105);

            root_1 = (CommonTree)adaptor.becomeRoot(BINDINGS105_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:134:18: ( var )*
                loop43:
                do {
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=VAR1 && LA43_0<=VAR2)) ) {
                        alt43=1;
                    }


                    switch (alt43) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:134:18: var
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_var_in_bindingsClause790);
                	    var106=var();

                	    state._fsp--;

                	    adaptor.addChild(root_1, var106.getTree());

                	    }
                	    break;

                	default :
                	    break loop43;
                    }
                } while (true);

                // com\\googlecode\\sparkleg\\SparqlT.g:134:23: ( bindingValueList )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==BINDING_VALUE) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:134:23: bindingValueList
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bindingValueList_in_bindingsClause793);
                	    bindingValueList107=bindingValueList();

                	    state._fsp--;

                	    adaptor.addChild(root_1, bindingValueList107.getTree());

                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingsClause"

    public static class bindingValueList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingValueList"
    // com\\googlecode\\sparkleg\\SparqlT.g:137:1: bindingValueList : ^( BINDING_VALUE ( bindingValue )* ) ;
    public final SparqlT.bindingValueList_return bindingValueList() throws RecognitionException {
        SparqlT.bindingValueList_return retval = new SparqlT.bindingValueList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BINDING_VALUE108=null;
        SparqlT.bindingValue_return bindingValue109 = null;


        CommonTree BINDING_VALUE108_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:138:5: ( ^( BINDING_VALUE ( bindingValue )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:138:7: ^( BINDING_VALUE ( bindingValue )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BINDING_VALUE108=(CommonTree)match(input,BINDING_VALUE,FOLLOW_BINDING_VALUE_in_bindingValueList817); 
            BINDING_VALUE108_tree = (CommonTree)adaptor.dupNode(BINDING_VALUE108);

            root_1 = (CommonTree)adaptor.becomeRoot(BINDING_VALUE108_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:138:23: ( bindingValue )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==IRI_REF||LA45_0==PNAME_NS||LA45_0==INTEGER||LA45_0==UNDEF||(LA45_0>=DECIMAL && LA45_0<=PNAME_LN)) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:138:23: bindingValue
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_bindingValue_in_bindingValueList819);
                	    bindingValue109=bindingValue();

                	    state._fsp--;

                	    adaptor.addChild(root_1, bindingValue109.getTree());

                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingValueList"

    public static class bindingValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingValue"
    // com\\googlecode\\sparkleg\\SparqlT.g:141:1: bindingValue : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF );
    public final SparqlT.bindingValue_return bindingValue() throws RecognitionException {
        SparqlT.bindingValue_return retval = new SparqlT.bindingValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNDEF114=null;
        SparqlT.iriRef_return iriRef110 = null;

        SparqlT.rdfLiteral_return rdfLiteral111 = null;

        SparqlT.numericLiteral_return numericLiteral112 = null;

        SparqlT.booleanLiteral_return booleanLiteral113 = null;


        CommonTree UNDEF114_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:142:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt46=5;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt46=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt46=2;
                }
                break;
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt46=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt46=4;
                }
                break;
            case UNDEF:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:7: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_bindingValue843);
                    iriRef110=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef110.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:16: rdfLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rdfLiteral_in_bindingValue847);
                    rdfLiteral111=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral111.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:29: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteral_in_bindingValue851);
                    numericLiteral112=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral112.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:46: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue855);
                    booleanLiteral113=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral113.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:142:63: UNDEF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    UNDEF114=(CommonTree)match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue859); 
                    UNDEF114_tree = (CommonTree)adaptor.dupNode(UNDEF114);

                    adaptor.addChild(root_0, UNDEF114_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingValue"

    public static class update_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update"
    // com\\googlecode\\sparkleg\\SparqlT.g:145:1: update : prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* ;
    public final SparqlT.update_return update() throws RecognitionException {
        SparqlT.update_return retval = new SparqlT.update_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.prologue_return prologue115 = null;

        SparqlT.load_return load116 = null;

        SparqlT.clear_return clear117 = null;

        SparqlT.drop_return drop118 = null;

        SparqlT.add_return add119 = null;

        SparqlT.move_return move120 = null;

        SparqlT.copy_return copy121 = null;

        SparqlT.create_return create122 = null;

        SparqlT.insert_return insert123 = null;

        SparqlT.delete_return delete124 = null;

        SparqlT.modify_return modify125 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:146:5: ( prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* )
            // com\\googlecode\\sparkleg\\SparqlT.g:146:7: prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )*
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_prologue_in_update880);
            prologue115=prologue();

            state._fsp--;

            adaptor.addChild(root_0, prologue115.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:146:16: ( load )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==LOAD) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:16: load
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_load_in_update882);
            	    load116=load();

            	    state._fsp--;

            	    adaptor.addChild(root_0, load116.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:22: ( clear )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==CLEAR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:22: clear
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_clear_in_update885);
            	    clear117=clear();

            	    state._fsp--;

            	    adaptor.addChild(root_0, clear117.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:29: ( drop )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==DROP) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:29: drop
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_drop_in_update888);
            	    drop118=drop();

            	    state._fsp--;

            	    adaptor.addChild(root_0, drop118.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:35: ( add )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==ADD) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:35: add
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_add_in_update891);
            	    add119=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add119.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:40: ( move )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==MOVE) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:40: move
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_move_in_update894);
            	    move120=move();

            	    state._fsp--;

            	    adaptor.addChild(root_0, move120.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:46: ( copy )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==COPY) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:46: copy
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_copy_in_update897);
            	    copy121=copy();

            	    state._fsp--;

            	    adaptor.addChild(root_0, copy121.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:52: ( create )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==CREATE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:52: create
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_create_in_update900);
            	    create122=create();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create122.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:60: ( insert )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==INSERT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:60: insert
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_insert_in_update903);
            	    insert123=insert();

            	    state._fsp--;

            	    adaptor.addChild(root_0, insert123.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:68: ( delete )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==DELETE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:68: delete
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_delete_in_update906);
            	    delete124=delete();

            	    state._fsp--;

            	    adaptor.addChild(root_0, delete124.getTree());

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\SparqlT.g:146:76: ( modify )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==MODIFY) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:146:76: modify
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_modify_in_update909);
            	    modify125=modify();

            	    state._fsp--;

            	    adaptor.addChild(root_0, modify125.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update"

    public static class load_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "load"
    // com\\googlecode\\sparkleg\\SparqlT.g:149:1: load : ^( LOAD ( SILENT )* iriRef ( graphRef )* ) ;
    public final SparqlT.load_return load() throws RecognitionException {
        SparqlT.load_return retval = new SparqlT.load_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LOAD126=null;
        CommonTree SILENT127=null;
        SparqlT.iriRef_return iriRef128 = null;

        SparqlT.graphRef_return graphRef129 = null;


        CommonTree LOAD126_tree=null;
        CommonTree SILENT127_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:150:5: ( ^( LOAD ( SILENT )* iriRef ( graphRef )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:150:7: ^( LOAD ( SILENT )* iriRef ( graphRef )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            LOAD126=(CommonTree)match(input,LOAD,FOLLOW_LOAD_in_load939); 
            LOAD126_tree = (CommonTree)adaptor.dupNode(LOAD126);

            root_1 = (CommonTree)adaptor.becomeRoot(LOAD126_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:150:14: ( SILENT )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==SILENT) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:150:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT127=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_load941); 
            	    SILENT127_tree = (CommonTree)adaptor.dupNode(SILENT127);

            	    adaptor.addChild(root_1, SILENT127_tree);


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_load944);
            iriRef128=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef128.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:150:29: ( graphRef )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==GRAPH) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:150:29: graphRef
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_graphRef_in_load946);
            	    graphRef129=graphRef();

            	    state._fsp--;

            	    adaptor.addChild(root_1, graphRef129.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "load"

    public static class clear_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clear"
    // com\\googlecode\\sparkleg\\SparqlT.g:153:1: clear : ^( CLEAR ( SILENT )* graphRefAll ) ;
    public final SparqlT.clear_return clear() throws RecognitionException {
        SparqlT.clear_return retval = new SparqlT.clear_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLEAR130=null;
        CommonTree SILENT131=null;
        SparqlT.graphRefAll_return graphRefAll132 = null;


        CommonTree CLEAR130_tree=null;
        CommonTree SILENT131_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:154:5: ( ^( CLEAR ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:154:7: ^( CLEAR ( SILENT )* graphRefAll )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CLEAR130=(CommonTree)match(input,CLEAR,FOLLOW_CLEAR_in_clear970); 
            CLEAR130_tree = (CommonTree)adaptor.dupNode(CLEAR130);

            root_1 = (CommonTree)adaptor.becomeRoot(CLEAR130_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:154:15: ( SILENT )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==SILENT) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:154:15: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT131=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_clear972); 
            	    SILENT131_tree = (CommonTree)adaptor.dupNode(SILENT131);

            	    adaptor.addChild(root_1, SILENT131_tree);


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphRefAll_in_clear975);
            graphRefAll132=graphRefAll();

            state._fsp--;

            adaptor.addChild(root_1, graphRefAll132.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "clear"

    public static class drop_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop"
    // com\\googlecode\\sparkleg\\SparqlT.g:157:1: drop : ^( DROP ( SILENT )* graphRefAll ) ;
    public final SparqlT.drop_return drop() throws RecognitionException {
        SparqlT.drop_return retval = new SparqlT.drop_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DROP133=null;
        CommonTree SILENT134=null;
        SparqlT.graphRefAll_return graphRefAll135 = null;


        CommonTree DROP133_tree=null;
        CommonTree SILENT134_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:158:5: ( ^( DROP ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:158:7: ^( DROP ( SILENT )* graphRefAll )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DROP133=(CommonTree)match(input,DROP,FOLLOW_DROP_in_drop998); 
            DROP133_tree = (CommonTree)adaptor.dupNode(DROP133);

            root_1 = (CommonTree)adaptor.becomeRoot(DROP133_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:158:14: ( SILENT )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==SILENT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:158:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT134=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_drop1000); 
            	    SILENT134_tree = (CommonTree)adaptor.dupNode(SILENT134);

            	    adaptor.addChild(root_1, SILENT134_tree);


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphRefAll_in_drop1003);
            graphRefAll135=graphRefAll();

            state._fsp--;

            adaptor.addChild(root_1, graphRefAll135.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop"

    public static class create_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create"
    // com\\googlecode\\sparkleg\\SparqlT.g:161:1: create : ^( CREATE ( SILENT )* graphRef ) ;
    public final SparqlT.create_return create() throws RecognitionException {
        SparqlT.create_return retval = new SparqlT.create_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CREATE136=null;
        CommonTree SILENT137=null;
        SparqlT.graphRef_return graphRef138 = null;


        CommonTree CREATE136_tree=null;
        CommonTree SILENT137_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:162:5: ( ^( CREATE ( SILENT )* graphRef ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:162:7: ^( CREATE ( SILENT )* graphRef )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CREATE136=(CommonTree)match(input,CREATE,FOLLOW_CREATE_in_create1023); 
            CREATE136_tree = (CommonTree)adaptor.dupNode(CREATE136);

            root_1 = (CommonTree)adaptor.becomeRoot(CREATE136_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:162:16: ( SILENT )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==SILENT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:162:16: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT137=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_create1025); 
            	    SILENT137_tree = (CommonTree)adaptor.dupNode(SILENT137);

            	    adaptor.addChild(root_1, SILENT137_tree);


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphRef_in_create1028);
            graphRef138=graphRef();

            state._fsp--;

            adaptor.addChild(root_1, graphRef138.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create"

    public static class add_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // com\\googlecode\\sparkleg\\SparqlT.g:165:1: add : ^( ADD ( SILENT )* graphOrDefault graphOrDefault ) ;
    public final SparqlT.add_return add() throws RecognitionException {
        SparqlT.add_return retval = new SparqlT.add_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ADD139=null;
        CommonTree SILENT140=null;
        SparqlT.graphOrDefault_return graphOrDefault141 = null;

        SparqlT.graphOrDefault_return graphOrDefault142 = null;


        CommonTree ADD139_tree=null;
        CommonTree SILENT140_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:166:5: ( ^( ADD ( SILENT )* graphOrDefault graphOrDefault ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:166:7: ^( ADD ( SILENT )* graphOrDefault graphOrDefault )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ADD139=(CommonTree)match(input,ADD,FOLLOW_ADD_in_add1051); 
            ADD139_tree = (CommonTree)adaptor.dupNode(ADD139);

            root_1 = (CommonTree)adaptor.becomeRoot(ADD139_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:166:13: ( SILENT )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==SILENT) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:166:13: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT140=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_add1053); 
            	    SILENT140_tree = (CommonTree)adaptor.dupNode(SILENT140);

            	    adaptor.addChild(root_1, SILENT140_tree);


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_add1056);
            graphOrDefault141=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault141.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_add1058);
            graphOrDefault142=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault142.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class move_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "move"
    // com\\googlecode\\sparkleg\\SparqlT.g:169:1: move : ^( MOVE ( SILENT )* graphOrDefault graphOrDefault ) ;
    public final SparqlT.move_return move() throws RecognitionException {
        SparqlT.move_return retval = new SparqlT.move_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MOVE143=null;
        CommonTree SILENT144=null;
        SparqlT.graphOrDefault_return graphOrDefault145 = null;

        SparqlT.graphOrDefault_return graphOrDefault146 = null;


        CommonTree MOVE143_tree=null;
        CommonTree SILENT144_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:170:5: ( ^( MOVE ( SILENT )* graphOrDefault graphOrDefault ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:170:7: ^( MOVE ( SILENT )* graphOrDefault graphOrDefault )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            MOVE143=(CommonTree)match(input,MOVE,FOLLOW_MOVE_in_move1081); 
            MOVE143_tree = (CommonTree)adaptor.dupNode(MOVE143);

            root_1 = (CommonTree)adaptor.becomeRoot(MOVE143_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:170:14: ( SILENT )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==SILENT) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:170:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT144=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_move1083); 
            	    SILENT144_tree = (CommonTree)adaptor.dupNode(SILENT144);

            	    adaptor.addChild(root_1, SILENT144_tree);


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_move1086);
            graphOrDefault145=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault145.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_move1088);
            graphOrDefault146=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault146.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "move"

    public static class copy_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "copy"
    // com\\googlecode\\sparkleg\\SparqlT.g:173:1: copy : ^( COPY ( SILENT )* graphOrDefault graphOrDefault ) ;
    public final SparqlT.copy_return copy() throws RecognitionException {
        SparqlT.copy_return retval = new SparqlT.copy_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COPY147=null;
        CommonTree SILENT148=null;
        SparqlT.graphOrDefault_return graphOrDefault149 = null;

        SparqlT.graphOrDefault_return graphOrDefault150 = null;


        CommonTree COPY147_tree=null;
        CommonTree SILENT148_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:174:5: ( ^( COPY ( SILENT )* graphOrDefault graphOrDefault ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:174:7: ^( COPY ( SILENT )* graphOrDefault graphOrDefault )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COPY147=(CommonTree)match(input,COPY,FOLLOW_COPY_in_copy1111); 
            COPY147_tree = (CommonTree)adaptor.dupNode(COPY147);

            root_1 = (CommonTree)adaptor.becomeRoot(COPY147_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:174:14: ( SILENT )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==SILENT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:174:14: SILENT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SILENT148=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_copy1113); 
            	    SILENT148_tree = (CommonTree)adaptor.dupNode(SILENT148);

            	    adaptor.addChild(root_1, SILENT148_tree);


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_copy1116);
            graphOrDefault149=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault149.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphOrDefault_in_copy1118);
            graphOrDefault150=graphOrDefault();

            state._fsp--;

            adaptor.addChild(root_1, graphOrDefault150.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "copy"

    public static class insert_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert"
    // com\\googlecode\\sparkleg\\SparqlT.g:177:1: insert : ^( INSERT DATA quadPattern ) ;
    public final SparqlT.insert_return insert() throws RecognitionException {
        SparqlT.insert_return retval = new SparqlT.insert_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT151=null;
        CommonTree DATA152=null;
        SparqlT.quadPattern_return quadPattern153 = null;


        CommonTree INSERT151_tree=null;
        CommonTree DATA152_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:178:5: ( ^( INSERT DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:178:7: ^( INSERT DATA quadPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INSERT151=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insert1137); 
            INSERT151_tree = (CommonTree)adaptor.dupNode(INSERT151);

            root_1 = (CommonTree)adaptor.becomeRoot(INSERT151_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DATA152=(CommonTree)match(input,DATA,FOLLOW_DATA_in_insert1139); 
            DATA152_tree = (CommonTree)adaptor.dupNode(DATA152);

            adaptor.addChild(root_1, DATA152_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_insert1141);
            quadPattern153=quadPattern();

            state._fsp--;

            adaptor.addChild(root_1, quadPattern153.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert"

    public static class delete_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete"
    // com\\googlecode\\sparkleg\\SparqlT.g:181:1: delete : DELETE ( deleteData | deleteWhere ) ;
    public final SparqlT.delete_return delete() throws RecognitionException {
        SparqlT.delete_return retval = new SparqlT.delete_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE154=null;
        SparqlT.deleteData_return deleteData155 = null;

        SparqlT.deleteWhere_return deleteWhere156 = null;


        CommonTree DELETE154_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:182:5: ( DELETE ( deleteData | deleteWhere ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:182:7: DELETE ( deleteData | deleteWhere )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            DELETE154=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_delete1166); 
            DELETE154_tree = (CommonTree)adaptor.dupNode(DELETE154);

            adaptor.addChild(root_0, DELETE154_tree);

            // com\\googlecode\\sparkleg\\SparqlT.g:182:14: ( deleteData | deleteWhere )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==DELETE) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==DOWN) ) {
                    int LA65_2 = input.LA(3);

                    if ( (LA65_2==DATA) ) {
                        alt65=1;
                    }
                    else if ( (LA65_2==WHERE) ) {
                        alt65=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:182:15: deleteData
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_deleteData_in_delete1169);
                    deleteData155=deleteData();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteData155.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:182:28: deleteWhere
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_deleteWhere_in_delete1173);
                    deleteWhere156=deleteWhere();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteWhere156.getTree());

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete"

    public static class deleteData_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deleteData"
    // com\\googlecode\\sparkleg\\SparqlT.g:185:1: deleteData : ^( DELETE DATA quadPattern ) ;
    public final SparqlT.deleteData_return deleteData() throws RecognitionException {
        SparqlT.deleteData_return retval = new SparqlT.deleteData_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE157=null;
        CommonTree DATA158=null;
        SparqlT.quadPattern_return quadPattern159 = null;


        CommonTree DELETE157_tree=null;
        CommonTree DATA158_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:186:5: ( ^( DELETE DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:186:7: ^( DELETE DATA quadPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DELETE157=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_deleteData1192); 
            DELETE157_tree = (CommonTree)adaptor.dupNode(DELETE157);

            root_1 = (CommonTree)adaptor.becomeRoot(DELETE157_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            DATA158=(CommonTree)match(input,DATA,FOLLOW_DATA_in_deleteData1194); 
            DATA158_tree = (CommonTree)adaptor.dupNode(DATA158);

            adaptor.addChild(root_1, DATA158_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_deleteData1196);
            quadPattern159=quadPattern();

            state._fsp--;

            adaptor.addChild(root_1, quadPattern159.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "deleteData"

    public static class deleteWhere_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deleteWhere"
    // com\\googlecode\\sparkleg\\SparqlT.g:189:1: deleteWhere : ^( DELETE WHERE quadPattern ) ;
    public final SparqlT.deleteWhere_return deleteWhere() throws RecognitionException {
        SparqlT.deleteWhere_return retval = new SparqlT.deleteWhere_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE160=null;
        CommonTree WHERE161=null;
        SparqlT.quadPattern_return quadPattern162 = null;


        CommonTree DELETE160_tree=null;
        CommonTree WHERE161_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:190:5: ( ^( DELETE WHERE quadPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:190:7: ^( DELETE WHERE quadPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DELETE160=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_deleteWhere1215); 
            DELETE160_tree = (CommonTree)adaptor.dupNode(DELETE160);

            root_1 = (CommonTree)adaptor.becomeRoot(DELETE160_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            WHERE161=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_deleteWhere1217); 
            WHERE161_tree = (CommonTree)adaptor.dupNode(WHERE161);

            adaptor.addChild(root_1, WHERE161_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_deleteWhere1219);
            quadPattern162=quadPattern();

            state._fsp--;

            adaptor.addChild(root_1, quadPattern162.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "deleteWhere"

    public static class modify_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modify"
    // com\\googlecode\\sparkleg\\SparqlT.g:193:1: modify : ( ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) ) | ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) ) );
    public final SparqlT.modify_return modify() throws RecognitionException {
        SparqlT.modify_return retval = new SparqlT.modify_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MODIFY163=null;
        CommonTree WITH164=null;
        CommonTree WHERE169=null;
        CommonTree MODIFY171=null;
        CommonTree WHERE175=null;
        SparqlT.iriRef_return iriRef165 = null;

        SparqlT.deleteClause_return deleteClause166 = null;

        SparqlT.insertClause_return insertClause167 = null;

        SparqlT.usingClause_return usingClause168 = null;

        SparqlT.groupGraphPattern_return groupGraphPattern170 = null;

        SparqlT.deleteClause_return deleteClause172 = null;

        SparqlT.insertClause_return insertClause173 = null;

        SparqlT.usingClause_return usingClause174 = null;

        SparqlT.groupGraphPattern_return groupGraphPattern176 = null;


        CommonTree MODIFY163_tree=null;
        CommonTree WITH164_tree=null;
        CommonTree WHERE169_tree=null;
        CommonTree MODIFY171_tree=null;
        CommonTree WHERE175_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:194:5: ( ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) ) | ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==MODIFY) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==DOWN) ) {
                    int LA72_2 = input.LA(3);

                    if ( (LA72_2==WITH) ) {
                        alt72=1;
                    }
                    else if ( (LA72_2==WHERE||LA72_2==INSERT||LA72_2==DELETE||LA72_2==USING) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:194:7: ^( MODIFY ^( WITH iriRef ) ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MODIFY163=(CommonTree)match(input,MODIFY,FOLLOW_MODIFY_in_modify1242); 
                    MODIFY163_tree = (CommonTree)adaptor.dupNode(MODIFY163);

                    root_1 = (CommonTree)adaptor.becomeRoot(MODIFY163_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WITH164=(CommonTree)match(input,WITH,FOLLOW_WITH_in_modify1245); 
                    WITH164_tree = (CommonTree)adaptor.dupNode(WITH164);

                    root_2 = (CommonTree)adaptor.becomeRoot(WITH164_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_modify1247);
                    iriRef165=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_2, iriRef165.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    // com\\googlecode\\sparkleg\\SparqlT.g:194:31: ( deleteClause )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==DELETE) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:194:31: deleteClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_deleteClause_in_modify1250);
                    	    deleteClause166=deleteClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, deleteClause166.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:194:45: ( insertClause )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==INSERT) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:194:45: insertClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_insertClause_in_modify1253);
                    	    insertClause167=insertClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, insertClause167.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:194:59: ( usingClause )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==USING) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:194:59: usingClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_usingClause_in_modify1256);
                    	    usingClause168=usingClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, usingClause168.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WHERE169=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_modify1260); 
                    WHERE169_tree = (CommonTree)adaptor.dupNode(WHERE169);

                    root_2 = (CommonTree)adaptor.becomeRoot(WHERE169_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_modify1262);
                    groupGraphPattern170=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_2, groupGraphPattern170.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:195:7: ^( MODIFY ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MODIFY171=(CommonTree)match(input,MODIFY,FOLLOW_MODIFY_in_modify1273); 
                    MODIFY171_tree = (CommonTree)adaptor.dupNode(MODIFY171);

                    root_1 = (CommonTree)adaptor.becomeRoot(MODIFY171_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:195:16: ( deleteClause )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==DELETE) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:195:16: deleteClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_deleteClause_in_modify1275);
                    	    deleteClause172=deleteClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, deleteClause172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:195:30: ( insertClause )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==INSERT) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:195:30: insertClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_insertClause_in_modify1278);
                    	    insertClause173=insertClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, insertClause173.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    // com\\googlecode\\sparkleg\\SparqlT.g:195:44: ( usingClause )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==USING) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:195:44: usingClause
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_usingClause_in_modify1281);
                    	    usingClause174=usingClause();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, usingClause174.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WHERE175=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_modify1285); 
                    WHERE175_tree = (CommonTree)adaptor.dupNode(WHERE175);

                    root_2 = (CommonTree)adaptor.becomeRoot(WHERE175_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_modify1287);
                    groupGraphPattern176=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_2, groupGraphPattern176.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modify"

    public static class deleteClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deleteClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:198:1: deleteClause : DELETE quadPattern ;
    public final SparqlT.deleteClause_return deleteClause() throws RecognitionException {
        SparqlT.deleteClause_return retval = new SparqlT.deleteClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE177=null;
        SparqlT.quadPattern_return quadPattern178 = null;


        CommonTree DELETE177_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:199:5: ( DELETE quadPattern )
            // com\\googlecode\\sparkleg\\SparqlT.g:199:7: DELETE quadPattern
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            DELETE177=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_deleteClause1308); 
            DELETE177_tree = (CommonTree)adaptor.dupNode(DELETE177);

            adaptor.addChild(root_0, DELETE177_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_deleteClause1310);
            quadPattern178=quadPattern();

            state._fsp--;

            adaptor.addChild(root_0, quadPattern178.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "deleteClause"

    public static class insertClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insertClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:202:1: insertClause : INSERT quadPattern ;
    public final SparqlT.insertClause_return insertClause() throws RecognitionException {
        SparqlT.insertClause_return retval = new SparqlT.insertClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT179=null;
        SparqlT.quadPattern_return quadPattern180 = null;


        CommonTree INSERT179_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:203:5: ( INSERT quadPattern )
            // com\\googlecode\\sparkleg\\SparqlT.g:203:7: INSERT quadPattern
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            INSERT179=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insertClause1333); 
            INSERT179_tree = (CommonTree)adaptor.dupNode(INSERT179);

            adaptor.addChild(root_0, INSERT179_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quadPattern_in_insertClause1335);
            quadPattern180=quadPattern();

            state._fsp--;

            adaptor.addChild(root_0, quadPattern180.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insertClause"

    public static class usingClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingClause"
    // com\\googlecode\\sparkleg\\SparqlT.g:206:1: usingClause : ^( USING ( NAMED )? iriRef ) ;
    public final SparqlT.usingClause_return usingClause() throws RecognitionException {
        SparqlT.usingClause_return retval = new SparqlT.usingClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree USING181=null;
        CommonTree NAMED182=null;
        SparqlT.iriRef_return iriRef183 = null;


        CommonTree USING181_tree=null;
        CommonTree NAMED182_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:207:5: ( ^( USING ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:207:7: ^( USING ( NAMED )? iriRef )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            USING181=(CommonTree)match(input,USING,FOLLOW_USING_in_usingClause1353); 
            USING181_tree = (CommonTree)adaptor.dupNode(USING181);

            root_1 = (CommonTree)adaptor.becomeRoot(USING181_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:207:15: ( NAMED )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==NAMED) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:207:15: NAMED
                    {
                    _last = (CommonTree)input.LT(1);
                    NAMED182=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_usingClause1355); 
                    NAMED182_tree = (CommonTree)adaptor.dupNode(NAMED182);

                    adaptor.addChild(root_1, NAMED182_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_usingClause1358);
            iriRef183=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef183.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "usingClause"

    public static class graphOrDefault_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphOrDefault"
    // com\\googlecode\\sparkleg\\SparqlT.g:210:1: graphOrDefault : ( DEFAULT | ( GRAPH )? iriRef );
    public final SparqlT.graphOrDefault_return graphOrDefault() throws RecognitionException {
        SparqlT.graphOrDefault_return retval = new SparqlT.graphOrDefault_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT184=null;
        CommonTree GRAPH185=null;
        SparqlT.iriRef_return iriRef186 = null;


        CommonTree DEFAULT184_tree=null;
        CommonTree GRAPH185_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:211:5: ( DEFAULT | ( GRAPH )? iriRef )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==DEFAULT) ) {
                alt75=1;
            }
            else if ( (LA75_0==IRI_REF||LA75_0==PNAME_NS||LA75_0==GRAPH||LA75_0==PNAME_LN) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:211:7: DEFAULT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFAULT184=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphOrDefault1379); 
                    DEFAULT184_tree = (CommonTree)adaptor.dupNode(DEFAULT184);

                    adaptor.addChild(root_0, DEFAULT184_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:212:7: ( GRAPH )? iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // com\\googlecode\\sparkleg\\SparqlT.g:212:7: ( GRAPH )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==GRAPH) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:212:7: GRAPH
                            {
                            _last = (CommonTree)input.LT(1);
                            GRAPH185=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_graphOrDefault1388); 
                            GRAPH185_tree = (CommonTree)adaptor.dupNode(GRAPH185);

                            adaptor.addChild(root_0, GRAPH185_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_graphOrDefault1391);
                    iriRef186=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef186.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphOrDefault"

    public static class graphRef_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphRef"
    // com\\googlecode\\sparkleg\\SparqlT.g:215:1: graphRef : GRAPH iriRef ;
    public final SparqlT.graphRef_return graphRef() throws RecognitionException {
        SparqlT.graphRef_return retval = new SparqlT.graphRef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAPH187=null;
        SparqlT.iriRef_return iriRef188 = null;


        CommonTree GRAPH187_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:216:5: ( GRAPH iriRef )
            // com\\googlecode\\sparkleg\\SparqlT.g:216:7: GRAPH iriRef
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            GRAPH187=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_graphRef1418); 
            GRAPH187_tree = (CommonTree)adaptor.dupNode(GRAPH187);

            adaptor.addChild(root_0, GRAPH187_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_graphRef1420);
            iriRef188=iriRef();

            state._fsp--;

            adaptor.addChild(root_0, iriRef188.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphRef"

    public static class graphRefAll_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphRefAll"
    // com\\googlecode\\sparkleg\\SparqlT.g:219:1: graphRefAll : ( graphRef | DEFAULT | NAMED | ALL );
    public final SparqlT.graphRefAll_return graphRefAll() throws RecognitionException {
        SparqlT.graphRefAll_return retval = new SparqlT.graphRefAll_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT190=null;
        CommonTree NAMED191=null;
        CommonTree ALL192=null;
        SparqlT.graphRef_return graphRef189 = null;


        CommonTree DEFAULT190_tree=null;
        CommonTree NAMED191_tree=null;
        CommonTree ALL192_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:220:5: ( graphRef | DEFAULT | NAMED | ALL )
            int alt76=4;
            switch ( input.LA(1) ) {
            case GRAPH:
                {
                alt76=1;
                }
                break;
            case DEFAULT:
                {
                alt76=2;
                }
                break;
            case NAMED:
                {
                alt76=3;
                }
                break;
            case ALL:
                {
                alt76=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:7: graphRef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphRef_in_graphRefAll1437);
                    graphRef189=graphRef();

                    state._fsp--;

                    adaptor.addChild(root_0, graphRef189.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:18: DEFAULT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    DEFAULT190=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphRefAll1441); 
                    DEFAULT190_tree = (CommonTree)adaptor.dupNode(DEFAULT190);

                    adaptor.addChild(root_0, DEFAULT190_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:28: NAMED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NAMED191=(CommonTree)match(input,NAMED,FOLLOW_NAMED_in_graphRefAll1445); 
                    NAMED191_tree = (CommonTree)adaptor.dupNode(NAMED191);

                    adaptor.addChild(root_0, NAMED191_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:220:36: ALL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ALL192=(CommonTree)match(input,ALL,FOLLOW_ALL_in_graphRefAll1449); 
                    ALL192_tree = (CommonTree)adaptor.dupNode(ALL192);

                    adaptor.addChild(root_0, ALL192_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphRefAll"

    public static class quadPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quadPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:223:1: quadPattern : quads ;
    public final SparqlT.quadPattern_return quadPattern() throws RecognitionException {
        SparqlT.quadPattern_return retval = new SparqlT.quadPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.quads_return quads193 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:224:5: ( quads )
            // com\\googlecode\\sparkleg\\SparqlT.g:224:7: quads
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_quads_in_quadPattern1466);
            quads193=quads();

            state._fsp--;

            adaptor.addChild(root_0, quads193.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quadPattern"

    public static class quads_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quads"
    // com\\googlecode\\sparkleg\\SparqlT.g:227:1: quads : ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* ;
    public final SparqlT.quads_return quads() throws RecognitionException {
        SparqlT.quads_return retval = new SparqlT.quads_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesTemplate_return triplesTemplate194 = null;

        SparqlT.quadsNotTriples_return quadsNotTriples195 = null;

        SparqlT.triplesTemplate_return triplesTemplate196 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:228:5: ( ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* )
            // com\\googlecode\\sparkleg\\SparqlT.g:228:7: ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:228:7: ( triplesTemplate )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==TRIPLES_TEMPLATE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:228:7: triplesTemplate
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesTemplate_in_quads1487);
                    triplesTemplate194=triplesTemplate();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesTemplate194.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\SparqlT.g:228:24: ( quadsNotTriples ( triplesTemplate )? )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==GRAPH) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:228:25: quadsNotTriples ( triplesTemplate )?
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_quadsNotTriples_in_quads1491);
            	    quadsNotTriples195=quadsNotTriples();

            	    state._fsp--;

            	    adaptor.addChild(root_0, quadsNotTriples195.getTree());
            	    // com\\googlecode\\sparkleg\\SparqlT.g:228:41: ( triplesTemplate )?
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==TRIPLES_TEMPLATE) ) {
            	        alt78=1;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\SparqlT.g:228:41: triplesTemplate
            	            {
            	            _last = (CommonTree)input.LT(1);
            	            pushFollow(FOLLOW_triplesTemplate_in_quads1493);
            	            triplesTemplate196=triplesTemplate();

            	            state._fsp--;

            	            adaptor.addChild(root_0, triplesTemplate196.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quads"

    public static class quadsNotTriples_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quadsNotTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:231:1: quadsNotTriples : ^( GRAPH varOrIRIref ( triplesTemplate )? ) ;
    public final SparqlT.quadsNotTriples_return quadsNotTriples() throws RecognitionException {
        SparqlT.quadsNotTriples_return retval = new SparqlT.quadsNotTriples_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAPH197=null;
        SparqlT.varOrIRIref_return varOrIRIref198 = null;

        SparqlT.triplesTemplate_return triplesTemplate199 = null;


        CommonTree GRAPH197_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:232:5: ( ^( GRAPH varOrIRIref ( triplesTemplate )? ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:232:7: ^( GRAPH varOrIRIref ( triplesTemplate )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GRAPH197=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_quadsNotTriples1518); 
            GRAPH197_tree = (CommonTree)adaptor.dupNode(GRAPH197);

            root_1 = (CommonTree)adaptor.becomeRoot(GRAPH197_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_varOrIRIref_in_quadsNotTriples1520);
            varOrIRIref198=varOrIRIref();

            state._fsp--;

            adaptor.addChild(root_1, varOrIRIref198.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:232:27: ( triplesTemplate )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==TRIPLES_TEMPLATE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:232:27: triplesTemplate
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesTemplate_in_quadsNotTriples1522);
                    triplesTemplate199=triplesTemplate();

                    state._fsp--;

                    adaptor.addChild(root_1, triplesTemplate199.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quadsNotTriples"

    public static class triplesTemplate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesTemplate"
    // com\\googlecode\\sparkleg\\SparqlT.g:235:1: triplesTemplate : ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) ;
    public final SparqlT.triplesTemplate_return triplesTemplate() throws RecognitionException {
        SparqlT.triplesTemplate_return retval = new SparqlT.triplesTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TRIPLES_TEMPLATE200=null;
        SparqlT.triplesSameSubject_return triplesSameSubject201 = null;


        CommonTree TRIPLES_TEMPLATE200_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:236:5: ( ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:236:7: ^( TRIPLES_TEMPLATE ( triplesSameSubject )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TRIPLES_TEMPLATE200=(CommonTree)match(input,TRIPLES_TEMPLATE,FOLLOW_TRIPLES_TEMPLATE_in_triplesTemplate1546); 
            TRIPLES_TEMPLATE200_tree = (CommonTree)adaptor.dupNode(TRIPLES_TEMPLATE200);

            root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_TEMPLATE200_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:236:26: ( triplesSameSubject )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==TRIPLES_SAME_SUBJECT) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // com\\googlecode\\sparkleg\\SparqlT.g:236:26: triplesSameSubject
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate1548);
                	    triplesSameSubject201=triplesSameSubject();

                	    state._fsp--;

                	    adaptor.addChild(root_1, triplesSameSubject201.getTree());

                	    }
                	    break;

                	default :
                	    break loop81;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesTemplate"

    public static class groupGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:239:1: groupGraphPattern : ( ^( GROUP_GRAPH_PATTERN subSelect ) | ^( GROUP_GRAPH_PATTERN groupGraphPatternSub ) );
    public final SparqlT.groupGraphPattern_return groupGraphPattern() throws RecognitionException {
        SparqlT.groupGraphPattern_return retval = new SparqlT.groupGraphPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUP_GRAPH_PATTERN202=null;
        CommonTree GROUP_GRAPH_PATTERN204=null;
        SparqlT.subSelect_return subSelect203 = null;

        SparqlT.groupGraphPatternSub_return groupGraphPatternSub205 = null;


        CommonTree GROUP_GRAPH_PATTERN202_tree=null;
        CommonTree GROUP_GRAPH_PATTERN204_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:240:5: ( ^( GROUP_GRAPH_PATTERN subSelect ) | ^( GROUP_GRAPH_PATTERN groupGraphPatternSub ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==GROUP_GRAPH_PATTERN) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==DOWN) ) {
                    int LA82_2 = input.LA(3);

                    if ( (LA82_2==UP||LA82_2==GROUP_GRAPH_PATTERN||LA82_2==TRIPLES_SAME_SUBJECT||LA82_2==GRAPH||(LA82_2>=OPTIONAL && LA82_2<=FILTER)) ) {
                        alt82=2;
                    }
                    else if ( (LA82_2==SUBSELECT) ) {
                        alt82=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:240:7: ^( GROUP_GRAPH_PATTERN subSelect )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GROUP_GRAPH_PATTERN202=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1573); 
                    GROUP_GRAPH_PATTERN202_tree = (CommonTree)adaptor.dupNode(GROUP_GRAPH_PATTERN202);

                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_GRAPH_PATTERN202_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern1575);
                    subSelect203=subSelect();

                    state._fsp--;

                    adaptor.addChild(root_1, subSelect203.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:241:7: ^( GROUP_GRAPH_PATTERN groupGraphPatternSub )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GROUP_GRAPH_PATTERN204=(CommonTree)match(input,GROUP_GRAPH_PATTERN,FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1585); 
                    GROUP_GRAPH_PATTERN204_tree = (CommonTree)adaptor.dupNode(GROUP_GRAPH_PATTERN204);

                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_GRAPH_PATTERN204_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern1587);
                        groupGraphPatternSub205=groupGraphPatternSub();

                        state._fsp--;

                        adaptor.addChild(root_1, groupGraphPatternSub205.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupGraphPattern"

    public static class groupGraphPatternSub_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupGraphPatternSub"
    // com\\googlecode\\sparkleg\\SparqlT.g:244:1: groupGraphPatternSub : ( triplesBlock )? ( groupGraphPatternSubCache )* ;
    public final SparqlT.groupGraphPatternSub_return groupGraphPatternSub() throws RecognitionException {
        SparqlT.groupGraphPatternSub_return retval = new SparqlT.groupGraphPatternSub_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesBlock_return triplesBlock206 = null;

        SparqlT.groupGraphPatternSubCache_return groupGraphPatternSubCache207 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:245:5: ( ( triplesBlock )? ( groupGraphPatternSubCache )* )
            // com\\googlecode\\sparkleg\\SparqlT.g:245:7: ( triplesBlock )? ( groupGraphPatternSubCache )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:245:7: ( triplesBlock )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==TRIPLES_SAME_SUBJECT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:245:7: triplesBlock
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub1609);
                    triplesBlock206=triplesBlock();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesBlock206.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\SparqlT.g:245:21: ( groupGraphPatternSubCache )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==GROUP_GRAPH_PATTERN||LA84_0==GRAPH||(LA84_0>=OPTIONAL && LA84_0<=FILTER)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:245:21: groupGraphPatternSubCache
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_groupGraphPatternSubCache_in_groupGraphPatternSub1612);
            	    groupGraphPatternSubCache207=groupGraphPatternSubCache();

            	    state._fsp--;

            	    adaptor.addChild(root_0, groupGraphPatternSubCache207.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSub"

    public static class groupGraphPatternSubCache_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupGraphPatternSubCache"
    // com\\googlecode\\sparkleg\\SparqlT.g:248:1: groupGraphPatternSubCache : graphPatternNotTriples ( triplesBlock )? ;
    public final SparqlT.groupGraphPatternSubCache_return groupGraphPatternSubCache() throws RecognitionException {
        SparqlT.groupGraphPatternSubCache_return retval = new SparqlT.groupGraphPatternSubCache_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.graphPatternNotTriples_return graphPatternNotTriples208 = null;

        SparqlT.triplesBlock_return triplesBlock209 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:249:5: ( graphPatternNotTriples ( triplesBlock )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:249:8: graphPatternNotTriples ( triplesBlock )?
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubCache1635);
            graphPatternNotTriples208=graphPatternNotTriples();

            state._fsp--;

            adaptor.addChild(root_0, graphPatternNotTriples208.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:249:31: ( triplesBlock )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==TRIPLES_SAME_SUBJECT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:249:31: triplesBlock
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSubCache1637);
                    triplesBlock209=triplesBlock();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesBlock209.getTree());

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSubCache"

    public static class triplesBlock_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesBlock"
    // com\\googlecode\\sparkleg\\SparqlT.g:252:1: triplesBlock : ( triplesSameSubjectPath )+ ;
    public final SparqlT.triplesBlock_return triplesBlock() throws RecognitionException {
        SparqlT.triplesBlock_return retval = new SparqlT.triplesBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesSameSubjectPath_return triplesSameSubjectPath210 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:253:5: ( ( triplesSameSubjectPath )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:253:7: ( triplesSameSubjectPath )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:253:7: ( triplesSameSubjectPath )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==TRIPLES_SAME_SUBJECT) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:253:7: triplesSameSubjectPath
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock1655);
            	    triplesSameSubjectPath210=triplesSameSubjectPath();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triplesSameSubjectPath210.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesBlock"

    public static class graphPatternNotTriples_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphPatternNotTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:256:1: graphPatternNotTriples : ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind );
    public final SparqlT.graphPatternNotTriples_return graphPatternNotTriples() throws RecognitionException {
        SparqlT.graphPatternNotTriples_return retval = new SparqlT.graphPatternNotTriples_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.groupOrUnionGraphPattern_return groupOrUnionGraphPattern211 = null;

        SparqlT.optionalGraphPattern_return optionalGraphPattern212 = null;

        SparqlT.minusGraphPattern_return minusGraphPattern213 = null;

        SparqlT.graphGraphPattern_return graphGraphPattern214 = null;

        SparqlT.serviceGraphPattern_return serviceGraphPattern215 = null;

        SparqlT.filter_return filter216 = null;

        SparqlT.bind_return bind217 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:257:5: ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind )
            int alt87=7;
            switch ( input.LA(1) ) {
            case GROUP_GRAPH_PATTERN:
            case UNION:
                {
                alt87=1;
                }
                break;
            case OPTIONAL:
                {
                alt87=2;
                }
                break;
            case MINUS_KEYWORD:
                {
                alt87=3;
                }
                break;
            case GRAPH:
                {
                alt87=4;
                }
                break;
            case SERVICE:
                {
                alt87=5;
                }
                break;
            case FILTER:
                {
                alt87=6;
                }
                break;
            case BIND:
                {
                alt87=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:7: groupOrUnionGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples1673);
                    groupOrUnionGraphPattern211=groupOrUnionGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, groupOrUnionGraphPattern211.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:34: optionalGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples1677);
                    optionalGraphPattern212=optionalGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, optionalGraphPattern212.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:57: minusGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_minusGraphPattern_in_graphPatternNotTriples1681);
                    minusGraphPattern213=minusGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, minusGraphPattern213.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:77: graphGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples1685);
                    graphGraphPattern214=graphGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, graphGraphPattern214.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:97: serviceGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNotTriples1689);
                    serviceGraphPattern215=serviceGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, serviceGraphPattern215.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:119: filter
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_filter_in_graphPatternNotTriples1693);
                    filter216=filter();

                    state._fsp--;

                    adaptor.addChild(root_0, filter216.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:257:128: bind
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bind_in_graphPatternNotTriples1697);
                    bind217=bind();

                    state._fsp--;

                    adaptor.addChild(root_0, bind217.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphPatternNotTriples"

    public static class optionalGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionalGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:260:1: optionalGraphPattern : ^( OPTIONAL groupGraphPattern ) ;
    public final SparqlT.optionalGraphPattern_return optionalGraphPattern() throws RecognitionException {
        SparqlT.optionalGraphPattern_return retval = new SparqlT.optionalGraphPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPTIONAL218=null;
        SparqlT.groupGraphPattern_return groupGraphPattern219 = null;


        CommonTree OPTIONAL218_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:261:5: ( ^( OPTIONAL groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:261:7: ^( OPTIONAL groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            OPTIONAL218=(CommonTree)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern1715); 
            OPTIONAL218_tree = (CommonTree)adaptor.dupNode(OPTIONAL218);

            root_1 = (CommonTree)adaptor.becomeRoot(OPTIONAL218_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern1717);
            groupGraphPattern219=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern219.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionalGraphPattern"

    public static class graphGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:264:1: graphGraphPattern : ^( GRAPH varOrIRIref groupGraphPattern ) ;
    public final SparqlT.graphGraphPattern_return graphGraphPattern() throws RecognitionException {
        SparqlT.graphGraphPattern_return retval = new SparqlT.graphGraphPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GRAPH220=null;
        SparqlT.varOrIRIref_return varOrIRIref221 = null;

        SparqlT.groupGraphPattern_return groupGraphPattern222 = null;


        CommonTree GRAPH220_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:265:5: ( ^( GRAPH varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:265:7: ^( GRAPH varOrIRIref groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GRAPH220=(CommonTree)match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern1736); 
            GRAPH220_tree = (CommonTree)adaptor.dupNode(GRAPH220);

            root_1 = (CommonTree)adaptor.becomeRoot(GRAPH220_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_varOrIRIref_in_graphGraphPattern1738);
            varOrIRIref221=varOrIRIref();

            state._fsp--;

            adaptor.addChild(root_1, varOrIRIref221.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern1740);
            groupGraphPattern222=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern222.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphGraphPattern"

    public static class serviceGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "serviceGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:268:1: serviceGraphPattern : ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) ;
    public final SparqlT.serviceGraphPattern_return serviceGraphPattern() throws RecognitionException {
        SparqlT.serviceGraphPattern_return retval = new SparqlT.serviceGraphPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SERVICE223=null;
        CommonTree SILENT224=null;
        SparqlT.varOrIRIref_return varOrIRIref225 = null;

        SparqlT.groupGraphPattern_return groupGraphPattern226 = null;


        CommonTree SERVICE223_tree=null;
        CommonTree SILENT224_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:269:5: ( ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:269:7: ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SERVICE223=(CommonTree)match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern1759); 
            SERVICE223_tree = (CommonTree)adaptor.dupNode(SERVICE223);

            root_1 = (CommonTree)adaptor.becomeRoot(SERVICE223_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:269:17: ( SILENT )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==SILENT) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:269:17: SILENT
                    {
                    _last = (CommonTree)input.LT(1);
                    SILENT224=(CommonTree)match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern1761); 
                    SILENT224_tree = (CommonTree)adaptor.dupNode(SILENT224);

                    adaptor.addChild(root_1, SILENT224_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern1764);
            varOrIRIref225=varOrIRIref();

            state._fsp--;

            adaptor.addChild(root_1, varOrIRIref225.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern1766);
            groupGraphPattern226=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern226.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "serviceGraphPattern"

    public static class bind_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bind"
    // com\\googlecode\\sparkleg\\SparqlT.g:272:1: bind : ^( BIND expression ^( AS var ) ) ;
    public final SparqlT.bind_return bind() throws RecognitionException {
        SparqlT.bind_return retval = new SparqlT.bind_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BIND227=null;
        CommonTree AS229=null;
        SparqlT.expression_return expression228 = null;

        SparqlT.var_return var230 = null;


        CommonTree BIND227_tree=null;
        CommonTree AS229_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:273:5: ( ^( BIND expression ^( AS var ) ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:273:7: ^( BIND expression ^( AS var ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BIND227=(CommonTree)match(input,BIND,FOLLOW_BIND_in_bind1789); 
            BIND227_tree = (CommonTree)adaptor.dupNode(BIND227);

            root_1 = (CommonTree)adaptor.becomeRoot(BIND227_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_bind1791);
            expression228=expression();

            state._fsp--;

            adaptor.addChild(root_1, expression228.getTree());
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AS229=(CommonTree)match(input,AS,FOLLOW_AS_in_bind1794); 
            AS229_tree = (CommonTree)adaptor.dupNode(AS229);

            root_2 = (CommonTree)adaptor.becomeRoot(AS229_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_var_in_bind1796);
            var230=var();

            state._fsp--;

            adaptor.addChild(root_2, var230.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bind"

    public static class minusGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minusGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:276:1: minusGraphPattern : ^( MINUS_KEYWORD groupGraphPattern ) ;
    public final SparqlT.minusGraphPattern_return minusGraphPattern() throws RecognitionException {
        SparqlT.minusGraphPattern_return retval = new SparqlT.minusGraphPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MINUS_KEYWORD231=null;
        SparqlT.groupGraphPattern_return groupGraphPattern232 = null;


        CommonTree MINUS_KEYWORD231_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:277:5: ( ^( MINUS_KEYWORD groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:277:7: ^( MINUS_KEYWORD groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            MINUS_KEYWORD231=(CommonTree)match(input,MINUS_KEYWORD,FOLLOW_MINUS_KEYWORD_in_minusGraphPattern1822); 
            MINUS_KEYWORD231_tree = (CommonTree)adaptor.dupNode(MINUS_KEYWORD231);

            root_1 = (CommonTree)adaptor.becomeRoot(MINUS_KEYWORD231_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_minusGraphPattern1824);
            groupGraphPattern232=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern232.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "minusGraphPattern"

    public static class groupOrUnionGraphPattern_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupOrUnionGraphPattern"
    // com\\googlecode\\sparkleg\\SparqlT.g:280:1: groupOrUnionGraphPattern : ( ^( UNION groupGraphPattern groupGraphPattern ) | groupGraphPattern );
    public final SparqlT.groupOrUnionGraphPattern_return groupOrUnionGraphPattern() throws RecognitionException {
        SparqlT.groupOrUnionGraphPattern_return retval = new SparqlT.groupOrUnionGraphPattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNION233=null;
        SparqlT.groupGraphPattern_return groupGraphPattern234 = null;

        SparqlT.groupGraphPattern_return groupGraphPattern235 = null;

        SparqlT.groupGraphPattern_return groupGraphPattern236 = null;


        CommonTree UNION233_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:281:5: ( ^( UNION groupGraphPattern groupGraphPattern ) | groupGraphPattern )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==UNION) ) {
                alt89=1;
            }
            else if ( (LA89_0==GROUP_GRAPH_PATTERN) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:281:7: ^( UNION groupGraphPattern groupGraphPattern )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNION233=(CommonTree)match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern1843); 
                    UNION233_tree = (CommonTree)adaptor.dupNode(UNION233);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNION233_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1845);
                    groupGraphPattern234=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_1, groupGraphPattern234.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1847);
                    groupGraphPattern235=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_1, groupGraphPattern235.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:282:7: groupGraphPattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1856);
                    groupGraphPattern236=groupGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, groupGraphPattern236.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupOrUnionGraphPattern"

    public static class filter_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "filter"
    // com\\googlecode\\sparkleg\\SparqlT.g:285:1: filter : ^( FILTER constraint ) ;
    public final SparqlT.filter_return filter() throws RecognitionException {
        SparqlT.filter_return retval = new SparqlT.filter_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FILTER237=null;
        SparqlT.constraint_return constraint238 = null;


        CommonTree FILTER237_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:286:5: ( ^( FILTER constraint ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:286:7: ^( FILTER constraint )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FILTER237=(CommonTree)match(input,FILTER,FOLLOW_FILTER_in_filter1874); 
            FILTER237_tree = (CommonTree)adaptor.dupNode(FILTER237);

            root_1 = (CommonTree)adaptor.becomeRoot(FILTER237_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_constraint_in_filter1876);
            constraint238=constraint();

            state._fsp--;

            adaptor.addChild(root_1, constraint238.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "filter"

    public static class constraint_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraint"
    // com\\googlecode\\sparkleg\\SparqlT.g:289:1: constraint : ( expression | builtInCall | functionCall );
    public final SparqlT.constraint_return constraint() throws RecognitionException {
        SparqlT.constraint_return retval = new SparqlT.constraint_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.expression_return expression239 = null;

        SparqlT.builtInCall_return builtInCall240 = null;

        SparqlT.functionCall_return functionCall241 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:290:5: ( expression | builtInCall | functionCall )
            int alt90=3;
            switch ( input.LA(1) ) {
            case UNARY_NOT:
            case UNARY_PLUS:
            case UNARY_MINUS:
            case UNARY:
            case ASTERISK:
            case DIVIDE:
            case PLUS:
            case OR:
            case AND:
            case EQUAL:
            case NOT_EQUAL:
            case LESS:
            case GREATER:
            case LESS_EQUAL:
            case GREATER_EQUAL:
            case IN:
            case NOT:
            case MINUS:
                {
                alt90=1;
                }
                break;
            case NOT_EXISTS:
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case IRI:
            case URI:
            case BNODE:
            case RAND:
            case ABS:
            case CEIL:
            case FLOOR:
            case ROUND:
            case CONCAT:
            case STRLEN:
            case UCASE:
            case LCASE:
            case ENCODE_FOR_URI:
            case CONTAINS:
            case STRSTARTS:
            case STRENDS:
            case YEAR:
            case MONTH:
            case DAY:
            case HOURS:
            case MINUTES:
            case SECONDS:
            case TIMEZONE:
            case TZ:
            case NOW:
            case MD5:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case COALESCE:
            case IF:
            case STRLANG:
            case STRDT:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case ISNUMERIC:
            case REGEX:
            case SUBSTR:
            case EXISTS:
                {
                alt90=2;
                }
                break;
            case FUNCTION:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:290:7: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_constraint1894);
                    expression239=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression239.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:291:7: builtInCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_builtInCall_in_constraint1902);
                    builtInCall240=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall240.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:292:7: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_constraint1910);
                    functionCall241=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall241.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraint"

    public static class functionCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // com\\googlecode\\sparkleg\\SparqlT.g:295:1: functionCall : ^( FUNCTION iriRef ^( ARG_LIST argList ) ) ;
    public final SparqlT.functionCall_return functionCall() throws RecognitionException {
        SparqlT.functionCall_return retval = new SparqlT.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION242=null;
        CommonTree ARG_LIST244=null;
        SparqlT.iriRef_return iriRef243 = null;

        SparqlT.argList_return argList245 = null;


        CommonTree FUNCTION242_tree=null;
        CommonTree ARG_LIST244_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:296:5: ( ^( FUNCTION iriRef ^( ARG_LIST argList ) ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:296:7: ^( FUNCTION iriRef ^( ARG_LIST argList ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FUNCTION242=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionCall1928); 
            FUNCTION242_tree = (CommonTree)adaptor.dupNode(FUNCTION242);

            root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION242_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_iriRef_in_functionCall1930);
            iriRef243=iriRef();

            state._fsp--;

            adaptor.addChild(root_1, iriRef243.getTree());
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ARG_LIST244=(CommonTree)match(input,ARG_LIST,FOLLOW_ARG_LIST_in_functionCall1933); 
            ARG_LIST244_tree = (CommonTree)adaptor.dupNode(ARG_LIST244);

            root_2 = (CommonTree)adaptor.becomeRoot(ARG_LIST244_tree, root_2);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                _last = (CommonTree)input.LT(1);
                pushFollow(FOLLOW_argList_in_functionCall1935);
                argList245=argList();

                state._fsp--;

                adaptor.addChild(root_2, argList245.getTree());

                match(input, Token.UP, null); 
            }adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class argList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argList"
    // com\\googlecode\\sparkleg\\SparqlT.g:299:1: argList : ( nil | ( DISTINCT )? ( expression )* );
    public final SparqlT.argList_return argList() throws RecognitionException {
        SparqlT.argList_return retval = new SparqlT.argList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTINCT247=null;
        SparqlT.nil_return nil246 = null;

        SparqlT.expression_return expression248 = null;


        CommonTree DISTINCT247_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:300:5: ( nil | ( DISTINCT )? ( expression )* )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==OPEN_BRACE) ) {
                alt93=1;
            }
            else if ( (LA93_0==UP||(LA93_0>=UNARY_NOT && LA93_0<=UNARY)||LA93_0==DISTINCT||LA93_0==ASTERISK||LA93_0==DIVIDE||LA93_0==PLUS||(LA93_0>=OR && LA93_0<=MINUS)) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:300:7: nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nil_in_argList1954);
                    nil246=nil();

                    state._fsp--;

                    adaptor.addChild(root_0, nil246.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:301:7: ( DISTINCT )? ( expression )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // com\\googlecode\\sparkleg\\SparqlT.g:301:7: ( DISTINCT )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==DISTINCT) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:301:7: DISTINCT
                            {
                            _last = (CommonTree)input.LT(1);
                            DISTINCT247=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_argList1962); 
                            DISTINCT247_tree = (CommonTree)adaptor.dupNode(DISTINCT247);

                            adaptor.addChild(root_0, DISTINCT247_tree);


                            }
                            break;

                    }

                    // com\\googlecode\\sparkleg\\SparqlT.g:301:17: ( expression )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( ((LA92_0>=UNARY_NOT && LA92_0<=UNARY)||LA92_0==ASTERISK||LA92_0==DIVIDE||LA92_0==PLUS||(LA92_0>=OR && LA92_0<=MINUS)) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:301:17: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_argList1965);
                    	    expression248=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression248.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argList"

    public static class expressionList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // com\\googlecode\\sparkleg\\SparqlT.g:304:1: expressionList : ( ^( EXPRESSION_LIST ( expression )+ ) | ^( EXPRESSION_LIST nil ) );
    public final SparqlT.expressionList_return expressionList() throws RecognitionException {
        SparqlT.expressionList_return retval = new SparqlT.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPRESSION_LIST249=null;
        CommonTree EXPRESSION_LIST251=null;
        SparqlT.expression_return expression250 = null;

        SparqlT.nil_return nil252 = null;


        CommonTree EXPRESSION_LIST249_tree=null;
        CommonTree EXPRESSION_LIST251_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:305:5: ( ^( EXPRESSION_LIST ( expression )+ ) | ^( EXPRESSION_LIST nil ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==EXPRESSION_LIST) ) {
                int LA95_1 = input.LA(2);

                if ( (LA95_1==DOWN) ) {
                    int LA95_2 = input.LA(3);

                    if ( (LA95_2==OPEN_BRACE) ) {
                        alt95=2;
                    }
                    else if ( ((LA95_2>=UNARY_NOT && LA95_2<=UNARY)||LA95_2==ASTERISK||LA95_2==DIVIDE||LA95_2==PLUS||(LA95_2>=OR && LA95_2<=MINUS)) ) {
                        alt95=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:305:7: ^( EXPRESSION_LIST ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EXPRESSION_LIST249=(CommonTree)match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList1984); 
                    EXPRESSION_LIST249_tree = (CommonTree)adaptor.dupNode(EXPRESSION_LIST249);

                    root_1 = (CommonTree)adaptor.becomeRoot(EXPRESSION_LIST249_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:305:25: ( expression )+
                    int cnt94=0;
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( ((LA94_0>=UNARY_NOT && LA94_0<=UNARY)||LA94_0==ASTERISK||LA94_0==DIVIDE||LA94_0==PLUS||(LA94_0>=OR && LA94_0<=MINUS)) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:305:25: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_expressionList1986);
                    	    expression250=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expression250.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt94 >= 1 ) break loop94;
                                EarlyExitException eee =
                                    new EarlyExitException(94, input);
                                throw eee;
                        }
                        cnt94++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:306:7: ^( EXPRESSION_LIST nil )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EXPRESSION_LIST251=(CommonTree)match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList1997); 
                    EXPRESSION_LIST251_tree = (CommonTree)adaptor.dupNode(EXPRESSION_LIST251);

                    root_1 = (CommonTree)adaptor.becomeRoot(EXPRESSION_LIST251_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nil_in_expressionList1999);
                    nil252=nil();

                    state._fsp--;

                    adaptor.addChild(root_1, nil252.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class constructTemplate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructTemplate"
    // com\\googlecode\\sparkleg\\SparqlT.g:309:1: constructTemplate : ^( CONSTRUCT_TRIPLES ( constructTriples )? ) ;
    public final SparqlT.constructTemplate_return constructTemplate() throws RecognitionException {
        SparqlT.constructTemplate_return retval = new SparqlT.constructTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONSTRUCT_TRIPLES253=null;
        SparqlT.constructTriples_return constructTriples254 = null;


        CommonTree CONSTRUCT_TRIPLES253_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:310:5: ( ^( CONSTRUCT_TRIPLES ( constructTriples )? ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:310:7: ^( CONSTRUCT_TRIPLES ( constructTriples )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CONSTRUCT_TRIPLES253=(CommonTree)match(input,CONSTRUCT_TRIPLES,FOLLOW_CONSTRUCT_TRIPLES_in_constructTemplate2019); 
            CONSTRUCT_TRIPLES253_tree = (CommonTree)adaptor.dupNode(CONSTRUCT_TRIPLES253);

            root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCT_TRIPLES253_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // com\\googlecode\\sparkleg\\SparqlT.g:310:27: ( constructTriples )?
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==TRIPLES_SAME_SUBJECT) ) {
                    alt96=1;
                }
                switch (alt96) {
                    case 1 :
                        // com\\googlecode\\sparkleg\\SparqlT.g:310:27: constructTriples
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_constructTriples_in_constructTemplate2021);
                        constructTriples254=constructTriples();

                        state._fsp--;

                        adaptor.addChild(root_1, constructTriples254.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructTemplate"

    public static class constructTriples_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructTriples"
    // com\\googlecode\\sparkleg\\SparqlT.g:313:1: constructTriples : ( triplesSameSubject )+ ;
    public final SparqlT.constructTriples_return constructTriples() throws RecognitionException {
        SparqlT.constructTriples_return retval = new SparqlT.constructTriples_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.triplesSameSubject_return triplesSameSubject255 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:314:5: ( ( triplesSameSubject )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:314:7: ( triplesSameSubject )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:314:7: ( triplesSameSubject )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==TRIPLES_SAME_SUBJECT) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:314:7: triplesSameSubject
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_triplesSameSubject_in_constructTriples2040);
            	    triplesSameSubject255=triplesSameSubject();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triplesSameSubject255.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructTriples"

    public static class triplesSameSubject_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesSameSubject"
    // com\\googlecode\\sparkleg\\SparqlT.g:317:1: triplesSameSubject : ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) );
    public final SparqlT.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        SparqlT.triplesSameSubject_return retval = new SparqlT.triplesSameSubject_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TRIPLES_SAME_SUBJECT256=null;
        CommonTree SUBJECT257=null;
        CommonTree TRIPLES_SAME_SUBJECT260=null;
        CommonTree SUBJECT262=null;
        CommonTree BLANK_NODE263=null;
        SparqlT.varOrTerm_return varOrTerm258 = null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty259 = null;

        SparqlT.triplesNode_return triplesNode261 = null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty264 = null;


        CommonTree TRIPLES_SAME_SUBJECT256_tree=null;
        CommonTree SUBJECT257_tree=null;
        CommonTree TRIPLES_SAME_SUBJECT260_tree=null;
        CommonTree SUBJECT262_tree=null;
        CommonTree BLANK_NODE263_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:318:5: ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==TRIPLES_SAME_SUBJECT) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==DOWN) ) {
                    int LA99_2 = input.LA(3);

                    if ( (LA99_2==SUBJECT) ) {
                        alt99=1;
                    }
                    else if ( ((LA99_2>=TRIPLES_NODE && LA99_2<=COLLECTION)) ) {
                        alt99=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:318:7: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT256=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2059); 
                    TRIPLES_SAME_SUBJECT256_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT256);

                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT256_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUBJECT257=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubject2062); 
                    SUBJECT257_tree = (CommonTree)adaptor.dupNode(SUBJECT257);

                    root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT257_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject2064);
                    varOrTerm258=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_2, varOrTerm258.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2067);
                    propertyListNotEmpty259=propertyListNotEmpty();

                    state._fsp--;

                    adaptor.addChild(root_1, propertyListNotEmpty259.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:319:7: ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT260=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2077); 
                    TRIPLES_SAME_SUBJECT260_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT260);

                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT260_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject2079);
                    triplesNode261=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_1, triplesNode261.getTree());
                    // com\\googlecode\\sparkleg\\SparqlT.g:319:42: ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==SUBJECT) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:319:43: ^( SUBJECT BLANK_NODE ) propertyListNotEmpty
                            {
                            _last = (CommonTree)input.LT(1);
                            {
                            CommonTree _save_last_2 = _last;
                            CommonTree _first_2 = null;
                            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                            SUBJECT262=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubject2083); 
                            SUBJECT262_tree = (CommonTree)adaptor.dupNode(SUBJECT262);

                            root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT262_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (CommonTree)input.LT(1);
                            BLANK_NODE263=(CommonTree)match(input,BLANK_NODE,FOLLOW_BLANK_NODE_in_triplesSameSubject2085); 
                            BLANK_NODE263_tree = (CommonTree)adaptor.dupNode(BLANK_NODE263);

                            adaptor.addChild(root_2, BLANK_NODE263_tree);


                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }

                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2088);
                            propertyListNotEmpty264=propertyListNotEmpty();

                            state._fsp--;

                            adaptor.addChild(root_1, propertyListNotEmpty264.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubject"

    public static class propertyListNotEmpty_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyListNotEmpty"
    // com\\googlecode\\sparkleg\\SparqlT.g:322:1: propertyListNotEmpty : ( ^( PREDICATE verb ) objectList )+ ;
    public final SparqlT.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        SparqlT.propertyListNotEmpty_return retval = new SparqlT.propertyListNotEmpty_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PREDICATE265=null;
        SparqlT.verb_return verb266 = null;

        SparqlT.objectList_return objectList267 = null;


        CommonTree PREDICATE265_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:323:5: ( ( ^( PREDICATE verb ) objectList )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:323:7: ( ^( PREDICATE verb ) objectList )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:323:7: ( ^( PREDICATE verb ) objectList )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==PREDICATE) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:323:8: ^( PREDICATE verb ) objectList
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            	    PREDICATE265=(CommonTree)match(input,PREDICATE,FOLLOW_PREDICATE_in_propertyListNotEmpty2114); 
            	    PREDICATE265_tree = (CommonTree)adaptor.dupNode(PREDICATE265);

            	    root_1 = (CommonTree)adaptor.becomeRoot(PREDICATE265_tree, root_1);



            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_verb_in_propertyListNotEmpty2116);
            	    verb266=verb();

            	    state._fsp--;

            	    adaptor.addChild(root_1, verb266.getTree());

            	    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            	    }

            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_objectList_in_propertyListNotEmpty2120);
            	    objectList267=objectList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, objectList267.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmpty"

    public static class objectList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectList"
    // com\\googlecode\\sparkleg\\SparqlT.g:326:1: objectList : ( ^( OBJECT graphNode ) )+ ;
    public final SparqlT.objectList_return objectList() throws RecognitionException {
        SparqlT.objectList_return retval = new SparqlT.objectList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OBJECT268=null;
        SparqlT.graphNode_return graphNode269 = null;


        CommonTree OBJECT268_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:327:5: ( ( ^( OBJECT graphNode ) )+ )
            // com\\googlecode\\sparkleg\\SparqlT.g:327:7: ( ^( OBJECT graphNode ) )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:327:7: ( ^( OBJECT graphNode ) )+
            int cnt101=0;
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==OBJECT) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:327:8: ^( OBJECT graphNode )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_1 = _last;
            	    CommonTree _first_1 = null;
            	    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            	    OBJECT268=(CommonTree)match(input,OBJECT,FOLLOW_OBJECT_in_objectList2141); 
            	    OBJECT268_tree = (CommonTree)adaptor.dupNode(OBJECT268);

            	    root_1 = (CommonTree)adaptor.becomeRoot(OBJECT268_tree, root_1);



            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_graphNode_in_objectList2143);
            	    graphNode269=graphNode();

            	    state._fsp--;

            	    adaptor.addChild(root_1, graphNode269.getTree());

            	    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt101 >= 1 ) break loop101;
                        EarlyExitException eee =
                            new EarlyExitException(101, input);
                        throw eee;
                }
                cnt101++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectList"

    public static class verb_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verb"
    // com\\googlecode\\sparkleg\\SparqlT.g:330:1: verb : ( varOrIRIref | A | path );
    public final SparqlT.verb_return verb() throws RecognitionException {
        SparqlT.verb_return retval = new SparqlT.verb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree A271=null;
        SparqlT.varOrIRIref_return varOrIRIref270 = null;

        SparqlT.path_return path272 = null;


        CommonTree A271_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:331:5: ( varOrIRIref | A | path )
            int alt102=3;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case VAR1:
            case VAR2:
            case PNAME_LN:
                {
                alt102=1;
                }
                break;
            case A:
                {
                alt102=2;
                }
                break;
            case PATH:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:331:7: varOrIRIref
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrIRIref_in_verb2163);
                    varOrIRIref270=varOrIRIref();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrIRIref270.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:332:7: A
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    A271=(CommonTree)match(input,A,FOLLOW_A_in_verb2171); 
                    A271_tree = (CommonTree)adaptor.dupNode(A271);

                    adaptor.addChild(root_0, A271_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:333:7: path
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_path_in_verb2179);
                    path272=path();

                    state._fsp--;

                    adaptor.addChild(root_0, path272.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verb"

    public static class triplesSameSubjectPath_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesSameSubjectPath"
    // com\\googlecode\\sparkleg\\SparqlT.g:336:1: triplesSameSubjectPath : ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) );
    public final SparqlT.triplesSameSubjectPath_return triplesSameSubjectPath() throws RecognitionException {
        SparqlT.triplesSameSubjectPath_return retval = new SparqlT.triplesSameSubjectPath_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TRIPLES_SAME_SUBJECT273=null;
        CommonTree SUBJECT274=null;
        CommonTree TRIPLES_SAME_SUBJECT277=null;
        CommonTree SUBJECT279=null;
        CommonTree BLANK_NODE280=null;
        SparqlT.varOrTerm_return varOrTerm275 = null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty276 = null;

        SparqlT.triplesNode_return triplesNode278 = null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty281 = null;


        CommonTree TRIPLES_SAME_SUBJECT273_tree=null;
        CommonTree SUBJECT274_tree=null;
        CommonTree TRIPLES_SAME_SUBJECT277_tree=null;
        CommonTree SUBJECT279_tree=null;
        CommonTree BLANK_NODE280_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:337:5: ( ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==TRIPLES_SAME_SUBJECT) ) {
                int LA104_1 = input.LA(2);

                if ( (LA104_1==DOWN) ) {
                    int LA104_2 = input.LA(3);

                    if ( (LA104_2==SUBJECT) ) {
                        alt104=1;
                    }
                    else if ( ((LA104_2>=TRIPLES_NODE && LA104_2<=COLLECTION)) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 104, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:337:7: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT273=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2197); 
                    TRIPLES_SAME_SUBJECT273_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT273);

                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT273_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUBJECT274=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubjectPath2200); 
                    SUBJECT274_tree = (CommonTree)adaptor.dupNode(SUBJECT274);

                    root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT274_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubjectPath2202);
                    varOrTerm275=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_2, varOrTerm275.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2205);
                    propertyListNotEmpty276=propertyListNotEmpty();

                    state._fsp--;

                    adaptor.addChild(root_1, propertyListNotEmpty276.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:338:7: ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TRIPLES_SAME_SUBJECT277=(CommonTree)match(input,TRIPLES_SAME_SUBJECT,FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2215); 
                    TRIPLES_SAME_SUBJECT277_tree = (CommonTree)adaptor.dupNode(TRIPLES_SAME_SUBJECT277);

                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_SAME_SUBJECT277_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubjectPath2218);
                    triplesNode278=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_1, triplesNode278.getTree());
                    // com\\googlecode\\sparkleg\\SparqlT.g:338:43: ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==SUBJECT) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:338:44: ^( SUBJECT BLANK_NODE ) propertyListNotEmpty
                            {
                            _last = (CommonTree)input.LT(1);
                            {
                            CommonTree _save_last_2 = _last;
                            CommonTree _first_2 = null;
                            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                            SUBJECT279=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesSameSubjectPath2222); 
                            SUBJECT279_tree = (CommonTree)adaptor.dupNode(SUBJECT279);

                            root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT279_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (CommonTree)input.LT(1);
                            BLANK_NODE280=(CommonTree)match(input,BLANK_NODE,FOLLOW_BLANK_NODE_in_triplesSameSubjectPath2224); 
                            BLANK_NODE280_tree = (CommonTree)adaptor.dupNode(BLANK_NODE280);

                            adaptor.addChild(root_2, BLANK_NODE280_tree);


                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }

                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2227);
                            propertyListNotEmpty281=propertyListNotEmpty();

                            state._fsp--;

                            adaptor.addChild(root_1, propertyListNotEmpty281.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubjectPath"

    public static class path_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "path"
    // com\\googlecode\\sparkleg\\SparqlT.g:341:1: path : ^( PATH ( pathSequence )+ ) ;
    public final SparqlT.path_return path() throws RecognitionException {
        SparqlT.path_return retval = new SparqlT.path_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH282=null;
        SparqlT.pathSequence_return pathSequence283 = null;


        CommonTree PATH282_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:342:5: ( ^( PATH ( pathSequence )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:342:7: ^( PATH ( pathSequence )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATH282=(CommonTree)match(input,PATH,FOLLOW_PATH_in_path2252); 
            PATH282_tree = (CommonTree)adaptor.dupNode(PATH282);

            root_1 = (CommonTree)adaptor.becomeRoot(PATH282_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:342:14: ( pathSequence )+
            int cnt105=0;
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==PATH_SEQUENCE) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:342:14: pathSequence
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_pathSequence_in_path2254);
            	    pathSequence283=pathSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_1, pathSequence283.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt105 >= 1 ) break loop105;
                        EarlyExitException eee =
                            new EarlyExitException(105, input);
                        throw eee;
                }
                cnt105++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "path"

    public static class pathSequence_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathSequence"
    // com\\googlecode\\sparkleg\\SparqlT.g:345:1: pathSequence : ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) ;
    public final SparqlT.pathSequence_return pathSequence() throws RecognitionException {
        SparqlT.pathSequence_return retval = new SparqlT.pathSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH_SEQUENCE284=null;
        SparqlT.pathEltOrInverse_return pathEltOrInverse285 = null;


        CommonTree PATH_SEQUENCE284_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:346:5: ( ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:346:7: ^( PATH_SEQUENCE ( pathEltOrInverse )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATH_SEQUENCE284=(CommonTree)match(input,PATH_SEQUENCE,FOLLOW_PATH_SEQUENCE_in_pathSequence2275); 
            PATH_SEQUENCE284_tree = (CommonTree)adaptor.dupNode(PATH_SEQUENCE284);

            root_1 = (CommonTree)adaptor.becomeRoot(PATH_SEQUENCE284_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:346:23: ( pathEltOrInverse )+
            int cnt106=0;
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==PATH_PRIMARY||LA106_0==INVERSE) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:346:23: pathEltOrInverse
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence2277);
            	    pathEltOrInverse285=pathEltOrInverse();

            	    state._fsp--;

            	    adaptor.addChild(root_1, pathEltOrInverse285.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt106 >= 1 ) break loop106;
                        EarlyExitException eee =
                            new EarlyExitException(106, input);
                        throw eee;
                }
                cnt106++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathSequence"

    public static class pathEltOrInverse_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathEltOrInverse"
    // com\\googlecode\\sparkleg\\SparqlT.g:349:1: pathEltOrInverse : ( INVERSE )? pathElt ;
    public final SparqlT.pathEltOrInverse_return pathEltOrInverse() throws RecognitionException {
        SparqlT.pathEltOrInverse_return retval = new SparqlT.pathEltOrInverse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INVERSE286=null;
        SparqlT.pathElt_return pathElt287 = null;


        CommonTree INVERSE286_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:350:5: ( ( INVERSE )? pathElt )
            // com\\googlecode\\sparkleg\\SparqlT.g:350:7: ( INVERSE )? pathElt
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:350:7: ( INVERSE )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==INVERSE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:350:7: INVERSE
                    {
                    _last = (CommonTree)input.LT(1);
                    INVERSE286=(CommonTree)match(input,INVERSE,FOLLOW_INVERSE_in_pathEltOrInverse2300); 
                    INVERSE286_tree = (CommonTree)adaptor.dupNode(INVERSE286);

                    adaptor.addChild(root_0, INVERSE286_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pathElt_in_pathEltOrInverse2303);
            pathElt287=pathElt();

            state._fsp--;

            adaptor.addChild(root_0, pathElt287.getTree());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathEltOrInverse"

    public static class pathElt_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathElt"
    // com\\googlecode\\sparkleg\\SparqlT.g:353:1: pathElt : pathPrimary ( pathMod )? ;
    public final SparqlT.pathElt_return pathElt() throws RecognitionException {
        SparqlT.pathElt_return retval = new SparqlT.pathElt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.pathPrimary_return pathPrimary288 = null;

        SparqlT.pathMod_return pathMod289 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:354:5: ( pathPrimary ( pathMod )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:354:7: pathPrimary ( pathMod )?
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pathPrimary_in_pathElt2328);
            pathPrimary288=pathPrimary();

            state._fsp--;

            adaptor.addChild(root_0, pathPrimary288.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:354:19: ( pathMod )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ASTERISK||LA108_0==OPEN_CURLY_BRACE||(LA108_0>=QUESTION_MARK && LA108_0<=PLUS)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:354:19: pathMod
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pathMod_in_pathElt2330);
                    pathMod289=pathMod();

                    state._fsp--;

                    adaptor.addChild(root_0, pathMod289.getTree());

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathElt"

    public static class pathMod_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathMod"
    // com\\googlecode\\sparkleg\\SparqlT.g:357:1: pathMod : ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) ;
    public final SparqlT.pathMod_return pathMod() throws RecognitionException {
        SparqlT.pathMod_return retval = new SparqlT.pathMod_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASTERISK290=null;
        CommonTree QUESTION_MARK291=null;
        CommonTree PLUS292=null;
        CommonTree OPEN_CURLY_BRACE293=null;
        CommonTree INTEGER294=null;
        CommonTree COMMA295=null;
        CommonTree CLOSE_CURLY_BRACE296=null;
        CommonTree INTEGER297=null;
        CommonTree CLOSE_CURLY_BRACE298=null;
        CommonTree CLOSE_CURLY_BRACE299=null;
        CommonTree COMMA300=null;
        CommonTree INTEGER301=null;
        CommonTree CLOSE_CURLY_BRACE302=null;

        CommonTree ASTERISK290_tree=null;
        CommonTree QUESTION_MARK291_tree=null;
        CommonTree PLUS292_tree=null;
        CommonTree OPEN_CURLY_BRACE293_tree=null;
        CommonTree INTEGER294_tree=null;
        CommonTree COMMA295_tree=null;
        CommonTree CLOSE_CURLY_BRACE296_tree=null;
        CommonTree INTEGER297_tree=null;
        CommonTree CLOSE_CURLY_BRACE298_tree=null;
        CommonTree CLOSE_CURLY_BRACE299_tree=null;
        CommonTree COMMA300_tree=null;
        CommonTree INTEGER301_tree=null;
        CommonTree CLOSE_CURLY_BRACE302_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:358:5: ( ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:358:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:358:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            int alt112=4;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt112=1;
                }
                break;
            case QUESTION_MARK:
                {
                alt112=2;
                }
                break;
            case PLUS:
                {
                alt112=3;
                }
                break;
            case OPEN_CURLY_BRACE:
                {
                alt112=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:358:8: ASTERISK
                    {
                    _last = (CommonTree)input.LT(1);
                    ASTERISK290=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_pathMod2353); 
                    ASTERISK290_tree = (CommonTree)adaptor.dupNode(ASTERISK290);

                    adaptor.addChild(root_0, ASTERISK290_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:358:19: QUESTION_MARK
                    {
                    _last = (CommonTree)input.LT(1);
                    QUESTION_MARK291=(CommonTree)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_pathMod2357); 
                    QUESTION_MARK291_tree = (CommonTree)adaptor.dupNode(QUESTION_MARK291);

                    adaptor.addChild(root_0, QUESTION_MARK291_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:358:35: PLUS
                    {
                    _last = (CommonTree)input.LT(1);
                    PLUS292=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_pathMod2361); 
                    PLUS292_tree = (CommonTree)adaptor.dupNode(PLUS292);

                    adaptor.addChild(root_0, PLUS292_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:358:42: OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    {
                    _last = (CommonTree)input.LT(1);
                    OPEN_CURLY_BRACE293=(CommonTree)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_pathMod2365); 
                    OPEN_CURLY_BRACE293_tree = (CommonTree)adaptor.dupNode(OPEN_CURLY_BRACE293);

                    adaptor.addChild(root_0, OPEN_CURLY_BRACE293_tree);

                    // com\\googlecode\\sparkleg\\SparqlT.g:358:59: ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==INTEGER) ) {
                        alt111=1;
                    }
                    else if ( (LA111_0==COMMA) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:358:60: INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            {
                            _last = (CommonTree)input.LT(1);
                            INTEGER294=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod2368); 
                            INTEGER294_tree = (CommonTree)adaptor.dupNode(INTEGER294);

                            adaptor.addChild(root_0, INTEGER294_tree);

                            // com\\googlecode\\sparkleg\\SparqlT.g:358:68: ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            int alt110=2;
                            int LA110_0 = input.LA(1);

                            if ( (LA110_0==COMMA) ) {
                                alt110=1;
                            }
                            else if ( (LA110_0==CLOSE_CURLY_BRACE) ) {
                                alt110=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 110, 0, input);

                                throw nvae;
                            }
                            switch (alt110) {
                                case 1 :
                                    // com\\googlecode\\sparkleg\\SparqlT.g:358:69: COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    COMMA295=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_pathMod2371); 
                                    COMMA295_tree = (CommonTree)adaptor.dupNode(COMMA295);

                                    adaptor.addChild(root_0, COMMA295_tree);

                                    // com\\googlecode\\sparkleg\\SparqlT.g:358:75: ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    int alt109=2;
                                    int LA109_0 = input.LA(1);

                                    if ( (LA109_0==CLOSE_CURLY_BRACE) ) {
                                        alt109=1;
                                    }
                                    else if ( (LA109_0==INTEGER) ) {
                                        alt109=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 109, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt109) {
                                        case 1 :
                                            // com\\googlecode\\sparkleg\\SparqlT.g:358:76: CLOSE_CURLY_BRACE
                                            {
                                            _last = (CommonTree)input.LT(1);
                                            CLOSE_CURLY_BRACE296=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2374); 
                                            CLOSE_CURLY_BRACE296_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE296);

                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE296_tree);


                                            }
                                            break;
                                        case 2 :
                                            // com\\googlecode\\sparkleg\\SparqlT.g:358:96: INTEGER CLOSE_CURLY_BRACE
                                            {
                                            _last = (CommonTree)input.LT(1);
                                            INTEGER297=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod2378); 
                                            INTEGER297_tree = (CommonTree)adaptor.dupNode(INTEGER297);

                                            adaptor.addChild(root_0, INTEGER297_tree);

                                            _last = (CommonTree)input.LT(1);
                                            CLOSE_CURLY_BRACE298=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2380); 
                                            CLOSE_CURLY_BRACE298_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE298);

                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE298_tree);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // com\\googlecode\\sparkleg\\SparqlT.g:358:125: CLOSE_CURLY_BRACE
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    CLOSE_CURLY_BRACE299=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2385); 
                                    CLOSE_CURLY_BRACE299_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE299);

                                    adaptor.addChild(root_0, CLOSE_CURLY_BRACE299_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:358:146: COMMA INTEGER CLOSE_CURLY_BRACE
                            {
                            _last = (CommonTree)input.LT(1);
                            COMMA300=(CommonTree)match(input,COMMA,FOLLOW_COMMA_in_pathMod2390); 
                            COMMA300_tree = (CommonTree)adaptor.dupNode(COMMA300);

                            adaptor.addChild(root_0, COMMA300_tree);

                            _last = (CommonTree)input.LT(1);
                            INTEGER301=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod2392); 
                            INTEGER301_tree = (CommonTree)adaptor.dupNode(INTEGER301);

                            adaptor.addChild(root_0, INTEGER301_tree);

                            _last = (CommonTree)input.LT(1);
                            CLOSE_CURLY_BRACE302=(CommonTree)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2394); 
                            CLOSE_CURLY_BRACE302_tree = (CommonTree)adaptor.dupNode(CLOSE_CURLY_BRACE302);

                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE302_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathMod"

    public static class pathPrimary_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathPrimary"
    // com\\googlecode\\sparkleg\\SparqlT.g:361:1: pathPrimary : ( ^( PATH_PRIMARY iriRef ) | ^( PATH_PRIMARY A ) | ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | ^( PATH_PRIMARY path ) );
    public final SparqlT.pathPrimary_return pathPrimary() throws RecognitionException {
        SparqlT.pathPrimary_return retval = new SparqlT.pathPrimary_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH_PRIMARY303=null;
        CommonTree PATH_PRIMARY305=null;
        CommonTree A306=null;
        CommonTree PATH_PRIMARY307=null;
        CommonTree NEGATION308=null;
        CommonTree PATH_PRIMARY310=null;
        SparqlT.iriRef_return iriRef304 = null;

        SparqlT.pathNegatedPropertySet_return pathNegatedPropertySet309 = null;

        SparqlT.path_return path311 = null;


        CommonTree PATH_PRIMARY303_tree=null;
        CommonTree PATH_PRIMARY305_tree=null;
        CommonTree A306_tree=null;
        CommonTree PATH_PRIMARY307_tree=null;
        CommonTree NEGATION308_tree=null;
        CommonTree PATH_PRIMARY310_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:362:5: ( ^( PATH_PRIMARY iriRef ) | ^( PATH_PRIMARY A ) | ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | ^( PATH_PRIMARY path ) )
            int alt113=4;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==PATH_PRIMARY) ) {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case A:
                        {
                        alt113=2;
                        }
                        break;
                    case NEGATION:
                        {
                        alt113=3;
                        }
                        break;
                    case PATH:
                        {
                        alt113=4;
                        }
                        break;
                    case IRI_REF:
                    case PNAME_NS:
                    case PNAME_LN:
                        {
                        alt113=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:362:7: ^( PATH_PRIMARY iriRef )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PATH_PRIMARY303=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2414); 
                    PATH_PRIMARY303_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY303);

                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY303_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_pathPrimary2416);
                    iriRef304=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_1, iriRef304.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:363:7: ^( PATH_PRIMARY A )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PATH_PRIMARY305=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2426); 
                    PATH_PRIMARY305_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY305);

                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY305_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    A306=(CommonTree)match(input,A,FOLLOW_A_in_pathPrimary2428); 
                    A306_tree = (CommonTree)adaptor.dupNode(A306);

                    adaptor.addChild(root_1, A306_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:364:7: ^( PATH_PRIMARY NEGATION pathNegatedPropertySet )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PATH_PRIMARY307=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2438); 
                    PATH_PRIMARY307_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY307);

                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY307_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NEGATION308=(CommonTree)match(input,NEGATION,FOLLOW_NEGATION_in_pathPrimary2440); 
                    NEGATION308_tree = (CommonTree)adaptor.dupNode(NEGATION308);

                    adaptor.addChild(root_1, NEGATION308_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary2442);
                    pathNegatedPropertySet309=pathNegatedPropertySet();

                    state._fsp--;

                    adaptor.addChild(root_1, pathNegatedPropertySet309.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:365:7: ^( PATH_PRIMARY path )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PATH_PRIMARY310=(CommonTree)match(input,PATH_PRIMARY,FOLLOW_PATH_PRIMARY_in_pathPrimary2452); 
                    PATH_PRIMARY310_tree = (CommonTree)adaptor.dupNode(PATH_PRIMARY310);

                    root_1 = (CommonTree)adaptor.becomeRoot(PATH_PRIMARY310_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_path_in_pathPrimary2454);
                    path311=path();

                    state._fsp--;

                    adaptor.addChild(root_1, path311.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathPrimary"

    public static class pathNegatedPropertySet_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathNegatedPropertySet"
    // com\\googlecode\\sparkleg\\SparqlT.g:368:1: pathNegatedPropertySet : ^( PATH_NEGATED ( pathOneInPropertySet )+ ) ;
    public final SparqlT.pathNegatedPropertySet_return pathNegatedPropertySet() throws RecognitionException {
        SparqlT.pathNegatedPropertySet_return retval = new SparqlT.pathNegatedPropertySet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATH_NEGATED312=null;
        SparqlT.pathOneInPropertySet_return pathOneInPropertySet313 = null;


        CommonTree PATH_NEGATED312_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:369:5: ( ^( PATH_NEGATED ( pathOneInPropertySet )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:369:7: ^( PATH_NEGATED ( pathOneInPropertySet )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATH_NEGATED312=(CommonTree)match(input,PATH_NEGATED,FOLLOW_PATH_NEGATED_in_pathNegatedPropertySet2473); 
            PATH_NEGATED312_tree = (CommonTree)adaptor.dupNode(PATH_NEGATED312);

            root_1 = (CommonTree)adaptor.becomeRoot(PATH_NEGATED312_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:369:22: ( pathOneInPropertySet )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==IRI_REF||LA114_0==PNAME_NS||LA114_0==A||LA114_0==INVERSE||LA114_0==PNAME_LN) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:369:22: pathOneInPropertySet
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet2475);
            	    pathOneInPropertySet313=pathOneInPropertySet();

            	    state._fsp--;

            	    adaptor.addChild(root_1, pathOneInPropertySet313.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathNegatedPropertySet"

    public static class pathOneInPropertySet_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathOneInPropertySet"
    // com\\googlecode\\sparkleg\\SparqlT.g:372:1: pathOneInPropertySet : ( INVERSE )? ( iriRef | A ) ;
    public final SparqlT.pathOneInPropertySet_return pathOneInPropertySet() throws RecognitionException {
        SparqlT.pathOneInPropertySet_return retval = new SparqlT.pathOneInPropertySet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INVERSE314=null;
        CommonTree A316=null;
        SparqlT.iriRef_return iriRef315 = null;


        CommonTree INVERSE314_tree=null;
        CommonTree A316_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:373:5: ( ( INVERSE )? ( iriRef | A ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:373:7: ( INVERSE )? ( iriRef | A )
            {
            root_0 = (CommonTree)adaptor.nil();

            // com\\googlecode\\sparkleg\\SparqlT.g:373:7: ( INVERSE )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==INVERSE) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:373:7: INVERSE
                    {
                    _last = (CommonTree)input.LT(1);
                    INVERSE314=(CommonTree)match(input,INVERSE,FOLLOW_INVERSE_in_pathOneInPropertySet2497); 
                    INVERSE314_tree = (CommonTree)adaptor.dupNode(INVERSE314);

                    adaptor.addChild(root_0, INVERSE314_tree);


                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\SparqlT.g:373:16: ( iriRef | A )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==IRI_REF||LA116_0==PNAME_NS||LA116_0==PNAME_LN) ) {
                alt116=1;
            }
            else if ( (LA116_0==A) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:373:17: iriRef
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_pathOneInPropertySet2501);
                    iriRef315=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef315.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:373:26: A
                    {
                    _last = (CommonTree)input.LT(1);
                    A316=(CommonTree)match(input,A,FOLLOW_A_in_pathOneInPropertySet2505); 
                    A316_tree = (CommonTree)adaptor.dupNode(A316);

                    adaptor.addChild(root_0, A316_tree);


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathOneInPropertySet"

    public static class triplesNode_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:376:1: triplesNode : ( ^( COLLECTION ( graphNode )+ ) | ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty ) );
    public final SparqlT.triplesNode_return triplesNode() throws RecognitionException {
        SparqlT.triplesNode_return retval = new SparqlT.triplesNode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLLECTION317=null;
        CommonTree TRIPLES_NODE319=null;
        CommonTree SUBJECT320=null;
        CommonTree BLANK_NODE321=null;
        SparqlT.graphNode_return graphNode318 = null;

        SparqlT.propertyListNotEmpty_return propertyListNotEmpty322 = null;


        CommonTree COLLECTION317_tree=null;
        CommonTree TRIPLES_NODE319_tree=null;
        CommonTree SUBJECT320_tree=null;
        CommonTree BLANK_NODE321_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:377:5: ( ^( COLLECTION ( graphNode )+ ) | ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty ) )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==COLLECTION) ) {
                alt118=1;
            }
            else if ( (LA118_0==TRIPLES_NODE) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:377:7: ^( COLLECTION ( graphNode )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COLLECTION317=(CommonTree)match(input,COLLECTION,FOLLOW_COLLECTION_in_triplesNode2525); 
                    COLLECTION317_tree = (CommonTree)adaptor.dupNode(COLLECTION317);

                    root_1 = (CommonTree)adaptor.becomeRoot(COLLECTION317_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:377:20: ( graphNode )+
                    int cnt117=0;
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( ((LA117_0>=TRIPLES_NODE && LA117_0<=COLLECTION)||LA117_0==BLANK_NODE||LA117_0==IRI_REF||LA117_0==PNAME_NS||LA117_0==OPEN_BRACE||LA117_0==INTEGER||LA117_0==OPEN_SQUARE_BRACKET||(LA117_0>=VAR1 && LA117_0<=VAR2)||(LA117_0>=DECIMAL && LA117_0<=BLANK_NODE_LABEL)) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:377:20: graphNode
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_graphNode_in_triplesNode2527);
                    	    graphNode318=graphNode();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, graphNode318.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt117 >= 1 ) break loop117;
                                EarlyExitException eee =
                                    new EarlyExitException(117, input);
                                throw eee;
                        }
                        cnt117++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:378:7: ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TRIPLES_NODE319=(CommonTree)match(input,TRIPLES_NODE,FOLLOW_TRIPLES_NODE_in_triplesNode2538); 
                    TRIPLES_NODE319_tree = (CommonTree)adaptor.dupNode(TRIPLES_NODE319);

                    root_1 = (CommonTree)adaptor.becomeRoot(TRIPLES_NODE319_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUBJECT320=(CommonTree)match(input,SUBJECT,FOLLOW_SUBJECT_in_triplesNode2541); 
                    SUBJECT320_tree = (CommonTree)adaptor.dupNode(SUBJECT320);

                    root_2 = (CommonTree)adaptor.becomeRoot(SUBJECT320_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    BLANK_NODE321=(CommonTree)match(input,BLANK_NODE,FOLLOW_BLANK_NODE_in_triplesNode2543); 
                    BLANK_NODE321_tree = (CommonTree)adaptor.dupNode(BLANK_NODE321);

                    adaptor.addChild(root_2, BLANK_NODE321_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesNode2546);
                    propertyListNotEmpty322=propertyListNotEmpty();

                    state._fsp--;

                    adaptor.addChild(root_1, propertyListNotEmpty322.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesNode"

    public static class graphNode_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:381:1: graphNode : ( varOrTerm | triplesNode );
    public final SparqlT.graphNode_return graphNode() throws RecognitionException {
        SparqlT.graphNode_return retval = new SparqlT.graphNode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.varOrTerm_return varOrTerm323 = null;

        SparqlT.triplesNode_return triplesNode324 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:382:5: ( varOrTerm | triplesNode )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==BLANK_NODE||LA119_0==IRI_REF||LA119_0==PNAME_NS||LA119_0==OPEN_BRACE||LA119_0==INTEGER||LA119_0==OPEN_SQUARE_BRACKET||(LA119_0>=VAR1 && LA119_0<=VAR2)||(LA119_0>=DECIMAL && LA119_0<=BLANK_NODE_LABEL)) ) {
                alt119=1;
            }
            else if ( ((LA119_0>=TRIPLES_NODE && LA119_0<=COLLECTION)) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:382:7: varOrTerm
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_varOrTerm_in_graphNode2564);
                    varOrTerm323=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrTerm323.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:382:19: triplesNode
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_triplesNode_in_graphNode2568);
                    triplesNode324=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesNode324.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphNode"

    public static class varOrTerm_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOrTerm"
    // com\\googlecode\\sparkleg\\SparqlT.g:385:1: varOrTerm : ( var | graphTerm | BLANK_NODE );
    public final SparqlT.varOrTerm_return varOrTerm() throws RecognitionException {
        SparqlT.varOrTerm_return retval = new SparqlT.varOrTerm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLANK_NODE327=null;
        SparqlT.var_return var325 = null;

        SparqlT.graphTerm_return graphTerm326 = null;


        CommonTree BLANK_NODE327_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:386:5: ( var | graphTerm | BLANK_NODE )
            int alt120=3;
            switch ( input.LA(1) ) {
            case VAR1:
            case VAR2:
                {
                alt120=1;
                }
                break;
            case IRI_REF:
            case PNAME_NS:
            case OPEN_BRACE:
            case INTEGER:
            case OPEN_SQUARE_BRACKET:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
            case TRUE:
            case FALSE:
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
            case PNAME_LN:
            case BLANK_NODE_LABEL:
                {
                alt120=2;
                }
                break;
            case BLANK_NODE:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:386:7: var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_varOrTerm2585);
                    var325=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var325.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:386:13: graphTerm
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_graphTerm_in_varOrTerm2589);
                    graphTerm326=graphTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, graphTerm326.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:386:25: BLANK_NODE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    BLANK_NODE327=(CommonTree)match(input,BLANK_NODE,FOLLOW_BLANK_NODE_in_varOrTerm2593); 
                    BLANK_NODE327_tree = (CommonTree)adaptor.dupNode(BLANK_NODE327);

                    adaptor.addChild(root_0, BLANK_NODE327_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varOrTerm"

    public static class varOrIRIref_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOrIRIref"
    // com\\googlecode\\sparkleg\\SparqlT.g:389:1: varOrIRIref : ( var | iriRef );
    public final SparqlT.varOrIRIref_return varOrIRIref() throws RecognitionException {
        SparqlT.varOrIRIref_return retval = new SparqlT.varOrIRIref_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.var_return var328 = null;

        SparqlT.iriRef_return iriRef329 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:390:5: ( var | iriRef )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=VAR1 && LA121_0<=VAR2)) ) {
                alt121=1;
            }
            else if ( (LA121_0==IRI_REF||LA121_0==PNAME_NS||LA121_0==PNAME_LN) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:390:7: var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_varOrIRIref2610);
                    var328=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var328.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:390:13: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_varOrIRIref2614);
                    iriRef329=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef329.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varOrIRIref"

    public static class var_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // com\\googlecode\\sparkleg\\SparqlT.g:393:1: var : ( VAR1 | VAR2 );
    public final SparqlT.var_return var() throws RecognitionException {
        SparqlT.var_return retval = new SparqlT.var_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set330=null;

        CommonTree set330_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:394:5: ( VAR1 | VAR2 )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set330=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=VAR1 && input.LA(1)<=VAR2) ) {
                input.consume();

                set330_tree = (CommonTree)adaptor.dupNode(set330);

                adaptor.addChild(root_0, set330_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class graphTerm_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphTerm"
    // com\\googlecode\\sparkleg\\SparqlT.g:397:1: graphTerm : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil );
    public final SparqlT.graphTerm_return graphTerm() throws RecognitionException {
        SparqlT.graphTerm_return retval = new SparqlT.graphTerm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.iriRef_return iriRef331 = null;

        SparqlT.rdfLiteral_return rdfLiteral332 = null;

        SparqlT.numericLiteral_return numericLiteral333 = null;

        SparqlT.booleanLiteral_return booleanLiteral334 = null;

        SparqlT.blankNode_return blankNode335 = null;

        SparqlT.nil_return nil336 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:398:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil )
            int alt122=6;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt122=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt122=2;
                }
                break;
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt122=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt122=4;
                }
                break;
            case OPEN_SQUARE_BRACKET:
            case BLANK_NODE_LABEL:
                {
                alt122=5;
                }
                break;
            case OPEN_BRACE:
                {
                alt122=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:398:7: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_graphTerm2652);
                    iriRef331=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef331.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:399:7: rdfLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm2660);
                    rdfLiteral332=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral332.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:400:7: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteral_in_graphTerm2668);
                    numericLiteral333=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral333.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:401:7: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm2676);
                    booleanLiteral334=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral334.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:402:7: blankNode
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_blankNode_in_graphTerm2684);
                    blankNode335=blankNode();

                    state._fsp--;

                    adaptor.addChild(root_0, blankNode335.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:403:7: nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_nil_in_graphTerm2692);
                    nil336=nil();

                    state._fsp--;

                    adaptor.addChild(root_0, nil336.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphTerm"

    public static class nil_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nil"
    // com\\googlecode\\sparkleg\\SparqlT.g:406:1: nil : OPEN_BRACE CLOSE_BRACE ;
    public final SparqlT.nil_return nil() throws RecognitionException {
        SparqlT.nil_return retval = new SparqlT.nil_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPEN_BRACE337=null;
        CommonTree CLOSE_BRACE338=null;

        CommonTree OPEN_BRACE337_tree=null;
        CommonTree CLOSE_BRACE338_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:407:5: ( OPEN_BRACE CLOSE_BRACE )
            // com\\googlecode\\sparkleg\\SparqlT.g:407:7: OPEN_BRACE CLOSE_BRACE
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            OPEN_BRACE337=(CommonTree)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_nil2713); 
            OPEN_BRACE337_tree = (CommonTree)adaptor.dupNode(OPEN_BRACE337);

            adaptor.addChild(root_0, OPEN_BRACE337_tree);

            _last = (CommonTree)input.LT(1);
            CLOSE_BRACE338=(CommonTree)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_nil2715); 
            CLOSE_BRACE338_tree = (CommonTree)adaptor.dupNode(CLOSE_BRACE338);

            adaptor.addChild(root_0, CLOSE_BRACE338_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nil"

    public static class expression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // com\\googlecode\\sparkleg\\SparqlT.g:410:1: expression : ( ^( OR expression expression ) | ^( AND expression expression ) | ^( EQUAL expression expression ) | ^( NOT_EQUAL expression expression ) | ^( LESS expression expression ) | ^( GREATER expression expression ) | ^( LESS_EQUAL expression expression ) | ^( GREATER_EQUAL expression expression ) | ^( IN expression expression ) | ^( NOT IN expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( ASTERISK expression expression ) | ^( DIVIDE expression expression ) | unaryExpression );
    public final SparqlT.expression_return expression() throws RecognitionException {
        SparqlT.expression_return retval = new SparqlT.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OR339=null;
        CommonTree AND342=null;
        CommonTree EQUAL345=null;
        CommonTree NOT_EQUAL348=null;
        CommonTree LESS351=null;
        CommonTree GREATER354=null;
        CommonTree LESS_EQUAL357=null;
        CommonTree GREATER_EQUAL360=null;
        CommonTree IN363=null;
        CommonTree NOT366=null;
        CommonTree IN367=null;
        CommonTree PLUS370=null;
        CommonTree MINUS373=null;
        CommonTree ASTERISK376=null;
        CommonTree DIVIDE379=null;
        SparqlT.expression_return expression340 = null;

        SparqlT.expression_return expression341 = null;

        SparqlT.expression_return expression343 = null;

        SparqlT.expression_return expression344 = null;

        SparqlT.expression_return expression346 = null;

        SparqlT.expression_return expression347 = null;

        SparqlT.expression_return expression349 = null;

        SparqlT.expression_return expression350 = null;

        SparqlT.expression_return expression352 = null;

        SparqlT.expression_return expression353 = null;

        SparqlT.expression_return expression355 = null;

        SparqlT.expression_return expression356 = null;

        SparqlT.expression_return expression358 = null;

        SparqlT.expression_return expression359 = null;

        SparqlT.expression_return expression361 = null;

        SparqlT.expression_return expression362 = null;

        SparqlT.expression_return expression364 = null;

        SparqlT.expression_return expression365 = null;

        SparqlT.expression_return expression368 = null;

        SparqlT.expression_return expression369 = null;

        SparqlT.expression_return expression371 = null;

        SparqlT.expression_return expression372 = null;

        SparqlT.expression_return expression374 = null;

        SparqlT.expression_return expression375 = null;

        SparqlT.expression_return expression377 = null;

        SparqlT.expression_return expression378 = null;

        SparqlT.expression_return expression380 = null;

        SparqlT.expression_return expression381 = null;

        SparqlT.unaryExpression_return unaryExpression382 = null;


        CommonTree OR339_tree=null;
        CommonTree AND342_tree=null;
        CommonTree EQUAL345_tree=null;
        CommonTree NOT_EQUAL348_tree=null;
        CommonTree LESS351_tree=null;
        CommonTree GREATER354_tree=null;
        CommonTree LESS_EQUAL357_tree=null;
        CommonTree GREATER_EQUAL360_tree=null;
        CommonTree IN363_tree=null;
        CommonTree NOT366_tree=null;
        CommonTree IN367_tree=null;
        CommonTree PLUS370_tree=null;
        CommonTree MINUS373_tree=null;
        CommonTree ASTERISK376_tree=null;
        CommonTree DIVIDE379_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:411:5: ( ^( OR expression expression ) | ^( AND expression expression ) | ^( EQUAL expression expression ) | ^( NOT_EQUAL expression expression ) | ^( LESS expression expression ) | ^( GREATER expression expression ) | ^( LESS_EQUAL expression expression ) | ^( GREATER_EQUAL expression expression ) | ^( IN expression expression ) | ^( NOT IN expression expression ) | ^( PLUS expression expression ) | ^( MINUS expression expression ) | ^( ASTERISK expression expression ) | ^( DIVIDE expression expression ) | unaryExpression )
            int alt123=15;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt123=1;
                }
                break;
            case AND:
                {
                alt123=2;
                }
                break;
            case EQUAL:
                {
                alt123=3;
                }
                break;
            case NOT_EQUAL:
                {
                alt123=4;
                }
                break;
            case LESS:
                {
                alt123=5;
                }
                break;
            case GREATER:
                {
                alt123=6;
                }
                break;
            case LESS_EQUAL:
                {
                alt123=7;
                }
                break;
            case GREATER_EQUAL:
                {
                alt123=8;
                }
                break;
            case IN:
                {
                alt123=9;
                }
                break;
            case NOT:
                {
                alt123=10;
                }
                break;
            case PLUS:
                {
                alt123=11;
                }
                break;
            case MINUS:
                {
                alt123=12;
                }
                break;
            case ASTERISK:
                {
                alt123=13;
                }
                break;
            case DIVIDE:
                {
                alt123=14;
                }
                break;
            case UNARY_NOT:
            case UNARY_PLUS:
            case UNARY_MINUS:
            case UNARY:
                {
                alt123=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:411:7: ^( OR expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OR339=(CommonTree)match(input,OR,FOLLOW_OR_in_expression2733); 
                    OR339_tree = (CommonTree)adaptor.dupNode(OR339);

                    root_1 = (CommonTree)adaptor.becomeRoot(OR339_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2735);
                    expression340=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression340.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2737);
                    expression341=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression341.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:412:7: ^( AND expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AND342=(CommonTree)match(input,AND,FOLLOW_AND_in_expression2747); 
                    AND342_tree = (CommonTree)adaptor.dupNode(AND342);

                    root_1 = (CommonTree)adaptor.becomeRoot(AND342_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2749);
                    expression343=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression343.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2751);
                    expression344=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression344.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:413:7: ^( EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUAL345=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_expression2761); 
                    EQUAL345_tree = (CommonTree)adaptor.dupNode(EQUAL345);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUAL345_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2763);
                    expression346=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression346.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2765);
                    expression347=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression347.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:414:7: ^( NOT_EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_EQUAL348=(CommonTree)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expression2777); 
                    NOT_EQUAL348_tree = (CommonTree)adaptor.dupNode(NOT_EQUAL348);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL348_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2779);
                    expression349=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression349.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2781);
                    expression350=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression350.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:415:7: ^( LESS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LESS351=(CommonTree)match(input,LESS,FOLLOW_LESS_in_expression2791); 
                    LESS351_tree = (CommonTree)adaptor.dupNode(LESS351);

                    root_1 = (CommonTree)adaptor.becomeRoot(LESS351_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2793);
                    expression352=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression352.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2795);
                    expression353=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression353.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:416:7: ^( GREATER expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GREATER354=(CommonTree)match(input,GREATER,FOLLOW_GREATER_in_expression2805); 
                    GREATER354_tree = (CommonTree)adaptor.dupNode(GREATER354);

                    root_1 = (CommonTree)adaptor.becomeRoot(GREATER354_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2807);
                    expression355=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression355.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2809);
                    expression356=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression356.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:417:7: ^( LESS_EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LESS_EQUAL357=(CommonTree)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression2819); 
                    LESS_EQUAL357_tree = (CommonTree)adaptor.dupNode(LESS_EQUAL357);

                    root_1 = (CommonTree)adaptor.becomeRoot(LESS_EQUAL357_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2821);
                    expression358=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression358.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2823);
                    expression359=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression359.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:418:7: ^( GREATER_EQUAL expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GREATER_EQUAL360=(CommonTree)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_expression2833); 
                    GREATER_EQUAL360_tree = (CommonTree)adaptor.dupNode(GREATER_EQUAL360);

                    root_1 = (CommonTree)adaptor.becomeRoot(GREATER_EQUAL360_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2835);
                    expression361=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression361.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2837);
                    expression362=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression362.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:419:7: ^( IN expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IN363=(CommonTree)match(input,IN,FOLLOW_IN_in_expression2849); 
                    IN363_tree = (CommonTree)adaptor.dupNode(IN363);

                    root_1 = (CommonTree)adaptor.becomeRoot(IN363_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2851);
                    expression364=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression364.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2853);
                    expression365=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression365.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:420:7: ^( NOT IN expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT366=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expression2863); 
                    NOT366_tree = (CommonTree)adaptor.dupNode(NOT366);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT366_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    IN367=(CommonTree)match(input,IN,FOLLOW_IN_in_expression2865); 
                    IN367_tree = (CommonTree)adaptor.dupNode(IN367);

                    adaptor.addChild(root_1, IN367_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2867);
                    expression368=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression368.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2869);
                    expression369=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression369.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:421:7: ^( PLUS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS370=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expression2879); 
                    PLUS370_tree = (CommonTree)adaptor.dupNode(PLUS370);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS370_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2881);
                    expression371=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression371.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2883);
                    expression372=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression372.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:422:7: ^( MINUS expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS373=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expression2893); 
                    MINUS373_tree = (CommonTree)adaptor.dupNode(MINUS373);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS373_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2895);
                    expression374=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression374.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2897);
                    expression375=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression375.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:423:7: ^( ASTERISK expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASTERISK376=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expression2908); 
                    ASTERISK376_tree = (CommonTree)adaptor.dupNode(ASTERISK376);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK376_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2910);
                    expression377=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression377.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2912);
                    expression378=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression378.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:424:7: ^( DIVIDE expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIVIDE379=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expression2922); 
                    DIVIDE379_tree = (CommonTree)adaptor.dupNode(DIVIDE379);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE379_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2924);
                    expression380=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression380.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2926);
                    expression381=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression381.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:425:7: unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_unaryExpression_in_expression2935);
                    unaryExpression382=unaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryExpression382.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class unaryExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:428:1: unaryExpression : ( ^( UNARY_NOT primaryExpression ) | ^( UNARY_PLUS primaryExpression ) | ^( UNARY_MINUS primaryExpression ) | ^( UNARY primaryExpression ) );
    public final SparqlT.unaryExpression_return unaryExpression() throws RecognitionException {
        SparqlT.unaryExpression_return retval = new SparqlT.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNARY_NOT383=null;
        CommonTree UNARY_PLUS385=null;
        CommonTree UNARY_MINUS387=null;
        CommonTree UNARY389=null;
        SparqlT.primaryExpression_return primaryExpression384 = null;

        SparqlT.primaryExpression_return primaryExpression386 = null;

        SparqlT.primaryExpression_return primaryExpression388 = null;

        SparqlT.primaryExpression_return primaryExpression390 = null;


        CommonTree UNARY_NOT383_tree=null;
        CommonTree UNARY_PLUS385_tree=null;
        CommonTree UNARY_MINUS387_tree=null;
        CommonTree UNARY389_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:429:5: ( ^( UNARY_NOT primaryExpression ) | ^( UNARY_PLUS primaryExpression ) | ^( UNARY_MINUS primaryExpression ) | ^( UNARY primaryExpression ) )
            int alt124=4;
            switch ( input.LA(1) ) {
            case UNARY_NOT:
                {
                alt124=1;
                }
                break;
            case UNARY_PLUS:
                {
                alt124=2;
                }
                break;
            case UNARY_MINUS:
                {
                alt124=3;
                }
                break;
            case UNARY:
                {
                alt124=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:429:7: ^( UNARY_NOT primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNARY_NOT383=(CommonTree)match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_unaryExpression2958); 
                    UNARY_NOT383_tree = (CommonTree)adaptor.dupNode(UNARY_NOT383);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY_NOT383_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression2960);
                    primaryExpression384=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression384.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:430:7: ^( UNARY_PLUS primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNARY_PLUS385=(CommonTree)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_unaryExpression2970); 
                    UNARY_PLUS385_tree = (CommonTree)adaptor.dupNode(UNARY_PLUS385);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY_PLUS385_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression2972);
                    primaryExpression386=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression386.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:431:7: ^( UNARY_MINUS primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNARY_MINUS387=(CommonTree)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryExpression2982); 
                    UNARY_MINUS387_tree = (CommonTree)adaptor.dupNode(UNARY_MINUS387);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY_MINUS387_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression2984);
                    primaryExpression388=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression388.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:432:7: ^( UNARY primaryExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNARY389=(CommonTree)match(input,UNARY,FOLLOW_UNARY_in_unaryExpression2994); 
                    UNARY389_tree = (CommonTree)adaptor.dupNode(UNARY389);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY389_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression2996);
                    primaryExpression390=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_1, primaryExpression390.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class primaryExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:435:1: primaryExpression : ( builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate );
    public final SparqlT.primaryExpression_return primaryExpression() throws RecognitionException {
        SparqlT.primaryExpression_return retval = new SparqlT.primaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.builtInCall_return builtInCall391 = null;

        SparqlT.iriRefOrFunction_return iriRefOrFunction392 = null;

        SparqlT.rdfLiteral_return rdfLiteral393 = null;

        SparqlT.numericLiteral_return numericLiteral394 = null;

        SparqlT.booleanLiteral_return booleanLiteral395 = null;

        SparqlT.var_return var396 = null;

        SparqlT.aggregate_return aggregate397 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:436:5: ( builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate )
            int alt125=7;
            switch ( input.LA(1) ) {
            case NOT_EXISTS:
            case STR:
            case LANG:
            case LANGMATCHES:
            case DATATYPE:
            case BOUND:
            case IRI:
            case URI:
            case BNODE:
            case RAND:
            case ABS:
            case CEIL:
            case FLOOR:
            case ROUND:
            case CONCAT:
            case STRLEN:
            case UCASE:
            case LCASE:
            case ENCODE_FOR_URI:
            case CONTAINS:
            case STRSTARTS:
            case STRENDS:
            case YEAR:
            case MONTH:
            case DAY:
            case HOURS:
            case MINUTES:
            case SECONDS:
            case TIMEZONE:
            case TZ:
            case NOW:
            case MD5:
            case SHA1:
            case SHA224:
            case SHA256:
            case SHA384:
            case SHA512:
            case COALESCE:
            case IF:
            case STRLANG:
            case STRDT:
            case SAMETERM:
            case ISIRI:
            case ISURI:
            case ISBLANK:
            case ISLITERAL:
            case ISNUMERIC:
            case REGEX:
            case SUBSTR:
            case EXISTS:
                {
                alt125=1;
                }
                break;
            case FUNCTION:
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt125=2;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt125=3;
                }
                break;
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt125=4;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt125=5;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt125=6;
                }
                break;
            case COUNT:
            case SUM:
            case MIN:
            case MAX:
            case AVG:
            case SAMPLE:
            case GROUP_CONCAT:
                {
                alt125=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:7: builtInCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_builtInCall_in_primaryExpression3015);
                    builtInCall391=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall391.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:21: iriRefOrFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression3019);
                    iriRefOrFunction392=iriRefOrFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRefOrFunction392.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:40: rdfLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression3023);
                    rdfLiteral393=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral393.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:53: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression3027);
                    numericLiteral394=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral394.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:70: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression3031);
                    booleanLiteral395=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral395.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:87: var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_primaryExpression3035);
                    var396=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var396.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:436:93: aggregate
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_aggregate_in_primaryExpression3039);
                    aggregate397=aggregate();

                    state._fsp--;

                    adaptor.addChild(root_0, aggregate397.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class builtInCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "builtInCall"
    // com\\googlecode\\sparkleg\\SparqlT.g:439:1: builtInCall : ( ^( STR expression ) | ^( LANG expression ) | ^( LANGMATCHES ( expression )+ ) | ^( DATATYPE expression ) | ^( BOUND var ) | ^( IRI expression ) | ^( URI expression ) | ^( BNODE expression ) | RAND | ^( ABS expression ) | ^( CEIL expression ) | ^( FLOOR expression ) | ^( ROUND expression ) | ^( CONCAT expressionList ) | subStringExpression | ^( STRLEN expression ) | ^( UCASE expression ) | ^( LCASE expression ) | ^( ENCODE_FOR_URI expression ) | ^( CONTAINS expression ) | ^( STRSTARTS expression ) | ^( STRENDS expression ) | ^( YEAR expression ) | ^( MONTH expression ) | ^( DAY expression ) | ^( HOURS expression ) | ^( MINUTES expression ) | ^( SECONDS expression ) | ^( TIMEZONE expression ) | ^( TZ expression ) | NOW | ^( MD5 expression ) | ^( SHA1 expression ) | ^( SHA224 expression ) | ^( SHA256 expression ) | ^( SHA384 expression ) | ^( SHA512 expression ) | ^( COALESCE expressionList ) | ^( IF expression expression expression ) | ^( STRLANG expression expression ) | ^( STRDT expression expression ) | ^( SAMETERM expression expression ) | ^( ISIRI expression ) | ^( ISURI expression ) | ^( ISBLANK expression ) | ^( ISLITERAL expression ) | ^( ISNUMERIC expression ) | regexExpression | existsFunction | notExistsFunction );
    public final SparqlT.builtInCall_return builtInCall() throws RecognitionException {
        SparqlT.builtInCall_return retval = new SparqlT.builtInCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STR398=null;
        CommonTree LANG400=null;
        CommonTree LANGMATCHES402=null;
        CommonTree DATATYPE404=null;
        CommonTree BOUND406=null;
        CommonTree IRI408=null;
        CommonTree URI410=null;
        CommonTree BNODE412=null;
        CommonTree RAND414=null;
        CommonTree ABS415=null;
        CommonTree CEIL417=null;
        CommonTree FLOOR419=null;
        CommonTree ROUND421=null;
        CommonTree CONCAT423=null;
        CommonTree STRLEN426=null;
        CommonTree UCASE428=null;
        CommonTree LCASE430=null;
        CommonTree ENCODE_FOR_URI432=null;
        CommonTree CONTAINS434=null;
        CommonTree STRSTARTS436=null;
        CommonTree STRENDS438=null;
        CommonTree YEAR440=null;
        CommonTree MONTH442=null;
        CommonTree DAY444=null;
        CommonTree HOURS446=null;
        CommonTree MINUTES448=null;
        CommonTree SECONDS450=null;
        CommonTree TIMEZONE452=null;
        CommonTree TZ454=null;
        CommonTree NOW456=null;
        CommonTree MD5457=null;
        CommonTree SHA1459=null;
        CommonTree SHA224461=null;
        CommonTree SHA256463=null;
        CommonTree SHA384465=null;
        CommonTree SHA512467=null;
        CommonTree COALESCE469=null;
        CommonTree IF471=null;
        CommonTree STRLANG475=null;
        CommonTree STRDT478=null;
        CommonTree SAMETERM481=null;
        CommonTree ISIRI484=null;
        CommonTree ISURI486=null;
        CommonTree ISBLANK488=null;
        CommonTree ISLITERAL490=null;
        CommonTree ISNUMERIC492=null;
        SparqlT.expression_return expression399 = null;

        SparqlT.expression_return expression401 = null;

        SparqlT.expression_return expression403 = null;

        SparqlT.expression_return expression405 = null;

        SparqlT.var_return var407 = null;

        SparqlT.expression_return expression409 = null;

        SparqlT.expression_return expression411 = null;

        SparqlT.expression_return expression413 = null;

        SparqlT.expression_return expression416 = null;

        SparqlT.expression_return expression418 = null;

        SparqlT.expression_return expression420 = null;

        SparqlT.expression_return expression422 = null;

        SparqlT.expressionList_return expressionList424 = null;

        SparqlT.subStringExpression_return subStringExpression425 = null;

        SparqlT.expression_return expression427 = null;

        SparqlT.expression_return expression429 = null;

        SparqlT.expression_return expression431 = null;

        SparqlT.expression_return expression433 = null;

        SparqlT.expression_return expression435 = null;

        SparqlT.expression_return expression437 = null;

        SparqlT.expression_return expression439 = null;

        SparqlT.expression_return expression441 = null;

        SparqlT.expression_return expression443 = null;

        SparqlT.expression_return expression445 = null;

        SparqlT.expression_return expression447 = null;

        SparqlT.expression_return expression449 = null;

        SparqlT.expression_return expression451 = null;

        SparqlT.expression_return expression453 = null;

        SparqlT.expression_return expression455 = null;

        SparqlT.expression_return expression458 = null;

        SparqlT.expression_return expression460 = null;

        SparqlT.expression_return expression462 = null;

        SparqlT.expression_return expression464 = null;

        SparqlT.expression_return expression466 = null;

        SparqlT.expression_return expression468 = null;

        SparqlT.expressionList_return expressionList470 = null;

        SparqlT.expression_return expression472 = null;

        SparqlT.expression_return expression473 = null;

        SparqlT.expression_return expression474 = null;

        SparqlT.expression_return expression476 = null;

        SparqlT.expression_return expression477 = null;

        SparqlT.expression_return expression479 = null;

        SparqlT.expression_return expression480 = null;

        SparqlT.expression_return expression482 = null;

        SparqlT.expression_return expression483 = null;

        SparqlT.expression_return expression485 = null;

        SparqlT.expression_return expression487 = null;

        SparqlT.expression_return expression489 = null;

        SparqlT.expression_return expression491 = null;

        SparqlT.expression_return expression493 = null;

        SparqlT.regexExpression_return regexExpression494 = null;

        SparqlT.existsFunction_return existsFunction495 = null;

        SparqlT.notExistsFunction_return notExistsFunction496 = null;


        CommonTree STR398_tree=null;
        CommonTree LANG400_tree=null;
        CommonTree LANGMATCHES402_tree=null;
        CommonTree DATATYPE404_tree=null;
        CommonTree BOUND406_tree=null;
        CommonTree IRI408_tree=null;
        CommonTree URI410_tree=null;
        CommonTree BNODE412_tree=null;
        CommonTree RAND414_tree=null;
        CommonTree ABS415_tree=null;
        CommonTree CEIL417_tree=null;
        CommonTree FLOOR419_tree=null;
        CommonTree ROUND421_tree=null;
        CommonTree CONCAT423_tree=null;
        CommonTree STRLEN426_tree=null;
        CommonTree UCASE428_tree=null;
        CommonTree LCASE430_tree=null;
        CommonTree ENCODE_FOR_URI432_tree=null;
        CommonTree CONTAINS434_tree=null;
        CommonTree STRSTARTS436_tree=null;
        CommonTree STRENDS438_tree=null;
        CommonTree YEAR440_tree=null;
        CommonTree MONTH442_tree=null;
        CommonTree DAY444_tree=null;
        CommonTree HOURS446_tree=null;
        CommonTree MINUTES448_tree=null;
        CommonTree SECONDS450_tree=null;
        CommonTree TIMEZONE452_tree=null;
        CommonTree TZ454_tree=null;
        CommonTree NOW456_tree=null;
        CommonTree MD5457_tree=null;
        CommonTree SHA1459_tree=null;
        CommonTree SHA224461_tree=null;
        CommonTree SHA256463_tree=null;
        CommonTree SHA384465_tree=null;
        CommonTree SHA512467_tree=null;
        CommonTree COALESCE469_tree=null;
        CommonTree IF471_tree=null;
        CommonTree STRLANG475_tree=null;
        CommonTree STRDT478_tree=null;
        CommonTree SAMETERM481_tree=null;
        CommonTree ISIRI484_tree=null;
        CommonTree ISURI486_tree=null;
        CommonTree ISBLANK488_tree=null;
        CommonTree ISLITERAL490_tree=null;
        CommonTree ISNUMERIC492_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:440:5: ( ^( STR expression ) | ^( LANG expression ) | ^( LANGMATCHES ( expression )+ ) | ^( DATATYPE expression ) | ^( BOUND var ) | ^( IRI expression ) | ^( URI expression ) | ^( BNODE expression ) | RAND | ^( ABS expression ) | ^( CEIL expression ) | ^( FLOOR expression ) | ^( ROUND expression ) | ^( CONCAT expressionList ) | subStringExpression | ^( STRLEN expression ) | ^( UCASE expression ) | ^( LCASE expression ) | ^( ENCODE_FOR_URI expression ) | ^( CONTAINS expression ) | ^( STRSTARTS expression ) | ^( STRENDS expression ) | ^( YEAR expression ) | ^( MONTH expression ) | ^( DAY expression ) | ^( HOURS expression ) | ^( MINUTES expression ) | ^( SECONDS expression ) | ^( TIMEZONE expression ) | ^( TZ expression ) | NOW | ^( MD5 expression ) | ^( SHA1 expression ) | ^( SHA224 expression ) | ^( SHA256 expression ) | ^( SHA384 expression ) | ^( SHA512 expression ) | ^( COALESCE expressionList ) | ^( IF expression expression expression ) | ^( STRLANG expression expression ) | ^( STRDT expression expression ) | ^( SAMETERM expression expression ) | ^( ISIRI expression ) | ^( ISURI expression ) | ^( ISBLANK expression ) | ^( ISLITERAL expression ) | ^( ISNUMERIC expression ) | regexExpression | existsFunction | notExistsFunction )
            int alt127=50;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt127=1;
                }
                break;
            case LANG:
                {
                alt127=2;
                }
                break;
            case LANGMATCHES:
                {
                alt127=3;
                }
                break;
            case DATATYPE:
                {
                alt127=4;
                }
                break;
            case BOUND:
                {
                alt127=5;
                }
                break;
            case IRI:
                {
                alt127=6;
                }
                break;
            case URI:
                {
                alt127=7;
                }
                break;
            case BNODE:
                {
                alt127=8;
                }
                break;
            case RAND:
                {
                alt127=9;
                }
                break;
            case ABS:
                {
                alt127=10;
                }
                break;
            case CEIL:
                {
                alt127=11;
                }
                break;
            case FLOOR:
                {
                alt127=12;
                }
                break;
            case ROUND:
                {
                alt127=13;
                }
                break;
            case CONCAT:
                {
                alt127=14;
                }
                break;
            case SUBSTR:
                {
                alt127=15;
                }
                break;
            case STRLEN:
                {
                alt127=16;
                }
                break;
            case UCASE:
                {
                alt127=17;
                }
                break;
            case LCASE:
                {
                alt127=18;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt127=19;
                }
                break;
            case CONTAINS:
                {
                alt127=20;
                }
                break;
            case STRSTARTS:
                {
                alt127=21;
                }
                break;
            case STRENDS:
                {
                alt127=22;
                }
                break;
            case YEAR:
                {
                alt127=23;
                }
                break;
            case MONTH:
                {
                alt127=24;
                }
                break;
            case DAY:
                {
                alt127=25;
                }
                break;
            case HOURS:
                {
                alt127=26;
                }
                break;
            case MINUTES:
                {
                alt127=27;
                }
                break;
            case SECONDS:
                {
                alt127=28;
                }
                break;
            case TIMEZONE:
                {
                alt127=29;
                }
                break;
            case TZ:
                {
                alt127=30;
                }
                break;
            case NOW:
                {
                alt127=31;
                }
                break;
            case MD5:
                {
                alt127=32;
                }
                break;
            case SHA1:
                {
                alt127=33;
                }
                break;
            case SHA224:
                {
                alt127=34;
                }
                break;
            case SHA256:
                {
                alt127=35;
                }
                break;
            case SHA384:
                {
                alt127=36;
                }
                break;
            case SHA512:
                {
                alt127=37;
                }
                break;
            case COALESCE:
                {
                alt127=38;
                }
                break;
            case IF:
                {
                alt127=39;
                }
                break;
            case STRLANG:
                {
                alt127=40;
                }
                break;
            case STRDT:
                {
                alt127=41;
                }
                break;
            case SAMETERM:
                {
                alt127=42;
                }
                break;
            case ISIRI:
                {
                alt127=43;
                }
                break;
            case ISURI:
                {
                alt127=44;
                }
                break;
            case ISBLANK:
                {
                alt127=45;
                }
                break;
            case ISLITERAL:
                {
                alt127=46;
                }
                break;
            case ISNUMERIC:
                {
                alt127=47;
                }
                break;
            case REGEX:
                {
                alt127=48;
                }
                break;
            case EXISTS:
                {
                alt127=49;
                }
                break;
            case NOT_EXISTS:
                {
                alt127=50;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:440:7: ^( STR expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STR398=(CommonTree)match(input,STR,FOLLOW_STR_in_builtInCall3057); 
                    STR398_tree = (CommonTree)adaptor.dupNode(STR398);

                    root_1 = (CommonTree)adaptor.becomeRoot(STR398_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3059);
                    expression399=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression399.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:441:7: ^( LANG expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LANG400=(CommonTree)match(input,LANG,FOLLOW_LANG_in_builtInCall3069); 
                    LANG400_tree = (CommonTree)adaptor.dupNode(LANG400);

                    root_1 = (CommonTree)adaptor.becomeRoot(LANG400_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3071);
                    expression401=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression401.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:442:7: ^( LANGMATCHES ( expression )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LANGMATCHES402=(CommonTree)match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall3081); 
                    LANGMATCHES402_tree = (CommonTree)adaptor.dupNode(LANGMATCHES402);

                    root_1 = (CommonTree)adaptor.becomeRoot(LANGMATCHES402_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:442:21: ( expression )+
                    int cnt126=0;
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( ((LA126_0>=UNARY_NOT && LA126_0<=UNARY)||LA126_0==ASTERISK||LA126_0==DIVIDE||LA126_0==PLUS||(LA126_0>=OR && LA126_0<=MINUS)) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:442:21: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_builtInCall3083);
                    	    expression403=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expression403.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt126 >= 1 ) break loop126;
                                EarlyExitException eee =
                                    new EarlyExitException(126, input);
                                throw eee;
                        }
                        cnt126++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:443:7: ^( DATATYPE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DATATYPE404=(CommonTree)match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall3094); 
                    DATATYPE404_tree = (CommonTree)adaptor.dupNode(DATATYPE404);

                    root_1 = (CommonTree)adaptor.becomeRoot(DATATYPE404_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3096);
                    expression405=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression405.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:444:7: ^( BOUND var )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BOUND406=(CommonTree)match(input,BOUND,FOLLOW_BOUND_in_builtInCall3106); 
                    BOUND406_tree = (CommonTree)adaptor.dupNode(BOUND406);

                    root_1 = (CommonTree)adaptor.becomeRoot(BOUND406_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_builtInCall3108);
                    var407=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var407.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:445:7: ^( IRI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IRI408=(CommonTree)match(input,IRI,FOLLOW_IRI_in_builtInCall3118); 
                    IRI408_tree = (CommonTree)adaptor.dupNode(IRI408);

                    root_1 = (CommonTree)adaptor.becomeRoot(IRI408_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3120);
                    expression409=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression409.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:446:7: ^( URI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    URI410=(CommonTree)match(input,URI,FOLLOW_URI_in_builtInCall3130); 
                    URI410_tree = (CommonTree)adaptor.dupNode(URI410);

                    root_1 = (CommonTree)adaptor.becomeRoot(URI410_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3132);
                    expression411=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression411.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:447:7: ^( BNODE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BNODE412=(CommonTree)match(input,BNODE,FOLLOW_BNODE_in_builtInCall3142); 
                    BNODE412_tree = (CommonTree)adaptor.dupNode(BNODE412);

                    root_1 = (CommonTree)adaptor.becomeRoot(BNODE412_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3144);
                    expression413=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression413.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:448:7: RAND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    RAND414=(CommonTree)match(input,RAND,FOLLOW_RAND_in_builtInCall3153); 
                    RAND414_tree = (CommonTree)adaptor.dupNode(RAND414);

                    adaptor.addChild(root_0, RAND414_tree);


                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:449:7: ^( ABS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ABS415=(CommonTree)match(input,ABS,FOLLOW_ABS_in_builtInCall3162); 
                    ABS415_tree = (CommonTree)adaptor.dupNode(ABS415);

                    root_1 = (CommonTree)adaptor.becomeRoot(ABS415_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3164);
                    expression416=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression416.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:450:7: ^( CEIL expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CEIL417=(CommonTree)match(input,CEIL,FOLLOW_CEIL_in_builtInCall3174); 
                    CEIL417_tree = (CommonTree)adaptor.dupNode(CEIL417);

                    root_1 = (CommonTree)adaptor.becomeRoot(CEIL417_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3176);
                    expression418=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression418.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:451:7: ^( FLOOR expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FLOOR419=(CommonTree)match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall3186); 
                    FLOOR419_tree = (CommonTree)adaptor.dupNode(FLOOR419);

                    root_1 = (CommonTree)adaptor.becomeRoot(FLOOR419_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3188);
                    expression420=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression420.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:452:7: ^( ROUND expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ROUND421=(CommonTree)match(input,ROUND,FOLLOW_ROUND_in_builtInCall3198); 
                    ROUND421_tree = (CommonTree)adaptor.dupNode(ROUND421);

                    root_1 = (CommonTree)adaptor.becomeRoot(ROUND421_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3200);
                    expression422=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression422.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:453:7: ^( CONCAT expressionList )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONCAT423=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall3210); 
                    CONCAT423_tree = (CommonTree)adaptor.dupNode(CONCAT423);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONCAT423_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressionList_in_builtInCall3212);
                    expressionList424=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_1, expressionList424.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:454:7: subStringExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subStringExpression_in_builtInCall3221);
                    subStringExpression425=subStringExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, subStringExpression425.getTree());

                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:455:7: ^( STRLEN expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STRLEN426=(CommonTree)match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall3230); 
                    STRLEN426_tree = (CommonTree)adaptor.dupNode(STRLEN426);

                    root_1 = (CommonTree)adaptor.becomeRoot(STRLEN426_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3232);
                    expression427=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression427.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:456:7: ^( UCASE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UCASE428=(CommonTree)match(input,UCASE,FOLLOW_UCASE_in_builtInCall3242); 
                    UCASE428_tree = (CommonTree)adaptor.dupNode(UCASE428);

                    root_1 = (CommonTree)adaptor.becomeRoot(UCASE428_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3244);
                    expression429=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression429.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 18 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:457:7: ^( LCASE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LCASE430=(CommonTree)match(input,LCASE,FOLLOW_LCASE_in_builtInCall3254); 
                    LCASE430_tree = (CommonTree)adaptor.dupNode(LCASE430);

                    root_1 = (CommonTree)adaptor.becomeRoot(LCASE430_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3256);
                    expression431=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression431.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 19 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:458:7: ^( ENCODE_FOR_URI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENCODE_FOR_URI432=(CommonTree)match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall3266); 
                    ENCODE_FOR_URI432_tree = (CommonTree)adaptor.dupNode(ENCODE_FOR_URI432);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENCODE_FOR_URI432_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3268);
                    expression433=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression433.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 20 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:459:7: ^( CONTAINS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONTAINS434=(CommonTree)match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall3278); 
                    CONTAINS434_tree = (CommonTree)adaptor.dupNode(CONTAINS434);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONTAINS434_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3280);
                    expression435=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression435.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 21 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:460:7: ^( STRSTARTS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STRSTARTS436=(CommonTree)match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall3290); 
                    STRSTARTS436_tree = (CommonTree)adaptor.dupNode(STRSTARTS436);

                    root_1 = (CommonTree)adaptor.becomeRoot(STRSTARTS436_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3292);
                    expression437=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression437.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 22 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:461:7: ^( STRENDS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STRENDS438=(CommonTree)match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall3302); 
                    STRENDS438_tree = (CommonTree)adaptor.dupNode(STRENDS438);

                    root_1 = (CommonTree)adaptor.becomeRoot(STRENDS438_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3304);
                    expression439=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression439.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 23 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:462:7: ^( YEAR expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    YEAR440=(CommonTree)match(input,YEAR,FOLLOW_YEAR_in_builtInCall3314); 
                    YEAR440_tree = (CommonTree)adaptor.dupNode(YEAR440);

                    root_1 = (CommonTree)adaptor.becomeRoot(YEAR440_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3316);
                    expression441=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression441.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 24 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:463:7: ^( MONTH expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MONTH442=(CommonTree)match(input,MONTH,FOLLOW_MONTH_in_builtInCall3326); 
                    MONTH442_tree = (CommonTree)adaptor.dupNode(MONTH442);

                    root_1 = (CommonTree)adaptor.becomeRoot(MONTH442_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3328);
                    expression443=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression443.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 25 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:464:7: ^( DAY expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DAY444=(CommonTree)match(input,DAY,FOLLOW_DAY_in_builtInCall3338); 
                    DAY444_tree = (CommonTree)adaptor.dupNode(DAY444);

                    root_1 = (CommonTree)adaptor.becomeRoot(DAY444_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3340);
                    expression445=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression445.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 26 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:465:7: ^( HOURS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    HOURS446=(CommonTree)match(input,HOURS,FOLLOW_HOURS_in_builtInCall3350); 
                    HOURS446_tree = (CommonTree)adaptor.dupNode(HOURS446);

                    root_1 = (CommonTree)adaptor.becomeRoot(HOURS446_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3352);
                    expression447=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression447.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 27 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:466:7: ^( MINUTES expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUTES448=(CommonTree)match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall3362); 
                    MINUTES448_tree = (CommonTree)adaptor.dupNode(MINUTES448);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUTES448_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3364);
                    expression449=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression449.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 28 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:467:7: ^( SECONDS expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SECONDS450=(CommonTree)match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall3374); 
                    SECONDS450_tree = (CommonTree)adaptor.dupNode(SECONDS450);

                    root_1 = (CommonTree)adaptor.becomeRoot(SECONDS450_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3376);
                    expression451=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression451.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 29 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:468:7: ^( TIMEZONE expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TIMEZONE452=(CommonTree)match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall3386); 
                    TIMEZONE452_tree = (CommonTree)adaptor.dupNode(TIMEZONE452);

                    root_1 = (CommonTree)adaptor.becomeRoot(TIMEZONE452_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3388);
                    expression453=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression453.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 30 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:469:7: ^( TZ expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TZ454=(CommonTree)match(input,TZ,FOLLOW_TZ_in_builtInCall3398); 
                    TZ454_tree = (CommonTree)adaptor.dupNode(TZ454);

                    root_1 = (CommonTree)adaptor.becomeRoot(TZ454_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3400);
                    expression455=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression455.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 31 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:470:7: NOW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NOW456=(CommonTree)match(input,NOW,FOLLOW_NOW_in_builtInCall3409); 
                    NOW456_tree = (CommonTree)adaptor.dupNode(NOW456);

                    adaptor.addChild(root_0, NOW456_tree);


                    }
                    break;
                case 32 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:471:7: ^( MD5 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MD5457=(CommonTree)match(input,MD5,FOLLOW_MD5_in_builtInCall3418); 
                    MD5457_tree = (CommonTree)adaptor.dupNode(MD5457);

                    root_1 = (CommonTree)adaptor.becomeRoot(MD5457_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3420);
                    expression458=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression458.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 33 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:472:7: ^( SHA1 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHA1459=(CommonTree)match(input,SHA1,FOLLOW_SHA1_in_builtInCall3430); 
                    SHA1459_tree = (CommonTree)adaptor.dupNode(SHA1459);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHA1459_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3432);
                    expression460=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression460.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 34 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:473:7: ^( SHA224 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHA224461=(CommonTree)match(input,SHA224,FOLLOW_SHA224_in_builtInCall3442); 
                    SHA224461_tree = (CommonTree)adaptor.dupNode(SHA224461);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHA224461_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3444);
                    expression462=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression462.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 35 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:474:7: ^( SHA256 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHA256463=(CommonTree)match(input,SHA256,FOLLOW_SHA256_in_builtInCall3454); 
                    SHA256463_tree = (CommonTree)adaptor.dupNode(SHA256463);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHA256463_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3456);
                    expression464=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression464.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 36 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:475:7: ^( SHA384 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHA384465=(CommonTree)match(input,SHA384,FOLLOW_SHA384_in_builtInCall3466); 
                    SHA384465_tree = (CommonTree)adaptor.dupNode(SHA384465);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHA384465_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3468);
                    expression466=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression466.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 37 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:476:7: ^( SHA512 expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHA512467=(CommonTree)match(input,SHA512,FOLLOW_SHA512_in_builtInCall3478); 
                    SHA512467_tree = (CommonTree)adaptor.dupNode(SHA512467);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHA512467_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3480);
                    expression468=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression468.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 38 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:477:7: ^( COALESCE expressionList )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COALESCE469=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall3490); 
                    COALESCE469_tree = (CommonTree)adaptor.dupNode(COALESCE469);

                    root_1 = (CommonTree)adaptor.becomeRoot(COALESCE469_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressionList_in_builtInCall3492);
                    expressionList470=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_1, expressionList470.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 39 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:478:7: ^( IF expression expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IF471=(CommonTree)match(input,IF,FOLLOW_IF_in_builtInCall3502); 
                    IF471_tree = (CommonTree)adaptor.dupNode(IF471);

                    root_1 = (CommonTree)adaptor.becomeRoot(IF471_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3504);
                    expression472=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression472.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3506);
                    expression473=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression473.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3508);
                    expression474=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression474.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 40 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:479:7: ^( STRLANG expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STRLANG475=(CommonTree)match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall3518); 
                    STRLANG475_tree = (CommonTree)adaptor.dupNode(STRLANG475);

                    root_1 = (CommonTree)adaptor.becomeRoot(STRLANG475_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3520);
                    expression476=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression476.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3522);
                    expression477=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression477.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 41 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:480:7: ^( STRDT expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STRDT478=(CommonTree)match(input,STRDT,FOLLOW_STRDT_in_builtInCall3532); 
                    STRDT478_tree = (CommonTree)adaptor.dupNode(STRDT478);

                    root_1 = (CommonTree)adaptor.becomeRoot(STRDT478_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3534);
                    expression479=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression479.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3536);
                    expression480=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression480.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 42 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:481:7: ^( SAMETERM expression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SAMETERM481=(CommonTree)match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall3546); 
                    SAMETERM481_tree = (CommonTree)adaptor.dupNode(SAMETERM481);

                    root_1 = (CommonTree)adaptor.becomeRoot(SAMETERM481_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3548);
                    expression482=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression482.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3550);
                    expression483=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression483.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 43 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:482:7: ^( ISIRI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISIRI484=(CommonTree)match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall3560); 
                    ISIRI484_tree = (CommonTree)adaptor.dupNode(ISIRI484);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISIRI484_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3562);
                    expression485=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression485.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 44 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:483:7: ^( ISURI expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISURI486=(CommonTree)match(input,ISURI,FOLLOW_ISURI_in_builtInCall3572); 
                    ISURI486_tree = (CommonTree)adaptor.dupNode(ISURI486);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISURI486_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3574);
                    expression487=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression487.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 45 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:484:7: ^( ISBLANK expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISBLANK488=(CommonTree)match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall3584); 
                    ISBLANK488_tree = (CommonTree)adaptor.dupNode(ISBLANK488);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISBLANK488_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3586);
                    expression489=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression489.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 46 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:485:7: ^( ISLITERAL expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISLITERAL490=(CommonTree)match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall3597); 
                    ISLITERAL490_tree = (CommonTree)adaptor.dupNode(ISLITERAL490);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISLITERAL490_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3599);
                    expression491=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression491.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 47 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:486:7: ^( ISNUMERIC expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ISNUMERIC492=(CommonTree)match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall3609); 
                    ISNUMERIC492_tree = (CommonTree)adaptor.dupNode(ISNUMERIC492);

                    root_1 = (CommonTree)adaptor.becomeRoot(ISNUMERIC492_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_builtInCall3611);
                    expression493=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression493.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 48 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:487:7: regexExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_regexExpression_in_builtInCall3620);
                    regexExpression494=regexExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, regexExpression494.getTree());

                    }
                    break;
                case 49 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:488:7: existsFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_existsFunction_in_builtInCall3628);
                    existsFunction495=existsFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, existsFunction495.getTree());

                    }
                    break;
                case 50 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:489:7: notExistsFunction
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_notExistsFunction_in_builtInCall3636);
                    notExistsFunction496=notExistsFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, notExistsFunction496.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "builtInCall"

    public static class regexExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regexExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:492:1: regexExpression : ^( REGEX ( expression )+ ) ;
    public final SparqlT.regexExpression_return regexExpression() throws RecognitionException {
        SparqlT.regexExpression_return retval = new SparqlT.regexExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REGEX497=null;
        SparqlT.expression_return expression498 = null;


        CommonTree REGEX497_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:493:5: ( ^( REGEX ( expression )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:493:7: ^( REGEX ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            REGEX497=(CommonTree)match(input,REGEX,FOLLOW_REGEX_in_regexExpression3654); 
            REGEX497_tree = (CommonTree)adaptor.dupNode(REGEX497);

            root_1 = (CommonTree)adaptor.becomeRoot(REGEX497_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:493:15: ( expression )+
            int cnt128=0;
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( ((LA128_0>=UNARY_NOT && LA128_0<=UNARY)||LA128_0==ASTERISK||LA128_0==DIVIDE||LA128_0==PLUS||(LA128_0>=OR && LA128_0<=MINUS)) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:493:15: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_regexExpression3656);
            	    expression498=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expression498.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt128 >= 1 ) break loop128;
                        EarlyExitException eee =
                            new EarlyExitException(128, input);
                        throw eee;
                }
                cnt128++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "regexExpression"

    public static class subStringExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subStringExpression"
    // com\\googlecode\\sparkleg\\SparqlT.g:496:1: subStringExpression : ^( SUBSTR ( expression )+ ) ;
    public final SparqlT.subStringExpression_return subStringExpression() throws RecognitionException {
        SparqlT.subStringExpression_return retval = new SparqlT.subStringExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBSTR499=null;
        SparqlT.expression_return expression500 = null;


        CommonTree SUBSTR499_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:497:5: ( ^( SUBSTR ( expression )+ ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:497:7: ^( SUBSTR ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SUBSTR499=(CommonTree)match(input,SUBSTR,FOLLOW_SUBSTR_in_subStringExpression3680); 
            SUBSTR499_tree = (CommonTree)adaptor.dupNode(SUBSTR499);

            root_1 = (CommonTree)adaptor.becomeRoot(SUBSTR499_tree, root_1);



            match(input, Token.DOWN, null); 
            // com\\googlecode\\sparkleg\\SparqlT.g:497:16: ( expression )+
            int cnt129=0;
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( ((LA129_0>=UNARY_NOT && LA129_0<=UNARY)||LA129_0==ASTERISK||LA129_0==DIVIDE||LA129_0==PLUS||(LA129_0>=OR && LA129_0<=MINUS)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\SparqlT.g:497:16: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_subStringExpression3682);
            	    expression500=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expression500.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt129 >= 1 ) break loop129;
                        EarlyExitException eee =
                            new EarlyExitException(129, input);
                        throw eee;
                }
                cnt129++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subStringExpression"

    public static class existsFunction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "existsFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:500:1: existsFunction : ^( EXISTS groupGraphPattern ) ;
    public final SparqlT.existsFunction_return existsFunction() throws RecognitionException {
        SparqlT.existsFunction_return retval = new SparqlT.existsFunction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXISTS501=null;
        SparqlT.groupGraphPattern_return groupGraphPattern502 = null;


        CommonTree EXISTS501_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:501:5: ( ^( EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:501:7: ^( EXISTS groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EXISTS501=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction3706); 
            EXISTS501_tree = (CommonTree)adaptor.dupNode(EXISTS501);

            root_1 = (CommonTree)adaptor.becomeRoot(EXISTS501_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_existsFunction3708);
            groupGraphPattern502=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern502.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "existsFunction"

    public static class notExistsFunction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notExistsFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:504:1: notExistsFunction : ^( NOT_EXISTS groupGraphPattern ) ;
    public final SparqlT.notExistsFunction_return notExistsFunction() throws RecognitionException {
        SparqlT.notExistsFunction_return retval = new SparqlT.notExistsFunction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_EXISTS503=null;
        SparqlT.groupGraphPattern_return groupGraphPattern504 = null;


        CommonTree NOT_EXISTS503_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:505:5: ( ^( NOT_EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\SparqlT.g:505:7: ^( NOT_EXISTS groupGraphPattern )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            NOT_EXISTS503=(CommonTree)match(input,NOT_EXISTS,FOLLOW_NOT_EXISTS_in_notExistsFunction3727); 
            NOT_EXISTS503_tree = (CommonTree)adaptor.dupNode(NOT_EXISTS503);

            root_1 = (CommonTree)adaptor.becomeRoot(NOT_EXISTS503_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunction3729);
            groupGraphPattern504=groupGraphPattern();

            state._fsp--;

            adaptor.addChild(root_1, groupGraphPattern504.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notExistsFunction"

    public static class aggregate_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aggregate"
    // com\\googlecode\\sparkleg\\SparqlT.g:508:1: aggregate : ( ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | ^( SUM ( DISTINCT )* expression ) | ^( MIN ( DISTINCT )* expression ) | ^( MAX ( DISTINCT )* expression ) | ^( AVG ( DISTINCT )* expression ) | ^( SAMPLE ( DISTINCT )? expression ) | ^( GROUP_CONCAT ( DISTINCT )* expression ( string )? ) );
    public final SparqlT.aggregate_return aggregate() throws RecognitionException {
        SparqlT.aggregate_return retval = new SparqlT.aggregate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COUNT505=null;
        CommonTree DISTINCT506=null;
        CommonTree ASTERISK507=null;
        CommonTree SUM509=null;
        CommonTree DISTINCT510=null;
        CommonTree MIN512=null;
        CommonTree DISTINCT513=null;
        CommonTree MAX515=null;
        CommonTree DISTINCT516=null;
        CommonTree AVG518=null;
        CommonTree DISTINCT519=null;
        CommonTree SAMPLE521=null;
        CommonTree DISTINCT522=null;
        CommonTree GROUP_CONCAT524=null;
        CommonTree DISTINCT525=null;
        SparqlT.expression_return expression508 = null;

        SparqlT.expression_return expression511 = null;

        SparqlT.expression_return expression514 = null;

        SparqlT.expression_return expression517 = null;

        SparqlT.expression_return expression520 = null;

        SparqlT.expression_return expression523 = null;

        SparqlT.expression_return expression526 = null;

        SparqlT.string_return string527 = null;


        CommonTree COUNT505_tree=null;
        CommonTree DISTINCT506_tree=null;
        CommonTree ASTERISK507_tree=null;
        CommonTree SUM509_tree=null;
        CommonTree DISTINCT510_tree=null;
        CommonTree MIN512_tree=null;
        CommonTree DISTINCT513_tree=null;
        CommonTree MAX515_tree=null;
        CommonTree DISTINCT516_tree=null;
        CommonTree AVG518_tree=null;
        CommonTree DISTINCT519_tree=null;
        CommonTree SAMPLE521_tree=null;
        CommonTree DISTINCT522_tree=null;
        CommonTree GROUP_CONCAT524_tree=null;
        CommonTree DISTINCT525_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:509:5: ( ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | ^( SUM ( DISTINCT )* expression ) | ^( MIN ( DISTINCT )* expression ) | ^( MAX ( DISTINCT )* expression ) | ^( AVG ( DISTINCT )* expression ) | ^( SAMPLE ( DISTINCT )? expression ) | ^( GROUP_CONCAT ( DISTINCT )* expression ( string )? ) )
            int alt140=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt140=1;
                }
                break;
            case SUM:
                {
                alt140=2;
                }
                break;
            case MIN:
                {
                alt140=3;
                }
                break;
            case MAX:
                {
                alt140=4;
                }
                break;
            case AVG:
                {
                alt140=5;
                }
                break;
            case SAMPLE:
                {
                alt140=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt140=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:509:7: ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    COUNT505=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_aggregate3748); 
                    COUNT505_tree = (CommonTree)adaptor.dupNode(COUNT505);

                    root_1 = (CommonTree)adaptor.becomeRoot(COUNT505_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // com\\googlecode\\sparkleg\\SparqlT.g:509:15: ( DISTINCT )*
                        loop130:
                        do {
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==DISTINCT) ) {
                                alt130=1;
                            }


                            switch (alt130) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:509:15: DISTINCT
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    DISTINCT506=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3750); 
                        	    DISTINCT506_tree = (CommonTree)adaptor.dupNode(DISTINCT506);

                        	    adaptor.addChild(root_1, DISTINCT506_tree);


                        	    }
                        	    break;

                        	default :
                        	    break loop130;
                            }
                        } while (true);

                        // com\\googlecode\\sparkleg\\SparqlT.g:509:25: ( ASTERISK )*
                        loop131:
                        do {
                            int alt131=2;
                            int LA131_0 = input.LA(1);

                            if ( (LA131_0==ASTERISK) ) {
                                int LA131_2 = input.LA(2);

                                if ( (LA131_2==UP||(LA131_2>=UNARY_NOT && LA131_2<=UNARY)||LA131_2==ASTERISK||LA131_2==DIVIDE||LA131_2==PLUS||(LA131_2>=OR && LA131_2<=MINUS)) ) {
                                    alt131=1;
                                }


                            }


                            switch (alt131) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:509:25: ASTERISK
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    ASTERISK507=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_aggregate3753); 
                        	    ASTERISK507_tree = (CommonTree)adaptor.dupNode(ASTERISK507);

                        	    adaptor.addChild(root_1, ASTERISK507_tree);


                        	    }
                        	    break;

                        	default :
                        	    break loop131;
                            }
                        } while (true);

                        // com\\googlecode\\sparkleg\\SparqlT.g:509:35: ( expression )*
                        loop132:
                        do {
                            int alt132=2;
                            int LA132_0 = input.LA(1);

                            if ( ((LA132_0>=UNARY_NOT && LA132_0<=UNARY)||LA132_0==ASTERISK||LA132_0==DIVIDE||LA132_0==PLUS||(LA132_0>=OR && LA132_0<=MINUS)) ) {
                                alt132=1;
                            }


                            switch (alt132) {
                        	case 1 :
                        	    // com\\googlecode\\sparkleg\\SparqlT.g:509:35: expression
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_aggregate3756);
                        	    expression508=expression();

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expression508.getTree());

                        	    }
                        	    break;

                        	default :
                        	    break loop132;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:510:7: ^( SUM ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUM509=(CommonTree)match(input,SUM,FOLLOW_SUM_in_aggregate3767); 
                    SUM509_tree = (CommonTree)adaptor.dupNode(SUM509);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUM509_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:510:13: ( DISTINCT )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==DISTINCT) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:510:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT510=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3769); 
                    	    DISTINCT510_tree = (CommonTree)adaptor.dupNode(DISTINCT510);

                    	    adaptor.addChild(root_1, DISTINCT510_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3772);
                    expression511=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression511.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:511:7: ^( MIN ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MIN512=(CommonTree)match(input,MIN,FOLLOW_MIN_in_aggregate3782); 
                    MIN512_tree = (CommonTree)adaptor.dupNode(MIN512);

                    root_1 = (CommonTree)adaptor.becomeRoot(MIN512_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:511:13: ( DISTINCT )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==DISTINCT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:511:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT513=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3784); 
                    	    DISTINCT513_tree = (CommonTree)adaptor.dupNode(DISTINCT513);

                    	    adaptor.addChild(root_1, DISTINCT513_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3787);
                    expression514=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression514.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:512:7: ^( MAX ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MAX515=(CommonTree)match(input,MAX,FOLLOW_MAX_in_aggregate3797); 
                    MAX515_tree = (CommonTree)adaptor.dupNode(MAX515);

                    root_1 = (CommonTree)adaptor.becomeRoot(MAX515_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:512:13: ( DISTINCT )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==DISTINCT) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:512:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT516=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3799); 
                    	    DISTINCT516_tree = (CommonTree)adaptor.dupNode(DISTINCT516);

                    	    adaptor.addChild(root_1, DISTINCT516_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3802);
                    expression517=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression517.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:513:7: ^( AVG ( DISTINCT )* expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AVG518=(CommonTree)match(input,AVG,FOLLOW_AVG_in_aggregate3812); 
                    AVG518_tree = (CommonTree)adaptor.dupNode(AVG518);

                    root_1 = (CommonTree)adaptor.becomeRoot(AVG518_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:513:13: ( DISTINCT )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==DISTINCT) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:513:13: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT519=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3814); 
                    	    DISTINCT519_tree = (CommonTree)adaptor.dupNode(DISTINCT519);

                    	    adaptor.addChild(root_1, DISTINCT519_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3817);
                    expression520=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression520.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:514:7: ^( SAMPLE ( DISTINCT )? expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SAMPLE521=(CommonTree)match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate3827); 
                    SAMPLE521_tree = (CommonTree)adaptor.dupNode(SAMPLE521);

                    root_1 = (CommonTree)adaptor.becomeRoot(SAMPLE521_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:514:16: ( DISTINCT )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==DISTINCT) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:514:16: DISTINCT
                            {
                            _last = (CommonTree)input.LT(1);
                            DISTINCT522=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3829); 
                            DISTINCT522_tree = (CommonTree)adaptor.dupNode(DISTINCT522);

                            adaptor.addChild(root_1, DISTINCT522_tree);


                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3832);
                    expression523=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression523.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:515:7: ^( GROUP_CONCAT ( DISTINCT )* expression ( string )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GROUP_CONCAT524=(CommonTree)match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate3842); 
                    GROUP_CONCAT524_tree = (CommonTree)adaptor.dupNode(GROUP_CONCAT524);

                    root_1 = (CommonTree)adaptor.becomeRoot(GROUP_CONCAT524_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // com\\googlecode\\sparkleg\\SparqlT.g:515:22: ( DISTINCT )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==DISTINCT) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\SparqlT.g:515:22: DISTINCT
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    DISTINCT525=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate3844); 
                    	    DISTINCT525_tree = (CommonTree)adaptor.dupNode(DISTINCT525);

                    	    adaptor.addChild(root_1, DISTINCT525_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_aggregate3847);
                    expression526=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression526.getTree());
                    // com\\googlecode\\sparkleg\\SparqlT.g:515:43: ( string )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( ((LA139_0>=STRING_LITERAL1 && LA139_0<=STRING_LITERAL_LONG2)) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\SparqlT.g:515:43: string
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_string_in_aggregate3849);
                            string527=string();

                            state._fsp--;

                            adaptor.addChild(root_1, string527.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aggregate"

    public static class iriRefOrFunction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iriRefOrFunction"
    // com\\googlecode\\sparkleg\\SparqlT.g:518:1: iriRefOrFunction : ( iriRef | ^( FUNCTION iriRef ^( ARG_LIST argList ) ) );
    public final SparqlT.iriRefOrFunction_return iriRefOrFunction() throws RecognitionException {
        SparqlT.iriRefOrFunction_return retval = new SparqlT.iriRefOrFunction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION529=null;
        CommonTree ARG_LIST531=null;
        SparqlT.iriRef_return iriRef528 = null;

        SparqlT.iriRef_return iriRef530 = null;

        SparqlT.argList_return argList532 = null;


        CommonTree FUNCTION529_tree=null;
        CommonTree ARG_LIST531_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:519:5: ( iriRef | ^( FUNCTION iriRef ^( ARG_LIST argList ) ) )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==IRI_REF||LA141_0==PNAME_NS||LA141_0==PNAME_LN) ) {
                alt141=1;
            }
            else if ( (LA141_0==FUNCTION) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:519:7: iriRef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction3872);
                    iriRef528=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef528.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:520:7: ^( FUNCTION iriRef ^( ARG_LIST argList ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FUNCTION529=(CommonTree)match(input,FUNCTION,FOLLOW_FUNCTION_in_iriRefOrFunction3882); 
                    FUNCTION529_tree = (CommonTree)adaptor.dupNode(FUNCTION529);

                    root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION529_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction3884);
                    iriRef530=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_1, iriRef530.getTree());
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ARG_LIST531=(CommonTree)match(input,ARG_LIST,FOLLOW_ARG_LIST_in_iriRefOrFunction3887); 
                    ARG_LIST531_tree = (CommonTree)adaptor.dupNode(ARG_LIST531);

                    root_2 = (CommonTree)adaptor.becomeRoot(ARG_LIST531_tree, root_2);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_argList_in_iriRefOrFunction3889);
                        argList532=argList();

                        state._fsp--;

                        adaptor.addChild(root_2, argList532.getTree());

                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iriRefOrFunction"

    public static class rdfLiteral_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rdfLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:523:1: rdfLiteral : string ( LANGTAG | ( REFERENCE iriRef ) )? ;
    public final SparqlT.rdfLiteral_return rdfLiteral() throws RecognitionException {
        SparqlT.rdfLiteral_return retval = new SparqlT.rdfLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LANGTAG534=null;
        CommonTree REFERENCE535=null;
        SparqlT.string_return string533 = null;

        SparqlT.iriRef_return iriRef536 = null;


        CommonTree LANGTAG534_tree=null;
        CommonTree REFERENCE535_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:524:5: ( string ( LANGTAG | ( REFERENCE iriRef ) )? )
            // com\\googlecode\\sparkleg\\SparqlT.g:524:7: string ( LANGTAG | ( REFERENCE iriRef ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_string_in_rdfLiteral3908);
            string533=string();

            state._fsp--;

            adaptor.addChild(root_0, string533.getTree());
            // com\\googlecode\\sparkleg\\SparqlT.g:524:14: ( LANGTAG | ( REFERENCE iriRef ) )?
            int alt142=3;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==LANGTAG) ) {
                alt142=1;
            }
            else if ( (LA142_0==REFERENCE) ) {
                alt142=2;
            }
            switch (alt142) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:524:15: LANGTAG
                    {
                    _last = (CommonTree)input.LT(1);
                    LANGTAG534=(CommonTree)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral3911); 
                    LANGTAG534_tree = (CommonTree)adaptor.dupNode(LANGTAG534);

                    adaptor.addChild(root_0, LANGTAG534_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:524:25: ( REFERENCE iriRef )
                    {
                    // com\\googlecode\\sparkleg\\SparqlT.g:524:25: ( REFERENCE iriRef )
                    // com\\googlecode\\sparkleg\\SparqlT.g:524:26: REFERENCE iriRef
                    {
                    _last = (CommonTree)input.LT(1);
                    REFERENCE535=(CommonTree)match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral3916); 
                    REFERENCE535_tree = (CommonTree)adaptor.dupNode(REFERENCE535);

                    adaptor.addChild(root_0, REFERENCE535_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_iriRef_in_rdfLiteral3918);
                    iriRef536=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef536.getTree());

                    }


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rdfLiteral"

    public static class numericLiteral_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:527:1: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final SparqlT.numericLiteral_return numericLiteral() throws RecognitionException {
        SparqlT.numericLiteral_return retval = new SparqlT.numericLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SparqlT.numericLiteralUnsigned_return numericLiteralUnsigned537 = null;

        SparqlT.numericLiteralPositive_return numericLiteralPositive538 = null;

        SparqlT.numericLiteralNegative_return numericLiteralNegative539 = null;



        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:528:5: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt143=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt143=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt143=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt143=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:528:7: numericLiteralUnsigned
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral3938);
                    numericLiteralUnsigned537=numericLiteralUnsigned();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralUnsigned537.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:529:7: numericLiteralPositive
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral3946);
                    numericLiteralPositive538=numericLiteralPositive();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralPositive538.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:530:7: numericLiteralNegative
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral3954);
                    numericLiteralNegative539=numericLiteralNegative();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralNegative539.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class numericLiteralUnsigned_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralUnsigned"
    // com\\googlecode\\sparkleg\\SparqlT.g:533:1: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final SparqlT.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        SparqlT.numericLiteralUnsigned_return retval = new SparqlT.numericLiteralUnsigned_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set540=null;

        CommonTree set540_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:534:5: ( INTEGER | DECIMAL | DOUBLE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set540=(CommonTree)input.LT(1);
            if ( input.LA(1)==INTEGER||(input.LA(1)>=DECIMAL && input.LA(1)<=DOUBLE) ) {
                input.consume();

                set540_tree = (CommonTree)adaptor.dupNode(set540);

                adaptor.addChild(root_0, set540_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralUnsigned"

    public static class numericLiteralPositive_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralPositive"
    // com\\googlecode\\sparkleg\\SparqlT.g:539:1: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final SparqlT.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        SparqlT.numericLiteralPositive_return retval = new SparqlT.numericLiteralPositive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set541=null;

        CommonTree set541_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:540:5: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set541=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=INTEGER_POSITIVE && input.LA(1)<=DOUBLE_POSITIVE) ) {
                input.consume();

                set541_tree = (CommonTree)adaptor.dupNode(set541);

                adaptor.addChild(root_0, set541_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralPositive"

    public static class numericLiteralNegative_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralNegative"
    // com\\googlecode\\sparkleg\\SparqlT.g:545:1: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final SparqlT.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        SparqlT.numericLiteralNegative_return retval = new SparqlT.numericLiteralNegative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set542=null;

        CommonTree set542_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:546:5: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set542=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=INTEGER_NEGATIVE && input.LA(1)<=DOUBLE_NEGATIVE) ) {
                input.consume();

                set542_tree = (CommonTree)adaptor.dupNode(set542);

                adaptor.addChild(root_0, set542_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralNegative"

    public static class booleanLiteral_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // com\\googlecode\\sparkleg\\SparqlT.g:551:1: booleanLiteral : ( TRUE | FALSE );
    public final SparqlT.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SparqlT.booleanLiteral_return retval = new SparqlT.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set543=null;

        CommonTree set543_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:552:5: ( TRUE | FALSE )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set543=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();

                set543_tree = (CommonTree)adaptor.dupNode(set543);

                adaptor.addChild(root_0, set543_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class string_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // com\\googlecode\\sparkleg\\SparqlT.g:556:1: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final SparqlT.string_return string() throws RecognitionException {
        SparqlT.string_return retval = new SparqlT.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set544=null;

        CommonTree set544_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:557:5: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set544=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=STRING_LITERAL1 && input.LA(1)<=STRING_LITERAL_LONG2) ) {
                input.consume();

                set544_tree = (CommonTree)adaptor.dupNode(set544);

                adaptor.addChild(root_0, set544_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class iriRef_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iriRef"
    // com\\googlecode\\sparkleg\\SparqlT.g:563:1: iriRef : ( IRI_REF | prefixedName );
    public final SparqlT.iriRef_return iriRef() throws RecognitionException {
        SparqlT.iriRef_return retval = new SparqlT.iriRef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IRI_REF545=null;
        SparqlT.prefixedName_return prefixedName546 = null;


        CommonTree IRI_REF545_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:564:5: ( IRI_REF | prefixedName )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==IRI_REF) ) {
                alt144=1;
            }
            else if ( (LA144_0==PNAME_NS||LA144_0==PNAME_LN) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:564:7: IRI_REF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IRI_REF545=(CommonTree)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef4137); 
                    IRI_REF545_tree = (CommonTree)adaptor.dupNode(IRI_REF545);

                    adaptor.addChild(root_0, IRI_REF545_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:565:7: prefixedName
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_prefixedName_in_iriRef4145);
                    prefixedName546=prefixedName();

                    state._fsp--;

                    adaptor.addChild(root_0, prefixedName546.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iriRef"

    public static class prefixedName_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixedName"
    // com\\googlecode\\sparkleg\\SparqlT.g:568:1: prefixedName : ( PNAME_LN | PNAME_NS );
    public final SparqlT.prefixedName_return prefixedName() throws RecognitionException {
        SparqlT.prefixedName_return retval = new SparqlT.prefixedName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set547=null;

        CommonTree set547_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:569:5: ( PNAME_LN | PNAME_NS )
            // com\\googlecode\\sparkleg\\SparqlT.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set547=(CommonTree)input.LT(1);
            if ( input.LA(1)==PNAME_NS||input.LA(1)==PNAME_LN ) {
                input.consume();

                set547_tree = (CommonTree)adaptor.dupNode(set547);

                adaptor.addChild(root_0, set547_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixedName"

    public static class blankNode_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blankNode"
    // com\\googlecode\\sparkleg\\SparqlT.g:573:1: blankNode : ( BLANK_NODE_LABEL | anon );
    public final SparqlT.blankNode_return blankNode() throws RecognitionException {
        SparqlT.blankNode_return retval = new SparqlT.blankNode_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLANK_NODE_LABEL548=null;
        SparqlT.anon_return anon549 = null;


        CommonTree BLANK_NODE_LABEL548_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:574:5: ( BLANK_NODE_LABEL | anon )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==BLANK_NODE_LABEL) ) {
                alt145=1;
            }
            else if ( (LA145_0==OPEN_SQUARE_BRACKET) ) {
                alt145=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:574:7: BLANK_NODE_LABEL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    BLANK_NODE_LABEL548=(CommonTree)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode4187); 
                    BLANK_NODE_LABEL548_tree = (CommonTree)adaptor.dupNode(BLANK_NODE_LABEL548);

                    adaptor.addChild(root_0, BLANK_NODE_LABEL548_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\SparqlT.g:575:7: anon
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_anon_in_blankNode4195);
                    anon549=anon();

                    state._fsp--;

                    adaptor.addChild(root_0, anon549.getTree());

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blankNode"

    public static class anon_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anon"
    // com\\googlecode\\sparkleg\\SparqlT.g:578:1: anon : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET ;
    public final SparqlT.anon_return anon() throws RecognitionException {
        SparqlT.anon_return retval = new SparqlT.anon_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPEN_SQUARE_BRACKET550=null;
        CommonTree CLOSE_SQUARE_BRACKET551=null;

        CommonTree OPEN_SQUARE_BRACKET550_tree=null;
        CommonTree CLOSE_SQUARE_BRACKET551_tree=null;

        try {
            // com\\googlecode\\sparkleg\\SparqlT.g:579:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET )
            // com\\googlecode\\sparkleg\\SparqlT.g:579:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            OPEN_SQUARE_BRACKET550=(CommonTree)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon4212); 
            OPEN_SQUARE_BRACKET550_tree = (CommonTree)adaptor.dupNode(OPEN_SQUARE_BRACKET550);

            adaptor.addChild(root_0, OPEN_SQUARE_BRACKET550_tree);

            _last = (CommonTree)input.LT(1);
            CLOSE_SQUARE_BRACKET551=(CommonTree)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon4214); 
            CLOSE_SQUARE_BRACKET551_tree = (CommonTree)adaptor.dupNode(CLOSE_SQUARE_BRACKET551);

            adaptor.addChild(root_0, CLOSE_SQUARE_BRACKET551_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anon"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\11\1\2\1\3\1\uffff\2\3\5\uffff";
    static final String DFA16_maxS =
        "\1\11\1\2\1\61\1\uffff\2\61\5\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\1\2\uffff\1\4\1\2\1\5\1\3\1\6";
    static final String DFA16_specialS =
        "\13\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\2",
            "\1\6\7\uffff\1\6\41\uffff\1\4\1\5\1\3\1\uffff\1\6",
            "",
            "\1\10\7\uffff\1\10\43\uffff\1\7\1\uffff\1\10",
            "\1\12\7\uffff\1\12\43\uffff\1\11\1\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "62:1: selectClause : ( ^( SELECT_CLAUSE ASTERISK ) | ^( SELECT_CLAUSE DISTINCT ASTERISK ) | ^( SELECT_CLAUSE REDUCED ASTERISK ) | ^( SELECT_CLAUSE ( selectVariables )* ) | ^( SELECT_CLAUSE DISTINCT ( selectVariables )* ) | ^( SELECT_CLAUSE REDUCED ( selectVariables )* ) );";
        }
    }
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\13\uffff";
    static final String DFA23_minS =
        "\1\63\1\2\1\3\1\2\2\uffff\2\51\3\3";
    static final String DFA23_maxS =
        "\1\63\1\2\1\103\1\2\2\uffff\2\u00bf\2\3\1\103";
    static final String DFA23_acceptS =
        "\4\uffff\1\2\1\1\5\uffff";
    static final String DFA23_specialS =
        "\13\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\6\uffff\1\5\1\uffff\2\5\7\uffff\1\5\36\uffff\1\4\4\uffff"+
            "\1\3\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\10\1\uffff\1\11\16\uffff\1\7\u0084\uffff\1\11",
            "\1\10\1\uffff\1\11\u0093\uffff\1\11",
            "\1\12",
            "\1\12",
            "\1\5\6\uffff\1\5\1\uffff\2\5\46\uffff\1\4\4\uffff\1\3\3\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\1\5"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "76:1: constructQuery : ( ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* solutionModifier ) | ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) solutionModifier ) );";
        }
    }
 

    public static final BitSet FOLLOW_QUERY_in_query53 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prologue_in_query55 = new BitSet(new long[]{0x0188100000000008L});
    public static final BitSet FOLLOW_selectQuery_in_query57 = new BitSet(new long[]{0x0188100000000008L});
    public static final BitSet FOLLOW_constructQuery_in_query60 = new BitSet(new long[]{0x0188000000000008L});
    public static final BitSet FOLLOW_describeQuery_in_query63 = new BitSet(new long[]{0x0180000000000008L});
    public static final BitSet FOLLOW_askQuery_in_query66 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_bindingsClause_in_query70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_UPDATE_in_query80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_update_in_query82 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_PROLOGUE_in_prologue102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_baseDecl_in_prologue104 = new BitSet(new long[]{0x0000050000000008L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue107 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_BASE_in_baseDecl127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_baseDecl129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl150 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectQuery171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery173 = new BitSet(new long[]{0x2200000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_datasetClause_in_selectQuery175 = new BitSet(new long[]{0x2200000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_whereClause_in_selectQuery178 = new BitSet(new long[]{0x2000000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_in_subSelect200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_subSelect202 = new BitSet(new long[]{0x2000000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause243 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause257 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause271 = new BitSet(new long[]{0x0002000000000808L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause284 = new BitSet(new long[]{0x0002000000000808L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause286 = new BitSet(new long[]{0x0002000000000808L});
    public static final BitSet FOLLOW_SELECT_CLAUSE_in_selectClause297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause299 = new BitSet(new long[]{0x0002000000000808L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause301 = new BitSet(new long[]{0x0002000000000808L});
    public static final BitSet FOLLOW_VAR_in_selectVariables321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_selectVariables323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_selectVariables334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selectVariables336 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_selectVariables338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery361 = new BitSet(new long[]{0x2200000000203408L,0x000000000000000AL});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery364 = new BitSet(new long[]{0x2200000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_whereClause_in_constructQuery367 = new BitSet(new long[]{0x2000000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery382 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_WHERE_in_constructQuery386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesTemplate_in_constructQuery388 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_describeQuery413 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_describeQuery416 = new BitSet(new long[]{0x2200800000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery419 = new BitSet(new long[]{0x2200000000003408L,0x000000000000000AL});
    public static final BitSet FOLLOW_whereClause_in_describeQuery422 = new BitSet(new long[]{0x2000000000003008L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASK_in_askQuery444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery446 = new BitSet(new long[]{0x0200000000000400L});
    public static final BitSet FOLLOW_whereClause_in_askQuery449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FROM_in_datasetClause468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAMED_in_datasetClause470 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_datasetClause473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_CLAUSE_in_whereClause492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause494 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier516 = new BitSet(new long[]{0x2000000000002002L,0x000000000000000AL});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier519 = new BitSet(new long[]{0x0000000000002002L,0x000000000000000AL});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier522 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_BY_in_groupClause544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupCondition_in_groupClause546 = new BitSet(new long[]{0x0002000030000008L,0xFFC0060000000000L,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_groupCondition589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_groupCondition591 = new BitSet(new long[]{0x0000000000000008L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_groupCondition593 = new BitSet(new long[]{0x0000000000000008L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_groupCondition603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_havingClause621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_havingClause623 = new BitSet(new long[]{0x0000803C30000008L,0xFFFFF82400000000L,0x0000007FFFFFFFFFL});
    public static final BitSet FOLLOW_ORDER_BY_in_orderClause648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderCondition_in_orderClause650 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASC_in_orderCondition672 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_orderCondition674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESC_in_orderCondition686 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_orderCondition688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_orderCondition700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDER_CONDITION_in_orderCondition710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_orderCondition712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_limitOffsetClauses736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_limitOffsetClauses743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OFFSET_in_limitOffsetClauses757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIMIT_in_limitOffsetClauses764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitOffsetClauses766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BINDINGS_in_bindingsClause788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bindingsClause790 = new BitSet(new long[]{0x0000000000008008L,0x0000060000000000L});
    public static final BitSet FOLLOW_bindingValueList_in_bindingsClause793 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_BINDING_VALUE_in_bindingValueList817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bindingValue_in_bindingValueList819 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000002EL,0xFFFE000000000000L});
    public static final BitSet FOLLOW_iriRef_in_bindingValue843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_bindingValue847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_in_update880 = new BitSet(new long[]{0x0000000000000082L,0x000000000005DE40L});
    public static final BitSet FOLLOW_load_in_update882 = new BitSet(new long[]{0x0000000000000082L,0x000000000005DE40L});
    public static final BitSet FOLLOW_clear_in_update885 = new BitSet(new long[]{0x0000000000000082L,0x000000000005DE00L});
    public static final BitSet FOLLOW_drop_in_update888 = new BitSet(new long[]{0x0000000000000082L,0x000000000005DC00L});
    public static final BitSet FOLLOW_add_in_update891 = new BitSet(new long[]{0x0000000000000082L,0x000000000005D800L});
    public static final BitSet FOLLOW_move_in_update894 = new BitSet(new long[]{0x0000000000000082L,0x000000000005C800L});
    public static final BitSet FOLLOW_copy_in_update897 = new BitSet(new long[]{0x0000000000000082L,0x0000000000058800L});
    public static final BitSet FOLLOW_create_in_update900 = new BitSet(new long[]{0x0000000000000082L,0x0000000000050800L});
    public static final BitSet FOLLOW_insert_in_update903 = new BitSet(new long[]{0x0000000000000082L,0x0000000000050000L});
    public static final BitSet FOLLOW_delete_in_update906 = new BitSet(new long[]{0x0000000000000082L,0x0000000000040000L});
    public static final BitSet FOLLOW_modify_in_update909 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_LOAD_in_load939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_load941 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000008AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_load944 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
    public static final BitSet FOLLOW_graphRef_in_load946 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
    public static final BitSet FOLLOW_CLEAR_in_clear970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_clear972 = new BitSet(new long[]{0x0400000000000000L,0x0000000000E00080L});
    public static final BitSet FOLLOW_graphRefAll_in_clear975 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DROP_in_drop998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_drop1000 = new BitSet(new long[]{0x0400000000000000L,0x0000000000E00080L});
    public static final BitSet FOLLOW_graphRefAll_in_drop1003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_in_create1023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_create1025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400080L});
    public static final BitSet FOLLOW_graphRef_in_create1028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ADD_in_add1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_add1053 = new BitSet(new long[]{0x22008A0000003408L,0x000006000060008AL,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1056 = new BitSet(new long[]{0x22008A0000003408L,0x000006000060000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOVE_in_move1081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_move1083 = new BitSet(new long[]{0x22008A0000003408L,0x000006000060008AL,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1086 = new BitSet(new long[]{0x22008A0000003408L,0x000006000060000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1088 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COPY_in_copy1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_copy1113 = new BitSet(new long[]{0x22008A0000003408L,0x000006000060008AL,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1116 = new BitSet(new long[]{0x22008A0000003408L,0x000006000060000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert1137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATA_in_insert1139 = new BitSet(new long[]{0x0000000000010008L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadPattern_in_insert1141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_delete1166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_deleteData_in_delete1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteWhere_in_delete1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_deleteData1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATA_in_deleteData1194 = new BitSet(new long[]{0x0000000000010008L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteData1196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_deleteWhere1215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WHERE_in_deleteWhere1217 = new BitSet(new long[]{0x0000000000010008L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteWhere1219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFY_in_modify1242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WITH_in_modify1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_modify1247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_deleteClause_in_modify1250 = new BitSet(new long[]{0x0010000000000000L,0x0000000000150000L});
    public static final BitSet FOLLOW_insertClause_in_modify1253 = new BitSet(new long[]{0x0010000000000000L,0x0000000000110000L});
    public static final BitSet FOLLOW_usingClause_in_modify1256 = new BitSet(new long[]{0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHERE_in_modify1260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_modify1262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFY_in_modify1273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_deleteClause_in_modify1275 = new BitSet(new long[]{0x0010000000000000L,0x0000000000150000L});
    public static final BitSet FOLLOW_insertClause_in_modify1278 = new BitSet(new long[]{0x0010000000000000L,0x0000000000110000L});
    public static final BitSet FOLLOW_usingClause_in_modify1281 = new BitSet(new long[]{0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHERE_in_modify1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_modify1287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_deleteClause1308 = new BitSet(new long[]{0x0000000000010008L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteClause1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertClause1333 = new BitSet(new long[]{0x0000000000010008L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadPattern_in_insertClause1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_usingClause1353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NAMED_in_usingClause1355 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_usingClause1358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_in_graphOrDefault1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphOrDefault1388 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_graphOrDefault1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphRef1418 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_graphRef1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphRef_in_graphRefAll1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphRefAll1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_graphRefAll1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_graphRefAll1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quads_in_quadPattern1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads1487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadsNotTriples_in_quads1491 = new BitSet(new long[]{0x000000000001000AL,0x0000000000400000L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_GRAPH_in_quadsNotTriples1518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_quadsNotTriples1520 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_triplesTemplate_in_quadsNotTriples1522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_TEMPLATE_in_triplesTemplate1546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate1548 = new BitSet(new long[]{0x0000000001000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern1575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_GRAPH_PATTERN_in_groupGraphPattern1585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern1587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub1609 = new BitSet(new long[]{0x0000000000040002L,0x000000007E400000L});
    public static final BitSet FOLLOW_groupGraphPatternSubCache_in_groupGraphPatternSub1612 = new BitSet(new long[]{0x0000000000040002L,0x000000007E400000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubCache1635 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSubCache1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock1655 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusGraphPattern_in_graphPatternNotTriples1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNotTriples1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filter_in_graphPatternNotTriples1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNotTriples1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern1715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern1717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern1736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrIRIref_in_graphGraphPattern1738 = new BitSet(new long[]{0x0000000000040000L,0x0000000020000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern1740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern1759 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern1761 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern1764 = new BitSet(new long[]{0x0000000000040000L,0x0000000020000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern1766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIND_in_bind1789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_bind1791 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_AS_in_bind1794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_bind1796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_KEYWORD_in_minusGraphPattern1822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_minusGraphPattern1824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern1843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1845 = new BitSet(new long[]{0x0000000000040000L,0x0000000020000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILTER_in_filter1874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_filter1876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_constraint1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionCall1928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_functionCall1930 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ARG_LIST_in_functionCall1933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argList_in_functionCall1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_nil_in_argList1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_argList1962 = new BitSet(new long[]{0x0000803C00000002L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_argList1965 = new BitSet(new long[]{0x0000803C00000002L,0x003FF82400000000L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList1984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expressionList1986 = new BitSet(new long[]{0x0000803C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList1997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nil_in_expressionList1999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCT_TRIPLES_in_constructTemplate2019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate2021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples2040 = new BitSet(new long[]{0x000000000100000AL});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubject2062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject2064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2067 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubject2077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject2079 = new BitSet(new long[]{0x0000000002000008L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubject2083 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLANK_NODE_in_triplesSameSubject2085 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2088 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREDICATE_in_propertyListNotEmpty2114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty2116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty2120 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OBJECT_in_objectList2141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_objectList2143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verb2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubjectPath2200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubjectPath2202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2205 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRIPLES_SAME_SUBJECT_in_triplesSameSubjectPath2215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubjectPath2218 = new BitSet(new long[]{0x0000000002000008L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesSameSubjectPath2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLANK_NODE_in_triplesSameSubjectPath2224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath2227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_in_path2252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathSequence_in_path2254 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_PATH_SEQUENCE_in_pathSequence2275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence2277 = new BitSet(new long[]{0x0000000100000008L,0x0000000800000000L});
    public static final BitSet FOLLOW_INVERSE_in_pathEltOrInverse2300 = new BitSet(new long[]{0x0000000100000008L,0x0000000800000000L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt2328 = new BitSet(new long[]{0x0020800000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_pathMod_in_pathElt2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_pathMod2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_pathMod2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_pathMod2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_pathMod2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000004L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod2368 = new BitSet(new long[]{0x0040000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_pathMod2371 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod2378 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_pathMod2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod2392 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_pathPrimary2416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_A_in_pathPrimary2428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NEGATION_in_pathPrimary2440 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary2442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_PRIMARY_in_pathPrimary2452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_path_in_pathPrimary2454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATH_NEGATED_in_pathNegatedPropertySet2473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet2475 = new BitSet(new long[]{0x22008A0000003408L,0x000006090000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_INVERSE_in_pathOneInPropertySet2497 = new BitSet(new long[]{0x22008A0000003408L,0x000006010000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_pathOneInPropertySet2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathOneInPropertySet2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLECTION_in_triplesNode2525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_graphNode_in_triplesNode2527 = new BitSet(new long[]{0x22018A4000C03408L,0x000006800000000EL,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_TRIPLES_NODE_in_triplesNode2538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUBJECT_in_triplesNode2541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BLANK_NODE_in_triplesNode2543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesNode2546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_in_varOrTerm2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIRIref2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_graphTerm2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_nil2713 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_nil2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expression2733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2735 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expression2747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2749 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expression2761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2763 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expression2777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2779 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_in_expression2791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2793 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_in_expression2805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2807 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression2819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2821 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_expression2833 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2835 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_expression2849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2851 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expression2863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_expression2865 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2867 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expression2879 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2881 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2883 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expression2893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2895 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expression2908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2910 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expression2922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2924 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_expression2926 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unaryExpression_in_expression2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNARY_NOT_in_unaryExpression2958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression2960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_unaryExpression2970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression2972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_unaryExpression2982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression2984 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_in_unaryExpression2994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression2996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_builtInCall3057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANG_in_builtInCall3069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall3081 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3083 = new BitSet(new long[]{0x0000803C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall3094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall3106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_builtInCall3108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IRI_in_builtInCall3118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_URI_in_builtInCall3130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall3142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RAND_in_builtInCall3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_builtInCall3162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall3174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall3186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall3198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall3210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall3212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subStringExpression_in_builtInCall3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall3230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall3242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall3254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall3266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall3278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall3290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall3302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall3314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall3326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_in_builtInCall3338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall3350 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3352 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall3362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall3374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall3386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TZ_in_builtInCall3398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOW_in_builtInCall3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall3418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall3430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA224_in_builtInCall3442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall3454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall3466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall3478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall3490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall3492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_builtInCall3502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3504 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_builtInCall3506 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_builtInCall3508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall3518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3520 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_builtInCall3522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall3532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3534 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_builtInCall3536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall3546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3548 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_builtInCall3550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall3560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall3572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3574 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall3584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall3597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall3609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_builtInCall3611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_builtInCall3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunction_in_builtInCall3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression3654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_regexExpression3656 = new BitSet(new long[]{0x0000803C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_SUBSTR_in_subStringExpression3680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_subStringExpression3682 = new BitSet(new long[]{0x0000803C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction3706 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunction3708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXISTS_in_notExistsFunction3727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunction3729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_aggregate3748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3750 = new BitSet(new long[]{0x0000A03C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_ASTERISK_in_aggregate3753 = new BitSet(new long[]{0x0000803C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3756 = new BitSet(new long[]{0x0000803C00000008L,0x003FF82400000000L});
    public static final BitSet FOLLOW_SUM_in_aggregate3767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3769 = new BitSet(new long[]{0x0000A03C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3772 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MIN_in_aggregate3782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3784 = new BitSet(new long[]{0x0000A03C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3787 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAX_in_aggregate3797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3799 = new BitSet(new long[]{0x0000A03C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_aggregate3812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3814 = new BitSet(new long[]{0x0000A03C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate3827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3829 = new BitSet(new long[]{0x0000803C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate3842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate3844 = new BitSet(new long[]{0x0000A03C00000000L,0x003FF82400000000L});
    public static final BitSet FOLLOW_expression_in_aggregate3847 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x7800000000000000L});
    public static final BitSet FOLLOW_string_in_aggregate3849 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_iriRefOrFunction3882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction3884 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ARG_LIST_in_iriRefOrFunction3887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction3889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_in_rdfLiteral3908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral3916 = new BitSet(new long[]{0x22008A0000003408L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralUnsigned0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralPositive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralNegative0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixedName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon4212 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon4214 = new BitSet(new long[]{0x0000000000000002L});

}