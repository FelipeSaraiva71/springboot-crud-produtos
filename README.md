# 🛍️ API de Cadastro de Produtos - Spring Boot

API REST desenvolvida com **Spring Boot** para gerenciar produtos, permitindo operações básicas de cadastro, consulta, atualização e exclusão. Ideal para praticar os fundamentos de Java, Spring Web e JPA com uma estrutura limpa e extensível.

---

## ✅ Funcionalidades

- **Cadastro de produtos**  
  Registra produtos com os seguintes atributos: nome, descrição, valor e peso.

- **Consulta de produtos**  
  Lista todos os produtos cadastrados ou busca por ID.

- **Atualização de produtos**  
  Permite editar os dados de um produto existente.

- **Remoção de produtos**  
  Exclui produtos do sistema de forma segura.

---

## 📦 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (para testes)
- Maven

---

## 📜 Estrutura do Código

- `Produto.java` → Entidade principal com os atributos: `nome`, `descricao`, `valor`, `peso`.  
- `ProdutoRepository.java` → Interface que estende `JpaRepository` para operações no banco.  
- `ProdutoController.java` → Endpoints REST para manipulação dos produtos.  
- `application.properties` → Configuração do banco H2 e comportamento da aplicação.  
- `CadastroprodutosApplication.java` → Classe principal que inicia a aplicação.

---

## 🔗 Endpoints da API

| Método   | Endpoint             | Descrição                        |
|----------|----------------------|----------------------------------|
| `GET`    | `/produtos`          | Lista todos os produtos          |
| `GET`    | `/produtos/{id}`     | Busca produto por ID             |
| `POST`   | `/produtos`          | Cadastra um novo produto         |
| `PUT`    | `/produtos/{id}`     | Atualiza um produto existente    |
| `DELETE` | `/produtos/{id}`     | Remove um produto do sistema     |

---

🔮 Melhorias Futuras
- 🧾 Validação de campos com mensagens personalizadas
- 🗃️ Integração com banco de dados relacional (MySQL ou PostgreSQL)
- 🔐 Autenticação básica para proteger os endpoints
- 📊 Paginação e ordenação de resultados
- 🧪 Testes unitários e de integração com JUnit
- 🌐 Documentação da API com Swagger
- 🎨 Interface web para visualização e cadastro de produtos
- 📋 Registro de logs e auditoria de operações

✨ Autor
Desenvolvido por Felipe Saraiva


1. Clone o repositório:
   ```bash
   git clone https://github.com/FelipeSaraiva71/springboot-crud-produtos.git
