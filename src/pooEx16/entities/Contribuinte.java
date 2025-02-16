package pooEx16.entities;

public abstract class Contribuinte {
	private String nome;
	private double RendaAnaul;

	public Contribuinte(String nome, double rendaAnaul) {
		this.nome = nome;
		RendaAnaul = rendaAnaul;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnaul() {
		return RendaAnaul;
	}

	public void setRendaAnaul(double rendaAnaul) {
		RendaAnaul = rendaAnaul;
	}

	public abstract double taxa();
}
