package exer4.animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato("Cat");
        gato.setRaca("Chartreux");
        Cachorro cachorro = new Cachorro("Dog");
        cachorro.setRaca("Shiba inu");

        Animal[] animals = new Animal[2];
        animals[0] = gato;
        animals[1] = cachorro;

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.printf("%s\n%s\n", animal.getNome(), animal.getRaca());
            System.out.printf("%s\n%s\n", animal.emiteSom(), animal.caminha());
        }        
    }
}