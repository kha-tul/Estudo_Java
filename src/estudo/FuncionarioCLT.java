package estudo;

public abstract class FuncionarioCLT { //abstract só faz herança - ou seja, não pode criar new
    //nem mesmo no main é possivel criar new, somente herança

// 1 atributos
    protected String nome; //protected permite ativar ToString
    protected String documento;
    protected Double valorSalario;
    protected Endereco endereco; //Endereço - classe Endereço, criada anteriormente, virou composição aqui.

    //2 construtor vazio para retornar
    public FuncionarioCLT() {
    }

    //3 construtor com todos atributos

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }

    //4 criar metodo getter e setter para fazer modificação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
