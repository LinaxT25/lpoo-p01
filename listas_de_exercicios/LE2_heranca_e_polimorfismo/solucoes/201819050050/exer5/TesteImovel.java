package exer5;

public class TesteImovel {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo(971480, "100 Civic Center Way"
                              + "Calabasas CA 91302 United States", 8000);
        Velho imoveVelho = new Velho(3599000, "25420 Prado De Oro"
                              + "Calabasas, CA 91302", 320000);
        System.out.println(imoveVelho);
        System.out.println(imovelNovo);

    }
    
}