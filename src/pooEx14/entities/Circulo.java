package pooEx14.entities;

import pooEx14.enums.Color;

public class Circulo extends Forma{

	private double raio;

	public Circulo(double raio, Color cor) {
		super(cor);
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}
