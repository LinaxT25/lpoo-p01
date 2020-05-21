import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		num = scanner.nextInt();
		int fat=num;
		
		for(int i=1; i<num; i++) {
			fat = fat*i;
		}
		System.out.println(fat);
	}
}