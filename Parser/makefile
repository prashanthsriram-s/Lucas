all: test
antlrlib := antlr-4.11.1-complete.jar
TEST_DIR := testcases
antlr4 := java -Xmx500M -cp "$(antlrlib):$$CLASSPATH" org.antlr.v4.Tool
grun := java -Xmx500M -cp "$(antlrlib):$$CLASSPATH" org.antlr.v4.gui.TestRig
test: compile
	$(grun) LucasGrammar compilationUnit test.txt -gui
compile:
	$(antlr4) LucasGrammar.g4
	javac -classpath "$(antlrlib):$$CLASSPATH" LucasGrammar*.java
.PHONY: clean
clean:
	rm *.tokens
	rm *.java
	rm *.interp
	rm *.class