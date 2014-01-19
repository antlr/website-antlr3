/* $Id: adasupport.hpp,v 1.1 2003/05/02 16:12:25 okellogg Exp $
 */
#ifndef ADASUPPORT_H
#define ADASUPPORT_H

#include <string>
#include "AdaAST.hpp"

std::string text (const RefAdaAST& n);
int txteq (RefAdaAST n1, RefAdaAST n2);

#endif

