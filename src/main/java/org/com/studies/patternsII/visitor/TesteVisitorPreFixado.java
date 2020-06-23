package org.com.studies.patternsII.visitor;

import org.com.studies.patternsII.visitor.operacoes.*;

public class TesteVisitorPreFixado {

    public static void main(String args[]){

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        ImpressoraVisitor impressoraPreFixaVisitor = new ImpressoraPreFixa();

        Expressao conta = new Soma(esquerda, direita);
        conta.aceita(impressoraPreFixaVisitor);
        System.out.println(" = " + conta.avalia());

        Expressao multiplicao = new Multiplicacao(esquerda, direita);
        multiplicao.aceita(impressoraPreFixaVisitor);
        System.out.println(" = " + multiplicao.avalia());

        Numero numero = new Numero(100);
        Expressao divisao = new Divisao(numero, direita);
        divisao.aceita(impressoraPreFixaVisitor);
        System.out.println(" = " + divisao.avalia());

        Numero numeroRaiz = new Numero(64);
        Expressao raiz = new RaizQuadrada(numeroRaiz);
        raiz.aceita(impressoraPreFixaVisitor);
        System.out.println(" = " + raiz.avalia());

        System.out.println("Testando classe numero");
        numero.aceita(impressoraPreFixaVisitor);
        System.out.println(" igual? " + numero.avalia());

    }
}
