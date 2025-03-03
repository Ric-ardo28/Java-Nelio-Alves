package TrabalhandoComArquivos15;

import java.io.File;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do pasta: ");
		String strpasta = sc.nextLine();

		File pasta = new File(strpasta);

		File[] caminho = pasta.listFiles(File::isDirectory);

		System.out.println("Caminhos : ");

		for(File f : caminho){
			System.out.println(f);
		}

		File[] arquivos = pasta.listFiles(File::isFile);
		System.out.println("Arquivos : ");
		for(File f : arquivos){
			System.out.println(f);
		}

		boolean sucesso = new File(strpasta + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucesso);

		sc.close();
	}
}
