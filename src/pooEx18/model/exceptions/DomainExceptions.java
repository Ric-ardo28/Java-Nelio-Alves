package pooEx18.model.exceptions;

/**
 * Exceção personalizada para erros relacionados à lógica de domínio da aplicação.
 * Extende RuntimeException para ser uma exceção não verificada (unchecked exception),
 * o que significa que seu tratamento é opcional e pode ser capturado em tempo de execução.
 */
public class DomainExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L; // Boa prática para serialização

	/**
	 * Construtor que recebe uma mensagem de erro e a repassa para a superclasse.
	 * @param message Mensagem descritiva da exceção.
	 */
	public DomainExceptions(String message) {
		super(message);
	}
}
