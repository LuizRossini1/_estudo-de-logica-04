package Desafio06;

public class Servico implements Vendavel {
    protected double horasTrabalhadas = 8;

    @Override
    public double desconto(double valor) {
        double desconto = horasTrabalhadas * valor / 100;
        return desconto;
    }

    @Override
    public double precoTotalPorQuantidade(double valor, double quantidade) {
        //Neste caso, a 'quantidade' será referente as horas trabalhadas
        double precoHoras = valor * quantidade;
        return precoHoras;
    }

    public static void main(String[] args) {
        Servico exemplo1 = new Servico();

        System.out.println(exemplo1.desconto(8.50));
        System.out.println(exemplo1.precoTotalPorQuantidade(8.50, 8));
    }
}