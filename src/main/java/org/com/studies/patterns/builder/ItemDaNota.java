package org.com.studies.patterns.builder;

public class ItemDaNota {
    String nome;
    Double valor;

    public ItemDaNota(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public ItemDaNota() {
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ItemDaNota{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
