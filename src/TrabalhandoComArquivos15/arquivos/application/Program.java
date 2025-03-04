package TrabalhandoComArquivos15.arquivos.application;

import TrabalhandoComArquivos15.arquivos.entities.Produtos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Criei uma lista de produtos
		List<Produtos> listaProdutos = new ArrayList<>();

		//Peço o caminho do arquivo para leitura e armazeno em uma variavel
		System.out.println("Entre com o caminho do Arquivo: ");
		String caminhgArquivo = sc.nextLine();

		//cria um objeto file com o caminho digitado pelo usuário com a variavel 'caminhoArquivo'
		File caminho = new File(caminhgArquivo);
		//Obtém o diretório do arquivo de entrada desconsiderando os arquivos
		String pastaOrigem = caminho.getParent();


		//cria o diretorio e retorna true se for criado com sucesso e armazena na variavel sucesso
		boolean sucesso = new File(pastaOrigem + "\\out").mkdir();

		//concatena o caminho digitado pelo usuario com o novo diretorio e o novo arquivo
		String arquivoDestino = pastaOrigem + "\\out\\resulmo.csv";

		//O BufferedReader é usado para ler arquivos, enquanto o BufferedWriter é usado para escrever em arquivos

		//tenta ler o arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(caminhgArquivo))) {
			//ele le a linha do arquivo e armazena na variavel itemCsv
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				// pega os valores de cada linha e divide considerando as virgulas e armazena em um array
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);

				listaProdutos.add(new Produtos(nome, preco, quantidade));

				itemCsv = br.readLine();

			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {
				for (Produtos item : listaProdutos) {
					bw.write(item.getNome() + ","  + String.format("%.2f", item.total()));
					bw.newLine();

				}
				System.out.println(arquivoDestino + "arquivo criado com sucesso!");

			}catch (IOException e) {
				System.out.println("Erro ao gravar arquivo" + e.getMessage());
			}



		} catch (IOException e) {
			System.out.println("Erro ao carregar arquivo" + e.getMessage());
		}


		sc.close();
	}
}
