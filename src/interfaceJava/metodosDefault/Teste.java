package interfaceJava.metodosDefault;

public class Teste {
	public static void main(String[] args) {

		Cachorro cachorro  = new Cachorro();
		cachorro.somAnimal();// Saída: O animal faz um som.

		Gato gato = new Gato();
		gato.somAnimal();
		// Saida: O gato faz miau miau.
	}
}
/*  E se uma classe implementar duas interfaces com métodos default de mesmo nome?
Se duas interfaces tiverem métodos default com a mesma assinatura e uma classe implementar ambas,
 haverá um conflito, e a classe será obrigada a sobrescrever o método:
 */