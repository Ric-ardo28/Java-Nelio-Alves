package TrabalhandoComArquivos15;

import java.io.File;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("insira um caminho de arquivo: ");
		String strarquivo = sc.nextLine();

		File arquivo = new File(strarquivo);

		System.out.println("getName: " + arquivo.getName());
		System.out.println("getParent: " + arquivo.getParent());
		System.out.println("getPath: " + arquivo.getPath());


		sc.close();

	}
}
