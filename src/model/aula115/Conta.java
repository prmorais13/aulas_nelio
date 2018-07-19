package model.aula115;

import model.exception.ExcecaoDominio;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}
	
	public void saque(Double valor) {
		if (valor > limiteSaque) {
			throw new ExcecaoDominio("O valor " 
									 + String.format("%.2f", valor)
									 + " excede o limite de saque que é de "
									 + String.format("%.2f", limiteSaque));
		}
		if (valor > saldo) {
			throw new ExcecaoDominio("O saldo de "
									 + String.format("%.2f", saldo)
									 + " é insuficiente para saque no valor de "
									 + String.format("%.2f", valor));
		}
		
		this.saldo -= valor;
	}

}
