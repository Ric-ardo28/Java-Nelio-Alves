package pooEx15.entities;

public class FuncionarioClt extends Funcionario {
	public FuncionarioClt(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double CalcularSalario() {
		return this.getSalarioBase() + getSalarioBase() * 0.1;
	}

	@Override
	public void Imprimir() {
		System.out.println("Nome: " + this.getNome() + " Salario: " + this.CalcularSalario());

	}
}


