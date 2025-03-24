package excecoes;

public class Exc4 {
	public static <T> void imprimir(T valor){
		System.out.println(valor);
	}

	public static void main(String[] args) {
		imprimir(10);
		imprimir(10.0);
		imprimir("numero 10");
		imprimir("Hello ");


	}
}
