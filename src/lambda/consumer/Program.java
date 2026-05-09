package lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));


        // Implementação da interface Consumer:
        // Aqui foi criada uma classe separada chamada ProdutoConsumer.
        // Essa classe implementa Consumer<Produto> e sobrescreve o método accept().
        // Para cada produto da lista, o Java chama o método accept(produto).
        // Dentro desse método fica a regra que será aplicada em cada produto.
        lista.forEach(new ProdutoConsumer());


        // Reference method com método não estático:
        // Coloca primeiro o nome da classe Produto,
        // depois :: e em seguida o nome do método.
        // Como o método não é static, ele será chamado pelo próprio objeto da lista.
        // Para cada produto da lista, o Java faz algo parecido com:
        // produto.atualizarPreco();
        lista.forEach(Produto::atualizarPreco);


        // Reference method com método estático:
        // Coloca primeiro o nome da classe onde o método está,
        // depois :: e em seguida o nome do método static.
        // Para cada produto da lista, o Java chama:
        // Produto.atualizarPrecoStatico(produto);
        // O método static recebe o produto como parâmetro.
        lista.forEach(Produto::atualizarPrecoStatico);


        // Expressão lambda declarada em variável:
        // Aqui criamos um Consumer<Produto> chamado cons.
        // Consumer não retorna nada, apenas executa uma ação.
        // Nesse caso, para cada produto, aumenta o preço em 10%.
        Consumer<Produto> cons = produto ->
                produto.setPreco(produto.getPreco() * 1.1);

        // Para usar o Consumer declarado acima, seria assim:
        // lista.forEach(cons);


        // Expressão lambda inline:
        // Aqui a regra é escrita diretamente dentro do forEach.
        // Para cada produto da lista, pega o preço atual,
        // multiplica por 1.1 e salva novamente no produto.
        // Isso aumenta o preço em 10%.
        lista.forEach(produto -> produto.setPreco(produto.getPreco() * 1.1));


        // Method reference com System.out.println:
        // Para cada produto da lista, o Java chama:
        // System.out.println(produto);
        // Isso imprime cada produto no console.
        lista.forEach(System.out::println);
    }
}