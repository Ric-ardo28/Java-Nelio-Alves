package pooEx12.entities;

public class FuncionarioTerceiro extends Funcionario{
	private Double valorAdicional;

	public FuncionarioTerceiro(Double valorAdicional) {
		super();
	}

	public FuncionarioTerceiro(String nome, Integer horasTrabalhadas, Double valorHora, Double valorAdicional) {
		super(nome, horasTrabalhadas, valorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
}
