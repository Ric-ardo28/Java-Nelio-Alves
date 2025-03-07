package teste;

import java.util.Scanner;

public class Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros: ");
		int n = sc.nextInt();

		int[] vetor = new int[n];


		for (int i = 0; i < n; i++) {
			System.out.print("Digite os numeros: ");
			vetor[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (vetor[i] < 0) {

				System.out.println("Numeros negativos: " + vetor[i]);
			}
		}

	}
}
