package Desafio05;

public class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double valor) {
        double valorImposto = valor * taxaAdicional / 100;
        double precoFinal = valor * (1 + taxaAdicional / 100);
        return precoFinal;
    }

    public static void main(String[] args) {
        ProdutoFisico mouse = new ProdutoFisico();
        ProdutoFisico monitor = new ProdutoFisico();

        System.out.println(mouse.calcularPrecoFinal(332.91));
        System.out.println(monitor.calcularPrecoFinal(1059.99));
    }
}