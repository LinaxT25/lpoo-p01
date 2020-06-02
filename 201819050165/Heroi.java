public abstract class Heroi implements MachucaAjuda
{
    private String nome;
    private String descricao;
    private Data dataDeCriacao; //criar classe data
    private String paisNatal;
    private int nivelDeResistencia;
    private int estadoDeSaude; //usar enum
    private String habilidades[];
    private int quantidadeDeHabilidades;

    //construtor
    Heroi()
    {
        habilidades = new String[10];
        setQuantidadeDeHabilidades(0);
    }
//setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataDeCriacao(Data dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public void setPaisNatal(String paisNatal) {
        this.paisNatal = paisNatal;
    }

    public void setNivelDeResistencia(int nivelDeResistencia) {
        if(nivelDeResistencia >= 0 && nivelDeResistencia <= 100)
        {
            this.nivelDeResistencia = nivelDeResistencia;
            if(nivelDeResistencia <= 30)
                this.setEstadoDeSaude(0);
            else if(nivelDeResistencia <= 70)
                this.setEstadoDeSaude(1);
            else
                this.setEstadoDeSaude(2);
        }
    }

    private void setEstadoDeSaude(int estadoDeSaude) {
        this.estadoDeSaude = estadoDeSaude;
    }

    public void setHabilidades(String[] habilidades) {
        setQuantidadeDeHabilidades(0);
        while(habilidades[getQuantidadeDeHabilidades()] != null)
        {
            setQuantidadeDeHabilidades(getQuantidadeDeHabilidades() + 1);
        }
        this.habilidades = habilidades;
    }//maybe muda pra adicionaHabilidade

    private void setQuantidadeDeHabilidades(int quantidadeDeHabilidades) {
        this.quantidadeDeHabilidades = quantidadeDeHabilidades;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Data getDataDeCriacao() {
        return dataDeCriacao;
    }

    public String getPaisNatal() {
        return paisNatal;
    }
    
    public int getNivelDeResistencia() {
        return nivelDeResistencia;
    }

    public int getEstadoDeSaude() {
        return estadoDeSaude;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public int getQuantidadeDeHabilidades() {
        return quantidadeDeHabilidades;
    }

    //outros metodos

    public void aumentaNivelDeResistencia(int cura)
    {
        setNivelDeResistencia(getNivelDeResistencia() + cura);
    }

    public void diminuiNivelDeResistencia(int dano)
    {
        setNivelDeResistencia(getNivelDeResistencia() - dano);
    }

    public void adicionaHabilidade(String novaHabilidade)
    {
        if(getQuantidadeDeHabilidades() <= 9)
        {
            habilidades[getQuantidadeDeHabilidades()] = novaHabilidade;
            setQuantidadeDeHabilidades(getQuantidadeDeHabilidades() + 1);
        }
    }

}

