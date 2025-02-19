package pooEx18.application;

import pooEx18.model.entities.Reserva;
import pooEx18.model.exceptions.DomainExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato esperado para entrada de datas

		try {
			// Solicita e lê os dados iniciais da reserva
			System.out.print("Número do quarto: ");
			int numero = sc.nextInt();

			System.out.print("Data do check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());

			System.out.print("Data do check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			// Criação do objeto Reserva - pode lançar exceção se as datas forem inválidas
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva criada: " + reserva);

			System.out.println();
			System.out.println("Entre com novas datas para atualização da reserva: ");

			// Solicita e lê as novas datas da reserva
			System.out.print("Nova data do check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());

			System.out.print("Nova data do check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			// Atualização da reserva - pode lançar exceções se as datas forem inválidas
			reserva.atualizarData(checkIn, checkOut);
			System.out.println("Reserva atualizada: " + reserva);
		}
		catch (ParseException e) {
			// Captura erros de conversão de string para data
			System.out.println("Erro: Data inválida. Certifique-se de inserir no formato correto (dd/MM/yyyy).");
		}
		catch (DomainExceptions e) {
			// Captura exceções de domínio geradas pela lógica da aplicação
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			// Captura quaisquer erros inesperados
			System.out.println("Erro inesperado. Verifique os dados informados.");
		}

		sc.close(); // Fecha o scanner para evitar vazamento de recursos
	}
}

/**
 * EXPLICAÇÃO DO TRATAMENTO DE EXCEÇÕES:
 *
 * 1. `ParseException`:
 *    - Lançada quando a conversão de string para `Date` falha.
 *    - Isso pode ocorrer se o usuário digitar uma data fora do formato esperado (dd/MM/yyyy).
 *
 * 2. `DomainExceptions`:
 *    - Lançada dentro da classe `Reserva` quando as regras de negócio não são atendidas.
 *    - Exemplos: Check-out antes do check-in, datas no passado.
 *
 * 3. `RuntimeException`:
 *    - Captura qualquer outra exceção inesperada para evitar que o programa quebre abruptamente.
 *
 * USO DO TRY-CATCH:
 * - Permite tratar os erros de forma adequada, fornecendo mensagens mais compreensíveis para o usuário.
 * - Evita que o programa encerre inesperadamente caso ocorra um erro.
 */
