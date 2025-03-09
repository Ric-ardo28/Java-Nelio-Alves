package interfaceJava.injecaoDependencia;

public class SistemaDePagamento {
	private Pagamento pagamento;

	public SistemaDePagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public double realizaPagamento(double valor) {
		return pagamento.processaPagamento(valor);
	}
}
