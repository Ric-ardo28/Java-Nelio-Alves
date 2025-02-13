package pooEx13.entities;

public class ProdutoImportado extends Produto {
	private Double taxaPreco;

	public ProdutoImportado(String nome, Double preco, Double taxaPreco) {
		super(nome, preco);
		this.taxaPreco = taxaPreco;
	}

	public Double getTaxaPreco() {
		return taxaPreco;
	}

	public void setTaxaPreco(Double taxaPreco) {
		this.taxaPreco = taxaPreco;
	}
	public double precoTotal() {
		return getPreco() + taxaPreco;
	}

	@Override
	public String tagPreco() {
		return getNome() +
				" $ " + String.format("%.2f", precoTotal()) +
				"(Valor da Taxa +" + String.format("%.2f", taxaPreco) + ")";
	}
}
