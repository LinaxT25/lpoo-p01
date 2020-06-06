public class Gato extends Animal 
{
	private String racaoFavorita; // no melhor caso, Whiskas.

	Gato(String raca, int idade, String racaoFavorita)
	{
		super(raca, idade);
		setRacaoFavorita(racaoFavorita);
	}

	@Override
	public void fazerOracao(Fe sortudo)
	{
		System.out.println("Mi mi mi mi");
		sortudo.receberOracao();
	}

	@Override
	public void receberOracao()
	{
		return;
	}

	@Override 
	public String toString()
	{
		return "Gato de raca " + getRaca() + " tem " + getIdade() + " ano(s) de idade, e gosta de " + getRacaoFavorita();
	}


	// SETTERS E GETTERS
	private void setRacaoFavorita(String racaoFavorita)
	{
		this.racaoFavorita = racaoFavorita;
	}

	public String getRacaoFavorita()
	{
		return racaoFavorita;
	}
}