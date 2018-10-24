import java.util.ArrayList;

public class Main {

    public static void main (String[] args){

        Logradouro juliaendereço = new Logradouro("mato grosso", "alameda", "RS", "Porto Alegre", "38576384", 1192);
        Clientes Julia = new Clientes("julia", "34998016787", "13144435643", juliaendereço);

        Loja loja = new Loja();

        Produto camiseta_azul = new Produto("camiseta_azul", 30.00, "P", 15);
        Produto camiseta_rosa = new Produto("camiseta rosa", 30.00, "M", 15);
        Produto camiseta_verde = new Produto("camiseta verde", 30.00, "G", 15);

        Julia.adicionarAoCarrinho(camiseta_azul,10);
        Julia.adicionarAoCarrinho(camiseta_rosa,5);
        Julia.adicionarAoCarrinho(camiseta_verde,1);


        double frete = Julia.calculaFrete("38465786");
        System.out.println(frete);
        Julia.comprar();

    }
}
