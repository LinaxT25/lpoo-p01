package exer3;

public class F_22 extends VeiculoAereo {
    private double autonomiaDeVoo;
    private String numeroSerial;
    private String tipoMotor;

    public F_22(int id, double autonomiaDeVoo, String numeroSerial, String tipoMotor) {
        super(id);
        setAutonomiaDeVoo(autonomiaDeVoo);
        setNumeroSerial(numeroSerial);
        setTipoMotor(tipoMotor);
    }

    @Override
    public String toString() {
        return "F_22 [autonomiaDeVoo=" + getAutonomiaDeVoo() + 
                ", numeroSerial=" + getNumeroSerial() + ", tipoMotor=" + getTipoMotor()
                + "]";
    }


    public double getAutonomiaDeVoo() {
        return autonomiaDeVoo;
    }

    public void setAutonomiaDeVoo(double autonomiaDeVoo) {
        this.autonomiaDeVoo = autonomiaDeVoo;
    }

    public String getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    

}