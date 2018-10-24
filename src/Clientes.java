import java.util.ArrayList;

public class Clientes {

    private String nome;
    private String telefone;
    private String email;
    private Logradouro endereço;
    private ArrayList<Produto> comprados = new ArrayList<Produto>();
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();
    public static final String cep_loja = "38408587";
    public Clientes(String nome, String telefone, String cpf, Logradouro endereço)
    {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        this.endereço=endereço;
    }

    public String comprar()
    {
        double valor;
        StringBuilder compra= new StringBuilder();
        for (Produto aCarrinho : carrinho) {
            comprados.add(aCarrinho);
            //Valor ele vai recebendo o valor do produto e somando com o que já esta no buffer do valor
            compra.append("Produto: ").append(aCarrinho.getNome()).append(" Valor: ").append(aCarrinho.getPreço()).append("::: ");
        }
       // valor += calculaFret(cep);
       //compra += "Valor total: " + valor;
       carrinho.clear();
        return compra.toString();
    }

    public void adicionarAoCarrinho(Produto produto, int quantidade)
    {

        for(int i=1; i<=quantidade;i++)
            carrinho.add(produto);
    }

    public void removerDoCarrinho(Produto produto)
    {
       for (int i=0; i<carrinho.size(); i++){
           if (carrinho.get(i)==produto){
               carrinho.remove(i);
           }
       }
    }
    public double calculaFrete(String cep)
    {
        int P = 0;
        int G = 0;
        int M = 0;

        int QuantP = 0;
        int QuantM = 0;
        double preco_frete;
        if (cep == cep_loja)
        {
            preco_frete = 0;
        } else{
            for(int i=0;i<carrinho.size();i++){
                if(carrinho.get(i).getTamanho()=="P")
                    P++;
                if(carrinho.get(i).getTamanho()=="M")
                    M++;
                if(carrinho.get(i).getTamanho()=="G")
                    G++;

            }
            System.out.println(P);
            System.out.println(M);
            System.out.println(G);
            if (P%10>0)
           QuantP = 1;
            else
           QuantP = 0;

            if (M%5>0)
           QuantM = P/10;
            else
           QuantM = P/10+M%5;

           G=M/5+G;


            preco_frete = (QuantP*5) + (QuantM*20) + (G*25);
        }
        return preco_frete;
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

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) { this.email=email;}

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
