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
    private String situacao;
    private int cursadaEm;
    private int situacaoItem;
    private int frequencia;
    private double mediaFinal;
    private String situacaoFreq;

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
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public void setCursadaEm(int cursadaEm) {
        this.cursadaEm = cursadaEm;
    }
    public void setSituacaoItem(int situacaoItem) {
        this.situacaoItem = situacaoItem;
    }
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    public void setSituacaoFreq(String situacaoFreq) {
        this.situacaoFreq = situacaoFreq;
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
    public String getSituacao() {
        return this.situacao;
    }
    public int getCursadaEm() {
        return this.cursadaEm;
    }
    public int getSituacaoItem() {
        return this.situacaoItem;
    }
    public int getFrequencia() {
        return this.frequencia;
    }
    public double getMediaFinal() {
        return this.mediaFinal;
    }
    public String getSituacaoFreq() {
        return this.situacaoFreq;
    }
    public Materia(){}

    public Materia(String codCurso, String numVersao, String codDisciplina, String nome, int periodo, int numHoras, String tipoDisciplina, int chTotal, String situacao) {
        setCodCurso(codCurso);
        setNumVersao(numVersao);
        setCodDisciplina(codDisciplina);
        setNome(nome);
        setPeriodo(periodo);
        setNumHoras(numHoras);
        setTipoDisciplina(tipoDisciplina);
        setChTotal(chTotal);
        setSituacao(situacao);
    }

    public Materia(String numVersao, int cursadaEm, int mediaFinal, int situacaoItem, int periodo, String situacao, String codDisciplina, String nome, int chTotal,String tipoDisciplina, int frequencia, String situacaoFreq) {
        setNumVersao(numVersao);
        setCursadaEm(cursadaEm);
        setMediaFinal(mediaFinal);
        setSituacaoItem(situacaoItem);
        setPeriodo(periodo);
        setSituacao(situacao);
        setCodDisciplina(codDisciplina);
        setNome(nome);
        setChTotal(chTotal);
        setTipoDisciplina(tipoDisciplina);
        setFrequencia(frequencia);
        setSituacaoFreq(situacaoFreq);
    }


}
