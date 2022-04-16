JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = Aluno.java Leitor.java Grade.java Materia.java PedidoQuebra.java ProgramaPrincipal.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class