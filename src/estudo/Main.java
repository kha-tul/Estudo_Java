package estudo;

public class Main {

    public static void main(String[] args) {

        /* Endereco endereco = new Endereco(); //objeto endereço com new.
        endereco.setRua("Endereço para essa rua");

        System.out.println(endereco.getRua()); */

        Endereco endereco = new Endereco("Rua funcionario", "Complemento", "bairro funcionario");
        System.out.println("----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Nathally");
        vendedor.setDocumento("134.122.122-54");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        //a classe 'vendedor' está vazia, mas os atributos veem da classe FuncionarioCLT.

        // System.out.println(vendedor); - se imprimir sem subscrever, isso é, sem o método ToString, dará erro e será exibido
        //só endereço da memória. ToString foi adicionado, neste passo, na classe FuncionarioCLT.

        vendedor.calculaBonificacao(2d);

        System.out.println(vendedor); //imprimiu sem endereço, com endereço de memória. Add ToString na classe Endereço

        System.out.println("----");


        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa();
        operadorDeCaixa.setNome("nanan");
        operadorDeCaixa.setDocumento("12121212");
        operadorDeCaixa.setEndereco(endereco);
        System.out.println(operadorDeCaixa);


        Gerente gerente = new Gerente();
        gerente.setNome("Nathally Gerente");
        gerente.setDocumento("12131331");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(gerente);

    }
}
