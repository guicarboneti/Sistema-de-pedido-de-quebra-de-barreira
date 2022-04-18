package biblioteca;

// import com.opencsv.CSVReader;
import java.io.*;
import java.util.*;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.ToString;

class Historico {
    private ArrayList<Materia> materiasCursadas;
    private ArrayList<Materia> materiasMatriculadas;
    private ArrayList<Materia> materiasNaoCursadas;

    // public void preencheHistorico() {
    // FileReader filereader = new FileReader(arquivo);

    // CSVReader csvReader - new CSVReader(filereader);
    // String[] nextRecord;

    // while((nextRecord))

    // // matricula, nome, codCUrso, nomeCurso, versao, ano, medialFinal,
    // situacaoItem,
    // // periodo, status, cod, nomeMateria, ch_total, tipo, frequencia

    // }
}

public class Aluno {
    // class Alunoo {
    private String nome;
    private int periodoAtual;
    private int ira;
    private Historico historico;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeriodo(int periodo) {
        this.periodoAtual = periodo;
    }

    public void setIra(int ira) {
        this.ira = ira;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPeriodo() {
        return this.periodoAtual;
    }

    public int getIra() {
        return this.ira;
    }
}

// public class Aluno {
// public static void main(String[] args) {
// try {
// String filePath = "historico.csv";
// FileReader fileReader = new FileReader(filePath);

// CSVReader openCsvReader = new CSVReader(fileReader);
// String[] record;

// while ((record = openCsvReader.readNext()) != null) {
// for (String token : record) {
// System.out.print(token + "\t");
// }
// System.out.println();
// }
// } catch (IOException e) {
// e.printStackTrace();
// }
// }
// }