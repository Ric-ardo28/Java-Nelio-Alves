package pooEx2;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquid(){
        return salarioBruto - imposto;
    }
    public void aumentarSalario(double aumento){
        salarioBruto += salarioBruto * (aumento / 100);
    }

    @Override
    public String toString() {
        return  nome
                +" $ " + String.format("%.2f", salarioLiquid());

    }
}
