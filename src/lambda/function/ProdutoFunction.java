package lambda.function;

import java.util.function.Function;

public class ProdutoFunction implements Function<Produto, String> {


    @Override
    public String apply(Produto produto) {
        return produto.getNome().toUpperCase();
    }
}
