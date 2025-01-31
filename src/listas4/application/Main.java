package listas4.application;

import listas4.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        int idFuncionario = 1;

        boolean x = true;

        while (x) {
            System.out.println("---------------MENU---------------");

            System.out.println("1. Adicionar Funcionario");
            System.out.println("2. Atualizar Funcionario");
            System.out.println("3. Deletar Funcionario");
            System.out.println("4. Exibir Funcionario");
            System.out.println("5. Aumento Salarial");
            System.out.println("6. Sair");

            switch (sc.nextInt()) {

                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do funcionario: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o cargo do funcionario: ");
                    String cargo = sc.nextLine();
                    System.out.println("Digite o salario do funcionario: ");
                    double salario = sc.nextDouble();
                    // System.out.println("Digite o ID do funcionario: ");


                    sc.nextLine();
                    Funcionario funcionario = new Funcionario(nome, cargo, salario, idFuncionario);
                    listaFuncionarios.add(funcionario);
                    System.out.println("Funcionario adicionado com sucesso!");
                    idFuncionario++;
                    break;

                case 2:
                    System.out.println("Digite o ID funcionario para atualizar informações: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();

                    Funcionario funcionarioAtualizado = listaFuncionarios.stream().filter(f -> f.getIdFuncionario() == idAtualizar).findFirst().orElse(null);
                    if (funcionarioAtualizado != null) {
                        System.out.println("Digite o novo cargo do funcionario: ");
                        String cargoAtualizado = sc.nextLine();
                        System.out.println("Digite o novo salario do funcionario: ");
                        double salarioAtualizado = sc.nextDouble();
                        sc.nextLine();
                        funcionarioAtualizado.setSalario(salarioAtualizado);
                        funcionarioAtualizado.setCargo(cargoAtualizado);

                        System.out.println("Funcionario atualizado com sucesso!");

                    } else {
                        System.out.println("Funcionario com ID " + idAtualizar + "não encontrado. ");
                    }
                    break;


                case 3:
                    System.out.println("Digite o ID do funcionario a ser deletado: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();

                    boolean removido = listaFuncionarios.removeIf(f -> f.getIdFuncionario() == idRemover);
                    if (removido) {
                        System.out.println("Funcionario removido com sucesso!");

                    } else {
                        System.out.println("Funcionario com ID " + idRemover + "não encontrado. ");
                    }
                    break;
                case 4:
                    System.out.println("Lista de Funcionarios: ");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionario cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o ID do funcionario a receber reajuste salarial: ");
                    int idReajuste = sc.nextInt();
                    sc.nextLine();

                    Funcionario funcionarioReajuste = listaFuncionarios.stream().filter(f -> f.getIdFuncionario() == idReajuste).findFirst().orElse(null);

                    if (funcionarioReajuste != null) {
                        System.out.println("Digite a porcentagem de reajuste salarial: % ");
                        double porcentagem = sc.nextDouble();

                        funcionarioReajuste.aumentarSalario(porcentagem);

                        System.out.println("Reajuste aplicado! Novo salário: " + funcionarioReajuste.getSalario());
                    } else {
                        System.out.println("Funcionario com ID " + idReajuste + " não encontrado.");
                    }
                    break;
                case 6:
                    x = false;
                    System.out.println("👋🏽 Saindo . . . . . . . ");
                    break;
                default:
                    System.out.println("Entrada invalida ");
                    break;

            }


        }

        sc.close();

    }
}

