import biblioteca.Aluno;
import biblioteca.Grade;
import biblioteca.RegrasColegiado;

public class ProgramaPrincipal {

    public static void main(String args[]) {
        // Faz a leitura das grades
        Grade grade2011 = new Grade("planilhas/exemplo_trabalho_TAP_Disciplinas_2011.csv", "2011");
        // grade2011.imprimeGrade();

        Grade grade2019 = new Grade("planilhas/exemplo_trabalho_TAP_Disciplinas_2019.csv", "2019");
        // grade2019.imprimeGrade();

        // faz a leitura dos dados do aluno
        Aluno aluno = new Aluno("Thiago",5,"planilhas/exemplo_trabalho_TAP_historico.csv",grade2011);
        aluno.imprimeAluno(grade2011);

        Form interfaceFormulario = new Form();
        interfaceFormulario.formScreen();
        // RegrasColegiado regrasColegiado = new RegrasColegiado();
        // if (regrasColegiado.testaRegras(aluno, pedidoQuebra))
        //     System.out.println("Podem ser concedidas " + regrasColegiado.getNumMaterias(aluno) + " matrículas");

    }
}
