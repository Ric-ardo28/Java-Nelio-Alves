package aulasU.cauculadoraSimples;

import java.util.Scanner;

public class Cauculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("O numero " + n + " e par");
        } else {
            System.out.println("O numero " + n + " e impar");
        }





    }


}
