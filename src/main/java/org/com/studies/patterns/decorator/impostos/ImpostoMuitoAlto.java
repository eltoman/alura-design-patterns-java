package org.com.studies.patterns.decorator.impostos;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto outroImposto) {
        super(outroImposto);
    }

    protected ImpostoMuitoAlto() {
        super();
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.20 + outroImposto.calculoDoOutroImposto(orcamento);
    }
}
