package org.com.studies.patternsII.interpreter;

public class Divisao implements Expressao {
    Expressao esquerda;
    Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = direita.avalia();
        return resultadoEsquerda / resultadoDireita;
    }
}
