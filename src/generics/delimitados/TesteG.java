package generics.delimitados;

public class TesteG {
	public static void main(String[] args) {
		GenericTeste<Integer>lista = new GenericTeste<>();
		lista.add(5);
		lista.add(8);
		lista.add(204);
		lista.add(935);
		System.out.println(lista.maiorElemento());
	}
}
