import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = rand.nextInt(100);
                matrizB[i][j] = rand.nextInt(100);
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);
        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);
        System.out.println("Matriz C:");
        imprimirMatriz(matrizC);
    }
    public static void imprimirMatriz(int[][] matriz) {
        for(int [] linha : matriz) {
            for(int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
