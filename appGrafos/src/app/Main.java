package app;
// Exemplo de uso com as estações de metrô de São Paulo

import model.*;;

public class Main {
    public static void main(String[] args)  {
        GrafoMetro<String> grafo = new GrafoMetro<String>();

        // Adicionando todas as capitais brasileiras como "estações" e as principais rodovias como "linhas"
        grafo.adicionarVertice(new Cidade("1", "São Paulo", "São Paulo"));
        grafo.adicionarVertice(new Cidade("2", "Rio de Janeiro", "Rio de Janeiro"));
        grafo.adicionarVertice(new Cidade("3", "Belo Horizonte", "Minas Gerais"));
        grafo.adicionarVertice(new Cidade("4", "Curitiba", "Paraná"));
        grafo.adicionarVertice(new Cidade("5", "Brasília", "Distrito Federal"));
        grafo.adicionarVertice(new Cidade("6", "Porto Alegre", "Riog Grande do Sul"));
        grafo.adicionarVertice(new Cidade("7", "Salvador", "Bahia"));
        grafo.adicionarVertice(new Cidade("8", "Fortaleza", "Ceará"));
        grafo.adicionarVertice(new Cidade("9", "Recife", "Pernambuco"));
        grafo.adicionarVertice(new Cidade("10", "Manaus", "Amazonas"));
        grafo.adicionarVertice(new Cidade("11", "Belém", "Pará"));
        grafo.adicionarVertice(new Cidade("12", "Goiânia", "Goiás"));
        grafo.adicionarVertice(new Cidade("13", "Campo Grande", "Mato Grosso do Sul"));
        grafo.adicionarVertice(new Cidade("14", "Cuiabá", "Mato Grosso"));
        grafo.adicionarVertice(new Cidade("15", "João Pessoa", "Paraiba"));
        grafo.adicionarVertice(new Cidade("16", "Maceió", "Alagoas"));
        grafo.adicionarVertice(new Cidade("17", "Aracaju", "Sergipe"));
        grafo.adicionarVertice(new Cidade("18", "Natal", "Rio grande do Norte"));
        grafo.adicionarVertice(new Cidade("19", "Palmas", "Tocantins"));
        grafo.adicionarVertice(new Cidade("20", "Boa Vista", "Roraima"));
        grafo.adicionarVertice(new Cidade("21", "Porto Velho", "Rondônia"));
        grafo.adicionarVertice(new Cidade("22", "Macapá", "Amapá"));
        grafo.adicionarVertice(new Cidade("23", "Rio Branco", "Acre"));
        grafo.adicionarVertice(new Cidade("24", "Teresina", "Piauí"));
        grafo.adicionarVertice(new Cidade("25", "Florianópolis", "Santa Catarina"));
        grafo.adicionarVertice(new Cidade("26", "Vitória", "Espirito Santo"));
        grafo.adicionarVertice(new Cidade("27", "São Luís", "Maranhão"));

        // Adicionando rodovias principais como arestas entre as capitais
        // Adicionando rodovias principais como arestas entre as capitais
        grafo.adicionarAresta(1, "BR-116", 429.0, "1", "2");  // São Paulo - Rio de Janeiro via BR-116
        grafo.adicionarAresta(2, "BR-116", 408.0, "1", "4");  // São Paulo - Curitiba via BR-116
        grafo.adicionarAresta(3, "BR-381", 586.0, "1", "3");  // São Paulo - Belo Horizonte via BR-381
        grafo.adicionarAresta(4, "BR-040", 434.0, "2", "3");  // Rio de Janeiro - Belo Horizonte via BR-040
        grafo.adicionarAresta(5, "BR-060", 209.0, "5", "12"); // Brasília - Goiânia via BR-060
        grafo.adicionarAresta(6, "BR-262", 1134.0, "5", "13"); // Brasília - Campo Grande via BR-262
        grafo.adicionarAresta(7, "BR-364", 1137.0, "5", "14"); // Brasília - Cuiabá via BR-364
        grafo.adicionarAresta(8, "BR-135", 1234.0, "3", "24"); // Belo Horizonte - Teresina via BR-135
        grafo.adicionarAresta(9, "BR-222", 600.0, "8", "24"); // Fortaleza - Teresina via BR-222
        grafo.adicionarAresta(10, "BR-316", 808.0, "8", "11"); // Fortaleza - Belém via BR-316
        grafo.adicionarAresta(11, "BR-319", 901.0, "10", "21"); // Manaus - Porto Velho via BR-319
        grafo.adicionarAresta(12, "BR-364", 1456.0, "21", "14"); // Porto Velho - Cuiabá via BR-364
        grafo.adicionarAresta(13, "BR-316", 945.0, "11", "24"); // Belém - Teresina via BR-316
        grafo.adicionarAresta(14, "BR-101", 2142.0, "11", "7"); // Belém - Salvador via BR-101
        grafo.adicionarAresta(15, "BR-101", 839.0, "7", "9"); // Salvador - Recife via BR-101
        grafo.adicionarAresta(16, "BR-116", 1027.0, "7", "8"); // Salvador - Fortaleza via BR-116
        grafo.adicionarAresta(17, "BR-101", 120.0, "9", "15"); // Recife - João Pessoa via BR-101
        grafo.adicionarAresta(18, "BR-101", 258.0, "9", "16"); // Recife - Maceió via BR-101
        grafo.adicionarAresta(19, "BR-101", 294.0, "16", "17"); // Maceió - Aracaju via BR-101
        grafo.adicionarAresta(20, "BR-101", 300.0, "25", "4"); // Florianópolis - Curitiba via BR-101
        grafo.adicionarAresta(21, "BR-290", 476.0, "25", "6"); // Florianópolis - Porto Alegre via BR-290
        grafo.adicionarAresta(22, "BR-101", 347.0, "17", "2"); // Aracaju - Rio de Janeiro via BR-101
        grafo.adicionarAresta(23, "BR-174", 748.0, "20", "10"); // Boa Vista - Manaus via BR-174
        grafo.adicionarAresta(24, "BR-153", 973.0, "19", "5"); // Palmas - Brasília via BR-153
        grafo.adicionarAresta(25, "BR-101", 519.0, "26", "2"); // Vitória - Rio de Janeiro via BR-101
        grafo.adicionarAresta(26, "BR-222", 1600.0, "27", "8"); // São Luís - Fortaleza via BR-222
        grafo.adicionarAresta(27, "BR-317", 1436.0, "23", "21"); // Rio Branco - Porto Velho via BR-317
        grafo.adicionarAresta(28, "BR-156", 3300.0, "22", "11"); // Macapá - Belém via BR-156



        System.out.println("Grafo de estações de metrô de São Paulo criado com sucesso!");
        // Aqui podem ser implementadas funções para buscar rotas, calcular menor caminho, etc.
        try {
            grafo.BuscaEmLargura(23);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error"+e.getMessage());
        }
        
    
    }
}
