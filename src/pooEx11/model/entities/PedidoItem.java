package pooEx11.model.entities;

public class PedidoItem {
	Integer quantidade;
	Double valor;
	private Protudo produto;

	public PedidoItem(Integer quantidade, Double valor, Protudo produto) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Protudo getProduto() {
		return produto;
	}
	public void setProduto(Protudo produto) {
		this.produto = produto;
	}
	public Double subTotal(){
		return valor * quantidade;
	}

	@Override
	public String toString() {
		return produto.getNome()
				+ ", $"
				+ String.format("%.2f", valor)
				+ ", Quantidade: "
				+ quantidade +
				",Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
