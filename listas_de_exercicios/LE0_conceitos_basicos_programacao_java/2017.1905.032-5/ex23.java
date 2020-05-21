import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		num = scanner.nextInt();
		int contador=0, res=0;
		int vetor[] = new int[1000];
		while(num != 0) {
			vetor[contador] = num%10;
			num = num/10;
			contador++;
		}
		
		for(int i=0; i<contador; i++) {
			if(vetor[i] == 1) {
				res = res + (int)Math.pow(2,i);
			}
		}
		System.out.println(res);		
	}
}