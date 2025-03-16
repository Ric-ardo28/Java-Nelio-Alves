package manipulacaoString.contains;

import java.util.Scanner;

public class BuscaVerificacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = "Ricardo, Patricia, Heloisa, Theo, Bernardo";
		String[] verificacao = palavra.split(",");
		for (int i = 0; i < verificacao.length; i++) {
			System.out.println(verificacao[i]);
		}
		System.out.println("Digite o nome da busca: ");
		String out = sc.nextLine().toLowerCase();
		for (int i = 0; i < verificacao.length; i++) {
		if(verificacao[i].toLowerCase().contains(out) == true) {
			System.out.println(verificacao[i]);
		}
		}
	}
}
