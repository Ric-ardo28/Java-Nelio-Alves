package generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

		public static void main(String[] args) {
			// Criando o conjunto 'a' com alguns números inteiros
			Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));

			// Criando o conjunto 'b' com outros números inteiros
			Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

			// União dos conjuntos 'a' e 'b' (todos os elementos de ambos os conjuntos)
			Set<Integer> c = new TreeSet<>(a); // Criamos um novo conjunto 'c' baseado em 'a'
			c.addAll(b); // Adicionamos todos os elementos de 'b' em 'c'
			System.out.println(c); // Exibe o resultado da união

			// Interseção dos conjuntos 'a' e 'b' (elementos comuns aos dois conjuntos)
			Set<Integer> d = new TreeSet<>(a); // Criamos um novo conjunto 'd' baseado em 'a'
			d.retainAll(b); // Mantemos apenas os elementos que também estão em 'b'
			System.out.println(d); // Exibe o resultado da interseção

			// Diferença entre 'a' e 'b' (elementos que estão em 'a' mas não em 'b')
			Set<Integer> e = new TreeSet<>(a); // Criamos um novo conjunto 'e' baseado em 'a'
			e.removeAll(b); // Removemos todos os elementos que também estão em 'b'
			System.out.println(e); // Exibe o resultado da diferença
		}

}
