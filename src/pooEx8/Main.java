package pooEx8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas ? ");
        int n = sc.nextInt();

        Alturas[] vetor = new Alturas[n];

        int nidade = 0;
        double mediaAlturas = 0;
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new Alturas(nome, idade, altura);

            mediaAlturas += vetor[i].getAltura();

        }
        double resultadoAlturas = mediaAlturas / n;
        System.out.printf("Altura media: %.2f\n", resultadoAlturas);

        for (int i = 0; i < n; i++) {
            if (vetor[i].getIdade() < 16) {
                nidade++;
            }
        }
        double percentualMenores = ((double) nidade / n) * 100.0;

        System.out.println("Pessoas com menos de 16 anos: " + percentualMenores + "%");

        for (int i = 0; i < n; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }


        sc.close();

    }
}
