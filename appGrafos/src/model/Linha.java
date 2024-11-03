package model;

import java.util.List;

public class Linha {
    private int numeroLinha;
    private List<Estacao> estacoes;

    public Linha() {
    }

    public Linha(int numeroLinha, List<Estacao> estacoes) {
        this.numeroLinha = numeroLinha;
        this.estacoes = estacoes;
    }

    public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }

    public List<Estacao> getEstacoes() {
        return estacoes;
    }

    public void setEstacoes(List<Estacao> estacoes) {
        this.estacoes = estacoes;
    }

    @Override
    public String toString() {
        return "Linha{" +
                "numeroLinha=" + numeroLinha +
                ", estacoes=" + estacoes +
                '}';
    }
}
