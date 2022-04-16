import java.util.ArrayList;

public class Grade {
    public static ArrayList <Materia> grade2019; 
    public static ArrayList <Materia> grade2011; 

    public Grade(String codigoCurso, Integer ano, String descEstrutura, String codigoDisciplina, String nomeUnidade, String disciplina, String periodoIdeal, Integer numHoras, String tipo, String versao, Integer cargaTotal){
        // Materia novaMateria = new Materia(codigoCurso, ano, descEstrutura,  codigoDisciplina,  nomeUnidade,  disciplina,  periodoIdeal,  numHoras,  tipo,  versao,  cargaTotal);

        // if(ano == 2019)
        //     grade2019.add(novaMateria);
        // else if(ano == 2011)
        //     grade2011.add(novaMateria);

    }

    public void imprimeGrade(String ano){
        System.out.println("Tamanho de matérias: "+grade2019.size());

        for(Materia m: grade2019){
            // System.out.println("Matéria: "+m.getDisciplina());
            // System.out.println("Matéria: "+m.codigoDisciplina());
        }
    }

    

}
