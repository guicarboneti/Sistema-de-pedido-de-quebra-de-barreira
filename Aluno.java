// package aluno;

import java.io.*;
import java.util.*;

public class Aluno {
    private String nome;
    private int periodoAtual;
    private int ira;
    private ArrayList<Materia> materiasCursadas;
    private ArrayList<Materia> materiasMatriculadas;
    private ArrayList<Materia> materiasNaoCursadas;

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
