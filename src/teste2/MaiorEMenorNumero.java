package teste2;

import java.util.List;
import java.util.Arrays;

public class MaiorEMenorNumero {

	/**
	 * Método para encontrar o maior número de uma lista.
	 * Passos:
	 * 1. Verifica se a lista é nula ou vazia para evitar erro.
	 * 2. Assume que o primeiro número da lista é o maior.
	 * 3. Percorre a lista comparando cada número com o maior encontrado.
	 * 4. Atualiza o maior número quando encontra um valor maior.
	 * 5. Retorna o maior número ao final.
	 */
	public static int maior(List<Integer> numeros) {
		if (numeros == null || numeros.isEmpty()) {
			throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
		}

		int maior = numeros.get(0); // Assume que o primeiro número é o maior

		for (int num : numeros) {
			if (num > maior) {
				maior = num; // Atualiza se encontrar um número maior
			}
		}
		return maior; // Retorna o maior número encontrado
	}

	/**
	 * Método para encontrar o menor número de uma lista.
	 * Passos:
	 * 1. Verifica se a lista é nula ou vazia para evitar erro.
	 * 2. Assume que o primeiro número da lista é o menor.
	 * 3. Percorre a lista comparando cada número com o menor encontrado.
	 * 4. Atualiza o menor número quando encontra um valor menor.
	 * 5. Retorna o menor número ao final.
	 */
	public static int menor(List<Integer> numeros) {
		if (numeros == null || numeros.isEmpty()) {
			throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
		}

		int menor = numeros.get(0); // Assume que o primeiro número é o menor

		for (int num : numeros) {
			if (num < menor) {
				menor = num; // Atualiza se encontrar um número menor
			}
		}
		return menor; // Retorna o menor número encontrado
	}

	public static void main(String[] args) {
		// Criando uma lista com 30 números inteiros
		List<Integer> listaNumeros = Arrays.asList(
				45, 23, 78, 12, 90, 34, 56, 89, 67, 21,
				5, 98, 37, 64, 72, 11, 83, 29, 50, 77,
				92, 41, 33, 17, 61, 8, 95, 26, 88, 19
		);

		// Chama os métodos e exibe o maior e o menor número
		System.out.println("O maior número da lista é: " + maior(listaNumeros));
		System.out.println("O menor número da lista é: " + menor(listaNumeros));
	}
}
