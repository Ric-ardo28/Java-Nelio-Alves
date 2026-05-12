package lambda.exercicios;

import java.util.function.Function;

public class Apply {
    public static void main(String[] args) {
        Produto produto = new Produto("Tv",3499.00);

        Function<Produto, Integer> letra = p -> p.getNome().length();
        Function<Produto, String> nome = p -> p.getNome();
        Function<Produto, Double> preco = p -> p.getPreco();

        String no = nome.apply(produto);
        Integer le = letra.apply(produto);
        Double pr = preco.apply(produto);

        System.out.println(no);
        System.out.println(le);
        System.out.println(pr);
    }
}
