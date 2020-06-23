package org.com.studies.patternsII.visitor;

import org.com.studies.patternsII.visitor.operacoes.*;

public class ImpressoraPreFixa implements ImpressoraVisitor {
    @Override
    public void visitaSoma(Soma soma) {
        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" ");
        soma.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }

    @Override
    public void visitaMultiplicao(Multiplicacao multiplicacao) {
        System.out.print(" X ");
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        System.out.print(" ");
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaDivisao(Divisao divisao) {
        System.out.print(" / ");
        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        System.out.print(" ");
        divisao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        System.out.print(" sqrt ");
        System.out.print("(");
        raizQuadrada.getExpressao().aceita(this);
        System.out.print(")");
    }
}
