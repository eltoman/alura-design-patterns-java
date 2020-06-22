package org.com.studies.patternsII.interpreter;

public class TesteContas {

    public static void main(String args[]){
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao conta = new Soma(esquerda, direita);

        System.out.println("Soma: " + conta.avalia());

        Expressao multiplicao = new Multiplicacao(esquerda, direita);
        System.out.println("multiplicao: " + multiplicao.avalia());

        Numero numero = new Numero(100);
        Expressao divisao = new Divisao(numero, direita);
        System.out.println("divisao de 100: " + divisao.avalia());
    }
}
