package org.com.studies.patterns.strategy;

public class Conta {
	private double saldo;
	private String nome;
	private String numero;
	private String agencia;

	public Conta(){
	}

	public Conta(String nome, String numero, String agencia){
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
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
}