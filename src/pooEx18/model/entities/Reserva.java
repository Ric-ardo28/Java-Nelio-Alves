package pooEx18.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duracaoEmDias() {
		// converte milesegundos em dias
		long milisegundos = (checkOut.getTime() - checkIn.getTime());
		return TimeUnit.DAYS.convert(milisegundos, TimeUnit.MILLISECONDS);
		//(checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24);
	}
	public void atualizarData(Date checkIn, Date checkOut){
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public String toString(){
		return "Quarto "
				+ numeroQuarto
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", " + duracaoEmDias()
				+ " noites ";
	}


}
