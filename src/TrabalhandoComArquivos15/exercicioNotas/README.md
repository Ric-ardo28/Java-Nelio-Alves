# ✅ Sistema de Cálculo de Média de Notas

Este projeto em **Java** permite a leitura de um arquivo CSV contendo as notas dos alunos, realiza o **cálculo da média** e gera um novo arquivo informando se cada aluno foi **Aprovado** ou **Reprovado**.

## 📚 Descrição do Projeto
O programa segue os seguintes passos:
1. **Solicita ao usuário o caminho do arquivo CSV** contendo os nomes e notas dos alunos.
2. **Lê o arquivo** e armazena as informações em uma lista.
3. **Calcula a média de cada aluno** e determina o status (**Aprovado** ou **Reprovado**).
4. **Cria um diretório `notas/` e salva um novo arquivo CSV** com os resultados.

## 📑 Formato do Arquivo de Entrada (CSV)
O arquivo de entrada deve ser um CSV contendo:
- O nome do aluno na primeira coluna
- 5 notas separadas por vírgula `,`

### **Exemplo de Entrada (`boletim.csv`)**:
```csv
João,7.5,8.0,6.0,9.0,7.0
Maria,5.0,6.0,5.5,4.0,6.5
Carlos,8.0,7.5,9.0,8.5,8.0
```

## 🔧 Como Executar o Programa
1. **Compilar o programa**:
```sh
javac -d . src/Program.java
```
2. **Executar**:
```sh
java Program
```
3. **Inserir o caminho do arquivo CSV** quando solicitado.

## 📈 Saída Gerada (`mediaNotas.csv`)
Após a execução, o programa gerará um arquivo `mediaNotas.csv` dentro da pasta `notas/` com o seguinte formato:

```csv
João, 7.50, Aprovado
Maria, 5.40, Reprovado
Carlos, 8.20, Aprovado
```

## 🚀 Melhorias Futuras
- Adicionar **validação** para garantir que as notas estão no intervalo de 0 a 10.
- Permitir ao usuário **escolher o nome do arquivo de saída**.
- Adicionar um **cabeçalho** ao arquivo de saída para facilitar a leitura.
- Implementar uma **interface gráfica (GUI)** para selecionar arquivos de forma mais intuitiva.

---
### 👌 Feito por Ricardo

