package model;

public class Rodovia<TIPO> {
   
    private int numeroRodovia;
    private String nomeRodovia;
    private Double tempo; // para calculo de tempo do trajeto
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;
    
    
    public Rodovia() {
    }

    public Rodovia(int numeroRodovia, String nomeRodovia, Double tempo, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.numeroRodovia = numeroRodovia;
        this.nomeRodovia = nomeRodovia;
        this.tempo = tempo;
        this.inicio = inicio;
        this.fim = fim;
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

    public int getNumeroRodovia() {
        return numeroRodovia;
    }

    public void setNumeroRodovia(int numeroRodovia) {
        this.numeroRodovia = numeroRodovia;
    }
    

    @Override
    public String toString() {
        return "Rodovia{" +
                "numeroRodovia=" + numeroRodovia +
                ", estacoes="  +
                '}';
    }

    
}
