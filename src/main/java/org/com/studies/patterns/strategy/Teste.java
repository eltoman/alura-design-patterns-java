package org.com.studies.patterns.strategy;

import org.com.studies.patterns.chainOfResponsibility.Orcamento;

public class Teste {
	public static void main(String[] args) {
		testeOrcamento();
		
		testeInvestimento();
	}
	
	public static void testeOrcamento(){
		Orcamento reforma = new Orcamento(500.0);

		Imposto novoImposto = new ICCC();
		System.out.println("Novo imposto: ");
		System.out.println(novoImposto.calcula(reforma));

	}
	
	public static void testeInvestimento(){
		Conta conta = new Conta();
		conta.deposita(100);
		
		Investimento investimento = new Conservador();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realiza(conta, investimento);
	}
}