public class Lutador {
    private String nome;
    private String principalArteMarcial;
    private String[] artesMarciais;
    private int quantidadeDeArtesMarciais;
    private int quantidadeDeLutas;
    private int vitorias;
    private int derrotas;
    private Luta[] lutas;

    public Lutador() {
        artesMarciais = new String[10];
        lutas = new Luta[1000];
        quantidadeDeArtesMarciais = 0;
        quantidadeDeLutas = 0;
        vitorias = 0;
        derrotas = 0;
    }

    public Lutador(String nome, String principalArteMarcial) {
        this();
        setNome(nome);
        setPrincipalArteMarcial(principalArteMarcial);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPrincipalArteMarcial(String principalArteMarcial) {
        this.principalArteMarcial = principalArteMarcial;
    }

    public String getPrincipalArteMarcial() {
        return principalArteMarcial;
    }

    public void adicionaArteMarcial(String arteMarcial) {
        artesMarciais[quantidadeDeArtesMarciais] = arteMarcial;
        quantidadeDeArtesMarciais++;
    }

    public void adicionaLuta(Luta luta) {
        if(luta.getGanhador() == this)
            vitorias++;
        else
            derrotas++;

        lutas[quantidadeDeLutas] = luta;
        quantidadeDeLutas++;
    }

    public int getQuantidadeDeLutas() {
        return quantidadeDeLutas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    @Override
    public String toString() {
        String texto = "";
        texto = getNome();
        texto += ",";
        texto += getPrincipalArteMarcial();
        texto += "\n";
        texto += "Vitórias: ";
        texto += getVitorias();
        texto += "\n";
        texto += "Derrotas: ";
        texto += getDerrotas();
        texto += "\n";
        for(int i = 0 ; i < getQuantidadeDeLutas() ; i++) {
            texto = texto + "Luta " + i + ": " + lutas[i];
        }

        return texto;
    }
}
