package model;

public class Estacao {
    private String nome;
    private Linha linha;

    public Estacao() {
    }

    public Estacao(String nome, Linha linha) {
        this.nome = nome;
        this.linha = linha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    @Override
    public String toString() {
        return "Estacao{" +
                "nome='" + nome + '\'' +
                ", linha=" + linha +
                '}';
    }
}
