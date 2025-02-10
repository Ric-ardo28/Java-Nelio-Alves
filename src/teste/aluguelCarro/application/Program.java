package teste.aluguelCarro.application;

import teste.aluguelCarro.model.Aluguel;
import teste.aluguelCarro.model.Carro;
import teste.aluguelCarro.model.Cliente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Cadastrar cliente ");
		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.println("Digite o cpf do cliente: ");
		String cpf = sc.nextLine();
		System.out.println("Digite o telefone do cliente: ");
		String telefone = sc.nextLine();
		System.out.println("Digite o email do cliente: ");
		String email = sc.nextLine();

		Cliente cliente = new Cliente(nome, cpf, telefone, email);
		System.out.println("----------------------------------------------------------------");

		System.out.println("Cadastrar Carro");
		System.out.println("Digite a marca do carro: ");
		String marca = sc.nextLine();
		System.out.println("Digite a modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.println("Digite a cor do carro: ");
		String cor = sc.nextLine();
		System.out.println("Digite o ano do carro: ");
		String ano = sc.nextLine();
		System.out.println("Digite a placa do carro: ");
		String placa = sc.nextLine();
		System.out.println("Digite o Valor da diaria do carro: ");
		double preco = sc.nextDouble();

		Carro carro = new Carro(marca, modelo, cor, ano, placa, preco);
		sc.nextLine();
		System.out.println("Digite a data de inicio do aluguel: (dd/MM/yyyy) ");
		LocalDate dataInicio = LocalDate.parse(sc.next(), dtf);
		System.out.println("Digite a data de fim do aluguel: (dd/MM/yyyy) ");
		LocalDate dataFim = LocalDate.parse(sc.next(), dtf);

		Aluguel aluguel = new Aluguel(carro, cliente, dataInicio, dataFim);

		aluguel.imprimirInformacoes();
		aluguel.calcularValor();

		sc.close();

	}
}
