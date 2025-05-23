package TrabalhandoComArquivos15.exercicioNotas.entities;

public class Notas {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double nota5;

	public Notas(String nome, double nota1, double nota2, double nota3, double nota4, double nota5) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.nota5 = nota5;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getNota5() {
		return nota5;
	}

	public void setNota5(double nota5) {
		this.nota5 = nota5;
	}

	public double calcularMedia() {
		return (nota1 + nota2 + nota3 + nota4 + nota5)/5;
	}
}


