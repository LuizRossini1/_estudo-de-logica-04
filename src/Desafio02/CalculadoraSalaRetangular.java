/* Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
A classe deve receber altura e largura como parâmetros. */
package Desafio02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public int calcularArea(int altura, int largura) {
        int area = largura * altura;
        return area;
    }

    @Override
    public int calcularPerimetro(int altura, int largura) {
        int perimetro = 2 * (largura + altura);
        return perimetro;
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular retangulo = new CalculadoraSalaRetangular();

        System.out.println(retangulo.calcularArea(2,3));
        System.out.println(retangulo.calcularPerimetro(7,10));
    }
}