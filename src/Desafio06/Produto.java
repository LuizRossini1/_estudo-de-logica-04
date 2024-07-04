/* 6 - Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na
quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma
fornecendo a sua própria lógica de cálculo de preço. */
package Desafio06;

public class Produto implements Vendavel {
    @Override
    public double desconto(double valor) {
        double precoComDesconto = valor * (1 - desconto / 100);
        return precoComDesconto;
    }

    @Override
    public double precoTotalPorQuantidade(double valor, double quantidade) {
        double precoTotal = valor * quantidade;
        return precoTotal;
    }

    public static void main(String[] args) {
        Produto headset = new Produto();
        Produto pacoca = new Produto();

        System.out.println(headset.desconto(100));
        System.out.println(pacoca.desconto(2.50));

        System.out.println(headset.precoTotalPorQuantidade(100, 3));
        System.out.println(headset.precoTotalPorQuantidade(2.50, 2));
    }
}