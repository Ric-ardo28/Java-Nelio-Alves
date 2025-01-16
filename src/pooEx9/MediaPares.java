package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o Vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int media = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

        }
        int npares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                media += vetor[i];
                npares++;
            }
        }
        if (npares == 0) {
            System.out.println("Nenhum numero Par ");
        }else {
            double resultado = (double) media / npares;
            System.out.println("Media de pares = " + resultado);
        }
        sc.close();
    }
}
