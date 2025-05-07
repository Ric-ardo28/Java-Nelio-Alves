package lambda.consumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProdutoConsumer implements Consumer<Produto> {


    @Override
    public void accept(Produto produto) {
        produto.setPreco(produto.getPreco() * 1.1);
    }
}
