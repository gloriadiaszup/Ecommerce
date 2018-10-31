import java.util.ArrayList;

public class Pedido {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Produto> produtos1 = new ArrayList<>();
    private StatusPedido status;

    public Pedido( ArrayList<Produto> produtos, StatusPedido status){

        produtos1.addAll(produtos);
        this.status = status;
    }


    public ArrayList <Produto> getProdutos1() {
        return produtos1;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

}
