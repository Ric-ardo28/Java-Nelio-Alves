package teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste001 {
	public static void main(String[] args) {
		List<Double> preco = new ArrayList<>();
		preco.add(1.0);
		preco.add(24.0);
		preco.add(5.0);
		preco.add(84.0);
		preco.add(49.0);
		preco.add(90.0);
		preco.add(120.0);
		preco.add(15.0);

		Collections.sort(preco);
		System.out.println(preco);
		Collections.reverse(preco);
		System.out.println(preco);




	}
}
