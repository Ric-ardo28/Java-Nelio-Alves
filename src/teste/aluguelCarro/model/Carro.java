package teste.aluguelCarro.model;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private String ano;
	private String placa;
	private double preco;

	public Carro(String marca, String modelo, String cor, String ano, String placa, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.placa = placa;
		this.preco = preco;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Ficha do Carro "
				+ " marca: " + marca + '\n'
				+ " modelo: " + modelo + '\n'
				+ " cor: " + cor + '\n'
				+ " ano: " + ano + '\n'
				+ " placa: " + placa + '\n'
				+ " preco: " + preco;
	}
}
