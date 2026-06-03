package lembrar;

public class Produto {
    String nome;
    String categoria;
    Double preco;
    Integer quantidade;

    public Produto(String nome, String categoria, Double preco, Integer quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto " +
                "nome = " + nome +
                ", categoria = " + categoria  + String.format(
                ", preco = %.2f", preco) +
                ", quantidade = " + quantidade;
    }
}
