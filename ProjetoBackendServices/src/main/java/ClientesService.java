
public class ClientesService {

    public void adicionarAoCarrinho(Client cliente, Produto produto, int quantidade) {


        for (int i = 0; i < quantidade; i++)

            cliente.getCarrinho().add(produto);
    }

    public void removerDoCarrinho(Client cliente, Produto produto) {
        for (int i = 0; i < cliente.getCarrinho().size(); i++) {
            if (cliente.getCarrinho().get(i) == produto) {
                cliente.getCarrinho().remove(produto);
            }
        }
    }

    public double calculaFrete(Client cliente, String cep) {
        int P = 0;
        int G = 0;
        int M = 0;

        int caixaP = 0;
        int caixaM = 0;
        int caixaG = 0;
        double preco_frete;
        if (cep == cliente.getCep_loja()) {
            preco_frete = 0;
        } else {
            for (int i = 0; i < cliente.getCarrinho().size(); i++) {
                if (cliente.getCarrinho().get(i).getTamanho() == "P")
                    P++;
                if (cliente.getCarrinho().get(i).getTamanho() == "M")
                    M++;
                if (cliente.getCarrinho().get(i).getTamanho() == "G")
                    G++;

            }
            if (P % 10 == 0 && P / 10 == 0)
                caixaP = 0;
            else if (P % 10 > 0) {
                caixaP = 1;
                M += P / 10;
            }
            if (M % 5 > 0) {
                caixaM = 1;
                caixaG = M / 5;
            }
            caixaG += G;


            preco_frete = (caixaP * 5) + (caixaM * 20) + (caixaG * 25);
        }
        return preco_frete;
    }

    double preco_frete;

    public double preçoTotalCompra(Client cliente) {
        double valorTotal = 0;

        for (int i = 0; i < cliente.getCarrinho().size(); i++) {
            valorTotal += cliente.getCarrinho().get(i).getPreco();
        }
        valorTotal += preco_frete;
        return valorTotal;
    }

    static private int codigo = 0;

    public void comprar(Client cliente) {

        Pedido pedido = new Pedido(cliente.getCarrinho(), StatusPedido.AGUARDANDO_PAGAMENTO);
        cliente.getPedidos().add(pedido);
        System.out.println("Aguardando pagamento!");
    }

    public void pagar(Client cliente, int codigo_do_pedido, double dinheiro) {
        double preco = preçoTotalCompra(cliente);
        if (preco <= dinheiro) {
            System.out.println("Pagamento efetuado com sucesso!");
            cliente.getPedidos().get(codigo_do_pedido).setStatus(StatusPedido.PAGAMENTO_EFETUADO);
            cliente.getCarrinho().clear();
        } else if (preçoTotalCompra(cliente) < dinheiro) {
            System.out.println("Pagamento não autorizado");
        }
    }
}