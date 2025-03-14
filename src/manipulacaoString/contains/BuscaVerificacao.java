package manipulacaoString.contains;

import java.util.Scanner;

public class BuscaVerificacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String palavra = "Ricardo Rodrigues Santana";
		System.out.println("Digite o nome da busca: ");
		String out = sc.nextLine();

		if(palavra.contains(out) == true){
			System.out.println(palavra);
		}
	}
}
