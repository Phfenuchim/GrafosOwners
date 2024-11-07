package model;

public class Cidade {
    private String idEst;
    private String nome;
    private String estado;

    public Cidade() {
    }

    public Cidade(String idEst, String nome, String estado) {
        this.idEst = idEst;
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
        return String.format("[ID: %d] | Cidade: %s - Estado: %s", Integer.parseInt(idEst), nome, estado);
    }
}
