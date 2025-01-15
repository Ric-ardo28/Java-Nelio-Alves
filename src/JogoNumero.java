import java.util.Random;
import java.util.Scanner;

public class JogoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100)+1;
        //int chute = 0;
        int tentativas = 0;
        System.out.println("Jogo do numero Secreto ");
        while (tentativas < 10) {
            System.out.println("Digite um numero de 0 a 100 ");
           int chute = sc.nextInt();
            tentativas++;
            if (chute == numero) {
                System.out.println("Parabens vc acertou o numero secreto que é : " + numero + " com " + tentativas + " tentativas");
                break;
            } else if (chute > numero) {
                System.out.println("Errou o numero secreto é menor que " + chute);

            } else {
                System.out.println("Errou o numero secreto é maior que " + chute);

            }

        }



    }
}
