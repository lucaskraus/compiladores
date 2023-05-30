@echo off

SET ANTLR_PATH=C:\Users\lucaska\Desktop\compiladores-projeto\antlr-4.12.0-complete.jar
SET CLASSPATH=.;%ANTLR_PATH%;%CLASSPATH%

java org.antlr.v4.gui.TestRig %*