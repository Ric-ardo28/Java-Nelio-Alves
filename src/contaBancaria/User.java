package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		double saldo = 0;
		System.out.println("Digite o numero da conta: ");
		int numeroDaConta = sc.nextInt();



		Conta conta = new Conta(titular, saldo, numeroDaConta);

		System.out.println("digite o valor do deposito: ");
		double valor = conta.depositar(sc.nextDouble());
		conta.exibirSaldo();
		System.out.println("digite o valor do saque: ");
		double valorSaque = conta.sacar(sc.nextDouble());
		conta.exibirSaldo();
	}
}
