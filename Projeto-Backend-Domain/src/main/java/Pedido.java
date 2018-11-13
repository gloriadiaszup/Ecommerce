import java.util.ArrayList;

class Pedido {

    private ArrayList<Produto> produtos;
    private StatusPedido status;

    public Pedido( ArrayList<Produto> produtos_cliente, StatusPedido status){

        produtos = new ArrayList <Produto>();
        produtos.addAll(produtos_cliente);
        this.status = status;
    }


    public ArrayList <Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList <Produto> produtos) {
        this.produtos = produtos;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
