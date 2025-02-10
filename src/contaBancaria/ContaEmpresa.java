package contaBancaria;

public class ContaEmpresa extends Conta {
	private Double LimiteEmprestimo;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(String titular, double saldo, int numeroDaConta, TipoConta tipoConta, Double limiteEmprestimo) {
		super(titular, saldo, numeroDaConta, tipoConta);
		LimiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= LimiteEmprestimo) {
			saldo += valor = 10.0;
		}
	}
	@Override
	public void sacar(double valor) {
			super.sacar(valor);
			saldo -= 2.0;
		}


	}

