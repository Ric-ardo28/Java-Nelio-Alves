package beecrowd;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tomada {
	public static String[] stringToArray(String s) {
		String[] partes = s.split(",");

		return partes;
	}

	public static void main(String[] args) {
		String nomes = "Ana, Bruno, Carla, Daniel, Elisa, Felipe, Gabriela, Henrique, Isabela, João, Karla, Lucas, Mariana, Nicolas, Olivia, Pedro, Quésia, Rafael, Sabrina, Thiago, Ursula, Vinícius, Wagner, Xênia, Yasmin, Zeca, Bianca, Caio, Diego, Eduarda";

		System.out.println(Arrays.toString(stringToArray(nomes)));
		System.out.printf("Total de nomes: %d\n", stringToArray(nomes).length);


	}

}