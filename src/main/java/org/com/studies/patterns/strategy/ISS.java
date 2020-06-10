package org.com.studies.patterns.strategy;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class ISS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}