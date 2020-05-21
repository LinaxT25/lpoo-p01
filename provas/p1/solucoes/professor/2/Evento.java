public class Evento {
    private String nome;
    private String paisDeOrigem;

    public Evento(String nome, String paisDeOrigem) {
        setNome(nome);
        setPaisDeOrigem(paisDeOrigem);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    @Override
    public String toString() {
        return getNome() + "," + getPaisDeOrigem();
    }
}
