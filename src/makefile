FLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Snowman.java \
	SnowFlake.java \
	SnowFlakeManager.java \
	SnowmanPanel.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
	
