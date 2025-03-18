package excecoes;

import java.util.Scanner;

public class tryCatch {

	public static void validarNome(String nome) throws NomeInvalido {
		if(!nome.matches("[a-zA-Z ]*")) {
			throw new NomeInvalido("Erro : nome invalido Digite apenas letras e espaços ");
		}
	}

	public static void main(String[] args) throws NomeInvalido {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite seu nome: (somente letras) ");
			String nome = sc.nextLine();
			validarNome(nome);
			System.out.println("Nome validado com sucesso! " + nome );
		}catch (NomeInvalido e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("Fim do programa");
		}
		}

	}

