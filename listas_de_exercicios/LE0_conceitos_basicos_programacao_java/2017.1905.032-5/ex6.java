public class ex6 {
	public static void main(String[] args) {
		int i=1, soma=0;
		
		/*
		for(i=1; i<=1000; i++)		
			soma += i;
		System.out.println(soma);
		*/
		
		/*
		while(i<=1000) {
			soma += i;
			i++;
		}
		System.out.println(soma);
		*/
		
		do {
			soma += i;
			i++;
		} while(i<=1000);
		System.out.println(soma);
	}
}