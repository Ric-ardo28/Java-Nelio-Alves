package arquivos.leitura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Nomes {


    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\lerTodasAsLinhas\\nomes.txt");

        List<String> linhas = Files.readAllLines(path);

        linhas.forEach(System.out::println);

        System.out.println("Total de nomes: " + linhas.size());
    }
}