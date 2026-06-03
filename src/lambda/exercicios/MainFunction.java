package lambda.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainFunction {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Tv", 900.00));
        produtos.add(new Produto("Mouse", 50.00));
        produtos.add(new Produto("Tablet", 350.00));
        produtos.add(new Produto("HD Case", 80.00));
        produtos.add(new Produto("Monitor", 750.00));

      // List<String> nomes1 = produtos.stream().map(p -> p.getNome()).toList();
       //List<String> nomes2 = produtos.stream().map(p -> p.getNome()).collect(Collectors.toList());
       //List<String> nomes3 = produtos.stream().map(Produto::getNome).toList();

       // produtos.stream().filter(p -> p.getPreco() <= 100.0).map(p -> p.getNome()).forEach(System.out::println);

        //List<String> nomes = produtos.stream().filter(p -> p.getPreco() < 500.0).map(p -> p.getNome()).collect(Collectors.toList());
        //List<String> nomes5 = produtos.stream().filter(p -> p.getPreco() < 500.0).map(Produto::getNome).toList();

        Double total = produtos.stream().map(p-> p.getPreco()).reduce(0.0, Double::sum);


        System.out.println(total);


    }
}