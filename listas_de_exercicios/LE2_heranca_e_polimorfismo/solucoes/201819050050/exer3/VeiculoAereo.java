package exer3;

public abstract class VeiculoAereo extends Veiculo {


    public VeiculoAereo(int id) {
        super(id);
        Veiculo.setQuantidadeVeiculoAereo(Veiculo.getQuantidadeVeiculoAereo()+1);
    }

    @Override
    protected void locomover() {
        voar();
    }
    
    protected void voar() {
        System.out.println("Voando...");
    }

    @Override
    public String toString() {
        return "";
    }
}