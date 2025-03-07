package interfaceJava.application;

import interfaceJava.model.entities.AluguelCarro;
import interfaceJava.model.entities.Veiculo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel ");
		System.out.println("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Retirada (dd/mm/yyyy hh:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.println("Retorno (dd/mm/yyyy hh:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), dtf);

		AluguelCarro aluguelCarro = new AluguelCarro(inicio, fim, new Veiculo(modelo));


		sc.close();
	}
}
