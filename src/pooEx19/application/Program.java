package pooEx19.application;

import pooEx19.model.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados da conta");
		
		System.out.print("Numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Titular da conta: ");
		String titular = sc.next();
		System.out.print("Salto inicial: ");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();

		ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldoInicial, limiteSaque);

		System.out.println("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);

		System.out.println("Novo saldo: " + conta.getSaldo());


		sc.close();
	}
}
