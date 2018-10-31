public class Main {

    public static void main (String[] args){
           LojaService lojaService = new LojaService();
           Produto mouse = new Produto("mouse", 65.00, "mouse sem fio", 15);
           Produto teclado = new Produto ("teclado", 90.0, "teclado sem fio", 15);

           Loja loja = new Loja();

           lojaService.AdicionaProdutoEstoque(loja, mouse);
           lojaService.AdicionaProdutoEstoque(loja, teclado);

           Logradouro endereco = new Logradouro("mato grosso", "saraiva", "minas gerais", "uberlandia", "38408587", 1192);
           Client gloria = new Client("Glória", "34998016709", "13144757627", endereco);

           ClientesService gloriaService = new ClientesService();
           gloriaService.adicionarAoCarrinho(gloria, mouse, 1);
           gloriaService.adicionarAoCarrinho(gloria, teclado, 1);

    }
}
