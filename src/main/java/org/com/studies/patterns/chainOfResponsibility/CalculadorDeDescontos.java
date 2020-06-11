package org.com.studies.patterns.chainOfResponsibility;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto semDesconto = new SemDesconto();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada(semDesconto);
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais(descontoPorVendaCasada);
		Desconto cadeiaDeDesconto = new DescontoPorMaisDeCincoItens(descontoPorMaisDeQuinhentosReais);

		return cadeiaDeDesconto.desconta(orcamento);
	}
}