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

#ifndef PARSETREE_H
#define PARSETREE_H

#include <antlr/BaseAST.hpp>

#include <string>

class ParseTree : public ANTLR_USE_NAMESPACE(antlr)BaseAST
{
public:
  // Walk parse tree and return requested number of derivation steps.
  // If steps <= 0, return node text.  If steps == 1, return derivation
  // string at step.
  ANTLR_USE_NAMESPACE(std)string getLeftmostDerivationStep(int step) {
    if ( step<=0 ) {
      return toString();
    }
    ANTLR_USE_NAMESPACE(std)string buf;
    getLeftmostDerivation(buf, step);
    return buf;
  }
  
  ANTLR_USE_NAMESPACE(std)string getLeftmostDerivation(int maxSteps) {
    ANTLR_USE_NAMESPACE(std)string buf;
    buf += "    "+ toString() + "\n";
    for (int d=1; d<maxSteps; d++) {
      buf += " =>" + getLeftmostDerivationStep(d) + "\n";
    }
    return buf;
  }
  
  // just satisfy BaseAST interface; unused as we manually create nodes
  void initialize(int t, const ANTLR_USE_NAMESPACE(std)string& txt) {}
  void initialize(ANTLR_USE_NAMESPACE(antlr)RefAST t) {}
  void initialize(ANTLR_USE_NAMESPACE(antlr)RefToken t) {}
  
  // Get derivation and return how many you did (less than requested for
  // subtree roots.
  virtual int getLeftmostDerivation(ANTLR_USE_NAMESPACE(std)string& buf,
                                    int step) = 0;
};

#endif //PARSETREE_H
