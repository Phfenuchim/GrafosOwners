package app;
// Exemplo de uso com as estações de metrô de São Paulo

import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        
            
        GrafoMetro<String> grafo = new GrafoMetro<String>();
        {
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
        }

        {// Adicionando rodovias principais como arestas entre as capitais
        grafo.adicionarAresta(1,"BR-381",487.0,584.0,"1","3");// "São Paulo"- "Belo Horizonte"
        grafo.adicionarAresta(2,"Rod.Anhanguera e BR-050",760.0,1005.0,"1","5");// "São Paulo"- "Brasília"
        grafo.adicionarAresta(3,"BR-374",690.0,982.0,"1","13");// "São Paulo"- "Campo Grande"
        grafo.adicionarAresta(4,"BR-364",1250.0,1574.0,"1","14");// "São Paulo"- "Cuiabá"
        grafo.adicionarAresta(5,"BR-116",342.0,402.0,"1","4");// "São Paulo"- "Curitiba"
        grafo.adicionarAresta(6,"BR-153",767.0,1004.0,"1","12");// "São Paulo"- "Goiânia"
        grafo.adicionarAresta(7,"BR-116",372.0,434.0,"1","2");// "São Paulo"- "Rio de Janeiro"
        grafo.adicionarAresta(8,"BR-267",949.0,1028.0,"1","26");// "São Paulo"- "Vitória"
        grafo.adicionarAresta(9,"BR-040",387.0,441.0,"2","3");// "Rio de Janeiro"- "Belo Horizonte"
        grafo.adicionarAresta(10,"BR-354",1147.0,1331.0,"2","5");// "Rio de Janeiro"- "Brasília"
        grafo.adicionarAresta(11,"BR-364",1500.0,1932.0,"2","14");// "Rio de Janeiro"- "Cuiabá"
        grafo.adicionarAresta(12,"BR-352",1154.0,1320.0,"2","12");// "Rio de Janeiro"- "Goiânia"
        grafo.adicionarAresta(13,"BR-116",357.0,435.0,"2","1");// "Rio de Janeiro"- "São Paulo"
        grafo.adicionarAresta(14,"BR-101",448.0,522.0,"2","26");// "Rio de Janeiro"- "Vitória"
        grafo.adicionarAresta(15,"BR-040",565.0,733.0,"3","5");// "Belo Horizonte"- "Brasília"
        grafo.adicionarAresta(16,"BR-262",996.0,1261.0,"3","13");// "Belo Horizonte"- "Campo Grande"
        grafo.adicionarAresta(17,"BR-262",1284.0,1570.0,"3","14");// "Belo Horizonte"- "Cuiabá"
        grafo.adicionarAresta(18,"BR-040",699.0,889.0,"3","12");// "Belo Horizonte"- "Goiânia"
        grafo.adicionarAresta(19,"BR-040",412.0,441.0,"3","2");// "Belo Horizonte"- "Rio de Janeiro"
        grafo.adicionarAresta(20,"BR-026",1177.0,1427.0,"3","7");// "Belo Horizonte"- "Salvador"
        grafo.adicionarAresta(21,"BR-381",479.0,583.0,"3","1");// "Belo Horizonte"- "São Paulo"
        grafo.adicionarAresta(22,"BR-262",519.0,514.0,"3","26");// "Belo Horizonte"- "Vitória"
        grafo.adicionarAresta(23,"BR-376",750.0,974.0,"4","13");// "Curitiba"- "Campo Grande"
        grafo.adicionarAresta(24,"BR-101",242.0,307.0,"4","25");// "Curitiba"- "Florianópolis"
        grafo.adicionarAresta(25,"BR-153",976.0,1230.0,"4","12");// "Curitiba"- "Goiânia"
        grafo.adicionarAresta(26,"BR-116",618.0,699.0,"4","6");// "Curitiba"- "Porto Alegre"
        grafo.adicionarAresta(27,"BR-116",358.0,402.0,"4","1");// "Curitiba"- "São Paulo"
        grafo.adicionarAresta(28,"BR-020 ",1339.0,1641.0,"5","17");// "Brasília"- "Aracaju"
        grafo.adicionarAresta(29,"BR-040 ",628.0,752.0,"5","3");// "Brasília"- "Belo Horizonte"
        grafo.adicionarAresta(30,"BR-070 ",894.0,1066.0,"5","14");// "Brasília"- "Cuiabá"
        grafo.adicionarAresta(31,"Rod. Anhanguera e BR-050",1171.0,1398.0,"5","4");// "Brasília"- "Curitiba"
        grafo.adicionarAresta(32,"BR-135  e BR-020",1740.0,2120.0,"5","8");// "Brasília"- "Fortaleza"
        grafo.adicionarAresta(33,"BR-060 ",209.0,208.0,"5","12");// "Brasília"- "Goiânia"
        grafo.adicionarAresta(34,"BR-020 ",1860.0,2238.0,"5","15");// "Brasília"- "João Pessoa"
        grafo.adicionarAresta(35,"BR-135  e BR-020",1980.0,2437.0,"5","18");// "Brasília"- "Natal"
        grafo.adicionarAresta(36,"TO-050 e BR-010",647.0,846.0,"5","19");// "Brasília"- "Palmas"
        grafo.adicionarAresta(37,"BR-020 ",1740.0,2107.0,"5","9");// "Brasília"- "Recife"
        grafo.adicionarAresta(38,"BR-354",1182.0,1338.0,"5","2");// "Brasília"- "Rio de Janeiro"
        grafo.adicionarAresta(39,"BR-020 ",1155.0,1447.0,"5","7");// "Brasília"- "Salvador"
        grafo.adicionarAresta(40,"BR-135 ",1740.0,2025.0,"5","27");// "Brasília"- "São Luís"
        grafo.adicionarAresta(41,"Rod. Anhanguera e BR-050",795.0,1024.0,"5","1");// "Brasília"- "São Paulo"
        grafo.adicionarAresta(42,"BR-135  e BR-020",1350.0,1682.0,"5","24");// "Brasília"- "Teresina"
        grafo.adicionarAresta(43,"BR-163",1225.0,1416.0,"6","13");// "Porto Alegre"- "Campo Grande"
        grafo.adicionarAresta(44,"BR-116",623.0,701.0,"6","4");// "Porto Alegre"- "Curitiba"
        grafo.adicionarAresta(45,"BR-101",339.0,4693.0,"6","25");// "Porto Alegre"- "Florianópolis"
        grafo.adicionarAresta(46,"BA-099 ",289.0,340.0,"7","17");// "Salvador"- "Aracaju"
        grafo.adicionarAresta(47,"BR-116 ",1201.0,1417.0,"7","3");// "Salvador"- "Belo Horizonte"
        grafo.adicionarAresta(48,"BR-020 ",1143.0,1448.0,"7","5");// "Salvador"- "Brasília"
        grafo.adicionarAresta(49,"BR-116 ",1038.0,1180.0,"7","8");// "Salvador"- "Fortaleza"
        grafo.adicionarAresta(50,"BR-242 ",1168.0,1477.0,"7","19");// "Salvador"- "Palmas"
        grafo.adicionarAresta(51,"BR-116 ",1440.0,1633.0,"7","2");// "Salvador"- "Rio de Janeiro"
        grafo.adicionarAresta(52,"BR-407 ",988.0,1150.0,"7","24");// "Salvador"- "Teresina"
        grafo.adicionarAresta(53,"BR-101 ",1080.0,1175.0,"7","26");// "Salvador"- "Vitória"
        grafo.adicionarAresta(54,"BR-116 e BR-235",917.0,1101.0,"8","17");// "Fortaleza"- "Aracaju"
        grafo.adicionarAresta(55,"BR-116 ",2040.0,2366.0,"8","3");// "Fortaleza"- "Belo Horizonte"
        grafo.adicionarAresta(56,"BR-135 e BR-020",1680.0,2122.0,"8","5");// "Fortaleza"- "Brasília"
        grafo.adicionarAresta(57,"BR-070",2460.0,3167.0,"8","14");// "Fortaleza"- "Cuiabá"
        grafo.adicionarAresta(58,"BR-230",631.0,742.0,"8","15");// "Fortaleza"- "João Pessoa"
        grafo.adicionarAresta(59,"BR-104",837.0,949.0,"8","16");// "Fortaleza"- "Maceió"
        grafo.adicionarAresta(60,"BR-304",439.0,524.0,"8","18");// "Fortaleza"- "Natal"
        grafo.adicionarAresta(61,"BR-020 e BR-230",1436.0,1729.0,"8","19");// "Fortaleza"- "Palmas"
        grafo.adicionarAresta(62,"BR-230",736.0,813.0,"8","9");// "Fortaleza"- "Recife"
        grafo.adicionarAresta(63,"BR-116 ",1019.0,1188.0,"8","7");// "Fortaleza"- "Salvador"
        grafo.adicionarAresta(64,"CE-085  e BR-402",776.0,899.0,"8","27");// "Fortaleza"- "São Luís"
        grafo.adicionarAresta(65,"BR-222 e BR-343",513.0,606.0,"8","24");// "Fortaleza"- "Teresina"
        grafo.adicionarAresta(66,"BR-116  e BR-101",1980.0,2158.0,"8","26");// "Fortaleza"- "Vitória"
        grafo.adicionarAresta(67,"BA-101 ",441.0,500.0,"9","17");// "Recife"- "Aracaju"
        grafo.adicionarAresta(68,"BR-020",1800.0,2107.0,"9","5");// "Recife"- "Brasília"
        grafo.adicionarAresta(69,"BR-230",738.0,777.0,"9","8");// "Recife"- "Fortaleza"
        grafo.adicionarAresta(70,"BR-101 ",133.0,116.0,"9","15");// "Recife"- "João Pessoa"
        grafo.adicionarAresta(71,"Rod, prestes maia e BR-101",238.0,257.0,"9","16");// "Recife"- "Maceió"
        grafo.adicionarAresta(72,"Rod.Transamazonica e BR-230",4320.0,4611.0,"9","10");// "Recife"- "Manaus"
        grafo.adicionarAresta(73,"BR-232 e BR-230",1680.0,2009.0,"9","19");// "Recife"- "Palmas"
        grafo.adicionarAresta(74,"Rod.Transamazonica e BR-230",3720.0,4120.0,"9","21");// "Recife"- "Porto Velho"
        grafo.adicionarAresta(75,"BR-232 e BR-316",980.0,1125.0,"9","24");// "Recife"- "Teresina"
        grafo.adicionarAresta(76,"Rod.Transamazonica e BR-230",3060.0,2994.0,"10","11");// "Manaus"- "Belém"
        grafo.adicionarAresta(77,"BR-174 e BR-432",594.0,747.0,"10","20");// "Manaus"- "Boa Vista"
        grafo.adicionarAresta(78,"Rod.Transamazonica e BR-230",3240.0,3391.0,"10","19");// "Manaus"- "Palmas"
        grafo.adicionarAresta(79,"Rod.Transamazonica e BR-219",886.0,889.0,"10","21");// "Manaus"- "Porto Velho"
        grafo.adicionarAresta(80,"Rod.Transamazonica e BR-230",3480.0,3536.0,"10","27");// "Manaus"- "São Luís"
        grafo.adicionarAresta(81,"Rod.Transamazonica e BR-230",3420.0,3572.0,"10","24");// "Manaus"- "Teresina"
        grafo.adicionarAresta(82,"BR-010 ",1680.0,1956.0,"11","5");// "Belém"- "Brasília"
        grafo.adicionarAresta(83,"BR-010 ",2340.0,2859.0,"11","13");// "Belém"- "Campo Grande"
        grafo.adicionarAresta(84,"BR-158 ",2100.0,2327.0,"11","14");// "Belém"- "Cuiabá"
        grafo.adicionarAresta(85,"BR-010 ",1740.0,1971.0,"11","12");// "Belém"- "Goiânia"
        grafo.adicionarAresta(86,"Av.  Arthur Bernardes",1500.0,528.0,"11","22");// "Belém"- "Macapá"
        grafo.adicionarAresta(87,"Rod.Transamazonica e BR-230",3060.0,2994.0,"11","10");// "Belém"- "Manaus"
        grafo.adicionarAresta(88,"BR-226 ",1110.0,1143.0,"11","19");// "Belém"- "Palmas"
        grafo.adicionarAresta(89,"Rod.Transamazonica e BR-230",2460.0,2503.0,"11","21");// "Belém"- "Porto Velho"
        grafo.adicionarAresta(90,"BR-316  e MA-106",679.0,578.0,"11","27");// "Belém"- "São Luís"
        grafo.adicionarAresta(91,"BR-316 ",901.0,911.0,"11","24");// "Belém"- "Teresina"
        grafo.adicionarAresta(92,"BR-010 ",2760.0,3129.0,"11","26");// "Belém"- "Vitória"
        grafo.adicionarAresta(93,"BR-026",1680.0,2055.0,"12","17");// "Goiânia"- "Aracaju"
        grafo.adicionarAresta(94,"BR-010",1740.0,1972.0,"12","11");// "Goiânia"- "Belém"
        grafo.adicionarAresta(95,"BR-040",687.0,891.0,"12","3");// "Goiânia"- "Belo Horizonte"
        grafo.adicionarAresta(96,"BR-060",180.0,207.0,"12","5");// "Goiânia"- "Brasília"
        grafo.adicionarAresta(97,"BR-060",625.0,839.0,"12","13");// "Goiânia"- "Campo Grande"
        grafo.adicionarAresta(98,"BR-070",700.0,887.0,"12","14");// "Goiânia"- "Cuiabá"
        grafo.adicionarAresta(99,"BR-153",1150.0,1317.0,"12","4");// "Goiânia"- "Curitiba"
        grafo.adicionarAresta(100,"Rod. Bernardo Sayão",657.0,824.0,"12","19");// "Goiânia"- "Palmas"
        grafo.adicionarAresta(101,"BR-352",1168.0,1324.0,"12","2");// "Goiânia"- "Rio de Janeiro"
        grafo.adicionarAresta(102,"BR-020",1278.0,1646.0,"12","7");// "Goiânia"- "Salvador"
        grafo.adicionarAresta(103,"BR-226",1740.0,2007.0,"12","27");// "Goiânia"- "São Luís"
        grafo.adicionarAresta(104,"BR-153 e BR-364",684.0,901.0,"12","1");// "Goiânia"- "São Paulo"
        grafo.adicionarAresta(105,"BR-226",1560.0,1868.0,"12","24");// "Goiânia"- "Teresina"
        grafo.adicionarAresta(106,"BR-262",1044.0,1266.0,"13","3");// "Campo Grande"- "Belo Horizonte"
        grafo.adicionarAresta(107,"BR-163 e BR-364",574.0,703.0,"13","14");// "Campo Grande"- "Cuiabá"
        grafo.adicionarAresta(108,"BR-376",748.0,977.0,"13","4");// "Campo Grande"- "Curitiba"
        grafo.adicionarAresta(109,"BR-060",611.0,839.0,"13","12");// "Campo Grande"- "Goiânia"
        grafo.adicionarAresta(110,"BR-163",1233.0,1420.0,"13","6");// "Campo Grande"- "Porto Alegre"
        grafo.adicionarAresta(111,"BR-374",701.0,984.0,"13","1");// "Campo Grande"- "São Paulo"
        grafo.adicionarAresta(112,"BR-158",2160.0,2335.0,"14","11");// "Cuiabá"- "Belém"
        grafo.adicionarAresta(113,"BR-364",1335.0,1597.0,"14","3");// "Cuiabá"- "Belo Horizonte"
        grafo.adicionarAresta(114,"BR-070",840.0,1059.0,"14","5");// "Cuiabá"- "Brasília"
        grafo.adicionarAresta(115,"BR-163",772.0,840.0,"14","13");// "Cuiabá"- "Campo Grande"
        grafo.adicionarAresta(116,"BR-020",2520.0,3176.0,"14","8");// "Cuiabá"- "Fortaleza"
        grafo.adicionarAresta(117,"BR-070",709.0,897.0,"14","12");// "Cuiabá"- "Goiânia"
        grafo.adicionarAresta(118,"BR-070",2640.0,3236.0,"14","15");// "Cuiabá"- "João Pessoa"
        grafo.adicionarAresta(119,"BR-070",2760.0,3478.0,"14","18");// "Cuiabá"- "Natal"
        grafo.adicionarAresta(120,"BR-070",1137.0,1540.0,"14","19");// "Cuiabá"- "Palmas"
        grafo.adicionarAresta(121,"BR-174 e BR-364",1169.0,1461.0,"14","21");// "Cuiabá"- "Porto Velho"
        grafo.adicionarAresta(122,"BR-242",1980.0,2621.0,"14","7");// "Cuiabá"- "Salvador"
        grafo.adicionarAresta(123,"BR-226",2220.0,2723.0,"14","27");// "Cuiabá"- "São Luís"
        grafo.adicionarAresta(124,"BR-364",1243.0,1529.0,"14","1");// "Cuiabá"- "São Paulo"
        grafo.adicionarAresta(125,"BR-226",2040.0,2584.0,"14","24");// "Cuiabá"- "Teresina"
        grafo.adicionarAresta(126,"BR-020",1800.0,2242.0,"15","5");// "João Pessoa"- "Brasília"
        grafo.adicionarAresta(127,"BR-070",2640.0,3228.0,"15","14");// "João Pessoa"- "Cuiabá"
        grafo.adicionarAresta(128,"BR-230",2640.0,748.0,"15","8");// "João Pessoa"- "Fortaleza"
        grafo.adicionarAresta(129,"Rod.Transamazonica e BR-230",4320.0,4642.0,"15","10");// "João Pessoa"- "Manaus"
        grafo.adicionarAresta(130,"BR-101 ",150.0,181.0,"15","18");// "João Pessoa"- "Natal"
        grafo.adicionarAresta(131,"BR-230 ",1740.0,2041.0,"15","19");// "João Pessoa"- "Palmas"
        grafo.adicionarAresta(132,"Rod.Transamazonica e BR-230",3720.0,4151.0,"15","21");// "João Pessoa"- "Porto Velho"
        grafo.adicionarAresta(133,"BR-101 ",123.0,155.0,"15","9");// "João Pessoa"- "Recife"
        grafo.adicionarAresta(134,"BR-070",2640.0,3228.0,"15","24");// "João Pessoa"- "Teresina"
        grafo.adicionarAresta(135,"Rod, prestes maia e BR-101",246.0,272.0,"16","17");// "Maceió"- "Aracaju"
        grafo.adicionarAresta(136,"BR-104 ",869.0,955.0,"16","8");// "Maceió"- "Fortaleza"
        grafo.adicionarAresta(137,"Rod.Transamazonica e BR-230",4320.0,4659.0,"16","10");// "Maceió"- "Manaus"
        grafo.adicionarAresta(138,"BR-210 ",1560.0,1862.0,"16","19");// "Maceió"- "Palmas"
        grafo.adicionarAresta(139,"BR-242 ",3420.0,4273.0,"16","21");// "Maceió"- "Porto Velho"
        grafo.adicionarAresta(140,"Rod. Gov. Mario Covas e BR-101",256.0,259.0,"16","9");// "Maceió"- "Recife"
        grafo.adicionarAresta(141,"BR-316 ",997.0,1172.0,"16","24");// "Maceió"- "Teresina"
        grafo.adicionarAresta(142,"BR-116",1420.0,1543.0,"17","3");// "Aracaju"- "Belo Horizonte"
        grafo.adicionarAresta(143,"BR-020 ",1322.0,1639.0,"17","5");// "Aracaju"- "Brasília"
        grafo.adicionarAresta(144,"BR-235  e BR-116",1516.0,1099.0,"17","8");// "Aracaju"- "Fortaleza"
        grafo.adicionarAresta(145,"BR-101",252.0,272.0,"17","16");// "Aracaju"- "Maceió"
        grafo.adicionarAresta(146,"BR-242 ",1356.0,1671.0,"17","19");// "Aracaju"- "Palmas"
        grafo.adicionarAresta(147,"BR-101",456.0,499.0,"17","9");// "Aracaju"- "Recife"
        grafo.adicionarAresta(148,"BA-099 ",280.0,325.0,"17","7");// "Aracaju"- "Salvador"
        grafo.adicionarAresta(149,"BR-235  e BR-407",934.0,1117.0,"17","24");// "Aracaju"- "Teresina"
        grafo.adicionarAresta(150,"BR-104 e BR-101",1339.0,784.0,"18","17");// "Natal"- "Aracaju"
        grafo.adicionarAresta(151,"BA-110 ",2100.0,2334.0,"18","3");// "Natal"- "Belo Horizonte"
        grafo.adicionarAresta(152,"BR-020 ",1980.0,2408.0,"18","5");// "Natal"- "Brasília"
        grafo.adicionarAresta(153,"BR-070 ",2760.0,3467.0,"18","14");// "Natal"- "Cuiabá"
        grafo.adicionarAresta(154,"BR-304 e CE-040 ",433.0,522.0,"18","8");// "Natal"- "Fortaleza"
        grafo.adicionarAresta(155,"BR-101",152.0,181.0,"18","15");// "Natal"- "João Pessoa"
        grafo.adicionarAresta(156,"Rod.Transamazonica e BR-230",4320.0,4649.0,"18","10");// "Natal"- "Manaus"
        grafo.adicionarAresta(157,"BR-230 ",1740.0,2048.0,"18","19");// "Natal"- "Palmas"
        grafo.adicionarAresta(158,"Rod.Transamazonica e BR-230",3720.0,4158.0,"18","21");// "Natal"- "Porto Velho"
        grafo.adicionarAresta(159,"BA-110 ",1042.0,1111.0,"18","7");// "Natal"- "Salvador"
        grafo.adicionarAresta(160,"BR-226 ",916.0,1048.0,"18","24");// "Natal"- "Teresina"
        grafo.adicionarAresta(161,"BR-242 ",1361.0,1669.0,"19","17");// "Palmas"- "Aracaju"
        grafo.adicionarAresta(162,"BR-226 ",1108.0,1144.0,"19","11");// "Palmas"- "Belém"
        grafo.adicionarAresta(163,"BR-010 ",1325.0,1670.0,"19","3");// "Palmas"- "Belo Horizonte"
        grafo.adicionarAresta(164,"Rod. Bernardo Sayão",650.0,822.0,"19","5");// "Palmas"- "Brasília"
        grafo.adicionarAresta(165,"BR-060 ",1276.0,1717.0,"19","13");// "Palmas"- "Campo Grande"
        grafo.adicionarAresta(166,"BR-070 ",1140.0,1530.0,"19","14");// "Palmas"- "Cuiabá"
        grafo.adicionarAresta(167,"BR-230 e BR-020",1440.0,1730.0,"19","8");// "Palmas"- "Fortaleza"
        grafo.adicionarAresta(168,"Rod. Bernardo Sayão",669.0,824.0,"19","12");// "Palmas"- "Goiânia"
        grafo.adicionarAresta(169,"BR-230",1740.0,2042.0,"19","15");// "Palmas"- "João Pessoa"
        grafo.adicionarAresta(170,"BR-316 ",1680.0,1878.0,"19","16");// "Palmas"- "Maceió"
        grafo.adicionarAresta(171,"Rod.Transamazonica e BR-230",3240.0,3393.0,"19","10");// "Palmas"- "Manaus"
        grafo.adicionarAresta(172,"BR-230",1740.0,2051.0,"19","18");// "Palmas"- "Natal"
        grafo.adicionarAresta(173,"BR-364 ",2160.0,2752.0,"19","21");// "Palmas"- "Porto Velho"
        grafo.adicionarAresta(174,"BR-235",1680.0,1878.0,"19","9");// "Palmas"- "Recife"
        grafo.adicionarAresta(175,"BR-242 ",1176.0,1475.0,"19","7");// "Palmas"- "Salvador"
        grafo.adicionarAresta(176,"BR-226 ",1129.0,1284.0,"19","27");// "Palmas"- "São Luís"
        grafo.adicionarAresta(177,"BR-226 ",935.0,1109.0,"19","24");// "Palmas"- "Teresina"
        grafo.adicionarAresta(178,"BR-116 ",1800.0,2141.0,"19","26");// "Palmas"- "Vitória"
        grafo.adicionarAresta(179,"BR-174 ",594.0,782.0,"20","10");// "Boa Vista"- "Manaus"
        grafo.adicionarAresta(180,"Rod.Transamazonica e BR-230",2460.0,2502.0,"21","11");// "Porto Velho"- "Belém"
        grafo.adicionarAresta(181,"BR-364 e BR-174",1128.0,1461.0,"21","14");// "Porto Velho"- "Cuiabá"
        grafo.adicionarAresta(182,"Rod.Transamazonica e BR-230 e BR-020",3420.0,3840.0,"21","8");// "Porto Velho"- "Fortaleza"
        grafo.adicionarAresta(183,"BR-364",3600.0,4521.0,"21","15");// "Porto Velho"- "João Pessoa"
        grafo.adicionarAresta(184,"Rod. Álvaro maia e BR-319",893.0,889.0,"21","10");// "Porto Velho"- "Manaus"
        grafo.adicionarAresta(185,"Rod.Transamazonica e BR-230",3720.0,4160.0,"21","18");// "Porto Velho"- "Natal"
        grafo.adicionarAresta(186,"BR-364",2100.0,2751.0,"21","19");// "Porto Velho"- "Palmas"
        grafo.adicionarAresta(187,"BR-364",385.0,510.0,"21","21");// "Porto Velho"- "Porto Velho"
        grafo.adicionarAresta(188,"BR-242",3000.0,3821.0,"21","7");// "Porto Velho"- "Salvador"
        grafo.adicionarAresta(189,"Rod.Transamazonica e BR-230",2880.0,3047.0,"21","27");// "Porto Velho"- "São Luís"
        grafo.adicionarAresta(190,"Rod.Transamazonica e BR-230",2820.0,3116.0,"21","24");// "Porto Velho"- "Teresina"
        grafo.adicionarAresta(191,"Av.  Arthur Bernardes",1440.0,527.0,"22","11");// "Macapá"- "Belém"
        grafo.adicionarAresta(192,"BR-364",372.0,509.0,"23","21");// "Rio Branco"- "Porto Velho"
        grafo.adicionarAresta(193,"BR-407 e BR-235",943.0,1119.0,"24","17");// "Teresina"- "Aracaju"
        grafo.adicionarAresta(194,"BR-316",866.0,910.0,"24","11");// "Teresina"- "Belém"
        grafo.adicionarAresta(195,"BR-135",1740.0,2166.0,"24","3");// "Teresina"- "Belo Horizonte"
        grafo.adicionarAresta(196,"BR-020 ",1440.0,1675.0,"24","5");// "Teresina"- "Brasília"
        grafo.adicionarAresta(197,"BR-226",2040.0,2573.0,"24","14");// "Teresina"- "Cuiabá"
        grafo.adicionarAresta(198,"BR-343 e BR-222",515.0,604.0,"24","8");// "Teresina"- "Fortaleza"
        grafo.adicionarAresta(199,"Rod. Bernardo Sayão",1560.0,1963.0,"24","12");// "Teresina"- "Goiânia"
        grafo.adicionarAresta(200,"BR-230",1018.0,1154.0,"24","15");// "Teresina"- "João Pessoa"
        grafo.adicionarAresta(201,"BR-316",1007.0,1173.0,"24","16");// "Teresina"- "Maceió"
        grafo.adicionarAresta(202,"Rod.Transamazonica e BR-230",3420.0,3607.0,"24","10");// "Teresina"- "Manaus"
        grafo.adicionarAresta(203,"BR-226",925.0,1056.0,"24","18");// "Teresina"- "Natal"
        grafo.adicionarAresta(204,"BR-226",920.0,1107.0,"24","19");// "Teresina"- "Palmas"
        grafo.adicionarAresta(205,"Rod.Transamazonica e BR-230",2820.0,3116.0,"24","21");// "Teresina"- "Porto Velho"
        grafo.adicionarAresta(206,"BR-230",1112.0,1225.0,"24","9");// "Teresina"- "Recife"
        grafo.adicionarAresta(207,"BR-407",980.0,1159.0,"24","7");// "Teresina"- "Salvador"
        grafo.adicionarAresta(208,"BR-316 e BR-135",410.0,433.0,"24","27");// "Teresina"- "São Luís"
        grafo.adicionarAresta(209,"BR-407 e BR-101",1920.0,2129.0,"24","26");// "Teresina"- "Vitória"
        grafo.adicionarAresta(210,"BR-101",244.0,306.0,"25","4");// "Florianópolis"- "Curitiba"
        grafo.adicionarAresta(211,"BR-101",335.0,463.0,"25","6");// "Florianópolis"- "Porto Alegre"
        grafo.adicionarAresta(212,"BR-262",513.0,515.0,"26","3");// "Vitória"- "Belo Horizonte"
        grafo.adicionarAresta(213,"BR-040",1283.0,1242.0,"26","5");// "Vitória"- "Brasília"
        grafo.adicionarAresta(214,"BR-259",1740.0,2145.0,"26","19");// "Vitória"- "Palmas"
        grafo.adicionarAresta(215,"BR-101",437.0,218.0,"26","2");// "Vitória"- "Rio de Janeiro"
        grafo.adicionarAresta(216,"BR-101",1039.0,1056.0,"26","7");// "Vitória"- "Salvador"
        grafo.adicionarAresta(217,"BR-135 e BR-316",402.0,436.0,"27","24");// "São Luís"- "Teresina"
        grafo.adicionarAresta(218,"BR-402",792.0,899.0,"27","8");// "São Luís"- "Fortaleza"
        grafo.adicionarAresta(219,"BR-316",809.0,799.0,"27","11");// "São Luís"- "Belém"
        grafo.adicionarAresta(220,"BR-135",1680.0,2018.0,"27","5");// "São Luís"- "Brasília"
        grafo.adicionarAresta(221,"BR-226",2220.0,2715.0,"27","14");// "São Luís"- "Cuiabá"
        grafo.adicionarAresta(222,"BR-226",1740.0,2010.0,"27","12");// "São Luís"- "Goiânia"
        grafo.adicionarAresta(223,"Rod.Transamazonica e BR-230",3480.0,3538.0,"27","10");// "São Luís"- "Manaus"
        grafo.adicionarAresta(224,"BR-226",1131.0,1249.0,"27","19");// "São Luís"- "Palmas"
        grafo.adicionarAresta(225,"Rod.Transamazonica e BR-230",2880.0,3047.0,"27","21");// "São Luís"- "Porto Velho"
        grafo.adicionarAresta(226,"BR-135",2460.0,2798.0,"27","26");// "São Luís"- "Vitória"
        grafo.adicionarAresta(227,"BR-135",2100.0,2522.0,"27","3");// "São Luís"- "Belo Horizonte"
        }
        int opc = 0;
            do{


                System.out.println("-Menu-\n");
                System.out.println("1 - Caminhos possíveis\n");//Busca por largura
                System.out.println("2 - Caminho com menor distância\n");//Busca pela profundidade
                System.out.println("3 - Caminho com menor tempo\n");//busca por profundidade
                System.out.println("4 - Listar capitais brasileira \n");//Impressao de lista ligada
                System.out.println("5 - Sair");
                opc = scan.nextInt();
                switch(opc){

                    case 1:

                        System.out.println("Escreva a capital que você está:");
                            String camPossiveis = scan.next();
                            grafo.caminhosPossiveis(camPossiveis);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                      grafo.imprimirVertice();
                        break;
                    case 5: 
                        System.exit(0);
                        break;
                }
            } while(opc != -1);
        
    
    }
}
