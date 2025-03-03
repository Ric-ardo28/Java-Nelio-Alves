package TrabalhandoComArquivos15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		String[] linhas = new String[]{"Bom dia", "Boa Tarde", "Boa Noite"};
		String arquivo = "C:\\temp\\out.txt";

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
