
class ClientesService {

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


    private double precoTotalCompra(Client cliente) {
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
        double preco = precoTotalCompra(cliente);
        if (preco <= dinheiro) {
            System.out.println("Pagamento efetuado com sucesso!");
            cliente.getPedidos().get(codigo_do_pedido).setStatus(StatusPedido.PAGAMENTO_EFETUADO);
            cliente.getCarrinho().clear();
        } else if (precoTotalCompra(cliente) < dinheiro) {
            System.out.println("Pagamento não autorizado");
        }
    }
}
