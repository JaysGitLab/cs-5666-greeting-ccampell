#
# makefile
# input file for 'make' build tool ( /usr/bin/make )
# to build solution for CS 5666 Greeting Project
#
# @author: Chris Campell
# @version: 2/1/2017
#

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: greeting/Hello.java junit/HelloTest.java
	javac -cp .:$(JUNIT_JAR) junit/HelloTest.java
	javac greeting/Hello.java

clean:
	rm -f greeting/Hello.class
	rm -f junit/HelloTest.class

test: greeting/Hello.class junit/HelloTest.class
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore junit.HelloTest

