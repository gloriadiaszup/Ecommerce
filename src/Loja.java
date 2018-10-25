import java.util.ArrayList;

public class Loja
{
    private String nome="";
    private String cnpj="989.556.567/0001-35";
    private Logradouro endereco=new Logradouro("Emidia Saraiva", "Carajas", "Minas Gerais", "Uberlândia", "38408587", 77);

    private ArrayList<Produto> vendidos = new ArrayList<Produto>();
    private ArrayList<Produto> estoque = new ArrayList<Produto>();

    private static  int i= 0;

    public void AdicionaProdutoEstoque(Produto produto)

    {
        estoque.add(produto);
    }

    public void VendeProduto(Produto produto, int quantidade)
    {
        vendidos.add(produto);
        for(int i=0; i<=estoque.size(); i++)
        {
           if(estoque.get(i)==produto)
           {
               produto.setQuantidade(produto.getQuantidade()-quantidade);
           }
        }
    }

    public void adicionaEmEstoque(Produto produto, int quantidade)
    {
        for(int i=0; i<=estoque.size(); i++)
        {
            if(estoque.get(i)==produto)
            {
                produto.setQuantidade(produto.getQuantidade()+quantidade);
            }
        }
    }

    public Clientes[] listadePedidos(int codigo, String nome, ArrayList<Pedido> pedidos)
    {

        Clientes[] cliente = new Clientes[500];

        cliente[codigo]= new Clientes(nome, pedidos);
         codigo++;

          return cliente;
    }


}
