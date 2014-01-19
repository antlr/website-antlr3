/* $Id: ada_utils.hpp,v 1.4 2003/06/01 15:01:00 okellogg Exp $
 */
#ifndef ADA_UTILS_H
#define ADA_UTILS_H

#include <qstring.h>
#include "AdaAST.hpp"

QString qtext (const RefAdaAST& n);
QStringList qnamelist (const RefAdaAST& n);
QString ada_spec_filename (const QString& comp_unit_name);
QString fq_specfilename (const QString& comp_unit_name);

#endif

