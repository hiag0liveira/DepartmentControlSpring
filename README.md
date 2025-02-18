# Department Control - Spring Boot

## 📌 Sobre o Projeto
O **Department Control** é um sistema desenvolvido em **Spring Boot** para o gerenciamento de departamentos, cargos e funcionários. A aplicação permite a administração de departamentos, a definição de cargos associados a esses departamentos e o cadastro de funcionários vinculados a cargos específicos.

🔗 O projeto pode ser acessado online: [Department Control - Render](https://departmentcontrolspring.onrender.com/)

🔗 Repositório no GitHub: [DepartmentControlSpring](https://github.com/hiag0liveira/DepartmentControlSpring)

---

## 🚀 Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java**
- **Spring Boot**
- **Maven**
- **PostgreSQL**
- **Spring Data JPA**
- **Hibernate ORM**
- **Spring MVC**
- **Lombok**
- **Thymeleaf** (para renderização dinâmica de templates)
- **WebJars** (para gestão de dependências frontend)
- **Bootstrap** (para estilização da interface)

---

## 🎯 Funcionalidades
O sistema implementa as seguintes funcionalidades:

### 🏢 Departamentos
- Cadastro de novos departamentos.
- Edição e remoção de departamentos.
- Listagem de departamentos.

### 💼 Cargos
- Cadastro de cargos dentro dos departamentos.
- Associação de cargos a departamentos.
- Edição e remoção de cargos.

### 👨‍💼 Funcionários
- Cadastro de funcionários vinculados a cargos.
- Edição e remoção de funcionários.
- Listagem de funcionários com informações detalhadas.

---

## 📷 Layout
A interface do sistema utiliza **Bootstrap** para um design responsivo e moderno, com suporte a operações CRUD diretamente via interface web renderizada com **Thymeleaf**.

---

## 📄 Estrutura do Projeto
A estrutura do projeto segue o padrão MVC:

```
DepartmentControlSpring/
│── src/
│   ├── main/
│   │   ├── java/com/example/departmentcontrol/
│   │   │   ├── controllers/  # Controladores MVC
│   │   │   ├── entities/      # Modelos das entidades (Departamentos, Cargos, Funcionários)
│   │   │   ├── repositories/  # Interfaces para manipulação do banco de dados
│   │   │   ├── services/      # Regras de negócio e serviços
│   │   ├── resources/templates/  # Páginas HTML Thymeleaf
│   │   ├── resources/static/     # Arquivos estáticos (CSS, JS, Imagens)
│── pom.xml   # Dependências do Maven
```
