public abstract class Animal implements Fe
{
	private String raca;
	private int idade;

	Animal(String raca, int idade)
	{
		setRaca(raca);
		setIdade(idade);
	}

	protected void setRaca(String raca)
	{
		this.raca = raca;
	}

	protected void setIdade(int idade)
	{
		this.idade = idade;
	}

	public String getRaca()
	{
		return raca;
	}

	public int getIdade()
	{
		return idade;
	}

}