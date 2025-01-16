package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        PessoaVelho[] pessoa = new PessoaVelho[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º Pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoa[i] = new PessoaVelho(nome, idade);

        }
        int maisVelho = pessoa[0].getIdade();
        int pocicaomaisVelho = 0;
        for (int i = 0; i < n; i++) {
            if (pessoa[i].getIdade() > maisVelho) {
                pocicaomaisVelho = i;

            }
        }
        System.out.println("Pessoa mais velha: " + pessoa[pocicaomaisVelho].getNome());
    }
}
