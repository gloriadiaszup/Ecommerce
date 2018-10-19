import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preço;
    private String tamanho;
    private int quantidade;

    public Produto(String nome, double preço, String tamanho, int quantidade)
    {
       this.nome=nome;
       this.preço=preço;
       this.tamanho=tamanho;
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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
