package arquivos.criando_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CriarArquivos {
    static final String CAMINHO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\criando_arquivos\\mensagem.txt";

    public static void main(String[] args) throws IOException {

        Path path = Path.of(CAMINHO);

        String texto = "Aprendendo manipulação de arquivos em Java\n" +
                "Esse é meu primeiro arquivo criado pelo programa";

        Files.writeString(path, texto);

        System.out.println("Arquivo criado com sucesso");

    }
}
