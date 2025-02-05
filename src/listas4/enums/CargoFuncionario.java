package listas4.enums;

public enum CargoFuncionario {
	GERENTE("Gerente Geral"),
	SUPERVISOR("Supervisor de Patio"),
	CONFERENTE("Conferente de Carga"),
	AJUDANTE("Ajudante de Armazem");

	private String descricao;

	CargoFuncionario(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
