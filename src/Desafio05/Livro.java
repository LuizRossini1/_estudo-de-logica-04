/* 5 - Crie uma interface Calculavel com um método double calcularPrecoFinal().
Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final
considerando descontos ou taxas adicionais. */
package Desafio05;

public class Livro implements Calculavel {
    @Override
    public double calcularPrecoFinal(double valor) {
        double valorImposto = valor * taxaAdicional / 100;
        double precoFinal = valor * (1 + taxaAdicional / 100);
        return precoFinal;
    }

    public static void main(String[] args) {
        Livro olhosPrateados = new Livro();
        Livro intoThePit = new Livro();

        System.out.println(olhosPrateados.calcularPrecoFinal(40.18));
        System.out.println(intoThePit.calcularPrecoFinal(61.78));
    }
}