# Order Management System - REST API

## 📚 Sobre o Projeto
***

Esta API foi projetada para gerenciar pedidos em um sistema de e-commerce. Ela inclui funcionalidades para centralizar a criação e consulta de pedidos, usuários, produtos, categorias e pagamentos.

Utilizando o framework Spring Boot em conjunto com Spring Data JPA, o sistema oferece uma solução robusta para gerenciar o ciclo completo de um pedido, desde a criação até a atualização de status.

## 📖 Tabela de Conteúdo
***
- [Instalação](#-instalação)
- [Como Usar](#-como-usar)
- [Endpoints da API](#-endpoints-da-api)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)

## 💻 Instalação
***

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/sistema-gestao-pedidos.git
```

2. Execute o comando abaixo na raiz do projeto para baixar as dependências e compilar o código:
```bash
   mvn clean install
   ```

3. Inicie a aplicação:
```bash
   mvn spring-boot:run
   ```

## 🚀 Como Usar
***

Depois de iniciar a aplicação, a API REST estará disponível em:
```bash
http://localhost:8080
```

## 📋 Endpoints da API
***

### 📌 POST /orders - Criar um novo pedido
Este endpoint permite a criação de um pedido vinculado a um usuário e a uma lista de produtos.

### 📌 GET /orders - Listar todos os pedidos
Este endpoint retorna todos os pedidos cadastrados no sistema.

### 📌 GET /orders/{id} - Buscar pedido por ID
Este endpoint retorna os detalhes de um pedido específico com base no seu ID.

### 📌 POST /payments - Processar pagamento para um pedido
Este endpoint permite registrar um pagamento para um pedido específico.

### 📌 GET /products - Listar todos os produtos
Este endpoint retorna a lista de todos os produtos cadastrados no sistema.


## 🚀 Tecnologias Utilizadas
***

- Java 17
- Spring Boot 
- Spring Data JPA
- Spring Security
- H2 Database
- Maven

