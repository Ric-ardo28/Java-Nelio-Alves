package pooEx1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Medidas do retangulo Largura e Altura");
        Retangulo retangulo = new Retangulo();

        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();


        System.out.println("Area = " + retangulo.area());
        System.out.println("Perimetro = " + retangulo.perimetro());
        System.out.println("Diagonal = " + retangulo.diagonal());


    }
}
