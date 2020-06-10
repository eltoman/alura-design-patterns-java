package org.com.studies.patterns.strategy;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class ICMS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50;
	}

}