package exer4.pessoa;

public class Miseravel extends Pessoa {

    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void atividade() {
        mendiga();
    }

    public void mendiga() {
        System.out.println("Recebendo doacao...");
    }
    
}