package excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exc1 {
	public static int numeros(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		boolean valido = false;
		while (!valido) {
			try {

				System.out.println("Divisão ");
				System.out.println("Digite o primeiro numero: ");
				int a = sc.nextInt();
				System.out.println("Digite o segundo numero: ");
				int b = sc.nextInt();

				System.out.print("Resultado: " + numeros(a, b));
				valido = true;


			} catch (ArithmeticException e) {
				System.out.println("Erro: Numero não pode ser dividido por zero");
			} catch (InputMismatchException e) {
				System.out.println("Digite somente numeros inteiros!");
				sc.nextLine();
			}
		}
		sc.close();
	}
}
