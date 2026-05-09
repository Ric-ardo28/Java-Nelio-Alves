# Estudos em Java

Repositório de estudos e exercícios em Java, organizado por temas vistos durante a prática da linguagem. O projeto reúne exemplos pequenos e exercícios independentes sobre lógica de programação, programação orientada a objetos, coleções, exceções, datas, arquivos, interfaces, generics e expressões lambda.

Este repositório funciona como um caderno prático: cada pasta representa um assunto ou uma sequência de exercícios.

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Programação orientada a objetos
- API padrão do Java

## Estrutura do projeto

```text
src/
├── aulasU/                      # Exercícios avulsos de aula
├── beecrowd/                    # Exercícios de lógica da plataforma Beecrowd
├── contaBancaria/               # Herança, enum e modelo de contas bancárias
├── dataHora/                    # Datas, horários e formatação
├── enumeracoes/                 # Uso de enum em entidades e pedidos
├── excecoes/                    # Tratamento de erros e exceções personalizadas
├── exMatrizes/                  # Vetores e matrizes
├── generics/                    # Generics, Set, hashCode, equals e coringas
├── interfaceJava/               # Interfaces, Comparable, default methods e injeção de dependência
├── lambda/                      # Predicate, Consumer, Function e funções como parâmetro
├── listas*/                     # Exercícios com listas, entidades e manipulação de coleções
├── manipulacaoString/           # Operações com String, busca, contagem e inversão
├── pooEx1...pooEx19/            # Sequência de exercícios de POO
├── teste/                       # Testes e práticas livres
├── teste2/                      # Outros exercícios de lógica e testes
└── TrabalhandoComArquivos15/    # Leitura, escrita e manipulação de arquivos
```

## Principais assuntos estudados

### Fundamentos e lógica

- Entrada e saída de dados
- Estruturas condicionais
- Laços de repetição
- Operações matemáticas
- Exercícios de lógica em `beecrowd`, `teste`, `teste2` e `aulasU`

### Programação orientada a objetos

- Classes e objetos
- Atributos e métodos
- Construtores
- Encapsulamento
- Herança
- Polimorfismo
- Classes abstratas
- Sobrescrita de métodos
- Composição de objetos

As pastas `pooEx1` até `pooEx19` concentram boa parte desses exercícios.

### Coleções, listas, vetores e matrizes

- `ArrayList`
- Percorrer listas com `for` e `for-each`
- Busca e atualização de elementos
- Vetores
- Matrizes
- Exercícios nas pastas `listas`, `listas2`, `listas3`, `listas4` e `exMatrizes`

### Enums e datas

- Criação de enumerações
- Uso de enum dentro de entidades
- Manipulação de datas e horários
- Formatação de datas
- Exemplos nas pastas `enumeracoes` e `dataHora`

### Exceções

- `try`, `catch` e `finally`
- Criação de exceções personalizadas
- Validação de regras de negócio
- Exemplos nas pastas `excecoes`, `pooEx18` e `pooEx19`

### Interfaces e generics

- Interfaces como contrato
- Injeção de dependência
- `Comparable`
- Métodos default
- Tipos genéricos
- Wildcards
- `Set`
- `hashCode` e `equals`

Esses conteúdos estão principalmente em `interfaceJava` e `generics`.

### Lambda e programação funcional

- `Predicate<T>`
- `Consumer<T>`
- `Function<T, R>`
- Method reference
- Expressões lambda inline
- Funções passadas como parâmetro

Os exemplos ficam na pasta `lambda`.

### Manipulação de arquivos

- Leitura de arquivos com `File`, `Scanner`, `FileReader` e `BufferedReader`
- Escrita com `FileWriter` e `BufferedWriter`
- `try-with-resources`
- Criação e listagem de diretórios
- Exercícios na pasta `TrabalhandoComArquivos15`

## Como executar

### Pelo IntelliJ IDEA

1. Abra o projeto no IntelliJ IDEA.
2. Aguarde a IDE reconhecer a estrutura Java.
3. Abra uma classe que tenha método `main`.
4. Execute pelo botão de run da própria IDE.

### Pelo terminal

Este projeto possui vários exercícios independentes. Para compilar e executar uma classe específica, use o nome completo do pacote.

Exemplo:

```bash
javac lambda/funcoes/Program.java
java lambda.funcoes.Program
```

Dependendo da classe escolhida, pode ser necessário compilar a partir da raiz do projeto e respeitar os pacotes declarados nos arquivos.

## Observações

- O foco do repositório é estudo e prática, não uma aplicação única.
- Algumas pastas representam exercícios isolados.
- A pasta `out/` é gerada pela IDE/compilação e não faz parte do código-fonte principal.
- Os exemplos priorizam aprendizado dos conceitos da linguagem Java.

## Objetivo

Consolidar a base de Java por meio de exercícios práticos, evoluindo desde lógica de programação até recursos mais avançados como POO, interfaces, generics, lambdas, exceções e manipulação de arquivos.
