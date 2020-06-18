package org.com.studies.patterns.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteObserver {

    public static void main(String[] args) {

        ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();

        List<AcaoAposGerarNota> todasAcoesASeremExecutadas = new ArrayList<>();

        todasAcoesASeremExecutadas.addAll(Arrays.asList(
                    new Multiplicador(2.5),
                    new EnviadorDeEmail(),
                    new NotaFiscalDao(),
                    new EnviadorDeSms(),
                    new Impressora()
                ));

        NotaFiscalBuilder builder = new NotaFiscalBuilder(todasAcoesASeremExecutadas);

        builder.paraEmpresa("Caelum")
                    .comCnpj("123.456.789/0001-10")
                    .comItem(itemBuilder.addDescricao("Item 1").addValor(100.00).build())
                    .comItem(itemBuilder.addDescricao("Item 2").addValor(200.00).build())
                    .comItem(itemBuilder.addDescricao("Item 3").addValor(350.00).build())
                    .comItem(itemBuilder.addDescricao("Item 3").addValor(999.00).build())
                    .comObservacoes("entregar nf pessoalmente")
                    .naDataAtual();

        NotaFiscal nf = builder.constroi();

        System.out.println(nf);
    }
}
