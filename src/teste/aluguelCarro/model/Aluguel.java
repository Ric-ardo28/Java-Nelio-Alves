package teste.aluguelCarro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Locale;

public class Aluguel {
	private Carro carro;
	private Cliente cliente;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Aluguel(Carro carro, Cliente cliente, LocalDate dataInicio, LocalDate dataFim) {
		this.carro = carro;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;

	}

	public void calcularValor() {
		long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
		double total = dias * carro.getPreco();
		System.out.println("Valor total pelas diarias: " + total);
	}
	public void imprimirInformacoes() {
		System.out.println(carro);
		System.out.println(cliente);
	}
}
