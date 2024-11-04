package model;

public class Estacao {
    private int idEst;
    private String nome;    // Novo atributo para o nome da estação
    private String linha; 


    public Estacao() {
    }

    public Estacao(int idEst, String nome, String linha) {
        this.idEst=idEst;
        this.nome = nome;
        this.linha = linha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    @Override
    public String toString() {
        return "Estacao{" +
                " id='" + idEst + '\'' +
                ", nome='" + nome + '\'' +
                ", linha=" + linha +
                '}';
    }
}
