package teste.loja.application;

import teste.loja.model.ItemPedido;
import teste.loja.model.Pedido;
import teste.loja.model.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Pedido pedido = new Pedido(new Date());

		System.out.printf("Quantos produtos deseja cadastrar: ");
		int n = sc.nextInt();
		sc.nextLine();
		try {


			for (int i = 0; i < n; i++) {
				System.out.printf("Qual o nome do produto: ");
				String nome = sc.nextLine();
				System.out.printf("Qual o preço produto: ");
				double preco = sc.nextDouble();


				Produto produto = new Produto(nome, preco);

				System.out.printf("Qual a quantidade do produto: ");
				int quantidade = sc.nextInt();
				sc.nextLine();

				ItemPedido itemPedido = new ItemPedido(produto, quantidade);

				pedido.adicionarItem(itemPedido);


			}
			System.out.printf(String.valueOf(pedido));
		}
		catch (IllegalArgumentException e) {
			System.out.println("Erro ao criar o Produto: " + e.getMessage());

		}

			sc.close();
	}
}
