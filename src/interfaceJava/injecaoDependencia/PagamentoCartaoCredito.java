package interfaceJava.injecaoDependencia;

public class PagamentoCartaoCredito implements Pagamento {
	@Override
	public double processaPagamento(double valor) {

		return valor * (1 - 0.10);
	}
}
