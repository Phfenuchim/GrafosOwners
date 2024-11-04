package model;

public class Linha<TIPO> {
    private int numeroLinha;
    private Double tempo; // para calculo de tempo do trajeto
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;
    
    
    public Linha() {
    }

    public Linha(int nLinha, Vertice<TIPO> inicio, Vertice<TIPO> fim, Double tempo) {
        this.numeroLinha = nLinha;
        this.inicio = inicio;
        this.fim = fim;
        this.tempo = tempo;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }


    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    public int getNumeroLinha() {
        return numeroLinha;
    }

    public void setNumeroLinha(int numeroLinha) {
        this.numeroLinha = numeroLinha;
    }
    

    @Override
    public String toString() {
        return "Linha{" +
                "numeroLinha=" + numeroLinha +
                ", estacoes="  +
                '}';
    }

    
}
