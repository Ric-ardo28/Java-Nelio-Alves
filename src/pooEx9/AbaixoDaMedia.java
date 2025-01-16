package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double media = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            media += vetor[i];
        }
        double resultado = media /= n;
        System.out.println("Media do Vetor = " + resultado);
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < resultado) {
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
