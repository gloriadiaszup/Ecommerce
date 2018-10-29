import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private StatusPedido status;

    public Pedido( ArrayList<Produto> produtos, StatusPedido status) {

        this.produtos = (ArrayList<Produto>) produtos.clone();
        this.status = status;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
