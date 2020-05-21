import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		int quilometroDirigido, litroConsumido;
		int totalQuilometroDirigido=0, totalLitroConsumido=0;
		float media;
		
		Scanner scanner = new Scanner(System.in);
		quilometroDirigido = scanner.nextInt();
		litroConsumido = scanner.nextInt();
		
		do {
			System.out.printf("Consumo km/litro: %.2f\n",media=(quilometroDirigido/litroConsumido));
			System.out.printf("Quilometragem combinada: %d\n",quilometroDirigido+totalQuilometroDirigido);
			System.out.printf("Total de litros: %d\n",litroConsumido+totalLitroConsumido);
			totalQuilometroDirigido += quilometroDirigido;
			totalLitroConsumido += litroConsumido;
		
			quilometroDirigido = scanner.nextInt();
			litroConsumido = scanner.nextInt();		
		} while(quilometroDirigido!=0 && litroConsumido!=0);
	}
}