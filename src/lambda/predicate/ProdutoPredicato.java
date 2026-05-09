package lambda.predicate;

import java.util.function.Predicate;

public class ProdutoPredicato implements Predicate<Produto> {


    @Override
    public boolean test(Produto produto) {
        return produto.getPreco() >= 100.00;
    }
}
