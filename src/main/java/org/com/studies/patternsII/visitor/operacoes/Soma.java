package org.com.studies.patternsII.visitor.operacoes;

import org.com.studies.patternsII.visitor.Expressao;
import org.com.studies.patternsII.visitor.ImpressoraVisitor;

public class Soma implements Expressao {
    Expressao esquerda;
    Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int resultadoEsquerda = esquerda.avalia();
        int resultadoDireita = direita.avalia();
        return resultadoEsquerda + resultadoDireita;
    }

    @Override
    public void aceita(ImpressoraVisitor impressoraVisitor) {
        impressoraVisitor.visitaSoma(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}
