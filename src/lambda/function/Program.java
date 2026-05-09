package lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));


        // Implementação da interface Function:
        // Aqui foi criada uma classe separada chamada ProdutoFunction.
        // Essa classe implementa Function<Produto, String>
        // e sobrescreve o método apply().
        //
        // Function<T, R> recebe um valor de entrada e retorna outro valor.
        // Nesse caso:
        // T = Produto
        // R = String
        //
        // Para cada produto da lista, o Java chama:
        // ProdutoFunction.apply(produto)
        //
        // O map() transforma cada Produto em uma String,
        // provavelmente o nome do produto em maiúsculo.
        //
        // O collect(Collectors.toList()) pega o resultado da stream
        // e transforma em uma lista.
        List<String> nomes = lista.stream()
                .map(new ProdutoFunction())
                .collect(Collectors.toList());


        // Reference method com método estático:
        // Coloca primeiro o nome da classe onde o método está,
        // depois :: e em seguida o nome do método static.
        //
        // Para cada produto da lista, o Java chama:
        // Produto.staticUpperCaseNome(produto)
        //
        // O método static recebe um Produto como parâmetro
        // e retorna uma String.
        List<String> nomes1 = lista.stream()
                .map(Produto::staticUpperCaseNome)
                .collect(Collectors.toList());


        // Reference method com método não estático:
        // Coloca primeiro o nome da classe Produto,
        // depois :: e em seguida o nome do método.
        //
        // Como o método não é static,
        // ele será chamado pelo próprio objeto da lista.
        //
        // Para cada produto da lista, o Java faz algo parecido com:
        // produto.upperCaseNome()
        //
        // Esse método retorna o nome do produto em maiúsculo.
        List<String> nomes2 = lista.stream()
                .map(Produto::upperCaseNome)
                .collect(Collectors.toList());


        // Expressão lambda declarada em variável:
        // Aqui criamos uma Function<Produto, String> chamada func.
        //
        // Produto é o tipo que entra.
        // String é o tipo que sai.
        //
        // Para cada produto, pegamos o nome e transformamos em maiúsculo.
        Function<Produto, String> func = produto -> produto.getNome().toUpperCase();

        // Aqui usamos a Function criada acima dentro do map().
        // O map() aplica essa função em cada produto da lista.
        List<String> nomes3 = lista.stream()
                .map(func)
                .collect(Collectors.toList());


        // Expressão lambda inline com toList():
        // Aqui a função é escrita diretamente dentro do map().
        //
        // Para cada produto da lista:
        // 1. pega o nome
        // 2. transforma em maiúsculo
        // 3. retorna uma String
        //
        // O toList() transforma o resultado da stream em uma lista.
        //
        // Detalhe importante:
        // O .toList() foi adicionado no Java 16.
        // Ele retorna uma lista não modificável.
        //
        // Ou seja, depois disso, se você tentar fazer:
        // nomes4.add("TECLADO");
        //
        // Pode gerar erro:
        // UnsupportedOperationException
        List<String> nomes4 = lista.stream()
                .map(produto -> produto.getNome().toUpperCase())
                .toList();


        // Expressão lambda inline com collect(Collectors.toList()):
        // Faz a mesma transformação do exemplo anterior.
        //
        // Diferença:
        // collect(Collectors.toList()) existe desde o Java 8.
        // Normalmente retorna uma lista modificável.
        //
        // Ou seja, depois disso, geralmente você pode fazer:
        // nomes5.add("TECLADO");
        List<String> nomes5 = lista.stream()
                .map(produto -> produto.getNome().toUpperCase())
                .collect(Collectors.toList());


        // Method reference com System.out.println:
        // Para cada nome da lista, o Java chama:
        // System.out.println(nome);
        //
        // Aqui estamos imprimindo apenas a lista "nomes",
        // que foi criada usando a classe ProdutoFunction.
        nomes.forEach(System.out::println);
    }
}