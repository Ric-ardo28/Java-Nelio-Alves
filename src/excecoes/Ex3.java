package excecoes;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = validar(sc);



	}
	public static int validar(Scanner sc){
		System.out.println("Digite um numero inteiro: ");
		int numero = sc.nextInt();

		if (numero > 10||numero < 0){
			System.out.println("erro: numero nao pode ser maior que 10 e negativo ");
			return validar(sc);
		}
		System.out.println("Numero Correto: " + numero	);
		return numero;
	}
}
