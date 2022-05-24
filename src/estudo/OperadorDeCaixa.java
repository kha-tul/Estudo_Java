package estudo;

public class OperadorDeCaixa extends FuncionarioCLT{

    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa (String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco); //super significa que vem da superclasse
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
