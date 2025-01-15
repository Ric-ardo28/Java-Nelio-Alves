package pooEx7;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double soma, media;

        System.out.println("Quantos numeros voce vai digitar? ");
         n = sc.nextInt();

         double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println(" ");

        System.out.print("VALORES = ");
        soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }

        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        media = soma / n;
        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }

}
