public class Logradouro {

       private String Rua;
       private String Bairro;
       private String Estado;
       private String Cidade;
       private String CEP;
       private int Numero;

    public Logradouro (String Rua, String Bairro, String Estado, String Cidade, String CEP, int Numero){
        this.Rua=Rua;
        this.Bairro=Bairro;
        this.Estado=Estado;
        this.Cidade=Cidade;
        this.CEP=CEP;
        this.Numero=Numero;     
       }
    public int getNumero() { return Numero; }

    public void setNumero(int numero) { this.Numero = numero; }

    public String getBairro() { return Bairro; }

    public void setBairro(String bairro) { this.Bairro = bairro; }

    public String getCEP() { return CEP; }

    public void setCEP(String CEP) { this.CEP = CEP; }

    public String getCidade() { return Cidade; }

    public void setCidade(String cidade) { this.Cidade = cidade; }

    public String getEstado() { return Estado; }

    public void setEstado(String estado) { this.Estado = estado; }

    public String getRua() { return Rua; }

    public void setRua(String rua) { this.Rua = rua; }
                            }
