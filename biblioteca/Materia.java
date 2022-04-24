package biblioteca;
public class Materia {
    private String codCurso;
    private String numVersao;
    private String codDisciplina;
    private String nome;
    private int periodo;
    private int numHoras;
    private String tipoDisciplina;
    private int chTotal;
    private String status;

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }
    public void setNumVersao(String numVersao) {
        this.numVersao = numVersao;
    }
    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }
    public void setTipoDisciplina(String tipoDisciplina) {
        this.tipoDisciplina = tipoDisciplina;
    }
    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodCurso() {
        return this.codCurso;
    }
    public String getNumVersao() {
        return this.numVersao;
    }
    public String getCodDisciplina() {
        return this.codDisciplina;
    }
    public String getNome() {
        return this.nome;
    }
    public int getPeriodo() {
        return this.periodo;
    }
    public int getNumHoras() {
        return this.numHoras;
    }
    public String getTipoDisciplina() {
        return this.tipoDisciplina;
    }
    public int getChTotal() {
        return this.chTotal;
    }
    public String getStatus() {
        return this.status;
    }

    public Materia(String codCurso, String numVersao, String codDisciplina, String nome, int periodo, int numHoras, String tipoDisciplina, int chTotal, String status) {
        setCodCurso(codCurso);
        setNumVersao(numVersao);
        setCodDisciplina(codDisciplina);
        setNome(nome);
        setPeriodo(periodo);
        setNumHoras(numHoras);
        setTipoDisciplina(tipoDisciplina);
        setChTotal(chTotal);
        setStatus(status);
    }

}
