# 💳 Payment System - Java

Mini sistema de processamento de pagamentos desenvolvido em Java com foco em boas práticas de arquitetura, orientação a objetos e testes unitários.

## 📌 Objetivo

Simular o processamento de pagamentos utilizando diferentes formas de pagamento, aplicando:

- Polimorfismo
- Strategy Pattern
- DTO
- Testes unitários com JUnit 5
- Estrutura padrão Maven
- Boas práticas de versionamento com Git

---

## 🏗️ Arquitetura do Projeto

O projeto segue a estrutura padrão Maven:

src/

├── main

│ └── java/com/devpellis/pagamentos

│ ├── dto

│ ├── model

│ └── service

└── test

└── java/com/devpellis/pagamentos


### 📦 Camadas

- **model** → Entidades e regras de negócio
- **service** → Orquestração do processamento
- **dto** → Objeto de transferência de dados
- **test** → Testes unitários

---

## 💡 Conceitos Aplicados

### ✅ Orientação a Objetos

- Interface `Pagamento`
- Implementações:
  - `CartaoCredito`
  - `Pix`
  - `Boleto`
- Polimorfismo
- Baixo acoplamento

---

### ✅ Strategy Pattern

Cada forma de pagamento implementa sua própria lógica de cálculo de taxa.

O `PagamentoService` trabalha com a abstração `Pagamento`, permitindo extensibilidade sem modificar o serviço.

---

### ✅ DTO com Record

Utilização de `record` para:

'''java
ResultadoPagamentoDTO
Objeto imutável

Apenas transporte de dados

Sem regras de negócio

✅ Validações e Tratamento de Erros

Validação de valores inválidos

Validação de chave Pix

Validação de código de boleto

Uso de IllegalArgumentException

Princípio Fail Fast

✅ Testes Unitários com JUnit 5

Testes implementados para:

Fluxo feliz (cálculo correto)

Testes de exceção

Organização por classe

Uso de:

@Test

assertEquals

assertThrows

✅ Estrutura Maven

Projeto organizado seguindo convenção:

src/main/java

src/test/java

src/main/resources

✅ Git e Versionamento

Branch feature/estrutura-inicial

Conventional Commits:

feat

refactor

Histórico limpo e organizado

🚀 Como Executar
mvn clean install
mvn test
📈 Evolução Técnica

Este projeto demonstra:

Aplicação prática de OOP

Separação de responsabilidades

Estrutura profissional de projeto Java

Escrita de testes unitários

Organização e versionamento adequado
