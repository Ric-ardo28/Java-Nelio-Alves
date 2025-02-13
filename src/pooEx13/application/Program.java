package pooEx13.application;

import pooEx13.entities.Produto;
import pooEx13.entities.ProdutoImportado;
import pooEx13.entities.ProdutoUsado;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();


		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {

			System.out.println("Produto #" + (i + 1) + ": ");
			System.out.println("Digite o tipo de produto ");

			System.out.print("Comun , Usado ou Importado (c/u/i) ? ");
			char tipoProduto = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			if (tipoProduto == 'i') {
				System.out.print("Valor da taxa: ");
				Double taxaPreco = sc.nextDouble();
				Produto produto = new ProdutoImportado(nome, preco, taxaPreco);
				produtos.add(produto);
			} else if (tipoProduto == 'u') {
				System.out.println("Data de faturamento (DD/MM/YYYY)");
				LocalDate dataFaturamento = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Produto produto = new ProdutoUsado(nome, preco, dataFaturamento);
				produtos.add(produto);

			} else {
				Produto produto = new Produto(nome, preco);
				produtos.add(produto);
			}
		}
		System.out.println("Etiqueta de preço: ");
		for (Produto produto : produtos) {
			System.out.println(produto.tagPreco());
		}

		sc.close();
	}
}
