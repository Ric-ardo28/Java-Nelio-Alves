package pooEx14.entities;

import pooEx14.enums.Color;

public class Retangulo extends Forma {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura, Color cor) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double area() {
		return largura * altura;
	}
}
