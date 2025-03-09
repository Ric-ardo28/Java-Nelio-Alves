package interfaceJava.injecaoDependencia;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Pagamento pagamentoCartao = new PagamentoCartaoCredito();
		SistemaDePagamento sistema1 = new SistemaDePagamento(pagamentoCartao);
		System.out.printf("Pagamento realizado com cartão de credito  %.2f%n " , sistema1.realizaPagamento(4700.00));

		Pagamento pagamentoBoleto = new PagamentoBoleto();
		SistemaDePagamento sistema2 = new SistemaDePagamento(pagamentoBoleto);
		System.out.printf("Pagamento realizado com boleto: %.2f%n " , sistema2.realizaPagamento(1100.00));
	}
}
