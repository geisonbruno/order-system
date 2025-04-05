# Order System - REST API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
## 📚 Sobre o Projeto

API desenvolvida com Spring Boot, JPA e Hibernate. Projetada para gerenciar pedidos, usuários, produtos e pagamentos, o que a torna aplicável a diversos cenários. O projeto aplica boas práticas de arquitetura, implementa CRUD completo, gerencia relacionamentos complexos e trata exceções personalizadas.

A base de dados iniciei em H2 para testes e migrou para PostgreSQL em produção.

## 📖 Tabela de Conteúdo
- [Instalação com Docker](#-instalação)
- [Como Usar](#-como-usar)
- [Documentação da API (Swagger)](#-documentação-da-api-swagger)
- [Endpoints da API](#-endpoints-da-api)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)

## 🐳 Instalação com Docker

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/sistema-gestao-pedidos.git
cd order-system
```

2. Execute o Docker Compose:
```bash
   docker-compose up -d
   ```

O banco de dados será iniciado automaticamente usando um volume Docker chamado pgdata, garantindo persistência dos dados mesmo após parar os containers.

## 🚀 Como Usar

Depois de iniciar a aplicação, a API REST estará disponível em:
```bash
http://localhost:8080
```

## 📘 Documentação da API (Swagger)

 A API conta com uma UI para explorar os endpoints e realizar testes, implementada com SpringDoc OpenAPI.

- JSON da API: http://localhost:8080/v3/api-docs
- Interface Swagger UI: http://localhost:8080/swagger-ui.html

A documentação inclui todos os detalhes dos endpoints, exemplos de requisições e respostas, facilitando a integração com a API.

## 📋 Endpoints da API

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
- PostgreSQL
- Docker

## 🔗 Próximos Passos
*** 

- Adicionar autenticação e autorização com JWT.
- Implementar testes unitários para garantir maior cobertura.
