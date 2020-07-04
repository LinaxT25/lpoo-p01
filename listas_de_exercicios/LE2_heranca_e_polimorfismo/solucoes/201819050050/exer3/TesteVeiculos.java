package exer3;

public class TesteVeiculos {
    public static void main(String[] args) {
        //Moto
        Moto cb = new Moto(1, "hje345", 998.4, "Vermelha", 141.4);

        //Tanque
        Tanque tank = new Tanque(2, "Tiger II", 178.1, "88.0 mm");

        //F22
        F_22 f22 = new F_22(3, 2960, "us234ta45-a", "Turbofan");

        //Boeing
        Boeing airplane = new Boeing(4, "247d", 10, 3, 6190.0);


        System.out.printf("Veiculos aereos = %d\nVeiculos terrestres = %d\n" ,
                          Veiculo.getQuantidadeVeiculoAereo(), Veiculo.getQuantidadeVeiculoTerrestre());

        Veiculo [] veiculos = new Veiculo[4];
        veiculos[0] = cb;
        veiculos[1] = tank;
        veiculos[2] = f22;
        veiculos[3] = airplane;

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
            veiculo.locomover();
            System.out.printf("\n");
        }

        veiculos[0].bater(veiculos[1]);
    }
    
}