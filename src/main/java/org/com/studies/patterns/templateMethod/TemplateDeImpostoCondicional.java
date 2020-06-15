package org.com.studies.patterns.templateMethod;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;
import org.com.studies.patterns.strategy.Imposto;

public abstract class TemplateDeImpostoCondicional implements Imposto {
    public final double calcula(Orcamento orcamento) {

        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }

    }

    protected abstract double minimaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
