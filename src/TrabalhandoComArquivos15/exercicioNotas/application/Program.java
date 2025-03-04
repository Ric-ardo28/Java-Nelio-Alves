package TrabalhandoComArquivos15.exercicioNotas.application;

import TrabalhandoComArquivos15.exercicioNotas.entities.Notas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Notas> listaNotas = new ArrayList<>();
		System.out.println("Digite o caminho para o boletin de notas: ");
		String caminhoBoletin = sc.nextLine();

		File caminho = new File(caminhoBoletin);
		String pastaOrigem = caminho.getParent();

		boolean sucesso = new File(pastaOrigem + "\\notas").mkdirs();
		String positivo = (sucesso == true) ? "Diretorio criado com sucesso" : "Erro ao criar o diretorio ";
		System.out.println(positivo);

		String arquivoDestino = pastaOrigem + "\\notas\\mediaNotas.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoBoletin))) {
			String notaCvs = br.readLine();
			while (notaCvs != null) {
				String[] notas = notaCvs.split(",");
				String nome = notas[0];
				Double nota1 = Double.parseDouble(notas[1]);
				Double nota2 = Double.parseDouble(notas[2]);
				Double nota3 = Double.parseDouble(notas[3]);
				Double nota4 = Double.parseDouble(notas[4]);
				Double nota5 = Double.parseDouble(notas[5]);

				listaNotas.add(new Notas(nome, nota1, nota2, nota3, nota4, nota5));

				notaCvs = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDestino))) {
				for (Notas nota : listaNotas) {
					double media = nota.calcularMedia();
					String status = (media >= 6.5)? "Aprovado" : "Reprovado";
					bw.write(nota.getNome() + ", " + String.format("%.2f,%s ", nota.calcularMedia(), status));
					bw.newLine();
				}
				System.out.println(arquivoDestino + " Arquivo criado com sucesso!");
			} catch (IOException e) {
				System.out.println("Erro ao gravar arquivo" + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Erro ao carregar arquivo" + e.getMessage());
		}

		sc.close();
	}
}
