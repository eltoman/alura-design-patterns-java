package org.com.studies.patterns.templateMethod;

import org.com.studies.patterns.chainOfResponsibility.Item;
import org.com.studies.patterns.chainOfResponsibility.Orcamento;
import org.com.studies.patterns.strategy.*;

public class Teste {

	public static void main(String[] args) {
		testeOrcamento();
	}
	
	public static void testeOrcamento(){
		Orcamento orcamento = new Orcamento(500.0);

		orcamento.adicionaItem(new Item("LAPIS", 5.0));
		orcamento.adicionaItem(new Item("LAPIS", 5.0));
		orcamento.adicionaItem(new Item("LAPIS", 5.0));
		orcamento.adicionaItem(new Item("ESTOJO", 10.0));
		orcamento.adicionaItem(new Item("ESTOJO", 10.0));
		orcamento.adicionaItem(new Item("CANETA", 10.0));
		orcamento.adicionaItem(new Item("CADERNO", 10.0));

		Imposto novoImposto = new IHIT();
		System.out.println("Novo imposto: ");
		System.out.println(novoImposto.calcula(orcamento));

	}

}