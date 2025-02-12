package teste;

import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        int [] resultado = new int[10], resultado2 = new int[10];
        Random rand = new Random();

        for (int i = 0; i< resultado.length; i++){
            resultado[i] = rand.nextInt(6) +1;
            System.out.println("Lançamento " + (i+1) + ": " + resultado[i]);
        }
    }
}
