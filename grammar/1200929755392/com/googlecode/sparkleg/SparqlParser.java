// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 com\\googlecode\\sparkleg\\Sparql.g 2011-07-24 22:37:15

    package com.googlecode.sparkleg;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

/**
 * @author Simone Tripodi   (simone.tripodi)
 * @author Michele Mostarda (michele.mostarda)
 * @author Juergen Pfundt   (Juergen.Pfundt)
 * @version $Id: Sparql.g 190 2011-07-24 13:59:46Z Juergen.Pfundt@web.de $
 */
public class SparqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "QUERY", "UPDATE", "PROLOGUE", "MODIFY", "SUBSELECT", "SELECT_CLAUSE", "WHERE_CLAUSE", "VAR", "GROUP_BY", "ORDER_BY", "ORDER_CONDITION", "BINDING_VALUE", "TRIPLES_TEMPLATE", "TRIPLES_BLOCK", "GROUP_GRAPH_PATTERN", "ARG_LIST", "EXPRESSION_LIST", "CONSTRUCT_TRIPLES", "TRIPLES_NODE", "COLLECTION", "TRIPLES_SAME_SUBJECT", "SUBJECT", "PREDICATE", "OBJECT", "NOT_EXISTS", "FUNCTION", "PATH", "PATH_SEQUENCE", "PATH_PRIMARY", "PATH_NEGATED", "UNARY_NOT", "UNARY_PLUS", "UNARY_MINUS", "UNARY", "BLANK_NODE", "SEMICOLON", "BASE", "IRI_REF", "PREFIX", "PNAME_NS", "SELECT", "DISTINCT", "REDUCED", "ASTERISK", "OPEN_BRACE", "AS", "CLOSE_BRACE", "CONSTRUCT", "WHERE", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", "DESCRIBE", "ASK", "FROM", "NAMED", "GROUP", "BY", "HAVING", "ORDER", "ASC", "DESC", "LIMIT", "INTEGER", "OFFSET", "BINDINGS", "UNDEF", "LOAD", "SILENT", "INTO", "CLEAR", "DROP", "CREATE", "ADD", "TO", "MOVE", "COPY", "INSERT", "DATA", "DELETE", "WITH", "USING", "DEFAULT", "GRAPH", "ALL", "DOT", "OPTIONAL", "SERVICE", "BIND", "MINUS_KEYWORD", "UNION", "FILTER", "COMMA", "A", "PIPE", "DIVIDE", "INVERSE", "QUESTION_MARK", "PLUS", "NEGATION", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "VAR1", "VAR2", "OR", "AND", "EQUAL", "NOT_EQUAL", "LESS", "GREATER", "LESS_EQUAL", "GREATER_EQUAL", "IN", "NOT", "MINUS", "STR", "LANG", "LANGMATCHES", "DATATYPE", "BOUND", "IRI", "URI", "BNODE", "RAND", "ABS", "CEIL", "FLOOR", "ROUND", "CONCAT", "STRLEN", "UCASE", "LCASE", "ENCODE_FOR_URI", "CONTAINS", "STRSTARTS", "STRENDS", "YEAR", "MONTH", "DAY", "HOURS", "MINUTES", "SECONDS", "TIMEZONE", "TZ", "NOW", "MD5", "SHA1", "SHA224", "SHA256", "SHA384", "SHA512", "COALESCE", "IF", "STRLANG", "STRDT", "SAMETERM", "ISIRI", "ISURI", "ISBLANK", "ISLITERAL", "ISNUMERIC", "REGEX", "SUBSTR", "EXISTS", "COUNT", "SUM", "MIN", "MAX", "AVG", "SAMPLE", "GROUP_CONCAT", "SEPARATOR", "LANGTAG", "REFERENCE", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "TRUE", "FALSE", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "PNAME_LN", "BLANK_NODE_LABEL", "EOL", "WS", "PN_PREFIX", "PN_LOCAL", "VARNAME", "DIGIT", "EXPONENT", "SIGN", "ECHAR", "IRI_REF_CHARACTERS", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "COMMENT", "ANY"
    };
    public static final int FUNCTION=29;
    public static final int GRAPH=86;
    public static final int CONTAINS=136;
    public static final int PNAME_LN=191;
    public static final int NOW=147;
    public static final int REGEX=164;
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
    public static final int DESCRIBE=55;
    public static final int PATH_PRIMARY=32;
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
    public static final int ASTERISK=47;
    public static final int ENCODE_FOR_URI=135;
    public static final int AS=49;
    public static final int STR=118;
    public static final int WHERE_CLAUSE=10;
    public static final int SAMPLE=172;
    public static final int TRIPLES_NODE=22;
    public static final int EXPRESSION_LIST=20;
    public static final int SUBSTR=165;
    public static final int OFFSET=67;
    public static final int RAND=126;
    public static final int AVG=171;
    public static final int DECIMAL_POSITIVE=180;
    public static final int GROUP_CONCAT=173;
    public static final int PIPE=97;
    public static final int PLUS=101;
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
    public static final int CLOSE_BRACE=50;
    public static final int MIN=169;
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
    public static final int TRIPLES_BLOCK=17;
    public static final int SHA1=149;
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
    public static final int OPEN_BRACE=48;
    public static final int SHA384=152;
    public static final int DATA=81;

    // delegates
    // delegators


        public SparqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SparqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SparqlParser.tokenNames; }
    public String getGrammarFileName() { return "com\\googlecode\\sparkleg\\Sparql.g"; }


    public static class query_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "query"
    // com\\googlecode\\sparkleg\\Sparql.g:77:1: query : ( prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | update ( SEMICOLON update )* EOF -> ^( UPDATE ( update )+ ) );
    public final SparqlParser.query_return query() throws RecognitionException {
        SparqlParser.query_return retval = new SparqlParser.query_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF7=null;
        Token SEMICOLON9=null;
        Token EOF11=null;
        SparqlParser.prologue_return prologue1 = null;

        SparqlParser.selectQuery_return selectQuery2 = null;

        SparqlParser.constructQuery_return constructQuery3 = null;

        SparqlParser.describeQuery_return describeQuery4 = null;

        SparqlParser.askQuery_return askQuery5 = null;

        SparqlParser.bindingsClause_return bindingsClause6 = null;

        SparqlParser.update_return update8 = null;

        SparqlParser.update_return update10 = null;


        Object EOF7_tree=null;
        Object SEMICOLON9_tree=null;
        Object EOF11_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_update=new RewriteRuleSubtreeStream(adaptor,"rule update");
        RewriteRuleSubtreeStream stream_describeQuery=new RewriteRuleSubtreeStream(adaptor,"rule describeQuery");
        RewriteRuleSubtreeStream stream_bindingsClause=new RewriteRuleSubtreeStream(adaptor,"rule bindingsClause");
        RewriteRuleSubtreeStream stream_constructQuery=new RewriteRuleSubtreeStream(adaptor,"rule constructQuery");
        RewriteRuleSubtreeStream stream_askQuery=new RewriteRuleSubtreeStream(adaptor,"rule askQuery");
        RewriteRuleSubtreeStream stream_prologue=new RewriteRuleSubtreeStream(adaptor,"rule prologue");
        RewriteRuleSubtreeStream stream_selectQuery=new RewriteRuleSubtreeStream(adaptor,"rule selectQuery");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:78:5: ( prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | update ( SEMICOLON update )* EOF -> ^( UPDATE ( update )+ ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:78:7: prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF
                    {
                    pushFollow(FOLLOW_prologue_in_query158);
                    prologue1=prologue();

                    state._fsp--;

                    stream_prologue.add(prologue1.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:78:16: ( selectQuery | constructQuery | describeQuery | askQuery )
                    int alt1=4;
                    switch ( input.LA(1) ) {
                    case SELECT:
                        {
                        alt1=1;
                        }
                        break;
                    case CONSTRUCT:
                        {
                        alt1=2;
                        }
                        break;
                    case DESCRIBE:
                        {
                        alt1=3;
                        }
                        break;
                    case ASK:
                        {
                        alt1=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:78:17: selectQuery
                            {
                            pushFollow(FOLLOW_selectQuery_in_query161);
                            selectQuery2=selectQuery();

                            state._fsp--;

                            stream_selectQuery.add(selectQuery2.getTree());

                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:78:31: constructQuery
                            {
                            pushFollow(FOLLOW_constructQuery_in_query165);
                            constructQuery3=constructQuery();

                            state._fsp--;

                            stream_constructQuery.add(constructQuery3.getTree());

                            }
                            break;
                        case 3 :
                            // com\\googlecode\\sparkleg\\Sparql.g:78:48: describeQuery
                            {
                            pushFollow(FOLLOW_describeQuery_in_query169);
                            describeQuery4=describeQuery();

                            state._fsp--;

                            stream_describeQuery.add(describeQuery4.getTree());

                            }
                            break;
                        case 4 :
                            // com\\googlecode\\sparkleg\\Sparql.g:78:64: askQuery
                            {
                            pushFollow(FOLLOW_askQuery_in_query173);
                            askQuery5=askQuery();

                            state._fsp--;

                            stream_askQuery.add(askQuery5.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bindingsClause_in_query176);
                    bindingsClause6=bindingsClause();

                    state._fsp--;

                    stream_bindingsClause.add(bindingsClause6.getTree());
                    EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_query178);  
                    stream_EOF.add(EOF7);



                    // AST REWRITE
                    // elements: askQuery, describeQuery, selectQuery, constructQuery, bindingsClause, prologue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:93: -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )*
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:78:96: ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY, "QUERY"), root_1);

                        adaptor.addChild(root_1, stream_prologue.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:78:113: ( selectQuery )*
                        while ( stream_selectQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_selectQuery.nextTree());

                        }
                        stream_selectQuery.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:78:126: ( constructQuery )*
                        while ( stream_constructQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_constructQuery.nextTree());

                        }
                        stream_constructQuery.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:78:142: ( describeQuery )*
                        while ( stream_describeQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_describeQuery.nextTree());

                        }
                        stream_describeQuery.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:78:157: ( askQuery )*
                        while ( stream_askQuery.hasNext() ) {
                            adaptor.addChild(root_1, stream_askQuery.nextTree());

                        }
                        stream_askQuery.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        // com\\googlecode\\sparkleg\\Sparql.g:78:168: ( bindingsClause )*
                        while ( stream_bindingsClause.hasNext() ) {
                            adaptor.addChild(root_0, stream_bindingsClause.nextTree());

                        }
                        stream_bindingsClause.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:79:7: update ( SEMICOLON update )* EOF
                    {
                    pushFollow(FOLLOW_update_in_query209);
                    update8=update();

                    state._fsp--;

                    stream_update.add(update8.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:79:14: ( SEMICOLON update )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==SEMICOLON) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:79:15: SEMICOLON update
                    	    {
                    	    SEMICOLON9=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_query212);  
                    	    stream_SEMICOLON.add(SEMICOLON9);

                    	    pushFollow(FOLLOW_update_in_query214);
                    	    update10=update();

                    	    state._fsp--;

                    	    stream_update.add(update10.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_query218);  
                    stream_EOF.add(EOF11);



                    // AST REWRITE
                    // elements: update
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:38: -> ^( UPDATE ( update )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:79:41: ^( UPDATE ( update )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UPDATE, "UPDATE"), root_1);

                        if ( !(stream_update.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_update.hasNext() ) {
                            adaptor.addChild(root_1, stream_update.nextTree());

                        }
                        stream_update.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "query"

    public static class prologue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prologue"
    // com\\googlecode\\sparkleg\\Sparql.g:82:1: prologue : ( baseDecl | prefixDecl )* -> ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) ;
    public final SparqlParser.prologue_return prologue() throws RecognitionException {
        SparqlParser.prologue_return retval = new SparqlParser.prologue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.baseDecl_return baseDecl12 = null;

        SparqlParser.prefixDecl_return prefixDecl13 = null;


        RewriteRuleSubtreeStream stream_prefixDecl=new RewriteRuleSubtreeStream(adaptor,"rule prefixDecl");
        RewriteRuleSubtreeStream stream_baseDecl=new RewriteRuleSubtreeStream(adaptor,"rule baseDecl");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:83:5: ( ( baseDecl | prefixDecl )* -> ^( PROLOGUE ( baseDecl )* ( prefixDecl )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:83:7: ( baseDecl | prefixDecl )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:83:7: ( baseDecl | prefixDecl )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BASE) ) {
                    alt4=1;
                }
                else if ( (LA4_0==PREFIX) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:83:8: baseDecl
            	    {
            	    pushFollow(FOLLOW_baseDecl_in_prologue245);
            	    baseDecl12=baseDecl();

            	    state._fsp--;

            	    stream_baseDecl.add(baseDecl12.getTree());

            	    }
            	    break;
            	case 2 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:83:19: prefixDecl
            	    {
            	    pushFollow(FOLLOW_prefixDecl_in_prologue249);
            	    prefixDecl13=prefixDecl();

            	    state._fsp--;

            	    stream_prefixDecl.add(prefixDecl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            // AST REWRITE
            // elements: prefixDecl, baseDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:32: -> ^( PROLOGUE ( baseDecl )* ( prefixDecl )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:83:35: ^( PROLOGUE ( baseDecl )* ( prefixDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROLOGUE, "PROLOGUE"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:83:46: ( baseDecl )*
                while ( stream_baseDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_baseDecl.nextTree());

                }
                stream_baseDecl.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:83:56: ( prefixDecl )*
                while ( stream_prefixDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_prefixDecl.nextTree());

                }
                stream_prefixDecl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prologue"

    public static class baseDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "baseDecl"
    // com\\googlecode\\sparkleg\\Sparql.g:86:1: baseDecl : BASE IRI_REF -> ^( BASE IRI_REF ) ;
    public final SparqlParser.baseDecl_return baseDecl() throws RecognitionException {
        SparqlParser.baseDecl_return retval = new SparqlParser.baseDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BASE14=null;
        Token IRI_REF15=null;

        Object BASE14_tree=null;
        Object IRI_REF15_tree=null;
        RewriteRuleTokenStream stream_BASE=new RewriteRuleTokenStream(adaptor,"token BASE");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:87:5: ( BASE IRI_REF -> ^( BASE IRI_REF ) )
            // com\\googlecode\\sparkleg\\Sparql.g:87:7: BASE IRI_REF
            {
            BASE14=(Token)match(input,BASE,FOLLOW_BASE_in_baseDecl280);  
            stream_BASE.add(BASE14);

            IRI_REF15=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_baseDecl282);  
            stream_IRI_REF.add(IRI_REF15);



            // AST REWRITE
            // elements: BASE, IRI_REF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:20: -> ^( BASE IRI_REF )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:87:23: ^( BASE IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_BASE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IRI_REF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "baseDecl"

    public static class prefixDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixDecl"
    // com\\googlecode\\sparkleg\\Sparql.g:90:1: prefixDecl : PREFIX PNAME_NS IRI_REF -> ^( PREFIX PNAME_NS IRI_REF ) ;
    public final SparqlParser.prefixDecl_return prefixDecl() throws RecognitionException {
        SparqlParser.prefixDecl_return retval = new SparqlParser.prefixDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PREFIX16=null;
        Token PNAME_NS17=null;
        Token IRI_REF18=null;

        Object PREFIX16_tree=null;
        Object PNAME_NS17_tree=null;
        Object IRI_REF18_tree=null;
        RewriteRuleTokenStream stream_PREFIX=new RewriteRuleTokenStream(adaptor,"token PREFIX");
        RewriteRuleTokenStream stream_PNAME_NS=new RewriteRuleTokenStream(adaptor,"token PNAME_NS");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:91:5: ( PREFIX PNAME_NS IRI_REF -> ^( PREFIX PNAME_NS IRI_REF ) )
            // com\\googlecode\\sparkleg\\Sparql.g:91:7: PREFIX PNAME_NS IRI_REF
            {
            PREFIX16=(Token)match(input,PREFIX,FOLLOW_PREFIX_in_prefixDecl307);  
            stream_PREFIX.add(PREFIX16);

            PNAME_NS17=(Token)match(input,PNAME_NS,FOLLOW_PNAME_NS_in_prefixDecl309);  
            stream_PNAME_NS.add(PNAME_NS17);

            IRI_REF18=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefixDecl311);  
            stream_IRI_REF.add(IRI_REF18);



            // AST REWRITE
            // elements: PNAME_NS, PREFIX, IRI_REF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:31: -> ^( PREFIX PNAME_NS IRI_REF )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:91:34: ^( PREFIX PNAME_NS IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PREFIX.nextNode(), root_1);

                adaptor.addChild(root_1, stream_PNAME_NS.nextNode());
                adaptor.addChild(root_1, stream_IRI_REF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixDecl"

    public static class selectQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:94:1: selectQuery : selectClause ( datasetClause )* whereClause solutionModifier -> ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* ) ;
    public final SparqlParser.selectQuery_return selectQuery() throws RecognitionException {
        SparqlParser.selectQuery_return retval = new SparqlParser.selectQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.selectClause_return selectClause19 = null;

        SparqlParser.datasetClause_return datasetClause20 = null;

        SparqlParser.whereClause_return whereClause21 = null;

        SparqlParser.solutionModifier_return solutionModifier22 = null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:95:5: ( selectClause ( datasetClause )* whereClause solutionModifier -> ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:95:7: selectClause ( datasetClause )* whereClause solutionModifier
            {
            pushFollow(FOLLOW_selectClause_in_selectQuery338);
            selectClause19=selectClause();

            state._fsp--;

            stream_selectClause.add(selectClause19.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:95:20: ( datasetClause )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FROM) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:95:20: datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_selectQuery340);
            	    datasetClause20=datasetClause();

            	    state._fsp--;

            	    stream_datasetClause.add(datasetClause20.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            pushFollow(FOLLOW_whereClause_in_selectQuery343);
            whereClause21=whereClause();

            state._fsp--;

            stream_whereClause.add(whereClause21.getTree());
            pushFollow(FOLLOW_solutionModifier_in_selectQuery345);
            solutionModifier22=solutionModifier();

            state._fsp--;

            stream_solutionModifier.add(solutionModifier22.getTree());


            // AST REWRITE
            // elements: whereClause, selectClause, solutionModifier, datasetClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:64: -> ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:95:67: ^( SELECT selectClause ( datasetClause )* ( whereClause )* ( solutionModifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);

                adaptor.addChild(root_1, stream_selectClause.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:95:89: ( datasetClause )*
                while ( stream_datasetClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_datasetClause.nextTree());

                }
                stream_datasetClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:95:104: ( whereClause )*
                while ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:95:117: ( solutionModifier )*
                while ( stream_solutionModifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                }
                stream_solutionModifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectQuery"

    public static class subSelect_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subSelect"
    // com\\googlecode\\sparkleg\\Sparql.g:98:1: subSelect : selectClause whereClause solutionModifier -> ^( SUBSELECT ( whereClause )* solutionModifier ) ;
    public final SparqlParser.subSelect_return subSelect() throws RecognitionException {
        SparqlParser.subSelect_return retval = new SparqlParser.subSelect_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.selectClause_return selectClause23 = null;

        SparqlParser.whereClause_return whereClause24 = null;

        SparqlParser.solutionModifier_return solutionModifier25 = null;


        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        RewriteRuleSubtreeStream stream_selectClause=new RewriteRuleSubtreeStream(adaptor,"rule selectClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:99:5: ( selectClause whereClause solutionModifier -> ^( SUBSELECT ( whereClause )* solutionModifier ) )
            // com\\googlecode\\sparkleg\\Sparql.g:99:7: selectClause whereClause solutionModifier
            {
            pushFollow(FOLLOW_selectClause_in_subSelect379);
            selectClause23=selectClause();

            state._fsp--;

            stream_selectClause.add(selectClause23.getTree());
            pushFollow(FOLLOW_whereClause_in_subSelect381);
            whereClause24=whereClause();

            state._fsp--;

            stream_whereClause.add(whereClause24.getTree());
            pushFollow(FOLLOW_solutionModifier_in_subSelect383);
            solutionModifier25=solutionModifier();

            state._fsp--;

            stream_solutionModifier.add(solutionModifier25.getTree());


            // AST REWRITE
            // elements: whereClause, solutionModifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:49: -> ^( SUBSELECT ( whereClause )* solutionModifier )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:99:52: ^( SUBSELECT ( whereClause )* solutionModifier )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBSELECT, "SUBSELECT"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:99:64: ( whereClause )*
                while ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subSelect"

    public static class selectClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectClause"
    // com\\googlecode\\sparkleg\\Sparql.g:102:1: selectClause : ( SELECT ( DISTINCT | REDUCED )? ASTERISK -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK ) | SELECT ( DISTINCT | REDUCED )? (v+= selectVariables )+ -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* ) );
    public final SparqlParser.selectClause_return selectClause() throws RecognitionException {
        SparqlParser.selectClause_return retval = new SparqlParser.selectClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELECT26=null;
        Token DISTINCT27=null;
        Token REDUCED28=null;
        Token ASTERISK29=null;
        Token SELECT30=null;
        Token DISTINCT31=null;
        Token REDUCED32=null;
        List list_v=null;
        SparqlParser.selectVariables_return v = null;
         v = null;
        Object SELECT26_tree=null;
        Object DISTINCT27_tree=null;
        Object REDUCED28_tree=null;
        Object ASTERISK29_tree=null;
        Object SELECT30_tree=null;
        Object DISTINCT31_tree=null;
        Object REDUCED32_tree=null;
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_REDUCED=new RewriteRuleTokenStream(adaptor,"token REDUCED");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_selectVariables=new RewriteRuleSubtreeStream(adaptor,"rule selectVariables");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:103:5: ( SELECT ( DISTINCT | REDUCED )? ASTERISK -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK ) | SELECT ( DISTINCT | REDUCED )? (v+= selectVariables )+ -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SELECT) ) {
                switch ( input.LA(2) ) {
                case DISTINCT:
                    {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==ASTERISK) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==OPEN_BRACE||(LA9_2>=VAR1 && LA9_2<=VAR2)) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case REDUCED:
                    {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==OPEN_BRACE||(LA9_3>=VAR1 && LA9_3<=VAR2)) ) {
                        alt9=2;
                    }
                    else if ( (LA9_3==ASTERISK) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case ASTERISK:
                    {
                    alt9=1;
                    }
                    break;
                case OPEN_BRACE:
                case VAR1:
                case VAR2:
                    {
                    alt9=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:103:7: SELECT ( DISTINCT | REDUCED )? ASTERISK
                    {
                    SELECT26=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause416);  
                    stream_SELECT.add(SELECT26);

                    // com\\googlecode\\sparkleg\\Sparql.g:103:14: ( DISTINCT | REDUCED )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==DISTINCT) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==REDUCED) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:103:15: DISTINCT
                            {
                            DISTINCT27=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause419);  
                            stream_DISTINCT.add(DISTINCT27);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:103:26: REDUCED
                            {
                            REDUCED28=(Token)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause423);  
                            stream_REDUCED.add(REDUCED28);


                            }
                            break;

                    }

                    ASTERISK29=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_selectClause427);  
                    stream_ASTERISK.add(ASTERISK29);



                    // AST REWRITE
                    // elements: REDUCED, ASTERISK, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:45: -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:103:48: ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ASTERISK )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CLAUSE, "SELECT_CLAUSE"), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:103:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:103:74: ( REDUCED )*
                        while ( stream_REDUCED.hasNext() ) {
                            adaptor.addChild(root_1, stream_REDUCED.nextNode());

                        }
                        stream_REDUCED.reset();
                        adaptor.addChild(root_1, stream_ASTERISK.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:104:7: SELECT ( DISTINCT | REDUCED )? (v+= selectVariables )+
                    {
                    SELECT30=(Token)match(input,SELECT,FOLLOW_SELECT_in_selectClause449);  
                    stream_SELECT.add(SELECT30);

                    // com\\googlecode\\sparkleg\\Sparql.g:104:14: ( DISTINCT | REDUCED )?
                    int alt7=3;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==DISTINCT) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==REDUCED) ) {
                        alt7=2;
                    }
                    switch (alt7) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:104:15: DISTINCT
                            {
                            DISTINCT31=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause452);  
                            stream_DISTINCT.add(DISTINCT31);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:104:26: REDUCED
                            {
                            REDUCED32=(Token)match(input,REDUCED,FOLLOW_REDUCED_in_selectClause456);  
                            stream_REDUCED.add(REDUCED32);


                            }
                            break;

                    }

                    // com\\googlecode\\sparkleg\\Sparql.g:104:36: (v+= selectVariables )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==OPEN_BRACE||(LA8_0>=VAR1 && LA8_0<=VAR2)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:104:37: v+= selectVariables
                    	    {
                    	    pushFollow(FOLLOW_selectVariables_in_selectClause463);
                    	    v=selectVariables();

                    	    state._fsp--;

                    	    stream_selectVariables.add(v.getTree());
                    	    if (list_v==null) list_v=new ArrayList();
                    	    list_v.add(v.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);



                    // AST REWRITE
                    // elements: REDUCED, DISTINCT, v
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: v
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",list_v);
                    root_0 = (Object)adaptor.nil();
                    // 104:58: -> ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:104:61: ^( SELECT_CLAUSE ( DISTINCT )* ( REDUCED )* ( $v)* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT_CLAUSE, "SELECT_CLAUSE"), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:104:77: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:104:87: ( REDUCED )*
                        while ( stream_REDUCED.hasNext() ) {
                            adaptor.addChild(root_1, stream_REDUCED.nextNode());

                        }
                        stream_REDUCED.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:104:96: ( $v)*
                        while ( stream_v.hasNext() ) {
                            adaptor.addChild(root_1, stream_v.nextTree());

                        }
                        stream_v.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectClause"

    public static class selectVariables_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectVariables"
    // com\\googlecode\\sparkleg\\Sparql.g:107:1: selectVariables : ( var -> ^( VAR var ) | OPEN_BRACE expression AS var CLOSE_BRACE -> ^( AS expression var ) );
    public final SparqlParser.selectVariables_return selectVariables() throws RecognitionException {
        SparqlParser.selectVariables_return retval = new SparqlParser.selectVariables_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE34=null;
        Token AS36=null;
        Token CLOSE_BRACE38=null;
        SparqlParser.var_return var33 = null;

        SparqlParser.expression_return expression35 = null;

        SparqlParser.var_return var37 = null;


        Object OPEN_BRACE34_tree=null;
        Object AS36_tree=null;
        Object CLOSE_BRACE38_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:108:5: ( var -> ^( VAR var ) | OPEN_BRACE expression AS var CLOSE_BRACE -> ^( AS expression var ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=VAR1 && LA10_0<=VAR2)) ) {
                alt10=1;
            }
            else if ( (LA10_0==OPEN_BRACE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:108:7: var
                    {
                    pushFollow(FOLLOW_var_in_selectVariables498);
                    var33=var();

                    state._fsp--;

                    stream_var.add(var33.getTree());


                    // AST REWRITE
                    // elements: var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:11: -> ^( VAR var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:108:14: ^( VAR var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:109:7: OPEN_BRACE expression AS var CLOSE_BRACE
                    {
                    OPEN_BRACE34=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_selectVariables515);  
                    stream_OPEN_BRACE.add(OPEN_BRACE34);

                    pushFollow(FOLLOW_expression_in_selectVariables517);
                    expression35=expression();

                    state._fsp--;

                    stream_expression.add(expression35.getTree());
                    AS36=(Token)match(input,AS,FOLLOW_AS_in_selectVariables519);  
                    stream_AS.add(AS36);

                    pushFollow(FOLLOW_var_in_selectVariables521);
                    var37=var();

                    state._fsp--;

                    stream_var.add(var37.getTree());
                    CLOSE_BRACE38=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_selectVariables523);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE38);



                    // AST REWRITE
                    // elements: expression, var, AS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:48: -> ^( AS expression var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:109:51: ^( AS expression var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectVariables"

    public static class constructQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:112:1: constructQuery : ( CONSTRUCT constructTemplate ( datasetClause )* whereClause solutionModifier -> ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* ( solutionModifier )* ) | CONSTRUCT ( datasetClause )* WHERE OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE solutionModifier -> ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) ( solutionModifier )* ) );
    public final SparqlParser.constructQuery_return constructQuery() throws RecognitionException {
        SparqlParser.constructQuery_return retval = new SparqlParser.constructQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTRUCT39=null;
        Token CONSTRUCT44=null;
        Token WHERE46=null;
        Token OPEN_CURLY_BRACE47=null;
        Token CLOSE_CURLY_BRACE49=null;
        SparqlParser.constructTemplate_return constructTemplate40 = null;

        SparqlParser.datasetClause_return datasetClause41 = null;

        SparqlParser.whereClause_return whereClause42 = null;

        SparqlParser.solutionModifier_return solutionModifier43 = null;

        SparqlParser.datasetClause_return datasetClause45 = null;

        SparqlParser.triplesTemplate_return triplesTemplate48 = null;

        SparqlParser.solutionModifier_return solutionModifier50 = null;


        Object CONSTRUCT39_tree=null;
        Object CONSTRUCT44_tree=null;
        Object WHERE46_tree=null;
        Object OPEN_CURLY_BRACE47_tree=null;
        Object CLOSE_CURLY_BRACE49_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_CONSTRUCT=new RewriteRuleTokenStream(adaptor,"token CONSTRUCT");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_triplesTemplate=new RewriteRuleSubtreeStream(adaptor,"rule triplesTemplate");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        RewriteRuleSubtreeStream stream_constructTemplate=new RewriteRuleSubtreeStream(adaptor,"rule constructTemplate");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:113:5: ( CONSTRUCT constructTemplate ( datasetClause )* whereClause solutionModifier -> ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* ( solutionModifier )* ) | CONSTRUCT ( datasetClause )* WHERE OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE solutionModifier -> ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) ( solutionModifier )* ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==CONSTRUCT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==OPEN_CURLY_BRACE) ) {
                    alt14=1;
                }
                else if ( (LA14_1==WHERE||LA14_1==FROM) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:113:7: CONSTRUCT constructTemplate ( datasetClause )* whereClause solutionModifier
                    {
                    CONSTRUCT39=(Token)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery552);  
                    stream_CONSTRUCT.add(CONSTRUCT39);

                    pushFollow(FOLLOW_constructTemplate_in_constructQuery554);
                    constructTemplate40=constructTemplate();

                    state._fsp--;

                    stream_constructTemplate.add(constructTemplate40.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:113:35: ( datasetClause )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==FROM) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:113:35: datasetClause
                    	    {
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery556);
                    	    datasetClause41=datasetClause();

                    	    state._fsp--;

                    	    stream_datasetClause.add(datasetClause41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    pushFollow(FOLLOW_whereClause_in_constructQuery559);
                    whereClause42=whereClause();

                    state._fsp--;

                    stream_whereClause.add(whereClause42.getTree());
                    pushFollow(FOLLOW_solutionModifier_in_constructQuery561);
                    solutionModifier43=solutionModifier();

                    state._fsp--;

                    stream_solutionModifier.add(solutionModifier43.getTree());


                    // AST REWRITE
                    // elements: constructTemplate, solutionModifier, whereClause, datasetClause, CONSTRUCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 113:79: -> ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* ( solutionModifier )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:113:82: ^( CONSTRUCT ( constructTemplate )* ( datasetClause )* ( whereClause )* ( solutionModifier )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONSTRUCT.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:113:94: ( constructTemplate )*
                        while ( stream_constructTemplate.hasNext() ) {
                            adaptor.addChild(root_1, stream_constructTemplate.nextTree());

                        }
                        stream_constructTemplate.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:113:113: ( datasetClause )*
                        while ( stream_datasetClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_datasetClause.nextTree());

                        }
                        stream_datasetClause.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:113:128: ( whereClause )*
                        while ( stream_whereClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_whereClause.nextTree());

                        }
                        stream_whereClause.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:113:141: ( solutionModifier )*
                        while ( stream_solutionModifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                        }
                        stream_solutionModifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:114:7: CONSTRUCT ( datasetClause )* WHERE OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE solutionModifier
                    {
                    CONSTRUCT44=(Token)match(input,CONSTRUCT,FOLLOW_CONSTRUCT_in_constructQuery587);  
                    stream_CONSTRUCT.add(CONSTRUCT44);

                    // com\\googlecode\\sparkleg\\Sparql.g:114:17: ( datasetClause )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==FROM) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:114:17: datasetClause
                    	    {
                    	    pushFollow(FOLLOW_datasetClause_in_constructQuery589);
                    	    datasetClause45=datasetClause();

                    	    state._fsp--;

                    	    stream_datasetClause.add(datasetClause45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    WHERE46=(Token)match(input,WHERE,FOLLOW_WHERE_in_constructQuery592);  
                    stream_WHERE.add(WHERE46);

                    OPEN_CURLY_BRACE47=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_constructQuery594);  
                    stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE47);

                    // com\\googlecode\\sparkleg\\Sparql.g:114:55: ( triplesTemplate )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==IRI_REF||LA13_0==PNAME_NS||LA13_0==OPEN_BRACE||LA13_0==INTEGER||LA13_0==OPEN_SQUARE_BRACKET||(LA13_0>=VAR1 && LA13_0<=VAR2)||(LA13_0>=DECIMAL && LA13_0<=BLANK_NODE_LABEL)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:114:55: triplesTemplate
                            {
                            pushFollow(FOLLOW_triplesTemplate_in_constructQuery596);
                            triplesTemplate48=triplesTemplate();

                            state._fsp--;

                            stream_triplesTemplate.add(triplesTemplate48.getTree());

                            }
                            break;

                    }

                    CLOSE_CURLY_BRACE49=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_constructQuery599);  
                    stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE49);

                    pushFollow(FOLLOW_solutionModifier_in_constructQuery601);
                    solutionModifier50=solutionModifier();

                    state._fsp--;

                    stream_solutionModifier.add(solutionModifier50.getTree());


                    // AST REWRITE
                    // elements: solutionModifier, WHERE, triplesTemplate, CONSTRUCT, datasetClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:107: -> ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) ( solutionModifier )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:114:110: ^( CONSTRUCT ( datasetClause )* ^( WHERE ( triplesTemplate )* ) ( solutionModifier )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONSTRUCT.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:114:122: ( datasetClause )*
                        while ( stream_datasetClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_datasetClause.nextTree());

                        }
                        stream_datasetClause.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:114:137: ^( WHERE ( triplesTemplate )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                        // com\\googlecode\\sparkleg\\Sparql.g:114:145: ( triplesTemplate )*
                        while ( stream_triplesTemplate.hasNext() ) {
                            adaptor.addChild(root_2, stream_triplesTemplate.nextTree());

                        }
                        stream_triplesTemplate.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // com\\googlecode\\sparkleg\\Sparql.g:114:163: ( solutionModifier )*
                        while ( stream_solutionModifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                        }
                        stream_solutionModifier.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructQuery"

    public static class describeQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "describeQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:117:1: describeQuery : DESCRIBE ( (v+= varOrIRIref )+ | ASTERISK ) ( datasetClause )* ( whereClause )? solutionModifier -> ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* ) ;
    public final SparqlParser.describeQuery_return describeQuery() throws RecognitionException {
        SparqlParser.describeQuery_return retval = new SparqlParser.describeQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DESCRIBE51=null;
        Token ASTERISK52=null;
        List list_v=null;
        SparqlParser.datasetClause_return datasetClause53 = null;

        SparqlParser.whereClause_return whereClause54 = null;

        SparqlParser.solutionModifier_return solutionModifier55 = null;

        SparqlParser.varOrIRIref_return v = null;
         v = null;
        Object DESCRIBE51_tree=null;
        Object ASTERISK52_tree=null;
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_DESCRIBE=new RewriteRuleTokenStream(adaptor,"token DESCRIBE");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        RewriteRuleSubtreeStream stream_solutionModifier=new RewriteRuleSubtreeStream(adaptor,"rule solutionModifier");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:118:5: ( DESCRIBE ( (v+= varOrIRIref )+ | ASTERISK ) ( datasetClause )* ( whereClause )? solutionModifier -> ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:118:7: DESCRIBE ( (v+= varOrIRIref )+ | ASTERISK ) ( datasetClause )* ( whereClause )? solutionModifier
            {
            DESCRIBE51=(Token)match(input,DESCRIBE,FOLLOW_DESCRIBE_in_describeQuery637);  
            stream_DESCRIBE.add(DESCRIBE51);

            // com\\googlecode\\sparkleg\\Sparql.g:118:16: ( (v+= varOrIRIref )+ | ASTERISK )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IRI_REF||LA16_0==PNAME_NS||(LA16_0>=VAR1 && LA16_0<=VAR2)||LA16_0==PNAME_LN) ) {
                alt16=1;
            }
            else if ( (LA16_0==ASTERISK) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:118:17: (v+= varOrIRIref )+
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:118:17: (v+= varOrIRIref )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==IRI_REF||LA15_0==PNAME_NS||(LA15_0>=VAR1 && LA15_0<=VAR2)||LA15_0==PNAME_LN) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:118:18: v+= varOrIRIref
                    	    {
                    	    pushFollow(FOLLOW_varOrIRIref_in_describeQuery643);
                    	    v=varOrIRIref();

                    	    state._fsp--;

                    	    stream_varOrIRIref.add(v.getTree());
                    	    if (list_v==null) list_v=new ArrayList();
                    	    list_v.add(v.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:118:37: ASTERISK
                    {
                    ASTERISK52=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_describeQuery649);  
                    stream_ASTERISK.add(ASTERISK52);


                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:118:47: ( datasetClause )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==FROM) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:118:47: datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_describeQuery652);
            	    datasetClause53=datasetClause();

            	    state._fsp--;

            	    stream_datasetClause.add(datasetClause53.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\Sparql.g:118:62: ( whereClause )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=WHERE && LA18_0<=OPEN_CURLY_BRACE)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:118:62: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_describeQuery655);
                    whereClause54=whereClause();

                    state._fsp--;

                    stream_whereClause.add(whereClause54.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_solutionModifier_in_describeQuery658);
            solutionModifier55=solutionModifier();

            state._fsp--;

            stream_solutionModifier.add(solutionModifier55.getTree());


            // AST REWRITE
            // elements: ASTERISK, DESCRIBE, whereClause, datasetClause, v, solutionModifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: v
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",list_v);
            root_0 = (Object)adaptor.nil();
            // 118:92: -> ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:118:95: ^( DESCRIBE ( $v)* ( ASTERISK )* ( datasetClause )* ( whereClause )? ( solutionModifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DESCRIBE.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:118:106: ( $v)*
                while ( stream_v.hasNext() ) {
                    adaptor.addChild(root_1, stream_v.nextTree());

                }
                stream_v.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:118:110: ( ASTERISK )*
                while ( stream_ASTERISK.hasNext() ) {
                    adaptor.addChild(root_1, stream_ASTERISK.nextNode());

                }
                stream_ASTERISK.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:118:120: ( datasetClause )*
                while ( stream_datasetClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_datasetClause.nextTree());

                }
                stream_datasetClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:118:135: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:118:148: ( solutionModifier )*
                while ( stream_solutionModifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_solutionModifier.nextTree());

                }
                stream_solutionModifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "describeQuery"

    public static class askQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "askQuery"
    // com\\googlecode\\sparkleg\\Sparql.g:121:1: askQuery : ASK ( datasetClause )* whereClause -> ^( ASK ( datasetClause )* whereClause ) ;
    public final SparqlParser.askQuery_return askQuery() throws RecognitionException {
        SparqlParser.askQuery_return retval = new SparqlParser.askQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASK56=null;
        SparqlParser.datasetClause_return datasetClause57 = null;

        SparqlParser.whereClause_return whereClause58 = null;


        Object ASK56_tree=null;
        RewriteRuleTokenStream stream_ASK=new RewriteRuleTokenStream(adaptor,"token ASK");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_datasetClause=new RewriteRuleSubtreeStream(adaptor,"rule datasetClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:122:5: ( ASK ( datasetClause )* whereClause -> ^( ASK ( datasetClause )* whereClause ) )
            // com\\googlecode\\sparkleg\\Sparql.g:122:7: ASK ( datasetClause )* whereClause
            {
            ASK56=(Token)match(input,ASK,FOLLOW_ASK_in_askQuery697);  
            stream_ASK.add(ASK56);

            // com\\googlecode\\sparkleg\\Sparql.g:122:11: ( datasetClause )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==FROM) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:122:11: datasetClause
            	    {
            	    pushFollow(FOLLOW_datasetClause_in_askQuery699);
            	    datasetClause57=datasetClause();

            	    state._fsp--;

            	    stream_datasetClause.add(datasetClause57.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            pushFollow(FOLLOW_whereClause_in_askQuery702);
            whereClause58=whereClause();

            state._fsp--;

            stream_whereClause.add(whereClause58.getTree());


            // AST REWRITE
            // elements: datasetClause, whereClause, ASK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 122:38: -> ^( ASK ( datasetClause )* whereClause )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:122:41: ^( ASK ( datasetClause )* whereClause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ASK.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:122:47: ( datasetClause )*
                while ( stream_datasetClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_datasetClause.nextTree());

                }
                stream_datasetClause.reset();
                adaptor.addChild(root_1, stream_whereClause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "askQuery"

    public static class datasetClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datasetClause"
    // com\\googlecode\\sparkleg\\Sparql.g:125:1: datasetClause : FROM ( NAMED )? iriRef -> ^( FROM ( NAMED )? iriRef ) ;
    public final SparqlParser.datasetClause_return datasetClause() throws RecognitionException {
        SparqlParser.datasetClause_return retval = new SparqlParser.datasetClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FROM59=null;
        Token NAMED60=null;
        SparqlParser.iriRef_return iriRef61 = null;


        Object FROM59_tree=null;
        Object NAMED60_tree=null;
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_NAMED=new RewriteRuleTokenStream(adaptor,"token NAMED");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:126:5: ( FROM ( NAMED )? iriRef -> ^( FROM ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\Sparql.g:126:7: FROM ( NAMED )? iriRef
            {
            FROM59=(Token)match(input,FROM,FOLLOW_FROM_in_datasetClause730);  
            stream_FROM.add(FROM59);

            // com\\googlecode\\sparkleg\\Sparql.g:126:12: ( NAMED )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NAMED) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:126:12: NAMED
                    {
                    NAMED60=(Token)match(input,NAMED,FOLLOW_NAMED_in_datasetClause732);  
                    stream_NAMED.add(NAMED60);


                    }
                    break;

            }

            pushFollow(FOLLOW_iriRef_in_datasetClause735);
            iriRef61=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef61.getTree());


            // AST REWRITE
            // elements: FROM, iriRef, NAMED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:26: -> ^( FROM ( NAMED )? iriRef )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:126:29: ^( FROM ( NAMED )? iriRef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FROM.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:126:36: ( NAMED )?
                if ( stream_NAMED.hasNext() ) {
                    adaptor.addChild(root_1, stream_NAMED.nextNode());

                }
                stream_NAMED.reset();
                adaptor.addChild(root_1, stream_iriRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datasetClause"

    public static class whereClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // com\\googlecode\\sparkleg\\Sparql.g:129:1: whereClause : ( WHERE )? groupGraphPattern -> ^( WHERE_CLAUSE groupGraphPattern ) ;
    public final SparqlParser.whereClause_return whereClause() throws RecognitionException {
        SparqlParser.whereClause_return retval = new SparqlParser.whereClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE62=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern63 = null;


        Object WHERE62_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:130:5: ( ( WHERE )? groupGraphPattern -> ^( WHERE_CLAUSE groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:130:7: ( WHERE )? groupGraphPattern
            {
            // com\\googlecode\\sparkleg\\Sparql.g:130:7: ( WHERE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==WHERE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:130:7: WHERE
                    {
                    WHERE62=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause763);  
                    stream_WHERE.add(WHERE62);


                    }
                    break;

            }

            pushFollow(FOLLOW_groupGraphPattern_in_whereClause766);
            groupGraphPattern63=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern63.getTree());


            // AST REWRITE
            // elements: groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:32: -> ^( WHERE_CLAUSE groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:130:35: ^( WHERE_CLAUSE groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHERE_CLAUSE, "WHERE_CLAUSE"), root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whereClause"

    public static class solutionModifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "solutionModifier"
    // com\\googlecode\\sparkleg\\Sparql.g:133:1: solutionModifier : ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? -> ( groupClause )* ( havingClause )* ( orderClause )* ( limitOffsetClauses )* ;
    public final SparqlParser.solutionModifier_return solutionModifier() throws RecognitionException {
        SparqlParser.solutionModifier_return retval = new SparqlParser.solutionModifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.groupClause_return groupClause64 = null;

        SparqlParser.havingClause_return havingClause65 = null;

        SparqlParser.orderClause_return orderClause66 = null;

        SparqlParser.limitOffsetClauses_return limitOffsetClauses67 = null;


        RewriteRuleSubtreeStream stream_limitOffsetClauses=new RewriteRuleSubtreeStream(adaptor,"rule limitOffsetClauses");
        RewriteRuleSubtreeStream stream_orderClause=new RewriteRuleSubtreeStream(adaptor,"rule orderClause");
        RewriteRuleSubtreeStream stream_groupClause=new RewriteRuleSubtreeStream(adaptor,"rule groupClause");
        RewriteRuleSubtreeStream stream_havingClause=new RewriteRuleSubtreeStream(adaptor,"rule havingClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:134:5: ( ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )? -> ( groupClause )* ( havingClause )* ( orderClause )* ( limitOffsetClauses )* )
            // com\\googlecode\\sparkleg\\Sparql.g:134:7: ( groupClause )? ( havingClause )? ( orderClause )? ( limitOffsetClauses )?
            {
            // com\\googlecode\\sparkleg\\Sparql.g:134:7: ( groupClause )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==GROUP) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:7: groupClause
                    {
                    pushFollow(FOLLOW_groupClause_in_solutionModifier791);
                    groupClause64=groupClause();

                    state._fsp--;

                    stream_groupClause.add(groupClause64.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:134:20: ( havingClause )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==HAVING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:20: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_solutionModifier794);
                    havingClause65=havingClause();

                    state._fsp--;

                    stream_havingClause.add(havingClause65.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:134:34: ( orderClause )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ORDER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:34: orderClause
                    {
                    pushFollow(FOLLOW_orderClause_in_solutionModifier797);
                    orderClause66=orderClause();

                    state._fsp--;

                    stream_orderClause.add(orderClause66.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:134:47: ( limitOffsetClauses )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LIMIT||LA25_0==OFFSET) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:134:47: limitOffsetClauses
                    {
                    pushFollow(FOLLOW_limitOffsetClauses_in_solutionModifier800);
                    limitOffsetClauses67=limitOffsetClauses();

                    state._fsp--;

                    stream_limitOffsetClauses.add(limitOffsetClauses67.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: orderClause, limitOffsetClauses, groupClause, havingClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:67: -> ( groupClause )* ( havingClause )* ( orderClause )* ( limitOffsetClauses )*
            {
                // com\\googlecode\\sparkleg\\Sparql.g:134:70: ( groupClause )*
                while ( stream_groupClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_groupClause.nextTree());

                }
                stream_groupClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:134:83: ( havingClause )*
                while ( stream_havingClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_havingClause.nextTree());

                }
                stream_havingClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:134:97: ( orderClause )*
                while ( stream_orderClause.hasNext() ) {
                    adaptor.addChild(root_0, stream_orderClause.nextTree());

                }
                stream_orderClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:134:110: ( limitOffsetClauses )*
                while ( stream_limitOffsetClauses.hasNext() ) {
                    adaptor.addChild(root_0, stream_limitOffsetClauses.nextTree());

                }
                stream_limitOffsetClauses.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "solutionModifier"

    public static class groupClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupClause"
    // com\\googlecode\\sparkleg\\Sparql.g:137:1: groupClause : GROUP BY ( groupCondition )+ -> ^( GROUP_BY ( groupCondition )+ ) ;
    public final SparqlParser.groupClause_return groupClause() throws RecognitionException {
        SparqlParser.groupClause_return retval = new SparqlParser.groupClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GROUP68=null;
        Token BY69=null;
        SparqlParser.groupCondition_return groupCondition70 = null;


        Object GROUP68_tree=null;
        Object BY69_tree=null;
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleSubtreeStream stream_groupCondition=new RewriteRuleSubtreeStream(adaptor,"rule groupCondition");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:138:5: ( GROUP BY ( groupCondition )+ -> ^( GROUP_BY ( groupCondition )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:138:7: GROUP BY ( groupCondition )+
            {
            GROUP68=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupClause832);  
            stream_GROUP.add(GROUP68);

            BY69=(Token)match(input,BY,FOLLOW_BY_in_groupClause834);  
            stream_BY.add(BY69);

            // com\\googlecode\\sparkleg\\Sparql.g:138:16: ( groupCondition )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IRI_REF||LA26_0==PNAME_NS||LA26_0==OPEN_BRACE||(LA26_0>=VAR1 && LA26_0<=VAR2)||LA26_0==NOT||(LA26_0>=STR && LA26_0<=EXISTS)||LA26_0==PNAME_LN) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:138:16: groupCondition
            	    {
            	    pushFollow(FOLLOW_groupCondition_in_groupClause836);
            	    groupCondition70=groupCondition();

            	    state._fsp--;

            	    stream_groupCondition.add(groupCondition70.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);



            // AST REWRITE
            // elements: groupCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:32: -> ^( GROUP_BY ( groupCondition )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:138:35: ^( GROUP_BY ( groupCondition )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GROUP_BY, "GROUP_BY"), root_1);

                if ( !(stream_groupCondition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_groupCondition.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupCondition.nextTree());

                }
                stream_groupCondition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupClause"

    public static class groupCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupCondition"
    // com\\googlecode\\sparkleg\\Sparql.g:141:1: groupCondition : ( builtInCall | functionCall | OPEN_BRACE expression ( AS var )? CLOSE_BRACE -> ^( AS expression ( var )* ) | var );
    public final SparqlParser.groupCondition_return groupCondition() throws RecognitionException {
        SparqlParser.groupCondition_return retval = new SparqlParser.groupCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE73=null;
        Token AS75=null;
        Token CLOSE_BRACE77=null;
        SparqlParser.builtInCall_return builtInCall71 = null;

        SparqlParser.functionCall_return functionCall72 = null;

        SparqlParser.expression_return expression74 = null;

        SparqlParser.var_return var76 = null;

        SparqlParser.var_return var78 = null;


        Object OPEN_BRACE73_tree=null;
        Object AS75_tree=null;
        Object CLOSE_BRACE77_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:142:5: ( builtInCall | functionCall | OPEN_BRACE expression ( AS var )? CLOSE_BRACE -> ^( AS expression ( var )* ) | var )
            int alt28=4;
            switch ( input.LA(1) ) {
            case NOT:
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
                alt28=1;
                }
                break;
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt28=2;
                }
                break;
            case OPEN_BRACE:
                {
                alt28=3;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:142:7: builtInCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtInCall_in_groupCondition870);
                    builtInCall71=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall71.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:143:7: functionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_groupCondition878);
                    functionCall72=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall72.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:144:7: OPEN_BRACE expression ( AS var )? CLOSE_BRACE
                    {
                    OPEN_BRACE73=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_groupCondition886);  
                    stream_OPEN_BRACE.add(OPEN_BRACE73);

                    pushFollow(FOLLOW_expression_in_groupCondition888);
                    expression74=expression();

                    state._fsp--;

                    stream_expression.add(expression74.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:144:29: ( AS var )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==AS) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:144:30: AS var
                            {
                            AS75=(Token)match(input,AS,FOLLOW_AS_in_groupCondition891);  
                            stream_AS.add(AS75);

                            pushFollow(FOLLOW_var_in_groupCondition893);
                            var76=var();

                            state._fsp--;

                            stream_var.add(var76.getTree());

                            }
                            break;

                    }

                    CLOSE_BRACE77=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_groupCondition897);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE77);



                    // AST REWRITE
                    // elements: expression, AS, var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:51: -> ^( AS expression ( var )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:144:54: ^( AS expression ( var )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:144:70: ( var )*
                        while ( stream_var.hasNext() ) {
                            adaptor.addChild(root_1, stream_var.nextTree());

                        }
                        stream_var.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:145:7: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_groupCondition916);
                    var78=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var78.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupCondition"

    public static class havingClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "havingClause"
    // com\\googlecode\\sparkleg\\Sparql.g:148:1: havingClause : HAVING ( constraint )+ -> ^( HAVING ( constraint )+ ) ;
    public final SparqlParser.havingClause_return havingClause() throws RecognitionException {
        SparqlParser.havingClause_return retval = new SparqlParser.havingClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HAVING79=null;
        SparqlParser.constraint_return constraint80 = null;


        Object HAVING79_tree=null;
        RewriteRuleTokenStream stream_HAVING=new RewriteRuleTokenStream(adaptor,"token HAVING");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:149:5: ( HAVING ( constraint )+ -> ^( HAVING ( constraint )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:149:7: HAVING ( constraint )+
            {
            HAVING79=(Token)match(input,HAVING,FOLLOW_HAVING_in_havingClause937);  
            stream_HAVING.add(HAVING79);

            // com\\googlecode\\sparkleg\\Sparql.g:149:14: ( constraint )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==IRI_REF||LA29_0==PNAME_NS||LA29_0==OPEN_BRACE||LA29_0==NOT||(LA29_0>=STR && LA29_0<=EXISTS)||LA29_0==PNAME_LN) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:149:14: constraint
            	    {
            	    pushFollow(FOLLOW_constraint_in_havingClause939);
            	    constraint80=constraint();

            	    state._fsp--;

            	    stream_constraint.add(constraint80.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);



            // AST REWRITE
            // elements: constraint, HAVING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:26: -> ^( HAVING ( constraint )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:149:29: ^( HAVING ( constraint )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_HAVING.nextNode(), root_1);

                if ( !(stream_constraint.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constraint.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraint.nextTree());

                }
                stream_constraint.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "havingClause"

    public static class orderClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderClause"
    // com\\googlecode\\sparkleg\\Sparql.g:152:1: orderClause : ORDER BY ( orderCondition )+ -> ^( ORDER_BY ( orderCondition )+ ) ;
    public final SparqlParser.orderClause_return orderClause() throws RecognitionException {
        SparqlParser.orderClause_return retval = new SparqlParser.orderClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ORDER81=null;
        Token BY82=null;
        SparqlParser.orderCondition_return orderCondition83 = null;


        Object ORDER81_tree=null;
        Object BY82_tree=null;
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleSubtreeStream stream_orderCondition=new RewriteRuleSubtreeStream(adaptor,"rule orderCondition");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:153:5: ( ORDER BY ( orderCondition )+ -> ^( ORDER_BY ( orderCondition )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:153:7: ORDER BY ( orderCondition )+
            {
            ORDER81=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderClause971);  
            stream_ORDER.add(ORDER81);

            BY82=(Token)match(input,BY,FOLLOW_BY_in_orderClause973);  
            stream_BY.add(BY82);

            // com\\googlecode\\sparkleg\\Sparql.g:153:16: ( orderCondition )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==IRI_REF||LA30_0==PNAME_NS||LA30_0==OPEN_BRACE||(LA30_0>=ASC && LA30_0<=DESC)||(LA30_0>=VAR1 && LA30_0<=VAR2)||LA30_0==NOT||(LA30_0>=STR && LA30_0<=EXISTS)||LA30_0==PNAME_LN) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:153:16: orderCondition
            	    {
            	    pushFollow(FOLLOW_orderCondition_in_orderClause975);
            	    orderCondition83=orderCondition();

            	    state._fsp--;

            	    stream_orderCondition.add(orderCondition83.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);



            // AST REWRITE
            // elements: orderCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:32: -> ^( ORDER_BY ( orderCondition )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:153:35: ^( ORDER_BY ( orderCondition )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDER_BY, "ORDER_BY"), root_1);

                if ( !(stream_orderCondition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_orderCondition.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderCondition.nextTree());

                }
                stream_orderCondition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderClause"

    public static class orderCondition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orderCondition"
    // com\\googlecode\\sparkleg\\Sparql.g:156:1: orderCondition : ( ASC brackettedExpression -> ^( ORDER_CONDITION ASC brackettedExpression ) | DESC brackettedExpression -> ^( ORDER_CONDITION DESC brackettedExpression ) | constraint -> ^( ORDER_CONDITION constraint ) | var -> ^( ORDER_CONDITION var ) );
    public final SparqlParser.orderCondition_return orderCondition() throws RecognitionException {
        SparqlParser.orderCondition_return retval = new SparqlParser.orderCondition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASC84=null;
        Token DESC86=null;
        SparqlParser.brackettedExpression_return brackettedExpression85 = null;

        SparqlParser.brackettedExpression_return brackettedExpression87 = null;

        SparqlParser.constraint_return constraint88 = null;

        SparqlParser.var_return var89 = null;


        Object ASC84_tree=null;
        Object DESC86_tree=null;
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        RewriteRuleSubtreeStream stream_brackettedExpression=new RewriteRuleSubtreeStream(adaptor,"rule brackettedExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:157:5: ( ASC brackettedExpression -> ^( ORDER_CONDITION ASC brackettedExpression ) | DESC brackettedExpression -> ^( ORDER_CONDITION DESC brackettedExpression ) | constraint -> ^( ORDER_CONDITION constraint ) | var -> ^( ORDER_CONDITION var ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case ASC:
                {
                alt31=1;
                }
                break;
            case DESC:
                {
                alt31=2;
                }
                break;
            case IRI_REF:
            case PNAME_NS:
            case OPEN_BRACE:
            case NOT:
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
            case PNAME_LN:
                {
                alt31=3;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:157:7: ASC brackettedExpression
                    {
                    ASC84=(Token)match(input,ASC,FOLLOW_ASC_in_orderCondition1002);  
                    stream_ASC.add(ASC84);

                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1004);
                    brackettedExpression85=brackettedExpression();

                    state._fsp--;

                    stream_brackettedExpression.add(brackettedExpression85.getTree());


                    // AST REWRITE
                    // elements: ASC, brackettedExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:32: -> ^( ORDER_CONDITION ASC brackettedExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:157:35: ^( ORDER_CONDITION ASC brackettedExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION"), root_1);

                        adaptor.addChild(root_1, stream_ASC.nextNode());
                        adaptor.addChild(root_1, stream_brackettedExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:158:7: DESC brackettedExpression
                    {
                    DESC86=(Token)match(input,DESC,FOLLOW_DESC_in_orderCondition1022);  
                    stream_DESC.add(DESC86);

                    pushFollow(FOLLOW_brackettedExpression_in_orderCondition1024);
                    brackettedExpression87=brackettedExpression();

                    state._fsp--;

                    stream_brackettedExpression.add(brackettedExpression87.getTree());


                    // AST REWRITE
                    // elements: DESC, brackettedExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:33: -> ^( ORDER_CONDITION DESC brackettedExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:158:36: ^( ORDER_CONDITION DESC brackettedExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION"), root_1);

                        adaptor.addChild(root_1, stream_DESC.nextNode());
                        adaptor.addChild(root_1, stream_brackettedExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:159:7: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_orderCondition1042);
                    constraint88=constraint();

                    state._fsp--;

                    stream_constraint.add(constraint88.getTree());


                    // AST REWRITE
                    // elements: constraint
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:18: -> ^( ORDER_CONDITION constraint )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:159:21: ^( ORDER_CONDITION constraint )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION"), root_1);

                        adaptor.addChild(root_1, stream_constraint.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:160:7: var
                    {
                    pushFollow(FOLLOW_var_in_orderCondition1058);
                    var89=var();

                    state._fsp--;

                    stream_var.add(var89.getTree());


                    // AST REWRITE
                    // elements: var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:11: -> ^( ORDER_CONDITION var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:160:14: ^( ORDER_CONDITION var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORDER_CONDITION, "ORDER_CONDITION"), root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orderCondition"

    public static class limitOffsetClauses_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "limitOffsetClauses"
    // com\\googlecode\\sparkleg\\Sparql.g:163:1: limitOffsetClauses : ( limitClause ( offsetClause )? -> limitClause ( offsetClause )* | offsetClause ( limitClause )? -> offsetClause ( limitClause )* );
    public final SparqlParser.limitOffsetClauses_return limitOffsetClauses() throws RecognitionException {
        SparqlParser.limitOffsetClauses_return retval = new SparqlParser.limitOffsetClauses_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.limitClause_return limitClause90 = null;

        SparqlParser.offsetClause_return offsetClause91 = null;

        SparqlParser.offsetClause_return offsetClause92 = null;

        SparqlParser.limitClause_return limitClause93 = null;


        RewriteRuleSubtreeStream stream_offsetClause=new RewriteRuleSubtreeStream(adaptor,"rule offsetClause");
        RewriteRuleSubtreeStream stream_limitClause=new RewriteRuleSubtreeStream(adaptor,"rule limitClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:164:5: ( limitClause ( offsetClause )? -> limitClause ( offsetClause )* | offsetClause ( limitClause )? -> offsetClause ( limitClause )* )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LIMIT) ) {
                alt34=1;
            }
            else if ( (LA34_0==OFFSET) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:164:7: limitClause ( offsetClause )?
                    {
                    pushFollow(FOLLOW_limitClause_in_limitOffsetClauses1088);
                    limitClause90=limitClause();

                    state._fsp--;

                    stream_limitClause.add(limitClause90.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:164:19: ( offsetClause )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==OFFSET) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:164:19: offsetClause
                            {
                            pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses1090);
                            offsetClause91=offsetClause();

                            state._fsp--;

                            stream_offsetClause.add(offsetClause91.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: offsetClause, limitClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:33: -> limitClause ( offsetClause )*
                    {
                        adaptor.addChild(root_0, stream_limitClause.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:164:48: ( offsetClause )*
                        while ( stream_offsetClause.hasNext() ) {
                            adaptor.addChild(root_0, stream_offsetClause.nextTree());

                        }
                        stream_offsetClause.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:165:7: offsetClause ( limitClause )?
                    {
                    pushFollow(FOLLOW_offsetClause_in_limitOffsetClauses1106);
                    offsetClause92=offsetClause();

                    state._fsp--;

                    stream_offsetClause.add(offsetClause92.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:165:20: ( limitClause )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LIMIT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:165:20: limitClause
                            {
                            pushFollow(FOLLOW_limitClause_in_limitOffsetClauses1108);
                            limitClause93=limitClause();

                            state._fsp--;

                            stream_limitClause.add(limitClause93.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: limitClause, offsetClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:33: -> offsetClause ( limitClause )*
                    {
                        adaptor.addChild(root_0, stream_offsetClause.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:165:49: ( limitClause )*
                        while ( stream_limitClause.hasNext() ) {
                            adaptor.addChild(root_0, stream_limitClause.nextTree());

                        }
                        stream_limitClause.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "limitOffsetClauses"

    public static class limitClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "limitClause"
    // com\\googlecode\\sparkleg\\Sparql.g:168:1: limitClause : LIMIT INTEGER -> ^( LIMIT INTEGER ) ;
    public final SparqlParser.limitClause_return limitClause() throws RecognitionException {
        SparqlParser.limitClause_return retval = new SparqlParser.limitClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LIMIT94=null;
        Token INTEGER95=null;

        Object LIMIT94_tree=null;
        Object INTEGER95_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:169:5: ( LIMIT INTEGER -> ^( LIMIT INTEGER ) )
            // com\\googlecode\\sparkleg\\Sparql.g:169:7: LIMIT INTEGER
            {
            LIMIT94=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limitClause1133);  
            stream_LIMIT.add(LIMIT94);

            INTEGER95=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_limitClause1135);  
            stream_INTEGER.add(INTEGER95);



            // AST REWRITE
            // elements: LIMIT, INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:21: -> ^( LIMIT INTEGER )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:169:24: ^( LIMIT INTEGER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LIMIT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INTEGER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "limitClause"

    public static class offsetClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "offsetClause"
    // com\\googlecode\\sparkleg\\Sparql.g:172:1: offsetClause : OFFSET INTEGER -> ^( OFFSET INTEGER ) ;
    public final SparqlParser.offsetClause_return offsetClause() throws RecognitionException {
        SparqlParser.offsetClause_return retval = new SparqlParser.offsetClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OFFSET96=null;
        Token INTEGER97=null;

        Object OFFSET96_tree=null;
        Object INTEGER97_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_OFFSET=new RewriteRuleTokenStream(adaptor,"token OFFSET");

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:173:5: ( OFFSET INTEGER -> ^( OFFSET INTEGER ) )
            // com\\googlecode\\sparkleg\\Sparql.g:173:7: OFFSET INTEGER
            {
            OFFSET96=(Token)match(input,OFFSET,FOLLOW_OFFSET_in_offsetClause1160);  
            stream_OFFSET.add(OFFSET96);

            INTEGER97=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_offsetClause1162);  
            stream_INTEGER.add(INTEGER97);



            // AST REWRITE
            // elements: INTEGER, OFFSET
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:22: -> ^( OFFSET INTEGER )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:173:25: ^( OFFSET INTEGER )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_OFFSET.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INTEGER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "offsetClause"

    public static class bindingsClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingsClause"
    // com\\googlecode\\sparkleg\\Sparql.g:176:1: bindingsClause : ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )? -> ( ^( BINDINGS ( var )* ( bindingValueList )* ) )? ;
    public final SparqlParser.bindingsClause_return bindingsClause() throws RecognitionException {
        SparqlParser.bindingsClause_return retval = new SparqlParser.bindingsClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BINDINGS98=null;
        Token OPEN_CURLY_BRACE100=null;
        Token CLOSE_CURLY_BRACE102=null;
        SparqlParser.var_return var99 = null;

        SparqlParser.bindingValueList_return bindingValueList101 = null;


        Object BINDINGS98_tree=null;
        Object OPEN_CURLY_BRACE100_tree=null;
        Object CLOSE_CURLY_BRACE102_tree=null;
        RewriteRuleTokenStream stream_BINDINGS=new RewriteRuleTokenStream(adaptor,"token BINDINGS");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_bindingValueList=new RewriteRuleSubtreeStream(adaptor,"rule bindingValueList");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:177:5: ( ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )? -> ( ^( BINDINGS ( var )* ( bindingValueList )* ) )? )
            // com\\googlecode\\sparkleg\\Sparql.g:177:7: ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )?
            {
            // com\\googlecode\\sparkleg\\Sparql.g:177:7: ( BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==BINDINGS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:177:8: BINDINGS ( var )* OPEN_CURLY_BRACE ( bindingValueList )* CLOSE_CURLY_BRACE
                    {
                    BINDINGS98=(Token)match(input,BINDINGS,FOLLOW_BINDINGS_in_bindingsClause1188);  
                    stream_BINDINGS.add(BINDINGS98);

                    // com\\googlecode\\sparkleg\\Sparql.g:177:17: ( var )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=VAR1 && LA35_0<=VAR2)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:177:17: var
                    	    {
                    	    pushFollow(FOLLOW_var_in_bindingsClause1190);
                    	    var99=var();

                    	    state._fsp--;

                    	    stream_var.add(var99.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    OPEN_CURLY_BRACE100=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_bindingsClause1193);  
                    stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE100);

                    // com\\googlecode\\sparkleg\\Sparql.g:177:39: ( bindingValueList )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==OPEN_BRACE) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:177:39: bindingValueList
                    	    {
                    	    pushFollow(FOLLOW_bindingValueList_in_bindingsClause1195);
                    	    bindingValueList101=bindingValueList();

                    	    state._fsp--;

                    	    stream_bindingValueList.add(bindingValueList101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    CLOSE_CURLY_BRACE102=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_bindingsClause1198);  
                    stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE102);


                    }
                    break;

            }



            // AST REWRITE
            // elements: BINDINGS, var, bindingValueList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 177:77: -> ( ^( BINDINGS ( var )* ( bindingValueList )* ) )?
            {
                // com\\googlecode\\sparkleg\\Sparql.g:177:80: ( ^( BINDINGS ( var )* ( bindingValueList )* ) )?
                if ( stream_BINDINGS.hasNext()||stream_var.hasNext()||stream_bindingValueList.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:177:80: ^( BINDINGS ( var )* ( bindingValueList )* )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_BINDINGS.nextNode(), root_1);

                    // com\\googlecode\\sparkleg\\Sparql.g:177:91: ( var )*
                    while ( stream_var.hasNext() ) {
                        adaptor.addChild(root_1, stream_var.nextTree());

                    }
                    stream_var.reset();
                    // com\\googlecode\\sparkleg\\Sparql.g:177:96: ( bindingValueList )*
                    while ( stream_bindingValueList.hasNext() ) {
                        adaptor.addChild(root_1, stream_bindingValueList.nextTree());

                    }
                    stream_bindingValueList.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_BINDINGS.reset();
                stream_var.reset();
                stream_bindingValueList.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingsClause"

    public static class bindingValueList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingValueList"
    // com\\googlecode\\sparkleg\\Sparql.g:180:1: bindingValueList : OPEN_BRACE ( bindingValue )* CLOSE_BRACE -> ^( BINDING_VALUE ( bindingValue )* ) ;
    public final SparqlParser.bindingValueList_return bindingValueList() throws RecognitionException {
        SparqlParser.bindingValueList_return retval = new SparqlParser.bindingValueList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE103=null;
        Token CLOSE_BRACE105=null;
        SparqlParser.bindingValue_return bindingValue104 = null;


        Object OPEN_BRACE103_tree=null;
        Object CLOSE_BRACE105_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_bindingValue=new RewriteRuleSubtreeStream(adaptor,"rule bindingValue");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:181:5: ( OPEN_BRACE ( bindingValue )* CLOSE_BRACE -> ^( BINDING_VALUE ( bindingValue )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:181:7: OPEN_BRACE ( bindingValue )* CLOSE_BRACE
            {
            OPEN_BRACE103=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_bindingValueList1234);  
            stream_OPEN_BRACE.add(OPEN_BRACE103);

            // com\\googlecode\\sparkleg\\Sparql.g:181:18: ( bindingValue )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==IRI_REF||LA38_0==PNAME_NS||LA38_0==INTEGER||LA38_0==UNDEF||(LA38_0>=DECIMAL && LA38_0<=PNAME_LN)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:181:18: bindingValue
            	    {
            	    pushFollow(FOLLOW_bindingValue_in_bindingValueList1236);
            	    bindingValue104=bindingValue();

            	    state._fsp--;

            	    stream_bindingValue.add(bindingValue104.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            CLOSE_BRACE105=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_bindingValueList1239);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE105);



            // AST REWRITE
            // elements: bindingValue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:44: -> ^( BINDING_VALUE ( bindingValue )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:181:47: ^( BINDING_VALUE ( bindingValue )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINDING_VALUE, "BINDING_VALUE"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:181:63: ( bindingValue )*
                while ( stream_bindingValue.hasNext() ) {
                    adaptor.addChild(root_1, stream_bindingValue.nextTree());

                }
                stream_bindingValue.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingValueList"

    public static class bindingValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingValue"
    // com\\googlecode\\sparkleg\\Sparql.g:184:1: bindingValue : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF );
    public final SparqlParser.bindingValue_return bindingValue() throws RecognitionException {
        SparqlParser.bindingValue_return retval = new SparqlParser.bindingValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNDEF110=null;
        SparqlParser.iriRef_return iriRef106 = null;

        SparqlParser.rdfLiteral_return rdfLiteral107 = null;

        SparqlParser.numericLiteral_return numericLiteral108 = null;

        SparqlParser.booleanLiteral_return booleanLiteral109 = null;


        Object UNDEF110_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:185:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | UNDEF )
            int alt39=5;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt39=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt39=2;
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
                alt39=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt39=4;
                }
                break;
            case UNDEF:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:7: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_bindingValue1270);
                    iriRef106=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef106.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:16: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rdfLiteral_in_bindingValue1274);
                    rdfLiteral107=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral107.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:29: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_bindingValue1278);
                    numericLiteral108=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral108.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:46: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_bindingValue1282);
                    booleanLiteral109=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral109.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:185:63: UNDEF
                    {
                    root_0 = (Object)adaptor.nil();

                    UNDEF110=(Token)match(input,UNDEF,FOLLOW_UNDEF_in_bindingValue1286); 
                    UNDEF110_tree = (Object)adaptor.create(UNDEF110);
                    adaptor.addChild(root_0, UNDEF110_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingValue"

    public static class update_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "update"
    // com\\googlecode\\sparkleg\\Sparql.g:188:1: update : prologue ( load | clear | drop | add | move | copy | create | insert | delete | modify ) -> prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* ;
    public final SparqlParser.update_return update() throws RecognitionException {
        SparqlParser.update_return retval = new SparqlParser.update_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.prologue_return prologue111 = null;

        SparqlParser.load_return load112 = null;

        SparqlParser.clear_return clear113 = null;

        SparqlParser.drop_return drop114 = null;

        SparqlParser.add_return add115 = null;

        SparqlParser.move_return move116 = null;

        SparqlParser.copy_return copy117 = null;

        SparqlParser.create_return create118 = null;

        SparqlParser.insert_return insert119 = null;

        SparqlParser.delete_return delete120 = null;

        SparqlParser.modify_return modify121 = null;


        RewriteRuleSubtreeStream stream_clear=new RewriteRuleSubtreeStream(adaptor,"rule clear");
        RewriteRuleSubtreeStream stream_prologue=new RewriteRuleSubtreeStream(adaptor,"rule prologue");
        RewriteRuleSubtreeStream stream_drop=new RewriteRuleSubtreeStream(adaptor,"rule drop");
        RewriteRuleSubtreeStream stream_delete=new RewriteRuleSubtreeStream(adaptor,"rule delete");
        RewriteRuleSubtreeStream stream_modify=new RewriteRuleSubtreeStream(adaptor,"rule modify");
        RewriteRuleSubtreeStream stream_load=new RewriteRuleSubtreeStream(adaptor,"rule load");
        RewriteRuleSubtreeStream stream_add=new RewriteRuleSubtreeStream(adaptor,"rule add");
        RewriteRuleSubtreeStream stream_insert=new RewriteRuleSubtreeStream(adaptor,"rule insert");
        RewriteRuleSubtreeStream stream_create=new RewriteRuleSubtreeStream(adaptor,"rule create");
        RewriteRuleSubtreeStream stream_move=new RewriteRuleSubtreeStream(adaptor,"rule move");
        RewriteRuleSubtreeStream stream_copy=new RewriteRuleSubtreeStream(adaptor,"rule copy");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:189:5: ( prologue ( load | clear | drop | add | move | copy | create | insert | delete | modify ) -> prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )* )
            // com\\googlecode\\sparkleg\\Sparql.g:189:7: prologue ( load | clear | drop | add | move | copy | create | insert | delete | modify )
            {
            pushFollow(FOLLOW_prologue_in_update1307);
            prologue111=prologue();

            state._fsp--;

            stream_prologue.add(prologue111.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:189:16: ( load | clear | drop | add | move | copy | create | insert | delete | modify )
            int alt40=10;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:17: load
                    {
                    pushFollow(FOLLOW_load_in_update1310);
                    load112=load();

                    state._fsp--;

                    stream_load.add(load112.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:24: clear
                    {
                    pushFollow(FOLLOW_clear_in_update1314);
                    clear113=clear();

                    state._fsp--;

                    stream_clear.add(clear113.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:32: drop
                    {
                    pushFollow(FOLLOW_drop_in_update1318);
                    drop114=drop();

                    state._fsp--;

                    stream_drop.add(drop114.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:39: add
                    {
                    pushFollow(FOLLOW_add_in_update1322);
                    add115=add();

                    state._fsp--;

                    stream_add.add(add115.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:45: move
                    {
                    pushFollow(FOLLOW_move_in_update1326);
                    move116=move();

                    state._fsp--;

                    stream_move.add(move116.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:52: copy
                    {
                    pushFollow(FOLLOW_copy_in_update1330);
                    copy117=copy();

                    state._fsp--;

                    stream_copy.add(copy117.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:59: create
                    {
                    pushFollow(FOLLOW_create_in_update1334);
                    create118=create();

                    state._fsp--;

                    stream_create.add(create118.getTree());

                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:68: insert
                    {
                    pushFollow(FOLLOW_insert_in_update1338);
                    insert119=insert();

                    state._fsp--;

                    stream_insert.add(insert119.getTree());

                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:77: delete
                    {
                    pushFollow(FOLLOW_delete_in_update1342);
                    delete120=delete();

                    state._fsp--;

                    stream_delete.add(delete120.getTree());

                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\Sparql.g:189:86: modify
                    {
                    pushFollow(FOLLOW_modify_in_update1346);
                    modify121=modify();

                    state._fsp--;

                    stream_modify.add(modify121.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: create, add, insert, move, drop, clear, modify, load, copy, delete, prologue
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:94: -> prologue ( load )* ( clear )* ( drop )* ( add )* ( move )* ( copy )* ( create )* ( insert )* ( delete )* ( modify )*
            {
                adaptor.addChild(root_0, stream_prologue.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:189:106: ( load )*
                while ( stream_load.hasNext() ) {
                    adaptor.addChild(root_0, stream_load.nextTree());

                }
                stream_load.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:112: ( clear )*
                while ( stream_clear.hasNext() ) {
                    adaptor.addChild(root_0, stream_clear.nextTree());

                }
                stream_clear.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:119: ( drop )*
                while ( stream_drop.hasNext() ) {
                    adaptor.addChild(root_0, stream_drop.nextTree());

                }
                stream_drop.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:125: ( add )*
                while ( stream_add.hasNext() ) {
                    adaptor.addChild(root_0, stream_add.nextTree());

                }
                stream_add.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:130: ( move )*
                while ( stream_move.hasNext() ) {
                    adaptor.addChild(root_0, stream_move.nextTree());

                }
                stream_move.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:136: ( copy )*
                while ( stream_copy.hasNext() ) {
                    adaptor.addChild(root_0, stream_copy.nextTree());

                }
                stream_copy.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:142: ( create )*
                while ( stream_create.hasNext() ) {
                    adaptor.addChild(root_0, stream_create.nextTree());

                }
                stream_create.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:150: ( insert )*
                while ( stream_insert.hasNext() ) {
                    adaptor.addChild(root_0, stream_insert.nextTree());

                }
                stream_insert.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:158: ( delete )*
                while ( stream_delete.hasNext() ) {
                    adaptor.addChild(root_0, stream_delete.nextTree());

                }
                stream_delete.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:189:166: ( modify )*
                while ( stream_modify.hasNext() ) {
                    adaptor.addChild(root_0, stream_modify.nextTree());

                }
                stream_modify.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "update"

    public static class load_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "load"
    // com\\googlecode\\sparkleg\\Sparql.g:192:1: load : LOAD ( SILENT )? iriRef ( INTO graphRef )? -> ^( LOAD ( SILENT )* iriRef ( graphRef )* ) ;
    public final SparqlParser.load_return load() throws RecognitionException {
        SparqlParser.load_return retval = new SparqlParser.load_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOAD122=null;
        Token SILENT123=null;
        Token INTO125=null;
        SparqlParser.iriRef_return iriRef124 = null;

        SparqlParser.graphRef_return graphRef126 = null;


        Object LOAD122_tree=null;
        Object SILENT123_tree=null;
        Object INTO125_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
        RewriteRuleTokenStream stream_LOAD=new RewriteRuleTokenStream(adaptor,"token LOAD");
        RewriteRuleSubtreeStream stream_graphRef=new RewriteRuleSubtreeStream(adaptor,"rule graphRef");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:193:5: ( LOAD ( SILENT )? iriRef ( INTO graphRef )? -> ^( LOAD ( SILENT )* iriRef ( graphRef )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:193:7: LOAD ( SILENT )? iriRef ( INTO graphRef )?
            {
            LOAD122=(Token)match(input,LOAD,FOLLOW_LOAD_in_load1409);  
            stream_LOAD.add(LOAD122);

            // com\\googlecode\\sparkleg\\Sparql.g:193:12: ( SILENT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==SILENT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:193:12: SILENT
                    {
                    SILENT123=(Token)match(input,SILENT,FOLLOW_SILENT_in_load1411);  
                    stream_SILENT.add(SILENT123);


                    }
                    break;

            }

            pushFollow(FOLLOW_iriRef_in_load1414);
            iriRef124=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef124.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:193:27: ( INTO graphRef )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==INTO) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:193:28: INTO graphRef
                    {
                    INTO125=(Token)match(input,INTO,FOLLOW_INTO_in_load1417);  
                    stream_INTO.add(INTO125);

                    pushFollow(FOLLOW_graphRef_in_load1419);
                    graphRef126=graphRef();

                    state._fsp--;

                    stream_graphRef.add(graphRef126.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: iriRef, SILENT, LOAD, graphRef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:44: -> ^( LOAD ( SILENT )* iriRef ( graphRef )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:193:47: ^( LOAD ( SILENT )* iriRef ( graphRef )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_LOAD.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:193:54: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_iriRef.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:193:69: ( graphRef )*
                while ( stream_graphRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_graphRef.nextTree());

                }
                stream_graphRef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "load"

    public static class clear_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clear"
    // com\\googlecode\\sparkleg\\Sparql.g:196:1: clear : CLEAR ( SILENT )? graphRefAll -> ^( CLEAR ( SILENT )* graphRefAll ) ;
    public final SparqlParser.clear_return clear() throws RecognitionException {
        SparqlParser.clear_return retval = new SparqlParser.clear_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLEAR127=null;
        Token SILENT128=null;
        SparqlParser.graphRefAll_return graphRefAll129 = null;


        Object CLEAR127_tree=null;
        Object SILENT128_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_CLEAR=new RewriteRuleTokenStream(adaptor,"token CLEAR");
        RewriteRuleSubtreeStream stream_graphRefAll=new RewriteRuleSubtreeStream(adaptor,"rule graphRefAll");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:197:5: ( CLEAR ( SILENT )? graphRefAll -> ^( CLEAR ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\Sparql.g:197:7: CLEAR ( SILENT )? graphRefAll
            {
            CLEAR127=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_clear1456);  
            stream_CLEAR.add(CLEAR127);

            // com\\googlecode\\sparkleg\\Sparql.g:197:14: ( SILENT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SILENT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:197:14: SILENT
                    {
                    SILENT128=(Token)match(input,SILENT,FOLLOW_SILENT_in_clear1459);  
                    stream_SILENT.add(SILENT128);


                    }
                    break;

            }

            pushFollow(FOLLOW_graphRefAll_in_clear1462);
            graphRefAll129=graphRefAll();

            state._fsp--;

            stream_graphRefAll.add(graphRefAll129.getTree());


            // AST REWRITE
            // elements: SILENT, CLEAR, graphRefAll
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:34: -> ^( CLEAR ( SILENT )* graphRefAll )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:197:37: ^( CLEAR ( SILENT )* graphRefAll )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CLEAR.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:197:45: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_graphRefAll.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "clear"

    public static class drop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "drop"
    // com\\googlecode\\sparkleg\\Sparql.g:200:1: drop : DROP ( SILENT )? graphRefAll -> ^( DROP ( SILENT )* graphRefAll ) ;
    public final SparqlParser.drop_return drop() throws RecognitionException {
        SparqlParser.drop_return retval = new SparqlParser.drop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DROP130=null;
        Token SILENT131=null;
        SparqlParser.graphRefAll_return graphRefAll132 = null;


        Object DROP130_tree=null;
        Object SILENT131_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_DROP=new RewriteRuleTokenStream(adaptor,"token DROP");
        RewriteRuleSubtreeStream stream_graphRefAll=new RewriteRuleSubtreeStream(adaptor,"rule graphRefAll");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:201:5: ( DROP ( SILENT )? graphRefAll -> ^( DROP ( SILENT )* graphRefAll ) )
            // com\\googlecode\\sparkleg\\Sparql.g:201:7: DROP ( SILENT )? graphRefAll
            {
            DROP130=(Token)match(input,DROP,FOLLOW_DROP_in_drop1494);  
            stream_DROP.add(DROP130);

            // com\\googlecode\\sparkleg\\Sparql.g:201:12: ( SILENT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==SILENT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:201:12: SILENT
                    {
                    SILENT131=(Token)match(input,SILENT,FOLLOW_SILENT_in_drop1496);  
                    stream_SILENT.add(SILENT131);


                    }
                    break;

            }

            pushFollow(FOLLOW_graphRefAll_in_drop1499);
            graphRefAll132=graphRefAll();

            state._fsp--;

            stream_graphRefAll.add(graphRefAll132.getTree());


            // AST REWRITE
            // elements: graphRefAll, DROP, SILENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:32: -> ^( DROP ( SILENT )* graphRefAll )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:201:35: ^( DROP ( SILENT )* graphRefAll )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DROP.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:201:42: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_graphRefAll.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "drop"

    public static class create_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "create"
    // com\\googlecode\\sparkleg\\Sparql.g:204:1: create : CREATE ( SILENT )? graphRef -> ^( CREATE ( SILENT )* graphRef ) ;
    public final SparqlParser.create_return create() throws RecognitionException {
        SparqlParser.create_return retval = new SparqlParser.create_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CREATE133=null;
        Token SILENT134=null;
        SparqlParser.graphRef_return graphRef135 = null;


        Object CREATE133_tree=null;
        Object SILENT134_tree=null;
        RewriteRuleTokenStream stream_CREATE=new RewriteRuleTokenStream(adaptor,"token CREATE");
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleSubtreeStream stream_graphRef=new RewriteRuleSubtreeStream(adaptor,"rule graphRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:205:5: ( CREATE ( SILENT )? graphRef -> ^( CREATE ( SILENT )* graphRef ) )
            // com\\googlecode\\sparkleg\\Sparql.g:205:7: CREATE ( SILENT )? graphRef
            {
            CREATE133=(Token)match(input,CREATE,FOLLOW_CREATE_in_create1528);  
            stream_CREATE.add(CREATE133);

            // com\\googlecode\\sparkleg\\Sparql.g:205:14: ( SILENT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SILENT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:205:14: SILENT
                    {
                    SILENT134=(Token)match(input,SILENT,FOLLOW_SILENT_in_create1530);  
                    stream_SILENT.add(SILENT134);


                    }
                    break;

            }

            pushFollow(FOLLOW_graphRef_in_create1533);
            graphRef135=graphRef();

            state._fsp--;

            stream_graphRef.add(graphRef135.getTree());


            // AST REWRITE
            // elements: CREATE, graphRef, SILENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 205:31: -> ^( CREATE ( SILENT )* graphRef )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:205:34: ^( CREATE ( SILENT )* graphRef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CREATE.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:205:43: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_graphRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "create"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // com\\googlecode\\sparkleg\\Sparql.g:208:1: add : ADD ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( ADD ( SILENT )* $from $to) ;
    public final SparqlParser.add_return add() throws RecognitionException {
        SparqlParser.add_return retval = new SparqlParser.add_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ADD136=null;
        Token SILENT137=null;
        Token TO138=null;
        SparqlParser.graphOrDefault_return from = null;

        SparqlParser.graphOrDefault_return to = null;


        Object ADD136_tree=null;
        Object SILENT137_tree=null;
        Object TO138_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_graphOrDefault=new RewriteRuleSubtreeStream(adaptor,"rule graphOrDefault");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:209:5: ( ADD ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( ADD ( SILENT )* $from $to) )
            // com\\googlecode\\sparkleg\\Sparql.g:209:7: ADD ( SILENT )? from= graphOrDefault TO to= graphOrDefault
            {
            ADD136=(Token)match(input,ADD,FOLLOW_ADD_in_add1565);  
            stream_ADD.add(ADD136);

            // com\\googlecode\\sparkleg\\Sparql.g:209:11: ( SILENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SILENT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:209:11: SILENT
                    {
                    SILENT137=(Token)match(input,SILENT,FOLLOW_SILENT_in_add1567);  
                    stream_SILENT.add(SILENT137);


                    }
                    break;

            }

            pushFollow(FOLLOW_graphOrDefault_in_add1572);
            from=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(from.getTree());
            TO138=(Token)match(input,TO,FOLLOW_TO_in_add1574);  
            stream_TO.add(TO138);

            pushFollow(FOLLOW_graphOrDefault_in_add1578);
            to=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(to.getTree());


            // AST REWRITE
            // elements: from, SILENT, ADD, to
            // token labels: 
            // rule labels: to, retval, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (Object)adaptor.nil();
            // 209:60: -> ^( ADD ( SILENT )* $from $to)
            {
                // com\\googlecode\\sparkleg\\Sparql.g:209:63: ^( ADD ( SILENT )* $from $to)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ADD.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:209:69: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_from.nextTree());
                adaptor.addChild(root_1, stream_to.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class move_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "move"
    // com\\googlecode\\sparkleg\\Sparql.g:212:1: move : MOVE ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( MOVE ( SILENT )* $from $to) ;
    public final SparqlParser.move_return move() throws RecognitionException {
        SparqlParser.move_return retval = new SparqlParser.move_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MOVE139=null;
        Token SILENT140=null;
        Token TO141=null;
        SparqlParser.graphOrDefault_return from = null;

        SparqlParser.graphOrDefault_return to = null;


        Object MOVE139_tree=null;
        Object SILENT140_tree=null;
        Object TO141_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_MOVE=new RewriteRuleTokenStream(adaptor,"token MOVE");
        RewriteRuleSubtreeStream stream_graphOrDefault=new RewriteRuleSubtreeStream(adaptor,"rule graphOrDefault");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:213:5: ( MOVE ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( MOVE ( SILENT )* $from $to) )
            // com\\googlecode\\sparkleg\\Sparql.g:213:7: MOVE ( SILENT )? from= graphOrDefault TO to= graphOrDefault
            {
            MOVE139=(Token)match(input,MOVE,FOLLOW_MOVE_in_move1614);  
            stream_MOVE.add(MOVE139);

            // com\\googlecode\\sparkleg\\Sparql.g:213:12: ( SILENT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SILENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:213:12: SILENT
                    {
                    SILENT140=(Token)match(input,SILENT,FOLLOW_SILENT_in_move1616);  
                    stream_SILENT.add(SILENT140);


                    }
                    break;

            }

            pushFollow(FOLLOW_graphOrDefault_in_move1621);
            from=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(from.getTree());
            TO141=(Token)match(input,TO,FOLLOW_TO_in_move1623);  
            stream_TO.add(TO141);

            pushFollow(FOLLOW_graphOrDefault_in_move1627);
            to=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(to.getTree());


            // AST REWRITE
            // elements: MOVE, SILENT, from, to
            // token labels: 
            // rule labels: to, retval, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:61: -> ^( MOVE ( SILENT )* $from $to)
            {
                // com\\googlecode\\sparkleg\\Sparql.g:213:64: ^( MOVE ( SILENT )* $from $to)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_MOVE.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:213:71: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_from.nextTree());
                adaptor.addChild(root_1, stream_to.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "move"

    public static class copy_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "copy"
    // com\\googlecode\\sparkleg\\Sparql.g:216:1: copy : COPY ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( COPY ( SILENT )* $from $to) ;
    public final SparqlParser.copy_return copy() throws RecognitionException {
        SparqlParser.copy_return retval = new SparqlParser.copy_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COPY142=null;
        Token SILENT143=null;
        Token TO144=null;
        SparqlParser.graphOrDefault_return from = null;

        SparqlParser.graphOrDefault_return to = null;


        Object COPY142_tree=null;
        Object SILENT143_tree=null;
        Object TO144_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_COPY=new RewriteRuleTokenStream(adaptor,"token COPY");
        RewriteRuleSubtreeStream stream_graphOrDefault=new RewriteRuleSubtreeStream(adaptor,"rule graphOrDefault");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:217:5: ( COPY ( SILENT )? from= graphOrDefault TO to= graphOrDefault -> ^( COPY ( SILENT )* $from $to) )
            // com\\googlecode\\sparkleg\\Sparql.g:217:7: COPY ( SILENT )? from= graphOrDefault TO to= graphOrDefault
            {
            COPY142=(Token)match(input,COPY,FOLLOW_COPY_in_copy1663);  
            stream_COPY.add(COPY142);

            // com\\googlecode\\sparkleg\\Sparql.g:217:12: ( SILENT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==SILENT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:217:12: SILENT
                    {
                    SILENT143=(Token)match(input,SILENT,FOLLOW_SILENT_in_copy1665);  
                    stream_SILENT.add(SILENT143);


                    }
                    break;

            }

            pushFollow(FOLLOW_graphOrDefault_in_copy1670);
            from=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(from.getTree());
            TO144=(Token)match(input,TO,FOLLOW_TO_in_copy1672);  
            stream_TO.add(TO144);

            pushFollow(FOLLOW_graphOrDefault_in_copy1676);
            to=graphOrDefault();

            state._fsp--;

            stream_graphOrDefault.add(to.getTree());


            // AST REWRITE
            // elements: to, SILENT, from, COPY
            // token labels: 
            // rule labels: to, retval, from
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.tree:null);

            root_0 = (Object)adaptor.nil();
            // 217:61: -> ^( COPY ( SILENT )* $from $to)
            {
                // com\\googlecode\\sparkleg\\Sparql.g:217:64: ^( COPY ( SILENT )* $from $to)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_COPY.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:217:71: ( SILENT )*
                while ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_from.nextTree());
                adaptor.addChild(root_1, stream_to.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "copy"

    public static class insert_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insert"
    // com\\googlecode\\sparkleg\\Sparql.g:220:1: insert : INSERT DATA quadPattern -> ^( INSERT DATA quadPattern ) ;
    public final SparqlParser.insert_return insert() throws RecognitionException {
        SparqlParser.insert_return retval = new SparqlParser.insert_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT145=null;
        Token DATA146=null;
        SparqlParser.quadPattern_return quadPattern147 = null;


        Object INSERT145_tree=null;
        Object DATA146_tree=null;
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:221:5: ( INSERT DATA quadPattern -> ^( INSERT DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:221:7: INSERT DATA quadPattern
            {
            INSERT145=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert1708);  
            stream_INSERT.add(INSERT145);

            DATA146=(Token)match(input,DATA,FOLLOW_DATA_in_insert1710);  
            stream_DATA.add(DATA146);

            pushFollow(FOLLOW_quadPattern_in_insert1712);
            quadPattern147=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern147.getTree());


            // AST REWRITE
            // elements: quadPattern, INSERT, DATA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 221:31: -> ^( INSERT DATA quadPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:221:34: ^( INSERT DATA quadPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_INSERT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_DATA.nextNode());
                adaptor.addChild(root_1, stream_quadPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insert"

    public static class delete_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delete"
    // com\\googlecode\\sparkleg\\Sparql.g:224:1: delete : DELETE ( deleteData | deleteWhere ) ;
    public final SparqlParser.delete_return delete() throws RecognitionException {
        SparqlParser.delete_return retval = new SparqlParser.delete_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE148=null;
        SparqlParser.deleteData_return deleteData149 = null;

        SparqlParser.deleteWhere_return deleteWhere150 = null;


        Object DELETE148_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:225:5: ( DELETE ( deleteData | deleteWhere ) )
            // com\\googlecode\\sparkleg\\Sparql.g:225:7: DELETE ( deleteData | deleteWhere )
            {
            root_0 = (Object)adaptor.nil();

            DELETE148=(Token)match(input,DELETE,FOLLOW_DELETE_in_delete1746); 
            DELETE148_tree = (Object)adaptor.create(DELETE148);
            adaptor.addChild(root_0, DELETE148_tree);

            // com\\googlecode\\sparkleg\\Sparql.g:225:14: ( deleteData | deleteWhere )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DATA) ) {
                alt49=1;
            }
            else if ( (LA49_0==WHERE) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:225:15: deleteData
                    {
                    pushFollow(FOLLOW_deleteData_in_delete1749);
                    deleteData149=deleteData();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteData149.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:225:28: deleteWhere
                    {
                    pushFollow(FOLLOW_deleteWhere_in_delete1753);
                    deleteWhere150=deleteWhere();

                    state._fsp--;

                    adaptor.addChild(root_0, deleteWhere150.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delete"

    public static class deleteData_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deleteData"
    // com\\googlecode\\sparkleg\\Sparql.g:228:1: deleteData : DATA quadPattern -> ^( DELETE DATA quadPattern ) ;
    public final SparqlParser.deleteData_return deleteData() throws RecognitionException {
        SparqlParser.deleteData_return retval = new SparqlParser.deleteData_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA151=null;
        SparqlParser.quadPattern_return quadPattern152 = null;


        Object DATA151_tree=null;
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:229:5: ( DATA quadPattern -> ^( DELETE DATA quadPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:229:7: DATA quadPattern
            {
            DATA151=(Token)match(input,DATA,FOLLOW_DATA_in_deleteData1771);  
            stream_DATA.add(DATA151);

            pushFollow(FOLLOW_quadPattern_in_deleteData1773);
            quadPattern152=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern152.getTree());


            // AST REWRITE
            // elements: quadPattern, DATA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 229:24: -> ^( DELETE DATA quadPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:229:27: ^( DELETE DATA quadPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DELETE, "DELETE"), root_1);

                adaptor.addChild(root_1, stream_DATA.nextNode());
                adaptor.addChild(root_1, stream_quadPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "deleteData"

    public static class deleteWhere_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deleteWhere"
    // com\\googlecode\\sparkleg\\Sparql.g:232:1: deleteWhere : WHERE quadPattern -> ^( DELETE WHERE quadPattern ) ;
    public final SparqlParser.deleteWhere_return deleteWhere() throws RecognitionException {
        SparqlParser.deleteWhere_return retval = new SparqlParser.deleteWhere_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHERE153=null;
        SparqlParser.quadPattern_return quadPattern154 = null;


        Object WHERE153_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:233:5: ( WHERE quadPattern -> ^( DELETE WHERE quadPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:233:7: WHERE quadPattern
            {
            WHERE153=(Token)match(input,WHERE,FOLLOW_WHERE_in_deleteWhere1800);  
            stream_WHERE.add(WHERE153);

            pushFollow(FOLLOW_quadPattern_in_deleteWhere1802);
            quadPattern154=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern154.getTree());


            // AST REWRITE
            // elements: quadPattern, WHERE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 233:25: -> ^( DELETE WHERE quadPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:233:28: ^( DELETE WHERE quadPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DELETE, "DELETE"), root_1);

                adaptor.addChild(root_1, stream_WHERE.nextNode());
                adaptor.addChild(root_1, stream_quadPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "deleteWhere"

    public static class modify_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modify"
    // com\\googlecode\\sparkleg\\Sparql.g:236:1: modify : ( WITH iriRef )? ( deleteClause ( insertClause )? | insertClause ) ( usingClause )* WHERE groupGraphPattern -> ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) ) ;
    public final SparqlParser.modify_return modify() throws RecognitionException {
        SparqlParser.modify_return retval = new SparqlParser.modify_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH155=null;
        Token WHERE161=null;
        SparqlParser.iriRef_return iriRef156 = null;

        SparqlParser.deleteClause_return deleteClause157 = null;

        SparqlParser.insertClause_return insertClause158 = null;

        SparqlParser.insertClause_return insertClause159 = null;

        SparqlParser.usingClause_return usingClause160 = null;

        SparqlParser.groupGraphPattern_return groupGraphPattern162 = null;


        Object WITH155_tree=null;
        Object WHERE161_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_deleteClause=new RewriteRuleSubtreeStream(adaptor,"rule deleteClause");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        RewriteRuleSubtreeStream stream_insertClause=new RewriteRuleSubtreeStream(adaptor,"rule insertClause");
        RewriteRuleSubtreeStream stream_usingClause=new RewriteRuleSubtreeStream(adaptor,"rule usingClause");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:237:5: ( ( WITH iriRef )? ( deleteClause ( insertClause )? | insertClause ) ( usingClause )* WHERE groupGraphPattern -> ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:237:7: ( WITH iriRef )? ( deleteClause ( insertClause )? | insertClause ) ( usingClause )* WHERE groupGraphPattern
            {
            // com\\googlecode\\sparkleg\\Sparql.g:237:7: ( WITH iriRef )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==WITH) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:237:8: WITH iriRef
                    {
                    WITH155=(Token)match(input,WITH,FOLLOW_WITH_in_modify1834);  
                    stream_WITH.add(WITH155);

                    pushFollow(FOLLOW_iriRef_in_modify1836);
                    iriRef156=iriRef();

                    state._fsp--;

                    stream_iriRef.add(iriRef156.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:237:22: ( deleteClause ( insertClause )? | insertClause )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==DELETE) ) {
                alt52=1;
            }
            else if ( (LA52_0==INSERT) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:237:23: deleteClause ( insertClause )?
                    {
                    pushFollow(FOLLOW_deleteClause_in_modify1841);
                    deleteClause157=deleteClause();

                    state._fsp--;

                    stream_deleteClause.add(deleteClause157.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:237:36: ( insertClause )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==INSERT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:237:36: insertClause
                            {
                            pushFollow(FOLLOW_insertClause_in_modify1843);
                            insertClause158=insertClause();

                            state._fsp--;

                            stream_insertClause.add(insertClause158.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:237:52: insertClause
                    {
                    pushFollow(FOLLOW_insertClause_in_modify1848);
                    insertClause159=insertClause();

                    state._fsp--;

                    stream_insertClause.add(insertClause159.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:237:66: ( usingClause )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==USING) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:237:66: usingClause
            	    {
            	    pushFollow(FOLLOW_usingClause_in_modify1851);
            	    usingClause160=usingClause();

            	    state._fsp--;

            	    stream_usingClause.add(usingClause160.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            WHERE161=(Token)match(input,WHERE,FOLLOW_WHERE_in_modify1854);  
            stream_WHERE.add(WHERE161);

            pushFollow(FOLLOW_groupGraphPattern_in_modify1856);
            groupGraphPattern162=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern162.getTree());


            // AST REWRITE
            // elements: usingClause, iriRef, WITH, WHERE, groupGraphPattern, deleteClause, insertClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:103: -> ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:237:106: ^( MODIFY ( ^( WITH iriRef ) )? ( deleteClause )* ( insertClause )* ( usingClause )* ^( WHERE groupGraphPattern ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MODIFY, "MODIFY"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:237:115: ( ^( WITH iriRef ) )?
                if ( stream_iriRef.hasNext()||stream_WITH.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:237:115: ^( WITH iriRef )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(stream_WITH.nextNode(), root_2);

                    adaptor.addChild(root_2, stream_iriRef.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_iriRef.reset();
                stream_WITH.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:237:131: ( deleteClause )*
                while ( stream_deleteClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_deleteClause.nextTree());

                }
                stream_deleteClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:237:145: ( insertClause )*
                while ( stream_insertClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_insertClause.nextTree());

                }
                stream_insertClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:237:159: ( usingClause )*
                while ( stream_usingClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_usingClause.nextTree());

                }
                stream_usingClause.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:237:172: ^( WHERE groupGraphPattern )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_WHERE.nextNode(), root_2);

                adaptor.addChild(root_2, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modify"

    public static class deleteClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "deleteClause"
    // com\\googlecode\\sparkleg\\Sparql.g:240:1: deleteClause : DELETE quadPattern -> DELETE quadPattern ;
    public final SparqlParser.deleteClause_return deleteClause() throws RecognitionException {
        SparqlParser.deleteClause_return retval = new SparqlParser.deleteClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DELETE163=null;
        SparqlParser.quadPattern_return quadPattern164 = null;


        Object DELETE163_tree=null;
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:241:5: ( DELETE quadPattern -> DELETE quadPattern )
            // com\\googlecode\\sparkleg\\Sparql.g:241:7: DELETE quadPattern
            {
            DELETE163=(Token)match(input,DELETE,FOLLOW_DELETE_in_deleteClause1903);  
            stream_DELETE.add(DELETE163);

            pushFollow(FOLLOW_quadPattern_in_deleteClause1905);
            quadPattern164=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern164.getTree());


            // AST REWRITE
            // elements: DELETE, quadPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 241:26: -> DELETE quadPattern
            {
                adaptor.addChild(root_0, stream_DELETE.nextNode());
                adaptor.addChild(root_0, stream_quadPattern.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "deleteClause"

    public static class insertClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "insertClause"
    // com\\googlecode\\sparkleg\\Sparql.g:244:1: insertClause : INSERT quadPattern -> INSERT quadPattern ;
    public final SparqlParser.insertClause_return insertClause() throws RecognitionException {
        SparqlParser.insertClause_return retval = new SparqlParser.insertClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INSERT165=null;
        SparqlParser.quadPattern_return quadPattern166 = null;


        Object INSERT165_tree=null;
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleSubtreeStream stream_quadPattern=new RewriteRuleSubtreeStream(adaptor,"rule quadPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:245:5: ( INSERT quadPattern -> INSERT quadPattern )
            // com\\googlecode\\sparkleg\\Sparql.g:245:7: INSERT quadPattern
            {
            INSERT165=(Token)match(input,INSERT,FOLLOW_INSERT_in_insertClause1934);  
            stream_INSERT.add(INSERT165);

            pushFollow(FOLLOW_quadPattern_in_insertClause1936);
            quadPattern166=quadPattern();

            state._fsp--;

            stream_quadPattern.add(quadPattern166.getTree());


            // AST REWRITE
            // elements: INSERT, quadPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 245:26: -> INSERT quadPattern
            {
                adaptor.addChild(root_0, stream_INSERT.nextNode());
                adaptor.addChild(root_0, stream_quadPattern.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "insertClause"

    public static class usingClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usingClause"
    // com\\googlecode\\sparkleg\\Sparql.g:248:1: usingClause : USING ( NAMED )? iriRef -> ^( USING ( NAMED )? iriRef ) ;
    public final SparqlParser.usingClause_return usingClause() throws RecognitionException {
        SparqlParser.usingClause_return retval = new SparqlParser.usingClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token USING167=null;
        Token NAMED168=null;
        SparqlParser.iriRef_return iriRef169 = null;


        Object USING167_tree=null;
        Object NAMED168_tree=null;
        RewriteRuleTokenStream stream_USING=new RewriteRuleTokenStream(adaptor,"token USING");
        RewriteRuleTokenStream stream_NAMED=new RewriteRuleTokenStream(adaptor,"token NAMED");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:249:5: ( USING ( NAMED )? iriRef -> ^( USING ( NAMED )? iriRef ) )
            // com\\googlecode\\sparkleg\\Sparql.g:249:7: USING ( NAMED )? iriRef
            {
            USING167=(Token)match(input,USING,FOLLOW_USING_in_usingClause1959);  
            stream_USING.add(USING167);

            // com\\googlecode\\sparkleg\\Sparql.g:249:13: ( NAMED )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NAMED) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:249:13: NAMED
                    {
                    NAMED168=(Token)match(input,NAMED,FOLLOW_NAMED_in_usingClause1961);  
                    stream_NAMED.add(NAMED168);


                    }
                    break;

            }

            pushFollow(FOLLOW_iriRef_in_usingClause1964);
            iriRef169=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef169.getTree());


            // AST REWRITE
            // elements: USING, NAMED, iriRef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 249:27: -> ^( USING ( NAMED )? iriRef )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:249:30: ^( USING ( NAMED )? iriRef )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_USING.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:249:38: ( NAMED )?
                if ( stream_NAMED.hasNext() ) {
                    adaptor.addChild(root_1, stream_NAMED.nextNode());

                }
                stream_NAMED.reset();
                adaptor.addChild(root_1, stream_iriRef.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "usingClause"

    public static class graphOrDefault_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphOrDefault"
    // com\\googlecode\\sparkleg\\Sparql.g:252:1: graphOrDefault : ( DEFAULT | ( GRAPH )? iriRef );
    public final SparqlParser.graphOrDefault_return graphOrDefault() throws RecognitionException {
        SparqlParser.graphOrDefault_return retval = new SparqlParser.graphOrDefault_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT170=null;
        Token GRAPH171=null;
        SparqlParser.iriRef_return iriRef172 = null;


        Object DEFAULT170_tree=null;
        Object GRAPH171_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:253:5: ( DEFAULT | ( GRAPH )? iriRef )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==DEFAULT) ) {
                alt56=1;
            }
            else if ( (LA56_0==IRI_REF||LA56_0==PNAME_NS||LA56_0==GRAPH||LA56_0==PNAME_LN) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:253:7: DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();

                    DEFAULT170=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphOrDefault1995); 
                    DEFAULT170_tree = (Object)adaptor.create(DEFAULT170);
                    adaptor.addChild(root_0, DEFAULT170_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:254:7: ( GRAPH )? iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    // com\\googlecode\\sparkleg\\Sparql.g:254:7: ( GRAPH )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==GRAPH) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:254:7: GRAPH
                            {
                            GRAPH171=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graphOrDefault2004); 
                            GRAPH171_tree = (Object)adaptor.create(GRAPH171);
                            adaptor.addChild(root_0, GRAPH171_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_iriRef_in_graphOrDefault2007);
                    iriRef172=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef172.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphOrDefault"

    public static class graphRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphRef"
    // com\\googlecode\\sparkleg\\Sparql.g:257:1: graphRef : GRAPH iriRef ;
    public final SparqlParser.graphRef_return graphRef() throws RecognitionException {
        SparqlParser.graphRef_return retval = new SparqlParser.graphRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GRAPH173=null;
        SparqlParser.iriRef_return iriRef174 = null;


        Object GRAPH173_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:258:5: ( GRAPH iriRef )
            // com\\googlecode\\sparkleg\\Sparql.g:258:7: GRAPH iriRef
            {
            root_0 = (Object)adaptor.nil();

            GRAPH173=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graphRef2034); 
            GRAPH173_tree = (Object)adaptor.create(GRAPH173);
            adaptor.addChild(root_0, GRAPH173_tree);

            pushFollow(FOLLOW_iriRef_in_graphRef2036);
            iriRef174=iriRef();

            state._fsp--;

            adaptor.addChild(root_0, iriRef174.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphRef"

    public static class graphRefAll_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphRefAll"
    // com\\googlecode\\sparkleg\\Sparql.g:261:1: graphRefAll : ( graphRef | DEFAULT | NAMED | ALL );
    public final SparqlParser.graphRefAll_return graphRefAll() throws RecognitionException {
        SparqlParser.graphRefAll_return retval = new SparqlParser.graphRefAll_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT176=null;
        Token NAMED177=null;
        Token ALL178=null;
        SparqlParser.graphRef_return graphRef175 = null;


        Object DEFAULT176_tree=null;
        Object NAMED177_tree=null;
        Object ALL178_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:262:5: ( graphRef | DEFAULT | NAMED | ALL )
            int alt57=4;
            switch ( input.LA(1) ) {
            case GRAPH:
                {
                alt57=1;
                }
                break;
            case DEFAULT:
                {
                alt57=2;
                }
                break;
            case NAMED:
                {
                alt57=3;
                }
                break;
            case ALL:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:7: graphRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_graphRef_in_graphRefAll2053);
                    graphRef175=graphRef();

                    state._fsp--;

                    adaptor.addChild(root_0, graphRef175.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:18: DEFAULT
                    {
                    root_0 = (Object)adaptor.nil();

                    DEFAULT176=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_graphRefAll2057); 
                    DEFAULT176_tree = (Object)adaptor.create(DEFAULT176);
                    adaptor.addChild(root_0, DEFAULT176_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:28: NAMED
                    {
                    root_0 = (Object)adaptor.nil();

                    NAMED177=(Token)match(input,NAMED,FOLLOW_NAMED_in_graphRefAll2061); 
                    NAMED177_tree = (Object)adaptor.create(NAMED177);
                    adaptor.addChild(root_0, NAMED177_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:262:36: ALL
                    {
                    root_0 = (Object)adaptor.nil();

                    ALL178=(Token)match(input,ALL,FOLLOW_ALL_in_graphRefAll2065); 
                    ALL178_tree = (Object)adaptor.create(ALL178);
                    adaptor.addChild(root_0, ALL178_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphRefAll"

    public static class quadPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quadPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:265:1: quadPattern : OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE -> quads ;
    public final SparqlParser.quadPattern_return quadPattern() throws RecognitionException {
        SparqlParser.quadPattern_return retval = new SparqlParser.quadPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_CURLY_BRACE179=null;
        Token CLOSE_CURLY_BRACE181=null;
        SparqlParser.quads_return quads180 = null;


        Object OPEN_CURLY_BRACE179_tree=null;
        Object CLOSE_CURLY_BRACE181_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_quads=new RewriteRuleSubtreeStream(adaptor,"rule quads");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:266:5: ( OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE -> quads )
            // com\\googlecode\\sparkleg\\Sparql.g:266:7: OPEN_CURLY_BRACE quads CLOSE_CURLY_BRACE
            {
            OPEN_CURLY_BRACE179=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_quadPattern2082);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE179);

            pushFollow(FOLLOW_quads_in_quadPattern2084);
            quads180=quads();

            state._fsp--;

            stream_quads.add(quads180.getTree());
            CLOSE_CURLY_BRACE181=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_quadPattern2086);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE181);



            // AST REWRITE
            // elements: quads
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 266:48: -> quads
            {
                adaptor.addChild(root_0, stream_quads.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quadPattern"

    public static class quads_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quads"
    // com\\googlecode\\sparkleg\\Sparql.g:269:1: quads : ( triplesTemplate )? ( quadsNotTriples ( DOT )? ( triplesTemplate )? )* -> ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* ;
    public final SparqlParser.quads_return quads() throws RecognitionException {
        SparqlParser.quads_return retval = new SparqlParser.quads_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT184=null;
        SparqlParser.triplesTemplate_return triplesTemplate182 = null;

        SparqlParser.quadsNotTriples_return quadsNotTriples183 = null;

        SparqlParser.triplesTemplate_return triplesTemplate185 = null;


        Object DOT184_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesTemplate=new RewriteRuleSubtreeStream(adaptor,"rule triplesTemplate");
        RewriteRuleSubtreeStream stream_quadsNotTriples=new RewriteRuleSubtreeStream(adaptor,"rule quadsNotTriples");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:270:5: ( ( triplesTemplate )? ( quadsNotTriples ( DOT )? ( triplesTemplate )? )* -> ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )* )
            // com\\googlecode\\sparkleg\\Sparql.g:270:7: ( triplesTemplate )? ( quadsNotTriples ( DOT )? ( triplesTemplate )? )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:270:7: ( triplesTemplate )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IRI_REF||LA58_0==PNAME_NS||LA58_0==OPEN_BRACE||LA58_0==INTEGER||LA58_0==OPEN_SQUARE_BRACKET||(LA58_0>=VAR1 && LA58_0<=VAR2)||(LA58_0>=DECIMAL && LA58_0<=BLANK_NODE_LABEL)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:270:7: triplesTemplate
                    {
                    pushFollow(FOLLOW_triplesTemplate_in_quads2111);
                    triplesTemplate182=triplesTemplate();

                    state._fsp--;

                    stream_triplesTemplate.add(triplesTemplate182.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:270:24: ( quadsNotTriples ( DOT )? ( triplesTemplate )? )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==GRAPH) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:270:25: quadsNotTriples ( DOT )? ( triplesTemplate )?
            	    {
            	    pushFollow(FOLLOW_quadsNotTriples_in_quads2115);
            	    quadsNotTriples183=quadsNotTriples();

            	    state._fsp--;

            	    stream_quadsNotTriples.add(quadsNotTriples183.getTree());
            	    // com\\googlecode\\sparkleg\\Sparql.g:270:41: ( DOT )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==DOT) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:270:41: DOT
            	            {
            	            DOT184=(Token)match(input,DOT,FOLLOW_DOT_in_quads2117);  
            	            stream_DOT.add(DOT184);


            	            }
            	            break;

            	    }

            	    // com\\googlecode\\sparkleg\\Sparql.g:270:46: ( triplesTemplate )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==IRI_REF||LA60_0==PNAME_NS||LA60_0==OPEN_BRACE||LA60_0==INTEGER||LA60_0==OPEN_SQUARE_BRACKET||(LA60_0>=VAR1 && LA60_0<=VAR2)||(LA60_0>=DECIMAL && LA60_0<=BLANK_NODE_LABEL)) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:270:46: triplesTemplate
            	            {
            	            pushFollow(FOLLOW_triplesTemplate_in_quads2120);
            	            triplesTemplate185=triplesTemplate();

            	            state._fsp--;

            	            stream_triplesTemplate.add(triplesTemplate185.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);



            // AST REWRITE
            // elements: triplesTemplate, quadsNotTriples, triplesTemplate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:65: -> ( triplesTemplate )? ( quadsNotTriples ( triplesTemplate )? )*
            {
                // com\\googlecode\\sparkleg\\Sparql.g:270:69: ( triplesTemplate )?
                if ( stream_triplesTemplate.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesTemplate.nextTree());

                }
                stream_triplesTemplate.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:270:86: ( quadsNotTriples ( triplesTemplate )? )*
                while ( stream_quadsNotTriples.hasNext() ) {
                    adaptor.addChild(root_0, stream_quadsNotTriples.nextTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:270:103: ( triplesTemplate )?
                    if ( stream_triplesTemplate.hasNext() ) {
                        adaptor.addChild(root_0, stream_triplesTemplate.nextTree());

                    }
                    stream_triplesTemplate.reset();

                }
                stream_quadsNotTriples.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quads"

    public static class quadsNotTriples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quadsNotTriples"
    // com\\googlecode\\sparkleg\\Sparql.g:273:1: quadsNotTriples : GRAPH varOrIRIref OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE -> ^( GRAPH varOrIRIref ( triplesTemplate )? ) ;
    public final SparqlParser.quadsNotTriples_return quadsNotTriples() throws RecognitionException {
        SparqlParser.quadsNotTriples_return retval = new SparqlParser.quadsNotTriples_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GRAPH186=null;
        Token OPEN_CURLY_BRACE188=null;
        Token CLOSE_CURLY_BRACE190=null;
        SparqlParser.varOrIRIref_return varOrIRIref187 = null;

        SparqlParser.triplesTemplate_return triplesTemplate189 = null;


        Object GRAPH186_tree=null;
        Object OPEN_CURLY_BRACE188_tree=null;
        Object CLOSE_CURLY_BRACE190_tree=null;
        RewriteRuleTokenStream stream_GRAPH=new RewriteRuleTokenStream(adaptor,"token GRAPH");
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_triplesTemplate=new RewriteRuleSubtreeStream(adaptor,"rule triplesTemplate");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:274:5: ( GRAPH varOrIRIref OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE -> ^( GRAPH varOrIRIref ( triplesTemplate )? ) )
            // com\\googlecode\\sparkleg\\Sparql.g:274:7: GRAPH varOrIRIref OPEN_CURLY_BRACE ( triplesTemplate )? CLOSE_CURLY_BRACE
            {
            GRAPH186=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_quadsNotTriples2159);  
            stream_GRAPH.add(GRAPH186);

            pushFollow(FOLLOW_varOrIRIref_in_quadsNotTriples2161);
            varOrIRIref187=varOrIRIref();

            state._fsp--;

            stream_varOrIRIref.add(varOrIRIref187.getTree());
            OPEN_CURLY_BRACE188=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_quadsNotTriples2163);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE188);

            // com\\googlecode\\sparkleg\\Sparql.g:274:42: ( triplesTemplate )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IRI_REF||LA62_0==PNAME_NS||LA62_0==OPEN_BRACE||LA62_0==INTEGER||LA62_0==OPEN_SQUARE_BRACKET||(LA62_0>=VAR1 && LA62_0<=VAR2)||(LA62_0>=DECIMAL && LA62_0<=BLANK_NODE_LABEL)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:274:42: triplesTemplate
                    {
                    pushFollow(FOLLOW_triplesTemplate_in_quadsNotTriples2165);
                    triplesTemplate189=triplesTemplate();

                    state._fsp--;

                    stream_triplesTemplate.add(triplesTemplate189.getTree());

                    }
                    break;

            }

            CLOSE_CURLY_BRACE190=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_quadsNotTriples2168);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE190);



            // AST REWRITE
            // elements: varOrIRIref, GRAPH, triplesTemplate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:77: -> ^( GRAPH varOrIRIref ( triplesTemplate )? )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:274:80: ^( GRAPH varOrIRIref ( triplesTemplate )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_GRAPH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_varOrIRIref.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:274:100: ( triplesTemplate )?
                if ( stream_triplesTemplate.hasNext() ) {
                    adaptor.addChild(root_1, stream_triplesTemplate.nextTree());

                }
                stream_triplesTemplate.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quadsNotTriples"

    public static class triplesTemplate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesTemplate"
    // com\\googlecode\\sparkleg\\Sparql.g:277:1: triplesTemplate : triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) ;
    public final SparqlParser.triplesTemplate_return triplesTemplate() throws RecognitionException {
        SparqlParser.triplesTemplate_return retval = new SparqlParser.triplesTemplate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT192=null;
        Token DOT194=null;
        SparqlParser.triplesSameSubject_return triplesSameSubject191 = null;

        SparqlParser.triplesSameSubject_return triplesSameSubject193 = null;


        Object DOT192_tree=null;
        Object DOT194_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubject=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubject");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:278:5: ( triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ^( TRIPLES_TEMPLATE ( triplesSameSubject )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:278:7: triplesSameSubject ( DOT triplesSameSubject )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate2200);
            triplesSameSubject191=triplesSameSubject();

            state._fsp--;

            stream_triplesSameSubject.add(triplesSameSubject191.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:278:26: ( DOT triplesSameSubject )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==DOT) ) {
                    int LA63_1 = input.LA(2);

                    if ( (LA63_1==IRI_REF||LA63_1==PNAME_NS||LA63_1==OPEN_BRACE||LA63_1==INTEGER||LA63_1==OPEN_SQUARE_BRACKET||(LA63_1>=VAR1 && LA63_1<=VAR2)||(LA63_1>=DECIMAL && LA63_1<=BLANK_NODE_LABEL)) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:278:27: DOT triplesSameSubject
            	    {
            	    DOT192=(Token)match(input,DOT,FOLLOW_DOT_in_triplesTemplate2203);  
            	    stream_DOT.add(DOT192);

            	    pushFollow(FOLLOW_triplesSameSubject_in_triplesTemplate2205);
            	    triplesSameSubject193=triplesSameSubject();

            	    state._fsp--;

            	    stream_triplesSameSubject.add(triplesSameSubject193.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\Sparql.g:278:52: ( DOT )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==DOT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:278:52: DOT
                    {
                    DOT194=(Token)match(input,DOT,FOLLOW_DOT_in_triplesTemplate2209);  
                    stream_DOT.add(DOT194);


                    }
                    break;

            }



            // AST REWRITE
            // elements: triplesSameSubject
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:57: -> ^( TRIPLES_TEMPLATE ( triplesSameSubject )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:278:60: ^( TRIPLES_TEMPLATE ( triplesSameSubject )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLES_TEMPLATE, "TRIPLES_TEMPLATE"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:278:79: ( triplesSameSubject )*
                while ( stream_triplesSameSubject.hasNext() ) {
                    adaptor.addChild(root_1, stream_triplesSameSubject.nextTree());

                }
                stream_triplesSameSubject.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesTemplate"

    public static class groupGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:281:1: groupGraphPattern : OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN ( subSelect )* ( groupGraphPatternSub )* ) ;
    public final SparqlParser.groupGraphPattern_return groupGraphPattern() throws RecognitionException {
        SparqlParser.groupGraphPattern_return retval = new SparqlParser.groupGraphPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_CURLY_BRACE195=null;
        Token CLOSE_CURLY_BRACE198=null;
        SparqlParser.subSelect_return subSelect196 = null;

        SparqlParser.groupGraphPatternSub_return groupGraphPatternSub197 = null;


        Object OPEN_CURLY_BRACE195_tree=null;
        Object CLOSE_CURLY_BRACE198_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_groupGraphPatternSub=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPatternSub");
        RewriteRuleSubtreeStream stream_subSelect=new RewriteRuleSubtreeStream(adaptor,"rule subSelect");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:282:5: ( OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE -> ^( GROUP_GRAPH_PATTERN ( subSelect )* ( groupGraphPatternSub )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:282:7: OPEN_CURLY_BRACE ( subSelect | groupGraphPatternSub ) CLOSE_CURLY_BRACE
            {
            OPEN_CURLY_BRACE195=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2241);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE195);

            // com\\googlecode\\sparkleg\\Sparql.g:282:24: ( subSelect | groupGraphPatternSub )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==SELECT) ) {
                alt65=1;
            }
            else if ( (LA65_0==IRI_REF||LA65_0==PNAME_NS||LA65_0==OPEN_BRACE||(LA65_0>=OPEN_CURLY_BRACE && LA65_0<=CLOSE_CURLY_BRACE)||LA65_0==INTEGER||LA65_0==GRAPH||(LA65_0>=OPTIONAL && LA65_0<=MINUS_KEYWORD)||LA65_0==FILTER||LA65_0==OPEN_SQUARE_BRACKET||(LA65_0>=VAR1 && LA65_0<=VAR2)||(LA65_0>=DECIMAL && LA65_0<=BLANK_NODE_LABEL)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:282:25: subSelect
                    {
                    pushFollow(FOLLOW_subSelect_in_groupGraphPattern2244);
                    subSelect196=subSelect();

                    state._fsp--;

                    stream_subSelect.add(subSelect196.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:282:37: groupGraphPatternSub
                    {
                    pushFollow(FOLLOW_groupGraphPatternSub_in_groupGraphPattern2248);
                    groupGraphPatternSub197=groupGraphPatternSub();

                    state._fsp--;

                    stream_groupGraphPatternSub.add(groupGraphPatternSub197.getTree());

                    }
                    break;

            }

            CLOSE_CURLY_BRACE198=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2251);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE198);



            // AST REWRITE
            // elements: groupGraphPatternSub, subSelect
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:77: -> ^( GROUP_GRAPH_PATTERN ( subSelect )* ( groupGraphPatternSub )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:282:80: ^( GROUP_GRAPH_PATTERN ( subSelect )* ( groupGraphPatternSub )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GROUP_GRAPH_PATTERN, "GROUP_GRAPH_PATTERN"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:282:102: ( subSelect )*
                while ( stream_subSelect.hasNext() ) {
                    adaptor.addChild(root_1, stream_subSelect.nextTree());

                }
                stream_subSelect.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:282:113: ( groupGraphPatternSub )*
                while ( stream_groupGraphPatternSub.hasNext() ) {
                    adaptor.addChild(root_1, stream_groupGraphPatternSub.nextTree());

                }
                stream_groupGraphPatternSub.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupGraphPattern"

    public static class groupGraphPatternSub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupGraphPatternSub"
    // com\\googlecode\\sparkleg\\Sparql.g:285:1: groupGraphPatternSub : ( triplesBlock )? ( groupGraphPatternSubCache )* -> ( triplesBlock )? ( groupGraphPatternSubCache )* ;
    public final SparqlParser.groupGraphPatternSub_return groupGraphPatternSub() throws RecognitionException {
        SparqlParser.groupGraphPatternSub_return retval = new SparqlParser.groupGraphPatternSub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.triplesBlock_return triplesBlock199 = null;

        SparqlParser.groupGraphPatternSubCache_return groupGraphPatternSubCache200 = null;


        RewriteRuleSubtreeStream stream_triplesBlock=new RewriteRuleSubtreeStream(adaptor,"rule triplesBlock");
        RewriteRuleSubtreeStream stream_groupGraphPatternSubCache=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPatternSubCache");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:286:5: ( ( triplesBlock )? ( groupGraphPatternSubCache )* -> ( triplesBlock )? ( groupGraphPatternSubCache )* )
            // com\\googlecode\\sparkleg\\Sparql.g:286:7: ( triplesBlock )? ( groupGraphPatternSubCache )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:286:7: ( triplesBlock )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IRI_REF||LA66_0==PNAME_NS||LA66_0==OPEN_BRACE||LA66_0==INTEGER||LA66_0==OPEN_SQUARE_BRACKET||(LA66_0>=VAR1 && LA66_0<=VAR2)||(LA66_0>=DECIMAL && LA66_0<=BLANK_NODE_LABEL)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:286:7: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSub2284);
                    triplesBlock199=triplesBlock();

                    state._fsp--;

                    stream_triplesBlock.add(triplesBlock199.getTree());

                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:286:21: ( groupGraphPatternSubCache )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==OPEN_CURLY_BRACE||LA67_0==GRAPH||(LA67_0>=OPTIONAL && LA67_0<=MINUS_KEYWORD)||LA67_0==FILTER) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:286:22: groupGraphPatternSubCache
            	    {
            	    pushFollow(FOLLOW_groupGraphPatternSubCache_in_groupGraphPatternSub2288);
            	    groupGraphPatternSubCache200=groupGraphPatternSubCache();

            	    state._fsp--;

            	    stream_groupGraphPatternSubCache.add(groupGraphPatternSubCache200.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);



            // AST REWRITE
            // elements: triplesBlock, groupGraphPatternSubCache
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:50: -> ( triplesBlock )? ( groupGraphPatternSubCache )*
            {
                // com\\googlecode\\sparkleg\\Sparql.g:286:53: ( triplesBlock )?
                if ( stream_triplesBlock.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesBlock.nextTree());

                }
                stream_triplesBlock.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:286:67: ( groupGraphPatternSubCache )*
                while ( stream_groupGraphPatternSubCache.hasNext() ) {
                    adaptor.addChild(root_0, stream_groupGraphPatternSubCache.nextTree());

                }
                stream_groupGraphPatternSubCache.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSub"

    public static class groupGraphPatternSubCache_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupGraphPatternSubCache"
    // com\\googlecode\\sparkleg\\Sparql.g:289:1: groupGraphPatternSubCache : graphPatternNotTriples ( DOT )? ( triplesBlock )? -> graphPatternNotTriples ( triplesBlock )? ;
    public final SparqlParser.groupGraphPatternSubCache_return groupGraphPatternSubCache() throws RecognitionException {
        SparqlParser.groupGraphPatternSubCache_return retval = new SparqlParser.groupGraphPatternSubCache_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT202=null;
        SparqlParser.graphPatternNotTriples_return graphPatternNotTriples201 = null;

        SparqlParser.triplesBlock_return triplesBlock203 = null;


        Object DOT202_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesBlock=new RewriteRuleSubtreeStream(adaptor,"rule triplesBlock");
        RewriteRuleSubtreeStream stream_graphPatternNotTriples=new RewriteRuleSubtreeStream(adaptor,"rule graphPatternNotTriples");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:290:5: ( graphPatternNotTriples ( DOT )? ( triplesBlock )? -> graphPatternNotTriples ( triplesBlock )? )
            // com\\googlecode\\sparkleg\\Sparql.g:290:8: graphPatternNotTriples ( DOT )? ( triplesBlock )?
            {
            pushFollow(FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubCache2316);
            graphPatternNotTriples201=graphPatternNotTriples();

            state._fsp--;

            stream_graphPatternNotTriples.add(graphPatternNotTriples201.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:290:31: ( DOT )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==DOT) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:290:31: DOT
                    {
                    DOT202=(Token)match(input,DOT,FOLLOW_DOT_in_groupGraphPatternSubCache2318);  
                    stream_DOT.add(DOT202);


                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:290:36: ( triplesBlock )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==IRI_REF||LA69_0==PNAME_NS||LA69_0==OPEN_BRACE||LA69_0==INTEGER||LA69_0==OPEN_SQUARE_BRACKET||(LA69_0>=VAR1 && LA69_0<=VAR2)||(LA69_0>=DECIMAL && LA69_0<=BLANK_NODE_LABEL)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:290:36: triplesBlock
                    {
                    pushFollow(FOLLOW_triplesBlock_in_groupGraphPatternSubCache2321);
                    triplesBlock203=triplesBlock();

                    state._fsp--;

                    stream_triplesBlock.add(triplesBlock203.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: graphPatternNotTriples, triplesBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:50: -> graphPatternNotTriples ( triplesBlock )?
            {
                adaptor.addChild(root_0, stream_graphPatternNotTriples.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:290:76: ( triplesBlock )?
                if ( stream_triplesBlock.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesBlock.nextTree());

                }
                stream_triplesBlock.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupGraphPatternSubCache"

    public static class triplesBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesBlock"
    // com\\googlecode\\sparkleg\\Sparql.g:293:1: triplesBlock : triplesSameSubjectPath ( DOT triplesSameSubjectPath )* ( DOT )? -> ( triplesSameSubjectPath )+ ;
    public final SparqlParser.triplesBlock_return triplesBlock() throws RecognitionException {
        SparqlParser.triplesBlock_return retval = new SparqlParser.triplesBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT205=null;
        Token DOT207=null;
        SparqlParser.triplesSameSubjectPath_return triplesSameSubjectPath204 = null;

        SparqlParser.triplesSameSubjectPath_return triplesSameSubjectPath206 = null;


        Object DOT205_tree=null;
        Object DOT207_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubjectPath=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubjectPath");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:294:5: ( triplesSameSubjectPath ( DOT triplesSameSubjectPath )* ( DOT )? -> ( triplesSameSubjectPath )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:294:7: triplesSameSubjectPath ( DOT triplesSameSubjectPath )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock2348);
            triplesSameSubjectPath204=triplesSameSubjectPath();

            state._fsp--;

            stream_triplesSameSubjectPath.add(triplesSameSubjectPath204.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:294:30: ( DOT triplesSameSubjectPath )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==DOT) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==IRI_REF||LA70_1==PNAME_NS||LA70_1==OPEN_BRACE||LA70_1==INTEGER||LA70_1==OPEN_SQUARE_BRACKET||(LA70_1>=VAR1 && LA70_1<=VAR2)||(LA70_1>=DECIMAL && LA70_1<=BLANK_NODE_LABEL)) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:294:31: DOT triplesSameSubjectPath
            	    {
            	    DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_triplesBlock2351);  
            	    stream_DOT.add(DOT205);

            	    pushFollow(FOLLOW_triplesSameSubjectPath_in_triplesBlock2353);
            	    triplesSameSubjectPath206=triplesSameSubjectPath();

            	    state._fsp--;

            	    stream_triplesSameSubjectPath.add(triplesSameSubjectPath206.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\Sparql.g:294:60: ( DOT )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==DOT) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:294:60: DOT
                    {
                    DOT207=(Token)match(input,DOT,FOLLOW_DOT_in_triplesBlock2357);  
                    stream_DOT.add(DOT207);


                    }
                    break;

            }



            // AST REWRITE
            // elements: triplesSameSubjectPath
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 294:65: -> ( triplesSameSubjectPath )+
            {
                if ( !(stream_triplesSameSubjectPath.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_triplesSameSubjectPath.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesSameSubjectPath.nextTree());

                }
                stream_triplesSameSubjectPath.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesBlock"

    public static class graphPatternNotTriples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphPatternNotTriples"
    // com\\googlecode\\sparkleg\\Sparql.g:297:1: graphPatternNotTriples : ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind );
    public final SparqlParser.graphPatternNotTriples_return graphPatternNotTriples() throws RecognitionException {
        SparqlParser.graphPatternNotTriples_return retval = new SparqlParser.graphPatternNotTriples_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.groupOrUnionGraphPattern_return groupOrUnionGraphPattern208 = null;

        SparqlParser.optionalGraphPattern_return optionalGraphPattern209 = null;

        SparqlParser.minusGraphPattern_return minusGraphPattern210 = null;

        SparqlParser.graphGraphPattern_return graphGraphPattern211 = null;

        SparqlParser.serviceGraphPattern_return serviceGraphPattern212 = null;

        SparqlParser.filter_return filter213 = null;

        SparqlParser.bind_return bind214 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:298:5: ( groupOrUnionGraphPattern | optionalGraphPattern | minusGraphPattern | graphGraphPattern | serviceGraphPattern | filter | bind )
            int alt72=7;
            switch ( input.LA(1) ) {
            case OPEN_CURLY_BRACE:
                {
                alt72=1;
                }
                break;
            case OPTIONAL:
                {
                alt72=2;
                }
                break;
            case MINUS_KEYWORD:
                {
                alt72=3;
                }
                break;
            case GRAPH:
                {
                alt72=4;
                }
                break;
            case SERVICE:
                {
                alt72=5;
                }
                break;
            case FILTER:
                {
                alt72=6;
                }
                break;
            case BIND:
                {
                alt72=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:7: groupOrUnionGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples2380);
                    groupOrUnionGraphPattern208=groupOrUnionGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, groupOrUnionGraphPattern208.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:34: optionalGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_optionalGraphPattern_in_graphPatternNotTriples2384);
                    optionalGraphPattern209=optionalGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, optionalGraphPattern209.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:57: minusGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_minusGraphPattern_in_graphPatternNotTriples2388);
                    minusGraphPattern210=minusGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, minusGraphPattern210.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:77: graphGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_graphGraphPattern_in_graphPatternNotTriples2392);
                    graphGraphPattern211=graphGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, graphGraphPattern211.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:97: serviceGraphPattern
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_serviceGraphPattern_in_graphPatternNotTriples2396);
                    serviceGraphPattern212=serviceGraphPattern();

                    state._fsp--;

                    adaptor.addChild(root_0, serviceGraphPattern212.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:119: filter
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_filter_in_graphPatternNotTriples2400);
                    filter213=filter();

                    state._fsp--;

                    adaptor.addChild(root_0, filter213.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:298:128: bind
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_bind_in_graphPatternNotTriples2404);
                    bind214=bind();

                    state._fsp--;

                    adaptor.addChild(root_0, bind214.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphPatternNotTriples"

    public static class optionalGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionalGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:301:1: optionalGraphPattern : OPTIONAL groupGraphPattern -> ^( OPTIONAL groupGraphPattern ) ;
    public final SparqlParser.optionalGraphPattern_return optionalGraphPattern() throws RecognitionException {
        SparqlParser.optionalGraphPattern_return retval = new SparqlParser.optionalGraphPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPTIONAL215=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern216 = null;


        Object OPTIONAL215_tree=null;
        RewriteRuleTokenStream stream_OPTIONAL=new RewriteRuleTokenStream(adaptor,"token OPTIONAL");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:302:5: ( OPTIONAL groupGraphPattern -> ^( OPTIONAL groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:302:7: OPTIONAL groupGraphPattern
            {
            OPTIONAL215=(Token)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_optionalGraphPattern2421);  
            stream_OPTIONAL.add(OPTIONAL215);

            pushFollow(FOLLOW_groupGraphPattern_in_optionalGraphPattern2423);
            groupGraphPattern216=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern216.getTree());


            // AST REWRITE
            // elements: groupGraphPattern, OPTIONAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:34: -> ^( OPTIONAL groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:302:37: ^( OPTIONAL groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_OPTIONAL.nextNode(), root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionalGraphPattern"

    public static class graphGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:305:1: graphGraphPattern : GRAPH varOrIRIref groupGraphPattern -> ^( GRAPH varOrIRIref groupGraphPattern ) ;
    public final SparqlParser.graphGraphPattern_return graphGraphPattern() throws RecognitionException {
        SparqlParser.graphGraphPattern_return retval = new SparqlParser.graphGraphPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token GRAPH217=null;
        SparqlParser.varOrIRIref_return varOrIRIref218 = null;

        SparqlParser.groupGraphPattern_return groupGraphPattern219 = null;


        Object GRAPH217_tree=null;
        RewriteRuleTokenStream stream_GRAPH=new RewriteRuleTokenStream(adaptor,"token GRAPH");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:306:5: ( GRAPH varOrIRIref groupGraphPattern -> ^( GRAPH varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:306:7: GRAPH varOrIRIref groupGraphPattern
            {
            GRAPH217=(Token)match(input,GRAPH,FOLLOW_GRAPH_in_graphGraphPattern2448);  
            stream_GRAPH.add(GRAPH217);

            pushFollow(FOLLOW_varOrIRIref_in_graphGraphPattern2450);
            varOrIRIref218=varOrIRIref();

            state._fsp--;

            stream_varOrIRIref.add(varOrIRIref218.getTree());
            pushFollow(FOLLOW_groupGraphPattern_in_graphGraphPattern2452);
            groupGraphPattern219=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern219.getTree());


            // AST REWRITE
            // elements: groupGraphPattern, GRAPH, varOrIRIref
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 306:43: -> ^( GRAPH varOrIRIref groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:306:46: ^( GRAPH varOrIRIref groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_GRAPH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_varOrIRIref.nextTree());
                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphGraphPattern"

    public static class serviceGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "serviceGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:309:1: serviceGraphPattern : SERVICE ( SILENT )? varOrIRIref groupGraphPattern -> ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) ;
    public final SparqlParser.serviceGraphPattern_return serviceGraphPattern() throws RecognitionException {
        SparqlParser.serviceGraphPattern_return retval = new SparqlParser.serviceGraphPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SERVICE220=null;
        Token SILENT221=null;
        SparqlParser.varOrIRIref_return varOrIRIref222 = null;

        SparqlParser.groupGraphPattern_return groupGraphPattern223 = null;


        Object SERVICE220_tree=null;
        Object SILENT221_tree=null;
        RewriteRuleTokenStream stream_SILENT=new RewriteRuleTokenStream(adaptor,"token SILENT");
        RewriteRuleTokenStream stream_SERVICE=new RewriteRuleTokenStream(adaptor,"token SERVICE");
        RewriteRuleSubtreeStream stream_varOrIRIref=new RewriteRuleSubtreeStream(adaptor,"rule varOrIRIref");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:310:5: ( SERVICE ( SILENT )? varOrIRIref groupGraphPattern -> ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:310:7: SERVICE ( SILENT )? varOrIRIref groupGraphPattern
            {
            SERVICE220=(Token)match(input,SERVICE,FOLLOW_SERVICE_in_serviceGraphPattern2479);  
            stream_SERVICE.add(SERVICE220);

            // com\\googlecode\\sparkleg\\Sparql.g:310:15: ( SILENT )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==SILENT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:310:15: SILENT
                    {
                    SILENT221=(Token)match(input,SILENT,FOLLOW_SILENT_in_serviceGraphPattern2481);  
                    stream_SILENT.add(SILENT221);


                    }
                    break;

            }

            pushFollow(FOLLOW_varOrIRIref_in_serviceGraphPattern2484);
            varOrIRIref222=varOrIRIref();

            state._fsp--;

            stream_varOrIRIref.add(varOrIRIref222.getTree());
            pushFollow(FOLLOW_groupGraphPattern_in_serviceGraphPattern2486);
            groupGraphPattern223=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern223.getTree());


            // AST REWRITE
            // elements: varOrIRIref, SILENT, SERVICE, groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:53: -> ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:310:56: ^( SERVICE ( SILENT )? varOrIRIref groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SERVICE.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:310:66: ( SILENT )?
                if ( stream_SILENT.hasNext() ) {
                    adaptor.addChild(root_1, stream_SILENT.nextNode());

                }
                stream_SILENT.reset();
                adaptor.addChild(root_1, stream_varOrIRIref.nextTree());
                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "serviceGraphPattern"

    public static class bind_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bind"
    // com\\googlecode\\sparkleg\\Sparql.g:313:1: bind : BIND OPEN_BRACE expression AS var CLOSE_BRACE -> ^( BIND expression ^( AS var ) ) ;
    public final SparqlParser.bind_return bind() throws RecognitionException {
        SparqlParser.bind_return retval = new SparqlParser.bind_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BIND224=null;
        Token OPEN_BRACE225=null;
        Token AS227=null;
        Token CLOSE_BRACE229=null;
        SparqlParser.expression_return expression226 = null;

        SparqlParser.var_return var228 = null;


        Object BIND224_tree=null;
        Object OPEN_BRACE225_tree=null;
        Object AS227_tree=null;
        Object CLOSE_BRACE229_tree=null;
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_BIND=new RewriteRuleTokenStream(adaptor,"token BIND");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:314:5: ( BIND OPEN_BRACE expression AS var CLOSE_BRACE -> ^( BIND expression ^( AS var ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:314:7: BIND OPEN_BRACE expression AS var CLOSE_BRACE
            {
            BIND224=(Token)match(input,BIND,FOLLOW_BIND_in_bind2520);  
            stream_BIND.add(BIND224);

            OPEN_BRACE225=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_bind2522);  
            stream_OPEN_BRACE.add(OPEN_BRACE225);

            pushFollow(FOLLOW_expression_in_bind2524);
            expression226=expression();

            state._fsp--;

            stream_expression.add(expression226.getTree());
            AS227=(Token)match(input,AS,FOLLOW_AS_in_bind2526);  
            stream_AS.add(AS227);

            pushFollow(FOLLOW_var_in_bind2528);
            var228=var();

            state._fsp--;

            stream_var.add(var228.getTree());
            CLOSE_BRACE229=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_bind2530);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE229);



            // AST REWRITE
            // elements: var, AS, expression, BIND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:53: -> ^( BIND expression ^( AS var ) )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:314:56: ^( BIND expression ^( AS var ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_BIND.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:314:74: ^( AS var )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_AS.nextNode(), root_2);

                adaptor.addChild(root_2, stream_var.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bind"

    public static class minusGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "minusGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:317:1: minusGraphPattern : MINUS_KEYWORD groupGraphPattern -> ^( MINUS_KEYWORD groupGraphPattern ) ;
    public final SparqlParser.minusGraphPattern_return minusGraphPattern() throws RecognitionException {
        SparqlParser.minusGraphPattern_return retval = new SparqlParser.minusGraphPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS_KEYWORD230=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern231 = null;


        Object MINUS_KEYWORD230_tree=null;
        RewriteRuleTokenStream stream_MINUS_KEYWORD=new RewriteRuleTokenStream(adaptor,"token MINUS_KEYWORD");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:318:5: ( MINUS_KEYWORD groupGraphPattern -> ^( MINUS_KEYWORD groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:318:7: MINUS_KEYWORD groupGraphPattern
            {
            MINUS_KEYWORD230=(Token)match(input,MINUS_KEYWORD,FOLLOW_MINUS_KEYWORD_in_minusGraphPattern2567);  
            stream_MINUS_KEYWORD.add(MINUS_KEYWORD230);

            pushFollow(FOLLOW_groupGraphPattern_in_minusGraphPattern2569);
            groupGraphPattern231=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern231.getTree());


            // AST REWRITE
            // elements: groupGraphPattern, MINUS_KEYWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 318:39: -> ^( MINUS_KEYWORD groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:318:42: ^( MINUS_KEYWORD groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_MINUS_KEYWORD.nextNode(), root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "minusGraphPattern"

    public static class groupOrUnionGraphPattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "groupOrUnionGraphPattern"
    // com\\googlecode\\sparkleg\\Sparql.g:321:1: groupOrUnionGraphPattern : (g1= groupGraphPattern -> $g1) ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )* ;
    public final SparqlParser.groupOrUnionGraphPattern_return groupOrUnionGraphPattern() throws RecognitionException {
        SparqlParser.groupOrUnionGraphPattern_return retval = new SparqlParser.groupOrUnionGraphPattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token UNION232=null;
        SparqlParser.groupGraphPattern_return g1 = null;

        SparqlParser.groupGraphPattern_return g2 = null;


        Object UNION232_tree=null;
        RewriteRuleTokenStream stream_UNION=new RewriteRuleTokenStream(adaptor,"token UNION");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:322:5: ( (g1= groupGraphPattern -> $g1) ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:322:7: (g1= groupGraphPattern -> $g1) ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:322:7: (g1= groupGraphPattern -> $g1)
            // com\\googlecode\\sparkleg\\Sparql.g:322:8: g1= groupGraphPattern
            {
            pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2597);
            g1=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(g1.getTree());


            // AST REWRITE
            // elements: g1
            // token labels: 
            // rule labels: retval, g1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_g1=new RewriteRuleSubtreeStream(adaptor,"rule g1",g1!=null?g1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 322:28: -> $g1
            {
                adaptor.addChild(root_0, stream_g1.nextTree());

            }

            retval.tree = root_0;
            }

            // com\\googlecode\\sparkleg\\Sparql.g:322:35: ( ( UNION g2= groupGraphPattern ) -> ^( UNION $groupOrUnionGraphPattern $g2) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==UNION) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:322:36: ( UNION g2= groupGraphPattern )
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:322:36: ( UNION g2= groupGraphPattern )
            	    // com\\googlecode\\sparkleg\\Sparql.g:322:37: UNION g2= groupGraphPattern
            	    {
            	    UNION232=(Token)match(input,UNION,FOLLOW_UNION_in_groupOrUnionGraphPattern2605);  
            	    stream_UNION.add(UNION232);

            	    pushFollow(FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2609);
            	    g2=groupGraphPattern();

            	    state._fsp--;

            	    stream_groupGraphPattern.add(g2.getTree());

            	    }



            	    // AST REWRITE
            	    // elements: UNION, g2, groupOrUnionGraphPattern
            	    // token labels: 
            	    // rule labels: retval, g2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_g2=new RewriteRuleSubtreeStream(adaptor,"rule g2",g2!=null?g2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 322:65: -> ^( UNION $groupOrUnionGraphPattern $g2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:322:68: ^( UNION $groupOrUnionGraphPattern $g2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_UNION.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_g2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "groupOrUnionGraphPattern"

    public static class filter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "filter"
    // com\\googlecode\\sparkleg\\Sparql.g:325:1: filter : FILTER constraint -> ^( FILTER constraint ) ;
    public final SparqlParser.filter_return filter() throws RecognitionException {
        SparqlParser.filter_return retval = new SparqlParser.filter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FILTER233=null;
        SparqlParser.constraint_return constraint234 = null;


        Object FILTER233_tree=null;
        RewriteRuleTokenStream stream_FILTER=new RewriteRuleTokenStream(adaptor,"token FILTER");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:326:5: ( FILTER constraint -> ^( FILTER constraint ) )
            // com\\googlecode\\sparkleg\\Sparql.g:326:7: FILTER constraint
            {
            FILTER233=(Token)match(input,FILTER,FOLLOW_FILTER_in_filter2641);  
            stream_FILTER.add(FILTER233);

            pushFollow(FOLLOW_constraint_in_filter2643);
            constraint234=constraint();

            state._fsp--;

            stream_constraint.add(constraint234.getTree());


            // AST REWRITE
            // elements: constraint, FILTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 326:25: -> ^( FILTER constraint )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:326:28: ^( FILTER constraint )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FILTER.nextNode(), root_1);

                adaptor.addChild(root_1, stream_constraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "filter"

    public static class constraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraint"
    // com\\googlecode\\sparkleg\\Sparql.g:329:1: constraint : ( brackettedExpression | builtInCall | functionCall );
    public final SparqlParser.constraint_return constraint() throws RecognitionException {
        SparqlParser.constraint_return retval = new SparqlParser.constraint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.brackettedExpression_return brackettedExpression235 = null;

        SparqlParser.builtInCall_return builtInCall236 = null;

        SparqlParser.functionCall_return functionCall237 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:330:5: ( brackettedExpression | builtInCall | functionCall )
            int alt75=3;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt75=1;
                }
                break;
            case NOT:
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
                alt75=2;
                }
                break;
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:330:7: brackettedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_brackettedExpression_in_constraint2668);
                    brackettedExpression235=brackettedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, brackettedExpression235.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:331:7: builtInCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtInCall_in_constraint2676);
                    builtInCall236=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall236.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:332:7: functionCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_constraint2684);
                    functionCall237=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall237.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraint"

    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // com\\googlecode\\sparkleg\\Sparql.g:335:1: functionCall : iriRef argList -> ^( FUNCTION iriRef ^( ARG_LIST argList ) ) ;
    public final SparqlParser.functionCall_return functionCall() throws RecognitionException {
        SparqlParser.functionCall_return retval = new SparqlParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.iriRef_return iriRef238 = null;

        SparqlParser.argList_return argList239 = null;


        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:336:5: ( iriRef argList -> ^( FUNCTION iriRef ^( ARG_LIST argList ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:336:7: iriRef argList
            {
            pushFollow(FOLLOW_iriRef_in_functionCall2701);
            iriRef238=iriRef();

            state._fsp--;

            stream_iriRef.add(iriRef238.getTree());
            pushFollow(FOLLOW_argList_in_functionCall2703);
            argList239=argList();

            state._fsp--;

            stream_argList.add(argList239.getTree());


            // AST REWRITE
            // elements: iriRef, argList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 336:22: -> ^( FUNCTION iriRef ^( ARG_LIST argList ) )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:336:25: ^( FUNCTION iriRef ^( ARG_LIST argList ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_iriRef.nextTree());
                // com\\googlecode\\sparkleg\\Sparql.g:336:43: ^( ARG_LIST argList )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_2);

                adaptor.addChild(root_2, stream_argList.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class argList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argList"
    // com\\googlecode\\sparkleg\\Sparql.g:339:1: argList : ( nil -> nil | OPEN_BRACE ( DISTINCT )? expression ( COMMA expression )* CLOSE_BRACE -> ( DISTINCT )? ( expression )* );
    public final SparqlParser.argList_return argList() throws RecognitionException {
        SparqlParser.argList_return retval = new SparqlParser.argList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE241=null;
        Token DISTINCT242=null;
        Token COMMA244=null;
        Token CLOSE_BRACE246=null;
        SparqlParser.nil_return nil240 = null;

        SparqlParser.expression_return expression243 = null;

        SparqlParser.expression_return expression245 = null;


        Object OPEN_BRACE241_tree=null;
        Object DISTINCT242_tree=null;
        Object COMMA244_tree=null;
        Object CLOSE_BRACE246_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_nil=new RewriteRuleSubtreeStream(adaptor,"rule nil");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:340:5: ( nil -> nil | OPEN_BRACE ( DISTINCT )? expression ( COMMA expression )* CLOSE_BRACE -> ( DISTINCT )? ( expression )* )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==OPEN_BRACE) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==CLOSE_BRACE) ) {
                    alt78=1;
                }
                else if ( (LA78_1==IRI_REF||LA78_1==PNAME_NS||LA78_1==DISTINCT||LA78_1==OPEN_BRACE||LA78_1==INTEGER||(LA78_1>=PLUS && LA78_1<=NEGATION)||(LA78_1>=VAR1 && LA78_1<=VAR2)||(LA78_1>=NOT && LA78_1<=GROUP_CONCAT)||(LA78_1>=DECIMAL && LA78_1<=PNAME_LN)) ) {
                    alt78=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:340:7: nil
                    {
                    pushFollow(FOLLOW_nil_in_argList2734);
                    nil240=nil();

                    state._fsp--;

                    stream_nil.add(nil240.getTree());


                    // AST REWRITE
                    // elements: nil
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:11: -> nil
                    {
                        adaptor.addChild(root_0, stream_nil.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:341:7: OPEN_BRACE ( DISTINCT )? expression ( COMMA expression )* CLOSE_BRACE
                    {
                    OPEN_BRACE241=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_argList2746);  
                    stream_OPEN_BRACE.add(OPEN_BRACE241);

                    // com\\googlecode\\sparkleg\\Sparql.g:341:18: ( DISTINCT )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==DISTINCT) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:341:18: DISTINCT
                            {
                            DISTINCT242=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_argList2748);  
                            stream_DISTINCT.add(DISTINCT242);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_argList2751);
                    expression243=expression();

                    state._fsp--;

                    stream_expression.add(expression243.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:341:39: ( COMMA expression )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==COMMA) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:341:40: COMMA expression
                    	    {
                    	    COMMA244=(Token)match(input,COMMA,FOLLOW_COMMA_in_argList2754);  
                    	    stream_COMMA.add(COMMA244);

                    	    pushFollow(FOLLOW_expression_in_argList2756);
                    	    expression245=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression245.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    CLOSE_BRACE246=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_argList2760);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE246);



                    // AST REWRITE
                    // elements: DISTINCT, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 341:71: -> ( DISTINCT )? ( expression )*
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:341:74: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_0, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:341:84: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_0, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argList"

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // com\\googlecode\\sparkleg\\Sparql.g:344:1: expressionList : ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE ) -> ^( EXPRESSION_LIST ( nil )* ( expression )* ) ;
    public final SparqlParser.expressionList_return expressionList() throws RecognitionException {
        SparqlParser.expressionList_return retval = new SparqlParser.expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE248=null;
        Token COMMA250=null;
        Token CLOSE_BRACE252=null;
        SparqlParser.nil_return nil247 = null;

        SparqlParser.expression_return expression249 = null;

        SparqlParser.expression_return expression251 = null;


        Object OPEN_BRACE248_tree=null;
        Object COMMA250_tree=null;
        Object CLOSE_BRACE252_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_nil=new RewriteRuleSubtreeStream(adaptor,"rule nil");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:345:5: ( ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE ) -> ^( EXPRESSION_LIST ( nil )* ( expression )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:345:7: ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE )
            {
            // com\\googlecode\\sparkleg\\Sparql.g:345:7: ( nil | OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==OPEN_BRACE) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==CLOSE_BRACE) ) {
                    alt80=1;
                }
                else if ( (LA80_1==IRI_REF||LA80_1==PNAME_NS||LA80_1==OPEN_BRACE||LA80_1==INTEGER||(LA80_1>=PLUS && LA80_1<=NEGATION)||(LA80_1>=VAR1 && LA80_1<=VAR2)||(LA80_1>=NOT && LA80_1<=GROUP_CONCAT)||(LA80_1>=DECIMAL && LA80_1<=PNAME_LN)) ) {
                    alt80=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:345:8: nil
                    {
                    pushFollow(FOLLOW_nil_in_expressionList2786);
                    nil247=nil();

                    state._fsp--;

                    stream_nil.add(nil247.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:345:14: OPEN_BRACE expression ( COMMA expression )* CLOSE_BRACE
                    {
                    OPEN_BRACE248=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_expressionList2790);  
                    stream_OPEN_BRACE.add(OPEN_BRACE248);

                    pushFollow(FOLLOW_expression_in_expressionList2792);
                    expression249=expression();

                    state._fsp--;

                    stream_expression.add(expression249.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:345:36: ( COMMA expression )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==COMMA) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:345:37: COMMA expression
                    	    {
                    	    COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList2795);  
                    	    stream_COMMA.add(COMMA250);

                    	    pushFollow(FOLLOW_expression_in_expressionList2797);
                    	    expression251=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression251.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    CLOSE_BRACE252=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_expressionList2801);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE252);


                    }
                    break;

            }



            // AST REWRITE
            // elements: nil, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 345:69: -> ^( EXPRESSION_LIST ( nil )* ( expression )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:345:72: ^( EXPRESSION_LIST ( nil )* ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:345:90: ( nil )*
                while ( stream_nil.hasNext() ) {
                    adaptor.addChild(root_1, stream_nil.nextTree());

                }
                stream_nil.reset();
                // com\\googlecode\\sparkleg\\Sparql.g:345:95: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class constructTemplate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructTemplate"
    // com\\googlecode\\sparkleg\\Sparql.g:348:1: constructTemplate : OPEN_CURLY_BRACE ( constructTriples )? CLOSE_CURLY_BRACE -> ^( CONSTRUCT_TRIPLES ( constructTriples )? ) ;
    public final SparqlParser.constructTemplate_return constructTemplate() throws RecognitionException {
        SparqlParser.constructTemplate_return retval = new SparqlParser.constructTemplate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_CURLY_BRACE253=null;
        Token CLOSE_CURLY_BRACE255=null;
        SparqlParser.constructTriples_return constructTriples254 = null;


        Object OPEN_CURLY_BRACE253_tree=null;
        Object CLOSE_CURLY_BRACE255_tree=null;
        RewriteRuleTokenStream stream_OPEN_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_CURLY_BRACE");
        RewriteRuleTokenStream stream_CLOSE_CURLY_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_CURLY_BRACE");
        RewriteRuleSubtreeStream stream_constructTriples=new RewriteRuleSubtreeStream(adaptor,"rule constructTriples");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:349:5: ( OPEN_CURLY_BRACE ( constructTriples )? CLOSE_CURLY_BRACE -> ^( CONSTRUCT_TRIPLES ( constructTriples )? ) )
            // com\\googlecode\\sparkleg\\Sparql.g:349:7: OPEN_CURLY_BRACE ( constructTriples )? CLOSE_CURLY_BRACE
            {
            OPEN_CURLY_BRACE253=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_constructTemplate2832);  
            stream_OPEN_CURLY_BRACE.add(OPEN_CURLY_BRACE253);

            // com\\googlecode\\sparkleg\\Sparql.g:349:24: ( constructTriples )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IRI_REF||LA81_0==PNAME_NS||LA81_0==OPEN_BRACE||LA81_0==INTEGER||LA81_0==OPEN_SQUARE_BRACKET||(LA81_0>=VAR1 && LA81_0<=VAR2)||(LA81_0>=DECIMAL && LA81_0<=BLANK_NODE_LABEL)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:349:24: constructTriples
                    {
                    pushFollow(FOLLOW_constructTriples_in_constructTemplate2834);
                    constructTriples254=constructTriples();

                    state._fsp--;

                    stream_constructTriples.add(constructTriples254.getTree());

                    }
                    break;

            }

            CLOSE_CURLY_BRACE255=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_constructTemplate2837);  
            stream_CLOSE_CURLY_BRACE.add(CLOSE_CURLY_BRACE255);



            // AST REWRITE
            // elements: constructTriples
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 349:60: -> ^( CONSTRUCT_TRIPLES ( constructTriples )? )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:349:63: ^( CONSTRUCT_TRIPLES ( constructTriples )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRUCT_TRIPLES, "CONSTRUCT_TRIPLES"), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:349:83: ( constructTriples )?
                if ( stream_constructTriples.hasNext() ) {
                    adaptor.addChild(root_1, stream_constructTriples.nextTree());

                }
                stream_constructTriples.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructTemplate"

    public static class constructTriples_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructTriples"
    // com\\googlecode\\sparkleg\\Sparql.g:352:1: constructTriples : triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ( triplesSameSubject )+ ;
    public final SparqlParser.constructTriples_return constructTriples() throws RecognitionException {
        SparqlParser.constructTriples_return retval = new SparqlParser.constructTriples_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT257=null;
        Token DOT259=null;
        SparqlParser.triplesSameSubject_return triplesSameSubject256 = null;

        SparqlParser.triplesSameSubject_return triplesSameSubject258 = null;


        Object DOT257_tree=null;
        Object DOT259_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_triplesSameSubject=new RewriteRuleSubtreeStream(adaptor,"rule triplesSameSubject");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:353:5: ( triplesSameSubject ( DOT triplesSameSubject )* ( DOT )? -> ( triplesSameSubject )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:353:7: triplesSameSubject ( DOT triplesSameSubject )* ( DOT )?
            {
            pushFollow(FOLLOW_triplesSameSubject_in_constructTriples2863);
            triplesSameSubject256=triplesSameSubject();

            state._fsp--;

            stream_triplesSameSubject.add(triplesSameSubject256.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:353:26: ( DOT triplesSameSubject )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==DOT) ) {
                    int LA82_1 = input.LA(2);

                    if ( (LA82_1==IRI_REF||LA82_1==PNAME_NS||LA82_1==OPEN_BRACE||LA82_1==INTEGER||LA82_1==OPEN_SQUARE_BRACKET||(LA82_1>=VAR1 && LA82_1<=VAR2)||(LA82_1>=DECIMAL && LA82_1<=BLANK_NODE_LABEL)) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:353:27: DOT triplesSameSubject
            	    {
            	    DOT257=(Token)match(input,DOT,FOLLOW_DOT_in_constructTriples2866);  
            	    stream_DOT.add(DOT257);

            	    pushFollow(FOLLOW_triplesSameSubject_in_constructTriples2868);
            	    triplesSameSubject258=triplesSameSubject();

            	    state._fsp--;

            	    stream_triplesSameSubject.add(triplesSameSubject258.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // com\\googlecode\\sparkleg\\Sparql.g:353:52: ( DOT )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==DOT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:353:52: DOT
                    {
                    DOT259=(Token)match(input,DOT,FOLLOW_DOT_in_constructTriples2872);  
                    stream_DOT.add(DOT259);


                    }
                    break;

            }



            // AST REWRITE
            // elements: triplesSameSubject
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 353:57: -> ( triplesSameSubject )+
            {
                if ( !(stream_triplesSameSubject.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_triplesSameSubject.hasNext() ) {
                    adaptor.addChild(root_0, stream_triplesSameSubject.nextTree());

                }
                stream_triplesSameSubject.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constructTriples"

    public static class triplesSameSubject_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesSameSubject"
    // com\\googlecode\\sparkleg\\Sparql.g:356:1: triplesSameSubject : ( varOrTerm propertyListNotEmpty -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) );
    public final SparqlParser.triplesSameSubject_return triplesSameSubject() throws RecognitionException {
        SparqlParser.triplesSameSubject_return retval = new SparqlParser.triplesSameSubject_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.varOrTerm_return varOrTerm260 = null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty261 = null;

        SparqlParser.triplesNode_return triplesNode262 = null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty263 = null;


        RewriteRuleSubtreeStream stream_varOrTerm=new RewriteRuleSubtreeStream(adaptor,"rule varOrTerm");
        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        RewriteRuleSubtreeStream stream_triplesNode=new RewriteRuleSubtreeStream(adaptor,"rule triplesNode");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:357:5: ( varOrTerm propertyListNotEmpty -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) )
            int alt85=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case INTEGER:
            case VAR1:
            case VAR2:
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
                alt85=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                int LA85_2 = input.LA(2);

                if ( (LA85_2==CLOSE_SQUARE_BRACKET) ) {
                    alt85=1;
                }
                else if ( (LA85_2==IRI_REF||LA85_2==PNAME_NS||LA85_2==A||(LA85_2>=VAR1 && LA85_2<=VAR2)||LA85_2==PNAME_LN) ) {
                    alt85=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 2, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_BRACE:
                {
                int LA85_3 = input.LA(2);

                if ( (LA85_3==CLOSE_BRACE) ) {
                    alt85=1;
                }
                else if ( (LA85_3==IRI_REF||LA85_3==PNAME_NS||LA85_3==OPEN_BRACE||LA85_3==INTEGER||LA85_3==OPEN_SQUARE_BRACKET||(LA85_3>=VAR1 && LA85_3<=VAR2)||(LA85_3>=DECIMAL && LA85_3<=BLANK_NODE_LABEL)) ) {
                    alt85=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:357:7: varOrTerm propertyListNotEmpty
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubject2895);
                    varOrTerm260=varOrTerm();

                    state._fsp--;

                    stream_varOrTerm.add(varOrTerm260.getTree());
                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2897);
                    propertyListNotEmpty261=propertyListNotEmpty();

                    state._fsp--;

                    stream_propertyListNotEmpty.add(propertyListNotEmpty261.getTree());


                    // AST REWRITE
                    // elements: varOrTerm, propertyListNotEmpty
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 357:38: -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:357:41: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmpty )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT"), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:357:64: ^( SUBJECT varOrTerm )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBJECT, "SUBJECT"), root_2);

                        adaptor.addChild(root_2, stream_varOrTerm.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:358:7: triplesNode ( propertyListNotEmpty )?
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubject2919);
                    triplesNode262=triplesNode();

                    state._fsp--;

                    stream_triplesNode.add(triplesNode262.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:358:19: ( propertyListNotEmpty )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==IRI_REF||LA84_0==PNAME_NS||LA84_0==A||(LA84_0>=VAR1 && LA84_0<=VAR2)||LA84_0==PNAME_LN) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:358:19: propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubject2921);
                            propertyListNotEmpty263=propertyListNotEmpty();

                            state._fsp--;

                            stream_propertyListNotEmpty.add(propertyListNotEmpty263.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: triplesNode, propertyListNotEmpty
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 358:41: -> ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:358:44: ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT"), root_1);

                        adaptor.addChild(root_1, stream_triplesNode.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:358:79: ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )?
                        if ( stream_propertyListNotEmpty.hasNext() ) {
                            // com\\googlecode\\sparkleg\\Sparql.g:358:80: ^( SUBJECT BLANK_NODE )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBJECT, "SUBJECT"), root_2);

                            adaptor.addChild(root_2, (Object)adaptor.create(BLANK_NODE, "BLANK_NODE"));

                            adaptor.addChild(root_1, root_2);
                            }
                            adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        }
                        stream_propertyListNotEmpty.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubject"

    public static class propertyListNotEmpty_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyListNotEmpty"
    // com\\googlecode\\sparkleg\\Sparql.g:361:1: propertyListNotEmpty : verb objectList ( SEMICOLON ( verb objectList )? )* -> ( ^( PREDICATE verb ) objectList )+ ;
    public final SparqlParser.propertyListNotEmpty_return propertyListNotEmpty() throws RecognitionException {
        SparqlParser.propertyListNotEmpty_return retval = new SparqlParser.propertyListNotEmpty_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON266=null;
        SparqlParser.verb_return verb264 = null;

        SparqlParser.objectList_return objectList265 = null;

        SparqlParser.verb_return verb267 = null;

        SparqlParser.objectList_return objectList268 = null;


        Object SEMICOLON266_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_verb=new RewriteRuleSubtreeStream(adaptor,"rule verb");
        RewriteRuleSubtreeStream stream_objectList=new RewriteRuleSubtreeStream(adaptor,"rule objectList");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:362:5: ( verb objectList ( SEMICOLON ( verb objectList )? )* -> ( ^( PREDICATE verb ) objectList )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:362:7: verb objectList ( SEMICOLON ( verb objectList )? )*
            {
            pushFollow(FOLLOW_verb_in_propertyListNotEmpty2959);
            verb264=verb();

            state._fsp--;

            stream_verb.add(verb264.getTree());
            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty2961);
            objectList265=objectList();

            state._fsp--;

            stream_objectList.add(objectList265.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:362:23: ( SEMICOLON ( verb objectList )? )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==SEMICOLON) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:362:24: SEMICOLON ( verb objectList )?
            	    {
            	    SEMICOLON266=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_propertyListNotEmpty2964);  
            	    stream_SEMICOLON.add(SEMICOLON266);

            	    // com\\googlecode\\sparkleg\\Sparql.g:362:34: ( verb objectList )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==IRI_REF||LA86_0==PNAME_NS||LA86_0==A||(LA86_0>=VAR1 && LA86_0<=VAR2)||LA86_0==PNAME_LN) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:362:35: verb objectList
            	            {
            	            pushFollow(FOLLOW_verb_in_propertyListNotEmpty2967);
            	            verb267=verb();

            	            state._fsp--;

            	            stream_verb.add(verb267.getTree());
            	            pushFollow(FOLLOW_objectList_in_propertyListNotEmpty2969);
            	            objectList268=objectList();

            	            state._fsp--;

            	            stream_objectList.add(objectList268.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);



            // AST REWRITE
            // elements: verb, objectList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 362:55: -> ( ^( PREDICATE verb ) objectList )+
            {
                if ( !(stream_verb.hasNext()||stream_objectList.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_verb.hasNext()||stream_objectList.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:362:59: ^( PREDICATE verb )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATE, "PREDICATE"), root_1);

                    adaptor.addChild(root_1, stream_verb.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_objectList.nextTree());

                }
                stream_verb.reset();
                stream_objectList.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmpty"

    public static class objectList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectList"
    // com\\googlecode\\sparkleg\\Sparql.g:365:1: objectList : graphNode ( COMMA graphNode )* -> ( ^( OBJECT graphNode ) )+ ;
    public final SparqlParser.objectList_return objectList() throws RecognitionException {
        SparqlParser.objectList_return retval = new SparqlParser.objectList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA270=null;
        SparqlParser.graphNode_return graphNode269 = null;

        SparqlParser.graphNode_return graphNode271 = null;


        Object COMMA270_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_graphNode=new RewriteRuleSubtreeStream(adaptor,"rule graphNode");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:366:5: ( graphNode ( COMMA graphNode )* -> ( ^( OBJECT graphNode ) )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:366:7: graphNode ( COMMA graphNode )*
            {
            pushFollow(FOLLOW_graphNode_in_objectList3004);
            graphNode269=graphNode();

            state._fsp--;

            stream_graphNode.add(graphNode269.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:366:17: ( COMMA graphNode )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:366:18: COMMA graphNode
            	    {
            	    COMMA270=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectList3007);  
            	    stream_COMMA.add(COMMA270);

            	    pushFollow(FOLLOW_graphNode_in_objectList3009);
            	    graphNode271=graphNode();

            	    state._fsp--;

            	    stream_graphNode.add(graphNode271.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);



            // AST REWRITE
            // elements: graphNode
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 366:36: -> ( ^( OBJECT graphNode ) )+
            {
                if ( !(stream_graphNode.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_graphNode.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:366:39: ^( OBJECT graphNode )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT, "OBJECT"), root_1);

                    adaptor.addChild(root_1, stream_graphNode.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_graphNode.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectList"

    public static class verb_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verb"
    // com\\googlecode\\sparkleg\\Sparql.g:369:1: verb : ( varOrIRIref | A );
    public final SparqlParser.verb_return verb() throws RecognitionException {
        SparqlParser.verb_return retval = new SparqlParser.verb_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token A273=null;
        SparqlParser.varOrIRIref_return varOrIRIref272 = null;


        Object A273_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:370:5: ( varOrIRIref | A )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==IRI_REF||LA89_0==PNAME_NS||(LA89_0>=VAR1 && LA89_0<=VAR2)||LA89_0==PNAME_LN) ) {
                alt89=1;
            }
            else if ( (LA89_0==A) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:370:7: varOrIRIref
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varOrIRIref_in_verb3037);
                    varOrIRIref272=varOrIRIref();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrIRIref272.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:371:7: A
                    {
                    root_0 = (Object)adaptor.nil();

                    A273=(Token)match(input,A,FOLLOW_A_in_verb3045); 
                    A273_tree = (Object)adaptor.create(A273);
                    adaptor.addChild(root_0, A273_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verb"

    public static class triplesSameSubjectPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesSameSubjectPath"
    // com\\googlecode\\sparkleg\\Sparql.g:374:1: triplesSameSubjectPath : ( varOrTerm propertyListNotEmptyPath -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) );
    public final SparqlParser.triplesSameSubjectPath_return triplesSameSubjectPath() throws RecognitionException {
        SparqlParser.triplesSameSubjectPath_return retval = new SparqlParser.triplesSameSubjectPath_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.varOrTerm_return varOrTerm274 = null;

        SparqlParser.propertyListNotEmptyPath_return propertyListNotEmptyPath275 = null;

        SparqlParser.triplesNode_return triplesNode276 = null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty277 = null;


        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        RewriteRuleSubtreeStream stream_varOrTerm=new RewriteRuleSubtreeStream(adaptor,"rule varOrTerm");
        RewriteRuleSubtreeStream stream_triplesNode=new RewriteRuleSubtreeStream(adaptor,"rule triplesNode");
        RewriteRuleSubtreeStream stream_propertyListNotEmptyPath=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmptyPath");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:375:5: ( varOrTerm propertyListNotEmptyPath -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath ) | triplesNode ( propertyListNotEmpty )? -> ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? ) )
            int alt91=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case INTEGER:
            case VAR1:
            case VAR2:
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
                alt91=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                int LA91_2 = input.LA(2);

                if ( (LA91_2==CLOSE_SQUARE_BRACKET) ) {
                    alt91=1;
                }
                else if ( (LA91_2==IRI_REF||LA91_2==PNAME_NS||LA91_2==A||(LA91_2>=VAR1 && LA91_2<=VAR2)||LA91_2==PNAME_LN) ) {
                    alt91=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 2, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_BRACE:
                {
                int LA91_3 = input.LA(2);

                if ( (LA91_3==CLOSE_BRACE) ) {
                    alt91=1;
                }
                else if ( (LA91_3==IRI_REF||LA91_3==PNAME_NS||LA91_3==OPEN_BRACE||LA91_3==INTEGER||LA91_3==OPEN_SQUARE_BRACKET||(LA91_3>=VAR1 && LA91_3<=VAR2)||(LA91_3>=DECIMAL && LA91_3<=BLANK_NODE_LABEL)) ) {
                    alt91=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 91, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:375:7: varOrTerm propertyListNotEmptyPath
                    {
                    pushFollow(FOLLOW_varOrTerm_in_triplesSameSubjectPath3062);
                    varOrTerm274=varOrTerm();

                    state._fsp--;

                    stream_varOrTerm.add(varOrTerm274.getTree());
                    pushFollow(FOLLOW_propertyListNotEmptyPath_in_triplesSameSubjectPath3064);
                    propertyListNotEmptyPath275=propertyListNotEmptyPath();

                    state._fsp--;

                    stream_propertyListNotEmptyPath.add(propertyListNotEmptyPath275.getTree());


                    // AST REWRITE
                    // elements: varOrTerm, propertyListNotEmptyPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 375:42: -> ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:375:45: ^( TRIPLES_SAME_SUBJECT ^( SUBJECT varOrTerm ) propertyListNotEmptyPath )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT"), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:375:68: ^( SUBJECT varOrTerm )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBJECT, "SUBJECT"), root_2);

                        adaptor.addChild(root_2, stream_varOrTerm.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_propertyListNotEmptyPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:376:7: triplesNode ( propertyListNotEmpty )?
                    {
                    pushFollow(FOLLOW_triplesNode_in_triplesSameSubjectPath3086);
                    triplesNode276=triplesNode();

                    state._fsp--;

                    stream_triplesNode.add(triplesNode276.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:376:19: ( propertyListNotEmpty )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==IRI_REF||LA90_0==PNAME_NS||LA90_0==A||(LA90_0>=VAR1 && LA90_0<=VAR2)||LA90_0==PNAME_LN) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:376:19: propertyListNotEmpty
                            {
                            pushFollow(FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath3088);
                            propertyListNotEmpty277=propertyListNotEmpty();

                            state._fsp--;

                            stream_propertyListNotEmpty.add(propertyListNotEmpty277.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: propertyListNotEmpty, triplesNode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:41: -> ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:376:44: ^( TRIPLES_SAME_SUBJECT triplesNode ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLES_SAME_SUBJECT, "TRIPLES_SAME_SUBJECT"), root_1);

                        adaptor.addChild(root_1, stream_triplesNode.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:376:80: ( ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )?
                        if ( stream_propertyListNotEmpty.hasNext() ) {
                            // com\\googlecode\\sparkleg\\Sparql.g:376:81: ^( SUBJECT BLANK_NODE )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBJECT, "SUBJECT"), root_2);

                            adaptor.addChild(root_2, (Object)adaptor.create(BLANK_NODE, "BLANK_NODE"));

                            adaptor.addChild(root_1, root_2);
                            }
                            adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        }
                        stream_propertyListNotEmpty.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesSameSubjectPath"

    public static class propertyListNotEmptyPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyListNotEmptyPath"
    // com\\googlecode\\sparkleg\\Sparql.g:379:1: propertyListNotEmptyPath : verbSimpleOrPath objectList ( SEMICOLON ( verbSimpleOrPath objectList )? )* -> ( ^( PREDICATE verbSimpleOrPath ) objectList )+ ;
    public final SparqlParser.propertyListNotEmptyPath_return propertyListNotEmptyPath() throws RecognitionException {
        SparqlParser.propertyListNotEmptyPath_return retval = new SparqlParser.propertyListNotEmptyPath_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON280=null;
        SparqlParser.verbSimpleOrPath_return verbSimpleOrPath278 = null;

        SparqlParser.objectList_return objectList279 = null;

        SparqlParser.verbSimpleOrPath_return verbSimpleOrPath281 = null;

        SparqlParser.objectList_return objectList282 = null;


        Object SEMICOLON280_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_verbSimpleOrPath=new RewriteRuleSubtreeStream(adaptor,"rule verbSimpleOrPath");
        RewriteRuleSubtreeStream stream_objectList=new RewriteRuleSubtreeStream(adaptor,"rule objectList");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:380:5: ( verbSimpleOrPath objectList ( SEMICOLON ( verbSimpleOrPath objectList )? )* -> ( ^( PREDICATE verbSimpleOrPath ) objectList )+ )
            // com\\googlecode\\sparkleg\\Sparql.g:380:7: verbSimpleOrPath objectList ( SEMICOLON ( verbSimpleOrPath objectList )? )*
            {
            pushFollow(FOLLOW_verbSimpleOrPath_in_propertyListNotEmptyPath3128);
            verbSimpleOrPath278=verbSimpleOrPath();

            state._fsp--;

            stream_verbSimpleOrPath.add(verbSimpleOrPath278.getTree());
            pushFollow(FOLLOW_objectList_in_propertyListNotEmptyPath3130);
            objectList279=objectList();

            state._fsp--;

            stream_objectList.add(objectList279.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:380:35: ( SEMICOLON ( verbSimpleOrPath objectList )? )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==SEMICOLON) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:380:36: SEMICOLON ( verbSimpleOrPath objectList )?
            	    {
            	    SEMICOLON280=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_propertyListNotEmptyPath3133);  
            	    stream_SEMICOLON.add(SEMICOLON280);

            	    // com\\googlecode\\sparkleg\\Sparql.g:380:46: ( verbSimpleOrPath objectList )?
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==IRI_REF||LA92_0==PNAME_NS||LA92_0==OPEN_BRACE||LA92_0==A||LA92_0==INVERSE||LA92_0==NEGATION||(LA92_0>=VAR1 && LA92_0<=VAR2)||LA92_0==PNAME_LN) ) {
            	        alt92=1;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:380:47: verbSimpleOrPath objectList
            	            {
            	            pushFollow(FOLLOW_verbSimpleOrPath_in_propertyListNotEmptyPath3136);
            	            verbSimpleOrPath281=verbSimpleOrPath();

            	            state._fsp--;

            	            stream_verbSimpleOrPath.add(verbSimpleOrPath281.getTree());
            	            pushFollow(FOLLOW_objectList_in_propertyListNotEmptyPath3138);
            	            objectList282=objectList();

            	            state._fsp--;

            	            stream_objectList.add(objectList282.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);



            // AST REWRITE
            // elements: objectList, verbSimpleOrPath
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 380:79: -> ( ^( PREDICATE verbSimpleOrPath ) objectList )+
            {
                if ( !(stream_objectList.hasNext()||stream_verbSimpleOrPath.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_objectList.hasNext()||stream_verbSimpleOrPath.hasNext() ) {
                    // com\\googlecode\\sparkleg\\Sparql.g:380:83: ^( PREDICATE verbSimpleOrPath )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATE, "PREDICATE"), root_1);

                    adaptor.addChild(root_1, stream_verbSimpleOrPath.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }
                    adaptor.addChild(root_0, stream_objectList.nextTree());

                }
                stream_objectList.reset();
                stream_verbSimpleOrPath.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyListNotEmptyPath"

    public static class verbSimpleOrPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verbSimpleOrPath"
    // com\\googlecode\\sparkleg\\Sparql.g:383:1: verbSimpleOrPath : ( verbPath | verbSimple );
    public final SparqlParser.verbSimpleOrPath_return verbSimpleOrPath() throws RecognitionException {
        SparqlParser.verbSimpleOrPath_return retval = new SparqlParser.verbSimpleOrPath_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.verbPath_return verbPath283 = null;

        SparqlParser.verbSimple_return verbSimple284 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:384:5: ( verbPath | verbSimple )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==IRI_REF||LA94_0==PNAME_NS||LA94_0==OPEN_BRACE||LA94_0==A||LA94_0==INVERSE||LA94_0==NEGATION||LA94_0==PNAME_LN) ) {
                alt94=1;
            }
            else if ( ((LA94_0>=VAR1 && LA94_0<=VAR2)) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:384:7: verbPath
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_verbPath_in_verbSimpleOrPath3174);
                    verbPath283=verbPath();

                    state._fsp--;

                    adaptor.addChild(root_0, verbPath283.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:385:7: verbSimple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_verbSimple_in_verbSimpleOrPath3182);
                    verbSimple284=verbSimple();

                    state._fsp--;

                    adaptor.addChild(root_0, verbSimple284.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verbSimpleOrPath"

    public static class verbPath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verbPath"
    // com\\googlecode\\sparkleg\\Sparql.g:388:1: verbPath : path ;
    public final SparqlParser.verbPath_return verbPath() throws RecognitionException {
        SparqlParser.verbPath_return retval = new SparqlParser.verbPath_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.path_return path285 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:389:5: ( path )
            // com\\googlecode\\sparkleg\\Sparql.g:389:7: path
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_path_in_verbPath3201);
            path285=path();

            state._fsp--;

            adaptor.addChild(root_0, path285.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verbPath"

    public static class verbSimple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verbSimple"
    // com\\googlecode\\sparkleg\\Sparql.g:392:1: verbSimple : var ;
    public final SparqlParser.verbSimple_return verbSimple() throws RecognitionException {
        SparqlParser.verbSimple_return retval = new SparqlParser.verbSimple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.var_return var286 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:393:5: ( var )
            // com\\googlecode\\sparkleg\\Sparql.g:393:7: var
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_var_in_verbSimple3222);
            var286=var();

            state._fsp--;

            adaptor.addChild(root_0, var286.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verbSimple"

    public static class path_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "path"
    // com\\googlecode\\sparkleg\\Sparql.g:396:1: path : pathSequence ( PIPE pathSequence )* -> ^( PATH ( pathSequence )+ ) ;
    public final SparqlParser.path_return path() throws RecognitionException {
        SparqlParser.path_return retval = new SparqlParser.path_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PIPE288=null;
        SparqlParser.pathSequence_return pathSequence287 = null;

        SparqlParser.pathSequence_return pathSequence289 = null;


        Object PIPE288_tree=null;
        RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
        RewriteRuleSubtreeStream stream_pathSequence=new RewriteRuleSubtreeStream(adaptor,"rule pathSequence");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:397:5: ( pathSequence ( PIPE pathSequence )* -> ^( PATH ( pathSequence )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:397:7: pathSequence ( PIPE pathSequence )*
            {
            pushFollow(FOLLOW_pathSequence_in_path3244);
            pathSequence287=pathSequence();

            state._fsp--;

            stream_pathSequence.add(pathSequence287.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:397:20: ( PIPE pathSequence )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==PIPE) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:397:21: PIPE pathSequence
            	    {
            	    PIPE288=(Token)match(input,PIPE,FOLLOW_PIPE_in_path3247);  
            	    stream_PIPE.add(PIPE288);

            	    pushFollow(FOLLOW_pathSequence_in_path3249);
            	    pathSequence289=pathSequence();

            	    state._fsp--;

            	    stream_pathSequence.add(pathSequence289.getTree());

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);



            // AST REWRITE
            // elements: pathSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 397:41: -> ^( PATH ( pathSequence )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:397:44: ^( PATH ( pathSequence )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH, "PATH"), root_1);

                if ( !(stream_pathSequence.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pathSequence.hasNext() ) {
                    adaptor.addChild(root_1, stream_pathSequence.nextTree());

                }
                stream_pathSequence.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "path"

    public static class pathSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathSequence"
    // com\\googlecode\\sparkleg\\Sparql.g:400:1: pathSequence : pathEltOrInverse ( DIVIDE pathEltOrInverse )* -> ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) ;
    public final SparqlParser.pathSequence_return pathSequence() throws RecognitionException {
        SparqlParser.pathSequence_return retval = new SparqlParser.pathSequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DIVIDE291=null;
        SparqlParser.pathEltOrInverse_return pathEltOrInverse290 = null;

        SparqlParser.pathEltOrInverse_return pathEltOrInverse292 = null;


        Object DIVIDE291_tree=null;
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_pathEltOrInverse=new RewriteRuleSubtreeStream(adaptor,"rule pathEltOrInverse");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:401:5: ( pathEltOrInverse ( DIVIDE pathEltOrInverse )* -> ^( PATH_SEQUENCE ( pathEltOrInverse )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:401:7: pathEltOrInverse ( DIVIDE pathEltOrInverse )*
            {
            pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3278);
            pathEltOrInverse290=pathEltOrInverse();

            state._fsp--;

            stream_pathEltOrInverse.add(pathEltOrInverse290.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:401:24: ( DIVIDE pathEltOrInverse )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==DIVIDE) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:401:25: DIVIDE pathEltOrInverse
            	    {
            	    DIVIDE291=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_pathSequence3281);  
            	    stream_DIVIDE.add(DIVIDE291);

            	    pushFollow(FOLLOW_pathEltOrInverse_in_pathSequence3283);
            	    pathEltOrInverse292=pathEltOrInverse();

            	    state._fsp--;

            	    stream_pathEltOrInverse.add(pathEltOrInverse292.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);



            // AST REWRITE
            // elements: pathEltOrInverse
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 401:51: -> ^( PATH_SEQUENCE ( pathEltOrInverse )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:401:54: ^( PATH_SEQUENCE ( pathEltOrInverse )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_SEQUENCE, "PATH_SEQUENCE"), root_1);

                if ( !(stream_pathEltOrInverse.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pathEltOrInverse.hasNext() ) {
                    adaptor.addChild(root_1, stream_pathEltOrInverse.nextTree());

                }
                stream_pathEltOrInverse.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathSequence"

    public static class pathEltOrInverse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathEltOrInverse"
    // com\\googlecode\\sparkleg\\Sparql.g:404:1: pathEltOrInverse : ( INVERSE )? pathElt ;
    public final SparqlParser.pathEltOrInverse_return pathEltOrInverse() throws RecognitionException {
        SparqlParser.pathEltOrInverse_return retval = new SparqlParser.pathEltOrInverse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INVERSE293=null;
        SparqlParser.pathElt_return pathElt294 = null;


        Object INVERSE293_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:405:5: ( ( INVERSE )? pathElt )
            // com\\googlecode\\sparkleg\\Sparql.g:405:7: ( INVERSE )? pathElt
            {
            root_0 = (Object)adaptor.nil();

            // com\\googlecode\\sparkleg\\Sparql.g:405:7: ( INVERSE )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==INVERSE) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:405:7: INVERSE
                    {
                    INVERSE293=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_pathEltOrInverse3311); 
                    INVERSE293_tree = (Object)adaptor.create(INVERSE293);
                    adaptor.addChild(root_0, INVERSE293_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_pathElt_in_pathEltOrInverse3314);
            pathElt294=pathElt();

            state._fsp--;

            adaptor.addChild(root_0, pathElt294.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathEltOrInverse"

    public static class pathElt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathElt"
    // com\\googlecode\\sparkleg\\Sparql.g:408:1: pathElt : pathPrimary ( pathMod )? ;
    public final SparqlParser.pathElt_return pathElt() throws RecognitionException {
        SparqlParser.pathElt_return retval = new SparqlParser.pathElt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.pathPrimary_return pathPrimary295 = null;

        SparqlParser.pathMod_return pathMod296 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:409:5: ( pathPrimary ( pathMod )? )
            // com\\googlecode\\sparkleg\\Sparql.g:409:7: pathPrimary ( pathMod )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_pathPrimary_in_pathElt3342);
            pathPrimary295=pathPrimary();

            state._fsp--;

            adaptor.addChild(root_0, pathPrimary295.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:409:19: ( pathMod )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ASTERISK||LA98_0==OPEN_CURLY_BRACE||(LA98_0>=QUESTION_MARK && LA98_0<=PLUS)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:409:19: pathMod
                    {
                    pushFollow(FOLLOW_pathMod_in_pathElt3344);
                    pathMod296=pathMod();

                    state._fsp--;

                    adaptor.addChild(root_0, pathMod296.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathElt"

    public static class pathMod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathMod"
    // com\\googlecode\\sparkleg\\Sparql.g:412:1: pathMod : ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) ;
    public final SparqlParser.pathMod_return pathMod() throws RecognitionException {
        SparqlParser.pathMod_return retval = new SparqlParser.pathMod_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK297=null;
        Token QUESTION_MARK298=null;
        Token PLUS299=null;
        Token OPEN_CURLY_BRACE300=null;
        Token INTEGER301=null;
        Token COMMA302=null;
        Token CLOSE_CURLY_BRACE303=null;
        Token INTEGER304=null;
        Token CLOSE_CURLY_BRACE305=null;
        Token CLOSE_CURLY_BRACE306=null;
        Token COMMA307=null;
        Token INTEGER308=null;
        Token CLOSE_CURLY_BRACE309=null;

        Object ASTERISK297_tree=null;
        Object QUESTION_MARK298_tree=null;
        Object PLUS299_tree=null;
        Object OPEN_CURLY_BRACE300_tree=null;
        Object INTEGER301_tree=null;
        Object COMMA302_tree=null;
        Object CLOSE_CURLY_BRACE303_tree=null;
        Object INTEGER304_tree=null;
        Object CLOSE_CURLY_BRACE305_tree=null;
        Object CLOSE_CURLY_BRACE306_tree=null;
        Object COMMA307_tree=null;
        Object INTEGER308_tree=null;
        Object CLOSE_CURLY_BRACE309_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:413:5: ( ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) ) )
            // com\\googlecode\\sparkleg\\Sparql.g:413:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            {
            root_0 = (Object)adaptor.nil();

            // com\\googlecode\\sparkleg\\Sparql.g:413:7: ( ASTERISK | QUESTION_MARK | PLUS | OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE ) )
            int alt102=4;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt102=1;
                }
                break;
            case QUESTION_MARK:
                {
                alt102=2;
                }
                break;
            case PLUS:
                {
                alt102=3;
                }
                break;
            case OPEN_CURLY_BRACE:
                {
                alt102=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:413:8: ASTERISK
                    {
                    ASTERISK297=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_pathMod3363); 
                    ASTERISK297_tree = (Object)adaptor.create(ASTERISK297);
                    adaptor.addChild(root_0, ASTERISK297_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:413:19: QUESTION_MARK
                    {
                    QUESTION_MARK298=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_pathMod3367); 
                    QUESTION_MARK298_tree = (Object)adaptor.create(QUESTION_MARK298);
                    adaptor.addChild(root_0, QUESTION_MARK298_tree);


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:413:35: PLUS
                    {
                    PLUS299=(Token)match(input,PLUS,FOLLOW_PLUS_in_pathMod3371); 
                    PLUS299_tree = (Object)adaptor.create(PLUS299);
                    adaptor.addChild(root_0, PLUS299_tree);


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:413:42: OPEN_CURLY_BRACE ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    {
                    OPEN_CURLY_BRACE300=(Token)match(input,OPEN_CURLY_BRACE,FOLLOW_OPEN_CURLY_BRACE_in_pathMod3375); 
                    OPEN_CURLY_BRACE300_tree = (Object)adaptor.create(OPEN_CURLY_BRACE300);
                    adaptor.addChild(root_0, OPEN_CURLY_BRACE300_tree);

                    // com\\googlecode\\sparkleg\\Sparql.g:413:59: ( INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE ) | COMMA INTEGER CLOSE_CURLY_BRACE )
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==INTEGER) ) {
                        alt101=1;
                    }
                    else if ( (LA101_0==COMMA) ) {
                        alt101=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 0, input);

                        throw nvae;
                    }
                    switch (alt101) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:413:60: INTEGER ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            {
                            INTEGER301=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod3378); 
                            INTEGER301_tree = (Object)adaptor.create(INTEGER301);
                            adaptor.addChild(root_0, INTEGER301_tree);

                            // com\\googlecode\\sparkleg\\Sparql.g:413:68: ( COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE ) | CLOSE_CURLY_BRACE )
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==COMMA) ) {
                                alt100=1;
                            }
                            else if ( (LA100_0==CLOSE_CURLY_BRACE) ) {
                                alt100=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 100, 0, input);

                                throw nvae;
                            }
                            switch (alt100) {
                                case 1 :
                                    // com\\googlecode\\sparkleg\\Sparql.g:413:69: COMMA ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    {
                                    COMMA302=(Token)match(input,COMMA,FOLLOW_COMMA_in_pathMod3381); 
                                    COMMA302_tree = (Object)adaptor.create(COMMA302);
                                    adaptor.addChild(root_0, COMMA302_tree);

                                    // com\\googlecode\\sparkleg\\Sparql.g:413:75: ( CLOSE_CURLY_BRACE | INTEGER CLOSE_CURLY_BRACE )
                                    int alt99=2;
                                    int LA99_0 = input.LA(1);

                                    if ( (LA99_0==CLOSE_CURLY_BRACE) ) {
                                        alt99=1;
                                    }
                                    else if ( (LA99_0==INTEGER) ) {
                                        alt99=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 99, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt99) {
                                        case 1 :
                                            // com\\googlecode\\sparkleg\\Sparql.g:413:76: CLOSE_CURLY_BRACE
                                            {
                                            CLOSE_CURLY_BRACE303=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3384); 
                                            CLOSE_CURLY_BRACE303_tree = (Object)adaptor.create(CLOSE_CURLY_BRACE303);
                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE303_tree);


                                            }
                                            break;
                                        case 2 :
                                            // com\\googlecode\\sparkleg\\Sparql.g:413:96: INTEGER CLOSE_CURLY_BRACE
                                            {
                                            INTEGER304=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod3388); 
                                            INTEGER304_tree = (Object)adaptor.create(INTEGER304);
                                            adaptor.addChild(root_0, INTEGER304_tree);

                                            CLOSE_CURLY_BRACE305=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3390); 
                                            CLOSE_CURLY_BRACE305_tree = (Object)adaptor.create(CLOSE_CURLY_BRACE305);
                                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE305_tree);


                                            }
                                            break;

                                    }


                                    }
                                    break;
                                case 2 :
                                    // com\\googlecode\\sparkleg\\Sparql.g:413:125: CLOSE_CURLY_BRACE
                                    {
                                    CLOSE_CURLY_BRACE306=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3395); 
                                    CLOSE_CURLY_BRACE306_tree = (Object)adaptor.create(CLOSE_CURLY_BRACE306);
                                    adaptor.addChild(root_0, CLOSE_CURLY_BRACE306_tree);


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:413:146: COMMA INTEGER CLOSE_CURLY_BRACE
                            {
                            COMMA307=(Token)match(input,COMMA,FOLLOW_COMMA_in_pathMod3400); 
                            COMMA307_tree = (Object)adaptor.create(COMMA307);
                            adaptor.addChild(root_0, COMMA307_tree);

                            INTEGER308=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_pathMod3402); 
                            INTEGER308_tree = (Object)adaptor.create(INTEGER308);
                            adaptor.addChild(root_0, INTEGER308_tree);

                            CLOSE_CURLY_BRACE309=(Token)match(input,CLOSE_CURLY_BRACE,FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3404); 
                            CLOSE_CURLY_BRACE309_tree = (Object)adaptor.create(CLOSE_CURLY_BRACE309);
                            adaptor.addChild(root_0, CLOSE_CURLY_BRACE309_tree);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathMod"

    public static class pathPrimary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathPrimary"
    // com\\googlecode\\sparkleg\\Sparql.g:416:1: pathPrimary : ( iriRef -> ^( PATH_PRIMARY iriRef ) | A -> ^( PATH_PRIMARY A ) | NEGATION pathNegatedPropertySet -> ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | OPEN_BRACE path CLOSE_BRACE -> ^( PATH_PRIMARY path ) );
    public final SparqlParser.pathPrimary_return pathPrimary() throws RecognitionException {
        SparqlParser.pathPrimary_return retval = new SparqlParser.pathPrimary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token A311=null;
        Token NEGATION312=null;
        Token OPEN_BRACE314=null;
        Token CLOSE_BRACE316=null;
        SparqlParser.iriRef_return iriRef310 = null;

        SparqlParser.pathNegatedPropertySet_return pathNegatedPropertySet313 = null;

        SparqlParser.path_return path315 = null;


        Object A311_tree=null;
        Object NEGATION312_tree=null;
        Object OPEN_BRACE314_tree=null;
        Object CLOSE_BRACE316_tree=null;
        RewriteRuleTokenStream stream_A=new RewriteRuleTokenStream(adaptor,"token A");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_NEGATION=new RewriteRuleTokenStream(adaptor,"token NEGATION");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        RewriteRuleSubtreeStream stream_pathNegatedPropertySet=new RewriteRuleSubtreeStream(adaptor,"rule pathNegatedPropertySet");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:417:5: ( iriRef -> ^( PATH_PRIMARY iriRef ) | A -> ^( PATH_PRIMARY A ) | NEGATION pathNegatedPropertySet -> ^( PATH_PRIMARY NEGATION pathNegatedPropertySet ) | OPEN_BRACE path CLOSE_BRACE -> ^( PATH_PRIMARY path ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt103=1;
                }
                break;
            case A:
                {
                alt103=2;
                }
                break;
            case NEGATION:
                {
                alt103=3;
                }
                break;
            case OPEN_BRACE:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:417:7: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_pathPrimary3423);
                    iriRef310=iriRef();

                    state._fsp--;

                    stream_iriRef.add(iriRef310.getTree());


                    // AST REWRITE
                    // elements: iriRef
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 417:14: -> ^( PATH_PRIMARY iriRef )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:417:17: ^( PATH_PRIMARY iriRef )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY"), root_1);

                        adaptor.addChild(root_1, stream_iriRef.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:418:7: A
                    {
                    A311=(Token)match(input,A,FOLLOW_A_in_pathPrimary3439);  
                    stream_A.add(A311);



                    // AST REWRITE
                    // elements: A
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 418:9: -> ^( PATH_PRIMARY A )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:418:12: ^( PATH_PRIMARY A )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY"), root_1);

                        adaptor.addChild(root_1, stream_A.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:419:7: NEGATION pathNegatedPropertySet
                    {
                    NEGATION312=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_pathPrimary3455);  
                    stream_NEGATION.add(NEGATION312);

                    pushFollow(FOLLOW_pathNegatedPropertySet_in_pathPrimary3457);
                    pathNegatedPropertySet313=pathNegatedPropertySet();

                    state._fsp--;

                    stream_pathNegatedPropertySet.add(pathNegatedPropertySet313.getTree());


                    // AST REWRITE
                    // elements: pathNegatedPropertySet, NEGATION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 419:39: -> ^( PATH_PRIMARY NEGATION pathNegatedPropertySet )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:419:42: ^( PATH_PRIMARY NEGATION pathNegatedPropertySet )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY"), root_1);

                        adaptor.addChild(root_1, stream_NEGATION.nextNode());
                        adaptor.addChild(root_1, stream_pathNegatedPropertySet.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:420:7: OPEN_BRACE path CLOSE_BRACE
                    {
                    OPEN_BRACE314=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathPrimary3475);  
                    stream_OPEN_BRACE.add(OPEN_BRACE314);

                    pushFollow(FOLLOW_path_in_pathPrimary3477);
                    path315=path();

                    state._fsp--;

                    stream_path.add(path315.getTree());
                    CLOSE_BRACE316=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathPrimary3479);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE316);



                    // AST REWRITE
                    // elements: path
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 420:35: -> ^( PATH_PRIMARY path )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:420:38: ^( PATH_PRIMARY path )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_PRIMARY, "PATH_PRIMARY"), root_1);

                        adaptor.addChild(root_1, stream_path.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathPrimary"

    public static class pathNegatedPropertySet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathNegatedPropertySet"
    // com\\googlecode\\sparkleg\\Sparql.g:423:1: pathNegatedPropertySet : ( pathOneInPropertySet | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE ) -> ^( PATH_NEGATED ( pathOneInPropertySet )+ ) ;
    public final SparqlParser.pathNegatedPropertySet_return pathNegatedPropertySet() throws RecognitionException {
        SparqlParser.pathNegatedPropertySet_return retval = new SparqlParser.pathNegatedPropertySet_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE318=null;
        Token PIPE320=null;
        Token CLOSE_BRACE322=null;
        SparqlParser.pathOneInPropertySet_return pathOneInPropertySet317 = null;

        SparqlParser.pathOneInPropertySet_return pathOneInPropertySet319 = null;

        SparqlParser.pathOneInPropertySet_return pathOneInPropertySet321 = null;


        Object OPEN_BRACE318_tree=null;
        Object PIPE320_tree=null;
        Object CLOSE_BRACE322_tree=null;
        RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_pathOneInPropertySet=new RewriteRuleSubtreeStream(adaptor,"rule pathOneInPropertySet");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:424:5: ( ( pathOneInPropertySet | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE ) -> ^( PATH_NEGATED ( pathOneInPropertySet )+ ) )
            // com\\googlecode\\sparkleg\\Sparql.g:424:7: ( pathOneInPropertySet | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE )
            {
            // com\\googlecode\\sparkleg\\Sparql.g:424:7: ( pathOneInPropertySet | OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==IRI_REF||LA106_0==PNAME_NS||LA106_0==A||LA106_0==INVERSE||LA106_0==PNAME_LN) ) {
                alt106=1;
            }
            else if ( (LA106_0==OPEN_BRACE) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:424:8: pathOneInPropertySet
                    {
                    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3505);
                    pathOneInPropertySet317=pathOneInPropertySet();

                    state._fsp--;

                    stream_pathOneInPropertySet.add(pathOneInPropertySet317.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:424:31: OPEN_BRACE ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )? CLOSE_BRACE
                    {
                    OPEN_BRACE318=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet3509);  
                    stream_OPEN_BRACE.add(OPEN_BRACE318);

                    // com\\googlecode\\sparkleg\\Sparql.g:424:42: ( pathOneInPropertySet ( PIPE pathOneInPropertySet )* )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==IRI_REF||LA105_0==PNAME_NS||LA105_0==A||LA105_0==INVERSE||LA105_0==PNAME_LN) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:424:43: pathOneInPropertySet ( PIPE pathOneInPropertySet )*
                            {
                            pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3512);
                            pathOneInPropertySet319=pathOneInPropertySet();

                            state._fsp--;

                            stream_pathOneInPropertySet.add(pathOneInPropertySet319.getTree());
                            // com\\googlecode\\sparkleg\\Sparql.g:424:64: ( PIPE pathOneInPropertySet )*
                            loop104:
                            do {
                                int alt104=2;
                                int LA104_0 = input.LA(1);

                                if ( (LA104_0==PIPE) ) {
                                    alt104=1;
                                }


                                switch (alt104) {
                            	case 1 :
                            	    // com\\googlecode\\sparkleg\\Sparql.g:424:65: PIPE pathOneInPropertySet
                            	    {
                            	    PIPE320=(Token)match(input,PIPE,FOLLOW_PIPE_in_pathNegatedPropertySet3515);  
                            	    stream_PIPE.add(PIPE320);

                            	    pushFollow(FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3517);
                            	    pathOneInPropertySet321=pathOneInPropertySet();

                            	    state._fsp--;

                            	    stream_pathOneInPropertySet.add(pathOneInPropertySet321.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop104;
                                }
                            } while (true);


                            }
                            break;

                    }

                    CLOSE_BRACE322=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet3523);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE322);


                    }
                    break;

            }



            // AST REWRITE
            // elements: pathOneInPropertySet
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 424:108: -> ^( PATH_NEGATED ( pathOneInPropertySet )+ )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:424:111: ^( PATH_NEGATED ( pathOneInPropertySet )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATH_NEGATED, "PATH_NEGATED"), root_1);

                if ( !(stream_pathOneInPropertySet.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_pathOneInPropertySet.hasNext() ) {
                    adaptor.addChild(root_1, stream_pathOneInPropertySet.nextTree());

                }
                stream_pathOneInPropertySet.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathNegatedPropertySet"

    public static class pathOneInPropertySet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pathOneInPropertySet"
    // com\\googlecode\\sparkleg\\Sparql.g:427:1: pathOneInPropertySet : ( INVERSE )? ( iriRef | A ) ;
    public final SparqlParser.pathOneInPropertySet_return pathOneInPropertySet() throws RecognitionException {
        SparqlParser.pathOneInPropertySet_return retval = new SparqlParser.pathOneInPropertySet_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INVERSE323=null;
        Token A325=null;
        SparqlParser.iriRef_return iriRef324 = null;


        Object INVERSE323_tree=null;
        Object A325_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:428:5: ( ( INVERSE )? ( iriRef | A ) )
            // com\\googlecode\\sparkleg\\Sparql.g:428:7: ( INVERSE )? ( iriRef | A )
            {
            root_0 = (Object)adaptor.nil();

            // com\\googlecode\\sparkleg\\Sparql.g:428:7: ( INVERSE )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==INVERSE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:428:7: INVERSE
                    {
                    INVERSE323=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_pathOneInPropertySet3553); 
                    INVERSE323_tree = (Object)adaptor.create(INVERSE323);
                    adaptor.addChild(root_0, INVERSE323_tree);


                    }
                    break;

            }

            // com\\googlecode\\sparkleg\\Sparql.g:428:16: ( iriRef | A )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==IRI_REF||LA108_0==PNAME_NS||LA108_0==PNAME_LN) ) {
                alt108=1;
            }
            else if ( (LA108_0==A) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:428:17: iriRef
                    {
                    pushFollow(FOLLOW_iriRef_in_pathOneInPropertySet3557);
                    iriRef324=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef324.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:428:26: A
                    {
                    A325=(Token)match(input,A,FOLLOW_A_in_pathOneInPropertySet3561); 
                    A325_tree = (Object)adaptor.create(A325);
                    adaptor.addChild(root_0, A325_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pathOneInPropertySet"

    public static class triplesNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triplesNode"
    // com\\googlecode\\sparkleg\\Sparql.g:431:1: triplesNode : ( OPEN_BRACE ( graphNode )+ CLOSE_BRACE -> ^( COLLECTION ( graphNode )+ ) | OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET -> ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty ) );
    public final SparqlParser.triplesNode_return triplesNode() throws RecognitionException {
        SparqlParser.triplesNode_return retval = new SparqlParser.triplesNode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE326=null;
        Token CLOSE_BRACE328=null;
        Token OPEN_SQUARE_BRACKET329=null;
        Token CLOSE_SQUARE_BRACKET331=null;
        SparqlParser.graphNode_return graphNode327 = null;

        SparqlParser.propertyListNotEmpty_return propertyListNotEmpty330 = null;


        Object OPEN_BRACE326_tree=null;
        Object CLOSE_BRACE328_tree=null;
        Object OPEN_SQUARE_BRACKET329_tree=null;
        Object CLOSE_SQUARE_BRACKET331_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_SQUARE_BRACKET=new RewriteRuleTokenStream(adaptor,"token OPEN_SQUARE_BRACKET");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_CLOSE_SQUARE_BRACKET=new RewriteRuleTokenStream(adaptor,"token CLOSE_SQUARE_BRACKET");
        RewriteRuleSubtreeStream stream_graphNode=new RewriteRuleSubtreeStream(adaptor,"rule graphNode");
        RewriteRuleSubtreeStream stream_propertyListNotEmpty=new RewriteRuleSubtreeStream(adaptor,"rule propertyListNotEmpty");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:432:5: ( OPEN_BRACE ( graphNode )+ CLOSE_BRACE -> ^( COLLECTION ( graphNode )+ ) | OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET -> ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==OPEN_BRACE) ) {
                alt110=1;
            }
            else if ( (LA110_0==OPEN_SQUARE_BRACKET) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:432:7: OPEN_BRACE ( graphNode )+ CLOSE_BRACE
                    {
                    OPEN_BRACE326=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_triplesNode3580);  
                    stream_OPEN_BRACE.add(OPEN_BRACE326);

                    // com\\googlecode\\sparkleg\\Sparql.g:432:18: ( graphNode )+
                    int cnt109=0;
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==IRI_REF||LA109_0==PNAME_NS||LA109_0==OPEN_BRACE||LA109_0==INTEGER||LA109_0==OPEN_SQUARE_BRACKET||(LA109_0>=VAR1 && LA109_0<=VAR2)||(LA109_0>=DECIMAL && LA109_0<=BLANK_NODE_LABEL)) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // com\\googlecode\\sparkleg\\Sparql.g:432:18: graphNode
                    	    {
                    	    pushFollow(FOLLOW_graphNode_in_triplesNode3582);
                    	    graphNode327=graphNode();

                    	    state._fsp--;

                    	    stream_graphNode.add(graphNode327.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt109 >= 1 ) break loop109;
                                EarlyExitException eee =
                                    new EarlyExitException(109, input);
                                throw eee;
                        }
                        cnt109++;
                    } while (true);

                    CLOSE_BRACE328=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_triplesNode3585);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE328);



                    // AST REWRITE
                    // elements: graphNode
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 432:41: -> ^( COLLECTION ( graphNode )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:432:44: ^( COLLECTION ( graphNode )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COLLECTION, "COLLECTION"), root_1);

                        if ( !(stream_graphNode.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_graphNode.hasNext() ) {
                            adaptor.addChild(root_1, stream_graphNode.nextTree());

                        }
                        stream_graphNode.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:433:7: OPEN_SQUARE_BRACKET propertyListNotEmpty CLOSE_SQUARE_BRACKET
                    {
                    OPEN_SQUARE_BRACKET329=(Token)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_triplesNode3602);  
                    stream_OPEN_SQUARE_BRACKET.add(OPEN_SQUARE_BRACKET329);

                    pushFollow(FOLLOW_propertyListNotEmpty_in_triplesNode3604);
                    propertyListNotEmpty330=propertyListNotEmpty();

                    state._fsp--;

                    stream_propertyListNotEmpty.add(propertyListNotEmpty330.getTree());
                    CLOSE_SQUARE_BRACKET331=(Token)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_triplesNode3606);  
                    stream_CLOSE_SQUARE_BRACKET.add(CLOSE_SQUARE_BRACKET331);



                    // AST REWRITE
                    // elements: propertyListNotEmpty
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 433:69: -> ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:433:72: ^( TRIPLES_NODE ^( SUBJECT BLANK_NODE ) propertyListNotEmpty )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLES_NODE, "TRIPLES_NODE"), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:433:87: ^( SUBJECT BLANK_NODE )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBJECT, "SUBJECT"), root_2);

                        adaptor.addChild(root_2, (Object)adaptor.create(BLANK_NODE, "BLANK_NODE"));

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_propertyListNotEmpty.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "triplesNode"

    public static class graphNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphNode"
    // com\\googlecode\\sparkleg\\Sparql.g:436:1: graphNode : ( varOrTerm | triplesNode );
    public final SparqlParser.graphNode_return graphNode() throws RecognitionException {
        SparqlParser.graphNode_return retval = new SparqlParser.graphNode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.varOrTerm_return varOrTerm332 = null;

        SparqlParser.triplesNode_return triplesNode333 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:437:5: ( varOrTerm | triplesNode )
            int alt111=2;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case INTEGER:
            case VAR1:
            case VAR2:
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
                alt111=1;
                }
                break;
            case OPEN_SQUARE_BRACKET:
                {
                int LA111_2 = input.LA(2);

                if ( (LA111_2==CLOSE_SQUARE_BRACKET) ) {
                    alt111=1;
                }
                else if ( (LA111_2==IRI_REF||LA111_2==PNAME_NS||LA111_2==A||(LA111_2>=VAR1 && LA111_2<=VAR2)||LA111_2==PNAME_LN) ) {
                    alt111=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 2, input);

                    throw nvae;
                }
                }
                break;
            case OPEN_BRACE:
                {
                int LA111_3 = input.LA(2);

                if ( (LA111_3==CLOSE_BRACE) ) {
                    alt111=1;
                }
                else if ( (LA111_3==IRI_REF||LA111_3==PNAME_NS||LA111_3==OPEN_BRACE||LA111_3==INTEGER||LA111_3==OPEN_SQUARE_BRACKET||(LA111_3>=VAR1 && LA111_3<=VAR2)||(LA111_3>=DECIMAL && LA111_3<=BLANK_NODE_LABEL)) ) {
                    alt111=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:437:7: varOrTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varOrTerm_in_graphNode3637);
                    varOrTerm332=varOrTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, varOrTerm332.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:437:19: triplesNode
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_triplesNode_in_graphNode3641);
                    triplesNode333=triplesNode();

                    state._fsp--;

                    adaptor.addChild(root_0, triplesNode333.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphNode"

    public static class varOrTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOrTerm"
    // com\\googlecode\\sparkleg\\Sparql.g:440:1: varOrTerm : ( var | graphTerm );
    public final SparqlParser.varOrTerm_return varOrTerm() throws RecognitionException {
        SparqlParser.varOrTerm_return retval = new SparqlParser.varOrTerm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.var_return var334 = null;

        SparqlParser.graphTerm_return graphTerm335 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:441:5: ( var | graphTerm )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=VAR1 && LA112_0<=VAR2)) ) {
                alt112=1;
            }
            else if ( (LA112_0==IRI_REF||LA112_0==PNAME_NS||LA112_0==OPEN_BRACE||LA112_0==INTEGER||LA112_0==OPEN_SQUARE_BRACKET||(LA112_0>=DECIMAL && LA112_0<=BLANK_NODE_LABEL)) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:441:7: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_varOrTerm3658);
                    var334=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var334.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:442:7: graphTerm
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_graphTerm_in_varOrTerm3666);
                    graphTerm335=graphTerm();

                    state._fsp--;

                    adaptor.addChild(root_0, graphTerm335.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varOrTerm"

    public static class varOrIRIref_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varOrIRIref"
    // com\\googlecode\\sparkleg\\Sparql.g:445:1: varOrIRIref : ( var | iriRef );
    public final SparqlParser.varOrIRIref_return varOrIRIref() throws RecognitionException {
        SparqlParser.varOrIRIref_return retval = new SparqlParser.varOrIRIref_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.var_return var336 = null;

        SparqlParser.iriRef_return iriRef337 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:446:5: ( var | iriRef )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=VAR1 && LA113_0<=VAR2)) ) {
                alt113=1;
            }
            else if ( (LA113_0==IRI_REF||LA113_0==PNAME_NS||LA113_0==PNAME_LN) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:446:7: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_varOrIRIref3683);
                    var336=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var336.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:446:13: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_varOrIRIref3687);
                    iriRef337=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef337.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varOrIRIref"

    public static class var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // com\\googlecode\\sparkleg\\Sparql.g:449:1: var : ( VAR1 | VAR2 );
    public final SparqlParser.var_return var() throws RecognitionException {
        SparqlParser.var_return retval = new SparqlParser.var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set338=null;

        Object set338_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:450:5: ( VAR1 | VAR2 )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set338=(Token)input.LT(1);
            if ( (input.LA(1)>=VAR1 && input.LA(1)<=VAR2) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set338));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class graphTerm_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "graphTerm"
    // com\\googlecode\\sparkleg\\Sparql.g:453:1: graphTerm : ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil );
    public final SparqlParser.graphTerm_return graphTerm() throws RecognitionException {
        SparqlParser.graphTerm_return retval = new SparqlParser.graphTerm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.iriRef_return iriRef339 = null;

        SparqlParser.rdfLiteral_return rdfLiteral340 = null;

        SparqlParser.numericLiteral_return numericLiteral341 = null;

        SparqlParser.booleanLiteral_return booleanLiteral342 = null;

        SparqlParser.blankNode_return blankNode343 = null;

        SparqlParser.nil_return nil344 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:454:5: ( iriRef | rdfLiteral | numericLiteral | booleanLiteral | blankNode | nil )
            int alt114=6;
            switch ( input.LA(1) ) {
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt114=1;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt114=2;
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
                alt114=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt114=4;
                }
                break;
            case OPEN_SQUARE_BRACKET:
            case BLANK_NODE_LABEL:
                {
                alt114=5;
                }
                break;
            case OPEN_BRACE:
                {
                alt114=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:454:7: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_graphTerm3725);
                    iriRef339=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef339.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:455:7: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rdfLiteral_in_graphTerm3733);
                    rdfLiteral340=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral340.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:456:7: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_graphTerm3741);
                    numericLiteral341=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral341.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:457:7: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_graphTerm3749);
                    booleanLiteral342=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral342.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:458:7: blankNode
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blankNode_in_graphTerm3757);
                    blankNode343=blankNode();

                    state._fsp--;

                    adaptor.addChild(root_0, blankNode343.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:459:7: nil
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_nil_in_graphTerm3765);
                    nil344=nil();

                    state._fsp--;

                    adaptor.addChild(root_0, nil344.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "graphTerm"

    public static class nil_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nil"
    // com\\googlecode\\sparkleg\\Sparql.g:462:1: nil : OPEN_BRACE CLOSE_BRACE ;
    public final SparqlParser.nil_return nil() throws RecognitionException {
        SparqlParser.nil_return retval = new SparqlParser.nil_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE345=null;
        Token CLOSE_BRACE346=null;

        Object OPEN_BRACE345_tree=null;
        Object CLOSE_BRACE346_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:463:5: ( OPEN_BRACE CLOSE_BRACE )
            // com\\googlecode\\sparkleg\\Sparql.g:463:7: OPEN_BRACE CLOSE_BRACE
            {
            root_0 = (Object)adaptor.nil();

            OPEN_BRACE345=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_nil3786); 
            OPEN_BRACE345_tree = (Object)adaptor.create(OPEN_BRACE345);
            adaptor.addChild(root_0, OPEN_BRACE345_tree);

            CLOSE_BRACE346=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_nil3788); 
            CLOSE_BRACE346_tree = (Object)adaptor.create(CLOSE_BRACE346);
            adaptor.addChild(root_0, CLOSE_BRACE346_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nil"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // com\\googlecode\\sparkleg\\Sparql.g:466:1: expression : conditionalOrExpression ;
    public final SparqlParser.expression_return expression() throws RecognitionException {
        SparqlParser.expression_return retval = new SparqlParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.conditionalOrExpression_return conditionalOrExpression347 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:467:5: ( conditionalOrExpression )
            // com\\googlecode\\sparkleg\\Sparql.g:467:7: conditionalOrExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_expression3805);
            conditionalOrExpression347=conditionalOrExpression();

            state._fsp--;

            adaptor.addChild(root_0, conditionalOrExpression347.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:470:1: conditionalOrExpression : (c1= conditionalAndExpression -> $c1) ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )* ;
    public final SparqlParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        SparqlParser.conditionalOrExpression_return retval = new SparqlParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR348=null;
        SparqlParser.conditionalAndExpression_return c1 = null;

        SparqlParser.conditionalAndExpression_return c2 = null;


        Object OR348_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_conditionalAndExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalAndExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:471:5: ( (c1= conditionalAndExpression -> $c1) ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:471:7: (c1= conditionalAndExpression -> $c1) ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:471:7: (c1= conditionalAndExpression -> $c1)
            // com\\googlecode\\sparkleg\\Sparql.g:471:8: c1= conditionalAndExpression
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3825);
            c1=conditionalAndExpression();

            state._fsp--;

            stream_conditionalAndExpression.add(c1.getTree());


            // AST REWRITE
            // elements: c1
            // token labels: 
            // rule labels: retval, c1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 471:36: -> $c1
            {
                adaptor.addChild(root_0, stream_c1.nextTree());

            }

            retval.tree = root_0;
            }

            // com\\googlecode\\sparkleg\\Sparql.g:471:44: ( OR c2= conditionalAndExpression -> ^( OR $conditionalOrExpression $c2) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==OR) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:471:45: OR c2= conditionalAndExpression
            	    {
            	    OR348=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression3834);  
            	    stream_OR.add(OR348);

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression3838);
            	    c2=conditionalAndExpression();

            	    state._fsp--;

            	    stream_conditionalAndExpression.add(c2.getTree());


            	    // AST REWRITE
            	    // elements: conditionalOrExpression, c2, OR
            	    // token labels: 
            	    // rule labels: retval, c2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 471:76: -> ^( OR $conditionalOrExpression $c2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:471:79: ^( OR $conditionalOrExpression $c2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_OR.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_c2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:474:1: conditionalAndExpression : (v1= valueLogical -> $v1) ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )* ;
    public final SparqlParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        SparqlParser.conditionalAndExpression_return retval = new SparqlParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND349=null;
        SparqlParser.valueLogical_return v1 = null;

        SparqlParser.valueLogical_return v2 = null;


        Object AND349_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_valueLogical=new RewriteRuleSubtreeStream(adaptor,"rule valueLogical");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:475:5: ( (v1= valueLogical -> $v1) ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:475:7: (v1= valueLogical -> $v1) ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:475:7: (v1= valueLogical -> $v1)
            // com\\googlecode\\sparkleg\\Sparql.g:475:8: v1= valueLogical
            {
            pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression3872);
            v1=valueLogical();

            state._fsp--;

            stream_valueLogical.add(v1.getTree());


            // AST REWRITE
            // elements: v1
            // token labels: 
            // rule labels: v1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 475:24: -> $v1
            {
                adaptor.addChild(root_0, stream_v1.nextTree());

            }

            retval.tree = root_0;
            }

            // com\\googlecode\\sparkleg\\Sparql.g:475:32: ( AND v2= valueLogical -> ^( AND $conditionalAndExpression $v2) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==AND) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:475:33: AND v2= valueLogical
            	    {
            	    AND349=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression3881);  
            	    stream_AND.add(AND349);

            	    pushFollow(FOLLOW_valueLogical_in_conditionalAndExpression3885);
            	    v2=valueLogical();

            	    state._fsp--;

            	    stream_valueLogical.add(v2.getTree());


            	    // AST REWRITE
            	    // elements: v2, AND, conditionalAndExpression
            	    // token labels: 
            	    // rule labels: retval, v2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 475:53: -> ^( AND $conditionalAndExpression $v2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:475:56: ^( AND $conditionalAndExpression $v2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_AND.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_v2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class valueLogical_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valueLogical"
    // com\\googlecode\\sparkleg\\Sparql.g:478:1: valueLogical : relationalExpression ;
    public final SparqlParser.valueLogical_return valueLogical() throws RecognitionException {
        SparqlParser.valueLogical_return retval = new SparqlParser.valueLogical_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.relationalExpression_return relationalExpression350 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:479:5: ( relationalExpression )
            // com\\googlecode\\sparkleg\\Sparql.g:479:7: relationalExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_valueLogical3916);
            relationalExpression350=relationalExpression();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpression350.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valueLogical"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:482:1: relationalExpression : (n1= numericExpression -> $n1) ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )? ;
    public final SparqlParser.relationalExpression_return relationalExpression() throws RecognitionException {
        SparqlParser.relationalExpression_return retval = new SparqlParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL351=null;
        Token NOT_EQUAL352=null;
        Token LESS353=null;
        Token GREATER354=null;
        Token LESS_EQUAL355=null;
        Token GREATER_EQUAL356=null;
        Token IN357=null;
        Token NOT358=null;
        Token IN359=null;
        SparqlParser.numericExpression_return n1 = null;

        SparqlParser.numericExpression_return n2 = null;

        SparqlParser.numericExpression_return n3 = null;

        SparqlParser.numericExpression_return n4 = null;

        SparqlParser.numericExpression_return n5 = null;

        SparqlParser.numericExpression_return n6 = null;

        SparqlParser.numericExpression_return n7 = null;

        SparqlParser.expressionList_return l2 = null;

        SparqlParser.expressionList_return l3 = null;


        Object EQUAL351_tree=null;
        Object NOT_EQUAL352_tree=null;
        Object LESS353_tree=null;
        Object GREATER354_tree=null;
        Object LESS_EQUAL355_tree=null;
        Object GREATER_EQUAL356_tree=null;
        Object IN357_tree=null;
        Object NOT358_tree=null;
        Object IN359_tree=null;
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_LESS_EQUAL=new RewriteRuleTokenStream(adaptor,"token LESS_EQUAL");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_NOT_EQUAL=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL");
        RewriteRuleTokenStream stream_GREATER_EQUAL=new RewriteRuleTokenStream(adaptor,"token GREATER_EQUAL");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_numericExpression=new RewriteRuleSubtreeStream(adaptor,"rule numericExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:483:5: ( (n1= numericExpression -> $n1) ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )? )
            // com\\googlecode\\sparkleg\\Sparql.g:483:7: (n1= numericExpression -> $n1) ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )?
            {
            // com\\googlecode\\sparkleg\\Sparql.g:483:7: (n1= numericExpression -> $n1)
            // com\\googlecode\\sparkleg\\Sparql.g:483:8: n1= numericExpression
            {
            pushFollow(FOLLOW_numericExpression_in_relationalExpression3936);
            n1=numericExpression();

            state._fsp--;

            stream_numericExpression.add(n1.getTree());


            // AST REWRITE
            // elements: n1
            // token labels: 
            // rule labels: n1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 483:29: -> $n1
            {
                adaptor.addChild(root_0, stream_n1.nextTree());

            }

            retval.tree = root_0;
            }

            // com\\googlecode\\sparkleg\\Sparql.g:483:37: ( ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) ) | ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) ) | ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) ) | ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) ) | ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) ) | ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) ) | ( IN l2= expressionList -> ^( IN $relationalExpression $l2) ) | ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) ) )?
            int alt117=9;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt117=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt117=2;
                    }
                    break;
                case LESS:
                    {
                    alt117=3;
                    }
                    break;
                case GREATER:
                    {
                    alt117=4;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt117=5;
                    }
                    break;
                case GREATER_EQUAL:
                    {
                    alt117=6;
                    }
                    break;
                case IN:
                    {
                    alt117=7;
                    }
                    break;
                case NOT:
                    {
                    alt117=8;
                    }
                    break;
            }

            switch (alt117) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:483:38: ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:483:38: ( EQUAL n2= numericExpression -> ^( EQUAL $relationalExpression $n2) )
                    // com\\googlecode\\sparkleg\\Sparql.g:483:39: EQUAL n2= numericExpression
                    {
                    EQUAL351=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relationalExpression3946);  
                    stream_EQUAL.add(EQUAL351);

                    pushFollow(FOLLOW_numericExpression_in_relationalExpression3950);
                    n2=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n2.getTree());


                    // AST REWRITE
                    // elements: relationalExpression, EQUAL, n2
                    // token labels: 
                    // rule labels: retval, n2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 483:66: -> ^( EQUAL $relationalExpression $n2)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:483:69: ^( EQUAL $relationalExpression $n2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_n2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:484:39: ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:484:39: ( NOT_EQUAL n3= numericExpression -> ^( NOT_EQUAL $relationalExpression $n3) )
                    // com\\googlecode\\sparkleg\\Sparql.g:484:40: NOT_EQUAL n3= numericExpression
                    {
                    NOT_EQUAL352=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_relationalExpression4007);  
                    stream_NOT_EQUAL.add(NOT_EQUAL352);

                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4011);
                    n3=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n3.getTree());


                    // AST REWRITE
                    // elements: relationalExpression, n3, NOT_EQUAL
                    // token labels: 
                    // rule labels: retval, n3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n3=new RewriteRuleSubtreeStream(adaptor,"rule n3",n3!=null?n3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 484:71: -> ^( NOT_EQUAL $relationalExpression $n3)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:484:74: ^( NOT_EQUAL $relationalExpression $n3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NOT_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_n3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:485:39: ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:485:39: ( LESS n4= numericExpression -> ^( LESS $relationalExpression $n4) )
                    // com\\googlecode\\sparkleg\\Sparql.g:485:40: LESS n4= numericExpression
                    {
                    LESS353=(Token)match(input,LESS,FOLLOW_LESS_in_relationalExpression4066);  
                    stream_LESS.add(LESS353);

                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4070);
                    n4=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n4.getTree());


                    // AST REWRITE
                    // elements: LESS, n4, relationalExpression
                    // token labels: 
                    // rule labels: retval, n4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n4=new RewriteRuleSubtreeStream(adaptor,"rule n4",n4!=null?n4.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 485:66: -> ^( LESS $relationalExpression $n4)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:485:69: ^( LESS $relationalExpression $n4)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LESS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_n4.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:486:39: ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:486:39: ( GREATER n5= numericExpression -> ^( GREATER $relationalExpression $n5) )
                    // com\\googlecode\\sparkleg\\Sparql.g:486:40: GREATER n5= numericExpression
                    {
                    GREATER354=(Token)match(input,GREATER,FOLLOW_GREATER_in_relationalExpression4125);  
                    stream_GREATER.add(GREATER354);

                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4129);
                    n5=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n5.getTree());


                    // AST REWRITE
                    // elements: relationalExpression, n5, GREATER
                    // token labels: 
                    // rule labels: retval, n5
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n5=new RewriteRuleSubtreeStream(adaptor,"rule n5",n5!=null?n5.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 486:69: -> ^( GREATER $relationalExpression $n5)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:486:72: ^( GREATER $relationalExpression $n5)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_GREATER.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_n5.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:487:39: ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:487:39: ( LESS_EQUAL n6= numericExpression -> ^( LESS_EQUAL $relationalExpression $n6) )
                    // com\\googlecode\\sparkleg\\Sparql.g:487:40: LESS_EQUAL n6= numericExpression
                    {
                    LESS_EQUAL355=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_relationalExpression4183);  
                    stream_LESS_EQUAL.add(LESS_EQUAL355);

                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4187);
                    n6=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n6.getTree());


                    // AST REWRITE
                    // elements: relationalExpression, LESS_EQUAL, n6
                    // token labels: 
                    // rule labels: retval, n6
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n6=new RewriteRuleSubtreeStream(adaptor,"rule n6",n6!=null?n6.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 487:72: -> ^( LESS_EQUAL $relationalExpression $n6)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:487:75: ^( LESS_EQUAL $relationalExpression $n6)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LESS_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_n6.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:488:39: ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:488:39: ( GREATER_EQUAL n7= numericExpression -> ^( GREATER_EQUAL $relationalExpression $n7) )
                    // com\\googlecode\\sparkleg\\Sparql.g:488:40: GREATER_EQUAL n7= numericExpression
                    {
                    GREATER_EQUAL356=(Token)match(input,GREATER_EQUAL,FOLLOW_GREATER_EQUAL_in_relationalExpression4241);  
                    stream_GREATER_EQUAL.add(GREATER_EQUAL356);

                    pushFollow(FOLLOW_numericExpression_in_relationalExpression4245);
                    n7=numericExpression();

                    state._fsp--;

                    stream_numericExpression.add(n7.getTree());


                    // AST REWRITE
                    // elements: n7, relationalExpression, GREATER_EQUAL
                    // token labels: 
                    // rule labels: retval, n7
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_n7=new RewriteRuleSubtreeStream(adaptor,"rule n7",n7!=null?n7.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 488:75: -> ^( GREATER_EQUAL $relationalExpression $n7)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:488:78: ^( GREATER_EQUAL $relationalExpression $n7)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_GREATER_EQUAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_n7.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:489:39: ( IN l2= expressionList -> ^( IN $relationalExpression $l2) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:489:39: ( IN l2= expressionList -> ^( IN $relationalExpression $l2) )
                    // com\\googlecode\\sparkleg\\Sparql.g:489:40: IN l2= expressionList
                    {
                    IN357=(Token)match(input,IN,FOLLOW_IN_in_relationalExpression4301);  
                    stream_IN.add(IN357);

                    pushFollow(FOLLOW_expressionList_in_relationalExpression4305);
                    l2=expressionList();

                    state._fsp--;

                    stream_expressionList.add(l2.getTree());


                    // AST REWRITE
                    // elements: relationalExpression, IN, l2
                    // token labels: 
                    // rule labels: retval, l2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l2=new RewriteRuleSubtreeStream(adaptor,"rule l2",l2!=null?l2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 489:61: -> ^( IN $relationalExpression $l2)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:489:64: ^( IN $relationalExpression $l2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_l2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:490:39: ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:490:39: ( NOT IN l3= expressionList -> ^( NOT IN $relationalExpression $l3) )
                    // com\\googlecode\\sparkleg\\Sparql.g:490:40: NOT IN l3= expressionList
                    {
                    NOT358=(Token)match(input,NOT,FOLLOW_NOT_in_relationalExpression4359);  
                    stream_NOT.add(NOT358);

                    IN359=(Token)match(input,IN,FOLLOW_IN_in_relationalExpression4361);  
                    stream_IN.add(IN359);

                    pushFollow(FOLLOW_expressionList_in_relationalExpression4365);
                    l3=expressionList();

                    state._fsp--;

                    stream_expressionList.add(l3.getTree());


                    // AST REWRITE
                    // elements: relationalExpression, l3, IN, NOT
                    // token labels: 
                    // rule labels: retval, l3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_l3=new RewriteRuleSubtreeStream(adaptor,"rule l3",l3!=null?l3.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 490:65: -> ^( NOT IN $relationalExpression $l3)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:490:68: ^( NOT IN $relationalExpression $l3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IN.nextNode());
                        adaptor.addChild(root_1, stream_retval.nextTree());
                        adaptor.addChild(root_1, stream_l3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class numericExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:493:1: numericExpression : additiveExpression ;
    public final SparqlParser.numericExpression_return numericExpression() throws RecognitionException {
        SparqlParser.numericExpression_return retval = new SparqlParser.numericExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.additiveExpression_return additiveExpression360 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:494:5: ( additiveExpression )
            // com\\googlecode\\sparkleg\\Sparql.g:494:7: additiveExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_numericExpression4399);
            additiveExpression360=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, additiveExpression360.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:497:1: additiveExpression : (m1= multiplicativeExpression -> $m1) ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) | n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )* ;
    public final SparqlParser.additiveExpression_return additiveExpression() throws RecognitionException {
        SparqlParser.additiveExpression_return retval = new SparqlParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASTERISK362=null;
        Token DIVIDE363=null;
        SparqlParser.multiplicativeExpression_return m1 = null;

        SparqlParser.multiplicativeExpression_return m2 = null;

        SparqlParser.numericLiteralPositive_return n1 = null;

        SparqlParser.numericLiteralNegative_return n2 = null;

        SparqlParser.unaryExpression_return u2 = null;

        SparqlParser.additiveOperator_return additiveOperator361 = null;


        Object ASTERISK362_tree=null;
        Object DIVIDE363_tree=null;
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_numericLiteralNegative=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteralNegative");
        RewriteRuleSubtreeStream stream_numericLiteralPositive=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteralPositive");
        RewriteRuleSubtreeStream stream_additiveOperator=new RewriteRuleSubtreeStream(adaptor,"rule additiveOperator");
        RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:498:5: ( (m1= multiplicativeExpression -> $m1) ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) | n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )* )
            // com\\googlecode\\sparkleg\\Sparql.g:498:7: (m1= multiplicativeExpression -> $m1) ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) | n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:498:7: (m1= multiplicativeExpression -> $m1)
            // com\\googlecode\\sparkleg\\Sparql.g:498:8: m1= multiplicativeExpression
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4419);
            m1=multiplicativeExpression();

            state._fsp--;

            stream_multiplicativeExpression.add(m1.getTree());


            // AST REWRITE
            // elements: m1
            // token labels: 
            // rule labels: retval, m1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 498:36: -> $m1
            {
                adaptor.addChild(root_0, stream_m1.nextTree());

            }

            retval.tree = root_0;
            }

            // com\\googlecode\\sparkleg\\Sparql.g:498:44: ( ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) ) | (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) | n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )? )*
            loop120:
            do {
                int alt120=3;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==PLUS||LA120_0==MINUS) ) {
                    alt120=1;
                }
                else if ( ((LA120_0>=INTEGER_POSITIVE && LA120_0<=DOUBLE_NEGATIVE)) ) {
                    alt120=2;
                }


                switch (alt120) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:498:45: ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) )
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:498:45: ( additiveOperator m2= multiplicativeExpression -> ^( additiveOperator $additiveExpression $m2) )
            	    // com\\googlecode\\sparkleg\\Sparql.g:498:46: additiveOperator m2= multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_additiveOperator_in_additiveExpression4429);
            	    additiveOperator361=additiveOperator();

            	    state._fsp--;

            	    stream_additiveOperator.add(additiveOperator361.getTree());
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4433);
            	    m2=multiplicativeExpression();

            	    state._fsp--;

            	    stream_multiplicativeExpression.add(m2.getTree());


            	    // AST REWRITE
            	    // elements: additiveExpression, additiveOperator, m2
            	    // token labels: 
            	    // rule labels: retval, m2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_m2=new RewriteRuleSubtreeStream(adaptor,"rule m2",m2!=null?m2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 498:91: -> ^( additiveOperator $additiveExpression $m2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:498:94: ^( additiveOperator $additiveExpression $m2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_additiveOperator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_m2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:499:48: (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) | n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) ) ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )?
            	    {
            	    // com\\googlecode\\sparkleg\\Sparql.g:499:48: (n1= numericLiteralPositive -> ^( PLUS $additiveExpression $n1) | n2= numericLiteralNegative -> ^( PLUS $additiveExpression $n2) )
            	    int alt118=2;
            	    int LA118_0 = input.LA(1);

            	    if ( ((LA118_0>=INTEGER_POSITIVE && LA118_0<=DOUBLE_POSITIVE)) ) {
            	        alt118=1;
            	    }
            	    else if ( ((LA118_0>=INTEGER_NEGATIVE && LA118_0<=DOUBLE_NEGATIVE)) ) {
            	        alt118=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 118, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt118) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:499:49: n1= numericLiteralPositive
            	            {
            	            pushFollow(FOLLOW_numericLiteralPositive_in_additiveExpression4500);
            	            n1=numericLiteralPositive();

            	            state._fsp--;

            	            stream_numericLiteralPositive.add(n1.getTree());


            	            // AST REWRITE
            	            // elements: additiveExpression, n1
            	            // token labels: 
            	            // rule labels: n1, retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_n1=new RewriteRuleSubtreeStream(adaptor,"rule n1",n1!=null?n1.tree:null);
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 499:75: -> ^( PLUS $additiveExpression $n1)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:499:78: ^( PLUS $additiveExpression $n1)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_n1.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:499:112: n2= numericLiteralNegative
            	            {
            	            pushFollow(FOLLOW_numericLiteralNegative_in_additiveExpression4518);
            	            n2=numericLiteralNegative();

            	            state._fsp--;

            	            stream_numericLiteralNegative.add(n2.getTree());


            	            // AST REWRITE
            	            // elements: additiveExpression, n2
            	            // token labels: 
            	            // rule labels: retval, n2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_n2=new RewriteRuleSubtreeStream(adaptor,"rule n2",n2!=null?n2.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 499:138: -> ^( PLUS $additiveExpression $n2)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:499:141: ^( PLUS $additiveExpression $n2)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLUS, "PLUS"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_n2.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }

            	    // com\\googlecode\\sparkleg\\Sparql.g:500:46: ( ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) ) | ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) ) )?
            	    int alt119=3;
            	    int LA119_0 = input.LA(1);

            	    if ( (LA119_0==ASTERISK) ) {
            	        alt119=1;
            	    }
            	    else if ( (LA119_0==DIVIDE) ) {
            	        alt119=2;
            	    }
            	    switch (alt119) {
            	        case 1 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:500:47: ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:500:47: ( ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) ) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:500:48: ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:500:48: ( ASTERISK u2= unaryExpression -> ^( ASTERISK $additiveExpression $u2) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:500:49: ASTERISK u2= unaryExpression
            	            {
            	            ASTERISK362=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_additiveExpression4582);  
            	            stream_ASTERISK.add(ASTERISK362);

            	            pushFollow(FOLLOW_unaryExpression_in_additiveExpression4586);
            	            u2=unaryExpression();

            	            state._fsp--;

            	            stream_unaryExpression.add(u2.getTree());


            	            // AST REWRITE
            	            // elements: ASTERISK, u2, additiveExpression
            	            // token labels: 
            	            // rule labels: retval, u2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_u2=new RewriteRuleSubtreeStream(adaptor,"rule u2",u2!=null?u2.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 500:77: -> ^( ASTERISK $additiveExpression $u2)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:500:80: ^( ASTERISK $additiveExpression $u2)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_ASTERISK.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_u2.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // com\\googlecode\\sparkleg\\Sparql.g:501:48: ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:501:48: ( ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) ) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:501:49: ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) )
            	            {
            	            // com\\googlecode\\sparkleg\\Sparql.g:501:49: ( DIVIDE u2= unaryExpression -> ^( DIVIDE $additiveExpression $u2) )
            	            // com\\googlecode\\sparkleg\\Sparql.g:501:50: DIVIDE u2= unaryExpression
            	            {
            	            DIVIDE363=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_additiveExpression4652);  
            	            stream_DIVIDE.add(DIVIDE363);

            	            pushFollow(FOLLOW_unaryExpression_in_additiveExpression4656);
            	            u2=unaryExpression();

            	            state._fsp--;

            	            stream_unaryExpression.add(u2.getTree());


            	            // AST REWRITE
            	            // elements: additiveExpression, u2, DIVIDE
            	            // token labels: 
            	            // rule labels: retval, u2
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_u2=new RewriteRuleSubtreeStream(adaptor,"rule u2",u2!=null?u2.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 501:76: -> ^( DIVIDE $additiveExpression $u2)
            	            {
            	                // com\\googlecode\\sparkleg\\Sparql.g:501:79: ^( DIVIDE $additiveExpression $u2)
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_DIVIDE.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_u2.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class additiveOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveOperator"
    // com\\googlecode\\sparkleg\\Sparql.g:504:1: additiveOperator : ( PLUS | MINUS );
    public final SparqlParser.additiveOperator_return additiveOperator() throws RecognitionException {
        SparqlParser.additiveOperator_return retval = new SparqlParser.additiveOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set364=null;

        Object set364_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:505:5: ( PLUS | MINUS )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set364=(Token)input.LT(1);
            if ( input.LA(1)==PLUS||input.LA(1)==MINUS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set364));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveOperator"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:508:1: multiplicativeExpression : (u1= unaryExpression -> $u1) ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )* ;
    public final SparqlParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        SparqlParser.multiplicativeExpression_return retval = new SparqlParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.unaryExpression_return u1 = null;

        SparqlParser.unaryExpression_return u2 = null;

        SparqlParser.multiplicativeOperator_return multiplicativeOperator365 = null;


        RewriteRuleSubtreeStream stream_multiplicativeOperator=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeOperator");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:509:5: ( (u1= unaryExpression -> $u1) ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )* )
            // com\\googlecode\\sparkleg\\Sparql.g:509:7: (u1= unaryExpression -> $u1) ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )*
            {
            // com\\googlecode\\sparkleg\\Sparql.g:509:7: (u1= unaryExpression -> $u1)
            // com\\googlecode\\sparkleg\\Sparql.g:509:8: u1= unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4722);
            u1=unaryExpression();

            state._fsp--;

            stream_unaryExpression.add(u1.getTree());


            // AST REWRITE
            // elements: u1
            // token labels: 
            // rule labels: retval, u1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_u1=new RewriteRuleSubtreeStream(adaptor,"rule u1",u1!=null?u1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 509:27: -> $u1
            {
                adaptor.addChild(root_0, stream_u1.nextTree());

            }

            retval.tree = root_0;
            }

            // com\\googlecode\\sparkleg\\Sparql.g:509:35: ( multiplicativeOperator u2= unaryExpression -> ^( multiplicativeOperator $multiplicativeExpression $u2) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==ASTERISK||LA121_0==DIVIDE) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // com\\googlecode\\sparkleg\\Sparql.g:509:36: multiplicativeOperator u2= unaryExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression4731);
            	    multiplicativeOperator365=multiplicativeOperator();

            	    state._fsp--;

            	    stream_multiplicativeOperator.add(multiplicativeOperator365.getTree());
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4735);
            	    u2=unaryExpression();

            	    state._fsp--;

            	    stream_unaryExpression.add(u2.getTree());


            	    // AST REWRITE
            	    // elements: multiplicativeExpression, multiplicativeOperator, u2
            	    // token labels: 
            	    // rule labels: retval, u2
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_u2=new RewriteRuleSubtreeStream(adaptor,"rule u2",u2!=null?u2.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 509:78: -> ^( multiplicativeOperator $multiplicativeExpression $u2)
            	    {
            	        // com\\googlecode\\sparkleg\\Sparql.g:509:81: ^( multiplicativeOperator $multiplicativeExpression $u2)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_multiplicativeOperator.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_u2.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class multiplicativeOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeOperator"
    // com\\googlecode\\sparkleg\\Sparql.g:512:1: multiplicativeOperator : ( ASTERISK | DIVIDE );
    public final SparqlParser.multiplicativeOperator_return multiplicativeOperator() throws RecognitionException {
        SparqlParser.multiplicativeOperator_return retval = new SparqlParser.multiplicativeOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set366=null;

        Object set366_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:513:5: ( ASTERISK | DIVIDE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set366=(Token)input.LT(1);
            if ( input.LA(1)==ASTERISK||input.LA(1)==DIVIDE ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set366));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeOperator"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:516:1: unaryExpression : (op= NEGATION primaryExpression -> ^( UNARY_NOT[$op] primaryExpression ) | op= PLUS primaryExpression -> ^( UNARY_PLUS[$op] primaryExpression ) | op= MINUS primaryExpression -> ^( UNARY_MINUS[$op] primaryExpression ) | primaryExpression -> ^( UNARY primaryExpression ) );
    public final SparqlParser.unaryExpression_return unaryExpression() throws RecognitionException {
        SparqlParser.unaryExpression_return retval = new SparqlParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        SparqlParser.primaryExpression_return primaryExpression367 = null;

        SparqlParser.primaryExpression_return primaryExpression368 = null;

        SparqlParser.primaryExpression_return primaryExpression369 = null;

        SparqlParser.primaryExpression_return primaryExpression370 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NEGATION=new RewriteRuleTokenStream(adaptor,"token NEGATION");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:517:5: (op= NEGATION primaryExpression -> ^( UNARY_NOT[$op] primaryExpression ) | op= PLUS primaryExpression -> ^( UNARY_PLUS[$op] primaryExpression ) | op= MINUS primaryExpression -> ^( UNARY_MINUS[$op] primaryExpression ) | primaryExpression -> ^( UNARY primaryExpression ) )
            int alt122=4;
            switch ( input.LA(1) ) {
            case NEGATION:
                {
                alt122=1;
                }
                break;
            case PLUS:
                {
                alt122=2;
                }
                break;
            case MINUS:
                {
                alt122=3;
                }
                break;
            case IRI_REF:
            case PNAME_NS:
            case OPEN_BRACE:
            case INTEGER:
            case VAR1:
            case VAR2:
            case NOT:
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
            case COUNT:
            case SUM:
            case MIN:
            case MAX:
            case AVG:
            case SAMPLE:
            case GROUP_CONCAT:
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
                {
                alt122=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:517:7: op= NEGATION primaryExpression
                    {
                    op=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_unaryExpression4793);  
                    stream_NEGATION.add(op);

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4795);
                    primaryExpression367=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression367.getTree());


                    // AST REWRITE
                    // elements: primaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 517:37: -> ^( UNARY_NOT[$op] primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:517:40: ^( UNARY_NOT[$op] primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_NOT, op), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:518:7: op= PLUS primaryExpression
                    {
                    op=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryExpression4814);  
                    stream_PLUS.add(op);

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4816);
                    primaryExpression368=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression368.getTree());


                    // AST REWRITE
                    // elements: primaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 518:33: -> ^( UNARY_PLUS[$op] primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:518:36: ^( UNARY_PLUS[$op] primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, op), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:519:7: op= MINUS primaryExpression
                    {
                    op=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryExpression4835);  
                    stream_MINUS.add(op);

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4837);
                    primaryExpression369=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression369.getTree());


                    // AST REWRITE
                    // elements: primaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 519:34: -> ^( UNARY_MINUS[$op] primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:519:37: ^( UNARY_MINUS[$op] primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, op), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:520:7: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression4854);
                    primaryExpression370=primaryExpression();

                    state._fsp--;

                    stream_primaryExpression.add(primaryExpression370.getTree());


                    // AST REWRITE
                    // elements: primaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 520:25: -> ^( UNARY primaryExpression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:520:28: ^( UNARY primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY, "UNARY"), root_1);

                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:523:1: primaryExpression : ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate );
    public final SparqlParser.primaryExpression_return primaryExpression() throws RecognitionException {
        SparqlParser.primaryExpression_return retval = new SparqlParser.primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.brackettedExpression_return brackettedExpression371 = null;

        SparqlParser.builtInCall_return builtInCall372 = null;

        SparqlParser.iriRefOrFunction_return iriRefOrFunction373 = null;

        SparqlParser.rdfLiteral_return rdfLiteral374 = null;

        SparqlParser.numericLiteral_return numericLiteral375 = null;

        SparqlParser.booleanLiteral_return booleanLiteral376 = null;

        SparqlParser.var_return var377 = null;

        SparqlParser.aggregate_return aggregate378 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:524:5: ( brackettedExpression | builtInCall | iriRefOrFunction | rdfLiteral | numericLiteral | booleanLiteral | var | aggregate )
            int alt123=8;
            switch ( input.LA(1) ) {
            case OPEN_BRACE:
                {
                alt123=1;
                }
                break;
            case NOT:
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
                alt123=2;
                }
                break;
            case IRI_REF:
            case PNAME_NS:
            case PNAME_LN:
                {
                alt123=3;
                }
                break;
            case STRING_LITERAL1:
            case STRING_LITERAL2:
            case STRING_LITERAL_LONG1:
            case STRING_LITERAL_LONG2:
                {
                alt123=4;
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
                alt123=5;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt123=6;
                }
                break;
            case VAR1:
            case VAR2:
                {
                alt123=7;
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
                alt123=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:7: brackettedExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_brackettedExpression_in_primaryExpression4879);
                    brackettedExpression371=brackettedExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, brackettedExpression371.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:30: builtInCall
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_builtInCall_in_primaryExpression4883);
                    builtInCall372=builtInCall();

                    state._fsp--;

                    adaptor.addChild(root_0, builtInCall372.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:44: iriRefOrFunction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRefOrFunction_in_primaryExpression4887);
                    iriRefOrFunction373=iriRefOrFunction();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRefOrFunction373.getTree());

                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:63: rdfLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_rdfLiteral_in_primaryExpression4891);
                    rdfLiteral374=rdfLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, rdfLiteral374.getTree());

                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:76: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_primaryExpression4895);
                    numericLiteral375=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral375.getTree());

                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:93: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression4899);
                    booleanLiteral376=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral376.getTree());

                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:110: var
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_in_primaryExpression4903);
                    var377=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var377.getTree());

                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:524:116: aggregate
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_aggregate_in_primaryExpression4907);
                    aggregate378=aggregate();

                    state._fsp--;

                    adaptor.addChild(root_0, aggregate378.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class brackettedExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "brackettedExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:527:1: brackettedExpression : OPEN_BRACE expression CLOSE_BRACE -> expression ;
    public final SparqlParser.brackettedExpression_return brackettedExpression() throws RecognitionException {
        SparqlParser.brackettedExpression_return retval = new SparqlParser.brackettedExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_BRACE379=null;
        Token CLOSE_BRACE381=null;
        SparqlParser.expression_return expression380 = null;


        Object OPEN_BRACE379_tree=null;
        Object CLOSE_BRACE381_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:528:5: ( OPEN_BRACE expression CLOSE_BRACE -> expression )
            // com\\googlecode\\sparkleg\\Sparql.g:528:7: OPEN_BRACE expression CLOSE_BRACE
            {
            OPEN_BRACE379=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_brackettedExpression4924);  
            stream_OPEN_BRACE.add(OPEN_BRACE379);

            pushFollow(FOLLOW_expression_in_brackettedExpression4926);
            expression380=expression();

            state._fsp--;

            stream_expression.add(expression380.getTree());
            CLOSE_BRACE381=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_brackettedExpression4928);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE381);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 528:41: -> expression
            {
                adaptor.addChild(root_0, stream_expression.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "brackettedExpression"

    public static class builtInCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "builtInCall"
    // com\\googlecode\\sparkleg\\Sparql.g:531:1: builtInCall : ( STR OPEN_BRACE expression CLOSE_BRACE -> ^( STR expression ) | LANG OPEN_BRACE expression CLOSE_BRACE -> ^( LANG expression ) | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( LANGMATCHES ( expression )+ ) | DATATYPE OPEN_BRACE expression CLOSE_BRACE -> ^( DATATYPE expression ) | BOUND OPEN_BRACE var CLOSE_BRACE -> ^( BOUND var ) | IRI OPEN_BRACE expression CLOSE_BRACE -> ^( IRI expression ) | URI OPEN_BRACE expression CLOSE_BRACE -> ^( URI expression ) | BNODE ( OPEN_BRACE expression CLOSE_BRACE | nil ) -> ^( BNODE expression ) | RAND nil -> RAND | ABS OPEN_BRACE expression CLOSE_BRACE -> ^( ABS expression ) | CEIL OPEN_BRACE expression CLOSE_BRACE -> ^( CEIL expression ) | FLOOR OPEN_BRACE expression CLOSE_BRACE -> ^( FLOOR expression ) | ROUND OPEN_BRACE expression CLOSE_BRACE -> ^( ROUND expression ) | CONCAT expressionList -> ^( CONCAT expressionList ) | subStringExpression -> subStringExpression | STRLEN OPEN_BRACE expression CLOSE_BRACE -> ^( STRLEN expression ) | UCASE OPEN_BRACE expression CLOSE_BRACE -> ^( UCASE expression ) | LCASE OPEN_BRACE expression CLOSE_BRACE -> ^( LCASE expression ) | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE -> ^( ENCODE_FOR_URI expression ) | CONTAINS OPEN_BRACE expression CLOSE_BRACE -> ^( CONTAINS expression ) | STRSTARTS OPEN_BRACE expression CLOSE_BRACE -> ^( STRSTARTS expression ) | STRENDS OPEN_BRACE expression CLOSE_BRACE -> ^( STRENDS expression ) | YEAR OPEN_BRACE expression CLOSE_BRACE -> ^( YEAR expression ) | MONTH OPEN_BRACE expression CLOSE_BRACE -> ^( MONTH expression ) | DAY OPEN_BRACE expression CLOSE_BRACE -> ^( DAY expression ) | HOURS OPEN_BRACE expression CLOSE_BRACE -> ^( HOURS expression ) | MINUTES OPEN_BRACE expression CLOSE_BRACE -> ^( MINUTES expression ) | SECONDS OPEN_BRACE expression CLOSE_BRACE -> ^( SECONDS expression ) | TIMEZONE OPEN_BRACE expression CLOSE_BRACE -> ^( TIMEZONE expression ) | TZ OPEN_BRACE expression CLOSE_BRACE -> ^( TZ expression ) | NOW nil -> NOW | MD5 OPEN_BRACE expression CLOSE_BRACE -> ^( MD5 expression ) | SHA1 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA1 expression ) | SHA224 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA224 expression ) | SHA256 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA256 expression ) | SHA384 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA384 expression ) | SHA512 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA512 expression ) | COALESCE expressionList -> ^( COALESCE expressionList ) | IF OPEN_BRACE e1= expression COMMA e2= expression COMMA e3= expression CLOSE_BRACE -> ^( IF $e1 $e2 $e3) | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRLANG expression expression ) | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRDT expression expression ) | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( SAMETERM expression expression ) | ISIRI OPEN_BRACE expression CLOSE_BRACE -> ^( ISIRI expression ) | ISURI OPEN_BRACE expression CLOSE_BRACE -> ^( ISURI expression ) | ISBLANK OPEN_BRACE expression CLOSE_BRACE -> ^( ISBLANK expression ) | ISLITERAL OPEN_BRACE expression CLOSE_BRACE -> ^( ISLITERAL expression ) | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE -> ^( ISNUMERIC expression ) | regexExpression -> regexExpression | existsFunction -> existsFunction | notExistsFunction -> notExistsFunction );
    public final SparqlParser.builtInCall_return builtInCall() throws RecognitionException {
        SparqlParser.builtInCall_return retval = new SparqlParser.builtInCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STR382=null;
        Token OPEN_BRACE383=null;
        Token CLOSE_BRACE385=null;
        Token LANG386=null;
        Token OPEN_BRACE387=null;
        Token CLOSE_BRACE389=null;
        Token LANGMATCHES390=null;
        Token OPEN_BRACE391=null;
        Token COMMA393=null;
        Token CLOSE_BRACE395=null;
        Token DATATYPE396=null;
        Token OPEN_BRACE397=null;
        Token CLOSE_BRACE399=null;
        Token BOUND400=null;
        Token OPEN_BRACE401=null;
        Token CLOSE_BRACE403=null;
        Token IRI404=null;
        Token OPEN_BRACE405=null;
        Token CLOSE_BRACE407=null;
        Token URI408=null;
        Token OPEN_BRACE409=null;
        Token CLOSE_BRACE411=null;
        Token BNODE412=null;
        Token OPEN_BRACE413=null;
        Token CLOSE_BRACE415=null;
        Token RAND417=null;
        Token ABS419=null;
        Token OPEN_BRACE420=null;
        Token CLOSE_BRACE422=null;
        Token CEIL423=null;
        Token OPEN_BRACE424=null;
        Token CLOSE_BRACE426=null;
        Token FLOOR427=null;
        Token OPEN_BRACE428=null;
        Token CLOSE_BRACE430=null;
        Token ROUND431=null;
        Token OPEN_BRACE432=null;
        Token CLOSE_BRACE434=null;
        Token CONCAT435=null;
        Token STRLEN438=null;
        Token OPEN_BRACE439=null;
        Token CLOSE_BRACE441=null;
        Token UCASE442=null;
        Token OPEN_BRACE443=null;
        Token CLOSE_BRACE445=null;
        Token LCASE446=null;
        Token OPEN_BRACE447=null;
        Token CLOSE_BRACE449=null;
        Token ENCODE_FOR_URI450=null;
        Token OPEN_BRACE451=null;
        Token CLOSE_BRACE453=null;
        Token CONTAINS454=null;
        Token OPEN_BRACE455=null;
        Token CLOSE_BRACE457=null;
        Token STRSTARTS458=null;
        Token OPEN_BRACE459=null;
        Token CLOSE_BRACE461=null;
        Token STRENDS462=null;
        Token OPEN_BRACE463=null;
        Token CLOSE_BRACE465=null;
        Token YEAR466=null;
        Token OPEN_BRACE467=null;
        Token CLOSE_BRACE469=null;
        Token MONTH470=null;
        Token OPEN_BRACE471=null;
        Token CLOSE_BRACE473=null;
        Token DAY474=null;
        Token OPEN_BRACE475=null;
        Token CLOSE_BRACE477=null;
        Token HOURS478=null;
        Token OPEN_BRACE479=null;
        Token CLOSE_BRACE481=null;
        Token MINUTES482=null;
        Token OPEN_BRACE483=null;
        Token CLOSE_BRACE485=null;
        Token SECONDS486=null;
        Token OPEN_BRACE487=null;
        Token CLOSE_BRACE489=null;
        Token TIMEZONE490=null;
        Token OPEN_BRACE491=null;
        Token CLOSE_BRACE493=null;
        Token TZ494=null;
        Token OPEN_BRACE495=null;
        Token CLOSE_BRACE497=null;
        Token NOW498=null;
        Token MD5500=null;
        Token OPEN_BRACE501=null;
        Token CLOSE_BRACE503=null;
        Token SHA1504=null;
        Token OPEN_BRACE505=null;
        Token CLOSE_BRACE507=null;
        Token SHA224508=null;
        Token OPEN_BRACE509=null;
        Token CLOSE_BRACE511=null;
        Token SHA256512=null;
        Token OPEN_BRACE513=null;
        Token CLOSE_BRACE515=null;
        Token SHA384516=null;
        Token OPEN_BRACE517=null;
        Token CLOSE_BRACE519=null;
        Token SHA512520=null;
        Token OPEN_BRACE521=null;
        Token CLOSE_BRACE523=null;
        Token COALESCE524=null;
        Token IF526=null;
        Token OPEN_BRACE527=null;
        Token COMMA528=null;
        Token COMMA529=null;
        Token CLOSE_BRACE530=null;
        Token STRLANG531=null;
        Token OPEN_BRACE532=null;
        Token COMMA534=null;
        Token CLOSE_BRACE536=null;
        Token STRDT537=null;
        Token OPEN_BRACE538=null;
        Token COMMA540=null;
        Token CLOSE_BRACE542=null;
        Token SAMETERM543=null;
        Token OPEN_BRACE544=null;
        Token COMMA546=null;
        Token CLOSE_BRACE548=null;
        Token ISIRI549=null;
        Token OPEN_BRACE550=null;
        Token CLOSE_BRACE552=null;
        Token ISURI553=null;
        Token OPEN_BRACE554=null;
        Token CLOSE_BRACE556=null;
        Token ISBLANK557=null;
        Token OPEN_BRACE558=null;
        Token CLOSE_BRACE560=null;
        Token ISLITERAL561=null;
        Token OPEN_BRACE562=null;
        Token CLOSE_BRACE564=null;
        Token ISNUMERIC565=null;
        Token OPEN_BRACE566=null;
        Token CLOSE_BRACE568=null;
        SparqlParser.expression_return e1 = null;

        SparqlParser.expression_return e2 = null;

        SparqlParser.expression_return e3 = null;

        SparqlParser.expression_return expression384 = null;

        SparqlParser.expression_return expression388 = null;

        SparqlParser.expression_return expression392 = null;

        SparqlParser.expression_return expression394 = null;

        SparqlParser.expression_return expression398 = null;

        SparqlParser.var_return var402 = null;

        SparqlParser.expression_return expression406 = null;

        SparqlParser.expression_return expression410 = null;

        SparqlParser.expression_return expression414 = null;

        SparqlParser.nil_return nil416 = null;

        SparqlParser.nil_return nil418 = null;

        SparqlParser.expression_return expression421 = null;

        SparqlParser.expression_return expression425 = null;

        SparqlParser.expression_return expression429 = null;

        SparqlParser.expression_return expression433 = null;

        SparqlParser.expressionList_return expressionList436 = null;

        SparqlParser.subStringExpression_return subStringExpression437 = null;

        SparqlParser.expression_return expression440 = null;

        SparqlParser.expression_return expression444 = null;

        SparqlParser.expression_return expression448 = null;

        SparqlParser.expression_return expression452 = null;

        SparqlParser.expression_return expression456 = null;

        SparqlParser.expression_return expression460 = null;

        SparqlParser.expression_return expression464 = null;

        SparqlParser.expression_return expression468 = null;

        SparqlParser.expression_return expression472 = null;

        SparqlParser.expression_return expression476 = null;

        SparqlParser.expression_return expression480 = null;

        SparqlParser.expression_return expression484 = null;

        SparqlParser.expression_return expression488 = null;

        SparqlParser.expression_return expression492 = null;

        SparqlParser.expression_return expression496 = null;

        SparqlParser.nil_return nil499 = null;

        SparqlParser.expression_return expression502 = null;

        SparqlParser.expression_return expression506 = null;

        SparqlParser.expression_return expression510 = null;

        SparqlParser.expression_return expression514 = null;

        SparqlParser.expression_return expression518 = null;

        SparqlParser.expression_return expression522 = null;

        SparqlParser.expressionList_return expressionList525 = null;

        SparqlParser.expression_return expression533 = null;

        SparqlParser.expression_return expression535 = null;

        SparqlParser.expression_return expression539 = null;

        SparqlParser.expression_return expression541 = null;

        SparqlParser.expression_return expression545 = null;

        SparqlParser.expression_return expression547 = null;

        SparqlParser.expression_return expression551 = null;

        SparqlParser.expression_return expression555 = null;

        SparqlParser.expression_return expression559 = null;

        SparqlParser.expression_return expression563 = null;

        SparqlParser.expression_return expression567 = null;

        SparqlParser.regexExpression_return regexExpression569 = null;

        SparqlParser.existsFunction_return existsFunction570 = null;

        SparqlParser.notExistsFunction_return notExistsFunction571 = null;


        Object STR382_tree=null;
        Object OPEN_BRACE383_tree=null;
        Object CLOSE_BRACE385_tree=null;
        Object LANG386_tree=null;
        Object OPEN_BRACE387_tree=null;
        Object CLOSE_BRACE389_tree=null;
        Object LANGMATCHES390_tree=null;
        Object OPEN_BRACE391_tree=null;
        Object COMMA393_tree=null;
        Object CLOSE_BRACE395_tree=null;
        Object DATATYPE396_tree=null;
        Object OPEN_BRACE397_tree=null;
        Object CLOSE_BRACE399_tree=null;
        Object BOUND400_tree=null;
        Object OPEN_BRACE401_tree=null;
        Object CLOSE_BRACE403_tree=null;
        Object IRI404_tree=null;
        Object OPEN_BRACE405_tree=null;
        Object CLOSE_BRACE407_tree=null;
        Object URI408_tree=null;
        Object OPEN_BRACE409_tree=null;
        Object CLOSE_BRACE411_tree=null;
        Object BNODE412_tree=null;
        Object OPEN_BRACE413_tree=null;
        Object CLOSE_BRACE415_tree=null;
        Object RAND417_tree=null;
        Object ABS419_tree=null;
        Object OPEN_BRACE420_tree=null;
        Object CLOSE_BRACE422_tree=null;
        Object CEIL423_tree=null;
        Object OPEN_BRACE424_tree=null;
        Object CLOSE_BRACE426_tree=null;
        Object FLOOR427_tree=null;
        Object OPEN_BRACE428_tree=null;
        Object CLOSE_BRACE430_tree=null;
        Object ROUND431_tree=null;
        Object OPEN_BRACE432_tree=null;
        Object CLOSE_BRACE434_tree=null;
        Object CONCAT435_tree=null;
        Object STRLEN438_tree=null;
        Object OPEN_BRACE439_tree=null;
        Object CLOSE_BRACE441_tree=null;
        Object UCASE442_tree=null;
        Object OPEN_BRACE443_tree=null;
        Object CLOSE_BRACE445_tree=null;
        Object LCASE446_tree=null;
        Object OPEN_BRACE447_tree=null;
        Object CLOSE_BRACE449_tree=null;
        Object ENCODE_FOR_URI450_tree=null;
        Object OPEN_BRACE451_tree=null;
        Object CLOSE_BRACE453_tree=null;
        Object CONTAINS454_tree=null;
        Object OPEN_BRACE455_tree=null;
        Object CLOSE_BRACE457_tree=null;
        Object STRSTARTS458_tree=null;
        Object OPEN_BRACE459_tree=null;
        Object CLOSE_BRACE461_tree=null;
        Object STRENDS462_tree=null;
        Object OPEN_BRACE463_tree=null;
        Object CLOSE_BRACE465_tree=null;
        Object YEAR466_tree=null;
        Object OPEN_BRACE467_tree=null;
        Object CLOSE_BRACE469_tree=null;
        Object MONTH470_tree=null;
        Object OPEN_BRACE471_tree=null;
        Object CLOSE_BRACE473_tree=null;
        Object DAY474_tree=null;
        Object OPEN_BRACE475_tree=null;
        Object CLOSE_BRACE477_tree=null;
        Object HOURS478_tree=null;
        Object OPEN_BRACE479_tree=null;
        Object CLOSE_BRACE481_tree=null;
        Object MINUTES482_tree=null;
        Object OPEN_BRACE483_tree=null;
        Object CLOSE_BRACE485_tree=null;
        Object SECONDS486_tree=null;
        Object OPEN_BRACE487_tree=null;
        Object CLOSE_BRACE489_tree=null;
        Object TIMEZONE490_tree=null;
        Object OPEN_BRACE491_tree=null;
        Object CLOSE_BRACE493_tree=null;
        Object TZ494_tree=null;
        Object OPEN_BRACE495_tree=null;
        Object CLOSE_BRACE497_tree=null;
        Object NOW498_tree=null;
        Object MD5500_tree=null;
        Object OPEN_BRACE501_tree=null;
        Object CLOSE_BRACE503_tree=null;
        Object SHA1504_tree=null;
        Object OPEN_BRACE505_tree=null;
        Object CLOSE_BRACE507_tree=null;
        Object SHA224508_tree=null;
        Object OPEN_BRACE509_tree=null;
        Object CLOSE_BRACE511_tree=null;
        Object SHA256512_tree=null;
        Object OPEN_BRACE513_tree=null;
        Object CLOSE_BRACE515_tree=null;
        Object SHA384516_tree=null;
        Object OPEN_BRACE517_tree=null;
        Object CLOSE_BRACE519_tree=null;
        Object SHA512520_tree=null;
        Object OPEN_BRACE521_tree=null;
        Object CLOSE_BRACE523_tree=null;
        Object COALESCE524_tree=null;
        Object IF526_tree=null;
        Object OPEN_BRACE527_tree=null;
        Object COMMA528_tree=null;
        Object COMMA529_tree=null;
        Object CLOSE_BRACE530_tree=null;
        Object STRLANG531_tree=null;
        Object OPEN_BRACE532_tree=null;
        Object COMMA534_tree=null;
        Object CLOSE_BRACE536_tree=null;
        Object STRDT537_tree=null;
        Object OPEN_BRACE538_tree=null;
        Object COMMA540_tree=null;
        Object CLOSE_BRACE542_tree=null;
        Object SAMETERM543_tree=null;
        Object OPEN_BRACE544_tree=null;
        Object COMMA546_tree=null;
        Object CLOSE_BRACE548_tree=null;
        Object ISIRI549_tree=null;
        Object OPEN_BRACE550_tree=null;
        Object CLOSE_BRACE552_tree=null;
        Object ISURI553_tree=null;
        Object OPEN_BRACE554_tree=null;
        Object CLOSE_BRACE556_tree=null;
        Object ISBLANK557_tree=null;
        Object OPEN_BRACE558_tree=null;
        Object CLOSE_BRACE560_tree=null;
        Object ISLITERAL561_tree=null;
        Object OPEN_BRACE562_tree=null;
        Object CLOSE_BRACE564_tree=null;
        Object ISNUMERIC565_tree=null;
        Object OPEN_BRACE566_tree=null;
        Object CLOSE_BRACE568_tree=null;
        RewriteRuleTokenStream stream_SHA256=new RewriteRuleTokenStream(adaptor,"token SHA256");
        RewriteRuleTokenStream stream_YEAR=new RewriteRuleTokenStream(adaptor,"token YEAR");
        RewriteRuleTokenStream stream_TIMEZONE=new RewriteRuleTokenStream(adaptor,"token TIMEZONE");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_STRENDS=new RewriteRuleTokenStream(adaptor,"token STRENDS");
        RewriteRuleTokenStream stream_LCASE=new RewriteRuleTokenStream(adaptor,"token LCASE");
        RewriteRuleTokenStream stream_BNODE=new RewriteRuleTokenStream(adaptor,"token BNODE");
        RewriteRuleTokenStream stream_SHA512=new RewriteRuleTokenStream(adaptor,"token SHA512");
        RewriteRuleTokenStream stream_SECONDS=new RewriteRuleTokenStream(adaptor,"token SECONDS");
        RewriteRuleTokenStream stream_NOW=new RewriteRuleTokenStream(adaptor,"token NOW");
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_SHA224=new RewriteRuleTokenStream(adaptor,"token SHA224");
        RewriteRuleTokenStream stream_STRLEN=new RewriteRuleTokenStream(adaptor,"token STRLEN");
        RewriteRuleTokenStream stream_MONTH=new RewriteRuleTokenStream(adaptor,"token MONTH");
        RewriteRuleTokenStream stream_ENCODE_FOR_URI=new RewriteRuleTokenStream(adaptor,"token ENCODE_FOR_URI");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ISURI=new RewriteRuleTokenStream(adaptor,"token ISURI");
        RewriteRuleTokenStream stream_STR=new RewriteRuleTokenStream(adaptor,"token STR");
        RewriteRuleTokenStream stream_STRDT=new RewriteRuleTokenStream(adaptor,"token STRDT");
        RewriteRuleTokenStream stream_ISLITERAL=new RewriteRuleTokenStream(adaptor,"token ISLITERAL");
        RewriteRuleTokenStream stream_SAMETERM=new RewriteRuleTokenStream(adaptor,"token SAMETERM");
        RewriteRuleTokenStream stream_MD5=new RewriteRuleTokenStream(adaptor,"token MD5");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RAND=new RewriteRuleTokenStream(adaptor,"token RAND");
        RewriteRuleTokenStream stream_IRI=new RewriteRuleTokenStream(adaptor,"token IRI");
        RewriteRuleTokenStream stream_LANGMATCHES=new RewriteRuleTokenStream(adaptor,"token LANGMATCHES");
        RewriteRuleTokenStream stream_TZ=new RewriteRuleTokenStream(adaptor,"token TZ");
        RewriteRuleTokenStream stream_STRLANG=new RewriteRuleTokenStream(adaptor,"token STRLANG");
        RewriteRuleTokenStream stream_BOUND=new RewriteRuleTokenStream(adaptor,"token BOUND");
        RewriteRuleTokenStream stream_ISIRI=new RewriteRuleTokenStream(adaptor,"token ISIRI");
        RewriteRuleTokenStream stream_COALESCE=new RewriteRuleTokenStream(adaptor,"token COALESCE");
        RewriteRuleTokenStream stream_CONCAT=new RewriteRuleTokenStream(adaptor,"token CONCAT");
        RewriteRuleTokenStream stream_ISNUMERIC=new RewriteRuleTokenStream(adaptor,"token ISNUMERIC");
        RewriteRuleTokenStream stream_STRSTARTS=new RewriteRuleTokenStream(adaptor,"token STRSTARTS");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_SHA1=new RewriteRuleTokenStream(adaptor,"token SHA1");
        RewriteRuleTokenStream stream_FLOOR=new RewriteRuleTokenStream(adaptor,"token FLOOR");
        RewriteRuleTokenStream stream_ISBLANK=new RewriteRuleTokenStream(adaptor,"token ISBLANK");
        RewriteRuleTokenStream stream_UCASE=new RewriteRuleTokenStream(adaptor,"token UCASE");
        RewriteRuleTokenStream stream_URI=new RewriteRuleTokenStream(adaptor,"token URI");
        RewriteRuleTokenStream stream_ABS=new RewriteRuleTokenStream(adaptor,"token ABS");
        RewriteRuleTokenStream stream_MINUTES=new RewriteRuleTokenStream(adaptor,"token MINUTES");
        RewriteRuleTokenStream stream_ROUND=new RewriteRuleTokenStream(adaptor,"token ROUND");
        RewriteRuleTokenStream stream_CEIL=new RewriteRuleTokenStream(adaptor,"token CEIL");
        RewriteRuleTokenStream stream_DATATYPE=new RewriteRuleTokenStream(adaptor,"token DATATYPE");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_SHA384=new RewriteRuleTokenStream(adaptor,"token SHA384");
        RewriteRuleTokenStream stream_HOURS=new RewriteRuleTokenStream(adaptor,"token HOURS");
        RewriteRuleTokenStream stream_LANG=new RewriteRuleTokenStream(adaptor,"token LANG");
        RewriteRuleSubtreeStream stream_existsFunction=new RewriteRuleSubtreeStream(adaptor,"rule existsFunction");
        RewriteRuleSubtreeStream stream_subStringExpression=new RewriteRuleSubtreeStream(adaptor,"rule subStringExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_notExistsFunction=new RewriteRuleSubtreeStream(adaptor,"rule notExistsFunction");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_regexExpression=new RewriteRuleSubtreeStream(adaptor,"rule regexExpression");
        RewriteRuleSubtreeStream stream_nil=new RewriteRuleSubtreeStream(adaptor,"rule nil");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:532:5: ( STR OPEN_BRACE expression CLOSE_BRACE -> ^( STR expression ) | LANG OPEN_BRACE expression CLOSE_BRACE -> ^( LANG expression ) | LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( LANGMATCHES ( expression )+ ) | DATATYPE OPEN_BRACE expression CLOSE_BRACE -> ^( DATATYPE expression ) | BOUND OPEN_BRACE var CLOSE_BRACE -> ^( BOUND var ) | IRI OPEN_BRACE expression CLOSE_BRACE -> ^( IRI expression ) | URI OPEN_BRACE expression CLOSE_BRACE -> ^( URI expression ) | BNODE ( OPEN_BRACE expression CLOSE_BRACE | nil ) -> ^( BNODE expression ) | RAND nil -> RAND | ABS OPEN_BRACE expression CLOSE_BRACE -> ^( ABS expression ) | CEIL OPEN_BRACE expression CLOSE_BRACE -> ^( CEIL expression ) | FLOOR OPEN_BRACE expression CLOSE_BRACE -> ^( FLOOR expression ) | ROUND OPEN_BRACE expression CLOSE_BRACE -> ^( ROUND expression ) | CONCAT expressionList -> ^( CONCAT expressionList ) | subStringExpression -> subStringExpression | STRLEN OPEN_BRACE expression CLOSE_BRACE -> ^( STRLEN expression ) | UCASE OPEN_BRACE expression CLOSE_BRACE -> ^( UCASE expression ) | LCASE OPEN_BRACE expression CLOSE_BRACE -> ^( LCASE expression ) | ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE -> ^( ENCODE_FOR_URI expression ) | CONTAINS OPEN_BRACE expression CLOSE_BRACE -> ^( CONTAINS expression ) | STRSTARTS OPEN_BRACE expression CLOSE_BRACE -> ^( STRSTARTS expression ) | STRENDS OPEN_BRACE expression CLOSE_BRACE -> ^( STRENDS expression ) | YEAR OPEN_BRACE expression CLOSE_BRACE -> ^( YEAR expression ) | MONTH OPEN_BRACE expression CLOSE_BRACE -> ^( MONTH expression ) | DAY OPEN_BRACE expression CLOSE_BRACE -> ^( DAY expression ) | HOURS OPEN_BRACE expression CLOSE_BRACE -> ^( HOURS expression ) | MINUTES OPEN_BRACE expression CLOSE_BRACE -> ^( MINUTES expression ) | SECONDS OPEN_BRACE expression CLOSE_BRACE -> ^( SECONDS expression ) | TIMEZONE OPEN_BRACE expression CLOSE_BRACE -> ^( TIMEZONE expression ) | TZ OPEN_BRACE expression CLOSE_BRACE -> ^( TZ expression ) | NOW nil -> NOW | MD5 OPEN_BRACE expression CLOSE_BRACE -> ^( MD5 expression ) | SHA1 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA1 expression ) | SHA224 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA224 expression ) | SHA256 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA256 expression ) | SHA384 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA384 expression ) | SHA512 OPEN_BRACE expression CLOSE_BRACE -> ^( SHA512 expression ) | COALESCE expressionList -> ^( COALESCE expressionList ) | IF OPEN_BRACE e1= expression COMMA e2= expression COMMA e3= expression CLOSE_BRACE -> ^( IF $e1 $e2 $e3) | STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRLANG expression expression ) | STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( STRDT expression expression ) | SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE -> ^( SAMETERM expression expression ) | ISIRI OPEN_BRACE expression CLOSE_BRACE -> ^( ISIRI expression ) | ISURI OPEN_BRACE expression CLOSE_BRACE -> ^( ISURI expression ) | ISBLANK OPEN_BRACE expression CLOSE_BRACE -> ^( ISBLANK expression ) | ISLITERAL OPEN_BRACE expression CLOSE_BRACE -> ^( ISLITERAL expression ) | ISNUMERIC OPEN_BRACE expression CLOSE_BRACE -> ^( ISNUMERIC expression ) | regexExpression -> regexExpression | existsFunction -> existsFunction | notExistsFunction -> notExistsFunction )
            int alt125=50;
            switch ( input.LA(1) ) {
            case STR:
                {
                alt125=1;
                }
                break;
            case LANG:
                {
                alt125=2;
                }
                break;
            case LANGMATCHES:
                {
                alt125=3;
                }
                break;
            case DATATYPE:
                {
                alt125=4;
                }
                break;
            case BOUND:
                {
                alt125=5;
                }
                break;
            case IRI:
                {
                alt125=6;
                }
                break;
            case URI:
                {
                alt125=7;
                }
                break;
            case BNODE:
                {
                alt125=8;
                }
                break;
            case RAND:
                {
                alt125=9;
                }
                break;
            case ABS:
                {
                alt125=10;
                }
                break;
            case CEIL:
                {
                alt125=11;
                }
                break;
            case FLOOR:
                {
                alt125=12;
                }
                break;
            case ROUND:
                {
                alt125=13;
                }
                break;
            case CONCAT:
                {
                alt125=14;
                }
                break;
            case SUBSTR:
                {
                alt125=15;
                }
                break;
            case STRLEN:
                {
                alt125=16;
                }
                break;
            case UCASE:
                {
                alt125=17;
                }
                break;
            case LCASE:
                {
                alt125=18;
                }
                break;
            case ENCODE_FOR_URI:
                {
                alt125=19;
                }
                break;
            case CONTAINS:
                {
                alt125=20;
                }
                break;
            case STRSTARTS:
                {
                alt125=21;
                }
                break;
            case STRENDS:
                {
                alt125=22;
                }
                break;
            case YEAR:
                {
                alt125=23;
                }
                break;
            case MONTH:
                {
                alt125=24;
                }
                break;
            case DAY:
                {
                alt125=25;
                }
                break;
            case HOURS:
                {
                alt125=26;
                }
                break;
            case MINUTES:
                {
                alt125=27;
                }
                break;
            case SECONDS:
                {
                alt125=28;
                }
                break;
            case TIMEZONE:
                {
                alt125=29;
                }
                break;
            case TZ:
                {
                alt125=30;
                }
                break;
            case NOW:
                {
                alt125=31;
                }
                break;
            case MD5:
                {
                alt125=32;
                }
                break;
            case SHA1:
                {
                alt125=33;
                }
                break;
            case SHA224:
                {
                alt125=34;
                }
                break;
            case SHA256:
                {
                alt125=35;
                }
                break;
            case SHA384:
                {
                alt125=36;
                }
                break;
            case SHA512:
                {
                alt125=37;
                }
                break;
            case COALESCE:
                {
                alt125=38;
                }
                break;
            case IF:
                {
                alt125=39;
                }
                break;
            case STRLANG:
                {
                alt125=40;
                }
                break;
            case STRDT:
                {
                alt125=41;
                }
                break;
            case SAMETERM:
                {
                alt125=42;
                }
                break;
            case ISIRI:
                {
                alt125=43;
                }
                break;
            case ISURI:
                {
                alt125=44;
                }
                break;
            case ISBLANK:
                {
                alt125=45;
                }
                break;
            case ISLITERAL:
                {
                alt125=46;
                }
                break;
            case ISNUMERIC:
                {
                alt125=47;
                }
                break;
            case REGEX:
                {
                alt125=48;
                }
                break;
            case EXISTS:
                {
                alt125=49;
                }
                break;
            case NOT:
                {
                alt125=50;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:532:7: STR OPEN_BRACE expression CLOSE_BRACE
                    {
                    STR382=(Token)match(input,STR,FOLLOW_STR_in_builtInCall4949);  
                    stream_STR.add(STR382);

                    OPEN_BRACE383=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall4951);  
                    stream_OPEN_BRACE.add(OPEN_BRACE383);

                    pushFollow(FOLLOW_expression_in_builtInCall4953);
                    expression384=expression();

                    state._fsp--;

                    stream_expression.add(expression384.getTree());
                    CLOSE_BRACE385=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall4955);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE385);



                    // AST REWRITE
                    // elements: expression, STR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 532:45: -> ^( STR expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:532:48: ^( STR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STR.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:533:7: LANG OPEN_BRACE expression CLOSE_BRACE
                    {
                    LANG386=(Token)match(input,LANG,FOLLOW_LANG_in_builtInCall4971);  
                    stream_LANG.add(LANG386);

                    OPEN_BRACE387=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall4973);  
                    stream_OPEN_BRACE.add(OPEN_BRACE387);

                    pushFollow(FOLLOW_expression_in_builtInCall4975);
                    expression388=expression();

                    state._fsp--;

                    stream_expression.add(expression388.getTree());
                    CLOSE_BRACE389=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall4977);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE389);



                    // AST REWRITE
                    // elements: LANG, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 533:46: -> ^( LANG expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:533:49: ^( LANG expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LANG.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:534:7: LANGMATCHES OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    LANGMATCHES390=(Token)match(input,LANGMATCHES,FOLLOW_LANGMATCHES_in_builtInCall4993);  
                    stream_LANGMATCHES.add(LANGMATCHES390);

                    OPEN_BRACE391=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall4995);  
                    stream_OPEN_BRACE.add(OPEN_BRACE391);

                    pushFollow(FOLLOW_expression_in_builtInCall4997);
                    expression392=expression();

                    state._fsp--;

                    stream_expression.add(expression392.getTree());
                    COMMA393=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall4999);  
                    stream_COMMA.add(COMMA393);

                    pushFollow(FOLLOW_expression_in_builtInCall5001);
                    expression394=expression();

                    state._fsp--;

                    stream_expression.add(expression394.getTree());
                    CLOSE_BRACE395=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5003);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE395);



                    // AST REWRITE
                    // elements: LANGMATCHES, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 534:70: -> ^( LANGMATCHES ( expression )+ )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:534:73: ^( LANGMATCHES ( expression )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LANGMATCHES.nextNode(), root_1);

                        if ( !(stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:535:7: DATATYPE OPEN_BRACE expression CLOSE_BRACE
                    {
                    DATATYPE396=(Token)match(input,DATATYPE,FOLLOW_DATATYPE_in_builtInCall5020);  
                    stream_DATATYPE.add(DATATYPE396);

                    OPEN_BRACE397=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5022);  
                    stream_OPEN_BRACE.add(OPEN_BRACE397);

                    pushFollow(FOLLOW_expression_in_builtInCall5024);
                    expression398=expression();

                    state._fsp--;

                    stream_expression.add(expression398.getTree());
                    CLOSE_BRACE399=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5026);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE399);



                    // AST REWRITE
                    // elements: expression, DATATYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 535:50: -> ^( DATATYPE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:535:53: ^( DATATYPE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATATYPE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:536:7: BOUND OPEN_BRACE var CLOSE_BRACE
                    {
                    BOUND400=(Token)match(input,BOUND,FOLLOW_BOUND_in_builtInCall5042);  
                    stream_BOUND.add(BOUND400);

                    OPEN_BRACE401=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5044);  
                    stream_OPEN_BRACE.add(OPEN_BRACE401);

                    pushFollow(FOLLOW_var_in_builtInCall5046);
                    var402=var();

                    state._fsp--;

                    stream_var.add(var402.getTree());
                    CLOSE_BRACE403=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5048);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE403);



                    // AST REWRITE
                    // elements: BOUND, var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 536:40: -> ^( BOUND var )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:536:43: ^( BOUND var )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BOUND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:537:7: IRI OPEN_BRACE expression CLOSE_BRACE
                    {
                    IRI404=(Token)match(input,IRI,FOLLOW_IRI_in_builtInCall5064);  
                    stream_IRI.add(IRI404);

                    OPEN_BRACE405=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5066);  
                    stream_OPEN_BRACE.add(OPEN_BRACE405);

                    pushFollow(FOLLOW_expression_in_builtInCall5068);
                    expression406=expression();

                    state._fsp--;

                    stream_expression.add(expression406.getTree());
                    CLOSE_BRACE407=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5070);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE407);



                    // AST REWRITE
                    // elements: IRI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 537:45: -> ^( IRI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:537:48: ^( IRI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IRI.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:538:7: URI OPEN_BRACE expression CLOSE_BRACE
                    {
                    URI408=(Token)match(input,URI,FOLLOW_URI_in_builtInCall5086);  
                    stream_URI.add(URI408);

                    OPEN_BRACE409=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5088);  
                    stream_OPEN_BRACE.add(OPEN_BRACE409);

                    pushFollow(FOLLOW_expression_in_builtInCall5090);
                    expression410=expression();

                    state._fsp--;

                    stream_expression.add(expression410.getTree());
                    CLOSE_BRACE411=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5092);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE411);



                    // AST REWRITE
                    // elements: URI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 538:45: -> ^( URI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:538:48: ^( URI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_URI.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // com\\googlecode\\sparkleg\\Sparql.g:539:7: BNODE ( OPEN_BRACE expression CLOSE_BRACE | nil )
                    {
                    BNODE412=(Token)match(input,BNODE,FOLLOW_BNODE_in_builtInCall5108);  
                    stream_BNODE.add(BNODE412);

                    // com\\googlecode\\sparkleg\\Sparql.g:539:13: ( OPEN_BRACE expression CLOSE_BRACE | nil )
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==OPEN_BRACE) ) {
                        int LA124_1 = input.LA(2);

                        if ( (LA124_1==CLOSE_BRACE) ) {
                            alt124=2;
                        }
                        else if ( (LA124_1==IRI_REF||LA124_1==PNAME_NS||LA124_1==OPEN_BRACE||LA124_1==INTEGER||(LA124_1>=PLUS && LA124_1<=NEGATION)||(LA124_1>=VAR1 && LA124_1<=VAR2)||(LA124_1>=NOT && LA124_1<=GROUP_CONCAT)||(LA124_1>=DECIMAL && LA124_1<=PNAME_LN)) ) {
                            alt124=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 124, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 124, 0, input);

                        throw nvae;
                    }
                    switch (alt124) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:539:14: OPEN_BRACE expression CLOSE_BRACE
                            {
                            OPEN_BRACE413=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5111);  
                            stream_OPEN_BRACE.add(OPEN_BRACE413);

                            pushFollow(FOLLOW_expression_in_builtInCall5113);
                            expression414=expression();

                            state._fsp--;

                            stream_expression.add(expression414.getTree());
                            CLOSE_BRACE415=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5115);  
                            stream_CLOSE_BRACE.add(CLOSE_BRACE415);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:539:49: nil
                            {
                            pushFollow(FOLLOW_nil_in_builtInCall5118);
                            nil416=nil();

                            state._fsp--;

                            stream_nil.add(nil416.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, BNODE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 539:54: -> ^( BNODE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:539:57: ^( BNODE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_BNODE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // com\\googlecode\\sparkleg\\Sparql.g:540:7: RAND nil
                    {
                    RAND417=(Token)match(input,RAND,FOLLOW_RAND_in_builtInCall5135);  
                    stream_RAND.add(RAND417);

                    pushFollow(FOLLOW_nil_in_builtInCall5137);
                    nil418=nil();

                    state._fsp--;

                    stream_nil.add(nil418.getTree());


                    // AST REWRITE
                    // elements: RAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 540:16: -> RAND
                    {
                        adaptor.addChild(root_0, stream_RAND.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // com\\googlecode\\sparkleg\\Sparql.g:541:7: ABS OPEN_BRACE expression CLOSE_BRACE
                    {
                    ABS419=(Token)match(input,ABS,FOLLOW_ABS_in_builtInCall5149);  
                    stream_ABS.add(ABS419);

                    OPEN_BRACE420=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5151);  
                    stream_OPEN_BRACE.add(OPEN_BRACE420);

                    pushFollow(FOLLOW_expression_in_builtInCall5153);
                    expression421=expression();

                    state._fsp--;

                    stream_expression.add(expression421.getTree());
                    CLOSE_BRACE422=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5155);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE422);



                    // AST REWRITE
                    // elements: ABS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 541:45: -> ^( ABS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:541:48: ^( ABS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ABS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // com\\googlecode\\sparkleg\\Sparql.g:542:7: CEIL OPEN_BRACE expression CLOSE_BRACE
                    {
                    CEIL423=(Token)match(input,CEIL,FOLLOW_CEIL_in_builtInCall5171);  
                    stream_CEIL.add(CEIL423);

                    OPEN_BRACE424=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5173);  
                    stream_OPEN_BRACE.add(OPEN_BRACE424);

                    pushFollow(FOLLOW_expression_in_builtInCall5175);
                    expression425=expression();

                    state._fsp--;

                    stream_expression.add(expression425.getTree());
                    CLOSE_BRACE426=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5177);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE426);



                    // AST REWRITE
                    // elements: CEIL, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 542:46: -> ^( CEIL expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:542:49: ^( CEIL expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CEIL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // com\\googlecode\\sparkleg\\Sparql.g:543:7: FLOOR OPEN_BRACE expression CLOSE_BRACE
                    {
                    FLOOR427=(Token)match(input,FLOOR,FOLLOW_FLOOR_in_builtInCall5193);  
                    stream_FLOOR.add(FLOOR427);

                    OPEN_BRACE428=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5195);  
                    stream_OPEN_BRACE.add(OPEN_BRACE428);

                    pushFollow(FOLLOW_expression_in_builtInCall5197);
                    expression429=expression();

                    state._fsp--;

                    stream_expression.add(expression429.getTree());
                    CLOSE_BRACE430=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5199);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE430);



                    // AST REWRITE
                    // elements: FLOOR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 543:47: -> ^( FLOOR expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:543:50: ^( FLOOR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_FLOOR.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // com\\googlecode\\sparkleg\\Sparql.g:544:7: ROUND OPEN_BRACE expression CLOSE_BRACE
                    {
                    ROUND431=(Token)match(input,ROUND,FOLLOW_ROUND_in_builtInCall5215);  
                    stream_ROUND.add(ROUND431);

                    OPEN_BRACE432=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5217);  
                    stream_OPEN_BRACE.add(OPEN_BRACE432);

                    pushFollow(FOLLOW_expression_in_builtInCall5219);
                    expression433=expression();

                    state._fsp--;

                    stream_expression.add(expression433.getTree());
                    CLOSE_BRACE434=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5221);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE434);



                    // AST REWRITE
                    // elements: expression, ROUND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 544:47: -> ^( ROUND expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:544:50: ^( ROUND expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ROUND.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // com\\googlecode\\sparkleg\\Sparql.g:545:7: CONCAT expressionList
                    {
                    CONCAT435=(Token)match(input,CONCAT,FOLLOW_CONCAT_in_builtInCall5237);  
                    stream_CONCAT.add(CONCAT435);

                    pushFollow(FOLLOW_expressionList_in_builtInCall5239);
                    expressionList436=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList436.getTree());


                    // AST REWRITE
                    // elements: expressionList, CONCAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 545:29: -> ^( CONCAT expressionList )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:545:32: ^( CONCAT expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONCAT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // com\\googlecode\\sparkleg\\Sparql.g:546:7: subStringExpression
                    {
                    pushFollow(FOLLOW_subStringExpression_in_builtInCall5255);
                    subStringExpression437=subStringExpression();

                    state._fsp--;

                    stream_subStringExpression.add(subStringExpression437.getTree());


                    // AST REWRITE
                    // elements: subStringExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 546:27: -> subStringExpression
                    {
                        adaptor.addChild(root_0, stream_subStringExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // com\\googlecode\\sparkleg\\Sparql.g:547:7: STRLEN OPEN_BRACE expression CLOSE_BRACE
                    {
                    STRLEN438=(Token)match(input,STRLEN,FOLLOW_STRLEN_in_builtInCall5267);  
                    stream_STRLEN.add(STRLEN438);

                    OPEN_BRACE439=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5269);  
                    stream_OPEN_BRACE.add(OPEN_BRACE439);

                    pushFollow(FOLLOW_expression_in_builtInCall5271);
                    expression440=expression();

                    state._fsp--;

                    stream_expression.add(expression440.getTree());
                    CLOSE_BRACE441=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5273);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE441);



                    // AST REWRITE
                    // elements: STRLEN, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 547:48: -> ^( STRLEN expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:547:51: ^( STRLEN expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STRLEN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // com\\googlecode\\sparkleg\\Sparql.g:548:7: UCASE OPEN_BRACE expression CLOSE_BRACE
                    {
                    UCASE442=(Token)match(input,UCASE,FOLLOW_UCASE_in_builtInCall5289);  
                    stream_UCASE.add(UCASE442);

                    OPEN_BRACE443=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5291);  
                    stream_OPEN_BRACE.add(OPEN_BRACE443);

                    pushFollow(FOLLOW_expression_in_builtInCall5293);
                    expression444=expression();

                    state._fsp--;

                    stream_expression.add(expression444.getTree());
                    CLOSE_BRACE445=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5295);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE445);



                    // AST REWRITE
                    // elements: UCASE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 548:47: -> ^( UCASE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:548:50: ^( UCASE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_UCASE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // com\\googlecode\\sparkleg\\Sparql.g:549:7: LCASE OPEN_BRACE expression CLOSE_BRACE
                    {
                    LCASE446=(Token)match(input,LCASE,FOLLOW_LCASE_in_builtInCall5311);  
                    stream_LCASE.add(LCASE446);

                    OPEN_BRACE447=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5313);  
                    stream_OPEN_BRACE.add(OPEN_BRACE447);

                    pushFollow(FOLLOW_expression_in_builtInCall5315);
                    expression448=expression();

                    state._fsp--;

                    stream_expression.add(expression448.getTree());
                    CLOSE_BRACE449=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5317);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE449);



                    // AST REWRITE
                    // elements: LCASE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 549:47: -> ^( LCASE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:549:50: ^( LCASE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LCASE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // com\\googlecode\\sparkleg\\Sparql.g:550:7: ENCODE_FOR_URI OPEN_BRACE expression CLOSE_BRACE
                    {
                    ENCODE_FOR_URI450=(Token)match(input,ENCODE_FOR_URI,FOLLOW_ENCODE_FOR_URI_in_builtInCall5333);  
                    stream_ENCODE_FOR_URI.add(ENCODE_FOR_URI450);

                    OPEN_BRACE451=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5335);  
                    stream_OPEN_BRACE.add(OPEN_BRACE451);

                    pushFollow(FOLLOW_expression_in_builtInCall5337);
                    expression452=expression();

                    state._fsp--;

                    stream_expression.add(expression452.getTree());
                    CLOSE_BRACE453=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5339);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE453);



                    // AST REWRITE
                    // elements: ENCODE_FOR_URI, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 550:56: -> ^( ENCODE_FOR_URI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:550:59: ^( ENCODE_FOR_URI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENCODE_FOR_URI.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // com\\googlecode\\sparkleg\\Sparql.g:551:7: CONTAINS OPEN_BRACE expression CLOSE_BRACE
                    {
                    CONTAINS454=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_builtInCall5355);  
                    stream_CONTAINS.add(CONTAINS454);

                    OPEN_BRACE455=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5357);  
                    stream_OPEN_BRACE.add(OPEN_BRACE455);

                    pushFollow(FOLLOW_expression_in_builtInCall5359);
                    expression456=expression();

                    state._fsp--;

                    stream_expression.add(expression456.getTree());
                    CLOSE_BRACE457=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5361);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE457);



                    // AST REWRITE
                    // elements: expression, CONTAINS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 551:50: -> ^( CONTAINS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:551:53: ^( CONTAINS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTAINS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // com\\googlecode\\sparkleg\\Sparql.g:552:7: STRSTARTS OPEN_BRACE expression CLOSE_BRACE
                    {
                    STRSTARTS458=(Token)match(input,STRSTARTS,FOLLOW_STRSTARTS_in_builtInCall5377);  
                    stream_STRSTARTS.add(STRSTARTS458);

                    OPEN_BRACE459=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5379);  
                    stream_OPEN_BRACE.add(OPEN_BRACE459);

                    pushFollow(FOLLOW_expression_in_builtInCall5381);
                    expression460=expression();

                    state._fsp--;

                    stream_expression.add(expression460.getTree());
                    CLOSE_BRACE461=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5383);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE461);



                    // AST REWRITE
                    // elements: STRSTARTS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 552:51: -> ^( STRSTARTS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:552:54: ^( STRSTARTS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STRSTARTS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // com\\googlecode\\sparkleg\\Sparql.g:553:7: STRENDS OPEN_BRACE expression CLOSE_BRACE
                    {
                    STRENDS462=(Token)match(input,STRENDS,FOLLOW_STRENDS_in_builtInCall5399);  
                    stream_STRENDS.add(STRENDS462);

                    OPEN_BRACE463=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5401);  
                    stream_OPEN_BRACE.add(OPEN_BRACE463);

                    pushFollow(FOLLOW_expression_in_builtInCall5403);
                    expression464=expression();

                    state._fsp--;

                    stream_expression.add(expression464.getTree());
                    CLOSE_BRACE465=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5405);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE465);



                    // AST REWRITE
                    // elements: STRENDS, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 553:49: -> ^( STRENDS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:553:52: ^( STRENDS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STRENDS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 23 :
                    // com\\googlecode\\sparkleg\\Sparql.g:554:7: YEAR OPEN_BRACE expression CLOSE_BRACE
                    {
                    YEAR466=(Token)match(input,YEAR,FOLLOW_YEAR_in_builtInCall5421);  
                    stream_YEAR.add(YEAR466);

                    OPEN_BRACE467=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5423);  
                    stream_OPEN_BRACE.add(OPEN_BRACE467);

                    pushFollow(FOLLOW_expression_in_builtInCall5425);
                    expression468=expression();

                    state._fsp--;

                    stream_expression.add(expression468.getTree());
                    CLOSE_BRACE469=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5427);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE469);



                    // AST REWRITE
                    // elements: YEAR, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 554:46: -> ^( YEAR expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:554:49: ^( YEAR expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_YEAR.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // com\\googlecode\\sparkleg\\Sparql.g:555:7: MONTH OPEN_BRACE expression CLOSE_BRACE
                    {
                    MONTH470=(Token)match(input,MONTH,FOLLOW_MONTH_in_builtInCall5443);  
                    stream_MONTH.add(MONTH470);

                    OPEN_BRACE471=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5445);  
                    stream_OPEN_BRACE.add(OPEN_BRACE471);

                    pushFollow(FOLLOW_expression_in_builtInCall5447);
                    expression472=expression();

                    state._fsp--;

                    stream_expression.add(expression472.getTree());
                    CLOSE_BRACE473=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5449);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE473);



                    // AST REWRITE
                    // elements: expression, MONTH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 555:47: -> ^( MONTH expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:555:50: ^( MONTH expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MONTH.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 25 :
                    // com\\googlecode\\sparkleg\\Sparql.g:556:7: DAY OPEN_BRACE expression CLOSE_BRACE
                    {
                    DAY474=(Token)match(input,DAY,FOLLOW_DAY_in_builtInCall5465);  
                    stream_DAY.add(DAY474);

                    OPEN_BRACE475=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5467);  
                    stream_OPEN_BRACE.add(OPEN_BRACE475);

                    pushFollow(FOLLOW_expression_in_builtInCall5469);
                    expression476=expression();

                    state._fsp--;

                    stream_expression.add(expression476.getTree());
                    CLOSE_BRACE477=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5471);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE477);



                    // AST REWRITE
                    // elements: expression, DAY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 556:45: -> ^( DAY expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:556:48: ^( DAY expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DAY.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // com\\googlecode\\sparkleg\\Sparql.g:557:7: HOURS OPEN_BRACE expression CLOSE_BRACE
                    {
                    HOURS478=(Token)match(input,HOURS,FOLLOW_HOURS_in_builtInCall5487);  
                    stream_HOURS.add(HOURS478);

                    OPEN_BRACE479=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5489);  
                    stream_OPEN_BRACE.add(OPEN_BRACE479);

                    pushFollow(FOLLOW_expression_in_builtInCall5491);
                    expression480=expression();

                    state._fsp--;

                    stream_expression.add(expression480.getTree());
                    CLOSE_BRACE481=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5493);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE481);



                    // AST REWRITE
                    // elements: expression, HOURS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 557:47: -> ^( HOURS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:557:50: ^( HOURS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_HOURS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 27 :
                    // com\\googlecode\\sparkleg\\Sparql.g:558:7: MINUTES OPEN_BRACE expression CLOSE_BRACE
                    {
                    MINUTES482=(Token)match(input,MINUTES,FOLLOW_MINUTES_in_builtInCall5509);  
                    stream_MINUTES.add(MINUTES482);

                    OPEN_BRACE483=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5511);  
                    stream_OPEN_BRACE.add(OPEN_BRACE483);

                    pushFollow(FOLLOW_expression_in_builtInCall5513);
                    expression484=expression();

                    state._fsp--;

                    stream_expression.add(expression484.getTree());
                    CLOSE_BRACE485=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5515);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE485);



                    // AST REWRITE
                    // elements: MINUTES, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 558:49: -> ^( MINUTES expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:558:52: ^( MINUTES expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MINUTES.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 28 :
                    // com\\googlecode\\sparkleg\\Sparql.g:559:7: SECONDS OPEN_BRACE expression CLOSE_BRACE
                    {
                    SECONDS486=(Token)match(input,SECONDS,FOLLOW_SECONDS_in_builtInCall5531);  
                    stream_SECONDS.add(SECONDS486);

                    OPEN_BRACE487=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5533);  
                    stream_OPEN_BRACE.add(OPEN_BRACE487);

                    pushFollow(FOLLOW_expression_in_builtInCall5535);
                    expression488=expression();

                    state._fsp--;

                    stream_expression.add(expression488.getTree());
                    CLOSE_BRACE489=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5537);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE489);



                    // AST REWRITE
                    // elements: expression, SECONDS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 559:49: -> ^( SECONDS expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:559:52: ^( SECONDS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SECONDS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 29 :
                    // com\\googlecode\\sparkleg\\Sparql.g:560:7: TIMEZONE OPEN_BRACE expression CLOSE_BRACE
                    {
                    TIMEZONE490=(Token)match(input,TIMEZONE,FOLLOW_TIMEZONE_in_builtInCall5553);  
                    stream_TIMEZONE.add(TIMEZONE490);

                    OPEN_BRACE491=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5555);  
                    stream_OPEN_BRACE.add(OPEN_BRACE491);

                    pushFollow(FOLLOW_expression_in_builtInCall5557);
                    expression492=expression();

                    state._fsp--;

                    stream_expression.add(expression492.getTree());
                    CLOSE_BRACE493=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5559);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE493);



                    // AST REWRITE
                    // elements: expression, TIMEZONE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 560:50: -> ^( TIMEZONE expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:560:53: ^( TIMEZONE expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_TIMEZONE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 30 :
                    // com\\googlecode\\sparkleg\\Sparql.g:561:7: TZ OPEN_BRACE expression CLOSE_BRACE
                    {
                    TZ494=(Token)match(input,TZ,FOLLOW_TZ_in_builtInCall5575);  
                    stream_TZ.add(TZ494);

                    OPEN_BRACE495=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5577);  
                    stream_OPEN_BRACE.add(OPEN_BRACE495);

                    pushFollow(FOLLOW_expression_in_builtInCall5579);
                    expression496=expression();

                    state._fsp--;

                    stream_expression.add(expression496.getTree());
                    CLOSE_BRACE497=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5581);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE497);



                    // AST REWRITE
                    // elements: expression, TZ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 561:44: -> ^( TZ expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:561:47: ^( TZ expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_TZ.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 31 :
                    // com\\googlecode\\sparkleg\\Sparql.g:562:7: NOW nil
                    {
                    NOW498=(Token)match(input,NOW,FOLLOW_NOW_in_builtInCall5597);  
                    stream_NOW.add(NOW498);

                    pushFollow(FOLLOW_nil_in_builtInCall5599);
                    nil499=nil();

                    state._fsp--;

                    stream_nil.add(nil499.getTree());


                    // AST REWRITE
                    // elements: NOW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 562:15: -> NOW
                    {
                        adaptor.addChild(root_0, stream_NOW.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 32 :
                    // com\\googlecode\\sparkleg\\Sparql.g:563:7: MD5 OPEN_BRACE expression CLOSE_BRACE
                    {
                    MD5500=(Token)match(input,MD5,FOLLOW_MD5_in_builtInCall5611);  
                    stream_MD5.add(MD5500);

                    OPEN_BRACE501=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5613);  
                    stream_OPEN_BRACE.add(OPEN_BRACE501);

                    pushFollow(FOLLOW_expression_in_builtInCall5615);
                    expression502=expression();

                    state._fsp--;

                    stream_expression.add(expression502.getTree());
                    CLOSE_BRACE503=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5617);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE503);



                    // AST REWRITE
                    // elements: expression, MD5
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 563:45: -> ^( MD5 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:563:48: ^( MD5 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MD5.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 33 :
                    // com\\googlecode\\sparkleg\\Sparql.g:564:7: SHA1 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA1504=(Token)match(input,SHA1,FOLLOW_SHA1_in_builtInCall5633);  
                    stream_SHA1.add(SHA1504);

                    OPEN_BRACE505=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5635);  
                    stream_OPEN_BRACE.add(OPEN_BRACE505);

                    pushFollow(FOLLOW_expression_in_builtInCall5637);
                    expression506=expression();

                    state._fsp--;

                    stream_expression.add(expression506.getTree());
                    CLOSE_BRACE507=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5639);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE507);



                    // AST REWRITE
                    // elements: SHA1, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 564:46: -> ^( SHA1 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:564:49: ^( SHA1 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SHA1.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 34 :
                    // com\\googlecode\\sparkleg\\Sparql.g:565:7: SHA224 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA224508=(Token)match(input,SHA224,FOLLOW_SHA224_in_builtInCall5655);  
                    stream_SHA224.add(SHA224508);

                    OPEN_BRACE509=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5657);  
                    stream_OPEN_BRACE.add(OPEN_BRACE509);

                    pushFollow(FOLLOW_expression_in_builtInCall5659);
                    expression510=expression();

                    state._fsp--;

                    stream_expression.add(expression510.getTree());
                    CLOSE_BRACE511=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5661);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE511);



                    // AST REWRITE
                    // elements: expression, SHA224
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 565:48: -> ^( SHA224 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:565:51: ^( SHA224 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SHA224.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 35 :
                    // com\\googlecode\\sparkleg\\Sparql.g:566:7: SHA256 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA256512=(Token)match(input,SHA256,FOLLOW_SHA256_in_builtInCall5677);  
                    stream_SHA256.add(SHA256512);

                    OPEN_BRACE513=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5679);  
                    stream_OPEN_BRACE.add(OPEN_BRACE513);

                    pushFollow(FOLLOW_expression_in_builtInCall5681);
                    expression514=expression();

                    state._fsp--;

                    stream_expression.add(expression514.getTree());
                    CLOSE_BRACE515=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5683);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE515);



                    // AST REWRITE
                    // elements: SHA256, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 566:48: -> ^( SHA256 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:566:51: ^( SHA256 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SHA256.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 36 :
                    // com\\googlecode\\sparkleg\\Sparql.g:567:7: SHA384 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA384516=(Token)match(input,SHA384,FOLLOW_SHA384_in_builtInCall5699);  
                    stream_SHA384.add(SHA384516);

                    OPEN_BRACE517=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5701);  
                    stream_OPEN_BRACE.add(OPEN_BRACE517);

                    pushFollow(FOLLOW_expression_in_builtInCall5703);
                    expression518=expression();

                    state._fsp--;

                    stream_expression.add(expression518.getTree());
                    CLOSE_BRACE519=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5705);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE519);



                    // AST REWRITE
                    // elements: expression, SHA384
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 567:48: -> ^( SHA384 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:567:51: ^( SHA384 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SHA384.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 37 :
                    // com\\googlecode\\sparkleg\\Sparql.g:568:7: SHA512 OPEN_BRACE expression CLOSE_BRACE
                    {
                    SHA512520=(Token)match(input,SHA512,FOLLOW_SHA512_in_builtInCall5721);  
                    stream_SHA512.add(SHA512520);

                    OPEN_BRACE521=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5723);  
                    stream_OPEN_BRACE.add(OPEN_BRACE521);

                    pushFollow(FOLLOW_expression_in_builtInCall5725);
                    expression522=expression();

                    state._fsp--;

                    stream_expression.add(expression522.getTree());
                    CLOSE_BRACE523=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5727);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE523);



                    // AST REWRITE
                    // elements: SHA512, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 568:48: -> ^( SHA512 expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:568:51: ^( SHA512 expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SHA512.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 38 :
                    // com\\googlecode\\sparkleg\\Sparql.g:569:7: COALESCE expressionList
                    {
                    COALESCE524=(Token)match(input,COALESCE,FOLLOW_COALESCE_in_builtInCall5743);  
                    stream_COALESCE.add(COALESCE524);

                    pushFollow(FOLLOW_expressionList_in_builtInCall5745);
                    expressionList525=expressionList();

                    state._fsp--;

                    stream_expressionList.add(expressionList525.getTree());


                    // AST REWRITE
                    // elements: COALESCE, expressionList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 569:31: -> ^( COALESCE expressionList )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:569:34: ^( COALESCE expressionList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COALESCE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expressionList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 39 :
                    // com\\googlecode\\sparkleg\\Sparql.g:570:7: IF OPEN_BRACE e1= expression COMMA e2= expression COMMA e3= expression CLOSE_BRACE
                    {
                    IF526=(Token)match(input,IF,FOLLOW_IF_in_builtInCall5761);  
                    stream_IF.add(IF526);

                    OPEN_BRACE527=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5763);  
                    stream_OPEN_BRACE.add(OPEN_BRACE527);

                    pushFollow(FOLLOW_expression_in_builtInCall5767);
                    e1=expression();

                    state._fsp--;

                    stream_expression.add(e1.getTree());
                    COMMA528=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5769);  
                    stream_COMMA.add(COMMA528);

                    pushFollow(FOLLOW_expression_in_builtInCall5773);
                    e2=expression();

                    state._fsp--;

                    stream_expression.add(e2.getTree());
                    COMMA529=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5775);  
                    stream_COMMA.add(COMMA529);

                    pushFollow(FOLLOW_expression_in_builtInCall5779);
                    e3=expression();

                    state._fsp--;

                    stream_expression.add(e3.getTree());
                    CLOSE_BRACE530=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5781);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE530);



                    // AST REWRITE
                    // elements: IF, e1, e3, e2
                    // token labels: 
                    // rule labels: e3, retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 570:87: -> ^( IF $e1 $e2 $e3)
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:570:90: ^( IF $e1 $e2 $e3)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());
                        adaptor.addChild(root_1, stream_e3.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 40 :
                    // com\\googlecode\\sparkleg\\Sparql.g:571:7: STRLANG OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRLANG531=(Token)match(input,STRLANG,FOLLOW_STRLANG_in_builtInCall5804);  
                    stream_STRLANG.add(STRLANG531);

                    OPEN_BRACE532=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5806);  
                    stream_OPEN_BRACE.add(OPEN_BRACE532);

                    pushFollow(FOLLOW_expression_in_builtInCall5808);
                    expression533=expression();

                    state._fsp--;

                    stream_expression.add(expression533.getTree());
                    COMMA534=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5810);  
                    stream_COMMA.add(COMMA534);

                    pushFollow(FOLLOW_expression_in_builtInCall5812);
                    expression535=expression();

                    state._fsp--;

                    stream_expression.add(expression535.getTree());
                    CLOSE_BRACE536=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5814);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE536);



                    // AST REWRITE
                    // elements: STRLANG, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 571:66: -> ^( STRLANG expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:571:69: ^( STRLANG expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STRLANG.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 41 :
                    // com\\googlecode\\sparkleg\\Sparql.g:572:7: STRDT OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    STRDT537=(Token)match(input,STRDT,FOLLOW_STRDT_in_builtInCall5832);  
                    stream_STRDT.add(STRDT537);

                    OPEN_BRACE538=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5834);  
                    stream_OPEN_BRACE.add(OPEN_BRACE538);

                    pushFollow(FOLLOW_expression_in_builtInCall5836);
                    expression539=expression();

                    state._fsp--;

                    stream_expression.add(expression539.getTree());
                    COMMA540=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5838);  
                    stream_COMMA.add(COMMA540);

                    pushFollow(FOLLOW_expression_in_builtInCall5840);
                    expression541=expression();

                    state._fsp--;

                    stream_expression.add(expression541.getTree());
                    CLOSE_BRACE542=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5842);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE542);



                    // AST REWRITE
                    // elements: STRDT, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 572:64: -> ^( STRDT expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:572:67: ^( STRDT expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_STRDT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 42 :
                    // com\\googlecode\\sparkleg\\Sparql.g:573:7: SAMETERM OPEN_BRACE expression COMMA expression CLOSE_BRACE
                    {
                    SAMETERM543=(Token)match(input,SAMETERM,FOLLOW_SAMETERM_in_builtInCall5860);  
                    stream_SAMETERM.add(SAMETERM543);

                    OPEN_BRACE544=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5862);  
                    stream_OPEN_BRACE.add(OPEN_BRACE544);

                    pushFollow(FOLLOW_expression_in_builtInCall5864);
                    expression545=expression();

                    state._fsp--;

                    stream_expression.add(expression545.getTree());
                    COMMA546=(Token)match(input,COMMA,FOLLOW_COMMA_in_builtInCall5866);  
                    stream_COMMA.add(COMMA546);

                    pushFollow(FOLLOW_expression_in_builtInCall5868);
                    expression547=expression();

                    state._fsp--;

                    stream_expression.add(expression547.getTree());
                    CLOSE_BRACE548=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5870);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE548);



                    // AST REWRITE
                    // elements: SAMETERM, expression, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 573:67: -> ^( SAMETERM expression expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:573:70: ^( SAMETERM expression expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAMETERM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 43 :
                    // com\\googlecode\\sparkleg\\Sparql.g:574:7: ISIRI OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISIRI549=(Token)match(input,ISIRI,FOLLOW_ISIRI_in_builtInCall5888);  
                    stream_ISIRI.add(ISIRI549);

                    OPEN_BRACE550=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5890);  
                    stream_OPEN_BRACE.add(OPEN_BRACE550);

                    pushFollow(FOLLOW_expression_in_builtInCall5892);
                    expression551=expression();

                    state._fsp--;

                    stream_expression.add(expression551.getTree());
                    CLOSE_BRACE552=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5894);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE552);



                    // AST REWRITE
                    // elements: expression, ISIRI
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 574:47: -> ^( ISIRI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:574:50: ^( ISIRI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ISIRI.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 44 :
                    // com\\googlecode\\sparkleg\\Sparql.g:575:7: ISURI OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISURI553=(Token)match(input,ISURI,FOLLOW_ISURI_in_builtInCall5910);  
                    stream_ISURI.add(ISURI553);

                    OPEN_BRACE554=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5912);  
                    stream_OPEN_BRACE.add(OPEN_BRACE554);

                    pushFollow(FOLLOW_expression_in_builtInCall5914);
                    expression555=expression();

                    state._fsp--;

                    stream_expression.add(expression555.getTree());
                    CLOSE_BRACE556=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5916);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE556);



                    // AST REWRITE
                    // elements: expression, ISURI
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 575:47: -> ^( ISURI expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:575:50: ^( ISURI expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ISURI.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 45 :
                    // com\\googlecode\\sparkleg\\Sparql.g:576:7: ISBLANK OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISBLANK557=(Token)match(input,ISBLANK,FOLLOW_ISBLANK_in_builtInCall5932);  
                    stream_ISBLANK.add(ISBLANK557);

                    OPEN_BRACE558=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5934);  
                    stream_OPEN_BRACE.add(OPEN_BRACE558);

                    pushFollow(FOLLOW_expression_in_builtInCall5936);
                    expression559=expression();

                    state._fsp--;

                    stream_expression.add(expression559.getTree());
                    CLOSE_BRACE560=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5938);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE560);



                    // AST REWRITE
                    // elements: ISBLANK, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 576:49: -> ^( ISBLANK expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:576:52: ^( ISBLANK expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ISBLANK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 46 :
                    // com\\googlecode\\sparkleg\\Sparql.g:577:7: ISLITERAL OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISLITERAL561=(Token)match(input,ISLITERAL,FOLLOW_ISLITERAL_in_builtInCall5955);  
                    stream_ISLITERAL.add(ISLITERAL561);

                    OPEN_BRACE562=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5957);  
                    stream_OPEN_BRACE.add(OPEN_BRACE562);

                    pushFollow(FOLLOW_expression_in_builtInCall5959);
                    expression563=expression();

                    state._fsp--;

                    stream_expression.add(expression563.getTree());
                    CLOSE_BRACE564=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5961);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE564);



                    // AST REWRITE
                    // elements: ISLITERAL, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 577:51: -> ^( ISLITERAL expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:577:54: ^( ISLITERAL expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ISLITERAL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 47 :
                    // com\\googlecode\\sparkleg\\Sparql.g:578:7: ISNUMERIC OPEN_BRACE expression CLOSE_BRACE
                    {
                    ISNUMERIC565=(Token)match(input,ISNUMERIC,FOLLOW_ISNUMERIC_in_builtInCall5977);  
                    stream_ISNUMERIC.add(ISNUMERIC565);

                    OPEN_BRACE566=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_builtInCall5979);  
                    stream_OPEN_BRACE.add(OPEN_BRACE566);

                    pushFollow(FOLLOW_expression_in_builtInCall5981);
                    expression567=expression();

                    state._fsp--;

                    stream_expression.add(expression567.getTree());
                    CLOSE_BRACE568=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_builtInCall5983);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE568);



                    // AST REWRITE
                    // elements: expression, ISNUMERIC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 578:51: -> ^( ISNUMERIC expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:578:54: ^( ISNUMERIC expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ISNUMERIC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 48 :
                    // com\\googlecode\\sparkleg\\Sparql.g:579:7: regexExpression
                    {
                    pushFollow(FOLLOW_regexExpression_in_builtInCall5999);
                    regexExpression569=regexExpression();

                    state._fsp--;

                    stream_regexExpression.add(regexExpression569.getTree());


                    // AST REWRITE
                    // elements: regexExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 579:23: -> regexExpression
                    {
                        adaptor.addChild(root_0, stream_regexExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 49 :
                    // com\\googlecode\\sparkleg\\Sparql.g:580:7: existsFunction
                    {
                    pushFollow(FOLLOW_existsFunction_in_builtInCall6011);
                    existsFunction570=existsFunction();

                    state._fsp--;

                    stream_existsFunction.add(existsFunction570.getTree());


                    // AST REWRITE
                    // elements: existsFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 580:22: -> existsFunction
                    {
                        adaptor.addChild(root_0, stream_existsFunction.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 50 :
                    // com\\googlecode\\sparkleg\\Sparql.g:581:7: notExistsFunction
                    {
                    pushFollow(FOLLOW_notExistsFunction_in_builtInCall6023);
                    notExistsFunction571=notExistsFunction();

                    state._fsp--;

                    stream_notExistsFunction.add(notExistsFunction571.getTree());


                    // AST REWRITE
                    // elements: notExistsFunction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 581:25: -> notExistsFunction
                    {
                        adaptor.addChild(root_0, stream_notExistsFunction.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "builtInCall"

    public static class regexExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "regexExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:584:1: regexExpression : REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( REGEX ( expression )* ) ;
    public final SparqlParser.regexExpression_return regexExpression() throws RecognitionException {
        SparqlParser.regexExpression_return retval = new SparqlParser.regexExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token REGEX572=null;
        Token OPEN_BRACE573=null;
        Token COMMA575=null;
        Token COMMA577=null;
        Token CLOSE_BRACE579=null;
        SparqlParser.expression_return expression574 = null;

        SparqlParser.expression_return expression576 = null;

        SparqlParser.expression_return expression578 = null;


        Object REGEX572_tree=null;
        Object OPEN_BRACE573_tree=null;
        Object COMMA575_tree=null;
        Object COMMA577_tree=null;
        Object CLOSE_BRACE579_tree=null;
        RewriteRuleTokenStream stream_REGEX=new RewriteRuleTokenStream(adaptor,"token REGEX");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:585:5: ( REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( REGEX ( expression )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:585:7: REGEX OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
            {
            REGEX572=(Token)match(input,REGEX,FOLLOW_REGEX_in_regexExpression6044);  
            stream_REGEX.add(REGEX572);

            OPEN_BRACE573=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_regexExpression6046);  
            stream_OPEN_BRACE.add(OPEN_BRACE573);

            pushFollow(FOLLOW_expression_in_regexExpression6048);
            expression574=expression();

            state._fsp--;

            stream_expression.add(expression574.getTree());
            COMMA575=(Token)match(input,COMMA,FOLLOW_COMMA_in_regexExpression6050);  
            stream_COMMA.add(COMMA575);

            pushFollow(FOLLOW_expression_in_regexExpression6052);
            expression576=expression();

            state._fsp--;

            stream_expression.add(expression576.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:585:52: ( COMMA expression )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==COMMA) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:585:53: COMMA expression
                    {
                    COMMA577=(Token)match(input,COMMA,FOLLOW_COMMA_in_regexExpression6055);  
                    stream_COMMA.add(COMMA577);

                    pushFollow(FOLLOW_expression_in_regexExpression6057);
                    expression578=expression();

                    state._fsp--;

                    stream_expression.add(expression578.getTree());

                    }
                    break;

            }

            CLOSE_BRACE579=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_regexExpression6061);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE579);



            // AST REWRITE
            // elements: expression, REGEX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 585:84: -> ^( REGEX ( expression )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:585:87: ^( REGEX ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_REGEX.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:585:95: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "regexExpression"

    public static class subStringExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subStringExpression"
    // com\\googlecode\\sparkleg\\Sparql.g:588:1: subStringExpression : SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( SUBSTR ( expression )* ) ;
    public final SparqlParser.subStringExpression_return subStringExpression() throws RecognitionException {
        SparqlParser.subStringExpression_return retval = new SparqlParser.subStringExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SUBSTR580=null;
        Token OPEN_BRACE581=null;
        Token COMMA583=null;
        Token COMMA585=null;
        Token CLOSE_BRACE587=null;
        SparqlParser.expression_return expression582 = null;

        SparqlParser.expression_return expression584 = null;

        SparqlParser.expression_return expression586 = null;


        Object SUBSTR580_tree=null;
        Object OPEN_BRACE581_tree=null;
        Object COMMA583_tree=null;
        Object COMMA585_tree=null;
        Object CLOSE_BRACE587_tree=null;
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_SUBSTR=new RewriteRuleTokenStream(adaptor,"token SUBSTR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:589:5: ( SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE -> ^( SUBSTR ( expression )* ) )
            // com\\googlecode\\sparkleg\\Sparql.g:589:7: SUBSTR OPEN_BRACE expression COMMA expression ( COMMA expression )? CLOSE_BRACE
            {
            SUBSTR580=(Token)match(input,SUBSTR,FOLLOW_SUBSTR_in_subStringExpression6091);  
            stream_SUBSTR.add(SUBSTR580);

            OPEN_BRACE581=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_subStringExpression6093);  
            stream_OPEN_BRACE.add(OPEN_BRACE581);

            pushFollow(FOLLOW_expression_in_subStringExpression6095);
            expression582=expression();

            state._fsp--;

            stream_expression.add(expression582.getTree());
            COMMA583=(Token)match(input,COMMA,FOLLOW_COMMA_in_subStringExpression6097);  
            stream_COMMA.add(COMMA583);

            pushFollow(FOLLOW_expression_in_subStringExpression6099);
            expression584=expression();

            state._fsp--;

            stream_expression.add(expression584.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:589:53: ( COMMA expression )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==COMMA) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:589:54: COMMA expression
                    {
                    COMMA585=(Token)match(input,COMMA,FOLLOW_COMMA_in_subStringExpression6102);  
                    stream_COMMA.add(COMMA585);

                    pushFollow(FOLLOW_expression_in_subStringExpression6104);
                    expression586=expression();

                    state._fsp--;

                    stream_expression.add(expression586.getTree());

                    }
                    break;

            }

            CLOSE_BRACE587=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_subStringExpression6108);  
            stream_CLOSE_BRACE.add(CLOSE_BRACE587);



            // AST REWRITE
            // elements: expression, SUBSTR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 589:85: -> ^( SUBSTR ( expression )* )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:589:88: ^( SUBSTR ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SUBSTR.nextNode(), root_1);

                // com\\googlecode\\sparkleg\\Sparql.g:589:97: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subStringExpression"

    public static class existsFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "existsFunction"
    // com\\googlecode\\sparkleg\\Sparql.g:592:1: existsFunction : EXISTS groupGraphPattern -> ^( EXISTS groupGraphPattern ) ;
    public final SparqlParser.existsFunction_return existsFunction() throws RecognitionException {
        SparqlParser.existsFunction_return retval = new SparqlParser.existsFunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXISTS588=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern589 = null;


        Object EXISTS588_tree=null;
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:593:5: ( EXISTS groupGraphPattern -> ^( EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:593:7: EXISTS groupGraphPattern
            {
            EXISTS588=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_existsFunction6138);  
            stream_EXISTS.add(EXISTS588);

            pushFollow(FOLLOW_groupGraphPattern_in_existsFunction6140);
            groupGraphPattern589=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern589.getTree());


            // AST REWRITE
            // elements: EXISTS, groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 593:32: -> ^( EXISTS groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:593:35: ^( EXISTS groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EXISTS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "existsFunction"

    public static class notExistsFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notExistsFunction"
    // com\\googlecode\\sparkleg\\Sparql.g:596:1: notExistsFunction : NOT EXISTS groupGraphPattern -> ^( NOT_EXISTS groupGraphPattern ) ;
    public final SparqlParser.notExistsFunction_return notExistsFunction() throws RecognitionException {
        SparqlParser.notExistsFunction_return retval = new SparqlParser.notExistsFunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT590=null;
        Token EXISTS591=null;
        SparqlParser.groupGraphPattern_return groupGraphPattern592 = null;


        Object NOT590_tree=null;
        Object EXISTS591_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleSubtreeStream stream_groupGraphPattern=new RewriteRuleSubtreeStream(adaptor,"rule groupGraphPattern");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:597:5: ( NOT EXISTS groupGraphPattern -> ^( NOT_EXISTS groupGraphPattern ) )
            // com\\googlecode\\sparkleg\\Sparql.g:597:7: NOT EXISTS groupGraphPattern
            {
            NOT590=(Token)match(input,NOT,FOLLOW_NOT_in_notExistsFunction6165);  
            stream_NOT.add(NOT590);

            EXISTS591=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_notExistsFunction6167);  
            stream_EXISTS.add(EXISTS591);

            pushFollow(FOLLOW_groupGraphPattern_in_notExistsFunction6169);
            groupGraphPattern592=groupGraphPattern();

            state._fsp--;

            stream_groupGraphPattern.add(groupGraphPattern592.getTree());


            // AST REWRITE
            // elements: groupGraphPattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 597:36: -> ^( NOT_EXISTS groupGraphPattern )
            {
                // com\\googlecode\\sparkleg\\Sparql.g:597:39: ^( NOT_EXISTS groupGraphPattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EXISTS, "NOT_EXISTS"), root_1);

                adaptor.addChild(root_1, stream_groupGraphPattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notExistsFunction"

    public static class aggregate_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aggregate"
    // com\\googlecode\\sparkleg\\Sparql.g:600:1: aggregate : ( COUNT OPEN_BRACE ( DISTINCT )? ( ASTERISK | expression ) CLOSE_BRACE -> ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | SUM OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SUM ( DISTINCT )* expression ) | MIN OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MIN ( DISTINCT )* expression ) | MAX OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MAX ( DISTINCT )* expression ) | AVG OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( AVG ( DISTINCT )* expression ) | SAMPLE OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SAMPLE ( DISTINCT )? expression ) | GROUP_CONCAT OPEN_BRACE ( DISTINCT )? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE -> ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* ) );
    public final SparqlParser.aggregate_return aggregate() throws RecognitionException {
        SparqlParser.aggregate_return retval = new SparqlParser.aggregate_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COUNT593=null;
        Token OPEN_BRACE594=null;
        Token DISTINCT595=null;
        Token ASTERISK596=null;
        Token CLOSE_BRACE598=null;
        Token SUM599=null;
        Token OPEN_BRACE600=null;
        Token DISTINCT601=null;
        Token CLOSE_BRACE603=null;
        Token MIN604=null;
        Token OPEN_BRACE605=null;
        Token DISTINCT606=null;
        Token CLOSE_BRACE608=null;
        Token MAX609=null;
        Token OPEN_BRACE610=null;
        Token DISTINCT611=null;
        Token CLOSE_BRACE613=null;
        Token AVG614=null;
        Token OPEN_BRACE615=null;
        Token DISTINCT616=null;
        Token CLOSE_BRACE618=null;
        Token SAMPLE619=null;
        Token OPEN_BRACE620=null;
        Token DISTINCT621=null;
        Token CLOSE_BRACE623=null;
        Token GROUP_CONCAT624=null;
        Token OPEN_BRACE625=null;
        Token DISTINCT626=null;
        Token SEMICOLON628=null;
        Token SEPARATOR629=null;
        Token EQUAL630=null;
        Token CLOSE_BRACE632=null;
        SparqlParser.expression_return expression597 = null;

        SparqlParser.expression_return expression602 = null;

        SparqlParser.expression_return expression607 = null;

        SparqlParser.expression_return expression612 = null;

        SparqlParser.expression_return expression617 = null;

        SparqlParser.expression_return expression622 = null;

        SparqlParser.expression_return expression627 = null;

        SparqlParser.string_return string631 = null;


        Object COUNT593_tree=null;
        Object OPEN_BRACE594_tree=null;
        Object DISTINCT595_tree=null;
        Object ASTERISK596_tree=null;
        Object CLOSE_BRACE598_tree=null;
        Object SUM599_tree=null;
        Object OPEN_BRACE600_tree=null;
        Object DISTINCT601_tree=null;
        Object CLOSE_BRACE603_tree=null;
        Object MIN604_tree=null;
        Object OPEN_BRACE605_tree=null;
        Object DISTINCT606_tree=null;
        Object CLOSE_BRACE608_tree=null;
        Object MAX609_tree=null;
        Object OPEN_BRACE610_tree=null;
        Object DISTINCT611_tree=null;
        Object CLOSE_BRACE613_tree=null;
        Object AVG614_tree=null;
        Object OPEN_BRACE615_tree=null;
        Object DISTINCT616_tree=null;
        Object CLOSE_BRACE618_tree=null;
        Object SAMPLE619_tree=null;
        Object OPEN_BRACE620_tree=null;
        Object DISTINCT621_tree=null;
        Object CLOSE_BRACE623_tree=null;
        Object GROUP_CONCAT624_tree=null;
        Object OPEN_BRACE625_tree=null;
        Object DISTINCT626_tree=null;
        Object SEMICOLON628_tree=null;
        Object SEPARATOR629_tree=null;
        Object EQUAL630_tree=null;
        Object CLOSE_BRACE632_tree=null;
        RewriteRuleTokenStream stream_SAMPLE=new RewriteRuleTokenStream(adaptor,"token SAMPLE");
        RewriteRuleTokenStream stream_AVG=new RewriteRuleTokenStream(adaptor,"token AVG");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_GROUP_CONCAT=new RewriteRuleTokenStream(adaptor,"token GROUP_CONCAT");
        RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_SEPARATOR=new RewriteRuleTokenStream(adaptor,"token SEPARATOR");
        RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
        RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
        RewriteRuleTokenStream stream_SUM=new RewriteRuleTokenStream(adaptor,"token SUM");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_string=new RewriteRuleSubtreeStream(adaptor,"rule string");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:601:5: ( COUNT OPEN_BRACE ( DISTINCT )? ( ASTERISK | expression ) CLOSE_BRACE -> ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* ) | SUM OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SUM ( DISTINCT )* expression ) | MIN OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MIN ( DISTINCT )* expression ) | MAX OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( MAX ( DISTINCT )* expression ) | AVG OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( AVG ( DISTINCT )* expression ) | SAMPLE OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE -> ^( SAMPLE ( DISTINCT )? expression ) | GROUP_CONCAT OPEN_BRACE ( DISTINCT )? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE -> ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* ) )
            int alt137=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt137=1;
                }
                break;
            case SUM:
                {
                alt137=2;
                }
                break;
            case MIN:
                {
                alt137=3;
                }
                break;
            case MAX:
                {
                alt137=4;
                }
                break;
            case AVG:
                {
                alt137=5;
                }
                break;
            case SAMPLE:
                {
                alt137=6;
                }
                break;
            case GROUP_CONCAT:
                {
                alt137=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:601:7: COUNT OPEN_BRACE ( DISTINCT )? ( ASTERISK | expression ) CLOSE_BRACE
                    {
                    COUNT593=(Token)match(input,COUNT,FOLLOW_COUNT_in_aggregate6194);  
                    stream_COUNT.add(COUNT593);

                    OPEN_BRACE594=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6196);  
                    stream_OPEN_BRACE.add(OPEN_BRACE594);

                    // com\\googlecode\\sparkleg\\Sparql.g:601:24: ( DISTINCT )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==DISTINCT) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:601:24: DISTINCT
                            {
                            DISTINCT595=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6198);  
                            stream_DISTINCT.add(DISTINCT595);


                            }
                            break;

                    }

                    // com\\googlecode\\sparkleg\\Sparql.g:601:34: ( ASTERISK | expression )
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==ASTERISK) ) {
                        alt129=1;
                    }
                    else if ( (LA129_0==IRI_REF||LA129_0==PNAME_NS||LA129_0==OPEN_BRACE||LA129_0==INTEGER||(LA129_0>=PLUS && LA129_0<=NEGATION)||(LA129_0>=VAR1 && LA129_0<=VAR2)||(LA129_0>=NOT && LA129_0<=GROUP_CONCAT)||(LA129_0>=DECIMAL && LA129_0<=PNAME_LN)) ) {
                        alt129=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 129, 0, input);

                        throw nvae;
                    }
                    switch (alt129) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:601:35: ASTERISK
                            {
                            ASTERISK596=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_aggregate6202);  
                            stream_ASTERISK.add(ASTERISK596);


                            }
                            break;
                        case 2 :
                            // com\\googlecode\\sparkleg\\Sparql.g:601:46: expression
                            {
                            pushFollow(FOLLOW_expression_in_aggregate6206);
                            expression597=expression();

                            state._fsp--;

                            stream_expression.add(expression597.getTree());

                            }
                            break;

                    }

                    CLOSE_BRACE598=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6209);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE598);



                    // AST REWRITE
                    // elements: expression, ASTERISK, DISTINCT, COUNT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 601:70: -> ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:601:73: ^( COUNT ( DISTINCT )* ( ASTERISK )* ( expression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_COUNT.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:601:81: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:601:91: ( ASTERISK )*
                        while ( stream_ASTERISK.hasNext() ) {
                            adaptor.addChild(root_1, stream_ASTERISK.nextNode());

                        }
                        stream_ASTERISK.reset();
                        // com\\googlecode\\sparkleg\\Sparql.g:601:101: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:602:7: SUM OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    SUM599=(Token)match(input,SUM,FOLLOW_SUM_in_aggregate6232);  
                    stream_SUM.add(SUM599);

                    OPEN_BRACE600=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6234);  
                    stream_OPEN_BRACE.add(OPEN_BRACE600);

                    // com\\googlecode\\sparkleg\\Sparql.g:602:22: ( DISTINCT )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==DISTINCT) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:602:22: DISTINCT
                            {
                            DISTINCT601=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6236);  
                            stream_DISTINCT.add(DISTINCT601);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_aggregate6239);
                    expression602=expression();

                    state._fsp--;

                    stream_expression.add(expression602.getTree());
                    CLOSE_BRACE603=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6241);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE603);



                    // AST REWRITE
                    // elements: expression, SUM, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 602:55: -> ^( SUM ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:602:58: ^( SUM ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SUM.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:602:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:603:7: MIN OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    MIN604=(Token)match(input,MIN,FOLLOW_MIN_in_aggregate6260);  
                    stream_MIN.add(MIN604);

                    OPEN_BRACE605=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6262);  
                    stream_OPEN_BRACE.add(OPEN_BRACE605);

                    // com\\googlecode\\sparkleg\\Sparql.g:603:22: ( DISTINCT )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==DISTINCT) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:603:22: DISTINCT
                            {
                            DISTINCT606=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6264);  
                            stream_DISTINCT.add(DISTINCT606);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_aggregate6267);
                    expression607=expression();

                    state._fsp--;

                    stream_expression.add(expression607.getTree());
                    CLOSE_BRACE608=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6269);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE608);



                    // AST REWRITE
                    // elements: MIN, expression, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 603:55: -> ^( MIN ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:603:58: ^( MIN ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MIN.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:603:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // com\\googlecode\\sparkleg\\Sparql.g:604:7: MAX OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    MAX609=(Token)match(input,MAX,FOLLOW_MAX_in_aggregate6288);  
                    stream_MAX.add(MAX609);

                    OPEN_BRACE610=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6290);  
                    stream_OPEN_BRACE.add(OPEN_BRACE610);

                    // com\\googlecode\\sparkleg\\Sparql.g:604:22: ( DISTINCT )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==DISTINCT) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:604:22: DISTINCT
                            {
                            DISTINCT611=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6292);  
                            stream_DISTINCT.add(DISTINCT611);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_aggregate6295);
                    expression612=expression();

                    state._fsp--;

                    stream_expression.add(expression612.getTree());
                    CLOSE_BRACE613=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6297);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE613);



                    // AST REWRITE
                    // elements: expression, MAX, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 604:55: -> ^( MAX ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:604:58: ^( MAX ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_MAX.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:604:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // com\\googlecode\\sparkleg\\Sparql.g:605:7: AVG OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    AVG614=(Token)match(input,AVG,FOLLOW_AVG_in_aggregate6316);  
                    stream_AVG.add(AVG614);

                    OPEN_BRACE615=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6318);  
                    stream_OPEN_BRACE.add(OPEN_BRACE615);

                    // com\\googlecode\\sparkleg\\Sparql.g:605:22: ( DISTINCT )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==DISTINCT) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:605:22: DISTINCT
                            {
                            DISTINCT616=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6320);  
                            stream_DISTINCT.add(DISTINCT616);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_aggregate6323);
                    expression617=expression();

                    state._fsp--;

                    stream_expression.add(expression617.getTree());
                    CLOSE_BRACE618=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6325);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE618);



                    // AST REWRITE
                    // elements: expression, DISTINCT, AVG
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 605:55: -> ^( AVG ( DISTINCT )* expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:605:58: ^( AVG ( DISTINCT )* expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_AVG.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:605:64: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // com\\googlecode\\sparkleg\\Sparql.g:606:7: SAMPLE OPEN_BRACE ( DISTINCT )? expression CLOSE_BRACE
                    {
                    SAMPLE619=(Token)match(input,SAMPLE,FOLLOW_SAMPLE_in_aggregate6344);  
                    stream_SAMPLE.add(SAMPLE619);

                    OPEN_BRACE620=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6346);  
                    stream_OPEN_BRACE.add(OPEN_BRACE620);

                    // com\\googlecode\\sparkleg\\Sparql.g:606:25: ( DISTINCT )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==DISTINCT) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:606:25: DISTINCT
                            {
                            DISTINCT621=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6348);  
                            stream_DISTINCT.add(DISTINCT621);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_aggregate6351);
                    expression622=expression();

                    state._fsp--;

                    stream_expression.add(expression622.getTree());
                    CLOSE_BRACE623=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6353);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE623);



                    // AST REWRITE
                    // elements: DISTINCT, SAMPLE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 606:58: -> ^( SAMPLE ( DISTINCT )? expression )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:606:61: ^( SAMPLE ( DISTINCT )? expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_SAMPLE.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:606:70: ( DISTINCT )?
                        if ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // com\\googlecode\\sparkleg\\Sparql.g:607:7: GROUP_CONCAT OPEN_BRACE ( DISTINCT )? expression ( SEMICOLON SEPARATOR EQUAL string )? CLOSE_BRACE
                    {
                    GROUP_CONCAT624=(Token)match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregate6372);  
                    stream_GROUP_CONCAT.add(GROUP_CONCAT624);

                    OPEN_BRACE625=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_aggregate6374);  
                    stream_OPEN_BRACE.add(OPEN_BRACE625);

                    // com\\googlecode\\sparkleg\\Sparql.g:607:31: ( DISTINCT )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==DISTINCT) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:607:31: DISTINCT
                            {
                            DISTINCT626=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregate6376);  
                            stream_DISTINCT.add(DISTINCT626);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_aggregate6379);
                    expression627=expression();

                    state._fsp--;

                    stream_expression.add(expression627.getTree());
                    // com\\googlecode\\sparkleg\\Sparql.g:607:52: ( SEMICOLON SEPARATOR EQUAL string )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==SEMICOLON) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // com\\googlecode\\sparkleg\\Sparql.g:607:53: SEMICOLON SEPARATOR EQUAL string
                            {
                            SEMICOLON628=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_aggregate6382);  
                            stream_SEMICOLON.add(SEMICOLON628);

                            SEPARATOR629=(Token)match(input,SEPARATOR,FOLLOW_SEPARATOR_in_aggregate6384);  
                            stream_SEPARATOR.add(SEPARATOR629);

                            EQUAL630=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_aggregate6386);  
                            stream_EQUAL.add(EQUAL630);

                            pushFollow(FOLLOW_string_in_aggregate6388);
                            string631=string();

                            state._fsp--;

                            stream_string.add(string631.getTree());

                            }
                            break;

                    }

                    CLOSE_BRACE632=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_aggregate6392);  
                    stream_CLOSE_BRACE.add(CLOSE_BRACE632);



                    // AST REWRITE
                    // elements: expression, GROUP_CONCAT, string, DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 607:100: -> ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:607:103: ^( GROUP_CONCAT ( DISTINCT )* expression ( string )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_GROUP_CONCAT.nextNode(), root_1);

                        // com\\googlecode\\sparkleg\\Sparql.g:607:118: ( DISTINCT )*
                        while ( stream_DISTINCT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DISTINCT.nextNode());

                        }
                        stream_DISTINCT.reset();
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:607:139: ( string )*
                        while ( stream_string.hasNext() ) {
                            adaptor.addChild(root_1, stream_string.nextTree());

                        }
                        stream_string.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aggregate"

    public static class iriRefOrFunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iriRefOrFunction"
    // com\\googlecode\\sparkleg\\Sparql.g:610:1: iriRefOrFunction : ( iriRef | iriRef argList -> ^( FUNCTION iriRef ^( ARG_LIST argList ) ) );
    public final SparqlParser.iriRefOrFunction_return iriRefOrFunction() throws RecognitionException {
        SparqlParser.iriRefOrFunction_return retval = new SparqlParser.iriRefOrFunction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.iriRef_return iriRef633 = null;

        SparqlParser.iriRef_return iriRef634 = null;

        SparqlParser.argList_return argList635 = null;


        RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");
        RewriteRuleSubtreeStream stream_iriRef=new RewriteRuleSubtreeStream(adaptor,"rule iriRef");
        try {
            // com\\googlecode\\sparkleg\\Sparql.g:611:5: ( iriRef | iriRef argList -> ^( FUNCTION iriRef ^( ARG_LIST argList ) ) )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==IRI_REF) ) {
                int LA138_1 = input.LA(2);

                if ( (LA138_1==OPEN_BRACE) ) {
                    alt138=2;
                }
                else if ( (LA138_1==SEMICOLON||LA138_1==ASTERISK||(LA138_1>=AS && LA138_1<=CLOSE_BRACE)||LA138_1==COMMA||LA138_1==DIVIDE||LA138_1==PLUS||(LA138_1>=OR && LA138_1<=MINUS)||(LA138_1>=INTEGER_POSITIVE && LA138_1<=DOUBLE_NEGATIVE)) ) {
                    alt138=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA138_0==PNAME_NS||LA138_0==PNAME_LN) ) {
                int LA138_2 = input.LA(2);

                if ( (LA138_2==OPEN_BRACE) ) {
                    alt138=2;
                }
                else if ( (LA138_2==SEMICOLON||LA138_2==ASTERISK||(LA138_2>=AS && LA138_2<=CLOSE_BRACE)||LA138_2==COMMA||LA138_2==DIVIDE||LA138_2==PLUS||(LA138_2>=OR && LA138_2<=MINUS)||(LA138_2>=INTEGER_POSITIVE && LA138_2<=DOUBLE_NEGATIVE)) ) {
                    alt138=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:611:7: iriRef
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction6427);
                    iriRef633=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef633.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:612:7: iriRef argList
                    {
                    pushFollow(FOLLOW_iriRef_in_iriRefOrFunction6436);
                    iriRef634=iriRef();

                    state._fsp--;

                    stream_iriRef.add(iriRef634.getTree());
                    pushFollow(FOLLOW_argList_in_iriRefOrFunction6438);
                    argList635=argList();

                    state._fsp--;

                    stream_argList.add(argList635.getTree());


                    // AST REWRITE
                    // elements: iriRef, argList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 612:22: -> ^( FUNCTION iriRef ^( ARG_LIST argList ) )
                    {
                        // com\\googlecode\\sparkleg\\Sparql.g:612:25: ^( FUNCTION iriRef ^( ARG_LIST argList ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_iriRef.nextTree());
                        // com\\googlecode\\sparkleg\\Sparql.g:612:43: ^( ARG_LIST argList )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_2);

                        adaptor.addChild(root_2, stream_argList.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iriRefOrFunction"

    public static class rdfLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rdfLiteral"
    // com\\googlecode\\sparkleg\\Sparql.g:615:1: rdfLiteral : string ( LANGTAG | ( REFERENCE iriRef ) )? ;
    public final SparqlParser.rdfLiteral_return rdfLiteral() throws RecognitionException {
        SparqlParser.rdfLiteral_return retval = new SparqlParser.rdfLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LANGTAG637=null;
        Token REFERENCE638=null;
        SparqlParser.string_return string636 = null;

        SparqlParser.iriRef_return iriRef639 = null;


        Object LANGTAG637_tree=null;
        Object REFERENCE638_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:616:5: ( string ( LANGTAG | ( REFERENCE iriRef ) )? )
            // com\\googlecode\\sparkleg\\Sparql.g:616:7: string ( LANGTAG | ( REFERENCE iriRef ) )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_string_in_rdfLiteral6469);
            string636=string();

            state._fsp--;

            adaptor.addChild(root_0, string636.getTree());
            // com\\googlecode\\sparkleg\\Sparql.g:616:14: ( LANGTAG | ( REFERENCE iriRef ) )?
            int alt139=3;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LANGTAG) ) {
                alt139=1;
            }
            else if ( (LA139_0==REFERENCE) ) {
                alt139=2;
            }
            switch (alt139) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:616:15: LANGTAG
                    {
                    LANGTAG637=(Token)match(input,LANGTAG,FOLLOW_LANGTAG_in_rdfLiteral6472); 
                    LANGTAG637_tree = (Object)adaptor.create(LANGTAG637);
                    adaptor.addChild(root_0, LANGTAG637_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:616:25: ( REFERENCE iriRef )
                    {
                    // com\\googlecode\\sparkleg\\Sparql.g:616:25: ( REFERENCE iriRef )
                    // com\\googlecode\\sparkleg\\Sparql.g:616:26: REFERENCE iriRef
                    {
                    REFERENCE638=(Token)match(input,REFERENCE,FOLLOW_REFERENCE_in_rdfLiteral6477); 
                    REFERENCE638_tree = (Object)adaptor.create(REFERENCE638);
                    adaptor.addChild(root_0, REFERENCE638_tree);

                    pushFollow(FOLLOW_iriRef_in_rdfLiteral6479);
                    iriRef639=iriRef();

                    state._fsp--;

                    adaptor.addChild(root_0, iriRef639.getTree());

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rdfLiteral"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // com\\googlecode\\sparkleg\\Sparql.g:619:1: numericLiteral : ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative );
    public final SparqlParser.numericLiteral_return numericLiteral() throws RecognitionException {
        SparqlParser.numericLiteral_return retval = new SparqlParser.numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        SparqlParser.numericLiteralUnsigned_return numericLiteralUnsigned640 = null;

        SparqlParser.numericLiteralPositive_return numericLiteralPositive641 = null;

        SparqlParser.numericLiteralNegative_return numericLiteralNegative642 = null;



        try {
            // com\\googlecode\\sparkleg\\Sparql.g:620:5: ( numericLiteralUnsigned | numericLiteralPositive | numericLiteralNegative )
            int alt140=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case DECIMAL:
            case DOUBLE:
                {
                alt140=1;
                }
                break;
            case INTEGER_POSITIVE:
            case DECIMAL_POSITIVE:
            case DOUBLE_POSITIVE:
                {
                alt140=2;
                }
                break;
            case INTEGER_NEGATIVE:
            case DECIMAL_NEGATIVE:
            case DOUBLE_NEGATIVE:
                {
                alt140=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:620:7: numericLiteralUnsigned
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralUnsigned_in_numericLiteral6499);
                    numericLiteralUnsigned640=numericLiteralUnsigned();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralUnsigned640.getTree());

                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:621:7: numericLiteralPositive
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralPositive_in_numericLiteral6507);
                    numericLiteralPositive641=numericLiteralPositive();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralPositive641.getTree());

                    }
                    break;
                case 3 :
                    // com\\googlecode\\sparkleg\\Sparql.g:622:7: numericLiteralNegative
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteralNegative_in_numericLiteral6515);
                    numericLiteralNegative642=numericLiteralNegative();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteralNegative642.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class numericLiteralUnsigned_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralUnsigned"
    // com\\googlecode\\sparkleg\\Sparql.g:625:1: numericLiteralUnsigned : ( INTEGER | DECIMAL | DOUBLE );
    public final SparqlParser.numericLiteralUnsigned_return numericLiteralUnsigned() throws RecognitionException {
        SparqlParser.numericLiteralUnsigned_return retval = new SparqlParser.numericLiteralUnsigned_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set643=null;

        Object set643_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:626:5: ( INTEGER | DECIMAL | DOUBLE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set643=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||(input.LA(1)>=DECIMAL && input.LA(1)<=DOUBLE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set643));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralUnsigned"

    public static class numericLiteralPositive_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralPositive"
    // com\\googlecode\\sparkleg\\Sparql.g:631:1: numericLiteralPositive : ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE );
    public final SparqlParser.numericLiteralPositive_return numericLiteralPositive() throws RecognitionException {
        SparqlParser.numericLiteralPositive_return retval = new SparqlParser.numericLiteralPositive_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set644=null;

        Object set644_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:632:5: ( INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set644=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER_POSITIVE && input.LA(1)<=DOUBLE_POSITIVE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set644));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralPositive"

    public static class numericLiteralNegative_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteralNegative"
    // com\\googlecode\\sparkleg\\Sparql.g:637:1: numericLiteralNegative : ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE );
    public final SparqlParser.numericLiteralNegative_return numericLiteralNegative() throws RecognitionException {
        SparqlParser.numericLiteralNegative_return retval = new SparqlParser.numericLiteralNegative_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set645=null;

        Object set645_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:638:5: ( INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set645=(Token)input.LT(1);
            if ( (input.LA(1)>=INTEGER_NEGATIVE && input.LA(1)<=DOUBLE_NEGATIVE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set645));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteralNegative"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // com\\googlecode\\sparkleg\\Sparql.g:643:1: booleanLiteral : ( TRUE | FALSE );
    public final SparqlParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        SparqlParser.booleanLiteral_return retval = new SparqlParser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set646=null;

        Object set646_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:644:5: ( TRUE | FALSE )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set646=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set646));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // com\\googlecode\\sparkleg\\Sparql.g:648:1: string : ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 );
    public final SparqlParser.string_return string() throws RecognitionException {
        SparqlParser.string_return retval = new SparqlParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set647=null;

        Object set647_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:649:5: ( STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set647=(Token)input.LT(1);
            if ( (input.LA(1)>=STRING_LITERAL1 && input.LA(1)<=STRING_LITERAL_LONG2) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set647));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class iriRef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iriRef"
    // com\\googlecode\\sparkleg\\Sparql.g:655:1: iriRef : ( IRI_REF | prefixedName );
    public final SparqlParser.iriRef_return iriRef() throws RecognitionException {
        SparqlParser.iriRef_return retval = new SparqlParser.iriRef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IRI_REF648=null;
        SparqlParser.prefixedName_return prefixedName649 = null;


        Object IRI_REF648_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:656:5: ( IRI_REF | prefixedName )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==IRI_REF) ) {
                alt141=1;
            }
            else if ( (LA141_0==PNAME_NS||LA141_0==PNAME_LN) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:656:7: IRI_REF
                    {
                    root_0 = (Object)adaptor.nil();

                    IRI_REF648=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_iriRef6698); 
                    IRI_REF648_tree = (Object)adaptor.create(IRI_REF648);
                    adaptor.addChild(root_0, IRI_REF648_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:657:7: prefixedName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_prefixedName_in_iriRef6706);
                    prefixedName649=prefixedName();

                    state._fsp--;

                    adaptor.addChild(root_0, prefixedName649.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iriRef"

    public static class prefixedName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixedName"
    // com\\googlecode\\sparkleg\\Sparql.g:660:1: prefixedName : ( PNAME_LN | PNAME_NS );
    public final SparqlParser.prefixedName_return prefixedName() throws RecognitionException {
        SparqlParser.prefixedName_return retval = new SparqlParser.prefixedName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set650=null;

        Object set650_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:661:5: ( PNAME_LN | PNAME_NS )
            // com\\googlecode\\sparkleg\\Sparql.g:
            {
            root_0 = (Object)adaptor.nil();

            set650=(Token)input.LT(1);
            if ( input.LA(1)==PNAME_NS||input.LA(1)==PNAME_LN ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set650));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefixedName"

    public static class blankNode_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blankNode"
    // com\\googlecode\\sparkleg\\Sparql.g:665:1: blankNode : ( BLANK_NODE_LABEL | anon );
    public final SparqlParser.blankNode_return blankNode() throws RecognitionException {
        SparqlParser.blankNode_return retval = new SparqlParser.blankNode_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BLANK_NODE_LABEL651=null;
        SparqlParser.anon_return anon652 = null;


        Object BLANK_NODE_LABEL651_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:666:5: ( BLANK_NODE_LABEL | anon )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==BLANK_NODE_LABEL) ) {
                alt142=1;
            }
            else if ( (LA142_0==OPEN_SQUARE_BRACKET) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // com\\googlecode\\sparkleg\\Sparql.g:666:7: BLANK_NODE_LABEL
                    {
                    root_0 = (Object)adaptor.nil();

                    BLANK_NODE_LABEL651=(Token)match(input,BLANK_NODE_LABEL,FOLLOW_BLANK_NODE_LABEL_in_blankNode6748); 
                    BLANK_NODE_LABEL651_tree = (Object)adaptor.create(BLANK_NODE_LABEL651);
                    adaptor.addChild(root_0, BLANK_NODE_LABEL651_tree);


                    }
                    break;
                case 2 :
                    // com\\googlecode\\sparkleg\\Sparql.g:667:7: anon
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_anon_in_blankNode6756);
                    anon652=anon();

                    state._fsp--;

                    adaptor.addChild(root_0, anon652.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blankNode"

    public static class anon_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anon"
    // com\\googlecode\\sparkleg\\Sparql.g:670:1: anon : OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET ;
    public final SparqlParser.anon_return anon() throws RecognitionException {
        SparqlParser.anon_return retval = new SparqlParser.anon_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_SQUARE_BRACKET653=null;
        Token CLOSE_SQUARE_BRACKET654=null;

        Object OPEN_SQUARE_BRACKET653_tree=null;
        Object CLOSE_SQUARE_BRACKET654_tree=null;

        try {
            // com\\googlecode\\sparkleg\\Sparql.g:671:5: ( OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET )
            // com\\googlecode\\sparkleg\\Sparql.g:671:7: OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
            {
            root_0 = (Object)adaptor.nil();

            OPEN_SQUARE_BRACKET653=(Token)match(input,OPEN_SQUARE_BRACKET,FOLLOW_OPEN_SQUARE_BRACKET_in_anon6773); 
            OPEN_SQUARE_BRACKET653_tree = (Object)adaptor.create(OPEN_SQUARE_BRACKET653);
            adaptor.addChild(root_0, OPEN_SQUARE_BRACKET653_tree);

            CLOSE_SQUARE_BRACKET654=(Token)match(input,CLOSE_SQUARE_BRACKET,FOLLOW_CLOSE_SQUARE_BRACKET_in_anon6775); 
            CLOSE_SQUARE_BRACKET654_tree = (Object)adaptor.create(CLOSE_SQUARE_BRACKET654);
            adaptor.addChild(root_0, CLOSE_SQUARE_BRACKET654_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anon"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA3_eotS =
        "\10\uffff";
    static final String DFA3_eofS =
        "\10\uffff";
    static final String DFA3_minS =
        "\1\50\1\51\1\53\2\uffff\1\50\1\51\1\50";
    static final String DFA3_maxS =
        "\1\123\1\51\1\53\2\uffff\1\123\1\51\1\123";
    static final String DFA3_acceptS =
        "\3\uffff\1\1\1\2\3\uffff";
    static final String DFA3_specialS =
        "\10\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\6\uffff\1\3\3\uffff\2\3\15\uffff"+
            "\1\4\2\uffff\4\4\1\uffff\3\4\1\uffff\2\4",
            "\1\5",
            "\1\6",
            "",
            "",
            "\1\1\1\uffff\1\2\1\uffff\1\3\6\uffff\1\3\3\uffff\2\3\15\uffff"+
            "\1\4\2\uffff\4\4\1\uffff\3\4\1\uffff\2\4",
            "\1\7",
            "\1\1\1\uffff\1\2\1\uffff\1\3\6\uffff\1\3\3\uffff\2\3\15\uffff"+
            "\1\4\2\uffff\4\4\1\uffff\3\4\1\uffff\2\4"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "77:1: query : ( prologue ( selectQuery | constructQuery | describeQuery | askQuery ) bindingsClause EOF -> ^( QUERY prologue ( selectQuery )* ( constructQuery )* ( describeQuery )* ( askQuery )* ) ( bindingsClause )* | update ( SEMICOLON update )* EOF -> ^( UPDATE ( update )+ ) );";
        }
    }
    static final String DFA40_eotS =
        "\15\uffff";
    static final String DFA40_eofS =
        "\15\uffff";
    static final String DFA40_minS =
        "\1\106\7\uffff\1\65\1\64\3\uffff";
    static final String DFA40_maxS =
        "\1\123\7\uffff\2\121\3\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\1\10\1\11";
    static final String DFA40_specialS =
        "\15\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\1\2\uffff\1\2\1\3\1\7\1\4\1\uffff\1\5\1\6\1\10\1\uffff\1"+
            "\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\33\uffff\1\13",
            "\1\14\1\12\33\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "189:16: ( load | clear | drop | add | move | copy | create | insert | delete | modify )";
        }
    }
 

    public static final BitSet FOLLOW_prologue_in_query158 = new BitSet(new long[]{0x0188100000000000L});
    public static final BitSet FOLLOW_selectQuery_in_query161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_constructQuery_in_query165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_describeQuery_in_query169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_askQuery_in_query173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_bindingsClause_in_query176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_query178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_query209 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_query212 = new BitSet(new long[]{0x0000050000000000L,0x00000000000DDE40L});
    public static final BitSet FOLLOW_update_in_query214 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_EOF_in_query218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseDecl_in_prologue245 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_prefixDecl_in_prologue249 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_BASE_in_baseDecl280 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IRI_REF_in_baseDecl282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIX_in_prefixDecl307 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_PNAME_NS_in_prefixDecl309 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefixDecl311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_selectQuery338 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_datasetClause_in_selectQuery340 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_whereClause_in_selectQuery343 = new BitSet(new long[]{0x6800000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_selectQuery345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_subSelect379 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_whereClause_in_subSelect381 = new BitSet(new long[]{0x6800000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_subSelect383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectClause416 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause419 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause423 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_selectClause427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_selectClause449 = new BitSet(new long[]{0x0001600000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause452 = new BitSet(new long[]{0x0001600000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_REDUCED_in_selectClause456 = new BitSet(new long[]{0x0001600000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_selectVariables_in_selectClause463 = new BitSet(new long[]{0x0001600000000002L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_selectVariables498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_selectVariables515 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_selectVariables517 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_AS_in_selectVariables519 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_selectVariables521 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_selectVariables523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery552 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_constructTemplate_in_constructQuery554 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery556 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_whereClause_in_constructQuery559 = new BitSet(new long[]{0x6800000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCT_in_constructQuery587 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_datasetClause_in_constructQuery589 = new BitSet(new long[]{0x0210000000000000L});
    public static final BitSet FOLLOW_WHERE_in_constructQuery592 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_constructQuery594 = new BitSet(new long[]{0x00410A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesTemplate_in_constructQuery596 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_constructQuery599 = new BitSet(new long[]{0x6800000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_constructQuery601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCRIBE_in_describeQuery637 = new BitSet(new long[]{0x00008A0000000000L,0x0000060000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_describeQuery643 = new BitSet(new long[]{0x6A300A0000000000L,0x000006000000000AL,0x8000000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_describeQuery649 = new BitSet(new long[]{0x6A30000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_datasetClause_in_describeQuery652 = new BitSet(new long[]{0x6A30000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_whereClause_in_describeQuery655 = new BitSet(new long[]{0x6800000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_solutionModifier_in_describeQuery658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASK_in_askQuery697 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_datasetClause_in_askQuery699 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_whereClause_in_askQuery702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_datasetClause730 = new BitSet(new long[]{0x04000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NAMED_in_datasetClause732 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_datasetClause735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause763 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_whereClause766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupClause_in_solutionModifier791 = new BitSet(new long[]{0x6000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_havingClause_in_solutionModifier794 = new BitSet(new long[]{0x4000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_orderClause_in_solutionModifier797 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_limitOffsetClauses_in_solutionModifier800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_groupClause832 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_BY_in_groupClause834 = new BitSet(new long[]{0x00010A0000000000L,0xFFD0060000000000L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_groupCondition_in_groupClause836 = new BitSet(new long[]{0x00010A0000000002L,0xFFD0060000000000L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_builtInCall_in_groupCondition870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_groupCondition878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_groupCondition886 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_groupCondition888 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_AS_in_groupCondition891 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_groupCondition893 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_groupCondition897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_groupCondition916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HAVING_in_havingClause937 = new BitSet(new long[]{0x00010A0000000000L,0xFFD0000000000000L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_constraint_in_havingClause939 = new BitSet(new long[]{0x00010A0000000002L,0xFFD0000000000000L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_ORDER_in_orderClause971 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_BY_in_orderClause973 = new BitSet(new long[]{0x80010A0000000000L,0xFFD0060000000001L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_orderCondition_in_orderClause975 = new BitSet(new long[]{0x80010A0000000002L,0xFFD0060000000001L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_ASC_in_orderCondition1002 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESC_in_orderCondition1022 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_brackettedExpression_in_orderCondition1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_in_orderCondition1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_orderCondition1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses1088 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_offsetClause_in_limitOffsetClauses1106 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_limitClause_in_limitOffsetClauses1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_limitClause1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_limitClause1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_offsetClause1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_offsetClause1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDINGS_in_bindingsClause1188 = new BitSet(new long[]{0x0020000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_bindingsClause1190 = new BitSet(new long[]{0x0020000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_bindingsClause1193 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_bindingValueList_in_bindingsClause1195 = new BitSet(new long[]{0x0041000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_bindingsClause1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_bindingValueList1234 = new BitSet(new long[]{0x00040A0000000000L,0x0000000000000024L,0xFFFE000000000000L});
    public static final BitSet FOLLOW_bindingValue_in_bindingValueList1236 = new BitSet(new long[]{0x00040A0000000000L,0x0000000000000024L,0xFFFE000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_bindingValueList1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_bindingValue1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_bindingValue1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_bindingValue1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_bindingValue1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDEF_in_bindingValue1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_in_update1307 = new BitSet(new long[]{0x0000050000000000L,0x00000000000DDE40L});
    public static final BitSet FOLLOW_load_in_update1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clear_in_update1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_in_update1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_add_in_update1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_move_in_update1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copy_in_update1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_create_in_update1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_update1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_update1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modify_in_update1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOAD_in_load1409 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000080L,0x8000000000000000L});
    public static final BitSet FOLLOW_SILENT_in_load1411 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_load1414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_INTO_in_load1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_graphRef_in_load1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLEAR_in_clear1456 = new BitSet(new long[]{0x0400000000000000L,0x0000000000E00080L});
    public static final BitSet FOLLOW_SILENT_in_clear1459 = new BitSet(new long[]{0x0400000000000000L,0x0000000000E00080L});
    public static final BitSet FOLLOW_graphRefAll_in_clear1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop1494 = new BitSet(new long[]{0x0400000000000000L,0x0000000000E00080L});
    public static final BitSet FOLLOW_SILENT_in_drop1496 = new BitSet(new long[]{0x0400000000000000L,0x0000000000E00080L});
    public static final BitSet FOLLOW_graphRefAll_in_drop1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400080L});
    public static final BitSet FOLLOW_SILENT_in_create1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_graphRef_in_create1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_add1565 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_SILENT_in_add1567 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TO_in_add1574 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_add1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVE_in_move1614 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_SILENT_in_move1616 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TO_in_move1623 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_move1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COPY_in_copy1663 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_SILENT_in_copy1665 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_TO_in_copy1672 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000600080L,0x8000000000000000L});
    public static final BitSet FOLLOW_graphOrDefault_in_copy1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_DATA_in_insert1710 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insert1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete1746 = new BitSet(new long[]{0x0010000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_deleteData_in_delete1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteWhere_in_delete1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_deleteData1771 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteData1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_deleteWhere1800 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteWhere1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_modify1834 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_modify1836 = new BitSet(new long[]{0x0000050000000000L,0x00000000000DDE40L});
    public static final BitSet FOLLOW_deleteClause_in_modify1841 = new BitSet(new long[]{0x0010050000000000L,0x00000000001DDE40L});
    public static final BitSet FOLLOW_insertClause_in_modify1843 = new BitSet(new long[]{0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_insertClause_in_modify1848 = new BitSet(new long[]{0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_usingClause_in_modify1851 = new BitSet(new long[]{0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_WHERE_in_modify1854 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_modify1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_deleteClause1903 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_deleteClause1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertClause1934 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_quadPattern_in_insertClause1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_usingClause1959 = new BitSet(new long[]{0x04000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_NAMED_in_usingClause1961 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_usingClause1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphOrDefault1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphOrDefault2004 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_graphOrDefault2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphRef2034 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_graphRef2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphRef_in_graphRefAll2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_graphRefAll2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMED_in_graphRefAll2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_graphRefAll2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_quadPattern2082 = new BitSet(new long[]{0x00410A0000000000L,0x0000068000400004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_quads_in_quadPattern2084 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_quadPattern2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads2111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_quadsNotTriples_in_quads2115 = new BitSet(new long[]{0x00010A0000000002L,0x0000068001400004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_quads2117 = new BitSet(new long[]{0x00010A0000000002L,0x0000068000400004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesTemplate_in_quads2120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_GRAPH_in_quadsNotTriples2159 = new BitSet(new long[]{0x00000A0000000000L,0x0000060000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_quadsNotTriples2161 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_quadsNotTriples2163 = new BitSet(new long[]{0x00410A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesTemplate_in_quadsNotTriples2165 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_quadsNotTriples2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate2200 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_triplesTemplate2203 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesSameSubject_in_triplesTemplate2205 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_triplesTemplate2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_groupGraphPattern2241 = new BitSet(new long[]{0x02711A0000000000L,0x000006805E400004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_subSelect_in_groupGraphPattern2244 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_groupGraphPatternSub_in_groupGraphPattern2248 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_groupGraphPattern2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSub2284 = new BitSet(new long[]{0x0230000000000002L,0x000000005E400000L});
    public static final BitSet FOLLOW_groupGraphPatternSubCache_in_groupGraphPatternSub2288 = new BitSet(new long[]{0x0230000000000002L,0x000000005E400000L});
    public static final BitSet FOLLOW_graphPatternNotTriples_in_groupGraphPatternSubCache2316 = new BitSet(new long[]{0x00010A0000000002L,0x0000068001000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_DOT_in_groupGraphPatternSubCache2318 = new BitSet(new long[]{0x00010A0000000002L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesBlock_in_groupGraphPatternSubCache2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock2348 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_triplesBlock2351 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesSameSubjectPath_in_triplesBlock2353 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_triplesBlock2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupOrUnionGraphPattern_in_graphPatternNotTriples2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optionalGraphPattern_in_graphPatternNotTriples2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minusGraphPattern_in_graphPatternNotTriples2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphGraphPattern_in_graphPatternNotTriples2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_serviceGraphPattern_in_graphPatternNotTriples2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filter_in_graphPatternNotTriples2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bind_in_graphPatternNotTriples2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONAL_in_optionalGraphPattern2421 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_optionalGraphPattern2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRAPH_in_graphGraphPattern2448 = new BitSet(new long[]{0x00000A0000000000L,0x0000060000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_graphGraphPattern2450 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_graphGraphPattern2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERVICE_in_serviceGraphPattern2479 = new BitSet(new long[]{0x00000A0000000000L,0x0000060000000080L,0x8000000000000000L});
    public static final BitSet FOLLOW_SILENT_in_serviceGraphPattern2481 = new BitSet(new long[]{0x00000A0000000000L,0x0000060000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_serviceGraphPattern2484 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_serviceGraphPattern2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIND_in_bind2520 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_bind2522 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_bind2524 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_AS_in_bind2526 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_bind2528 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_bind2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_KEYWORD_in_minusGraphPattern2567 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_minusGraphPattern2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2597 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_UNION_in_groupOrUnionGraphPattern2605 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_groupOrUnionGraphPattern2609 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_FILTER_in_filter2641 = new BitSet(new long[]{0x00010A0000000000L,0xFFD0000000000000L,0x8000007FFFFFFFFFL});
    public static final BitSet FOLLOW_constraint_in_filter2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_constraint2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_constraint2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_constraint2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_functionCall2701 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_argList_in_functionCall2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_argList2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_argList2746 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_argList2748 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_argList2751 = new BitSet(new long[]{0x0004000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_argList2754 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_argList2756 = new BitSet(new long[]{0x0004000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_argList2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_expressionList2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_expressionList2790 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_expressionList2792 = new BitSet(new long[]{0x0004000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_expressionList2795 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_expressionList2797 = new BitSet(new long[]{0x0004000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_expressionList2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_constructTemplate2832 = new BitSet(new long[]{0x00410A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_constructTriples_in_constructTemplate2834 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_constructTemplate2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples2863 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_constructTriples2866 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_triplesSameSubject_in_constructTriples2868 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOT_in_constructTriples2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubject2895 = new BitSet(new long[]{0x00000A0000000000L,0x0000060100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubject2919 = new BitSet(new long[]{0x00000A0000000002L,0x0000060100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubject2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty2959 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty2961 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_propertyListNotEmpty2964 = new BitSet(new long[]{0x00000A8000000002L,0x0000060100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_verb_in_propertyListNotEmpty2967 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmpty2969 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_graphNode_in_objectList3004 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_objectList3007 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_graphNode_in_objectList3009 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_varOrIRIref_in_verb3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_verb3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_triplesSameSubjectPath3062 = new BitSet(new long[]{0x00010A0000000000L,0x0000064900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_propertyListNotEmptyPath_in_triplesSameSubjectPath3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_triplesSameSubjectPath3086 = new BitSet(new long[]{0x00000A0000000002L,0x0000060100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesSameSubjectPath3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verbSimpleOrPath_in_propertyListNotEmptyPath3128 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmptyPath3130 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_propertyListNotEmptyPath3133 = new BitSet(new long[]{0x00010A8000000002L,0x0000064900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_verbSimpleOrPath_in_propertyListNotEmptyPath3136 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_objectList_in_propertyListNotEmptyPath3138 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_verbPath_in_verbSimpleOrPath3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_verbSimple_in_verbSimpleOrPath3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_path_in_verbPath3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_verbSimple3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathSequence_in_path3244 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_PIPE_in_path3247 = new BitSet(new long[]{0x00010A0000000000L,0x0000004900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_pathSequence_in_path3249 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3278 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_DIVIDE_in_pathSequence3281 = new BitSet(new long[]{0x00010A0000000000L,0x0000004900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_pathEltOrInverse_in_pathSequence3283 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_INVERSE_in_pathEltOrInverse3311 = new BitSet(new long[]{0x00010A0000000000L,0x0000004900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_pathElt_in_pathEltOrInverse3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathPrimary_in_pathElt3342 = new BitSet(new long[]{0x0020800000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_pathMod_in_pathElt3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_pathMod3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_pathMod3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_pathMod3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_BRACE_in_pathMod3375 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000004L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod3378 = new BitSet(new long[]{0x0040000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_pathMod3381 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod3388 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_pathMod3400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_pathMod3402 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_BRACE_in_pathMod3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_pathPrimary3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathPrimary3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATION_in_pathPrimary3455 = new BitSet(new long[]{0x00010A0000000000L,0x0000000900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_pathNegatedPropertySet_in_pathPrimary3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathPrimary3475 = new BitSet(new long[]{0x00010A0000000000L,0x0000004900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_path_in_pathPrimary3477 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathPrimary3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_pathNegatedPropertySet3509 = new BitSet(new long[]{0x00040A0000000000L,0x0000000900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3512 = new BitSet(new long[]{0x0004000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_PIPE_in_pathNegatedPropertySet3515 = new BitSet(new long[]{0x00000A0000000000L,0x0000000900000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_pathOneInPropertySet_in_pathNegatedPropertySet3517 = new BitSet(new long[]{0x0004000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_pathNegatedPropertySet3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSE_in_pathOneInPropertySet3553 = new BitSet(new long[]{0x00000A0000000000L,0x0000000100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_pathOneInPropertySet3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_A_in_pathOneInPropertySet3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_triplesNode3580 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_graphNode_in_triplesNode3582 = new BitSet(new long[]{0x00050A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_triplesNode3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_triplesNode3602 = new BitSet(new long[]{0x00000A0000000000L,0x0000060100000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_propertyListNotEmpty_in_triplesNode3604 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_triplesNode3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varOrTerm_in_graphNode3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triplesNode_in_graphNode3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrTerm3658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_graphTerm_in_varOrTerm3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_varOrIRIref3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_varOrIRIref3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_var0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_graphTerm3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_graphTerm3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_graphTerm3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_graphTerm3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankNode_in_graphTerm3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_graphTerm3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_nil3786 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_nil3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_expression3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3825 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression3834 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression3838 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression3872 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression3881 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_valueLogical_in_conditionalAndExpression3885 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_relationalExpression_in_valueLogical3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression3936 = new BitSet(new long[]{0x0000000000000002L,0x001FE00000000000L});
    public static final BitSet FOLLOW_EQUAL_in_relationalExpression3946 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_relationalExpression4007 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relationalExpression4066 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relationalExpression4125 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_relationalExpression4183 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_EQUAL_in_relationalExpression4241 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_numericExpression_in_relationalExpression4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relationalExpression4301 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionList_in_relationalExpression4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_relationalExpression4359 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_IN_in_relationalExpression4361 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionList_in_relationalExpression4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_numericExpression4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4419 = new BitSet(new long[]{0x0000000000000002L,0x0020002000000004L,0x01FE000000000000L});
    public static final BitSet FOLLOW_additiveOperator_in_additiveExpression4429 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4433 = new BitSet(new long[]{0x0000000000000002L,0x0020002000000004L,0x01FE000000000000L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_additiveExpression4500 = new BitSet(new long[]{0x0000800000000002L,0x0020002400000004L,0x01FE000000000000L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_additiveExpression4518 = new BitSet(new long[]{0x0000800000000002L,0x0020002400000004L,0x01FE000000000000L});
    public static final BitSet FOLLOW_ASTERISK_in_additiveExpression4582 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_unaryExpression_in_additiveExpression4586 = new BitSet(new long[]{0x0000000000000002L,0x0020002000000004L,0x01FE000000000000L});
    public static final BitSet FOLLOW_DIVIDE_in_additiveExpression4652 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_unaryExpression_in_additiveExpression4656 = new BitSet(new long[]{0x0000000000000002L,0x0020002000000004L,0x01FE000000000000L});
    public static final BitSet FOLLOW_set_in_additiveOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4722 = new BitSet(new long[]{0x0000800000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression4731 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4735 = new BitSet(new long[]{0x0000800000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATION_in_unaryExpression4793 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression4814 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression4835 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_brackettedExpression_in_primaryExpression4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtInCall_in_primaryExpression4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRefOrFunction_in_primaryExpression4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdfLiteral_in_primaryExpression4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_primaryExpression4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_primaryExpression4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_in_primaryExpression4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_brackettedExpression4924 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_brackettedExpression4926 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_brackettedExpression4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_builtInCall4949 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall4951 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall4953 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANG_in_builtInCall4971 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall4973 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall4975 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGMATCHES_in_builtInCall4993 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall4995 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall4997 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall4999 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5001 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATATYPE_in_builtInCall5020 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5022 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5024 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUND_in_builtInCall5042 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5044 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_var_in_builtInCall5046 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_in_builtInCall5064 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5066 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5068 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_URI_in_builtInCall5086 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5088 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5090 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BNODE_in_builtInCall5108 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5111 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5113 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nil_in_builtInCall5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RAND_in_builtInCall5135 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nil_in_builtInCall5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_builtInCall5149 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5151 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5153 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CEIL_in_builtInCall5171 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5173 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5175 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOOR_in_builtInCall5193 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5195 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5197 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_in_builtInCall5215 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5217 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5219 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCAT_in_builtInCall5237 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subStringExpression_in_builtInCall5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLEN_in_builtInCall5267 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5269 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5271 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UCASE_in_builtInCall5289 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5291 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5293 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCASE_in_builtInCall5311 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5313 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5315 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENCODE_FOR_URI_in_builtInCall5333 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5335 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5337 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTAINS_in_builtInCall5355 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5357 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5359 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRSTARTS_in_builtInCall5377 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5379 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5381 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRENDS_in_builtInCall5399 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5401 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5403 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_in_builtInCall5421 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5423 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5425 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MONTH_in_builtInCall5443 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5445 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5447 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DAY_in_builtInCall5465 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5467 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5469 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOURS_in_builtInCall5487 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5489 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5491 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUTES_in_builtInCall5509 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5511 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5513 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECONDS_in_builtInCall5531 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5533 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5535 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEZONE_in_builtInCall5553 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5555 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5557 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TZ_in_builtInCall5575 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5577 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5579 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOW_in_builtInCall5597 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nil_in_builtInCall5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MD5_in_builtInCall5611 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5613 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5615 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA1_in_builtInCall5633 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5635 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5637 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA224_in_builtInCall5655 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5657 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5659 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA256_in_builtInCall5677 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5679 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5681 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA384_in_builtInCall5699 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5701 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5703 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHA512_in_builtInCall5721 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5723 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5725 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COALESCE_in_builtInCall5743 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expressionList_in_builtInCall5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_builtInCall5761 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5763 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5767 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5769 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5773 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5775 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5779 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRLANG_in_builtInCall5804 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5806 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5808 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5810 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5812 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRDT_in_builtInCall5832 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5834 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5836 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5838 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5840 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMETERM_in_builtInCall5860 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5862 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5864 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_builtInCall5866 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5868 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISIRI_in_builtInCall5888 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5890 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5892 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISURI_in_builtInCall5910 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5912 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5914 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISBLANK_in_builtInCall5932 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5934 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5936 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISLITERAL_in_builtInCall5955 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5957 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5959 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ISNUMERIC_in_builtInCall5977 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_builtInCall5979 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_builtInCall5981 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_builtInCall5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexExpression_in_builtInCall5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_existsFunction_in_builtInCall6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExistsFunction_in_builtInCall6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_regexExpression6044 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_regexExpression6046 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_regexExpression6048 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_regexExpression6050 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_regexExpression6052 = new BitSet(new long[]{0x0004000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_regexExpression6055 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_regexExpression6057 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_regexExpression6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSTR_in_subStringExpression6091 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_subStringExpression6093 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_subStringExpression6095 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_subStringExpression6097 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_subStringExpression6099 = new BitSet(new long[]{0x0004000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_subStringExpression6102 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_subStringExpression6104 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_subStringExpression6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_existsFunction6138 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_existsFunction6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_notExistsFunction6165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXISTS_in_notExistsFunction6167 = new BitSet(new long[]{0x0230000000000000L});
    public static final BitSet FOLLOW_groupGraphPattern_in_notExistsFunction6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggregate6194 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6196 = new BitSet(new long[]{0x0001AA0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6198 = new BitSet(new long[]{0x00018A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_ASTERISK_in_aggregate6202 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_expression_in_aggregate6206 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_aggregate6232 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6234 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6236 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_aggregate6239 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggregate6260 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6262 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6264 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_aggregate6267 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggregate6288 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6290 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6292 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_aggregate6295 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_aggregate6316 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6318 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6320 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_aggregate6323 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAMPLE_in_aggregate6344 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6346 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6348 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_aggregate6351 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregate6372 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_aggregate6374 = new BitSet(new long[]{0x00012A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_DISTINCT_in_aggregate6376 = new BitSet(new long[]{0x00010A0000000000L,0xFFF0066000000004L,0xFFFE3FFFFFFFFFFFL});
    public static final BitSet FOLLOW_expression_in_aggregate6379 = new BitSet(new long[]{0x0004008000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_aggregate6382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_SEPARATOR_in_aggregate6384 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_EQUAL_in_aggregate6386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x7800000000000000L});
    public static final BitSet FOLLOW_string_in_aggregate6388 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_aggregate6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iriRef_in_iriRefOrFunction6436 = new BitSet(new long[]{0x00010A0000000000L,0x0000068000000004L,0xFFFE000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_argList_in_iriRefOrFunction6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_rdfLiteral6469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_LANGTAG_in_rdfLiteral6472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCE_in_rdfLiteral6477 = new BitSet(new long[]{0x00000A0000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_iriRef_in_rdfLiteral6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralUnsigned_in_numericLiteral6499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralPositive_in_numericLiteral6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteralNegative_in_numericLiteral6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralUnsigned0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralPositive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteralNegative0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_string0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IRI_REF_in_iriRef6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixedName_in_iriRef6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_prefixedName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_NODE_LABEL_in_blankNode6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anon_in_blankNode6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_BRACKET_in_anon6773 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_BRACKET_in_anon6775 = new BitSet(new long[]{0x0000000000000002L});

}