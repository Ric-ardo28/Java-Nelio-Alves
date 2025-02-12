package pooEx11.application;

import pooEx11.model.entities.Client;
import pooEx11.model.entities.Pedido;
import pooEx11.model.entities.PedidoItem;
import pooEx11.model.entities.Protudo;
import pooEx11.model.enums.PedidoStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os teste.Dados do cliente");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (dd/MM/yyyy): ");
		Date dataNascimento = sdf.parse(sc.next());

		Client client = new Client(nome, email, dataNascimento);

		System.out.println("Entre com os dados do Pedido");
		System.out.print("Status: ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next().toUpperCase());

		Pedido pedido = new Pedido(new Date(), status, client);

		System.out.print("Quantidade de items do pedido: ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Entre com os dados do #" + (i + 1) + " item: ");
			System.out.print("Nome do Produto: ");
			String nomeItem = sc.nextLine();
			System.out.print("Valor do Produto: ");
			Double valorItem = sc.nextDouble();

			Protudo protudo = new Protudo(nomeItem, valorItem);

			System.out.print("Quantidade do Produto: ");
			int quantidadeProduto = sc.nextInt();
			sc.nextLine();

			PedidoItem pedidoItem = new PedidoItem(quantidadeProduto, valorItem, protudo);

			pedido.addItem(pedidoItem);



		}
		System.out.println();
		System.out.println("Sumario do pedido: ");
		System.out.println(String.valueOf(pedido));


		sc.close();


	}
}
