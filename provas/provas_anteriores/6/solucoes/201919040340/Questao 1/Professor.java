public class Professor extends Pessoa
{
	private float divida;

	Professor(String cpf, String nome, float divida)
	{
		super(nome, cpf);
		setDivida(divida);
	}

	@Override
	public void fazerOracao(Fe sortudo)
	{
		setDivida(divida * (float)0.9);
		sortudo.receberOracao();
	}

	@Override
	public void receberOracao()
	{
		setDivida(divida - (float)250.00);
	}

	@Override 
	public String toString()
	{
		return getNome() + " " + getCpf() + " tem " + getDivida() + " de divida";
	}


	// SETTERS E GETTERS
	private void setDivida(float divida)
	{
		this.divida = divida;
	}

	public float getDivida()
	{
		return divida;
	}
}