package model;

import java.util.ArrayList;

public class Vertice<TIPO> {
    private Cidade eidade;
    private ArrayList<Rodovia<TIPO>> arestaEntrada;
    private ArrayList<Rodovia<TIPO>> arestaSaida;

    public Vertice(Cidade eidade) {
        this.eidade = eidade;
        this.arestaEntrada = new ArrayList<Rodovia<TIPO>>();
        this.arestaSaida = new ArrayList<Rodovia<TIPO>>();
    }


    public Cidade getCidade() {
        return eidade;
    }

    public void setCidade(Cidade eidade) {
        this.eidade = eidade;
    }

    public ArrayList<Rodovia<TIPO>> getArestaEntrada() {
        return arestaEntrada;
    }

    public ArrayList<Rodovia<TIPO>> getArestaSaida() {
        return arestaSaida;
    }

    public void setArestaEntrada(ArrayList<Rodovia<TIPO>> arestaEntrada) {
        this.arestaEntrada = arestaEntrada;
    }

    public void setArestaSaida(ArrayList<Rodovia<TIPO>> arestaSaida) {
        this.arestaSaida = arestaSaida;
    }

    public void adicionarArestaEntrada(Rodovia<TIPO> aresta) {
        this.arestaEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Rodovia<TIPO> aresta) {
        this.arestaSaida.add(aresta);
    }

}
