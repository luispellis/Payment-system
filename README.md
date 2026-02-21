🧩 Desafio Java — Interface e Records
📚 Sobre o Desafio

Este projeto tem como objetivo praticar conceitos fundamentais do Java moderno, utilizando:

interface

record

Polimorfismo

Coleções (List)

Boas práticas de modelagem

O desafio simula um sistema de pagamentos de um e-commerce, com diferentes formas de pagamento.

🎯 Objetivo

Desenvolver um sistema capaz de:

Processar diferentes tipos de pagamento

Calcular taxas específicas para cada tipo

Exibir um resumo do pagamento

Utilizar interface e record corretamente

🏗️ Estrutura Esperada do Projeto

src/

 ├── Pagamento.java
 
 ├── CartaoCredito.java
 
 ├── Pix.java
 
 ├── Boleto.java
 
 ├── ProcessadorPagamentos.java
 
 └── Main.java
 
📌 Requisitos

1️⃣ Criar a Interface Pagamento
public interface Pagamento {
    double calcularTaxa();
    void processar();
    String resumo();
}

2️⃣ Criar os Records

Todos devem implementar a interface Pagamento.

💳 CartaoCredito

String numeroCartao

String titular

double valor

⚡ Pix

String chavePix

double valor

🧾 Boleto

String codigoBarras

double valor

3️⃣ Regras de Negócio
Tipo	Regra de Taxa
Cartão de Crédito	5% do valor
Pix	1% do valor
Boleto	Taxa fixa de R$ 3,00
4️⃣ Classe ProcessadorPagamentos

A classe deve:

Receber uma List<Pagamento>

Processar todos os pagamentos

Exibir:

Tipo do pagamento

Valor original

Taxa

Valor final (valor + taxa)

🖥️ Exemplo de Saída Esperada
Processando pagamento via Cartão de Crédito...
Valor: 100.0
Taxa: 5.0
Total: 105.0

Processando pagamento via Pix...
Valor: 200.0
Taxa: 2.0
Total: 202.0
🚀 Desafios Extras

 Usar instanceof com pattern matching (Java 17+)

 Criar método para calcular o total arrecadado

 Validar valor no construtor do record

 Criar menu interativo no main

 Implementar sealed interface

🧠 Conceitos Trabalhados

Programação Orientada a Objetos

Abstração com Interface

Imutabilidade com Records

Polimorfismo

Organização de código

🏁 Como Executar

Clone o repositório

Compile o projeto

Execute a classe Main
