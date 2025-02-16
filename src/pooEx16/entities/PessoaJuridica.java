package pooEx16.entities;

public class PessoaJuridica extends Contribuinte {
	private int qtdFuncionarios;

	public PessoaJuridica(String nome, double rendaAnaul, int qtdFuncionarios) {
		super(nome, rendaAnaul);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public double taxa() {
		if (qtdFuncionarios > 10) {
			double imposto = getRendaAnaul() * 0.14;
			return imposto;
		} else {
			double imposto = getRendaAnaul() * 0.16;
			return imposto;

		}

	}

}

