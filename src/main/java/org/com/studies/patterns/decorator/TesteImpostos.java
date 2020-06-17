package org.com.studies.patterns.decorator;

import org.com.studies.patterns.chainOfResponsibility.Item;
import org.com.studies.patterns.chainOfResponsibility.Orcamento;
import org.com.studies.patterns.decorator.impostos.*;

public class TesteImpostos {

	public static void main(String[] args) {
		testeOrcamento();
	}
	
	public static void testeOrcamento(){
		Orcamento orcamento = new Orcamento(501.0);
		orcamento.adicionaItem(new Item("CANETA", 110.0));
		orcamento.adicionaItem(new Item("LAPISERA", 20.0));
		orcamento.adicionaItem(new Item("LAPIS", 5.0));
		orcamento.adicionaItem(new Item("LAPIS", 5.0));
		double valor = 0D;

		System.out.println("-- Imposto Simples --");
		Imposto impostoSimples = new ISS();
		valor = impostoSimples.calcula(orcamento);
		System.out.println(valor);

		System.out.println("-- Imposto Composto --");
		Imposto impostoComposto = new ISS(new ICMS(new ICCC()));
		valor = impostoComposto.calcula(orcamento);
		System.out.println(valor);

		System.out.println("-- Imposto Muito Alto --");
		Imposto impostoCompostoMuitoAlto = new ImpostoMuitoAlto(new ICMS(new ICCC()));
		valor = impostoCompostoMuitoAlto.calcula(orcamento);
		System.out.println(valor);

		System.out.println("-- Imposto IKCV --");
		Imposto impostoIKCV = new IKCV(new ICMS());
		valor = impostoIKCV.calcula(orcamento);
		System.out.println(valor);

		System.out.println("-- Imposto ICPP --");
		Imposto impostoICPP = new ICPP(new ICMS());
		valor = impostoICPP.calcula(orcamento);
		System.out.println(valor);
	}

}