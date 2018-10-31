import java.util.ArrayList;

public class Loja
{
    private String nome="";
    private String cnpj="989.556.567/0001-35";
    private Logradouro endereco=new Logradouro("Emidia Saraiva", "Carajas", "Minas Gerais", "Uberlândia", "38408587", 77);

    private ArrayList<Produto> vendidos = new ArrayList<Produto>();
    private ArrayList<Produto> estoque = new ArrayList<Produto>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Logradouro getEndereco() {
        return endereco;
    }

    public void setEndereco(Logradouro endereco) {
        this.endereco = endereco;
    }

    public ArrayList <Produto> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList <Produto> vendidos) {
        this.vendidos = vendidos;
    }

    public ArrayList <Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(ArrayList <Produto> estoque) {
        this.estoque = estoque;
    }
}
