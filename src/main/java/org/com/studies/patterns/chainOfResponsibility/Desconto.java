package org.com.studies.patterns.chainOfResponsibility;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}