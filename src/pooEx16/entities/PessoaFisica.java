package pooEx16.entities;

public class PessoaFisica extends Contribuinte {
	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnaul, double gastosSaude) {
		super(nome, rendaAnaul);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double taxa() {
		if (getRendaAnaul() > 2000.00) {
			double imposto = (getRendaAnaul() * 0.25) - gastosSaude * 0.50;
			return imposto;

		}else {
			double imposto = (getRendaAnaul() * 0.15) - gastosSaude * 0.50;
			return imposto;
		}
	}
}
