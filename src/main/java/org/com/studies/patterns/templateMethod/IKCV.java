package org.com.studies.patterns.templateMethod;

import org.com.studies.patterns.chainOfResponsibility.Item;
import org.com.studies.patterns.chainOfResponsibility.Orcamento;

class IKCV extends TemplateDeImpostoCondicional {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for(Item item : orcamento.getItens()) {
            if(item.getValor() > 100) return true;
        }
        return false;
    }
}