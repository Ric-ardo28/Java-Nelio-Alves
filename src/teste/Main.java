package teste;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		Usuario[] user = new Usuario[2];
		for (int i = 0; i < user.length; i++) {
			System.out.println("Digite o nome do usuario: ");
			String nome = sc.nextLine();
			System.out.println("Digite o email do usuario: ");
			String email = sc.nextLine();
			System.out.println("Digite o Jogo favorito: ");
			String jogoFavorito = sc.nextLine();

			user[i] = new Usuario(nome, email, jogoFavorito);
		}
		sc.close();

		for (Usuario u : user){
			System.out.println(u.toString());

		}
	}
}
