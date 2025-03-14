package manipulacaoString.contains;

import java.util.Scanner;

public class ContadorDeLetras {
	public static void main(String[] args) {
		String palavra = "Programacao"; // Insira a palavra que deseja analisar

		// Chama o método que conta as letras
		int[] contagem = contarLetras(palavra);

		// Exibe o resultado
		for (char letra = 'a'; letra <= 'z'; letra++) {
			if (contagem[letra - 'a'] > 0) {
				System.out.println(letra + ": " + contagem[letra - 'a']);
			}
		}
	}

	// Método que conta a quantidade de cada letra do alfabeto em uma palavra
	public static int[] contarLetras(String palavra) {
		int[] contagem = new int[26]; // Array para armazenar a contagem das letras (a-z)

		// Itera sobre cada caractere da palavra
		for (char letra : palavra.toLowerCase().toCharArray()) {
			// Verifica se o caractere está no intervalo 'a'-'z'
			if (letra >= 'a' && letra <= 'z') {
				// Incrementa o contador para a letra atual
				contagem[letra - 'a']++;
			}
		}

		return contagem;
	}
}
