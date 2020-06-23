package org.com.studies.patternsII.visitor;

public class TesteVisitor {

    public static void main(String args[]){

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Visitor visitor = new ImpressoraVisitor();

        Expressao conta = new Soma(esquerda, direita);
        conta.aceita(visitor);
        System.out.println(" = " + conta.avalia());

        Expressao multiplicao = new Multiplicacao(esquerda, direita);
        multiplicao.aceita(visitor);
        System.out.println(" = " + multiplicao.avalia());

        Numero numero = new Numero(100);
        Expressao divisao = new Divisao(numero, direita);
        divisao.aceita(visitor);
        System.out.println(" = " + divisao.avalia());

        Numero numeroRaiz = new Numero(64);
        Expressao raiz = new RaizQuadrada(numeroRaiz);
        raiz.aceita(visitor);
        System.out.println(" = " + raiz.avalia());
    }
}
