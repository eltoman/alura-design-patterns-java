package org.com.studies.patternsII.visitor;

import org.com.studies.patternsII.visitor.operacoes.*;

public interface ImpressoraVisitor {
    void visitaSoma(Soma soma);

    void visitaSubtracao(Subtracao subtracao);

    void visitaNumero(Numero numero);

    void visitaMultiplicao(Multiplicacao multiplicacao);

    void visitaDivisao(Divisao divisao);

    void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
}
