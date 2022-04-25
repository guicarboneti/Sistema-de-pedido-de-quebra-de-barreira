package biblioteca;

public class Aluno {
    private String nome;
    private int periodoAtual;
    private double ira;
    private Historico historico;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeriodo(int periodo) {
        this.periodoAtual = periodo;
    }

    public void setIra(double ira) {
        this.ira = ira;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPeriodo() {
        return this.periodoAtual;
    }

    public double getIra() {
        return this.ira;
    }

    public Aluno(){}

    public Aluno(String nome,int periodoAtual, String file){
        this.historico = new Historico(file);
        this.nome = nome;
        this.periodoAtual = periodoAtual;
        this.ira = this.historico.getIra();
    }

    public void imprimeAluno(){
        System.out.println("=========== Dados do Aluno ===========");

        System.out.println("Nome: " + this.nome);
        System.out.println("Período Atual: " + this.periodoAtual);
        System.out.println("Ira: " + this.ira);
        this.historico.imprimeMateriasCursadas();
        this.historico.imprimeMateriasMatriculadas();
        this.historico.imprimeMateriasUltimoPeriodo();
    }
}
