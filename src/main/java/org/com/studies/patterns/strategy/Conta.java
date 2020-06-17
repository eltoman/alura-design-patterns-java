package org.com.studies.patterns.strategy;

import java.util.Calendar;

public class Conta {
    private double saldo;
    private String nome;
    private String numero;
    private String agencia;

    private Calendar dataAbertura;

    public Conta() {
    }

    public Conta(String nome, String numero, String agencia) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
    }

    public Conta(String nome, String numero, String agencia, Calendar dataAbertura) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                ", dataAbertura=" + dataAbertura.getTime() +
                '}';
    }
}