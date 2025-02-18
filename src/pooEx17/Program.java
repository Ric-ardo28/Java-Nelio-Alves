package pooEx17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		method1();
		System.out.println("Fim do Programa");

	}
	public static void method1(){
		System.out.println("****Method 1 inicio ****");
		method2();
		System.out.println("****Method 1 fim ****");

	}
	public static void method2(){
		System.out.println("****Method 2 Inicio ****");

		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR: Invalid position");
			e.printStackTrace();
			sc.next();

		}
		catch (InputMismatchException e){
			System.out.println("ERROR: Input invalide");

		}
		sc.close();
		System.out.println("****Method 2 Fim ****");
	}
}
