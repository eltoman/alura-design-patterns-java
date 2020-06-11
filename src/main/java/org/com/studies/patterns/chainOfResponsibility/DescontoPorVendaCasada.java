package org.com.studies.patterns.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DescontoPorVendaCasada implements Desconto {
    private static final String[] PRODUTOS_DESCONTO_DEFAULT = {"LAPIS", "CANETA"};
    private Desconto proximo;
    private List<String> listaDeProdutosObrigatorios;

    public DescontoPorVendaCasada(Desconto proximo) {
        this.proximo = proximo;
        listaDeProdutosObrigatorios = new ArrayList<>();
    }

    public DescontoPorVendaCasada(List<String> listaDeProdutosObrigatorios) {
        this.listaDeProdutosObrigatorios = listaDeProdutosObrigatorios;
    }

    private boolean contemVendaCasada(Orcamento orcamento) {
        if(listaDeProdutosObrigatorios.size() < 1) adicionaProdutosDefault();

        for (String produto : listaDeProdutosObrigatorios) {
            System.out.println("Verificando: " + produto);
            if (!temProdutoNoOrcamento(orcamento, produto)) {
                System.out.println("Não tem o produto no orcamento");
                return false;
            }
        }
        return true;
    }

    private boolean temProdutoNoOrcamento(Orcamento orcamento, String produto) {
        return orcamento.getItens().stream()
                .filter(x -> x.getNome().toLowerCase().equals(produto.toLowerCase()))
                .findFirst().isPresent();
    }

    private void adicionaProdutosDefault() {
        listaDeProdutosObrigatorios.addAll(Arrays.asList(PRODUTOS_DESCONTO_DEFAULT));
    }

    @Override
    public double desconta(Orcamento orcamento) {
        if (contemVendaCasada(orcamento)) {
            System.out.println("Aplicando Desconto DescontoPorVendaCasada ");
            return orcamento.getValor() * 0.05;
        } else {
            return proximo.desconta(orcamento);
        }
    }

}
