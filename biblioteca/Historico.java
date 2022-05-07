package biblioteca;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Historico {
    private static Scanner input;

    private String file;
    private ArrayList<Materia> materiasCursadas = new ArrayList<Materia>();
    private ArrayList<Materia> materiasMatriculadas = new ArrayList<Materia>();
    private ArrayList<Materia> materiasUltimoPeriodo = new ArrayList<Materia>();
    private ArrayList<ArrayList<Materia>> materiasNaoCursadas = new ArrayList<ArrayList<Materia>>(8);
    public ArrayList<ArrayList<Materia>> gradeAluno = new ArrayList<ArrayList<Materia>>(3);

    public Historico(String file, Grade grade) {
        try {
            input = new Scanner(Paths.get(file));
            Materia novaMateria;

            this.file = file;

            // ignora a primeira e segunda linha do cabeçalho
            input.nextLine();
            input.nextLine();

            while (input.hasNext()) {
                // Regex para usar como delimitador o ponto e vírgula (;) necessita de regex
                // pois o ";" está colado ao caracter
                String[] data = input.nextLine().split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                // Lê colunas 5,6,7,8,9,10,11,12,13,14 e 15 da planilha de histórico do aluno
                novaMateria = new Materia(data[4],
                        (data[5] != null && !data[5].isEmpty() ? Integer.parseInt(data[5]) : 0),
                        (data[6] != null && !data[6].isEmpty() ? Integer.parseInt(data[6]) : 0),
                        (data[7] != null && !data[7].isEmpty() ? Integer.parseInt(data[7]) : 0),
                        (data[8] != null && !data[8].isEmpty() ? Character.getNumericValue(data[8].charAt(0)) : 0),
                        data[9], data[10], data[11],
                        (data[12] != null && !data[12].isEmpty() ? Integer.parseInt(data[12]) : 0),
                        data[13],
                        (data[14] != null && !data[14].isEmpty() ? Integer.parseInt(data[14]) : 0),
                        data[15]);

                if (novaMateria.getSituacaoFreq().equals("Matricula")) {
                    materiasMatriculadas.add(novaMateria);
                } else {
                    materiasCursadas.add(novaMateria);
                }
            }

            Materia materiaUltimoAno = materiasCursadas.stream().max(Comparator.comparing((v) -> v.getCursadaEm()))
                    .get();
            int ultimoAno = materiaUltimoAno.getCursadaEm();

            this.setMateriasUltimoPeriodo(ultimoAno, 1);
            this.setGradeAluno(grade);
            this.setMateriasOfertadasNaoCursadas(grade);

        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public ArrayList<Materia> getMateriasCursadas() {
        return materiasCursadas;
    }

    public double getIra() {
        double notasTotal = 0;
        int cargaHorariaTotal = 0;

        for (Materia m : this.materiasCursadas) {
            notasTotal = notasTotal + m.getChTotal() * m.getMediaFinal();
            cargaHorariaTotal = cargaHorariaTotal + m.getChTotal();
        }

        return (notasTotal / (cargaHorariaTotal * 100));
    }

    public Materia getMateriaAluno(String codigo, int periodo) {
        Materia retornoNull = new Materia();

        for (Materia m : this.materiasCursadas) {
            if (m.getCodDisciplina().equals(codigo)) {
                m.setPeriodo(periodo);
                return m;
            }
        }
        retornoNull.setCodDisciplina("NULL");

        return retornoNull;
    }

    public boolean verifyMateriasMatriculadas(String codigo) {
        for (Materia m : this.materiasMatriculadas) {
            if (m.getCodDisciplina().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public float getAprovacaoUltimoPeriodo() {
        float cont = 0;

        for (Materia m : this.materiasUltimoPeriodo) {
            if (m.getSituacao().equals("Aprovado"))
                cont++;
        }
        return cont;
    }

    public int getQtdReprovacaoFalta() {
        int cont = 0;

        for (Materia m : this.materiasUltimoPeriodo) {
            if (m.getSituacao().equals("Reprovado por Frequência"))
                cont++;
        }
        return cont;
    }

    public String getNumMaterias(Aluno aluno) {
        String desempenho = "";
        String numMaterias = "";
        desempenho = aluno.getHistorico().getDesempenhoUltPeriodo();
        if (aluno.getHistorico().getIra() > 0.8) {
            numMaterias = "todas as";
            return numMaterias;
        } else if (desempenho.equals("Bom")) {
            numMaterias = "5";
            return numMaterias;
        } else if (desempenho.equals("Medio")) {
            numMaterias = "4";
            return numMaterias;
        } else if (desempenho.equals("Ruim")) {
            numMaterias = "3";
            return numMaterias;
        }
        return numMaterias;
    }

    public String getDesempenhoUltPeriodo() {
        String desempenho = "";

        if (this.getAprovacaoUltimoPeriodo() > (2 * this.materiasCursadas.size() / 3))
            desempenho = "Bom";
        else if ((this.getAprovacaoUltimoPeriodo() >= (this.materiasCursadas.size() / 2))
                && (this.getAprovacaoUltimoPeriodo() <= (2 * this.materiasCursadas.size() / 3)))
            desempenho = "Medio";
        else if (this.getAprovacaoUltimoPeriodo() < (this.materiasCursadas.size() / 2))
            desempenho = "Ruim";

        return desempenho;
    }

    public void setGradeAluno(Grade grade) {
        Materia materiaAux;

        ArrayList<Materia> periodo1 = new ArrayList<Materia>();
        ArrayList<Materia> periodo2 = new ArrayList<Materia>();
        ArrayList<Materia> periodo3 = new ArrayList<Materia>();

        for (Materia m : grade.getGradeBcc()) {

            materiaAux = getMateriaAluno(m.getCodDisciplina(), m.getPeriodo());

            // Verifica se ele já cursou a matéria
            if ((materiaAux.getCodDisciplina().equals("NULL")))
                materiaAux = m;

            switch (materiaAux.getPeriodo()) {
                case 1:
                    periodo1.add(materiaAux);
                    break;
                case 2:
                    periodo2.add(materiaAux);
                    break;
                case 3:
                    periodo3.add(materiaAux);
                    break;
            }
        }

        this.gradeAluno.add(periodo1);
        this.gradeAluno.add(periodo2);
        this.gradeAluno.add(periodo3);
    }

    // Melhorar essa função (precisamos achar o último período de maneira otimizada)
    public void setMateriasUltimoPeriodo(int ano, int periodo) {
        for (Materia m : this.materiasCursadas) {
            if ((ano == m.getCursadaEm()) && (periodo == m.getPeriodo())) {
                this.materiasUltimoPeriodo.add(m);
            }
        }

        if (this.materiasUltimoPeriodo.size() == 0 && periodo != 2) {
            this.setMateriasUltimoPeriodo(ano, 2);
        }
    }

    public void imprimeMateriasUltimoPeriodo() {
        System.out.println("=========== Matérias do Último Período ===========");

        for (Materia m : this.materiasUltimoPeriodo) {
            System.out.println("Código Disciplina: " + m.getCodDisciplina());
            System.out.println("Matéria: " + m.getNome());
            System.out.println("Média Final: " + m.getMediaFinal());
        }
    }

    public void setMateriasOfertadasNaoCursadas(Grade grade) {

        ArrayList<Materia> periodo4 = new ArrayList<Materia>();
        ArrayList<Materia> periodo5 = new ArrayList<Materia>();
        ArrayList<Materia> periodo6 = new ArrayList<Materia>();
        ArrayList<Materia> periodo7 = new ArrayList<Materia>();
        ArrayList<Materia> periodo8 = new ArrayList<Materia>();

        for (Materia m : grade.getGradeBcc()) {

            switch (m.getPeriodo()) {
                case 4:
                    periodo4.add(m);
                    break;
                case 5:
                    periodo5.add(m);
                    break;
                case 6:
                    periodo6.add(m);
                    break;
                case 7:
                    periodo7.add(m);
                    break;
                case 8:
                    periodo8.add(m);
                    break;
            }
        }

        this.materiasNaoCursadas.add(periodo4);
        this.materiasNaoCursadas.add(periodo5);
        this.materiasNaoCursadas.add(periodo6);
        this.materiasNaoCursadas.add(periodo7);
        this.materiasNaoCursadas.add(periodo8);
    }

    public ArrayList<ArrayList<Materia>> getMateriasNaoCursadas() {
        return this.materiasNaoCursadas;
    }

    public void imprimeMateriaNaoCursadas() {
        System.out.println("=========== Matérias Não Cursadas ===========");

        for (int i = 0; i < this.materiasNaoCursadas.size(); i++) {
            for (int j = 0; j < this.materiasNaoCursadas.get(i).size(); j++) {
                System.out.println(
                        "Código Disciplina: " + this.materiasNaoCursadas.get(i).get(j).getCodDisciplina() + " ");
                System.out.println("Matéria: " + this.materiasNaoCursadas.get(i).get(j).getNome() + " ");
            }
            System.out.println();
        }
    }

    public void imprimeMateriasCursadas() {
        System.out.println("=========== Matérias Cursadas ===========");

        for (Materia m : this.materiasCursadas) {
            System.out.println("Código Disciplina: " + m.getCodDisciplina());
            System.out.println("Matéria: " + m.getNome());
            System.out.println("Média Final: " + m.getMediaFinal());
        }
    }

    public void imprimeMateriasMatriculadas() {
        System.out.println("=========== Matérias Matriculadas ===========");

        for (Materia m : this.materiasMatriculadas) {
            System.out.println("Código Disciplina: " + m.getCodDisciplina());
            System.out.println("Matéria: " + m.getNome());
        }
    }

    public void imprimeGradeAluno() {
        System.out.println("=========== Grade do Aluno ===========");
        int i, j, periodo;

        periodo = 1;

        for (i = 0; i < gradeAluno.size(); i++) {
            System.out.println(periodo + "º PERÍODO");
            for (j = 0; j < gradeAluno.get(i).size(); j++) {
                System.out.println(gradeAluno.get(i).get(j).getNome() + " - " + gradeAluno.get(i).get(j).getSituacao());
            }
            periodo++;
            System.out.println();
        }
    }
}
