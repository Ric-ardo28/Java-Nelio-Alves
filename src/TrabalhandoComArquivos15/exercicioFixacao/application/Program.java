package TrabalhandoComArquivos15.exercicioFixacao.application;

import TrabalhandoComArquivos15.exercicioFixacao.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US); // Define o padrão numérico para o formato dos EUA (ponto decimal ao invés de vírgula)
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>(); // Lista para armazenar os produtos lidos do arquivo

		System.out.println("Enter file path: "); // Solicita ao usuário o caminho do arquivo CSV
		String sourceFileStr = sc.nextLine(); // Lê o caminho digitado pelo usuário

		File sourceFile = new File(sourceFileStr); // Cria um objeto File representando o arquivo de entrada
		String sourceFolderStr = sourceFile.getParent(); // Obtém o diretório do arquivo de entrada

		// Cria a pasta "out" dentro do mesmo diretório do arquivo de entrada (caso ainda não exista)
		File outFolder = new File(sourceFolderStr + File.separator + "out");
		if (!outFolder.exists()) {
			outFolder.mkdir(); // Cria a pasta se ela não existir
		}

		// Define o caminho para o arquivo de saída "summary.csv"
		String targetFileStr = outFolder + File.separator + "summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { // Abre o arquivo para leitura

			String itemCsv = br.readLine(); // Lê a primeira linha do arquivo
			while (itemCsv != null) { // Continua lendo até o final do arquivo

				String[] fields = itemCsv.split(","); // Divide a linha pelos separadores de vírgula
				String name = fields[0]; // Nome do produto
				double price = Double.parseDouble(fields[1]); // Preço do produto
				int quantity = Integer.parseInt(fields[2]); // Quantidade do produto

				list.add(new Product(name, price, quantity)); // Adiciona o produto à lista

				itemCsv = br.readLine(); // Lê a próxima linha
			}

			// Agora, escreve os dados processados no novo arquivo "summary.csv"
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					// Escreve no arquivo o nome do produto e o valor total formatado com duas casas decimais
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine(); // Adiciona uma nova linha
				}

				System.out.println(targetFileStr + " CREATED!"); // Mensagem de sucesso

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage()); // Captura erro ao escrever no arquivo
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage()); // Captura erro ao ler o arquivo
		}

		sc.close(); // Fecha o scanner
	}
}

