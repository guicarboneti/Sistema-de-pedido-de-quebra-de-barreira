package biblioteca;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Grade {
    private static Scanner input;
    public ArrayList<Materia> gradeBcc = new ArrayList<Materia>();

    public Grade(String file, String versao) {
        try {
            input = new Scanner(Paths.get(file));
            Materia novaMateria;

            // ignora a primeira e segunda linha do cabeçalho
            input.nextLine();
            input.nextLine();

            while (input.hasNext()) {
                // Regex para usar como delimitador o ponto e vírgula (;) necessita de regex
                // pois o ";" está colado ao caracter
                String[] data = input.nextLine().split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                if (versao == "2011") {
                    // Lê colunas 0,1,3,5,6,7,8 e 10 da planilha da grade de 2011
                    novaMateria = new Materia(data[0], data[1], data[3], data[5],
                            (data[6] != null && !data[6].isEmpty() ? Integer.parseInt(data[6]) : 0),
                            (data[7] != null && !data[7].isEmpty() ? Integer.parseInt(data[7]) : 0),
                            data[8],
                            (data[10] != null && !data[10].isEmpty() ? Integer.parseInt(data[10]) : 0), "-");
                } else {
                    // Lê colunas 0,1,3,5,6,7,8 e 9 da planilha da grade de 2019
                    novaMateria = new Materia(data[0], data[1], data[3], data[5],
                            (data[6] != null && !data[6].isEmpty() ? Integer.parseInt(data[6]) : 0),
                            (data[7] != null && !data[7].isEmpty() ? Integer.parseInt(data[7]) : 0),
                            data[8],
                            (data[9] != null && !data[9].isEmpty() ? Integer.parseInt(data[9]) : 0), "-");
                }

                this.gradeBcc.add(novaMateria);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public void imprimeGrade() {
        System.out.println("Total de matérias: " + this.gradeBcc.size());
        for (Materia m : this.gradeBcc) {
            System.out.println("Código da matéria: " + m.getCodDisciplina() + " Matéria: " + m.getNome());
        }
    }

    public ArrayList<Materia> getGradeBcc(){
        return this.gradeBcc;
    }

}
