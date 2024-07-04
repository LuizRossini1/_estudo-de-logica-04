/* 3 - Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para
exibir a tabuada de um número. A classe deve receber o número como parâmetro. */
package Desafio03;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao operacao = new TabuadaMultiplicacao();

       operacao.mostrarTabuada(7);
    }
}