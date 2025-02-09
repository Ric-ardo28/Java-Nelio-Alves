package teste.loja.model;

public class ItemPedido {
	Produto produto;
	int quantidade;

	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double subTotal() {
		return quantidade * produto.getPreco();
	}

	@Override
	public String toString() {
		return produto.getNome() + " - " + String.format("%.2f", produto.getPreco()) + " - Quantidade de Items " + quantidade + " SubTotal " + subTotal();
	}
}
