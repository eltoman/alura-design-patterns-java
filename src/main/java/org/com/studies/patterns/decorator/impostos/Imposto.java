package org.com.studies.patterns.decorator.impostos;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected Imposto() {
        this.outroImposto = null;
    }

    public abstract double calcula(Orcamento orcamento);

    protected double calculoDoOutroImposto(Orcamento orcamento) {
        if(outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
}
