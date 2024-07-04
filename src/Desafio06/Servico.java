package Desafio06;

public class Servico implements Vendavel {
    @Override
    public double desconto(double valor) {
        return 0;
    }

    @Override
    public double precoTotalPorQuantidade(double valor, double quantidade) {
        return 0;
    }
}