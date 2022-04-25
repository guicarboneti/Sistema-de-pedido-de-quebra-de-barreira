import biblioteca.Aluno;
import biblioteca.Grade;

public class ProgramaPrincipal {

    public static void main(String args[]) {
        // Faz a leitura das grades
        Grade grade2011 = new Grade("planilhas/exemplo_trabalho_TAP_Disciplinas_2011.csv", "2011");
        grade2011.imprimeGrade();

        Grade grade2019 = new Grade("planilhas/exemplo_trabalho_TAP_Disciplinas_2019.csv", "2019");
        grade2019.imprimeGrade();

        // faz a leitura dos dados do aluno
        Aluno aluno = new Aluno("Thiago",5,"planilhas/exemplo_trabalho_TAP_historico.csv");
        aluno.imprimeAluno();

    }
}
