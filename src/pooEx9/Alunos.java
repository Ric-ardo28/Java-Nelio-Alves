package pooEx9;

public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;

    public Alunos(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
    @Override
    public String toString() {
        return  nome + "\n"+
                nota1 + "\n"+
                nota2;
    }
}
