package estudo;

public class Endereco {

    private String rua; //1 private para não alterar diretamente os atributos
    private String complemento;
    private String bairro;

    //2. construtor para criar endereço


    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    //3. para funcionar, é necessário um construtor vazio

    public Endereco() {
    }

    //4 Getters and Setters são métodos asessores - permitem manter os atributos private
    //Get - método retorna a rua do endereço.
    //Set - vai receber uma rua, pra alterar

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}