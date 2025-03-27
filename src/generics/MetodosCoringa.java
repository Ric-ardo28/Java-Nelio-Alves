package generics;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

import java.util.*; // Importa as classes necessárias, como List e Arrays.

public class MetodosCoringa {
	public static void main(String[] args) {
		// Criando uma lista de números inteiros usando Arrays.asList()
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Criando uma lista de Strings
		List<String> lista2 = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

		// Chamando o método printList() para imprimir os elementos da lista de números
		printList(lista);

		// Pula uma linha para separar a saída no console
		System.out.println();

		// Chamando o método printList() para imprimir os elementos da lista de Strings
		printList(lista2);
	}

	// Método genérico que recebe uma lista de qualquer tipo usando o curinga (wildcard '?')
	public static void printList(List<?> lista) {
		// Percorre todos os elementos da lista
		for (Object o : lista) {
			// Imprime o elemento sem espaço entre eles
			System.out.print(o);
		}
	}
}
