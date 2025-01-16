package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada Vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {

            vetorA[i] = sc.nextInt();
        }

        int[] vetorB = new int[n];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {

            vetorB[i] = sc.nextInt();
        }

        int[] vetorC = new int[n];
        System.out.println("Vetor Resultante: ");
        for (int i = 0; i < n; i++) {

            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }


        sc.nextLine();
    }
}
