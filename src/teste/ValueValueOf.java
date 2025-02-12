package teste;

import listas4.enums.CargoFuncionario;

public class ValueValueOf {
	public static void main(String[] args) {
		CargoFuncionario [] cargo = CargoFuncionario.values();

		for (int i = 0; i < cargo.length; i++) {
			System.out.printf(cargo[i].getNome()+" - ");
			System.out.println(cargo[i].getDescricao());
			System.out.println(cargo[i].getSalario());
		}
		for(CargoFuncionario cf : cargo) {
			System.out.printf(cf.getNome());
		}

	}
}
