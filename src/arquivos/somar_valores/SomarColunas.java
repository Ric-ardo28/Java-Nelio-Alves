package arquivos.somar_valores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SomarColunas {
    static final String CAMINHO_EXTRATO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores\\extrato.txt";
    static final String CAMINHO_RELATORIO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores\\relatorio.txt";


    static double somaDoMes(List<String> linhas, Month mes) {
        double total = 0d;
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (String linha : linhas) {
            String[] colunas = linha.split(",");
            LocalDate data = LocalDate.parse(colunas[0], FORMATTER);



            if (data.getMonth() == mes) {
                double valor = Double.parseDouble(colunas[1]);
                total += valor;
            }
        }

        return total;
    }

    static int contarTransacoes(List<String> linhas) {
        return linhas.size();
    }

    public static void main(String[] args) throws IOException {

        Path pathExtrato = Path.of(CAMINHO_EXTRATO);
        List<String> linhas = Files.readAllLines(pathExtrato);
        Month mes = Month.JANUARY;

        double total = somaDoMes(linhas, mes);
        int quantidade = contarTransacoes(linhas);

        System.out.println("Total das transações de " + mes + ": " + total);
        System.out.println("Total de transações: " + quantidade);

        String texto = "Relatório de transações\n" +
                "Mês analisado: " + mes + "\n" +
                "Total das transações: " + total;

        Path pathRelatorio = Path.of(CAMINHO_RELATORIO);

        Files.writeString(pathRelatorio, texto);

        System.out.println("Relatório criado com sucesso!");


    }
}
