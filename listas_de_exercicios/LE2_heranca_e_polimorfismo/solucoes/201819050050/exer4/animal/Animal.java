package exer4.animal;

public abstract class Animal {
    private String nome;
    private String raca;

    public Animal() {}

    public Animal(String nome) {
        setNome(nome);
    }
    
    public String caminha() {
        return "Andando...";
    }

    public String emiteSom() {
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }  
    
}