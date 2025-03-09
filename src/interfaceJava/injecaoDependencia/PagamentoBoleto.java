package interfaceJava.injecaoDependencia;

public class PagamentoBoleto implements Pagamento {
	@Override
	public double processaPagamento(double valor) {
		return valor * (1- 0.05);
	}
}
