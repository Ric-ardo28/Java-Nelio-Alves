package contaBancaria;

import java.util.Locale;
import java.util.Scanner;

import static contaBancaria.TipoConta.*;

public class User {
	public static void main(String[] args) {

		Conta co = new Conta("Ricardo", 0.0, 001, CONTA_CORRENTE );
		ContaEmpresa coe = new ContaEmpresa("Patricia", 0.0, 0002, CONTA_EMPRESA, 500.0);

		// UPCASTING

		Conta co1 = coe;
		Conta co2 = new ContaEmpresa("Pat", 0.0, 0003, CONTA_EMPRESA, 500.0);
		Conta co3 = new ContaPoupanca("Helo", 0.0, 0004, CONTA_EMPRESA, 0.01);

		//DOWNCASTING

		ContaEmpresa coe1 = (ContaEmpresa) co2;
		coe1.emprestimo(100.0);

		//ContaEmpresa coe2 = (ContaEmpresa) co3;
		if (co3 instanceof ContaEmpresa) {
			ContaEmpresa coe2 = (ContaEmpresa) co3;
			coe2.emprestimo(100.0);
			System.out.println("Emprestimo");

		}
		if (co3 instanceof ContaPoupanca) {
			ContaPoupanca coe2 = (ContaPoupanca) co3;
			coe2.atualizarSaldo();
			System.out.println("atualizado");



		}
		co.depositar(2000.0);
		co.exibirSaldo();
		co.sacar(500.0);
		co.exibirSaldo();

		ContaPoupanca contaPoupanca = new ContaPoupanca("Ricardo", 1000.0, 21001, CONTA_CORRENTE, 0.01);
		contaPoupanca.exibirSaldo();
		contaPoupanca.sacar(500.0);
		contaPoupanca.exibirSaldo();

		Conta co4 = new ContaEmpresa("Pat", 1000.0, 0003, CONTA_EMPRESA, 500.0);
		co4.sacar(200.0);
		co4.exibirSaldo();









	}
}
