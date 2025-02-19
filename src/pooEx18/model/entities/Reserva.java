package pooEx18.model.entities;

import pooEx18.model.exceptions.DomainExceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;

	// Formato de data para exibição
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		// Verifica se a data de check-out é maior que a de check-in
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions("Data do check-out deve ser maior que a data do check-in");
		}
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
		// Calcula a diferença entre as datas em milissegundos
		long milisegundos = checkOut.getTime() - checkIn.getTime();
		// Converte de milissegundos para dias
		return TimeUnit.DAYS.convert(milisegundos, TimeUnit.MILLISECONDS);
		// Alternativa: (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24);
	}

	public void atualizarData(Date checkIn, Date checkOut) {
		Date dataAtual = new Date(); // Obtém a data do momento da execução

		// Verifica se as novas datas são anteriores à data atual
		if (checkIn.before(dataAtual) || checkOut.before(dataAtual)) {
			throw new DomainExceptions("Erro na reserva: Data deve ser maior que a data atual");
		}

		// Verifica se o check-out é posterior ao check-in
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions("Data do check-out deve ser maior que a data do check-in");
		}

		// Atualiza as datas se todas as validações forem passadas
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Quarto " + numeroQuarto + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duracaoEmDias() + " noites";
	}
}

/**
 * EXPLICAÇÃO DAS EXCEÇÕES:
 *
 * 1. No construtor:
 *    - Se a data de check-out não for posterior ao check-in, lançamos uma `DomainExceptions`.
 *    - Isso impede que uma reserva seja criada com datas inválidas.
 *
 * 2. No método `atualizarData`:
 *    - Se qualquer uma das datas fornecidas for anterior à data atual, lançamos uma `DomainExceptions`.
 *    - Isso evita que a reserva seja alterada para uma data passada.
 *    - Se a data de check-out não for posterior ao check-in, novamente lançamos uma `DomainExceptions`.
 *
 * 3. Uso da `DomainExceptions`:
 *    - Criamos uma exceção personalizada para diferenciar os erros relacionados à lógica de domínio da aplicação.
 *    - Isso melhora a clareza e a manutenção do código, pois erros específicos podem ser tratados de forma adequada.
 */
