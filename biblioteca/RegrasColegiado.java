package biblioteca;

public class RegrasColegiado {
    private String numMaterias;
    public String desempenho;

    public void setnumMaterias(String numMaterias) {
        this.numMaterias = numMaterias;
    }
    public void setDesempenho(String desempenho) {
        this.desempenho = desempenho;
    }

    public String getNumMaterias(Aluno aluno) {
        setDesempenho(aluno.getHistorico().getDesempenhoUltPeriodo());
        if (aluno.getHistorico().getIra() > 0.8)
            setnumMaterias("Todos os pedidos de matrícula serão aceitos");
        else if (this.desempenho.equals("Bom"))
            setnumMaterias("5");
        else if (this.desempenho.equals("Medio"))
            setnumMaterias("4");
        else if (this.desempenho.equals("Ruim"))
            setnumMaterias("3");

        return this.numMaterias;
    }

    public Boolean cursouMateria(Aluno aluno, String codDisciplina) {
        for (Materia m : aluno.getHistorico().getMateriasCursadas()) {
            if (m.getCodDisciplina().equals(codDisciplina))
                return true;
        }
        return false;
    }

    // retorna false caso alguma regra é quebrada e imprime o erro. Retorna true caso contrário
    public Boolean testaRegras(Aluno aluno, PedidoQuebra pedidoQuebra) {
        for (Materia m : pedidoQuebra.getMateriasSolicitadas()) {
            if (m.getCodDisciplina().equals("CI215") && !cursouMateria(aluno, "CI212")) {
                System.out.println("Não é concedida quebra de CI212 para CI215");
                return false;
            }
            else if (!m.getTipoDisciplina().equals("Obrigatórias")) {
                System.out.println("Não é concedida quebra para optativas");
                return false;
            }
        }
        return true;
    }

}
