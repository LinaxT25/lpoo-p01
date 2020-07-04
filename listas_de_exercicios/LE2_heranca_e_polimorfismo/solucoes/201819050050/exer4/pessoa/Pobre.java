package exer4.pessoa;

public class Pobre extends Pessoa {

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atividade() {
        trabalha();
    }

    public void trabalha() {
        System.out.println("Trabalhando...");
    }

}