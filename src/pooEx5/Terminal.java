package pooEx5;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria;

        System.out.println("Entre com o numero da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Entre com o nome do Titular: ");
        String titular = sc.nextLine();


        System.out.println("Deseja faazer um depoiso inicial (S/N) ? ");
        char opcao = sc.next().toLowerCase().charAt(0);
        if (opcao == 's') {
            System.out.println("Qual o valor do deposito inicial ? ");
            double depositoInicial = sc.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta, titular, depositoInicial);
        }else {
            contaBancaria = new ContaBancaria(numeroConta, titular);
        }
        System.out.println("teste.Dados da conta: ");
        System.out.println(contaBancaria);

        System.out.println("Entre com o valor do deposito: ");
        contaBancaria.depositar(sc.nextDouble());

        System.out.println("teste.Dados da conta atualizados ");
        System.out.println(contaBancaria);

        System.out.println("Entre com o valor de saque: ");
        contaBancaria.sacar(sc.nextDouble());

        System.out.println("teste.Dados da conta atualizados ");
        System.out.println(contaBancaria);


        sc.close();

    }
}
