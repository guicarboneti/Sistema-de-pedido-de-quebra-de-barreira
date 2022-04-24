package biblioteca;

import java.io.*;
import java.util.*;

public class PedidoQuebra {
    private ArrayList<Materia> materiasBarreiraNaoCursadas;
    private ArrayList<Materia> materiasSolicitadas;
    private int materiasObrigatoriasFaltantes;
    private int materiasOptativasFaltantes;
    private String justificativa;

    public void setMateriasBarreiraNaoCursadas(ArrayList<Materia> materiasBarreiraNaoCursadas){
        this.materiasBarreiraNaoCursadas = materiasBarreiraNaoCursadas;
    }
    public ArrayList<Materia> getMateriasBarreiraNaoCursadas(){
        return this.materiasBarreiraNaoCursadas;
    }
    public void setMateriasSolicitadas(ArrayList<Materia> materiasSolicitadas){
        this.materiasSolicitadas = materiasSolicitadas;
    }
    public ArrayList<Materia> getMateriasSolicitadas(){
        return this.materiasSolicitadas;
    }
    public void setMateriasObrigatoriasFaltantes(int materiasObrigatoriasFaltantes){
        this.materiasObrigatoriasFaltantes = materiasObrigatoriasFaltantes;
    }
    public int getMateriasObrigatoriasFaltantes(){
        return this.materiasObrigatoriasFaltantes;
    }
    public void setMateriasOptativasFaltantes(int materiasOptativasFaltantes){
        this.materiasOptativasFaltantes = materiasOptativasFaltantes;
    }
    public int getMateriaisOptativasFaltantes(){
        return this.materiasOptativasFaltantes;
    }
    public void setJustificativa(String justificativa){
        this.justificativa = justificativa;
    }
    public String getJustificativa(){
        return this.justificativa;
    }

    public PedidoQuebra(ArrayList<Materia> materiasBarreiraNaoCursadas, ArrayList<Materia> materiasSolicitadas, int materiasObrigatoriasFaltantes, int materiasOptativasFaltantes, String justificativa){
        setMateriasBarreiraNaoCursadas(materiasBarreiraNaoCursadas);
        setMateriasSolicitadas(materiasSolicitadas);
        setMateriasObrigatoriasFaltantes(materiasObrigatoriasFaltantes);
        setMateriasOptativasFaltantes(materiasOptativasFaltantes);
        setJustificativa(justificativa);
    }


}
