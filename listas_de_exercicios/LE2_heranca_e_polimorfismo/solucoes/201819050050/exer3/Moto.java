package exer3;

public class Moto extends VeiculoTerrestre {
    private String numeroChassi;
    private double cilindrada;
    private String cor;
    private double potenciaMaxima;

    public Moto(int id, String numeroChassi, double cilindrada, String cor, double potenciaMaxima) {
        super(id);
        setNumeroChassi(numeroChassi);
        setCilindrada(cilindrada);
        setCor(cor);
        setPotenciaMaxima(potenciaMaxima);
    }

    @Override
    public String toString() {
        return "Moto [cilindrada=" + getCilindrada() + ", cor=" + getCor() 
                + ", numeroChassi=" + getNumeroChassi()
                + ", potenciaMaxima=" + getPotenciaMaxima() + "]";
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    
    
    

}