package org.com.studies.patterns.observer;

public class Multiplicador implements AcaoAposGerarNota {

    private double fator;

    public Multiplicador(double fator) {
        this.fator = fator;
    }

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Valor Nota Multiplicado: " + notaFiscal.getValorBruto() * fator);
    }
}
