package estudo;

public interface CalculaBonificacao { //interface nao pode new

    void calculaBonificacao(Double porcentagemBonificacao);
}

//todas as classes que precisarem calcular bonificacao, vao implementar essa interface
