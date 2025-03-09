# ✨ Interface em Java - Exercícios

Este diretório faz parte do repositório [Java-Nelio-Alves](https://github.com/Ric-ardo28/Java-Nelio-Alves) e contém exercícios práticos sobre **interfaces em Java**. Aqui, são abordados conceitos como **abstração, polimorfismo, injeção de dependência e inversão de controle (IoC)**.

## 📝 Conceitos Principais
### 🔍 O que são Interfaces?
- Uma **interface** é um contrato que define um conjunto de métodos sem implementação.
- Permite que diferentes classes implementem o mesmo comportamento de maneira independente.
- É usada para alcançar **abstração** e **polimorfismo**.

### 🔄 Inversão de Controle (IoC) e Injeção de Dependência (DI)
- **IoC**: Em vez de uma classe controlar suas dependências, elas são passadas externamente (exemplo: via construtor).
- **DI**: Uma técnica para fornecer as dependências necessárias a uma classe, em vez de ela mesma criá-las.
- Benefícios: Facilita manutenção, teste e expansão do sistema.

## 🛠️ Como Executar
1. Clone este repositório:
   ```sh
   git clone https://github.com/Ric-ardo28/Java-Nelio-Alves.git
   ```
2. Navegue até a pasta `interfaceJava`:
   ```sh
   cd Java-Nelio-Alves/src/interfaceJava
   ```
3. Compile os arquivos Java:
   ```sh
   javac *.java
   ```
4. Execute o programa principal (caso haja uma classe `Main`):
   ```sh
   java Main
   ```

## 🔍 Exemplo de Uso
Se houver um sistema de pagamento com interfaces, a saída esperada pode ser:
```
Pagamento realizado com cartão de crédito: R$ 96.00
Pagamento realizado com boleto: R$ 98.00
```

## 🚀 Melhorias Futuras
- [ ] Adicionar novos exemplos de interfaces.
- [ ] Criar testes unitários para validar as implementações.
- [ ] Refatorar para utilizar padrões de projeto como Strategy.

## 📚 Estrutura do Projeto
```
/
├── Pagamento.java               # Interface de pagamento
├── PagamentoCartaoCredito.java  # Implementa pagamento por cartão
├── PagamentoBoleto.java         # Implementa pagamento via boleto
├── SistemaDePagamento.java      # Classe que recebe um pagamento (injeção de dependência)
├── Main.java                    # Classe principal para executar o sistema
└── README.md                    # Documentação do projeto
```

## 👨‍💻 Autor
Projeto desenvolvido por [Ricardo](https://github.com/Ric-ardo28). Feedbacks e contribuições são bem-vindos! 🚀

