package teste2.one;

import java.util.List;

public class Numeros {
	private List<Integer> numeros;
	public Numeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	public List<Integer> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	@Override
	public String toString() {
		return "Numeros [numeros=" + numeros + "]";
	}
	}