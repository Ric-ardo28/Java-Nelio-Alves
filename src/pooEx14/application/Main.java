package pooEx14.application;

import pooEx14.entities.Circulo;
import pooEx14.entities.Forma;
import pooEx14.entities.Retangulo;
import pooEx14.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Forma> formas = new ArrayList<>();

		System.out.print("Digite a quantidade de Formas: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Forma #" + (i + 1));
			System.out.print("Retangulo ou Circulo ? (r/c) ");
			char tipo = sc.next().charAt(0);
			System.out.println("Cor ( BLACK/BLUE/RED): ");
			Color cor = Color.valueOf(sc.next());

			if (tipo == 'r') {
				System.out.println("Digite a largura: ");
				double largura = sc.nextDouble();
				System.out.println("Digite a altura: ");
				double altura = sc.nextDouble();
				Forma forma = new Retangulo(largura, altura, cor);
				formas.add(forma);

			} else if (tipo == 'c') {
				System.out.println("Digite o raio: ");
				double raio = sc.nextDouble();
				Forma forma = new Circulo(raio, cor);
				formas.add(forma);
			}
		}
		for (Forma forma1 : formas) {
			System.out.println(String.format("%.2f", forma1.area()));
		}


		sc.close();


	}

}
