package contaBancaria;

public enum TipoConta {
	CONTA_SALARIO("Conta para deposito de salario"),
	CONTA_CORRENTE("Conta comum"),
	CONTA_EMPRESA("Conta para uso empresarial");

	private String descricao;

	private TipoConta(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;

	}
}
