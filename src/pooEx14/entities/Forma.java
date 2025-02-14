package pooEx14.entities;

import pooEx14.enums.Color;

public abstract class Forma {
	private Color cor;

	public Forma(Color cor) {
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	public abstract double area();
}
