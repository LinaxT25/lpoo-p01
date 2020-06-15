package exer7;

public class Dvd extends Colecionavel {
    private String tipo;
    private String descricao;

    public Dvd(int id, String nome, int dataAquisicao, String listaAutores, String tipo, String descricao) {
        super(id, nome, dataAquisicao, listaAutores);
        setTipo(tipo);
        setDescricao(descricao);
    }


    @Override
    public String toString() {
        return "Dvd " + super.toString() + ", descricao=" + getDescricao() 
                + ", tipo=" + getTipo();
    }
 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    
}