package teste2;

import java.util.ArrayList;
import java.util.List;

public class Testando {
	public static void main(String[] args) {

		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;

		}
		for (int i = 0; i < numeros[25]-1; i++) {
			System.out.println(numeros[i]);
		}

	}

}
