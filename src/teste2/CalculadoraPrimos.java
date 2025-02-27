package teste2;

import java.util.Scanner;

public class CalculadoraPrimos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lista = new int[10];

		System.out.println("Digite uma lista de 10 numeros inteiros: ");
		for (int i = 0; i < 10; i++) {
			lista[i] = sc.nextInt();
		}


		for (int i = 0; i < lista.length; i++) {
			lista[i] = lista[i] * 2;
			System.out.println(lista[i]);
		}

	}
}
