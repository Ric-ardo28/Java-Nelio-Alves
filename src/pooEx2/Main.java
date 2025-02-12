package pooEx2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("Funcionario: " + funcionario);
        System.out.println("Qual a porcentagem de aumento do salario: ");
        funcionario.aumentarSalario(sc.nextDouble());

        System.out.println("teste.Dados atualizados: " + funcionario);


        sc.close();


    }
}
