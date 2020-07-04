public enum MarcaDoOculos {
    OAKLEY(1, 500.0f), HB(2, 750.0f), RAYBAN(3, 600.0f);

    MarcaDoOculos(int id, float preco) {
        setId(id);
        setPreco(preco);
    }

    private int id;
    private float preco;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPreco(float preco) {
        if(preco >= 0)
            this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
}
