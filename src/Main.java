public class Main {

    public static void main (String[] args){

        Loja loja = new Loja();

        Produto camiseta_azul = new Produto("camiseta_azul", 30.00, "P", 15);
        Produto camiseta_rosa = new Produto("camiseta rosa", 30.00, "M", 15);
        Produto camiseta_verde = new Produto("camiseta verde", 30.00, "G", 15);

        loja.AdicionaProdutoEstoque(camiseta_azul);

        Logradouro juliaendereço = new Logradouro("mato grosso", "alameda", "RS", "Porto Alegre", "38576384", 1192);
        Client Julia = new Client("Julia", "34998016787", "13144435643", juliaendereço);

        loja.cadastraCliente(Julia);


        Julia.adicionarAoCarrinho( camiseta_azul,1);
        Julia.adicionarAoCarrinho(camiseta_rosa,1);
        Julia.adicionarAoCarrinho(camiseta_verde,1);

        System.out.println(Julia.preçoTotalCompra());
        Julia.comprar();
        Julia.pagar(0, 480.00);


        System.out.println(Julia.getPedidos().get(0).getProdutos());
    }
}