package excecoes;

import java.util.Scanner;


public class Exc02 {
	public static void verificarIdade(int idade) {
		if (idade < 0) {
			throw new IdadeInvalidaException("Idade inválida! Não pode ser negativa.");
		} else if (idade > 110) {
			throw new IdadeInvalidaException("Idade inválida! Não pode ser maior que 110 anos.");
		} else if (idade >= 18) {
			System.out.println("Maior de idade, pode votar.");
		} else {
			System.out.println("Menor de idade, não pode votar.");
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {


			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();

			verificarIdade(idade);
		} catch (IdadeInvalidaException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}
}

