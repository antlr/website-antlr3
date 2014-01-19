@echo off
rem -------------------------------------------------------------------
rem MSDOS batch file to compile cim22Grammar.
rem by Pedro Assis, v0.1, 2000.11
rem passis@dee.isep.ipp.pt
rem -------------------------------------------------------------------
:test1
if exist cim22.java goto :test2
echo Can't find cim22.java file! Exiting.
goto :end
:test2
if exist cim22Grammar.g goto :compile
echo Can't find cim22Grammar.g file! Exiting.
goto :end
rem -------------------------------------------------------------------
:compile
java antlr.Tool cim22Grammar.g
javac *.java
:end
::  Kind regards, Pedro. [http://www.dee.isep.ipp.pt/~passis]
::
