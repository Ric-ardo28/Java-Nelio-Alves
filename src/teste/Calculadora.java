package teste;

import java.util.Scanner;

public class Calculadora {
	public static int soma(int a, int b){
		return a+b;
	}
	public static int subtracao(int a, int b){
		return a-b;
	}
	public static int multiplicacao(int a, int b){
		return a*b;
	}
	public static int divisao(int a, int b){
		return a/b;
	}
	public static double celsiusParaFahrenheit(double celsius){
		return celsius * 9/5 + 32;
	}
	public static double fahrenheitParaCelsius(double fahrenheit){
		return fahrenheit * 5/9;
	}
	public static double metrosParaKilometres(double metros){
		return metros/10002;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rusultado = soma(12, 84);
		int resultado2 = subtracao(10, 9);
		int resultado3 = multiplicacao(2, 10);
		int resultado4 = divisao(10, 2);
		System.out.println("Digite a temperatura em Ceusius ");
		double celsius = sc.nextDouble();
		double resultado5 = celsiusParaFahrenheit(celsius);
		System.out.println("Digite a temperatura em Fahrenheit ");
		double fahrenheit = sc.nextDouble();
		double resultado6 = fahrenheitParaCelsius(fahrenheit);
		double resultado7 = metrosParaKilometres(5000);

		System.out.println("rsultado soma = " + rusultado);
		System.out.println("resultado2 subtracao = " + resultado2);
		System.out.println("resultado3 multiplicacao = " + resultado3);
		System.out.println("resultado4 divisao = " + resultado4);
		System.out.println("resultado5 fahrenheit = " + resultado5);
		System.out.println("resultado5 Celsius = " + resultado6);
		System.out.println("resultado7 kilometros = " + resultado7);
	}
}
