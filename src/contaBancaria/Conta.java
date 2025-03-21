package contaBancaria;

public class Conta {
	private String titular;
	protected double saldo = 3333;
	private int numeroDaConta;
	private TipoConta tipoConta;

	public Conta() {

	}

	public Conta(String titular, double saldo, int numeroDaConta, TipoConta tipoConta) {
		this.titular = titular;
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
		this.tipoConta = tipoConta;
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

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double depositar(double valor) {
		this.saldo += valor;
		return valor;
	}

	public void sacar(double valor) {
		saldo -= valor + 5.0;

	}

	public void exibirSaldo() {
		System.out.println(this.saldo);
	}

	@Override
	public String toString() {
		return "Conta{" + "titular '" + titular + '\'' + ", saldo " + saldo + ", numero Da Conta " + numeroDaConta + ", tipoConta " + tipoConta.getNome() + ", descição " + tipoConta.getDescricao() + '}';
	}
}
