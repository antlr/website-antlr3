@echo off
rem -------------------------------------------------------------------
rem MSDOS batch file to run cim22Grammar.
rem by Pedro Assis, v0.1, 2000.11
rem passis@dee.isep.ipp.pt
rem -------------------------------------------------------------------
cls
echo CIM Specification V2.2 Parser Tool, by Pedro Assis 2000-01
:test1
if exist cim22.class goto :test2
echo This batch file requires Java and ANTLR package instaled in your system.
echo Can't find cim22.class file! Exiting.
goto :end
:test2
if exist cim22Lexer.class goto :test3
echo This batch file requires Java and ANTLR package instaled in your system.
echo Can't find cim22Lexer.class file! Exiting.
goto :end
:test3
if exist cim22Parser.class goto :test4
echo This batch file requires Java and ANTLR package instaled in your system.
echo Can't find cim22Parser.class file! Exiting.
goto :end
:test4
if exist cim22ParserTokentypes.class goto :menu
echo This batch file requires Java and ANTLR package instaled in your system.
echo Can't find cim22Lexer.class file! Exiting.
goto :end
rem -------------------------------------------------------------------
:menu
echo go batch file menu:
echo 1 - Parse the Interop version 2.6 scheme (2.6\CIM_Interop26.mof)
echo 2 - Parse the full CIM Schema version 2.6 (2.6\ directory)
choice /c:12
if errorlevel 2 goto :dir
if errorlevel 1 goto :file
goto :end
rem -------------------------------------------------------------------
rem This command parses the CIM_Interop26.mof in the current directory.
rem If errors are detected they are stored in the output file 
rem 2.6\p_CIM_Interop26.mof. This file includes all
rem lexer, parser rules outputs, and eventually parsing errors
rem indications.
:file
if exist 2.6\p_CIM_Interop26.mof.txt del 2.6\p_CIM_Interop26.mof.txt
if exist 2.6\CIM_Interop26.mof goto :exec1
echo Can't find 2.6\CIM_Interop26.mof file! Exiting.
goto :end
:exec1
java cim22 2.6\CIM_Interop26.mof -lt -pt -ct
goto :end
rem -------------------------------------------------------------------
rem The following commands parses all the mof files in the the 2.6\
rem directory. The output files will be stored in this directory and
rem named after the file name, with the prefix "p_" and ".txt" suffix. 
rem The output files will contain the error messages (if any).
:dir
if exist 2.6\p_*.mof.txt del 2.6\p_*.mof.txt
if exist 2.6\*.mof goto :exec2
echo Can't find 2.6\ directory! Exiting.
goto :end
:exec2
java cim22 2.6\
:end
::  Kind regards, Pedro. [http://www.dee.isep.ipp.pt/~passis]
::
