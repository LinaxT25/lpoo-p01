public class Cachorro extends Animal
{
	private int mordidas;

	Cachorro(String raca, int idade, int mordidas)
	{
		super(raca, idade);
		setMordidas(mordidas);
	}
	@Override
	public void fazerOracao(Fe sortudo)
	{
		System.out.println("Au au au au");
		sortudo.receberOracao();
	}

	@Override
	public void receberOracao()
	{
		setMordidas(mordidas - 1);
	}

	@Override
	public String toString()
	{
		return "Cachorro de raca " + getRaca() + " tem " + getIdade() + " ano(s) de idade, e mordeu " + getMordidas() + " vezes";
	}

	// SETTERS E GETTERS
	private void setMordidas(int mordidas)
	{
		this.mordidas = mordidas;
	}

	public int getMordidas()
	{
		return mordidas;
	}
}