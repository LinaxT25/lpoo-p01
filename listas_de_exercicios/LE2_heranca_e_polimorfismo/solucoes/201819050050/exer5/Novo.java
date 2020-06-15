package exer5;

public class Novo extends Imovel{
    private double valorAdicional;

    public Novo(double valor, String endereco, double valorAdicional) {
        super(valor, endereco);
        setvalorAdicional(valorAdicional);
    }

    @Override
    public String toString() {
        return super.toString() + "\nvalorAdicional=" + getvalorAdicional();
    }

    public double getvalorAdicional() {
        return valorAdicional;
    }

    public void setvalorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

}