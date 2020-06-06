import java.util.Scanner;

public class SistemaDeOracoes
{
	public static void main(String[] args)
	{
		Politico politico = new Politico("017.017.017-17", "Jiar Balsonoro", (float)999999999.99);
		Atleta atleta = new Atleta("123.123.123-12", "Menino Ney", "Futebol");
		Professor professor = new Professor("456.456.456-45", "Girafales", (float)1000.00);

		Gato gato = new Gato("Siamês", 2, "Whiskas");
		Cachorro cachorro = new Cachorro("Shiba Inu", 5, 234);

		Scanner scanner = new Scanner(System.in);
		int entrada = 0;
		int entrada2=0;
		Fe rezador;

		System.out.println("Bem vindo ao programa do Joaozinho");

		while(entrada != 6)
		{
			System.out.println("Digite 1 para interagir com o político");
			System.out.println("Digite 2 para interagir com o atleta");
			System.out.println("Digite 3 para interagir com o Professor");
			System.out.println("Digite 4 para interagir com o gato");
			System.out.println("Digite 5 para interagir com o cachorro");
			System.out.println("Digite 6 para fechar o programa");
			entrada = scanner.nextInt();

			switch(entrada)
			{
				case 1:
				{
					System.out.println("Pra quem o politico vai rezar? digite o número correspondente");
					rezador = politico;

					entrada2 = scanner.nextInt();
					switch(entrada2)
					{
						case 2: 
							rezador.fazerOracao(atleta);
							break;
						case 3:
							rezador.fazerOracao(professor);
							break;
						case 4:
							rezador.fazerOracao(gato);
							break;
						case 5:
							rezador.fazerOracao(cachorro);
							break;
					}
					break;
				}

				case 2:
				{
					System.out.println("Pra quem o atleta vai rezar? digite o número correspondente");
					rezador = atleta;

					entrada2 = scanner.nextInt();
					switch(entrada2)
					{
						case 1: 
							rezador.fazerOracao(politico);
							break;
						case 3:
							rezador.fazerOracao(professor);
							break;
						case 4:
							rezador.fazerOracao(gato);
							break;
						case 5:
							rezador.fazerOracao(cachorro);
							break;
					}
					break;
				}

				case 3:
				{
					System.out.println("Pra quem o professor vai rezar? digite o número correspondente");
					rezador = professor;

					entrada2 = scanner.nextInt();
					switch(entrada2)
					{
						case 1: 
							rezador.fazerOracao(politico);
							break;
						case 2:
							rezador.fazerOracao(atleta);
							break;
						case 4:
							rezador.fazerOracao(gato);
							break;
						case 5:
							rezador.fazerOracao(cachorro);
							break;
					}
					break;
				}

				case 4:
				{
					System.out.println("Pra quem o gato vai rezar? digite o número correspondente");
					rezador = gato;

					entrada2 = scanner.nextInt();
					switch(entrada2)
					{
						case 1: 
							rezador.fazerOracao(politico);
							break;
						case 2:
							rezador.fazerOracao(atleta);
							break;
						case 3:
							rezador.fazerOracao(professor);
							break;
						case 5:
							rezador.fazerOracao(cachorro);
							break;
					}
					break;
				}

				case 5:
				{
					System.out.println("Pra quem o cachorro vai rezar? digite o número correspondente");
					rezador = cachorro;

					entrada2 = scanner.nextInt();
					switch(entrada2)
					{
						case 1: 
							rezador.fazerOracao(politico);
							break;
						case 2:
							rezador.fazerOracao(atleta);
							break;
						case 3:
							rezador.fazerOracao(professor);
							break;
						case 4:
							rezador.fazerOracao(gato);
							break;
					}
					break;
				}
			}
		}

		System.out.println(politico);
		System.out.println(atleta);
		System.out.println(professor);
		System.out.println(gato);
		System.out.println(cachorro);
	}
}