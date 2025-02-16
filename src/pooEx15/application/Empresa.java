package pooEx15.application;

import pooEx15.entities.Funcionario;
import pooEx15.entities.FuncionarioClt;
import pooEx15.entities.FuncionarioPj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario funcionario = new FuncionarioPj("Ricardo", 1000.0);
		funcionarios.add(funcionario);

		funcionarios.add(new FuncionarioClt("Maria", 2000.0));
		funcionarios.add(new FuncionarioClt("Patricia ", 1500.0));
		funcionarios.add(new FuncionarioPj("Théo", 3000.0));

		for(Funcionario fun : funcionarios){
			fun.Imprimir();
		}
		
		for(Funcionario fun : funcionarios){
			System.out.println(fun.CalcularSalario());
		}





	}
}
