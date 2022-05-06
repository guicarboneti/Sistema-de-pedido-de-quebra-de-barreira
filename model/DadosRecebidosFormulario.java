package model;

import java.util.ArrayList;
import biblioteca.Materia;

public class DadosRecebidosFormulario {
    private String nome;
    private String grr;
    private String caminhoHistorico;
    private String justificativa;
    private String periodoAtual;
    private ArrayList<String> materiasSolicitadas = new ArrayList<String>();
    private ArrayList<Materia> gradeAtual = new ArrayList<Materia>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setGrr(String grr) {
        this.grr = grr;
    }

    public String getGrr() {
        return this.grr;
    }

    public void setCaminho(String caminho) {
        this.caminhoHistorico = caminho;
    }

    public String getCaminho() {
        return this.caminhoHistorico;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setPeriodoAtual(String periodoAtual) {
        this.periodoAtual = periodoAtual;
    }

    public String getPeriodoAtual() {
        return this.periodoAtual;
    }

    public void setGradeAtual(ArrayList<Materia> grade) {
        this.gradeAtual = grade;
    }

    public ArrayList<Materia> getGradeAtual() {
        return this.gradeAtual;
    }

    public void adicionaDisciplina(String materia) {
        this.materiasSolicitadas.add(materia);
    }

    public ArrayList<String> retornaMateriasSolicitadas() {
        return this.materiasSolicitadas;
    }
}
