public class Wolverine extends Heroi 
{
    private float nivelDeAdamantium;
    private int tempoDeCicatrizacao;

    //setters
    public void setNivelDeAdamantium(float nivelDeAdamantium) {
        if(nivelDeAdamantium >= 0)
            this.nivelDeAdamantium = nivelDeAdamantium;
    }

    public void setTempoDeCicatrizacao(int tempoDeCicatrizacao) {
        if(tempoDeCicatrizacao >= 0)
            this.tempoDeCicatrizacao = tempoDeCicatrizacao;
    }

    //getters
    public float getNivelDeAdamantium() {
        return nivelDeAdamantium;
    }

    public int getTempoDeCicatrizacao() {
        return tempoDeCicatrizacao;
    }

    @Override
    public void machuca(Heroi superHeroi)
    {
        superHeroi.diminuiNivelDeResistencia(1);
        //if(superHeroi.getClass().getName().equals("HomemDeFerro"))
        if(superHeroi instanceof HomemDeFerro)
        {
            HomemDeFerro roubaDeFerro = (HomemDeFerro) superHeroi;
            roubaDeFerro.setQuantidadeDeNamoradasAtuais(roubaDeFerro.getQuantidadeDeNamoradasAtuais() - 1);
        }
    }

    @Override
    public void ajuda(Heroi superHeroi)
    {
        superHeroi.aumentaNivelDeResistencia(20);
    }

}