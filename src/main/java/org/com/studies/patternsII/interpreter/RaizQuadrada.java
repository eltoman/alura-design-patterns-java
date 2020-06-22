package org.com.studies.patternsII.interpreter;

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
}
