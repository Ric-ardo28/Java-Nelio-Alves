package teste;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma sequencia de numeros aleatorios ");
        String numero = sc.next();

        char [] digito = numero.toCharArray();

        Arrays.sort(digito);

        String digitostr = new String(digito);

        System.out.println("quantidade de digitos : " + digitostr.length());
        System.out.println(digitostr);
    }
}
