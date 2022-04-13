JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = Aluno.java Leitor.java ListaMateria.java Materia.java PedidoQuebra.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class