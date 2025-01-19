package pooEx9;

import java.util.Locale;
import java.util.Scanner;

public class MainAltura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        AlturaMedia[] alt = new AlturaMedia[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "º pessoa: ");
            double altura = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "º pessoa: ");
            char genero = sc.next().charAt(0);

            alt[i] = new AlturaMedia(altura, genero );
        }

        double menorAltura = alt[0].getAltura();
        double maiorAltura = alt[0].getAltura();

        for (int i = 1; i < n; i++) {
            if (alt[i].getAltura() > maiorAltura){
                 maiorAltura = alt[i].getAltura();
                 }
            if(alt[i].getAltura() < menorAltura){
                menorAltura = alt[i].getAltura();
            }
        }
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double alturasFemTorales = 0;
        for (int i = 0; i < n; i++) {
            if (alt[i].getGenero() == 'm'){
                qtdHomens++;
            }else{
                qtdMulheres++;
                alturasFemTorales += alt[i].getAltura();
            }
        }
        double alturaMedia = alturasFemTorales/qtdMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMedia);
        System.out.printf("Numero de homens = %d\n", qtdHomens);

        sc.close();
    }
}
