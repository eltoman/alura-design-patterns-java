package org.com.studies.patterns.templateMethod.Relatorio;

import org.com.studies.patterns.strategy.Conta;
import java.util.List;

abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
        cabecalho();
        corpo(contas);
        rodape();
    }
}
