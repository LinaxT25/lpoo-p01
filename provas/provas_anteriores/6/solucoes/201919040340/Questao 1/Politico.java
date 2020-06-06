public class Politico extends Pessoa 
{
	private float propina; // Bastante

	Politico(String cpf, String nome, float propina)
	{
		super(nome, cpf);
		setPropina(propina);
	}

	@Override
	public void fazerOracao(Fe sortudo)
	{
		setPropina(propina - (float)100.00);
		sortudo.receberOracao();
	}

	@Override
	public void receberOracao()
	{
		System.out.println("Obrigado, votem em mim");
	}

	@Override 
	public String toString()
	{
		return getNome() + " " + getCpf() + " Recebeu " + getPropina() + " de propina";
	}

	// SETTERS E GETTERS
	private void setPropina(float propina)
	{
		this.propina = propina;
	}

	public float getPropina()
	{
		return propina;
	}
}