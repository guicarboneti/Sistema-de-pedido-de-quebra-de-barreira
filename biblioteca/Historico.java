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
    // ArrayPeriodos = [ [ ArrayList do 1º período ],[ ArrayList do 2º período ],[ ArrayList do 3º período ] ] 
    ArrayList<ArrayList<Materia>> gradeAluno = new ArrayList<ArrayList<Materia> >(3);

    public Historico(String file) {
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

            System.out.println("Ultimo ano" + ultimoAno);

            this.setMateriasUltimoPeriodo(ultimoAno, 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    };

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
    
    // public void imprimeGradeAluno(){

    //     for (int i = 0; i < gradeAluno.size(); i++) {
    //         for (int j = 0; j < gradeAluno.get(i).size(); j++) {
    //             System.out.print(gradeAluno.get(i).get(j) + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    public double getIra() {
        double notasTotal = 0;
        int cargaHorariaTotal = 0;

        for (Materia m : this.materiasCursadas) {
            notasTotal = notasTotal + m.getChTotal() * m.getMediaFinal();
            cargaHorariaTotal = cargaHorariaTotal + m.getChTotal();
        }

        return (notasTotal / (cargaHorariaTotal * 100));
    }

    public Materia getMateriaAluno(String codigo) {
        Materia retornoNull = new Materia();

        for (Materia m : this.materiasCursadas) {
            if(m.getCodDisciplina().equals(codigo))
                return m;
        }
        return retornoNull;
    }

    public void setGradeAluno(Grade grade){
        Materia materiaAux;

        ArrayList<Materia> periodo1 = new ArrayList<Materia>();
        ArrayList<Materia> periodo2 = new ArrayList<Materia>();
        ArrayList<Materia> periodo3 = new ArrayList<Materia>();

        for (Materia m : grade.getGradeBcc()) {

            materiaAux = getMateriaAluno(m.getCodDisciplina());
            if((materiaAux.getCodDisciplina().isEmpty()) || (materiaAux.getCodDisciplina() == null))
                    materiaAux = m; 

            switch (materiaAux.getPeriodo()){
            case 1:
                periodo2.add(materiaAux);
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

    public int getAprovacaoUltimoPeriodo() {
        return 100;
    }

    public int getQtdReprovacaoFalta() {
        return 100;
    }
}
