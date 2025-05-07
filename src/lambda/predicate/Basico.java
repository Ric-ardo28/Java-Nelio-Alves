package lambda.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Basico {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));


        // Referência para método estático:
        // coloca primeiro o nome da classe onde o método está,
        // depois :: e em seguida o nome do método.
        // Para cada produto da lista, o Java chama Produto.predicatoStatico(produto).
        // Se retornar true, o produto é removido.

        // 1. Implementação da interface Predicate
        // Remove os produtos conforme a regra definida na classe ProdutoPredicato
        lista.removeIf(new ProdutoPredicato());

        // 2. Method reference com método estático
        // Equivale a: produto -> Produto.predicatoStatico(produto)
        lista.removeIf(Produto::predicatoStatico);

        // 3. Method reference com método não estático
        // Equivale a: produto -> produto.predicatoNaoStatico()
        lista.removeIf(Produto::predicatoNaoStatico);

        // 4. Expressão, lambda declarado
        Predicate<Produto> pred = produto -> produto.getPreco() >= 100.1;

        // 5. Expressão, lambda inline
        double max = 300.00;
        lista.removeIf(produto -> produto.getPreco() >= max);

        for(Produto produto : lista) {
            System.out.println(produto);
        }

    }
}
