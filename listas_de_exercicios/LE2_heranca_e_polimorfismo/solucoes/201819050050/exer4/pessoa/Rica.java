package exer4.pessoa;
public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        setDinheiro(dinheiro);
    }

    @Override
    public void atividade(double valor) {
        fazCompras(valor);
    }

    public void fazCompras(double valor) {
        System.out.printf("R$%.2f gastos - dinheiro atual R$%.2f\n", valor, (getDinheiro() - valor));
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

}