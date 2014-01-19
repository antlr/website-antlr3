#include <stdlib.h>
#include <iostream>
#include <fstream>
#include <antlr/ASTFactory.hpp>
#include <antlr/CommonAST.hpp>
#include "AdaAST.hpp"
#include "AdaLexer.hpp"
#include "AdaParser.hpp"
#include "AdaTreeParserSuper.hpp"

using namespace std;
using namespace antlr;

static bool do_tree_dump ()
{
  char *sym = getenv ("ANTLR_TREE");
  if (sym == NULL)
    return false;
  return (*sym != '0');
}

static bool do_tree_walk ()
{
  char *sym = getenv ("ANTLR_TREE_WALK");
  if (sym == NULL)
    return false;
  return (*sym != '0');
}

static void do_tree_action (antlr::ASTFactory& factory, RefAST t)
{
  if (t == nullAST)
    return;
  AdaTreeParserSuper tparse;
  tparse.initializeASTFactory (factory);
  tparse.setASTFactory (&factory);
  try {
    tparse.compilation_unit (t);
  }
  catch (antlr::ANTLRException& e) {
    cerr << e.toString () << endl;
  }
}

int main(int argc, char* argv[])
{
    if (argc < 2) {
        cerr << "Usage: ada <file[s]>" << endl;
        return 1;
    }
    for (int i = 1; i < argc; i++) {
        try {
            char *filename = argv[i];
            ifstream infile (filename);
            AdaLexer lexer (infile);
            lexer.setFilename (filename);
            AdaParser parser (lexer);
            parser.setFilename (filename);
            // make an ast factory
            antlr::ASTFactory ast_factory;
            // initialize and put it in the parser...
            parser.initializeASTFactory (ast_factory);
            parser.setASTFactory (&ast_factory);
            // parser.setASTNodeType ("RefAdaAST");
            bool do_tree = do_tree_dump ();
            bool do_walk = do_tree_walk ();
            parser.compilation_unit ();
            infile.close ();
            if (do_tree || do_walk) {
                RefAST t = RefAST (parser.getAST ());
                if (t) {
                    cout << filename << ":" << endl;
                    if (do_tree) {
                        // Print the resulting tree out in LISP notation
                        cout << t->toStringList () << endl;
                        cout << endl;
                    }
                    if (do_walk) {
                        do_tree_action (ast_factory, t);
                    }
                } else {
                    cout << "No tree produced for " << filename << endl;
                }
            }
        } catch(std::exception& e) {
            std::cerr << "exception: " << e.what () << std::endl;
        }
    }
    return 0;
}
