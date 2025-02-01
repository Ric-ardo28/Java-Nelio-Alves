package exMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int colunas = sc.nextInt();
        sc.nextLine();
        int i = 0;
        int j = 0;
        int resultado = 0;
        int[][] matrizA = new int[linhas][colunas];

        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                matrizA[i][j] = i + j;
                System.out.print(matrizA[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println();

        int[][] matrizB = new int[linhas][colunas];

        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                matrizB[i][j] = i + j;
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                System.out.print(matrizA[i][j] + matrizB[i][j] + " ");
            }
            System.out.println(" ");

        }


        sc.close();
    }
}
