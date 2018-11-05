import java.util.ArrayList;

public class Pedido {

    private final ArrayList<Produto> produtos = new ArrayList<Produto>();
    private StatusPedido status;

    public Pedido( ArrayList<Produto> produtos_cliente, StatusPedido status){

        produtos.addAll(produtos_cliente);
        this.status = status;
    }


    public ArrayList <Produto> getProdutos() {
        return produtos;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
