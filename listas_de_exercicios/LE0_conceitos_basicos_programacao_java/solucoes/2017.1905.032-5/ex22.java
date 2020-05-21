import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		int num, sair=0;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("Digite um número: ");
			num = scanner.nextInt();
			int aux, contador=0;			
			int vetor[] = new int[5];
			aux = num;
			while(aux != 0) {
				if(contador < 5) {
					vetor[contador] = aux%10;
				}
				aux = aux/10;
				contador++;
			}
			
			if(contador == 5) {
				if(vetor[0]==vetor[4] && vetor[1]==vetor[3]) {
					System.out.println("Palíndromo");
				} else {
					System.out.println("Não é um Palíndromo");
				}
				sair = 1;
			} else {
				System.out.println("O número não contém 5 dígitos");
			}
		} while(sair!=1);		
	}
}