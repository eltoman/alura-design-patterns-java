package org.com.studies.patterns.decorator.impostos;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {

		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}