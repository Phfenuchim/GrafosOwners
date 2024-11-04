package model;

// Classe Vertice
import java.util.ArrayList;

public class Vertice<TIPO> {
    private Estacao estacao;
    private ArrayList<Linha<TIPO>> arestaEntrada;
    private ArrayList<Linha<TIPO>> arestaSaida;

    public Vertice(Estacao estacao) {
        this.estacao = estacao;
        this.arestaEntrada = new ArrayList<Linha<TIPO>>();
        this.arestaSaida = new ArrayList<Linha<TIPO>>();
    }


    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public ArrayList<Linha<TIPO>> getArestaEntrada() {
        return arestaEntrada;
    }

    public ArrayList<Linha<TIPO>> getArestaSaida() {
        return arestaSaida;
    }

    public void setArestaEntrada(ArrayList<Linha<TIPO>> arestaEntrada) {
        this.arestaEntrada = arestaEntrada;
    }


    public void setArestaSaida(ArrayList<Linha<TIPO>> arestaSaida) {
        this.arestaSaida = arestaSaida;
    }

    public void adicionarArestaEntrada(Linha<TIPO> aresta) {
        this.arestaEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Linha<TIPO> aresta) {
        this.arestaSaida.add(aresta);
    }





    
}
