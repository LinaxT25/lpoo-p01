public class ex7 {
	public static void main(String[] args) {
		int i = 1;
		/*
		for(i=1; i<=100; i++)		
			if(i%3 == 0)
				System.out.println(i);				
		*/
		
		/*
		while(i<=100) {
			if(i%3 == 0)
				System.out.println(i);
			i++;
		}
		*/
		
		do {
			if(i%3 == 0)	
				System.out.println(i);
			i++;
		} while(i<=100);
	}
}