package pooEx7;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("Digite a quantidade de numeros: ");

        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

        }
        System.out.println("numeros negativos");
        for (int i = 0; i < n; i++) {
           if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
