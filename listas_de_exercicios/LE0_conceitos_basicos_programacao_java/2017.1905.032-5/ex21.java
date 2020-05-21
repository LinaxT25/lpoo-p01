import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		int maior1=0, maior2=Integer.MIN_VALUE, aux=Integer.MIN_VALUE;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<10; i++) {			
			maior1 = scanner.nextInt();
			if(maior1 < aux)
				maior1 = aux;
			else
				aux = maior1;
		}

		System.out.printf("Maior inteiro: %d\nSegundo maior inteiro: %d\n", maior1, maior2);
	}
}