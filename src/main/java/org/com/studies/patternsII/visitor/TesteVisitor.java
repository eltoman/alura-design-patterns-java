package org.com.studies.patternsII.visitor;

import org.com.studies.patternsII.visitor.operacoes.*;

public class TesteVisitor {

    public static void main(String args[]){

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        ImpressoraVisitor impressoraVisitor = new Impressora();

        Expressao conta = new Soma(esquerda, direita);
        conta.aceita(impressoraVisitor);
        System.out.println(" = " + conta.avalia());

        Expressao multiplicao = new Multiplicacao(esquerda, direita);
        multiplicao.aceita(impressoraVisitor);
        System.out.println(" = " + multiplicao.avalia());

        Numero numero = new Numero(100);
        Expressao divisao = new Divisao(numero, direita);
        divisao.aceita(impressoraVisitor);
        System.out.println(" = " + divisao.avalia());

        Numero numeroRaiz = new Numero(64);
        Expressao raiz = new RaizQuadrada(numeroRaiz);
        raiz.aceita(impressoraVisitor);
        System.out.println(" = " + raiz.avalia());

        System.out.println("Testando classe numero");
        numero.aceita(impressoraVisitor);
        System.out.println(" igual? " + numero.avalia());
    }
}
