class Produto {
    private String nome;
    private double preco;
    private String tamanho;
    private int quantidade;

    public Produto(String nome, double preco, String tamanho, int quantidade)
    {
       this.nome=nome;
       this.preco=preco;
       this.tamanho=tamanho;
       this.quantidade=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
