package org.com.studies.patterns.decorator.impostos;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class ICCC extends Imposto {

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICCC() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = 0D;
		if (orcamento.getValor() < 1000) {
			valor = orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() <= 3000) {
			valor = orcamento.getValor() * 0.07;
		} else {
			valor = orcamento.getValor() * 0.08 + 30;
		}
		return valor + calculoDoOutroImposto(orcamento);
	}
}
