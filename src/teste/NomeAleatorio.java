package teste;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class NomeAleatorio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de nome:");
        int n = sc.nextInt();

        Random random = new Random();

        String[] nome = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome: ");
            nome[i] = sc.next();
        }

        int sorteio = random.nextInt(nome.length);

        System.out.println("Nome sorteado: " + nome[sorteio]);



    }
}
