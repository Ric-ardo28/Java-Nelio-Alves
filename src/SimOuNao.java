import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SimOuNao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

       
        while (true) {
            int a = 0;
            int numero = rand.nextInt(100)+1;
            System.out.println("Sim ou nao ");
            a = sc.nextInt();
            if(a == 1) {
                if (numero % 2 == 0) {
                    System.out.println("Sim");
                } else {
                    System.out.println("Nao");
                }
            } else if (a == 2) {
                break;

            }

        }
        }
}
