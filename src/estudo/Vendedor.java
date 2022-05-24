package estudo;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorDaBonificacao; //atributo só para vendedor e gerente

    @Override //tem da interface
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' + //só é ativo caso na classe FuncionarioCLT os atributos estejam como protected
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", valorDaBonificacao=" + this.valorDaBonificacao +
                '}';
    }


}
