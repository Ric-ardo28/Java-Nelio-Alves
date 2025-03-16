package manipulacaoString;

public class TesteString {

	public static String substituicaoString(String string, String oldString, String newString) {
		return string.replace(oldString, newString);
	}

	public static void main(String[] args) {

	String string = "pneumoultramicroscopicossilicovulcanoconiótico";
	String oldString = "u";
	String newString = "U";

		System.out.println(substituicaoString(string, oldString, newString));

		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'u') {
				System.out.println(ch[i]);
			}
		}
		System.out.println(ch.length);
	}
}
