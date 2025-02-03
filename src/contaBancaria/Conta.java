package contaBancaria;

public class Conta {
	private String titular;
	private double saldo = 3333;
	private int numeroDaConta;

	public Conta(String titular, double saldo, int numeroDaConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}


	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double depositar(double valor) {
		this.saldo += valor;
		return valor;
	}
	public double sacar(double valor) {
		this.saldo -= valor;
		return valor;
	}
	public void exibirSaldo(){
		System.out.println(this.saldo);
	}
}
