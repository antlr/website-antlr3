#
#  vams target make file.
#  
#  First Author: E.Fehlauer
#                Copyright (c) 2004 Fraunhofer-Gesellschaft.
#                All rights reserved.
#
#  Permission to use, copy, modify, and distribute this 
#  software and its documentation for educational, research 
#  and non-profit purposes, without fee, and without a 
#  written agreement is hereby granted, provided that the 
#  above copyright notice, this paragraph and the following 
#  three paragraphs appear in all copies. 
#
#  Permission to incorporate this software into commercial 
#  products may be obtained by contacting
# 
#    Fraunhofer Institute for Integrated Circuits 
#    Branch Lab Design Automation
#    Zeunerstraﬂe 38
#    D-01069 Dresden
#    Email: erhard.fehlauer@eas.iis.fhg.de
#
#  This software program and documentation are copyrighted 
#  by FhG IIS/EAS. The software program and documentation 
#  are supplied "as is", without any accompanying services. 
#  FhG IIS/EAS does not warrant that the operation of the 
#  program will be uninterrupted or error-free. The end-user 
#  understands that the program was developed for research 
#  purposes and is advised not to rely exclusively on the 
#  program for any reason. 
#
#  IN NO EVENT SHALL FHG IIS/EAS BE LIABLE TO ANY PARTY FOR 
#  DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL 
#  DAMAGES, INCLUDING LOST PROFITS, ARISING OUT OF THE USE 
#  OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF 
#  FHG IIS/EAS HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH 
#  DAMAGE. FHG IIS/EAS SPECIFICALLY DISCLAIMS ANY WARRANTIES, 
#  INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
#  MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE 
#  SOFTWARE PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND 
#  FHG IIS/EAS HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, 
#  SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS. 
#

# ANTLRROOT to be adopted (point to antlr top-level directory).
ANTLRROOT = 

#-----------------------------------------------------------------------------
TARGET = vams
TARGETCAP := $(shell echo $(TARGET) | gawk '{print toupper(substr($$0, 1, 1)) substr($$0, 2, length($$0)-1)}')

# Note the order!
CXXSRCS = $(TARGETCAP)Lexer.cpp $(TARGETCAP)Parser.cpp main.cpp
CXXOBJS = $(CXXSRCS:.cpp=.o)

#-----------------------------------------------------------------------------
# Checked to compile with gcc-2.95.3, and gcc-3.2.
CXX = g++

DBG = -g
#DBG = -pg

#OPT = -O2

CXXFLAGS += -Wall $(DBG) $(OPT)
LDFLAGS += $(DBG)

CXXFLAGS += -I$(ANTLRROOT)/lib/cpp
LDFLAGS += -L$(ANTLRROOT)/lib/cpp/src -lantlr

# enable just one
# ANTLRTRACE = -trace
# ANTLRTRACE = -traceLexer
# ANTLRTRACE = -traceParser

# diagnostic run, do not create .cpp/.hpp
# ANTLRDBG = -diagnostic

# create html-ized grammer only
# ANTLRHTML = -html

# show parse tree and derivations in human readable style
#SHOWPAD = yes
ifeq ($(SHOWPAD),yes)
  CXXFLAGS += -DSHOWPARSETREEANDDERIVATION
  ANTLRTRACE = -traceParser
endif

#-----------------------------------------------------------------------------
%.o: %.cpp
	echo "___ compiling $(<F)"
	$(CXX) -c -MMD $(CXXFLAGS) -o $@ $<

#-----------------------------------------------------------------------------
.PHONY: $(TARGET) TAGS clean distclean

$(TARGET): $(CXXOBJS)
	echo "___ linking $(@F)"
	$(CXX) $(CXXOBJS) $(LDFLAGS) -o $@

# create VamsParser.hpp and VamsLexer.hpp, too
# set locale to get antlr accepting OTHER_SPECIAL_CHARACTER (code >127)
$(TARGETCAP)Lexer.cpp + $(TARGETCAP)Parser.cpp: $(TARGET).g
	echo "___ creating $(TARGETCAP)Lexer.cpp + $(TARGETCAP)Parser.cpp"
	CLASSPATH=.:$(ANTLRROOT)/antlrall.jar \
	LC_ALL=en_US.ISO8859-1 \
	java antlr.Tool $(ANTLRTRACE) $(ANTLRDBG) $(ANTLRHTML) $<

TAGS:
	rm -f TAGS
	etags *.cpp *.h *.hpp

clean:
	$(RM) *.[do] $(TARGETCAP)* *~ .*~ gmon.out

distclean: clean
	$(RM) -r $(TARGET) TAGS

#-----------------------------------------------------------------------------
ifneq ($(MAKECMDGOALS),clean)
  ifneq ($(MAKECMDGOALS),distclean)
    -include $(CXXSRCS:.cpp=.d)
  endif
endif
