package org.com.studies.patterns.chainOfResponsibility;

public class DescontoPorMaisDeCincoItens implements Desconto {
        private Desconto proximo;

    public DescontoPorMaisDeCincoItens(Desconto proximo) {
        this.proximo = proximo;
    }


    public double desconta(Orcamento orcamento) {
          if(orcamento.getItens().size() > 5) {
              System.out.println("Aplicando Desconto DescontoPorMaisDeCincoItens ");
            return orcamento.getValor() * 0.1;
          }
          else {
            return proximo.desconta(orcamento);
          }
        }
      }