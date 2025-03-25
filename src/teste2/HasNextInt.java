import java.util.Scanner;

public static void main(String[] args) {


	Scanner sc = new Scanner(System.in); // Cria um Scanner para ler entrada do usuário
	int num; // Variável que armazenará o número inteiro digitado

	// Loop infinito para garantir que o usuário digite um número inteiro válido
	while (true) {
		System.out.print("Digite um número inteiro: "); // Solicita um número inteiro ao usuário

		// Verifica se o próximo valor digitado pode ser convertido para um número inteiro
		if (sc.hasNextInt()) {
			num = sc.nextInt(); // Se for um número inteiro, lê e armazena o valor
			break; // Sai do loop, pois já obteve um número válido
		} else {
			System.out.println("Entrada inválida. Digite um número inteiro.");
			sc.next(); // Descarta a entrada inválida para evitar um loop infinito
		}
	}

	// Exibe o número inteiro digitado pelo usuário
	System.out.println("Número inteiro digitado: " + num);

	sc.close(); // Fecha o Scanner para liberar recursos do sistema (boa prática)
}

