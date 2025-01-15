package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        int quantidade = 0;
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < n; i++) {
            if(numeros[i] % 2 == 0) {
                System.out.printf(numeros[i] + " ");
                quantidade++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de Pares = " + quantidade);
    }
}
