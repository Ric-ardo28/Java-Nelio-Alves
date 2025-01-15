package pooEx3;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notafilnal(){
        return nota1 + nota2 + nota3;
    }
    public double faltaPontos(){
        if(notafilnal() < 60.0){
            return 60.0 - notafilnal();
        }else{
            return 0.0;
        }
    }
}
