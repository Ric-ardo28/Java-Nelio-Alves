package arquivos.somar_valores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SomarColunas {
    static final String CAMINHO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores\\extrato.txt";

    static double soma(List<String> linhas) {
        double total = 0d;

        for (String linha : linhas) {
            String[] colunas = linha.split(",");
            double valor = Double.parseDouble(colunas[1]);
            total += valor;
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        Path path = Path.of(CAMINHO);

        List<String> linhas = Files.readAllLines(path);

        double total = soma(linhas);


        System.out.println("Total das transações: " + total);
    }
}
