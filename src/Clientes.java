import java.util.ArrayList;

public class Clientes {

    private String nome;
    private String telefone;
    private String cpf;
    private Logradouro endereço;
    private ArrayList<Produto> comprados = new ArrayList<Produto>();
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();

    public Clientes(String nome, String telefone, String cpf, Logradouro endereço)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf=cpf;
        this.endereço=endereço;
    }

    public String Comprar()
    {
         StringBuilder compra= new StringBuilder();
        for (Produto aCarrinho : carrinho) {
            comprados.add(aCarrinho);
            compra.append("Produto: ").append(aCarrinho.getNome()).append(" Valor: ").append(aCarrinho.getPreço()).append("::: ");
        }
       carrinho.clear();
        return compra.toString();
    }

    public void AdicionarAoCarrinho(Produto produto)
    {
       carrinho.add(produto);
    }

    public void RemoverDoCarrinho(Produto produto)
    {
       for (int i=0; i<carrinho.size(); i++){
           if (carrinho.get(i).equals(produto)){
               carrinho.remove(produto);
           }
       }
    }

    public ArrayList<Produto> getCarrinho()
    {
      return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho)
    {
        this.carrinho = carrinho;
    }

    public void setComprados(ArrayList<Produto> comprados)
    {
        this.comprados = comprados;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCPF() {
        return cpf;
    }

    public Logradouro getEndereço() {
        return endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereço(Logradouro endereço) {
        this.endereço = endereço;
    }
}
