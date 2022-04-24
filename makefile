JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = biblioteca/Aluno.java biblioteca/Leitor.java biblioteca/Grade.java biblioteca/Materia.java biblioteca/PedidoQuebra.java ProgramaPrincipal.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class