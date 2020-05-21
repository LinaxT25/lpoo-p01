public class ex27 {
	public static void main(String[] args) {
		int res=0;
		for(int i=1; i<=15; i++) {
			if(i%2 != 0) {
				res = res + i;
			}
		}
		System.out.printf("O produto dos números de 1 a 15 é %d\n", res);
	}
}