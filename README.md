# Order Management System - REST API

## 📚 Sobre o Projeto
***

Esta API foi projetada para gerenciar pedidos em um sistema de e-commerce. Ela inclui funcionalidades para centralizar a criação e consulta de pedidos, usuários, produtos, categorias e pagamentos.

Utilizando o framework Spring Boot em conjunto com Spring Data JPA, o sistema oferece uma solução robusta para gerenciar o ciclo completo de um pedido, desde a criação até a atualização de status.

## 📖 Tabela de Conteúdo
***
- [Instalação](#-instalação)
- [Como Usar](#-como-usar)
- [Documentação da API (Swagger)](#-documentação-da-api-swagger)
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

## 📘 Documentação da API (Swagger)
***

 A API conta com uma UI para explorar os endpoints e realizar testes, implementada com SpringDoc OpenAPI.

- JSON da API: http://localhost:8080/v3/api-docs
- Interface Swagger UI: http://localhost:8080/swagger-ui.html

A documentação inclui todos os detalhes dos endpoints, exemplos de requisições e respostas, facilitando a integração com a API.

## 📋 Endpoints da API
***

### **Usuários**

📌 **POST /users** - Criar um novo usuário  
Este endpoint permite a criação de um novo usuário no sistema.

📌 **GET /users** - Listar todos os usuários  
Este endpoint retorna todos os usuários cadastrados no sistema.

📌 **GET /users/{id}** - Buscar usuário por ID  
Este endpoint retorna os detalhes de um usuário específico com base no seu ID.

📌 **PUT /users/{id}** - Atualizar um usuário  
Este endpoint permite a atualização dos dados de um usuário específico.

📌 **DELETE /users/{id}** - Deletar um usuário  
Este endpoint remove um usuário específico com base no seu ID.

---

### **Pedidos**

📌 **GET /orders** - Listar todos os pedidos  
Este endpoint retorna todos os pedidos cadastrados no sistema.

---

### **Produtos**

📌 **GET /products** - Listar todos os produtos  
Este endpoint retorna todos os produtos cadastrados no sistema.

---

### **Categorias**

📌 **GET /categories** - Listar categorias  
Este endpoint retorna todas as categorias disponíveis no sistema.

---

## 🛠️ Tecnologias Utilizadas
***

- Java 17
- Spring Boot 
- Spring Data JPA
- Spring Security
- H2 Database
- Hibernate
- Maven
- Swagger

## 🔗 Próximos Passos
*** 

- Adicionar autenticação e autorização com JWT.
- Implementar testes unitários para garantir maior cobertura.
- Configurar suporte a banco de dados relacional como PostgreSQL ou MySQL.