package listas4.entities;

import listas4.enums.CargoFuncionario;

public class Funcionario {
	private String nome;
	private CargoFuncionario cargo;
	private Double salario;
	private Endereco endereco;
	private Integer idFuncionario;

	public Funcionario(String nome, CargoFuncionario cargo, Double salario, Endereco endereco, Integer idFuncionario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.endereco = endereco;
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CargoFuncionario getCargo() {
		return cargo;
	}

	public void setCargo(CargoFuncionario cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public void aumentarSalario(double porc) {
		salario += salario * porc / 100.0;
	}

	@Override
	public String toString() {
		return "Funcionario: \n" +
				"Nome: " + nome + "\n" +
				"Cargo: " + cargo.getNome() + "\n" +
				"Descrição: " + cargo.getDescricao() + "\n" +
				"Salario: " + salario + "\n" +
				"Endereço: " + endereco + "\n" +
				"Id: " + idFuncionario + "\n";

	}
}
