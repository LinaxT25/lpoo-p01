package exer4.animal;

public class Cachorro extends Animal {
    
    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro() {}

    @Override
    public String emiteSom() {
        return late();
    }

    public String late() {
        return "Woof woof!";
    }

}