/*

  Provide human readable parse tree and derivations.
  
  It is based on java version in
  "Debugging and Testing Grammars With Parse Trees and Derivations"
  by Terence Parr, November 30, 2003
  
  First Author: E.Fehlauer, F.Rogin
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

#ifndef PARSETREERULE_H
#define PARSETREERULE_H

#include <antlr/AST.hpp>

#include <string>

#include "ParseTree.h"
#include "ParseTreeToken.h"

class ParseTreeRule : public ParseTree {
protected:
  ANTLR_USE_NAMESPACE(std)string ruleName;
  
  // Do a step-first walk, building up a buffer of tokens until
  // you've reached a particular step and print out any rule subroots
  // insteads of descending.
  int getLeftmostDerivation(ANTLR_USE_NAMESPACE(std)string& buf,
                            int step) {
    int numReplacements = 0;
    if ( step<=0 ) {
      buf += " " + toString();
      return numReplacements;
    }
    
    ANTLR_USE_NAMESPACE(antlr)RefAST child = getFirstChild();
    numReplacements = 1;
    // walk child printing them out, descending into at most one
    while ( child!=0 ) {
      if (numReplacements>=step
          || dynamic_cast<ParseTreeToken*>(child.get()) ) {
        buf += " " + child->toString();
      }
      else {
        // descend for at least one more derivation; update count
        int remainingReplacements = step - numReplacements;
        ParseTree* cp = dynamic_cast<ParseTree*>(child.get());
        if (cp) {
          int n = cp->getLeftmostDerivation(buf, remainingReplacements);
          numReplacements += n;
        }
      }
      child = child->getNextSibling();
    }
    return numReplacements;
  }

public:
  ParseTreeRule(ANTLR_USE_NAMESPACE(std)string rn) {
    ruleName = rn;
  }
  
  ANTLR_USE_NAMESPACE(std)string getRuleName() const {
    return ruleName;
  }
  
  ANTLR_USE_NAMESPACE(std)string toString() const {
    return "<" + ruleName + ">";
  }
};

#endif //PARSETREERULE_H
