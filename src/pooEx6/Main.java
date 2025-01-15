package pooEx6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Cadastro de pessoas");
        System.out.println(" ");
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println();
        System.out.println("Digite o idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("Digite o E-mail: ");
        String email = sc.nextLine();
        System.out.println("Cadastro realizado com sucesso! ");
        System.out.println(" ");
        Pessoa pessoa = new Pessoa(nome, idade, email);

        int opcao = -1;



        while (opcao != 0 ) {
            System.out.println("Opção 1 exibir informações ");
            System.out.println("Opção 2 editar informações ");
            System.out.println("Opção 0 sair do programa");
            opcao = sc.nextInt();
            sc.nextLine();


            if (opcao == 1) {
                pessoa.exibirDados();
            } else if (opcao == 2) {
                System.out.println("Atualizar cadestro");
                System.out.println(" ");
                System.out.println("Digite o nome: ");
                nome = sc.nextLine();
                System.out.println();
                System.out.println("Digite a idade: ");
                idade = sc.nextInt();
                sc.nextLine();
                System.out.println();
                System.out.println("Digite o E-mail: ");
                email = sc.nextLine();
                System.out.println("Cadastro realizado com sucesso! ");
                System.out.println(" ");
                pessoa.editarInformacoes(nome, idade, email);
            } else if (opcao == 0) {
                System.out.println("Saindo do programa");
                break;

            }else {
                System.out.println("Entrada invalida ");
            }
        }



        sc.close();

    }
}
