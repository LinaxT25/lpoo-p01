public class ex11 {
	public static void main(String[] args) {
		int i, j, n;
		
		n = 4;
		for(i=1 ;i<=n; i++){
			for(j=i; j<=i*i; j+=i) {
				System.out.printf("%d ",j);	
			}
			System.out.println();
		}
	}
}