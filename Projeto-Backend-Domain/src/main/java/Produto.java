public class Produto {
    private String nome;
    private double preço;
    private String descrição;
    private int quantidade;

    public Produto(String nome, double preço, String descrição, int quantidade)
    {
       this.nome=nome;
       this.preço=preço;
       this.descrição=descrição;
       this.quantidade=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getPreço() {
        return preço;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
}
