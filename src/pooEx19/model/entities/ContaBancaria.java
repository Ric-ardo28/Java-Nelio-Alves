package pooEx19.model.entities;

import pooEx19.model.exceptions.NegociosException;

public class ContaBancaria {
	private Integer numeroConta;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public ContaBancaria(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void depositar(Double valor) {

		saldo += valor;
	}

	public void sacar(Double valor) {
		validarSaque(valor);
		saldo -= valor;
	}
	private void validarSaque(Double valor) {
		if(valor > getLimiteSaque()) {
			throw new NegociosException("Erro de saque: Valor excede o limite de saque");
		}
		if(valor > getSaldo()){
			throw new NegociosException("Erro de saque: Valor excede o saldo");
		}
	}
}
