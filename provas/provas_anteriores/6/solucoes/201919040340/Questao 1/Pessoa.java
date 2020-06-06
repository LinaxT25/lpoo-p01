public abstract class Pessoa implements Fe
{
	private String cpf;
	private String nome;

	Pessoa(String nome, String cpf)
	{
		setNome(nome);
		setCpf(cpf);
	}

	protected void setNome(String nome)
	{
		this.nome = nome;
	}

	protected void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getNome()
	{
		return nome;
	}

	public String getCpf()
	{
		return cpf;
	}
}