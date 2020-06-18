package org.com.studies.patterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double impostos;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private Calendar data;
    private String observacoes;
    List<AcaoAposGerarNota> todasAcoesASeremExecutadas;


    public NotaFiscalBuilder() {
        this.data = Calendar.getInstance();
        this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
    }

    public NotaFiscalBuilder(List<AcaoAposGerarNota> todasAcoesASeremExecutadas) {
        this.data = Calendar.getInstance();
        this.todasAcoesASeremExecutadas = todasAcoesASeremExecutadas;
    }

    public NotaFiscalBuilder naData(Calendar novaData) {
        this.data = novaData;
        this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
        return this;
    }

    public void adicionaAcao(AcaoAposGerarNota novaAcao) {
        this.todasAcoesASeremExecutadas.add(novaAcao);
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();
        return this;
    }

    public NotaFiscal constroi() {

        NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(notaFiscal);
        }

        return  notaFiscal;
    }
}
