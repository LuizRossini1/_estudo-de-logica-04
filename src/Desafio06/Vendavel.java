package Desafio06;

public interface Vendavel {
    double desconto = 10;

    double desconto(double valor);
    double precoTotalPorQuantidade(double valor, double quantidade);
}