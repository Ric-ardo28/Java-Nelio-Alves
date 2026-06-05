package arquivos.buscar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BuscarPorDescricao {
    static final String CAMINHO_EXTRATO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores\\extrato.txt";

    static void buscarPorDescricao(List<String> linhas, String descricaoBusca) {
        for (String linha : linhas) {
            String[] colunas = linha.split(",");
            String descricao = colunas[2];

            if (descricao.equalsIgnoreCase(descricaoBusca)) {
                System.out.println(linha);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Path path = Path.of(CAMINHO_EXTRATO);
        List<String> linhas = Files.readAllLines(path);


        buscarPorDescricao(linhas, "Tesco");

    }

}
