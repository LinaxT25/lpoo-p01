package exer7;

import java.util.Arrays;

public class Cd extends Colecionavel {
    private String generoMusical;
    private String[] faixas;

    public Cd(int id, String nome, int dataAquisicao, String listaAutores, String generoMusical, String[] faixas) {
        super(id, nome, dataAquisicao, listaAutores);
        setGeneroMusical(generoMusical);
        setFaixas(faixas);
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String[] getFaixas() {
        return faixas;
    }

    public void setFaixas(String[] faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return "Cd " + super.toString() + " faixas=" + Arrays.toString(getFaixas()) 
                + ", generoMusical=" + getGeneroMusical();
    }
    
   
    
}