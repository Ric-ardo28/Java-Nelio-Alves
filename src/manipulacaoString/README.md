


# Todos os Métodos da Classe String em Java

A classe String em Java contém métodos poderosos para manipulação de texto. Vamos explorar todos os métodos mais importantes!

## Criação e Concatenação
1. **Concatenação (`+`, `concat()`)**

   ```java
   String nome = "Ricardo";
   String mensagem = "Olá, " + nome + "!";
   System.out.println(mensagem); // Olá, Ricardo!

   String mensagem2 = "Bem-vindo, ".concat(nome);
   System.out.println(mensagem2); // Bem-vindo, Ricardo
   ```

2. **`join()` - Junta Strings com um delimitador**

   ```java
   String resultado = String.join(", ", "Java", "Python", "C++");
   System.out.println(resultado); // "Java, Python, C++"
   ```

## Conversões
3. **Transformar número em String (`String.valueOf()`)**

   ```java
   int numero = 42;
   String numeroString = String.valueOf(numero);
   System.out.println(numeroString); // "42"
   ```

4. **Transformar String em array de caracteres (`toCharArray()`)**

   ```java
   char[] caracteres = "Java".toCharArray();
   System.out.println(Arrays.toString(caracteres)); // [J, a, v, a]
   ```

5. **Criar String a partir de array de caracteres**

   ```java
   char[] letras = {'J', 'a', 'v', 'a'};
   String palavra = new String(letras);
   System.out.println(palavra); // Java
   ```

## Busca e Verificação
6. **Verificar se a string contém algo (`contains()`)**

   ```java
   String frase = "Estudar Java é divertido!";
   System.out.println(frase.contains("Java")); // true
   ```

7. **Verificar se a string começa/termina com algo (`startsWith()`, `endsWith()`)**

   ```java
   System.out.println("programador.java".endsWith(".java")); // true
   System.out.println("Hello World".startsWith("Hello")); // true
   ```

8. **Buscar índice de um caractere ou substring (`indexOf()`, `lastIndexOf()`)**

   ```java
   String frase = "O Java é incrível!";
   System.out.println(frase.indexOf("Java")); // 2
   System.out.println(frase.lastIndexOf("é")); // 8
   ```

9. **Verificar se a string está vazia (`isEmpty()`, `isBlank()`)**

   ```java
   String vazia = "";
   System.out.println(vazia.isEmpty()); // true

   String espacos = "   ";
   System.out.println(espacos.isBlank()); // true (Java 11+)
   ```

## Recorte e Remoção
10. **Obter parte de uma string (`substring()`)**

    ```java
    String palavra = "Programação";
    String parte = palavra.substring(0, 6);
    System.out.println(parte); // "Progra"
    ```

11. **Remover espaços extras (`trim()`, `strip()`)**

    ```java
    String texto = "  Olá, Java!  ";
    System.out.println(texto.trim()); // "Olá, Java!"

    // Java 11+
    System.out.println(texto.strip()); // "Olá, Java!"
    ```

12. **Remover caracteres (`replace()`, `replaceAll()`, `replaceFirst()`)**

    ```java
    String frase = "Java é poderoso!";
    String novaFrase = frase.replace("Java", "Python");
    System.out.println(novaFrase); // Python é poderoso!

    String apenasLetras = "Aprender123Java456".replaceAll("\\d", ""); // Remove números
    System.out.println(apenasLetras); // AprenderJava
    ```

## Alteração de Texto
13. **Alteração de maiúsculas e minúsculas (`toUpperCase()`, `toLowerCase()`)**

    ```java
    String texto = "Java";
    System.out.println(texto.toUpperCase()); // JAVA
    System.out.println(texto.toLowerCase()); // java
    ```

14. **Formatar strings (`String.format()`)**

    ```java
    String nome = "Ricardo";
    int idade = 37;
    String mensagem = String.format("Meu nome é %s e tenho %d anos.", nome, idade);
    System.out.println(mensagem); // Meu nome é Ricardo e tenho 37 anos.
    ```

## Comparação
15. **Comparar strings (`equals()`, `equalsIgnoreCase()`)**

    ```java
    String a = "java";
    String b = "Java";
    System.out.println(a.equals(b)); // false
    System.out.println(a.equalsIgnoreCase(b)); // true
    ```

16. **Comparação lexicográfica (`compareTo()`)**

    ```java
    System.out.println("Java".compareTo("Python")); // Retorna valor negativo (Java vem antes)
    System.out.println("Python".compareTo("Java")); // Retorna valor positivo
    System.out.println("Java".compareTo("Java")); // 0 (iguais)
    ```

## Métodos Alternativos ao `reverse()`
17. **Usando `char[]` e um loop manual**

    ```java
    public String inverterComArray(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int esquerda = 0, direita = palavra.length() - 1;
        
        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            
            esquerda++;
            direita--;
        }
        
        return new String(caracteres);
    }
    ```

18. **Usando `Collections.reverse()`**

    ```java
    import java.util.*;

    public String inverterComCollections(String palavra) {
        List<Character> lista = new ArrayList<>();
        for (char c : palavra.toCharArray()) {
            lista.add(c);
        }
        
        Collections.reverse(lista);
        
        StringBuilder resultado = new StringBuilder(lista.size());
        for (char c : lista) {
            resultado.append(c);
        }
        
        return resultado.toString();
    }
    ```

19. **Usando recursão**

    ```java
    public String inverterComRecursao(String palavra) {
        if (palavra.isEmpty()) {
            return palavra;
        }
        return inverterComRecursao(palavra.substring(1)) + palavra.charAt(0);
    }
    ```

## Conclusão
A classe String em Java é muito poderosa e oferece diversas maneiras de manipular textos. Agora você conhece todos os métodos importantes para trabalhar com String! 💡

Se precisar de mais explicações ou exemplos, só avisar! 🚀😃
```

Você pode copiar e colar o conteúdo acima no seu arquivo `README.md`. Se precisar de mais alguma coisa, é só avisar!
