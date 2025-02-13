package pooEx13.entities;

import java.time.LocalDateTime;

public class ProdutoUsado extends Produto {
	private LocalDateTime dataFaturamento;

	public ProdutoUsado(String nome, Double preco, LocalDateTime dataFaturamento) {
		super(nome, preco);
		this.dataFaturamento = dataFaturamento;
	}

	public LocalDateTime getDataFaturamento() {
		return dataFaturamento;
	}

	public void setDataFaturamento(LocalDateTime dataFaturamento) {
		this.dataFaturamento = dataFaturamento;
	}
	@Override
	public String tagPreco() {
		return getNome() +
				" (usado) $ " + String.format("%.2f", getPreco()) +
				"(Data de faturamento: " + getDataFaturamento() + ")";
	}
}
