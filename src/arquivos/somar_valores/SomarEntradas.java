package arquivos.somar_valores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SomarEntradas {
    static final String CAMINHO_EXTRATO = "C:\\Users\\pirri\\Desktop\\estudos\\src\\arquivos\\somar_valores\\extrato.txt";
    static double somarEntradas(List<String> linhas){

        double total = 0d;
        for (String linha : linhas){
            String[] colunas = linha.split(",");
            double valor = Double.parseDouble(colunas[1]);

            if (valor > 0){
                total += valor;
            }

        }
        return total;

    }

    public static void main(String[] args) throws IOException {

        Path path = Path.of(CAMINHO_EXTRATO);
        List<String> linhas = Files.readAllLines(path);
        double somaPositiva = somarEntradas(linhas);

        System.out.println("Total de entradas: " + somaPositiva);

    }

}
