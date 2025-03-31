package generics.set.application;

import generics.set.entities.Produto;

import java.util.*;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Set<String> setProdutos = new TreeSet<>();

		System.out.println("quantidade a ser cadastrada? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String nome = sc.nextLine();
			System.out.println("Descrição do produto: ");
			String descricao = sc.nextLine();
			System.out.println("Quantidade do produto: ");
			int quantidade = sc.nextInt();
			System.out.println("Preço do produto: ");
			double preco = sc.nextDouble();

			Produto produto = new Produto(nome, descricao, quantidade, preco);
			setProdutos.add(String.valueOf(produto));
		}
		for (String p : setProdutos) {
			System.out.println(p);
		}
	}
}
