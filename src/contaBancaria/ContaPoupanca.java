package contaBancaria;

public class ContaPoupanca extends Conta {
	private double taxaJuros;

	public ContaPoupanca(double taxaJuros) {
		super();
	}

	public ContaPoupanca(String titular, double saldo, int numeroDaConta, TipoConta tipoConta, double taxaJuros) {
		super(titular, saldo, numeroDaConta, tipoConta);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
}