package teste2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de carros deseja registrar: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		List <Veiculos> car = new ArrayList<>();

		for(int i = 0; i < qtd; i++ ){
			System.out.println("Digite a marca do carro: #" + (i + 1));
			String marca = sc.nextLine();
			System.out.println("Digite o modelo do carro: ");
			String modelo = sc.nextLine();
			System.out.println("Digite a cor do carro: ");
			String cor = sc.nextLine();
			System.out.println("Digite o ano do carro: ");
			int ano = sc.nextInt();
			sc.nextLine();
			Veiculos veiculos = new Veiculos(marca, modelo, cor, ano);
			car.add(veiculos);
		}



	}
}
