package exer7;

public class Colecionavel {
    private int id;
    private String nome;
    private int dataAquisicao;
    private String listaAutores;

    public Colecionavel() {}

    public Colecionavel(int id, String nome, int dataAquisicao, String listaAutores) {
        setId(id);
        setNome(nome);
        setDataAquisicao(dataAquisicao);
        setListaAutores(listaAutores);
    }


    @Override
    public String toString() {
        return "dataAquisicao=" + getDataAquisicao() + ", id=" + getId()
                + ", listaAutores=" + getListaAutores() + ", nome=" + getNome();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(int dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(String listaAutores) {
        this.listaAutores = listaAutores;
    }

    
    
}