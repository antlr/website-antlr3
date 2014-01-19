/*

  Main routine.
  
  First Author: E.Fehlauer
                Copyright (c) 2004 Fraunhofer-Gesellschaft.
                All rights reserved.
   
  Permission to use, copy, modify, and distribute this 
  software and its documentation for educational, research 
  and non-profit purposes, without fee, and without a 
  written agreement is hereby granted, provided that the 
  above copyright notice, this paragraph and the following 
  three paragraphs appear in all copies. 
  
  Permission to incorporate this software into commercial 
  products may be obtained by contacting
  
    Fraunhofer Institute for Integrated Circuits 
    Branch Lab Design Automation
    Zeunerstraﬂe 38
    D-01069 Dresden
    Email: erhard.fehlauer@eas.iis.fhg.de
  
  This software program and documentation are copyrighted 
  by FhG IIS/EAS. The software program and documentation 
  are supplied "as is", without any accompanying services. 
  FhG IIS/EAS does not warrant that the operation of the 
  program will be uninterrupted or error-free. The end-user 
  understands that the program was developed for research 
  purposes and is advised not to rely exclusively on the 
  program for any reason. 
  
  IN NO EVENT SHALL FHG IIS/EAS BE LIABLE TO ANY PARTY FOR 
  DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL 
  DAMAGES, INCLUDING LOST PROFITS, ARISING OUT OF THE USE 
  OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF 
  FHG IIS/EAS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH 
  DAMAGE. FHG IIS/EAS SPECIFICALLY DISCLAIMS ANY WARRANTIES, 
  INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
  MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE 
  SOFTWARE PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND 
  FHG IIS/EAS HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, 
  SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS. 

*/

#include "VamsLexer.hpp"
#include "VamsParser.hpp"

#ifdef SHOWPARSETREEANDDERIVATION
#include "ParseTree.h"
int VamsParser::numberOfDerivationSteps = 1;  
#endif //SHOWPARSETREEANDDERIVATION

#include <iostream>
#include <fstream>

int
main(int argc,
     char* argv[])
{
  if (argc!=2)
  {
    std::cerr << "usage: " << argv[0] << " infile\n";
    return -1;
  }
  else
  {
    std::ifstream input(argv[1]);
    if (!input)
    {
      std::cerr << "error: can't open >" << argv[1] << "<\n";
      return -1;
    }
    else
    {
      try
      {
        VamsLexer lexer(input);
        lexer.setFilename(argv[1]);
        VamsParser parser(lexer);
        parser.setFilename(argv[1]);
        
        parser.design_file();
        
#ifdef SHOWPARSETREEANDDERIVATION
        ParseTree* tree = parser.getParseTree();
        std::cout << "parse tree:\n"
                  << tree->toStringTree() << std::endl;
        
        int nSteps = parser.getNumberOfDerivationSteps();
        std::cout << "derivation:\n"
                  << tree->getLeftmostDerivation(nSteps) << std::endl;
#endif //SHOWPARSETREEANDDERIVATION        
      }
      catch(ANTLR_USE_NAMESPACE(antlr)ANTLRException& e)
      {
        std::cerr << "lexer/parser exception: " << e.toString() << "\n";
        return -1;
      }
      catch(...)
      {
        std::cerr << "unexpected exception thrown\n";
        return -1;
      }
    }
  }
  return 0;
}
