public class Luta {
    private Lutador lutador1;
    private Lutador lutador2;
    // 't' -> tempo ; 'n' -> nocaute ; 'f' -> finalização
    private String comoALutaAcabou;
    private Lutador ganhador;
    private Evento evento;

    public Luta(Lutador lutador1, Lutador lutador2, String comoALutaAcabou, Lutador ganhador, Evento evento) {
        setLutador1(lutador1);
        setLutador2(lutador2);
        setComoALutaAcabou(comoALutaAcabou);
        setGanhador(ganhador);
        setEvento(evento);
    }

    public void setLutador1(Lutador lutador1) {
        this.lutador1 = lutador1;
    }

    public Lutador getLutador1() {
        return lutador1;
    }

    public void setLutador2(Lutador lutador2) {
        this.lutador2 = lutador2;
    }

    public Lutador getLutador2() {
        return lutador2;
    }

    public void setComoALutaAcabou(String comoALutaAcabou) {
        if(comoALutaAcabou.equals("t") || comoALutaAcabou.equals("n") || comoALutaAcabou.equals("f"))
            this.comoALutaAcabou = comoALutaAcabou;
    }

    public String getComoALutaAcabou() {
        return comoALutaAcabou;
    }

    public void setGanhador(Lutador ganhador) {
        this.ganhador = ganhador;
    }

    public Lutador getGanhador() {
        return ganhador;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return getLutador1().getNome() + " x " + getLutador2().getNome() + ", " + getEvento().getNome() + ", Ganhador: " + getGanhador().getNome();
    }

}
