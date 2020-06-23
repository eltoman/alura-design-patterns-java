package org.com.studies.patternsII.visitor.operacoes;

import org.com.studies.patternsII.visitor.Expressao;
import org.com.studies.patternsII.visitor.ImpressoraVisitor;

public class RaizQuadrada implements Expressao {
    public Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public int avalia() {
        int valor = expressao.avalia();
        return (int)Math.sqrt(valor);
    }

    @Override
    public void aceita(ImpressoraVisitor impressoraVisitor) {
        impressoraVisitor.visitaRaizQuadrada(this);
    }

    public Expressao getExpressao() {
        return expressao;
    }
}
