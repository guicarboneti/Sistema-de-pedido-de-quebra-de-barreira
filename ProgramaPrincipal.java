import biblioteca.Aluno;
import biblioteca.Grade;
import view.Form;

public class ProgramaPrincipal {

    public static void main(String args[]) {
        // Faz a leitura das grades
        Grade grade2011 = new Grade("planilhas/exemplo_trabalho_TAP_Disciplinas_2011.csv", "2011");
        Grade grade2019 = new Grade("planilhas/exemplo_trabalho_TAP_Disciplinas_2019.csv", "2019");

        // faz a leitura dos dados do aluno
        Aluno aluno = new Aluno("planilhas/exemplo_trabalho_TAP_historico.csv", grade2011);

        Form interfaceFormulario = new Form(aluno);
        interfaceFormulario.formScreen(aluno);

    }
}
