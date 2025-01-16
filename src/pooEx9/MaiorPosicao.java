package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }
        double maior = numeros[0];
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i + 1;
            }
        }
        System.out.println("Maior Valor = " + maior);
        System.out.println("Posicao do maior Valor = " + posicao);
        sc.nextLine();
    }
}
