package TrabalhandoComArquivos15.exercicioNotas.application;

import TrabalhandoComArquivos15.exercicioNotas.entities.Notas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Define o padrão de localidade para usar o ponto como separador decimal (importante para exibir as notas corretamente)
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para leitura de dados do usuário
		Scanner sc = new Scanner(System.in);

		// Cria uma lista para armazenar objetos Notas
		List<Notas> listaNotas = new ArrayList<>();

		// Solicita ao usuário que insira o caminho para o boletim de notas
		System.out.println("Digite o caminho para o boletin de notas: ");
		String caminhoBoletin = sc.nextLine();

		// Cria um objeto File para representar o caminho do arquivo fornecido
		File caminho = new File(caminhoBoletin);
		// Obtém o caminho da pasta onde o arquivo de boletim está localizado
		String pastaOrigem = caminho.getParent();

		// Tenta criar um diretório "notas" na mesma pasta do boletim
		boolean sucesso = new File(pastaOrigem + "\\notas").mkdirs();
		// Mensagem de sucesso ou erro ao tentar criar o diretório
		String positivo = (sucesso == true) ? "Diretorio criado com sucesso" : "Erro ao criar o diretorio ";
		System.out.println(positivo);

		// Define o caminho para o arquivo de destino onde as médias serão salvas
		String arquivoDestino = pastaOrigem + "\\notas\\mediaNotas.csv";

		// Tenta abrir o arquivo de boletim para leitura
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoBoletin))) {
			// Lê a primeira linha do arquivo (geralmente contém os dados dos alunos)
			String notaCvs = br.readLine();

			// Enquanto houver dados no arquivo, processa cada linha
			while (notaCvs != null) {
				// Divide a linha em um array de strings com base na vírgula (dados separados por vírgula)
				String[] notas = notaCvs.split(",");

				// Atribui os valores lidos para variáveis específicas
				String nome = notas[0];  // Nome do aluno
				Double nota1 = Double.parseDouble(notas[1]);
				Double nota2 = Double.parseDouble(notas[2]);
				Double nota3 = Double.parseDouble(notas[3]);
				Double nota4 = Double.parseDouble(notas[4]);
				Double nota5 = Double.parseDouble(notas[5]);

				// Cria um novo objeto Notas e o adiciona à lista de notas
				listaNotas.add(new Notas(nome, nota1, nota2, nota3, nota4, nota5));

				// Lê a próxima linha do arquivo
				notaCvs = br.readLine();
			}

			// Tenta criar e gravar no arquivo de destino (média das notas dos alunos)
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {
				// Para cada objeto Notas na lista, calcula a média e grava no arquivo
				for (Notas nota : listaNotas) {
					// Calcula a média das notas
					double media = nota.calcularMedia();
					// Define o status do aluno com base na média (Aprovado ou Reprovado)
					String status = (media >= 6.5) ? "Aprovado" : "Reprovado";

					// Escreve as informações do aluno (nome, média e status) no arquivo
					bw.write(nota.getNome() + ", " + String.format("%.2f,%s ", nota.calcularMedia(), status));
					bw.newLine();
				}
				// Mensagem de sucesso ao gravar o arquivo
				System.out.println(arquivoDestino + " Arquivo criado com sucesso!");
			} catch (IOException e) {
				// Se ocorrer um erro ao gravar o arquivo, exibe a mensagem de erro
				System.out.println("Erro ao gravar arquivo" + e.getMessage());
			}
		} catch (IOException e) {
			// Se ocorrer um erro ao ler o arquivo de boletim, exibe a mensagem de erro
			System.out.println("Erro ao carregar arquivo" + e.getMessage());
		}

		// Fecha o objeto Scanner
		sc.close();
	}
}
