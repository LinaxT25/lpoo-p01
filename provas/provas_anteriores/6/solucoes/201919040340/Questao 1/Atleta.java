public class Atleta extends Pessoa
{
	private String nomeDoEsporte;

	Atleta(String cpf, String nome, String nomeDoEsporte)
	{
		super(nome, cpf);
		setNomeDoEsporte(nomeDoEsporte);
	}

	@Override
	public void fazerOracao(Fe sortudo)
	{
		System.out.println("no pain, no gain");
		sortudo.receberOracao();
	}

	@Override
	public void receberOracao()
	{
		System.out.println("Obrigado, torçam pra mim nos próximos jogos olímpicos.");
		return;
	}

	@Override 
	public String toString()
	{
		return getNome() + " " + getCpf() + " pratica " + getNomeDoEsporte();
	}


	// SETTERS E GETTERS
	private void setNomeDoEsporte(String nomeDoEsporte)
	{
		this.nomeDoEsporte = nomeDoEsporte;
	}

	public String getNomeDoEsporte()
	{
		return nomeDoEsporte;
	}
}