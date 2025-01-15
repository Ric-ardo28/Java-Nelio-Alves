package pooEx4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço do Dolar ? ");
        double precoDolar = sc.nextDouble();
        System.out.println("Quantos dolares vc precisa ? ");
        double montante = sc.nextDouble();

        double resultado = Dolar.dolarParaReal(montante, precoDolar);
        System.out.printf("O valor total em Real com IOF %.2f", resultado);
    }
}
