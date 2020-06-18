package org.com.studies.patterns.builder;

public class Teste {

    public static void main(String[] args) {

        ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();

        NotaFiscalBuilder criador =
                new NotaFiscalBuilder()
                    .paraEmpresa("Caelum")
                    .comCnpj("123.456.789/0001-10")
                    .comItem(itemBuilder.addDescricao("Item 1").addValor(100.00).build())
                    .comItem(itemBuilder.addDescricao("Item 2").addValor(200.00).build())
                    .comItem(itemBuilder.addDescricao("Item 3").addValor(350.00).build())
                    .comItem(itemBuilder.addDescricao("Item 3").addValor(999.00).build())
                    .comObservacoes("entregar nf pessoalmente")
                    .naDataAtual();

        NotaFiscal nf = criador.constroi();

        System.out.println(nf);
    }
}
