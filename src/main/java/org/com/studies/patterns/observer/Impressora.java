package org.com.studies.patterns.observer;

public class Impressora implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("imprimindo notaFiscal");
    }
}
