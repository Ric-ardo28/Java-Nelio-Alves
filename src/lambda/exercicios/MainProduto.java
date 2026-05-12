package lambda.exercicios;

import java.util.ArrayList;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {
        //1. Criar uma lista com pelo menos 5 produtos
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.00));
        produtos.add(new Produto("Mouse", 50.00));
        produtos.add(new Produto("Tablet", 350.00));
        produtos.add(new Produto("HD Case", 80.00));
        produtos.add(new Produto("Monitor", 750.00));

        //2. Imprimir todos
        System.out.println("Lista original:");
        produtos.forEach(p -> System.out.println(p));

        //3. Remover produtos com preço menor que 100
        produtos.removeIf(p -> p.getPreco() < 100.0);

        //4. Aumentar em 10% os produtos restantes
        produtos.forEach(p -> p.setPreco(p.getPreco() * 1.1));

        //5. Ordenar por preço
        produtos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        //6. Imprimir a lista final
        System.out.println("Lista final:");
        produtos.forEach(p -> System.out.println(p));


        //produtos.forEach(System.out::println);


    }
}
