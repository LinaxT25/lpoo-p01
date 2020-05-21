public class ex8 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;		
		int fat = 1;
		
		/*
		for(i=1; i<=10; i++) {
			for(j=1; j<=i; j++)
				fat *= j;
			System.out.println(fat);				
			fat = 1;
		}
		*/
		
		/*		
		while(i<=10) {
			while(j<=i) {
				fat *= j;
				j++;
			}
			System.out.println(fat);
			i++;
		}
		*/
		
		do {
			do {
				fat *= i;
				j++;
			} while (j<=i);			
			System.out.println(fat);
			i++;
		} while(i<=10);
	}
}