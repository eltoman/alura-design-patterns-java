package org.com.studies.patterns.decorator.impostos;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {

		return orcamento.getValor() * 0.05 + 50 + calculoDoOutroImposto(orcamento);
	}
}