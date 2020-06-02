public class HomemDeFerro extends Heroi
{
    private int versaoDaArmadura;
    private int quantidadeDeNamoradasAtuais;

    //setters
    public void setVersaoDaArmadura(int versaoDaArmadura) {
        if(versaoDaArmadura > 0 && versaoDaArmadura <= 10)
            this.versaoDaArmadura = versaoDaArmadura;
    }

    public void setQuantidadeDeNamoradasAtuais(int quantidadeDeNamoradasAtuais) {
        if(quantidadeDeNamoradasAtuais >= 0)
            this.quantidadeDeNamoradasAtuais = quantidadeDeNamoradasAtuais;
    }

    //getters
    public int getVersaoDaArmadura() {
        return versaoDaArmadura;
    }

    public int getQuantidadeDeNamoradasAtuais() {
        return quantidadeDeNamoradasAtuais;
    }

    @Override
    public void machuca(Heroi superHeroi)
    {
        superHeroi.diminuiNivelDeResistencia(20);
    }

    @Override
    public void ajuda(Heroi superHeroi)
    {
        superHeroi.aumentaNivelDeResistencia(5);
    }
}