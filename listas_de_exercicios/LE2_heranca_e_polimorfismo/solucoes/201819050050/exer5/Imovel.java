package exer5;

public class Imovel {
    private double valor;
    private String endereco;

    public Imovel(double valor, String endereco) {
        setValor(valor);
        setEndereco(endereco);
    }

    @Override
    public String toString() {
        return "endereco=" + getEndereco()
            +  "\nvalor=" + getValor();
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
 
    
}