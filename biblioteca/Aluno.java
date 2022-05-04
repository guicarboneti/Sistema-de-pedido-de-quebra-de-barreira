package biblioteca;

public class Aluno {
    private String nome;
    private int periodoAtual;
    private double ira;
    private String grr;
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

    public void setGrr(String grr) {
        this.grr = grr;
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

    public String getGrr() {
        return this.grr;
    }

    public Historico getHistorico() {
        return this.historico;
    }

    public Aluno(){}

    public Aluno( String file, Grade grade){
        this.historico = new Historico(file, grade);
        this.ira = this.historico.getIra();
    }

    public void imprimeAluno(Grade grade){
        System.out.println("=========== Dados do Aluno ===========");

        System.out.println("Nome: " + this.nome);
        System.out.println("Período Atual: " + this.periodoAtual);
        System.out.println("Ira: " + this.ira);

        this.historico.imprimeMateriasCursadas();
        this.historico.imprimeMateriasMatriculadas();
        this.historico.imprimeMateriasUltimoPeriodo();
        this.historico.imprimeMateriaNaoCursadas();
        this.historico.imprimeGradeAluno();

    }
}
