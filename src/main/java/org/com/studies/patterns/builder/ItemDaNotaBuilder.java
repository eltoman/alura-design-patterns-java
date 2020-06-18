package org.com.studies.patterns.builder;

public class ItemDaNotaBuilder {
    String descricao;
    Double valor;

    public ItemDaNotaBuilder addDescricao(String descricao){
        this.descricao = descricao;
        return this;
    }

    public ItemDaNotaBuilder addValor(Double valor){
        this.valor = valor;
        return this;
    }

    public ItemDaNota build(){
        return new ItemDaNota(descricao, valor);
    }
}
