package pooEx16.application;

import pooEx16.entities.Contribuinte;
import pooEx16.entities.PessoaFisica;
import pooEx16.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> contribuintes = new ArrayList<>();

		System.out.println("digite a quantidade de contribuintes");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Contribuinte: " + (i + 1));
			System.out.println("Pessoa Fisica ou Juridica ? (f / j)");
			char tipo = sc.next().charAt(0);
			sc.nextLine();

			System.out.println("nome: ");
			String nome = sc.next();
			System.out.println("Renda Anual: ");
			double rendaAnual = sc.nextDouble();

			if (tipo == 'f') {
				System.out.println("Gastos com Saude: ");
				double gastosSaude = sc.nextDouble();

				Contribuinte contribuinte = new PessoaFisica(nome, rendaAnual, gastosSaude);
				contribuintes.add(contribuinte);

			} else if (tipo == 'j') {
				System.out.println("Numeros de funcionarios: ");
				int qtdFuncionarios = sc.nextInt();

				Contribuinte contribuinte = new PessoaJuridica(nome, rendaAnual, qtdFuncionarios);
				contribuintes.add(contribuinte);

			} else {
				System.out.println("Tipo invalido ");
			}
			System.out.println();

		}
		double total = 0;
		for (Contribuinte contribuinte : contribuintes) {
			double tax = contribuinte.taxa();
			System.out.println(String.format("%s %.2f", contribuinte.getNome(), contribuinte.taxa()));
			total += tax;
		}
		System.out.println();
		System.out.println("Total de Imposto: $ " + total);

	}
}
