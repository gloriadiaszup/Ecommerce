import java.util.ArrayList;

    public class Clientes {


    private String nome;
    private String telefone;
    private String email;
    private Logradouro endereco;
    private ArrayList<Produto> comprados = new ArrayList<Produto>();
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();
    private StatusPedido status_do_pedido;

    public Clientes(String nome, String telefone, String cpf, Logradouro endereco)
    {
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        this.endereco=endereco;
    }

        public Clientes(String nome, String telefone, String cpf, Logradouro endereco, ArrayList<Produto> carrinho, StatusPedido status_do_pedido)
        {
            this.nome=nome;
            this.telefone=telefone;
            this.email=email;
            this.endereco=endereco;
            this.status_do_pedido = getStatus_do_pedido();
        }


    public void adicionarAoCarrinho(Clientes cliente, Produto produto, int quantidade)
    {

        for(int i=0; i<quantidade;i++)

            carrinho.add(produto);

        if (carrinho.isEmpty()) {
            setStatus_do_pedido(StatusPedido.VAZIO);
        }
        else
        {
            status_do_pedido = StatusPedido.AGUARDANDO_COMPRA;
        }

    }

    public void removerDoCarrinho(Produto produto)
    {
       for (int i=0; i<carrinho.size(); i++){
           if (carrinho.get(i).equals(produto)){
               carrinho.remove(produto);
           }
       }
    }
        double preco_frete;

        public double preçoTotalCompra()
        {
            double valorTotal=0;

            for (int i=0; i<carrinho.size(); i++)
            {
                valorTotal+= carrinho.get(i).getPreco();
            }
            valorTotal+= preco_frete;
            carrinho.clear();
            return valorTotal;
        }

        public void comprar()
        {
            System.out.println ("Compra efetuada com sucesso!");
            setStatus_do_pedido(StatusPedido.AGUARDANDO_PAGAMENTO);
        }

        public void pagar(double dinheiro)
        {
            double preco=preçoTotalCompra();
           if (preco <= dinheiro) {
               System.out.println("Pagamento efetuado com sucesso!");
             setStatus_do_pedido(StatusPedido.PAGAMENTO_EFETUADO);
           } else if (preçoTotalCompra()<dinheiro)
           {
               System.out.println("Pagamento não autorizado");
           }
        }



    public ArrayList<Produto> getCarrinho()
    {
      return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho)
    {
        this.carrinho = carrinho;
    }

    public void setComprados(ArrayList<Produto> comprados)
    {
        this.comprados = comprados;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) { this.email=email;}

    public Logradouro getEndereco() {
        return endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Logradouro endereço) {
        this.endereco = endereco;
    }

        public StatusPedido getStatus_do_pedido() {
            return status_do_pedido;
        }

        public void setStatus_do_pedido(StatusPedido status_do_pedido) {
            this.status_do_pedido = status_do_pedido;
        }
    }
