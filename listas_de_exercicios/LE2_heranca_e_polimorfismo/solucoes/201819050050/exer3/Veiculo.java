package exer3;

public abstract class Veiculo {

    private int id;
    private static int quantidadeVeiculoAereo;
    private static int quantidadeVeiculoTerrestre;


    public Veiculo(int id) {
        setId(id);
    }

    protected void locomover() {
        System.out.println("locomovendo...");
    }
    
    protected void bater(Veiculo veiculo) {
        System.out.println("O veiculo id=" + getId() + " colidiu com o veiculo id=" 
                            + veiculo.getId() + "(" + veiculo.getClass() + ")");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getQuantidadeVeiculoAereo() {
        return quantidadeVeiculoAereo;
    }

    public static void setQuantidadeVeiculoAereo(int qtd) {
        quantidadeVeiculoAereo = qtd;
    }

    public static int getQuantidadeVeiculoTerrestre() {
        return quantidadeVeiculoTerrestre;
    }

    public static void setQuantidadeVeiculoTerrestre(int qtd) {
        quantidadeVeiculoTerrestre = qtd;
    }

    @Override
    public String toString() {
        return "";
    }

    
}