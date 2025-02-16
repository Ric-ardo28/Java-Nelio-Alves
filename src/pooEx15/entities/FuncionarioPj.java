package pooEx15.entities;

public class FuncionarioPj extends Funcionario {
	public FuncionarioPj(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	@Override
	public double CalcularSalario() {
		return this.getSalarioBase();
	}
	@Override
	public void Imprimir(){
		System.out.println("Nome: " + this.getNome() + " Salario: " + this.CalcularSalario());

	}

}
