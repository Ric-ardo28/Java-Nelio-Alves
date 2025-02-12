package teste;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = entrada.nextLine();

        int quandidade = letras(palavra);
        System.out.println("A palavra " + palavra + " tem " + quandidade + " Letras");
        entrada.close();

    }

    public static int letras(String palavras) {
            return palavras.replaceAll("[ ]", "").length();
    }

}
