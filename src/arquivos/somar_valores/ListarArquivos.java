package arquivos.somar_valores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListarArquivos {
    static final String CAMINHO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores";

    public static void main(String[] args) throws IOException {
        Path path = Path.of(CAMINHO);

       try(Stream<Path> arquivos = Files.list(path)){
           arquivos.forEach(arquivo -> System.out.println(arquivo.getFileName()));
       }
    }
}
