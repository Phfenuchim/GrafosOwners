package model;

import java.util.ArrayList;

public class GrafoMetro<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Rodovia<TIPO>> Rodovia;
    public GrafoMetro(){


        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.Rodovia = new ArrayList<Rodovia<TIPO>>();
    }
    public void adicionarVertice(Cidade cidade){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(cidade);
        this.vertices.add(novoVertice);
    }
    public void adicionarAresta(int nRodovia,String nomeRodovia,Double tempo,Double km,TIPO dadoInicio,TIPO dadofim){
        Vertice <TIPO> inicio = this.getVertice(dadoInicio);
        Vertice <TIPO> fim = this.getVertice(dadofim);
        Rodovia <TIPO> Rodovia = new Rodovia<TIPO>(nRodovia,nomeRodovia,tempo,km,inicio,fim);
        inicio.adicionarArestaSaida(Rodovia);
        fim.adicionarArestaEntrada(Rodovia);
        this.Rodovia.add(Rodovia);
    }
    public Vertice<TIPO>getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for (int i=0;i<this.vertices.size();i++){
            if (this.vertices.get(i).getCidade().getIdEst().equals(dado)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    public void BuscaEmLargura(int n){
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.vertices.get(n);
        marcados.add(atual);
        System.out.println(atual.getCidade());
        fila.add(atual);
        while(fila.size()>0){
            Vertice<TIPO> visitado =fila.get(0);
            for(int i=0;i<visitado.getArestaSaida().size();i++){
                Vertice<TIPO> proximo=visitado.getArestaSaida().get(i).getFim();
                if (!marcados.contains(proximo)) {
                    marcados.add(proximo);
                    System.out.println(proximo.getCidade());
                    fila.add(proximo);
                }
                fila.remove(0);
            }
        
        }

    }

    public void imprimirVertice()
    {
        try {


        for (int i = 0; i<= vertices.size();i++) {
            System.out.println(vertices.get(i).getCidade());
        }
        }catch (Exception e){
            System.out.println();
        }
    }

    public int buscaId(String idCidade){
        for(int i = 0; i<= vertices.size();i++){
            if(vertices.get(i).getCidade().getIdEst().equals(idCidade)){
                return i ;
            }
        }
        return -1;
    }

    public void caminhosPossiveis(String n) {
        try {
            BuscaEmLargura(buscaId(n));
        } catch (Exception e) {
            System.out.println();
        }

    }
}
