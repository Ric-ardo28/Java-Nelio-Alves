package listas4.entities;

public class Funcionario {
    private String nome;
    private String cargo;
    private Double salario;
    private Integer idFuncionario;

    public Funcionario(String nome, String cargo, Double salario, Integer idFuncionario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void aumentarSalario(double porc) {
        salario += salario * porc/100.0;
    }

    @Override
    public String toString() {
        return "Funcionario: \n" +
                "Nome: " + nome + "\n" +
                "Cargo: " + cargo + "\n" +
                "Salario: " + salario +"\n" +
                "Id: " + idFuncionario + "\n";

    }
}
