package contaBancaria;

public enum TipoConta {
	CONTA_SALARIO("Conta para deposito de salario", "Conta Salario"),
	CONTA_CORRENTE("Conta comum", "Conta Corrente"),
	CONTA_EMPRESA("Conta para uso empresarial", "Conta Empresa");

	private String descricao;
	private String nome;

	TipoConta(String descricao, String nome) {
		this.descricao = descricao;
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getNome() {
		return nome;
	}
}
