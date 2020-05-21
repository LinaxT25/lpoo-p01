import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		int maior=0, aux=Integer.MIN_VALUE;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<10; i++) {			
			maior = scanner.nextInt();
			if(maior < aux)
				maior = aux;
			else
				aux = maior;
		}
		System.out.printf("Maior inteiro: %d\n", maior);
	}
}