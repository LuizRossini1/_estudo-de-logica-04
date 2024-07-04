/* 4 - Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa
essa interface com as fórmulas de conversão e exibe os resultados. */
package Desafio04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        double resultado = (celsius * 1.8) + 32;
        return resultado;

    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return 0;

    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao celParaFah = new ConversorTemperaturaPadrao();

        System.out.println(celParaFah.celsiusParaFahrenheit(15));
        System.out.println(celParaFah.celsiusParaFahrenheit(30));

    }
}