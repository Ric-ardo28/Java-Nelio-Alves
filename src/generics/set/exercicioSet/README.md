# Explicação do Código

Este programa em **Java** lê um arquivo de log contendo registros de acessos de usuários, armazenando-os em um `Set<LogEntry>` para garantir que cada usuário seja contado apenas uma vez.

## 1. Importação de Pacotes
O programa utiliza pacotes para manipulação de arquivos, datas e coleções:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;
```

---

## 2. Estrutura Principal do Programa (`main`)

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter file full path: ");
String path = sc.nextLine();
```
- O **usuário informa o caminho do arquivo** a ser lido.
- O `Scanner` captura essa entrada.

---

## 3. Leitura do Arquivo e Processamento dos Registros

```java
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
    Set<LogEntry> set = new HashSet<>();
```
- O `try-with-resources` garante que o **arquivo será fechado automaticamente** após o uso.
- O `Set<LogEntry>` armazena as entradas **sem repetição**.

```java
String line = br.readLine();
while (line != null) {
```
- Lê o arquivo **linha por linha**.

```java
String[] fields = line.split(" ");
String username = fields[0];
Date moment = Date.from(Instant.parse(fields[1]));
```
- Separa o **nome do usuário** e o **timestamp**.
- Converte o timestamp (`ISO 8601`) em um objeto `Date`.

```java
set.add(new LogEntry(username, moment));
line = br.readLine();
```
- Cria e adiciona um objeto `LogEntry` ao `Set`.
- Como `HashSet` **não permite duplicatas**, usuários repetidos são descartados.

---

## 4. Exibição do Total de Usuários Únicos
```java
System.out.println("Total users: " + set.size());
```
- Exibe o **número total de usuários diferentes** no log.

---

## 5. Tratamento de Exceções
```java
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```
- Captura **possíveis erros de leitura** do arquivo.

```java
sc.close();
```
- Fecha o `Scanner` para evitar vazamento de recursos.

---

## 6. Classe `LogEntry`
A classe `LogEntry` deve implementar `hashCode()` e `equals()` para garantir que um usuário seja considerado único **pelo nome**.

```java
package generics.set.exercicioSet.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String username;
    private Date moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public Date getMoment() {
        return moment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LogEntry)) return false;
        LogEntry other = (LogEntry) obj;
        return username.equals(other.username);
    }
}
```

### **Explicação da `LogEntry`**
- `hashCode()` e `equals()` são sobrescritos para que o `Set` **diferencie apenas pelo `username`**, ignorando o timestamp.
- Isso garante que um usuário que acessou várias vezes **seja contado apenas uma vez**.

---

## 7. Exemplo de Entrada do Arquivo (`log.txt`)

```
alice 2024-03-30T10:15:30Z
bob 2024-03-30T10:18:45Z
alice 2024-03-30T10:20:10Z
carlos 2024-03-30T10:22:30Z
```

📌 **Saída esperada:**
```
Enter file full path:
(log.txt)
Total users: 3
```
- Os usuários únicos são **alice, bob e carlos**.


