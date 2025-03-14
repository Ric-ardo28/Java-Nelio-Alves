# Inverter Palavras em uma Frase

Este projeto contém uma implementação em Java que inverte palavras com 5 ou mais caracteres dentro de uma frase.

## 📌 Como funciona?
O programa analisa uma string (frase) e inverte apenas as palavras que possuem 5 ou mais caracteres, mantendo as demais inalteradas.

### 📜 Explicação do Código
O código é composto por duas classes:

1. **Classe `InverterPalavras`**
    - Contém o método `inverterPalavras(String frase)`, responsável por dividir a frase em palavras e inverter as que possuem 5 ou mais caracteres.

2. **Classe `Main`**
    - Cria uma instância de `InverterPalavras` e chama o método para inverter palavras em uma frase fornecida.

### 🖥️ Implementação

```java
// Classe responsável por inverter palavras com 5 ou mais caracteres
public class InverterPalavras {

    public String inverterPalavras(String frase) {
        String[] palavras = frase.split(" "); // Divide a frase em palavras

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() >= 5) {
                // Inverte a palavra e substitui no array
                palavras[i] = new StringBuilder(palavras[i]).reverse().toString();
            }
        }
        return String.join(" ", palavras); // Junta as palavras de volta em uma frase
    }
}
```

```java
// Classe principal para testar a funcionalidade
public class Main {
    public static void main(String[] args) {
        InverterPalavras ip = new InverterPalavras();
        String resultado = ip.inverterPalavras("Ola mundo");
        System.out.println(resultado);
    }
}
```

### 🔹 Exemplo de Uso
Entrada:
```
Ola mundo
```
Saída:
```
Ola odnum
```
A palavra **"mundo"** foi invertida, pois tem 5 caracteres ou mais.

## 💡 Melhorias Possíveis
- **Considerar pontuações**: Atualmente, sinais de pontuação são tratados como parte da palavra.
- **Criar testes unitários**: Implementar testes automatizados para validar diferentes cenários.
- **Personalizar o limite de caracteres**: Permitir que o usuário defina quantos caracteres uma palavra precisa ter para ser invertida.



