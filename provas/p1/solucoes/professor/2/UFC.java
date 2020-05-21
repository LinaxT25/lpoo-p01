public class UFC {
    public static void main(String[] args) {
        int opcao;
        Leitor leitor = new Leitor();
        Evento eventos[] = new Evento[10];
        Lutador lutadores[] = new Lutador[100];
        int quantidadeDeEventos = 0, quantidadeDeLutadores = 0, quantidadeDeArtesMarciais = 0;
        String nome, paisDeOrigem, arteMarcial;

        do {
            System.out.println("(1) - Cadastrar evento");
            System.out.println("(2) - Cadastrar lutador");
            System.out.println("(3) - Cadastrar luta");
            System.out.println("(4) - Listar todos os eventos");
            System.out.println("(5) - Listar todos os lutadores");
            System.out.println("(6) - Sair");

            opcao = leitor.leInteiro();

            switch(opcao) {
                case 1:
                    System.out.println("Cadastrando um evento!");
                    System.out.println("Digite o nome do evento");
                    nome = leitor.leString();
                    System.out.println("Digite o pais de origem do evento");
                    paisDeOrigem = leitor.leString();

                    Evento evento = new Evento(nome, paisDeOrigem);
                    eventos[quantidadeDeEventos] = evento;
                    quantidadeDeEventos++;

                    break;

                case 2:
                    System.out.println("Cadastrando um lutador!");
                    System.out.println("Digite seu nome");
                    nome = leitor.leString();
                    System.out.println("Digite sua principal arte marcial");
                    arteMarcial = leitor.leString();

                    Lutador lutador = new Lutador(nome, arteMarcial);

                    System.out.println("Quantas artes marciais ele pratica?");
                    quantidadeDeArtesMarciais = leitor.leInteiro();

                    for(int i = 0 ; i < quantidadeDeArtesMarciais ; i++) {
                        System.out.println("Digite a arte marcial");
                        arteMarcial = leitor.leString();
                        lutador.adicionaArteMarcial(arteMarcial);
                    }

                    lutadores[quantidadeDeLutadores] = lutador;
                    quantidadeDeLutadores++;

                    break;

                case 3:
                    int lutador1, lutador2, eventoId, ganhador;
                    Lutador lutadorGanhador;
                    String comoALutaAcabou;

                    System.out.println("Cadastrando uma luta!");
                    System.out.println("Escolha qual o primeiro lutador:");
                    for(int i = 0 ; i < quantidadeDeLutadores ; i++) {
                        System.out.println(i + " - " + lutadores[i].getNome());
                    }
                    lutador1 = leitor.leInteiro();

                    System.out.println("Escolha qual o segundo lutador:");
                    for(int i = 0 ; i < quantidadeDeLutadores ; i++) {
                        System.out.println(i + " - " + lutadores[i].getNome());
                    }
                    lutador2 = leitor.leInteiro();

                    System.out.println("Como a luta acabou?");
                    System.out.println("(t) Tempo, (f) Finalização, (n) Nocaute");
                    comoALutaAcabou = leitor.leString();

                    System.out.println("Qual foi o evento?");
                    for(int i = 0 ; i < quantidadeDeEventos ; i++) {
                        System.out.println(i + " - " + eventos[i].getNome());
                    }
                    eventoId = leitor.leInteiro();

                    System.out.println("Quem foi o ganhador?");
                    System.out.println("(1) " + lutadores[lutador1].getNome());
                    System.out.println("(2) " + lutadores[lutador2].getNome());
                    ganhador = leitor.leInteiro();
                    lutadorGanhador = (ganhador == 1 ? lutadores[lutador1] : lutadores[lutador2]);
                    // if(ganhador == 1)
                    //     lutadorGanhador = lutadores[lutador1];
                    // else
                    //     lutadorGanhador = lutadores[lutador2];

                    Luta luta = new Luta(
                                            lutadores[lutador1],
                                            lutadores[lutador2],
                                            comoALutaAcabou,
                                            lutadorGanhador,
                                            eventos[eventoId]
                                        );
                    lutadores[lutador1].adicionaLuta(luta);
                    lutadores[lutador2].adicionaLuta(luta);

                    break;

                case 4:
                    System.out.println("Listando todos os eventos!");
                    for(int i = 0 ; i < quantidadeDeEventos ; i++)
                        System.out.println(eventos[i]);
                    break;

                case 5:
                    System.out.println("Listando todos os lutadores!");
                    for(int i = 0 ; i < quantidadeDeLutadores ; i++) {
                        System.out.println(lutadores[i]);
                    }
                    break;

                case 6:
                    System.out.println("Bye");
                    break;
            }

        } while (opcao != 6);

    }
}
