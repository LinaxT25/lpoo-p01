package exer3;

public class Tanque extends VeiculoTerrestre {
    private String modelo;
    private double expessuraBlindagem;
    private String calibreCanhao;

    public Tanque(int id, String modelo, double expessuraBlindagem, String calibreCanhao) {
        super(id);
        setModelo(modelo);
        setExpessuraBlindagem(expessuraBlindagem);
        setCalibreCanhao(calibreCanhao);
    }

    @Override
    public String toString() {
        return "Tanque [calibreCanhao=" + getCalibreCanhao() 
            + ", expessuraBlindagem=" + getExpessuraBlindagem() + ", modelo=" + getModelo() + "]";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getExpessuraBlindagem() {
        return expessuraBlindagem;
    }

    public void setExpessuraBlindagem(double expessuraBlindagem) {
        this.expessuraBlindagem = expessuraBlindagem;
    }

    public String getCalibreCanhao() {
        return calibreCanhao;
    }

    public void setCalibreCanhao(String calibreCanhao) {
        this.calibreCanhao = calibreCanhao;
    }

   

}