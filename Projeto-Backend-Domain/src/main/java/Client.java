import java.util.ArrayList;

    public class Client {


        private String nome;
        private String telefone;
        private String email;
        private Logradouro endereco;
        private ArrayList<Produto> carrinho = new ArrayList<Produto>();
        private ArrayList<Pedido> pedidos = new ArrayList <Pedido>();
        public static final String cep_loja = "38408587";


        public Client(String nome, String telefone, String cpf, Logradouro endereco) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.endereco = endereco;
        }

        public Client(String nome, ArrayList<Pedido> pedidos)
        {
            this.nome = nome;
            this.pedidos = pedidos;
        }


        public void adicionarAoCarrinho(Produto produto, int quantidade) {


            for (int i = 0; i < quantidade; i++)

                carrinho.add(produto);
        }

        public void removerDoCarrinho(Produto produto) {
            for (int i = 0; i < carrinho.size(); i++) {
                if (carrinho.get(i) == produto) {
                    carrinho.remove(produto);
                }
            }
        }

        public double calculaFrete(String cep)
        {
            int P = 0;
            int G = 0;
            int M = 0;

            int caixaP = 0;
            int caixaM = 0;
            int caixaG = 0;
            double preco_frete;
            if (cep == cep_loja)
            {
                preco_frete = 0;
            } else{
                for(int i=0;i<carrinho.size();i++){
                    if(carrinho.get(i).getTamanho()=="P")
                        P++;
                    if(carrinho.get(i).getTamanho()=="M")
                        M++;
                    if(carrinho.get(i).getTamanho()=="G")
                        G++;

                }
                if (P%10==0 && P/10==0)
                    caixaP=0;
                else if (P%10>0){
                    caixaP=1;
                    M+=P/10;
                }
                if (M%5>0) {
                    caixaM = 1;
                    caixaG = M/5;
                }
                caixaG+=G;


                preco_frete = (caixaP*5) + (caixaM*20) + (caixaG*25);
            }
            return preco_frete;
        }

        double preco_frete;

        public double preçoTotalCompra() {
            double valorTotal = 0;

            for (int i = 0; i < carrinho.size(); i++) {
                valorTotal += carrinho.get(i).getPreco();
            }
            valorTotal += preco_frete;
            return valorTotal;
        }
        static private int codigo=0;

        public void comprar() {

            Pedido pedido = new Pedido(carrinho, StatusPedido.AGUARDANDO_PAGAMENTO);
            pedidos.add(pedido);
            System.out.println("Aguardando pagamento!");
        }

        public void pagar(int codigo_do_pedido, double dinheiro) {
            double preco = preçoTotalCompra();
            if (preco <= dinheiro) {
                System.out.println("Pagamento efetuado com sucesso!");
                pedidos.get(codigo_do_pedido).setStatus(StatusPedido.PAGAMENTO_EFETUADO);
                    carrinho.clear();
            } else if (preçoTotalCompra() < dinheiro) {
                System.out.println("Pagamento não autorizado");
            }
        }


        public ArrayList<Produto> getCarrinho() {
            return carrinho;
        }

        public void setCarrinho(ArrayList<Produto> carrinho) {
            this.carrinho = carrinho;
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

        public void setEmail(String email) {
            this.email = email;
        }

        public Logradouro getEndereco() {
            return endereco;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void setEndereco(Logradouro endereço) {
            this.endereco = endereco;
        }
        public ArrayList <Pedido> getPedidos() {
            return pedidos;
        }

        public void setPedidos(ArrayList <Pedido> pedidos) {
            this.pedidos = pedidos;
        }

        public double getPreco_frete() { return preco_frete; }

        public static int getCodigo() { return codigo; }

        public void setNome(String nome) { this.nome = nome; }

        public void setPreco_frete(double preco_frete) { this.preco_frete = preco_frete; }

        public static void setCodigo(int codigo) { Client.codigo = codigo; }
    }

