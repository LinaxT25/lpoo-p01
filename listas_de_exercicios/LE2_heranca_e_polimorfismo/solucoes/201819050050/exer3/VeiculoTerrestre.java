package exer3;

public abstract class VeiculoTerrestre extends Veiculo {


    public VeiculoTerrestre(int id) {
        super(id);
        Veiculo.setQuantidadeVeiculoTerrestre(Veiculo.getQuantidadeVeiculoTerrestre()+1);
    }

    @Override
    protected void locomover() {
        andar();
    }

    protected void andar() {
        System.out.println("Andando...");
    }

    @Override
    public String toString() {
        return "";
    }
}