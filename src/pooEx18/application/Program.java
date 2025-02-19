package pooEx18.application;

import pooEx18.model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("numero do quarto: ");
		int numero = sc.nextInt();
		System.out.println("data do check-in: (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("data do check-out: (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if(!checkOut.after(checkIn)){
			System.out.println("Erro na reserva: Data do check-out deve ser maior que a data do check-in");
		}else{
			Reserva reserva = new Reserva(numero, checkIn, checkOut);


			System.out.println();
			System.out.println("Entre com a data para atualização da reserva: ");
			System.out.println("data do check-in: (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("data do check-out: (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());

			Date dataAtual = new Date();
			if(checkIn.before(dataAtual)||checkOut.before(dataAtual)){
				System.out.println("Erro na reserva: Data deve ser maior que a data atual");

			}
			else if(checkOut.after(checkIn)){
				System.out.println("Data do check-out deve ser maior que a data do check-in");
			}
			else {
				reserva.atualizarData(checkIn, checkOut);
				System.out.println("Reserva " + reserva);
			}
		}
	}
}
