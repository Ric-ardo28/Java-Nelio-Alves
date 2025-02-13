package pooEx13.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	private LocalDate dataFaturamento;

	public ProdutoUsado(String nome, Double preco, LocalDate dataFaturamento) {
		super(nome, preco);
		this.dataFaturamento = dataFaturamento;
	}

	public LocalDate getDataFaturamento() {
		return dataFaturamento;
	}

	public void setDataFaturamento(LocalDate dataFaturamento) {
		this.dataFaturamento = dataFaturamento;
	}
	@Override
	public String tagPreco() {
		return getNome() +
				" (usado) $ " + String.format("%.2f", getPreco()) +
				"(Data de faturamento: " + dataFaturamento.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")) + ")";
	}
}
