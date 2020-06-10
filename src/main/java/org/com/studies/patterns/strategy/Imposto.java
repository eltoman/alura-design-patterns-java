package org.com.studies.patterns.strategy;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public interface Imposto {
    double calcula(Orcamento orcamento);
}
