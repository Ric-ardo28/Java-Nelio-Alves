package pooEx10;

import java.util.Locale;
import java.util.Scanner;

public class EstudosLivro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero= sc.nextInt();

        switch(numero){
            case 1:
                System.out.println("Ricardo");
                break;
                case 2:
                    System.out.println("Patricia");
                    break;
                    case 3:
                        System.out.println("Julio");

                        case 4:
                            System.out.println("Mario");
                            break;
            default:

                System.out.println("Erro");

        }

        }
    }

