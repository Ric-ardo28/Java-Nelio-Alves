package pooEx12.application;

import pooEx12.entities.Funcionario;
import pooEx12.entities.FuncionarioTerceiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> funcionariosList = new ArrayList<>();

		System.out.print("Entre com a quantidade de funcionarios: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionario #" + (i + 1) + ": ");
			System.out.println("O funcionario é tercerizado ? (y/n): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome do funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Total de horas trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valorHora = sc.nextDouble();
			if (ch == 'y') {
				System.out.println("Valor adicional: ");
				double valorAdicional = sc.nextDouble();

				Funcionario funcionario = new FuncionarioTerceiro(nome, horasTrabalhadas, valorHora, valorAdicional);
				funcionariosList.add(funcionario);
			} else {
				Funcionario funcionario = new Funcionario(nome, horasTrabalhadas, valorHora);
				funcionariosList.add(funcionario);
			}
		}
		System.out.println();
		System.out.println("Pagamentos: ");

		for (Funcionario funcionario : funcionariosList) {
			System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f" , funcionario.pagamento()));
		}




		sc.close();
	}
}
