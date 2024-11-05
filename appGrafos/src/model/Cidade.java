package model;

public class Cidade {
    private String idEst;
    private String nome;    // Novo atributo para o nome da estação
    private String estado; 


    public Cidade() {
    }

    public Cidade(String idEst, String nome, String estado) {
        this.idEst=idEst;
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinha() {
        return estado;
    }

    public void setLinha(String estado) {
        this.estado = estado;
    }

    public String getIdEst() {
        return idEst;
    }

    public void setIdEst(String idEst) {
        this.idEst = idEst;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                " id='" + idEst + '\'' +
                ", nome='" + nome + '\'' +
                ", estado=" + estado +
                '}';
    }
}
