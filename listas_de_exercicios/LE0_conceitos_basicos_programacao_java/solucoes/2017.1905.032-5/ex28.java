import java.util.Scanner;

public class ex28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Informe o número de vendas: ");
		int quantidade = scanner.nextInt();
			
		int venda[][] = new int[quantidade][2];
		double produto[] = new double[5];
		
		System.out.println("PARTE 1");
		int aux;
		for(int i=0; i<quantidade; i++) {
			System.out.printf("Informe o Número de Produto e a Quantidade Vendida: ");
			aux = scanner.nextInt();
			if(aux != 0) {
				venda[i][0] = aux;
				venda[i][1] = scanner.nextInt();
			} else {
				System.out.println("Produto inválido!");		
				i--;
			}
		}
		
		int opcao, sair=0;
		System.out.println("PARTE 2");			
		do {
			System.out.println("Informe o Número de Produto e seu Preço de Varejo/ Digite 6 para sair");
			opcao = scanner.nextInt();
			switch(opcao) {
				case 1:
					produto[0] = scanner.nextDouble();
					break;				
				case 2:
					produto[1] = scanner.nextDouble();
					break;				
				case 3:
					produto[2] = scanner.nextDouble();
					break;				
				case 4:
					produto[3] = scanner.nextDouble();
					break;				
				case 5:
					produto[4] = scanner.nextDouble();
					break;
				case 6:
					sair = 1;
					break;
				default:
					System.out.println("Produto não existe!");	
					break;
			}
		}while(sair!=1);
		
		double total=0.0;
		for(int i=0; i<quantidade; i++) {
			System.out.printf("Produto: %d Quantidade: %d Valor: %.2f\n", venda[i][0], venda[i][1], produto[venda[i][0]-1]);
			if(venda[i][1] > 0) {
				total = total + (venda[i][1]*produto[venda[i][0]-1]);
			}
		}
		System.out.printf("PREÇO TOTAL: %.2f\n", total);
	}
}