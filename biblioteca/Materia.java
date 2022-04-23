package biblioteca;
public class Materia {
    private String cod_curso;
    private String num_versao;
    private String cod_disciplina;
    private String nome;
    private int periodo;
    private int num_horas;
    private String tipo_disciplina;
    private int ch_total;
    private String status;

    public void setCodCurso(String cod_curso) {
        this.cod_curso = cod_curso;
    }
    public void setNumVersao(String num_versao) {
        this.num_versao = num_versao;
    }
    public void setCodDisciplina(String cod_disciplina) {
        this.cod_disciplina = cod_disciplina;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public void setNumHoras(int num_horas) {
        this.num_horas = num_horas;
    }
    public void setTipoDisciplina(String tipo_disciplina) {
        this.tipo_disciplina = tipo_disciplina;
    }
    public void setChTotal(int ch_total) {
        this.ch_total = ch_total;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getCodCurso() {
        return this.cod_curso;
    }
    public String getNumVersao() {
        return this.num_versao;
    }
    public String getCodDisciplina() {
        return this.cod_disciplina;
    }
    public String getNome() {
        return this.nome;
    }
    public int getPeriodo() {
        return this.periodo;
    }
    public int getNumHoras() {
        return this.num_horas;
    }
    public String getTipoDisciplina() {
        return this.tipo_disciplina;
    }
    public int getChTotal() {
        return this.ch_total;
    }
    public String getStatus() {
        return this.status;
    }

    public Materia(String cod_curso, String num_versao, String cod_disciplina, String nome, int periodo, int num_horas, String tipo_disciplina, int ch_total, String status) {
        setCodCurso(cod_curso);
        setNumVersao(num_versao);
        setCodDisciplina(cod_disciplina);
        setNome(nome);
        setPeriodo(periodo);
        setNumHoras(num_horas);
        setTipoDisciplina(tipo_disciplina);
        setChTotal(ch_total);
        setStatus(status);
    }

}
