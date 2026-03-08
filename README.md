# Restaurant Management API

API REST para gerenciamento de produtos, categorias e pedidos de um restaurante.

O projeto foi desenvolvido como estudo de desenvolvimento back-end utilizando Java e Spring Boot, com foco na criação de APIs REST, organização em camadas e integração com banco de dados.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Maven
- Docker
- PostgreSQL / MySQL
- REST API

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas para separar responsabilidades:

- **Controller** → recebe as requisições HTTP
- **Service** → contém a lógica de negócio
- **Repository** → acesso ao banco de dados
- **Entity** → representação das tabelas do banco

## Funcionalidades

- Cadastro de produtos
- Consulta de produtos
- Organização por categorias
- Estrutura inicial para gerenciamento de pedidos
- API REST para integração com aplicações front-end

## Como Executar o Projeto

### 1. Clonar o repositório
git clone https://github.com/AlmeidaPh/restaurantManagement.git

### 2. Entrar na pasta do projeto
cd restaurant

### 3. Executar a aplicação

Utilizando Maven: ./mvnw spring-boot:run

Ou com Docker: docker-compose up


## Exemplos de Endpoints

### Listar produtos
GET /products


### Criar produto
POST /products


### Buscar produto por ID
GET /products/{id}


## Objetivo do Projeto

Este projeto foi desenvolvido para praticar:

- desenvolvimento de APIs REST
- arquitetura em camadas
- integração com banco de dados
- boas práticas em projetos backend

## Autor

Phillipe Almeida

GitHub:
https://github.com/AlmeidaPh