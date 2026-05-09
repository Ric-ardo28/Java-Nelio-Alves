package lambda.funcoes;

// Esta classe representa o modelo de um produto.
// Ela guarda os dados que cada produto deve ter: nome e preco.
public class Produto {
    // Atributos privados protegem os dados para que sejam acessados
    // por meio dos metodos get e set.
    private String nome;
    private double preco;

    // Construtor: usado quando criamos um novo Produto.
    // Exemplo: new Produto("Tv", 900.00)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Retorna o nome do produto.
    public String getNome() {
        return nome;
    }

    // Altera o nome do produto.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o preco do produto.
    public double getPreco() {
        return preco;
    }

    // Altera o preco do produto.
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Define como o produto sera convertido para texto.
    // Isso e usado, por exemplo, se voce imprimir um Produto com System.out.println.
    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preco);
    }
}
