package exer4.animal;

public class Gato extends Animal {

    public Gato() {}

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String emiteSom() {
        return mia();
    }

    public String mia() {
        return "Meow!";
    }    
    
}