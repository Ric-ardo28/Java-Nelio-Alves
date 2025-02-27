package teste.loja.model;

public class Produto {
	String nome;
	double preco;

	public Produto(String nome, double preco) {
		if(preco <= 0){
			throw new IllegalArgumentException("O preço não pode ser negativo");
		}
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
