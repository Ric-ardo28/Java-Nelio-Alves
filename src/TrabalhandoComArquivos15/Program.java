package TrabalhandoComArquivos15;

import java.io.*;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {

		// Criando um objeto File que representa o arquivo a ser lido.
		// O caminho do arquivo está definido como "c:\\temp\\in.txt.txt".
		// Atenção: O nome do arquivo contém ".txt.txt", verifique se isso é intencional.
		File arquivo = new File("c:\\temp\\in.txt.txt");

		// Bloco try-with-resources: garante que o recurso (BufferedReader) será fechado automaticamente ao final do bloco.
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

			// Lê a primeira linha do arquivo
			String linha = br.readLine();

			// Enquanto a linha não for nula (ou seja, enquanto não chegar ao final do arquivo)
			while (linha != null) {
				// Exibe a linha no console
				System.out.println(linha);

				// Lê a próxima linha do arquivo
				linha = br.readLine();
			}

		}
		// Captura possíveis exceções relacionadas à leitura do arquivo (por exemplo, arquivo não encontrado ou problemas de permissão).
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
