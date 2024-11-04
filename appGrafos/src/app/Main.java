package app;
// Exemplo de uso com as estações de metrô de São Paulo

import model.*;;

public class Main {
    public static void main(String[] args) {
        GrafoMetro<String> grafo = new GrafoMetro<String>();

        // Adicionando estações de metrô de São Paulo com nome e linha
        grafo.adicionarVertice(new Estacao( 1,"Sé", "Linha Vermelha"));
        grafo.adicionarVertice(new Estacao("2", "Liberdade", "Linha Azul"));
        grafo.adicionarVertice(new Estacao("3", "Paraíso", "Linha Azul"));
        grafo.adicionarVertice(new Estacao("4", "Brigadeiro", "Linha Verde"));
        grafo.adicionarVertice(new Estacao("5", "Ana Rosa", "Linha Azul"));
        grafo.adicionarVertice(new Estacao("6", "Vila Mariana", "Linha Azul"));
        grafo.adicionarVertice(new Estacao("7", "Santa Cruz", "Linha Azul"));

        // Adicionando arestas entre estações com pesos e tempos de trajeto
        grafo.adicionarAresta(2, "1", "2", 10.0); // Sé - Liberdade
        grafo.adicionarAresta(3, 2, 3, 3.0); // Liberdade - Paraíso
        grafo.adicionarAresta(4.0, 3, 4, 4.5); // Paraíso - Brigadeiro
        grafo.adicionarAresta(3.0, 3, 5, 3.5); // Paraíso - Ana Rosa
        grafo.adicionarAresta(2.0, 5, 6, 2.0); // Ana Rosa - Vila Mariana
        grafo.adicionarAresta(3.5, 6, 7, 3.2); // Vila Mariana - Santa Cruz

        System.out.println("Grafo de estações de metrô de São Paulo criado com sucesso!");
        // Aqui podem ser implementadas funções para buscar rotas, calcular menor caminho, etc.
    }
}
