package listas3;

import java.util.*;

public class Treino {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> n = new ArrayList<Integer>();
        n.add(159);
        n.add(21);
        n.add(53);
        n.add(82);
        n.add(92);
        n.add(62);

        Collections.sort(n);

        for (Integer numero : n) {
            System.out.println(numero);
        }
        boolean x = true;
        while (x) {
            System.out.println(" --------MENU-------- ");
            System.out.println("1. Inserir Numeros");
            System.out.println("2. Remover Numeros");
            System.out.println("3. Buscar Numeros");
            System.out.println("4. Exibir Numeros");
            System.out.println("5. Somar todos os Numeros");
            System.out.println("6. Sair");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o numero a ser inserido: ");

                    n.add(sc.nextInt());
                    Collections.sort(n);

                    break;
                case 2:
                    System.out.println("Digite o numero a ser removido: ");
                    int removeNum = sc.nextInt();
                    if (n.remove(Integer.valueOf(removeNum))) {
                        Collections.sort(n);
                        System.out.println("Numero removido com sucesso!");
                    } else {
                        System.out.println("Numero nao encontrado na Lista");
                    }
                    break;
                case 3:
                    System.out.println("Digite o numero a ser buscado: ");
                    int numeroBuscado = sc.nextInt();
                    int posicaoBuscada = n.indexOf(numeroBuscado) + 1;
                    if (n.contains(numeroBuscado)) {
                        System.out.println("O numero " + numeroBuscado + " esta na lista na posição " + posicaoBuscada);
                    } else {
                        System.out.println("O numero " + numeroBuscado + " Não esta na lista!");
                    }
                    break;
                case 4:

                    for (Integer numero : n) {

                        System.out.println(numero);
                    }
                    break;
                case 5:
                   int soma = somar(n);
                    System.out.println("A soma dos números na lista é: " + soma);
                    break;
                case 6:
                    System.out.println("SAINDO..........");
                    x = false;
                    break;
                default:
                    System.out.println("⚠️ Opção inválida! Escolha um número entre 1 e 5.");
                    break;

            }


        }
        sc.close();
    }
    public static int somar(List<Integer> n) {
        int soma = 0;
        for (Integer numero : n) {
            soma += numero;
        }
        return soma;
    }

}

