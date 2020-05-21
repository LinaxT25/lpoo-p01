import java.util.Scanner;

public class ex25 {
	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		num = scanner.nextInt();
		double fat=1, e=1;;
		
		for(int i=1; i<=num; i++) {
			fat = 1/(fat*i);
			e += fat;
		}
		System.out.printf("%.2f\n", e);
	}
}