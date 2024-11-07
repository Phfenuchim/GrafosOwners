package model;

import java.util.*;

public class GrafoBrasil<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Rodovia<TIPO>> Rodovia;
    public GrafoBrasil(){
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

    // Método de busca em largura
    public void BuscaEmLargura(int n){
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        Queue<Vertice<TIPO>> fila = new LinkedList<>();
        Vertice<TIPO> atual = this.vertices.get(n);
        marcados.add(atual);
        System.out.println(atual.getCidade());
        fila.add(atual);
        while(fila.size()>0){
            Vertice<TIPO> visitado =fila.poll();
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

    // Método para imprimir as cidades
    public void imprimirVertice(){
        try {
            for (int i = 0; i < vertices.size(); i++) {
                System.out.println(vertices.get(i).getCidade());
            }
        }catch (Exception e){
            System.out.println();
        }
    }

    // Método para pegar o id
    public int buscaId(String idCidade){
        for(int i = 0; i<= vertices.size();i++){
            if(vertices.get(i).getCidade().getIdEst().equals(idCidade)){
                return i ;
            }
        }
        return -1;
    }

    // Método de busca em largura
    public void caminhosPossiveis(String n) {
        try {
            BuscaEmLargura(buscaId(n));
        } catch (Exception e) {
            System.out.println();
        }

    }

    // Método de busca dijkstra
    private void dijkstra(String idInicio, String idFim) {
        Vertice<TIPO> inicio = getVertice((TIPO) idInicio);
        Vertice<TIPO> fim = getVertice((TIPO) idFim);

        if (inicio == null || fim == null) {
            System.out.println("Cidades inválidas.");
            return;
        }

        Map<Vertice<TIPO>, Double> distancias = new HashMap<>();
        Map<Vertice<TIPO>, Vertice<TIPO>> antecessores = new HashMap<>();
        PriorityQueue<Vertice<TIPO>> fila = new PriorityQueue<>(
                (v1, v2) -> Double.compare(distancias.get(v1), distancias.get(v2))
        );

        for (Vertice<TIPO> vertice : vertices) {
            distancias.put(vertice, Double.MAX_VALUE);
        }
        distancias.put(inicio, 0.0);
        fila.add(inicio);

        while (!fila.isEmpty()) {
            Vertice<TIPO> atual = fila.poll();

            if (atual == fim) break;

            for (Rodovia<TIPO> rodovia : atual.getArestaSaida()) {
                Vertice<TIPO> vizinho = rodovia.getFim();
                double peso = rodovia.getKm();  // Usa apenas a distância em km
                double novaDistancia = distancias.get(atual) + peso;

                if (novaDistancia < distancias.get(vizinho)) {
                    distancias.put(vizinho, novaDistancia);
                    antecessores.put(vizinho, atual);
                    fila.add(vizinho);
                }
            }
        }

        //Exibir distancia por km
        if (distancias.get(fim) == Double.MAX_VALUE) {
            System.out.println("Não existe caminho entre as cidades especificadas.");
        } else {
            System.out.println("\nCaminho com menor distância:");
            exibirCaminho(inicio, fim, antecessores);
            System.out.println("Total km: " + distancias.get(fim));
        }
    }

    private void exibirCaminho(Vertice<TIPO> inicio, Vertice<TIPO> fim, Map<Vertice<TIPO>, Vertice<TIPO>> antecessores) {
        ArrayList<Vertice<TIPO>> caminho = new ArrayList<>();
        for (Vertice<TIPO> vertice = fim; vertice != null; vertice = antecessores.get(vertice)) {
            caminho.add(0, vertice);
        }

        for (Vertice<TIPO> vertice : caminho) {
            System.out.print(vertice.getCidade().getNome());
            if (vertice != fim) System.out.print(" -> ");
        }
        System.out.println();
    }

    // Método para buscar o caminho com busca de profundidade
    private boolean buscaProfundidadeRecursiva(Vertice<TIPO> atual, Vertice<TIPO> fim, ArrayList<Vertice<TIPO>> visitados, String caminho) {
        caminho += atual.getCidade().getNome();
        visitados.add(atual);

        if (atual == fim) {
            System.out.println("\nCaminho encontrado:\n " + caminho);
            return true;
        }

        for (Rodovia<TIPO> rodovia : atual.getArestaSaida()) {
            Vertice<TIPO> vizinho = rodovia.getFim();

            if (!visitados.contains(vizinho)) {
                boolean encontrado = buscaProfundidadeRecursiva(vizinho, fim, visitados, caminho + " -> ");
                if (encontrado) return true;
            }
        }
        return false;
    }

    // Método para encontrar o caminho com busca de profundidade
    public void buscaProfundidade(String idInicio, String idFim) {
        Vertice<TIPO> inicio = getVertice((TIPO) idInicio);
        Vertice<TIPO> fim = getVertice((TIPO) idFim);

        if (inicio == null || fim == null) {
            System.out.println("Cidades inválidas.");
            return;
        }

        ArrayList<Vertice<TIPO>> visitados = new ArrayList<>();
        boolean encontrado = buscaProfundidadeRecursiva(inicio, fim, visitados, "");

        if (!encontrado) {
            System.out.println("Não existe caminho entre as cidades especificadas.");
        }
    }

    // Método para encontrar o caminho com menor tempo
    public void menorTempo(String idInicio, String idFim) {
        dijkstra(idInicio, idFim);
    }
}
