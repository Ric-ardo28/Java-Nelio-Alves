package exMatrizes;

public class Teste {
	public static void main(String[] args)  {
		Vetor vetor = new Vetor(5);

		try {
			vetor.adiciona("elemento1");
			vetor.adiciona("elemento2");
			vetor.adiciona("elemento3");
			vetor.adiciona("elemento4");
			vetor.adiciona("elemento5");
			vetor.adiciona("elemento5");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
