package listas2.application;

import listas2.entities.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.println("Quantidade de pessoas quer que cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.println("Digite o nome do pessoa: ");
            String nome = sc.next();
            System.out.println("Digite o cpf: ");
            String cpf = sc.next();
            System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
            String dataString = sc.next();
            LocalDate dataNascimento = LocalDate.parse(dataString, formatter);

            list.<Pessoa>add(new Pessoa(nome, cpf, dataNascimento));
            Pessoa pessoa = new Pessoa(nome, cpf, dataNascimento);
            list.add(pessoa);
            sc.nextLine();
        }
        for (Pessoa p : list) {
            System.out.println(p);
        }
        while (true){

        }

    }
}
