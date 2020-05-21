public class ex10 {
	public static void main(String[] args) {
		int i;
		int x = 100;
		for(i=x ;i>1; i=x){
			if(x%2 == 0)
				x = x/2;
			else
				x = (3*x) + 1;
			System.out.println(x);
		}
	}
}