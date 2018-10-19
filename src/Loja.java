import java.util.ArrayList;

public class Loja
{
    private String nome="";
    private String cnpj="989.556.567/0001-35";
    private Logradouro endereco=new Logradouro("Emidia Saraiva", "Carajas", "Minas Gerais", "Uberlândia", "38408587", 77);

    private ArrayList<Produto> vendidos = new ArrayList<Produto>();
    private ArrayList<Produto> estoque = new ArrayList<Produto>();


    public void adicionaProdutoEstoque(Produto produto)

    {
        estoque.add(produto);
    }

    public void vendeProduto(Produto produto, int quantidade)
    {
        vendidos.add(produto);
        for(int i=0; i<=estoque.size(); i++)
        {
           if(estoque.get(i).equals(produto))
           {
               produto.setQuantidade(produto.getQuantidade()-quantidade);
           }
        }
    }

    public void AdicionaEmEstoque(Produto produto, int quantidade)
    {
        for(int i=0; i<=estoque.size(); i++)
        {
            if(estoque.get(i).equals(produto))
            {
                produto.setQuantidade(produto.getQuantidade()+quantidade);
            }
        }
    }


}
