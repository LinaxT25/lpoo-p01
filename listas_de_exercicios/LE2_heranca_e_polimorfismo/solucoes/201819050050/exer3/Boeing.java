package exer3;

public class Boeing extends VeiculoAereo {
    private String modelo;
    private int numeroPassageiros;
    private int numeroTripulacao;
    private double pesoMaximoDecolagem;

    public Boeing(int id, String modelo, int numeroPassageiros, int numeroTripulacao, double pesoMaximoDecolagem) {
        super(id);
        setModelo(modelo);
        setNumeroPassageiros(numeroPassageiros);
        setNumeroTripulacao(numeroTripulacao);
        setPesoMaximoDecolagem(pesoMaximoDecolagem);
    }

    @Override
    public String toString() {
        return "Boeing [modelo=" + getModelo() + ", numeroPassageiros=" + getNumeroPassageiros() 
                + ", numeroTripulacao=" + getNumeroTripulacao() 
                + ", pesoMaximoDecolagem=" + getPesoMaximoDecolagem() + "]";
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPesoMaximoDecolagem() {
        return pesoMaximoDecolagem;
    }

    public void setPesoMaximoDecolagem(double pesoMaximoDecolagem) {
        this.pesoMaximoDecolagem = pesoMaximoDecolagem;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getNumeroTripulacao() {
        return numeroTripulacao;
    }

    public void setNumeroTripulacao(int numeroTripulacao) {
        this.numeroTripulacao = numeroTripulacao;
    }

 

}