JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = biblioteca/Aluno.java biblioteca/Leitor.java biblioteca/Grade.java biblioteca/Materia.java biblioteca/Historico.java biblioteca/PedidoQuebra.java biblioteca/RegrasColegiado.java ProgramaPrincipal.java Form.java controller/CheckBoxesController.java controller/PedidoController.java view/VisualizacaoUsuario.java  view/FormEdit.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class