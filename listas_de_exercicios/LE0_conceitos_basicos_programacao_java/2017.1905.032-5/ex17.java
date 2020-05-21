public class ex17 {
	public static void main(String[] args) {
		int numeroConta, saldoInicial, despesas, creditos, limiteCredito;
		
		numeroConta = 123;
		saldoInicial = 2000;
		despesas = 800;
		creditos = 1000;
		limiteCredito = 500;
		saldoInicial = saldoInicial + despesas - creditos;
		System.out.println(saldoInicial);
		
		if(saldoInicial<limiteCredito)
			System.out.println("Limite de crédito excedido");
			
	}
}