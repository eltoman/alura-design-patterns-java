package org.com.studies.patterns.observer;

public class NotaFiscalDao implements AcaoAposGerarNota {
    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("salvando no banco");
    }
}
