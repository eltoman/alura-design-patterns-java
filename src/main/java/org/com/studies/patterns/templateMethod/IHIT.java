package org.com.studies.patterns.templateMethod;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IHIT extends TemplateDeImpostoCondicional {
    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getItens().size() * 0.01;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() * 0.13) + 100;
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        Map<String, Long> contador = orcamento.getItens().stream()
                .collect(Collectors.groupingBy(x -> x.getNome(), Collectors.counting()));

        System.out.println(contador);

        long quantidadeItensRepetidos = contador.entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey)
                .collect(Collectors.toList()).size();

        System.out.println("quantidadeItensRepetidos: " + quantidadeItensRepetidos);

        return quantidadeItensRepetidos > 0;
    }
}
