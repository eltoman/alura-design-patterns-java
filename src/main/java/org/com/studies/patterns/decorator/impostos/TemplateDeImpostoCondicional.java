package org.com.studies.patterns.decorator.impostos;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;
import org.com.studies.patterns.decorator.impostos.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {
    }


    public final double calcula(Orcamento orcamento) {

        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
        } else {
            return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
        }

    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
