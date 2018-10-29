import com.sun.security.ntlm.Client;

import java.util.ArrayList;

public class ClientesService {

    public String Comprar(Clientes clientes)
    {
        StringBuilder compra= new StringBuilder();
        for (Produto aCarrinho : clientes.getCarrinho()) {
            clientes.getComprados().add(aCarrinho);
            compra.append("Produto: ").append(aCarrinho.getNome()).append(" Valor: ").append(aCarrinho.getPreço()).append("::: ");
        }
        clientes.getCarrinho().clear();
        return compra.toString();
    }

    public void AdicionarAoCarrinho(Clientes clientes, Produto produto)
    {
         clientes.getCarrinho().add(produto);
    }

        public void RemoverDoCarrinho(Clientes clientes, Produto produto)
        {
        for (int i=0; i<clientes.getCarrinho().size(); i++){
            if (clientes.getCarrinho().get(i).equals(produto)){
                clientes.getCarrinho().remove(produto);
            }
        }
    }
}
