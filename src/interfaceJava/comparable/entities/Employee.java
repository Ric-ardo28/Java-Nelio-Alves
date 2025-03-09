package interfaceJava.comparable.entities;

public class Employee implements Comparable<Employee> {
	private String nome;
	private Double salary;

	public Employee(String nome, Double salary) {
		this.nome = nome;
		this.salary = salary;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return -salary.compareTo(o.getSalary());
	}
}
