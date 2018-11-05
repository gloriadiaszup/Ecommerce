import java.util.ArrayList;

    class Client {


        private String nome;
        private String telefone;
        private String email;
        private Logradouro endereco;
        private ArrayList<Produto> carrinho = new ArrayList<Produto>();
        private ArrayList<Pedido> pedidos = new ArrayList <Pedido>();
        public static final String cep_loja = "38408587";
        private double preco_frete;


        public Client(String nome, String telefone, String cpf, Logradouro endereco) {
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
        }

        public Client(String nome, ArrayList<Pedido> pedidos)
        {
            this.nome = nome;
            this.pedidos = pedidos;
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

        public void setEndereco(Logradouro endereco) {
            this.endereco = endereco;
        }
        public ArrayList <Pedido> getPedidos() {
            return pedidos;
        }

        public void setPedidos(ArrayList <Pedido> pedidos) {
            this.pedidos = pedidos;
        }

        public void setNome(String nome) { this.nome = nome; }

        public double getPreco_frete() {
            return preco_frete;
        }

        public void setPreco_frete(double preco_frete) {
            this.preco_frete = preco_frete;
        }
    }

