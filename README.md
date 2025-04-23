# 📘 Programação Orientada a Objetos com Java

Este repositório tem como objetivo apresentar os conceitos fundamentais da Programação Orientada a Objetos (POO), com exemplos práticos utilizando a linguagem **Java**.

---

## 🧱 Paradigmas de Programação

### 🔧 Programação Estruturada
Na programação estruturada, os algoritmos são implementados com estruturas sequenciais e procedimentos lineares. São utilizadas estruturas como:
- Estruturas de seleção: `if`, `else`
- Estruturas de repetição: `while`, `for`
- Blocos e sub-rotinas

Essa abordagem altera variáveis de escopo local ou global diretamente, sendo mais centrada em **funções e procedimentos**.

### 🧠 Programação Orientada a Objetos (POO)
POO é um paradigma baseado no uso de **objetos**, que contêm:
- **Atributos** (dados)
- **Métodos** (comportamentos)

A ideia é representar entidades do mundo real em código, de forma mais **modular e reutilizável**, com foco em **classes** e **objetos**.

---

## 🧩 Estrutura de uma Classe em Java

```java
public class Student {
  String name;
  int age;
  Color color;
  Sex sex;

  void eating(Lunch lunch) { /* ... */ }
  void drinking(Juice juice) { /* ... */ }
  void running() { /* ... */ }
}


Padrões de Projeto de Classes
Model: Representa a estrutura de domínio (ex: Cliente, Pedido)

Service: Contém regras de negócio e validações

Repository: Integração com banco de dados

Controller: Comunicação com o mundo externo (ex: APIs)

Util: Ferramentas e funções auxiliares

🚧 Construtores
Construtores definem como um objeto é criado:

java
Copiar
Editar
public class Pessoa {
  String nome;

  Pessoa(String nome) {
    this.nome = nome;
  }
}
⚠️ Cuidado
Evite o uso excessivo de construtores como forma de abreviar a lógica de criação de objetos.

🧾 Enums
Enums são classes especiais com objetos imutáveis e pré-definidos, ideais para representar valores fixos como estados ou tipos.

java
Copiar
Editar
public enum EstadoBrasileiro {
  SAO_PAULO("SP", "São Paulo"),
  RIO_JANEIRO("RJ", "Rio de Janeiro");

  private String sigla;
  private String nome;

  EstadoBrasileiro(String sigla, String nome) {
    this.sigla = sigla;
    this.nome = nome;
  }

  public String getSigla() { return sigla; }
  public String getNome() { return nome; }
  public String getNomeMaiusculo() { return nome.toUpperCase(); }
}
Métodos úteis
values(): retorna todos os valores do Enum

valueOf(String name): obtém um Enum pelo nome (sensível a maiúsculas/minúsculas)

💡 Dicas e Boas Práticas
Nomeie os objetos enum com letras maiúsculas e separadas por underscore (_)

Utilize getters, evite setters em enums

Construtores devem ser private

Distribua responsabilidades entre as classes de forma clara e coesa

📌 Conclusão
Este projeto aborda os fundamentos de POO com Java, incluindo:

Estrutura de classes

Criação de objetos

Uso de construtores

Enumerações

Boas práticas de organização de código

Desenvolvido por [George Guedes] - baseado em materiais de estudo da disciplina de Programação Orientada a Objetos.
