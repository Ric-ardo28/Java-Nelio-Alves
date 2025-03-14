package manipulacaoString.reverse;

public class InverterPalavras {

	public String inverterPalavras(String frase) {
		String[] palavras = frase.split(" ");

		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i].length() >= 5) {
				// Cria um objeto StringBuilder com a string atual em palavras[i],
				// inverte essa string usando o método reverse(),
				// e converte o resultado de volta para String antes de armazená-lo novamente no array.
				palavras[i] = new StringBuilder(palavras[i]).reverse().toString();

			}
		}
		return String.join(" ", palavras);
	}
}
