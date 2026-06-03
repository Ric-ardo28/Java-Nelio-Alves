package arquivos.somar_valores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SomarValores {

    public static double soma(List<String> linhas) {

        double total = 0d;

        for (String linha : linhas) {
            double valor = Double.parseDouble(linha);
            total += valor;

        }
        return total;
    }

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores\\valores.txt");

        if (Files.exists(path)) {

            System.out.println("Arquivo encontrado");

            List<String> linhas = Files.readAllLines(path);
            double total = soma(linhas);

            System.out.println("Total: " + total);
        } else {
            System.out.println("Arquivo não encontrado");
        }
    }

}
