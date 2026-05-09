package lambda.funcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        // Criamos uma lista para armazenar varios objetos do tipo Produto.
        List<Produto> lista = new ArrayList<>();

        // Cada Produto recebe um nome e um preco.
        lista.add(new Produto("Tv", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));

        // O ProdutoService contem a logica que percorre a lista,
        // filtra os produtos e soma os precos dos produtos aprovados.
        ProdutoService produtoService = new ProdutoService();

        // Aqui passamos uma expressao lambda como criterio de filtro.
        // Predicate<Produto> significa: recebe um Produto e retorna true ou false.
        //
        // produto -> produto.getNome().charAt(0) == 'T'
        // Leitura:
        // "Para cada produto, pegue o nome e verifique se a primeira letra e 'T'".
        //
        // Assim, entram na soma apenas produtos cujo nome comeca com T:
        // "Tv" e "Tablet".
        double soma = produtoService.filtroSoma(lista, produto -> produto.getNome().charAt(0) == 'T');

        // Exibe a soma formatada com duas casas decimais.
        System.out.println("soma = " + String.format("%.2f", soma));

    }
}
