package lambda.funcoes;

import java.util.List;
import java.util.function.Predicate;

//Funções que recebe funções como parâmetro

public class ProdutoService {
    // Este metodo soma os precos dos produtos que passam em um criterio.
    //
    // List<Produto> list:
    // lista de produtos que sera percorrida.
    //
    // Predicate<Produto> criterio:
    // uma regra que recebe um Produto e devolve true ou false.
    // Se devolver true, o produto entra na soma.
    // Se devolver false, o produto e ignorado.
    public double filtroSoma(List<Produto> list, Predicate<Produto> criterio){
        // Variavel acumuladora: guarda o total da soma.
        double soma = 0;

        // Percorre todos os produtos da lista.
        for (Produto produto : list){
            // criterio.test(produto) executa a regra recebida por parametro.
            // No Program, a regra verifica se o nome do produto comeca com 'T'.
            if(criterio.test(produto)){
                // Se o produto passou no filtro, seu preco e somado ao total.
                soma += produto.getPreco();
            }
        }

        // Retorna a soma final dos produtos aprovados pelo criterio.
        return soma;
    }
}
