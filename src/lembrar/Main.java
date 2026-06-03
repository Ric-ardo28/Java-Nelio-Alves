package lembrar;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("S24 FE", "Celular", 3000.00, 9));
        produtos.add(new Produto("Notebook Dell", "Informática", 4200.00, 5));
        produtos.add(new Produto("Mouse Logitech", "Informática", 120.00, 15));
        produtos.add(new Produto("Teclado Mecânico", "Informática", 250.00, 8));
        produtos.add(new Produto("Monitor LG 24", "Informática", 900.00, 4));
        produtos.add(new Produto("Smart TV Samsung", "Eletrônicos", 2800.00, 3));
        produtos.add(new Produto("Fone Bluetooth", "Eletrônicos", 180.00, 12));
        produtos.add(new Produto("Cadeira Gamer", "Móveis", 950.00, 2));
        produtos.add(new Produto("Mesa Escritório", "Móveis", 650.00, 6));
        produtos.add(new Produto("Caneta Azul", "Papelaria", 3.50, 50));

        //produtos.forEach(System.out::println);
        //produtos.forEach(produto -> System.out.println(produto.getNome()));
        //produtos.forEach(produto -> System.out.println(produto.getNome() + " custa R$ " + produto.getPreco()));

        //List<Produto> newList = produtos.stream().filter(p -> p.getPreco() > 100).toList();
        //List<Produto> newList3 = produtos.stream().filter(p -> p.getQuantidade() < 5).toList();
        //List<Produto> newList4 = produtos.stream().filter(p -> p.getNome().startsWith("M")).toList();
        //List<Produto> newList2 = produtos.stream().filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos")).toList();

        //List<String> nomes = produtos.stream().map(Produto::getNome).toList();
        //List<Double> precos = produtos.stream().map(Produto::getPreco).toList();
        //List<String> mensagens = produtos.stream().map(p -> p.getNome() + " - R$" + String.format("%.2f", p.getPreco())).toList();
        //List<String> maiuscula = produtos.stream().map(p -> p.getNome().toUpperCase()).toList();

        //produtos.removeIf(p -> p.getPreco() < 50.00);
        //produtos.removeIf(p -> p.getQuantidade() == 0);
        //produtos.removeIf(p -> p.getCategoria().equals("Papelaria"));

        //produtos.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        //produtos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
        //produtos.sort((p1, p2) -> p2.getPreco().compareTo(p1.getPreco()));
        //produtos.sort((p1, p2) -> p1.getQuantidade().compareTo(p2.getQuantidade()));
        //produtos.sort(Comparator.comparing(Produto::getPreco));
        // produtos.sort(Comparator.comparing(Produto::getPreco).reversed());

        //Double soma = produtos.stream().map(Produto::getPreco).reduce(0.0, Double::sum);
        //Double soma2 = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (a, b) -> Double.sum(a, b));
        //Double soma3 = produtos.stream().map(p -> p.getPreco() * p.getQuantidade()).reduce(0.0, Double::sum);
        //Double soma3 = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (a, b) -> Double.max(a,b));
        //Double max = produtos.stream().map(p -> p.getPreco()).reduce(0.0, Double::max);
        //String juntar = produtos.stream().map(Produto::getNome).reduce((a, b) -> a + "," + b).orElse("");
        String juntar2 = produtos.stream().map(Produto::getNome).collect(Collectors.joining(", "));


        System.out.println(juntar2);

        produtos.forEach(System.out::println);

    }
}
