package org.com.studies.patterns.decorator;

import org.com.studies.patterns.chainOfResponsibility.Item;
import org.com.studies.patterns.chainOfResponsibility.Orcamento;
import org.com.studies.patterns.decorator.contas.fraudulentas.Filtro;
import org.com.studies.patterns.decorator.contas.fraudulentas.FiltroMaiorQue500MilReais;
import org.com.studies.patterns.decorator.contas.fraudulentas.FiltroMenorQue100Reais;
import org.com.studies.patterns.decorator.contas.fraudulentas.FiltroMesmoMes;
import org.com.studies.patterns.decorator.impostos.*;
import org.com.studies.patterns.strategy.Conta;

import javax.sql.rowset.FilteredRowSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TesteContasFraudulentas {

	public static void main(String[] args) {
		testeContas();
	}
	
	public static void testeContas(){

		List<Conta> listaDeContas = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, -70);
		Calendar calendar2 = Calendar.getInstance();

		Conta conta = new Conta("Obama", "0001", "130", calendar);
		conta.deposita(1200);
		listaDeContas.add(conta);

		conta = new Conta("Yanna", "0002", "130", calendar2);
		conta.deposita(915);
		listaDeContas.add(conta);

		conta = new Conta("Belinha", "0003", "132", calendar2);
		conta.deposita(300);
		listaDeContas.add(conta);

		conta = new Conta("Lara", "0004", "532", calendar);
		conta.deposita(90);
		listaDeContas.add(conta);

		conta = new Conta("Bolinha", "0005", "245", calendar);
		conta.deposita(400);
		listaDeContas.add(conta);

		printList(listaDeContas, "-- Lista de Todas as Contas --");

		Filtro filtroSimples = new FiltroMesmoMes();
		printList(filtroSimples.filtra(listaDeContas), "-- Lista do filtroSimples --");

		Filtro filtroCompleto = new FiltroMesmoMes(new FiltroMaiorQue500MilReais(new FiltroMenorQue100Reais()));
		printList(filtroCompleto.filtra(listaDeContas), "-- Lista do filtroCompleto --");
	}

	private static void printList(List<Conta> listaDeContas, String message) {
		System.out.println(message);
		for (Conta item: listaDeContas) {
			System.out.println(item);
		}
	}

}