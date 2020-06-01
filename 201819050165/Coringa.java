public class Coringa implements MachucaAjuda
{
    private String paisAtual;

    //setter
    public void setPaisAtual(String paisAtual) {
        this.paisAtual = paisAtual;
    }

    //getter
    public String getPaisAtual() {
        return paisAtual;
    }

    @Override
    public void machuca(Heroi superHeroi)
    {
        superHeroi.setNivelDeResistencia(1);
    }

    @Override
    public void ajuda(Heroi superHeroi)
    {
        superHeroi.aumentaNivelDeResistencia(1);
    }
}