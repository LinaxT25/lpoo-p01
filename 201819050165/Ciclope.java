public class Ciclope extends Heroi
{
    private MarcaDoOculos marcaDoOculos; //enum

    //setter
    public void setMarcaDoOculos(int marcaDoOculos) {
        if(marcaDoOculos>=0 && marcaDoOculos <=2)
            this.marcaDoOculos = marcaDoOculos;
    }

    //getter
    public int getMarcaDoOculos() {
        return marcaDoOculos;
    }

    @Override
    public void machuca(Heroi superHeroi)
    {
        superHeroi.diminuiNivelDeResistencia(10);
        if(superHeroi instanceof Wolverine)
        {
            Wolverine daJeanGrey = (Wolverine) superHeroi;
            daJeanGrey.setTempoDeCicatrizacao(daJeanGrey.getTempoDeCicatrizacao() + 5);
        }
    }

    @Override
    public void ajuda(Heroi superHeroi)
    {
        superHeroi.aumentaNivelDeResistencia(10);
    }
}
