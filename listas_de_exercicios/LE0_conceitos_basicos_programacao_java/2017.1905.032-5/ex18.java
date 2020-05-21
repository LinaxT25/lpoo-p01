import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		int qntItemVedido, item;
		float precoItem, rendimento=0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1; i<=7; i++) {
			System.out.printf("Dia %d - Item (1 a 4): ", i);
			item = scanner.nextInt();	
			if(item>=1 && item<=4) {
				System.out.printf("Quantidade vendida: ");
				qntItemVedido = scanner.nextInt();	
				switch(item) {
					case 1:
						rendimento += qntItemVedido*239.99;
						break;
					case 2:
						rendimento += qntItemVedido*129.75;
						break;
					case 3:
						rendimento += qntItemVedido*99.95;
						break;
					case 4:
						rendimento += qntItemVedido*350.89;	
						break;		
					default:
						break;
				}
			}
		}
		System.out.printf("Rendimento: %.2f\n", rendimento*1.09);
	}
}