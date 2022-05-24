package estudo;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {

    private Double valorBonificacao;  //atributo bonificacao

    @Override //vem do implemenst CalculaBonificacao
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;

    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' + //usa super para puxar da superclasse
                ", endereco=" + super.getEndereco() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao =" + this.valorBonificacao + //pego do atributo acima
                '}';
    }

}
