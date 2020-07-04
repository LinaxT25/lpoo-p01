public class TesteHeroi {
    public static void main(String[] args) {

        Ciclope ciclope = new Ciclope();

        // Não acontecerá!
        MarcaDoOculos marca1 = new MarcaDoOculos();

        MarcaDoOculos marca2 = MarcaDoOculos.OAKLEY;
        MarcaDoOculos marca3 = MarcaDoOculos.HB;

        ciclope.setMarcaDoOculos(MarcaDoOculos.OAKLEY);
        MarcaDoOculos oculosDoCiclope = ciclope.getMarcaDoOculos();

        System.out.println(oculosDoCiclope.getId());
        System.out.println(oculosDoCiclope.getPreco());

    }
}
