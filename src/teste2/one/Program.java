package teste2.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();

		for(int i = 0; i < 10; i++) {
			numeros.add(sc.nextInt());
			Collections.sort(numeros);

		}


		Numeros n = new Numeros(numeros);

		System.out.println(n);

	}
}
