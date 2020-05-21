import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		int num, menor=Integer.MAX_VALUE;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("informe a quantidade de elementos: ");
		num = scanner.nextInt();
		int vetor[] = new int[num];		
		System.out.println("informe os elementos");
		for(int i=0; i<num; i++) {
			vetor[i] = scanner.nextInt();
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.printf("O menor valor é %d\n", menor);
	}
}