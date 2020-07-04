package exer7;

public class TesteColecao {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "La loi", 2007, "Fréderic Bastiat", "lmv", 2000);

        String [] faixas = { "Just Another Story",  "Stillness in Time", "Half the Man",  "Light Years",
                         "Manifest Destiny", "Kids", "Mr. Moon", "Scam","Journey to Arnhemland",
                         "Morning Glory", "Space Cowboy" };
        Cd cd = new Cd(2, "The Return of the Space Cowboy", 1998, "Jamiroquai" , "acid-jazz", faixas);
        
        String descricao = "Lieutenant John Dunbar, assigned to a remote western Civil War outpost, befriends wolves and Indians,"
                         + "making him an intolerable aberration in the military.";
        Dvd dvd = new Dvd(3, "Dances with Wolves", 2000, "Kevin Costner", "Adventure - Drama - Western", descricao);

        Revista revista = new Revista(4, "People - Diana", 2001, "Dan Wakeford", 1997, 199, "People", "Tribute for Princess Diana");

        // System.out.println(livro.getNome());
        // System.out.println(cd.getFaixas()[1]);
        // System.out.println(dvd.getDescricao());
        // System.out.println(revista.getListaAutores());


        Colecionavel [] colecionavels = new Colecionavel[4];
        colecionavels[0] = livro;
        colecionavels[1] = cd;
        colecionavels[2] = dvd;
        colecionavels[3] = revista;
        
        for (Colecionavel colecionavel : colecionavels) {
            System.out.println(colecionavel);
            System.out.printf("\n");
        }

    }
}