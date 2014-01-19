import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
/******************************************************************************
 * Software Metrics (with thanks to the Software Engineering Institute
 * (www.sei.cmu.edu), Julian M. Bucknall (www.boyet.com) and Tim Littlefair
 * (Tim_Littlefair@hotmail.com))
 ******************************************************************************
 * Copyright (c) E2 System Limited 2007.
 *
 * All rights reserved.
 *
 * This isn't Public Domain, Free Software, or Commercial Software, at the
 * moment.
 *
 * Free For Personal Use I Suppose.
 *
 * I am pretty confident it won't be Commercial.
 *
 * I need to think about it.
 *
 * Drop me a line at David Edwards <dme@e2systems.co.uk> if you are interested.
 * ****************************************************************************
 * This is principally designed to carry out lexical-based code counting,
 * controlled by a table that details what to do with particular language
 * elements.
 *
 * The benefits of lexical-based scanning are:
 * -  We count everything, whether the parser recognises it correctly or not
 * -  So we don't have to get the parser exactly right.
 *
 * The drawbacks are:
 * -   Things like the Cyclomatic Effect of PL/SQL decode(), where the impact
 *     should  depend on the number of arguments to it, which are merely
 *     separated with pairs of ',', are only approximated
 * -   We are not necessarily taking account of the scope of a variable
 *     (e.g. is this 'x' really the same as some 'x' encountered earlier)?
 * -   Everything user-defined is an Operand, whereas functions should perhaps
 *     be Operators
 * -   Look-ahead is going to get allocated to the wrong method/function/
 *     procedure or whatever.
 *
 * I am hopeful that the rule table will make it possible for the output to be
 * tuned to match some arbitrary product; useful for validation purposes at any
 * rate.
 *
 * Note that more sophisticated processing driven off an accurate, complete
 * parser is also supported. In this case, a different adjustMetrics() is
 * called from everywhere in the parser. Putting these calls in entails a lot
 * more work than the lexical counting, and in addition you would need to
 * create dummy OPERATORS in the rules, that affect the cyclomatic factor but
 * not the operator or operand, to get the cyclomatic counting working
 * correctly, if you want to count all the 'if's or ','s, for instance, but
 * only want to increment the cyclomatic count when it is meaningful to do so
 * (from within the decode() in the latter case).
 * ****************************************************************************
 * Instructions
 * ****************************************************************************
 * There are three private classes in this file:
 * -   TokenDetails, which hold accumumlators associated with a single token
 * -   ModuleDetails, which own TokenDetails, and child ModuleDetails
 * -   TokenRules, which hold processing rules
 *
 * The TokenRules live in a static HashMap
 *
 * The singleton SoftwareMetrics owns the root ModuleDetails.
 *
 * To use this stuff:
 * -   Call the static SoftwareMetrics.start() method to make sure the
 *     singleton is instantiated
 * -   Load up the rules (SoftwareMetrics.addRule())
 * -   Parse the source files
 *     -   wrap the recognition of code units with SoftwareMetrics.start() and
 *         SoftwareMetrics.finish()
 *     -   arrange for SoftwareMetrics.adjustMetrics() to be called by the lexer
 *         for every token potentially passed back to the parser
 *     -   track the white space discarded and count blank lines; call
 *         SoftwareMetrics.incBlanks() as appropriate
 *     -   likewise comments; call SoftwareMetrics.incComments() as appropriate
 * -   Call SoftwareMetrics.processTree() to dump out the data collected on
 *     stdout
 *
 * For details of the parameters, see the comments below the nested classes.
 *
 * See JAVAMain.java, PLSQLMain.java, PLSQLGrammar.g and java.g for examples
 */
public class SoftwareMetrics
{
public static final int OPERATOR = 1;
public static final int OPERAND = 2;
/**
 * Inner class to hold statistics for a token (Operator or Operand or both)
 */
private class TokenDetails
{
String name;
int operatorCnt;
int operandCnt;

/**
 * Constructor
 */
TokenDetails (String nm)
{
    this.name = nm;
}
/**
 * Human-readable rendition
 */
public String toString()
{
    return "name: " + name + " operatorCnt: " + operatorCnt
                            + " operandCnt: " + operandCnt;
}
}
/**
 * Inner class to hold language element processing rules. We use this to:
 * -   Make the mechanics language-independent
 * -   Make up for the limitations of lexical counting. Every 'if' will have
 *     an 'end if', and so 'if' will be seen twice as often as its logical
 *     impact on the complexity; thus, we set the 'if' cyclomatic factor to
 *     0.5 rather than 1.
 */
private class TokenRules
{
String name;
/*
 * Set the following to a fraction for interesting elements that necessarily
 * occur more than once in a stream (for example, if ... end if; we want a 
 * total of 1.0)
 */
double cycloFactor;
/*
 * Default statistics impacts
 *
 * We could penalise some elements (e.g. goto)
 *
 * We could decide to ignore some (e.g. the '.' operator in PL/SQL), or
 * even negate their effects (e.g. treat a.b as one thing rather than three).
 *
 * We can make up for the deficiencies of lexical-based counting by:
 * -   Scaling down (handling 'if ... end if', for instance)
 * -   Scaling up (we don't know how many elements there will be in a decode
 *     block if we just pick up the 'decode', so we pick an 'average')
 */
int operatorAdjust;
int operandAdjust;
/*
 * Flag indicating whether this token is case-sensitive or not. Even in
 * PL/SQL, which is ordinarily case-insensitive, it is possible to coerce
 * case-sensitivity (by using the "Double Quote" construct).
 */
boolean sensitive;

/**
 * Constructor
 */
TokenRules (String name, double cycloFactor, int operatorAdjust,
            int operandAdjust, boolean sensitive)
{
    this.name = name;
    this.cycloFactor = cycloFactor;
    this.operatorAdjust = operatorAdjust;
    this.operandAdjust = operandAdjust;
    this.sensitive = sensitive;
}
/**
 * Human-readable rendition
 */
public String toString()
{
    return "name: " + name + " cycloFactor: " + cycloFactor
                + " operatorAdjust: " + operatorAdjust
                + " operandAdjust: " + operandAdjust;
}
}
/**
 * Inner class to hold details of a Code Element
 */
private class ModuleDetails
{
/**
 * PL/SQL; Procedure, Function, Package, Package Body.
 */
String name;
String moduleType;
/**
 * Line Counters
 */
int blankLines;
int sourceLines;
int commentLines;
int lastParseLine;
/**
 * Statement/Comment Counters
 */
int statementCnt;
int commentCnt;
/**
 * Halstead Metrics
 */
int distinctOperands;
int totalOperands;
int distinctOperators;
int totalOperators;
int programLength;
int vocabulary;
double volume;
double difficulty;
double effort;
/**
 * McCabe's Cyclomatic Complexity
 */
double cyclomatic;
/**
 * Maintainability Index
 */
int moduleCnt = 1;
/*
 * Four term  maintainabilityIndex;
 */
double maintainabilityIndex;
/*
 * Three term  maintainabilityIndex, excluding comments
 */
double maintainabilityIndexNC;
/**
 * Halstead Measures (lifted from www.sei.cmu.edu)
 * =================
 * The Halstead measures are based on four scalar numbers derived directly
 * from a program's source code:
 * n1 = the number of distinct operators
 * 
 * n2 = the number of distinct operands
 * 
 * N1 = the total number of operators
 * 
 * N2 = the total number of operands
 * 
 * From these numbers, five measures are derived:
 * Measure Symbol Formula
 * 
 * Program length N N= N1 + N2
 * 
 * Program vocabulary n n= n1 + n2
 * 
 * Volume V V= N * (LOG2 n)
 * 
 * Difficulty D D= (n1/2) * (N2/n2)
 * 
 * Effort E E= D * V
 */
void computeHalstead()
{
    programLength = totalOperands + totalOperators;
    vocabulary = distinctOperators + distinctOperands;
    if (distinctOperators > 0 && distinctOperands > 0)
    {
        volume = programLength * Math.log(vocabulary)/Math.log(2);
        difficulty = distinctOperators/2 * (totalOperands/distinctOperands); 
        effort = difficulty * volume;
    }
    return;
}
HashMap<String,TokenDetails> tokenMap = new HashMap<String,TokenDetails>(1024);
/**
 * countNewLines()
 * Increment source lines by the number of new lines embedded in any of the
 * tokens
 */
private int countNewLines(String s)
{
int cnt;
int i;

    for (cnt = 0, i = 0; (i = s.indexOf('\n',i)) >= 0; cnt++, i++);
    return cnt;
}
/**
 * trackParse()
 * - Code that allows us to see how the parse is progressing based on
 *   the call stack.
 */
private void trackParse(String token, int lineNo)
{
    try
    {
        throw (new Throwable());
    }
    catch(Throwable e)
    {
    StackTraceElement stack[] = e.getStackTrace();
/*  
 *  stack[0] contains the method that created the exception (This one).
 *  We don't want the calls in this file, so start from 4
 *
 *  stack[stack.length-1] contains the oldest method call.
 *
 *  We just print 22 for now
 */
        for (int i= ((stack.length > 30) ? 30 : (stack.length - 1)); i > 3; i--)
        {
        String filename = stack[i].getFileName();
        String className = stack[i].getClassName();
        String methodName = stack[i].getMethodName();
        boolean isNativeMethod = stack[i].isNativeMethod();
        int line = stack[i].getLineNumber();

            if (filename == null) // The source filename is not available
                filename= "(Filename not available)";
            System.out.println("S:" +className+"."+methodName+ " line " + line);
       }
       System.out.println("R:" + token + ':' + lineNo);
    }
    return;
}
/**
 * Adjust metrics.
 * -  Look for the token in the hash map.
 * -  If it is there, update the counts
 * -  If it isn't there, add it.
 *
 * Also need to update the line counters; source code, comment,
 * blank line.
 *
 * There is an issue with the line tracking. Comments are going to be seen
 * by the lexical analyser, whilst the tokens won't be handled until the parser
 * gets to see them, which is some way behind.
 *
 * Thus, line counting ought to be handled exclusively by the lexical analyser.
 *
 * We give this the job of incrementing blank lines when it is recognising
 * whitespace.
 *
 * We count comment in a similar way.
 *
 * Lines with source are counted from the parser, by comparing a line passed
 * in with the last line passed in.
 *
 * Note that this means that 'trailing' comments and blank lines will go to
 * the preceding object. O.K. for the file as a whole, though.
 *
 * Strings with embedded new lines should also increment the source count.
 * This is done when the token is stored.
 */
private void adjustMetrics(String token, int opFlag, int lineNo, int diff)
{
/**
 * Have we seen this token before?
 * -  If not, we place it in the hashmap.
 * -  Otherwise, we increment the appropriate count.
 */
TokenDetails tokenDetail = tokenMap.get(token);

//    trackParse(token, lineNo);
    if (tokenDetail == null)
    {
        tokenDetail = new TokenDetails(token);
        tokenMap.put(token, tokenDetail);
    }
    if (opFlag == OPERAND)
        tokenDetail.operandCnt += diff;
    else
        tokenDetail.operatorCnt += diff;
/*
 * Increment source lines.
 */
    if (lineNo > lastParseLine)
    {
        sourceLines++;
        lastParseLine = lineNo;
//        System.out.println("Line: " + lastParseLine);
    }
    sourceLines += countNewLines(token);
    return;
}
/**
 * Adjust metrics using the exported approach
 * -  Look for the token in the hash map.
 * -  If it is there, use the values from the rules table.
 */
private void adjustMetrics(String token, int opFlag, int lineNo)
{
     adjustMetrics(token, opFlag, lineNo, 1);
     if (opFlag == OPERATOR)
         incCyclomatic(token);
}
/**
 * Adjust metrics using the table of rules.
 * -  Look for the token in the hash map.
 * -  If it is there, use the values from the rules table.
 * -  Otherwise use default values (it's an OPERAND, and we're interested in it)
 */
private void adjustMetrics(String token, int lineNo)
{
/**
 * Adjust the cyclomatic count, and as a side effect find out if we
 * know about this token.
 */
TokenRules tokenRule = incCyclomatic(token);

    if (tokenRule != null)
    {
        if (tokenRule.operatorAdjust != 0)
            adjustMetrics(token, OPERATOR, lineNo, tokenRule.operatorAdjust);
        if (tokenRule.operandAdjust != 0)
            adjustMetrics(token, OPERAND, lineNo, tokenRule.operandAdjust);
    }
    else
        adjustMetrics(token, OPERAND, lineNo, 1);
    return;
}
/**
 * Increment comment-count and comment-lines
 */
void incComments(int lineCnt)
{
    commentCnt++;
    commentLines += lineCnt;
    return;
}
/**
 * Increment blank lines
 */
void incBlanks(int lineCnt)
{
    blankLines += lineCnt;
    return;
}
/**
 * Called to increment semantic statements
 */
void incStatements()
{
    statementCnt++;
    return;
}
/**
 * McCabe's Cyclomatic Complexity
 * ==============================
 * McCabe's method was defined in terms of decision points in flowcharts.
 * 
 * Tim Littlefair, in his CCCC Java/C++ Metrics program, used the following
 * alternative (I have paraphrased the comments in cccc_tok.c).
 * 
 * "Token objects are used to count the occurences of states which 
 * the analyser is interested in within the text.  Any metric which
 * can be reduced to lexical counting on the text can be recorded
 * this way.
 * 
 * The CCCC implementation counts the following features:
 * -   tokens
 * -   comment lines
 * -   lines containing at least one token of code
 * 
 * It also makes a lexical count for the following tokens, each of which
 * is expected to increase McCabe's cyclomatic complexity (Vg) for the 
 * section of code by one unit:
 * 
 *   IF FOR WHILE SWITCH BREAK RETURN ? && ||
 * 
 * Note that && and || create additional paths through the code due to C/C++ 
 * short circuit evaluation of logical expressions.
 * 
 * Also note the way SWITCH constructs are counted: the desired increment
 * in Vg is equal to the number of cases provided for, including the 
 * default case, whether or not an action is defined for it.  This is achieved
 * by counting the SWITCH at the head of the construct as a surrogate for 
 * the default case, and counting BREAKs as surrogates for the individual
 * cases.  This approach yields the correct results provided that the
 * coding style in use ensures the use of BREAK after all non-default
 * cases, and forbids 'drop through' from one case to another other than
 * in the case where two or more values of the switch variable require
 * identical actions, and no executable code is defined between them."
 * 
 * PL/SQL doesn't have a switch statement. Additionally, SQL being declarative
 * doesn't affect the flow of control, but intuitively it does impact
 * complexity. nvl() and decode() functions imply multiple paths.
 *
 * The following approach is influenced by Julian Bucknall's suggestions.
 * 
 * This algorithm calculates the Cyclomatic Complexity value for a method using
 * token counting (again).
 * 
 * 1. Start with 0.
 * 2. Add 1 for each conditional statement or looping statement. (So, add 1 for
 *    an if, or a while, or a foreach, or a ternary operator, etc.)
 * 3. Add 1 for each AND or OR logical operator used in a condition.
 * 4. Add 1 for each case in a case or switch statement (Java). If the
 *    case/switch statement doesn't have an explicit default case, add 1.
 * 5. Add 1 for each catch statement or 'when' (exception) statement.
 * 6. Add 1 for each exit or return
 * 7. Finally, if the answer is zero (i.e. no branches, and no return either)
 *    set the answer to 1. All this means is that the method should finish;
 *    there is at least one path through the method.
 *
 * Obviously this logic needs to be different for each language. Our approach
 * is to:
 * -  Look up the token in the rule map.
 * -  Do what it says there
 */
/**
 * Adjust the cyclomatic complexity
 */
TokenRules incCyclomatic(String token)
{
TokenRules tokenRule = ruleMap.get(token.toLowerCase());

    if (tokenRule != null
     && (tokenRule.sensitive == false || tokenRule.name.equals(token)))
    {
        cyclomatic += tokenRule.cycloFactor;
/*
 *      if (tokenRule.cycloFactor > 0)
 *          System.out.println( moduleType + ':' + name + ':' + token + ':' +
 *              tokenRule.cycloFactor);
 */
    }
    return tokenRule;
}
/**
 * Maintainability Index (MI) (lifted from www.sei.cmu.edu)
 * ==========================
 * 171 - 5.2 * ln(aveV) - 0.23 * aveV(g') - 16.2 * ln (aveLOC) + 50 * sin
 * (sqrt(2.4 * perCM))
 * 
 * The coefficients are derived from actual usage (see Usage
 * Considerations). The terms are defined as follows:
 * 
 * aveV = average Halstead Volume V per module (see Halstead Complexity
 * Measures)
 * 
 * aveV(g') = average extended cyclomatic complexity per module (see
 * Cyclomatic Complexity)
 * 
 * aveLOC = the average count of lines of code (LOC) per module; and,
 * optionally
 * 
 * perCM = average percent of lines of comments per module
 * 
 * Example of usage. Welker relates how a module containing a routine with
 * some "very ugly" code was assessed as unmaintainable, when expressed in
 * terms of the MI (note that just quantifying the problem is a step forward)
 * [Welker 95]. The module was first redesigned, and then functionally
 * enhanced. The measured results are shown in Table 7:
 * 
 * Table 7: Measured Results
 * 
 * Measure Initial Code Restructured Code After Enhancement Code Unit Routine
 * Module Routine Module Routine Module MI (larger MI = more maintainable)
 * 6.47 33.55 39.93 70.13 37.62 69.60
 * 
 * Halstead Effort1 2,216,499 2,233,072 182,216 480,261 201,429 499,474
 * 
 * Extended Cyclomatic Complexity2 45 49 18 64 21 67
 * 
 * Lines of Code 622 663 196 732 212 748
 * 
 * 1 Halstead Effort, rather than Halstead Volume, was used in this case
 * study. See Halstead Complexity Measures for more information on both
 * these measures. Generally, the lower a program's measure of effort,
 * the simpler a change to the program will be (because Halstead measures
 * are weighted toward measuring computational complexity, not all programs
 * will behave this way).
 * 
 * 2 Note that a low Cyclomatic Complexity is generally indicative of a
 * lower risk, hence more maintainable, program. In this case, restructuring
 * increased the module complexity slightly (from 49 to 64), but reduced
 * the "ugly" routine's complexity significantly. In both, the subsequent
 * enhancement drove the complexity slightly higher.
 * 
 * If the enhancement had been made without first doing the restructuring,
 * these figures indicate the change would have been much more risky.
 * 
 * Coleman, Pearse, and Welker provide detailed descriptions of how MI was
 * calibrated and used at Hewlett-Packard [Coleman 94, Coleman 95, Pearse
 * 95, Welker 95].
 */
void calculateMI()
{
    if (moduleCnt > 0 && sourceLines > 0)
    {
        maintainabilityIndexNC = 171 - 5.2 * Math.log(volume/moduleCnt) - 0.23 *
            cyclomatic/moduleCnt - 16.2 * Math.log(sourceLines/moduleCnt);
        maintainabilityIndex = maintainabilityIndexNC + 50 *
                     Math.sin((Math.sqrt(2.4 * commentCnt/sourceLines)));
    }
}
/**
 * Constructor
 */
ModuleDetails (String nm, String mt, int base, ModuleDetails owner)
{
    name = nm;
    moduleType = mt;
    parentModule = owner;
    lastParseLine = base;
    return;
}
/**
 * Keep track of child modules
 */
ArrayList<ModuleDetails> moduleDetails = new ArrayList<ModuleDetails>(256);
/**
 * Note the parent, for handling nesting.
 */
ModuleDetails parentModule;

/**
 * Add another module, procedure, function, file or whatever to the analysis
 */
ModuleDetails add(String nm, String mt, int base)
{
ModuleDetails md = new ModuleDetails(nm, mt, base, this);

    moduleDetails.add(md);
    return md;
}
/**
 * Count the token hash map
 *
 */
void countTokenMap()
{
Iterator i = tokenMap.values().iterator();

    while (i.hasNext())
    {
    TokenDetails td = (TokenDetails) i.next();

        if (td.operandCnt > 0)
        {
            this.distinctOperands++;
            this.totalOperands += td.operandCnt;
        }
        if (td.operatorCnt > 0)
        {
            this.distinctOperators++;
            this.totalOperators += td.operatorCnt;
        }
    }
    return;
}
/**
 * Process the module tree depth first, dumping out the metrics for each
 * element.
 */
void processTree(int depth)
{
ModuleDetails md;

/*
 * Compute metrics that are derived from values solely belonging to this
 * this particular module
 */
    countTokenMap();
    computeHalstead();
    if (cyclomatic == 0)
        cyclomatic = 1;
/*
 * Add in contributions from any children 
 */
    for (int i = 0; i < moduleDetails.size(); i++)
    {
        md = moduleDetails.get(i);
        md.processTree(depth + 1);
        this.blankLines += md.blankLines;
        md.blankLines = 0;
        this.sourceLines += md.sourceLines;
        md.sourceLines = 0;
        this.commentLines += md.commentLines;
        md.commentLines = 0;
        this.statementCnt += md.statementCnt;
        md.statementCnt = 0;
        this.commentCnt += md.commentCnt;
        md.commentCnt = 0;
        this.distinctOperands += md.distinctOperands;
        md.distinctOperands = 0;
        this.totalOperands += md.totalOperands;
        md.totalOperands = 0;
        this.distinctOperators += md.distinctOperators;
        md.distinctOperators = 0;
        this.totalOperators += md.totalOperators;
        md.totalOperators = 0;
        this.volume += md.volume;
        md.volume = 0;
        this.effort += md.effort;
        md.volume = 0;
        this.difficulty += md.difficulty;
        md.difficulty = 0;
        this.cyclomatic += md.cyclomatic;
        md.cyclomatic = 0;
        this.moduleCnt += md.moduleCnt;
        md.moduleCnt = 0;
    }
/*
 * Compute metrics that are derived from rolled up values.
 */
    calculateMI();

/*
 * StringBuilder sb = new StringBuilder(depth);
 *
 * for (int i = 0; i < depth; i++)
 *      sb.append(' ');
 *  System.out.println( sb + this.toString());
 */
    System.out.println( depth + this.toString());
}
/**
 * String-ify all the interesting members
 */
public String toString()
{
/*
 *      return "type: " + moduleType + " name: " + name +
 *           " blankLines: " + blankLines +
 *           " sourceLines: " + sourceLines +
 *           " commentLines: " + commentLines +
 *           " lastParseLine: " + lastParseLine +
 *           " statementCnt: " + statementCnt +
 *           " commentCnt: " + commentCnt +
 *           " distinctOperands: " + distinctOperands +
 *           " totalOperands: " + totalOperands +
 *           " distinctOperators: " + distinctOperators +
 *           " totalOperators: " + totalOperators +
 *           " programLength: " + programLength +
 *           " vocabulary: " + vocabulary +
 *           " volume: " + volume +
 *           " difficulty: " + difficulty +
 *           " effort: " + effort +
 *           " cyclomatic: " + cyclomatic +
 *           " moduleCnt: " + moduleCnt +
 *           " maintainabilityIndex: " + maintainabilityIndex;
 *           " maintainabilityIndexNC: " + maintainabilityIndexNC;
 */
     return '|' + moduleType + '|' + name +
          '|' + blankLines +
          '|' + sourceLines +
          '|' + commentLines +
          '|' + lastParseLine +
          '|' + statementCnt +
          '|' + commentCnt +
          '|' + distinctOperands +
          '|' + totalOperands +
          '|' + distinctOperators +
          '|' + totalOperators +
          '|' + programLength +
          '|' + vocabulary +
          '|' + volume +
          '|' + difficulty +
          '|' + effort +
          '|' + cyclomatic +
          '|' + moduleCnt +
          '|' + maintainabilityIndex +
          '|' + maintainabilityIndexNC;
}
}  /* End of Module Details */
/**
 * SoftwareMetrics itself. We want to have a single instance that potentially
 * owns everything from runs of multiple parser incarnations over multiple
 * source files.
 *
 * We restrict ourselves to a single language at a time.
 *
 * The public methods are all static:
 * -  start(String moduleName, String moduleType, int lineNo);
 * -  adjustMetrics(String token, int opFlag, int lineNo);
 * -  adjustMetrics(String token, int lineNo);
 * -  incComments(int count);
 * -  incBlanks(int count);
 * -  incStatements();
 * -  finish();
 * -  finishAll();
 * Calling anything other than start() to begin with will give a
 * Null Pointer Exception.
 */
private ModuleDetails rootModuleDetails;
private ModuleDetails activeModuleDetails;
private static HashMap<String,TokenRules> ruleMap = new HashMap<String,TokenRules>(1024);
private volatile static SoftwareMetrics uniqueInstance;
/**
 * Private constructor, only called from getInstance()
 */
private SoftwareMetrics(String name, String mt, int lineNo )
{
    rootModuleDetails = new ModuleDetails(name, mt, lineNo, null);
    activeModuleDetails = rootModuleDetails;
}
/**
 * Singleton Method
 */
private static SoftwareMetrics getInstance(String nm, String mt, int lineNo)
{
    if (uniqueInstance == null)
    {
        synchronized (SoftwareMetrics.class)
        {
            if (uniqueInstance == null)
                uniqueInstance = new SoftwareMetrics(nm, mt, lineNo);
        }
    }
    return uniqueInstance;
}
/**********************************************************************
 *  start(String moduleName, String moduleType, int lineNo) - start
 *  collecting data on a module.
 */
public static void start(String nm, String mt, int lineNo)
{
SoftwareMetrics sm = getInstance(nm,mt, lineNo);

/*
 * If we haven't just created the singleton, we need to add ourself
 */
    if (!sm.rootModuleDetails.name.equals(nm)
      ||!sm.rootModuleDetails.moduleType.equals(mt))
        sm.activeModuleDetails = sm.activeModuleDetails.add(nm,mt,lineNo);
    return;
}
/**
 *  adjustMetrics(String token, int opFlag, int lineNo) - update the metrics
 *  based on the token reported, using an OPERATOR/OPERAND value presumably
 *  chosen by the parser.
 */
public static void  adjustMetrics(String token, int opFlag, int lineNo)
{
    if (uniqueInstance != null
     && uniqueInstance.activeModuleDetails != null)
        uniqueInstance.activeModuleDetails.adjustMetrics(token, opFlag, lineNo);
    return;
}
/**
 *  adjustMetrics(String token, int lineNo) - update the metrics based on the
 *  any token applicable token rules.
 */
public static void  adjustMetrics(String token, int lineNo)
{
    if (uniqueInstance != null
     && uniqueInstance.activeModuleDetails != null)
        uniqueInstance.activeModuleDetails.adjustMetrics(token, lineNo);
    return;
}
/**
 * incComments(int count) - increment the count of comments, and the count
 * of comment lines.
 */
public static void incComments(int count)
{
    if (uniqueInstance != null
     && uniqueInstance.activeModuleDetails != null)
        uniqueInstance.activeModuleDetails.incComments(count);
    return;
}
/**
 * incBlanks(int count) - increment the count of blank lines
 */
public static void  incBlanks(int count)
{
    if (uniqueInstance != null
     && uniqueInstance.activeModuleDetails != null)
        uniqueInstance.activeModuleDetails.incBlanks(count);
    return;
}
/**
 * incStatements() - increment the count of actual statements.
 */
public static void incStatements()
{
    if (uniqueInstance != null
     && uniqueInstance.activeModuleDetails != null)
        uniqueInstance.activeModuleDetails.incStatements();
    return;
}
/**
 * finish() - indicate that we have finished with this module. Counting reverts
 * to its parent. If there is no parent, we have finished, so call finishAll()
 * to output the details.
 */
public static void finish()
{
    if (uniqueInstance != null)
    {
        if (uniqueInstance.activeModuleDetails != null)
            uniqueInstance.activeModuleDetails
             = uniqueInstance.activeModuleDetails.parentModule;
        if (uniqueInstance.activeModuleDetails == null)
            finishAll();
    }
}
/**
 * finishAll() - Called to dump out the Module tree from its root.
 */
public static void finishAll()
{
    if (uniqueInstance != null && uniqueInstance.rootModuleDetails != null)
        uniqueInstance.rootModuleDetails.processTree(0);
    uniqueInstance = null;     /* Should mean we start over */
}
/**
 * updateRuleMap() - Add or update the rules to follow for a token in the rule
 *                   map.
 *
 * The table is keyed in a case-insensitive manner. However, whether the
 * the accumulators are case-sensitive or not is a flag.
 *
 * It is assumed that there will be no language where distinct language elements
 * (as opposed to mere variables) will be distinguishable merely on case.
 */
private void updateRuleMap(String token, double cycloFactor, int operatorAdjust,
            int operandAdjust, boolean sensitive)
{
/**
 * Have we seen this token before?
 * -  If not, we place it in the rule hashmap.
 * -  Otherwise, we over-write the fields
 */
TokenRules tokenRule = ruleMap.get(token.toLowerCase());

    if (tokenRule == null)
    {
        tokenRule = new TokenRules(token, cycloFactor, operatorAdjust,
            operandAdjust, sensitive);
        ruleMap.put(token.toLowerCase(), tokenRule);
    }
    else
    {
        tokenRule.cycloFactor = cycloFactor;
        tokenRule.operatorAdjust = operatorAdjust;
        tokenRule.operandAdjust = operandAdjust;
        tokenRule.sensitive = sensitive;
    }
}
/**
 * Public routine for adding rules
 */
public static void addRule(String token, double cycloFactor, int operatorAdjust,
            int operandAdjust, boolean sensitive)
{
    if (uniqueInstance != null)
        uniqueInstance.updateRuleMap(token, cycloFactor, operatorAdjust,
            operandAdjust, sensitive);
}
}
