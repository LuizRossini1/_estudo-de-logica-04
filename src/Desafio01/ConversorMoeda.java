/* 1 - Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
converterDolarParaReal() para converter um valor em dólar para reais.
A classe deve receber o valor em dólar como parâmetro. */
package Desafio01;

public class ConversorMoeda implements ConversaoFinanceira {
    private double real = 5.49;

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        double valorConvertido = real * dolar;
        return valorConvertido;
    }

    public static void main(String[] args) {
        ConversorMoeda operacao = new ConversorMoeda();

        System.out.println(operacao.converterDolarParaReal(1));
        System.out.println(operacao.converterDolarParaReal(5));
        System.out.println(operacao.converterDolarParaReal(10));
        System.out.println(operacao.converterDolarParaReal(50));
    }
}