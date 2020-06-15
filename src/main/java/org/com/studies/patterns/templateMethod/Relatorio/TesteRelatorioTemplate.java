package org.com.studies.patterns.templateMethod.Relatorio;

import org.com.studies.patterns.strategy.Conta;

import java.util.ArrayList;
import java.util.List;

public class TesteRelatorioTemplate {

    public static void main(String args[]){
        List<Conta> listaDeContas = new ArrayList<>();
        Conta conta = new Conta("Obama", "0001", "130");
        conta.deposita(1200);
        listaDeContas.add(conta);
        conta = new Conta("Yanna", "0002", "130");
        conta.deposita(915);
        listaDeContas.add(conta);

        System.out.println("Imprimindo relatorio Simples... ");
        Relatorio relatorioSimples = new RelatorioSimples();
        relatorioSimples.imprime(listaDeContas);

        System.out.println("\n \n Imprimindo relatorio Complexo... ");
        Relatorio relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.imprime(listaDeContas);

    }
}
