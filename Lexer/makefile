all: test
antlrlib := /usr/local/lib/antlr-4.11.1-complete.jar
TEST_DIR := testcases
antlr4 := java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$$CLASSPATH" org.antlr.v4.Tool
grun := java -Xmx500M -cp "/usr/local/lib/antlr-4.11.1-complete.jar:$$CLASSPATH" org.antlr.v4.gui.TestRig
test: compile
	echo "------------------"
	echo "First Test Case"
	$(grun) LucasLexer tokens -tokens < $(TEST_DIR)/test1.txt
	echo "------------------"
	echo "Second Test Case"
	$(grun) LucasLexer tokens -tokens < $(TEST_DIR)/test2.txt
	echo "------------------"
	echo "Third Test Case"
	$(grun) LucasLexer tokens -tokens < $(TEST_DIR)/test3.txt
	echo "------------------"
	echo "Fourth Test Case"
	$(grun) LucasLexer tokens -tokens < $(TEST_DIR)/test4.txt
	
compile: prerequisite
	$(antlr4) LucasLexer.g4
	javac -classpath "/usr/local/lib/antlr-4.11.1-complete.jar:$$CLASSPATH" LucasLexer*.java
prerequisite:
	export PATH="$$PATH:/usr/local/lib/antlr-4.11.1-complete.jar"
.PHONY: clean
clean:
	rm *.tokens
	rm *.java
	rm *.interp
	rm *.class