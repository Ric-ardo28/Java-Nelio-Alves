package lambda.predicate;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static boolean predicatoStatico(Produto p) {
        return p.getPreco() >= 100.00;

    }

    public boolean predicatoNaoStatico() {
        return preco >= 100.00;
    }


    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preco);
    }
}
