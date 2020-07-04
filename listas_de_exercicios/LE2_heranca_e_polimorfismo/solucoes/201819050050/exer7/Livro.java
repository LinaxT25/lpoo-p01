package exer7;

public class Livro extends Colecionavel {
    private String nomeEditora;
    private int anoLancamento;

    public Livro(int id, String nome, int dataAquisicao, String listaAutores, String nomeEditora,
    int anoLancamento) {
        super(id, nome, dataAquisicao, listaAutores);
        setNomeEditora(nomeEditora);
        setAnoLancamento(anoLancamento);
    }   


    @Override
    public String toString() {
        return "Livro " + super.toString() + ", anoLancamento=" + getAnoLancamento() 
                + ", nomeEditora=" + getNomeEditora();
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    

   
}