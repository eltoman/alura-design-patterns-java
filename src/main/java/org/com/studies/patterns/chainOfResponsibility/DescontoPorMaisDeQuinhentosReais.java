package org.com.studies.patterns.chainOfResponsibility;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
		this.proximo = proximo;
	}

	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			System.out.println("Aplicando Desconto DescontoPorMaisDeQuinhentosReais ");
			return orcamento.getValor() * 0.07;
		}
		else {
			return proximo.desconta(orcamento);
		}
	}
}