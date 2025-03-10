package interfaceJava.metodosDefault;

public interface Animal {
	default void somAnimal() {
		System.out.println("O animal faz som !!!! ");
	}
}
