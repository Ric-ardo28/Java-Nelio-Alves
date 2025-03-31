package generics.hashCode.application;

import generics.hashCode.entities.Cliente;

public class Program {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ricardo", "Ricardo@gmail.com");
		Cliente cliente2 = new Cliente("Ricardo", "Ricardo@gmail.com");

		System.out.println(cliente.hashCode());
		System.out.println(cliente2.hashCode());
		System.out.println(cliente.equals(cliente2));
		System.out.println(cliente == cliente2);

		int a = 1;
		int b = 1;

		System.out.println(a == b);
	}
}
