package TrabalhandoComArquivos15;

import java.io.*;
import java.util.Scanner;

public class Program {
	public static void main(String[] args)  {

		File arquivo = new File("c:\\temp\\in.txt.txt");

		try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(" Erro:  " + e.getMessage());
		}

	}
}
