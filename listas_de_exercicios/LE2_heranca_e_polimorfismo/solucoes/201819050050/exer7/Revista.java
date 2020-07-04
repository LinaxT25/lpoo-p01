package exer7;

public class Revista extends Colecionavel {
    private int anoDePublicacao;
    private int volume;
    private String editora;
    private String principaisAssuntos;

    public Revista(int id, String nome, int dataAquisicao, String listaAutores, int anoDePublicacao, int volume,
            String editora, String principaisAssuntos) {
        super(id, nome, dataAquisicao, listaAutores);
        setAnoDePublicacao(anoDePublicacao);
        setVolume(volume);
        setEditora(editora);
        setPrincipaisAssuntos(principaisAssuntos);
    }
    

    @Override
    public String toString() {
        return "Revista " + super.toString() + ", ano de Publicacao=" + getAnoDePublicacao() 
                + ", editora=" + getEditora() + ", principais Assuntos=" + getPrincipaisAssuntos() 
                + ", volume=" + getVolume();
    }



    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPrincipaisAssuntos() {
        return principaisAssuntos;
    }

    public void setPrincipaisAssuntos(String principaisAssuntos) {
        this.principaisAssuntos = principaisAssuntos;
    }

   
}