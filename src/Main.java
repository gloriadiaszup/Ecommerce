import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
           Loja loja = new Loja();
           Produto mouse = new Produto("mouse", 65.00, "mouse sem fio", 15);
           Produto teclado = new Produto ("teclado", 90.0, "teclado sem fio", 15);

           loja.AdicionaProdutoEstoque(mouse);
           loja.AdicionaProdutoEstoque(teclado);

           Logradouro endereco = new Logradouro("mato grosso", "saraiva", "minas gerais", "uberlandia", "38408587", 1192);
           Clientes gloria = new Clientes("Glória", "34998016709", "13144757627",endereco);

           gloria.AdicionarAoCarrinho(mouse);
           gloria.AdicionarAoCarrinho(teclado);

           String gloriaCompra = gloria.Comprar();
           gloria.RemoverDoCarrinho(mouse);

           System.out.println(gloriaCompra);


    }
}
