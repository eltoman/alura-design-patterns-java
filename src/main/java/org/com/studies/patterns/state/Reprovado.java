package org.com.studies.patterns.state;

public class Reprovado implements  EstadoDeUmOrcamento {
    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não pode ser aprovado!");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já reprovado!");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ser finalizados!");

    }
}
