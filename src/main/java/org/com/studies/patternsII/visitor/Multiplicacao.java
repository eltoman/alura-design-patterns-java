package org.com.studies.patternsII.visitor;

public class Multiplicacao implements Expressao {
    Expressao esquerda;
    Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = direita.avalia();
        return resultadoEsquerda * resultadoDireita;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaMultiplicao(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}
