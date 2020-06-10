package org.com.studies.patterns.strategy;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

		double valor = imposto.calcula(orcamento);

		System.out.println(valor);

	}

}