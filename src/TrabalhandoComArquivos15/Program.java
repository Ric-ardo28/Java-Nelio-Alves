package TrabalhandoComArquivos15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args)  {

		File arquivo = new File("c:\\temp\\in.txt.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println(" Erro:  " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
