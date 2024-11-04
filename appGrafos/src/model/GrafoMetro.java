package model;

import java.util.ArrayList;

public class GrafoMetro<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Linha<TIPO>> linha;
    public GrafoMetro(){
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.linha = new ArrayList<Linha<TIPO>>();
    }
    public void adicionarVertice(Estacao estacao){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(estacao);
        this.vertices.add(novoVertice);
    }
    public void adicionarAresta(int nLinha, TIPO dadoInicio,TIPO dadofim,Double tempo){
        Vertice <TIPO> inicio = this.getVertice(dadoInicio);
        Vertice <TIPO> fim = this.getVertice(dadofim);
        Linha <TIPO> linha = new Linha<TIPO>(nLinha,inicio,fim,tempo);
        inicio.adicionarArestaSaida(linha);
        fim.adicionarArestaEntrada(linha);
        this.linha.add(linha);
    }
    public Vertice<TIPO>getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for (int i=0;i<this.vertices.size();i++){
            if (this.vertices.get(i).getEstacao().getIdEst()==(Integer) dado){
                vertice = this.vertices.get(i);
            }
        }
        return vertice;
    }



}
