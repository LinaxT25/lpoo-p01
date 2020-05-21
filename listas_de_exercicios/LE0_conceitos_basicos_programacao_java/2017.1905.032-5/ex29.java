public class ex29 {
	public static void main(String[] args) {
		double pi=4, denominador=1, aux;
		
		for(int i=1; i<=200000; i++) {
			denominador += 2;
			aux = 4/denominador;
			if(i%2 == 0) {
				pi += aux;
			} else {
				pi -= aux;
			}
		}
		System.out.printf("PI: %.6f\n", pi);
	}
}