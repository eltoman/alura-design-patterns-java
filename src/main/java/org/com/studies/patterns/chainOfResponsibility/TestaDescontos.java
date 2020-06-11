package org.com.studies.patterns.chainOfResponsibility;

public class TestaDescontos {
    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("CANETA", 10.0));
        orcamento.adicionaItem(new Item("LAPISERA", 20.0));
        orcamento.adicionaItem(new Item("LAPIS", 5.0));
        orcamento.adicionaItem(new Item("LAPIS", 5.0));
        orcamento.adicionaItem(new Item("LAPIS", 5.0));
        orcamento.adicionaItem(new Item("ESTOJO", 10.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println("Desconto: ");
        System.out.println(desconto);

    }
}