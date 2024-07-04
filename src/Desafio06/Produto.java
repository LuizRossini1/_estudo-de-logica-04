/* 6 - Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na
quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma
fornecendo a sua própria lógica de cálculo de preço. */
package Desafio06;

public class Produto implements Vendavel {
    @Override
    public double desconto() {
        return 0;
    }

    @Override
    public double precoTotalPorQuantidade() {
        return 0;
    }
}