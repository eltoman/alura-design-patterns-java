package org.com.studies.patternsII.visitor;

public class RaizQuadrada implements Expressao {
    Expressao expressao;

    public RaizQuadrada(Expressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public int avalia() {
        int valor = expressao.avalia();
        return (int)Math.sqrt(valor);
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaRaizQuadrada(this);
    }

    public Expressao getExpressao() {
        return expressao;
    }
}
