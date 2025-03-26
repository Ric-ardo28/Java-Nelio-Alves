package generics.delimitados;

import java.util.ArrayList;
import java.util.List;

public class GenericTeste<T extends Number & Comparable<T>> {
	private List<T> elementos = new ArrayList<>();

	public void add(T numero) {
		elementos.add(numero);
	}

	public T maiorElemento() {
		if (elementos.isEmpty()) {
			throw new IllegalStateException("Lista vazia");
		}
		T maior = elementos.get(0);
		for (T elemento : elementos) {
			if (elemento.compareTo(maior) > 0) {
				maior = elemento;
			}

		}
		return maior;
	}


}
