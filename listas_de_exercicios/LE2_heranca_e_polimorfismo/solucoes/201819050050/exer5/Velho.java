package exer5;

public class Velho extends Imovel{
    private double valorDesconto;

    public Velho(double valor, String endereco, double valorDesconto) {
        super(valor, endereco);
        setValorDesconto(valorDesconto);
    }

    @Override
    public String toString() {
        return super.toString() + "\nvalorDesconto=" + getValorDesconto();
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    
    
}