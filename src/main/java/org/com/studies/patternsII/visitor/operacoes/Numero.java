package org.com.studies.patternsII.visitor.operacoes;

import org.com.studies.patternsII.visitor.Expressao;
import org.com.studies.patternsII.visitor.ImpressoraVisitor;

public class Numero implements Expressao {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int avalia() {
        return this.numero;
    }

    @Override
    public void aceita(ImpressoraVisitor impressoraVisitor) {
        impressoraVisitor.visitaNumero(this);
    }
}
