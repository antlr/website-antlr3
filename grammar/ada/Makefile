###############################################################################
# $Id: $
###############################################################################

G_FILES := ada.g ada.tree.g

lexer_g_FILES := AdaLexer.cpp AdaLexer.hpp \
	AdaTokenTypes.hpp AdaTokenTypes.txt
ada_g_FILES := AdaParser.cpp AdaParser.hpp
ada_tree_g_FILES := AdaTreeParserSuper.cpp AdaTreeParserSuper.hpp \
	AdaTreeParserSuperTokenTypes.hpp AdaTreeParserSuperTokenTypes.txt


B_NAME := ada
B_OBJS := Main.o AdaLexer.o AdaParser.o AdaTreeParserSuper.o adasupport.o

C_TARGETS := $(lexer_g_FILES) $(ada_g_FILES) $(ada_tree_g_FILES)

ifndef TOPDIR
TOPDIR  = $(shell pwd)/../../..
endif

include $(TOPDIR)/scripts/Config.make
include $(TOPDIR)/scripts/Rules.make

# Antlr deps.
EXTRA_LIBS := $(ANTLR_LIBS)
EXTRA_CXXFLAGS := $(ANTLR_INCS)

# DO NOT DELETE

Main.o: AdaLexer.hpp AdaTokenTypes.hpp AdaParser.hpp AdaTreeParserSuper.hpp
# Main.o: AdaParserTokenTypes.hpp
AdaLexer.o: AdaLexer.hpp AdaTokenTypes.hpp
AdaParser.o: AdaParser.hpp # AdaParserTokenTypes.hpp
AdaTreeParserSuper.o: AdaTreeParserSuper.hpp
adasupport.o: ada.g

