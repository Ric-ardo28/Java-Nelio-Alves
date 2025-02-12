package teste;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrizA = new int[4][4];

        System.out.println("teste.Matriz A:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = random.nextInt(12);
                System.out.print(matrizA[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("teste.Matriz B:");
        int[][] matrizB = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = random.nextInt(12);
                System.out.print(matrizB[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("teste.Matriz C:");

        int[][] matrizC = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
