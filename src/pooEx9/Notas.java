package pooEx9;

import pooEx3.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qantos alunos serão digitados? ");
        int n = sc.nextInt();

        Alunos[] alunos = new Alunos[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            alunos[i] = new Alunos(nome, nota1, nota2);

        }

        double resultado;
        System.out.println("Alunos aprovados");
        for (int i = 0; i < n; i++) {
        resultado = (alunos[i].getNota1() + alunos[i].getNota2()) /2;
        if (resultado >= 6.0) {
            System.out.println(alunos[i].getNome());
        }
        }

    }
}
