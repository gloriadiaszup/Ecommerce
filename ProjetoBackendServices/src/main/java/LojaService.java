

public class LojaService {

    public void AdicionaProdutoEstoque(Loja loja,  Produto produto)

    {
        loja.getEstoque().add(produto);
    }

    public void VendeProduto(Loja loja, Produto produto, int quantidade)
    {
        loja.getVendidos().add(produto);
        for(int i=0; i<=loja.getEstoque().size(); i++)
        {
            if(loja.getEstoque().get(i).equals(produto))
            {
                produto.setQuantidade(produto.getQuantidade()-quantidade);
            }
        }
    }

    public void AdicionaEmEstoque(Loja loja, Produto produto, int quantidade)
    {
        for(int i=0; i<=loja.getEstoque().size(); i++)
        {
            if(loja.getEstoque().get(i)==produto)
            {
                produto.setQuantidade(produto.getQuantidade()+quantidade);
            }
        }
    }
}
