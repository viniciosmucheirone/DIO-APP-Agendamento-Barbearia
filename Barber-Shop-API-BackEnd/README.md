
# Backend - Sistema de Agendamento para Barbearia

### Descrição do Projeto
Este repositório contém o código do **Backend** do Sistema de Agendamento para Barbearia, desenvolvido com **Java**, **Spring Boot**, **Spring Data JPA**, **Spring Security** e **MySQL**.

O Backend é responsável por:
- Gerenciar os agendamentos de serviços.
- Garantir a segurança com autenticação e autorização.
- Expor APIs RESTful para interação com o Frontend.

### Funcionalidades:
- **Autenticação** e **autorização** via **Spring Security**.
- Endpoints RESTful para criação, leitura, atualização e exclusão de agendamentos.
- Gerenciamento de usuários e roles (Admin, Cliente).
- Conexão com o banco de dados MySQL para persistência.

### Tecnologias utilizadas:
- **Java 17** como linguagem de programação.
- **Spring Boot 3** para criação da aplicação.
- **Spring Security** para controle de acesso.
- **Spring Data JPA** para interação com o banco de dados.
- **MySQL** como banco de dados.
- **Flyway** para migrações do banco de dados.

### Instalação
Para rodar o Backend localmente, siga os passos abaixo:

#### 1 - Clone o repositório:
```bash
git clone https://github.com/viniciosmucheirone/DIO-APP-Agendamento-Barbearia.git


#### 1 - Clone o repositório:
```bash
git clone https://github.com/viniciosmucheirone/DIO-APP-Agendamento-Barbearia.git
```
#### 2 - Navegue até o diretório Frontend:
```
cd DIO-APP-Agendamento-Barbearia/frontend
```
#### 3 - Abra o projeto no seu editor de código preferido (recomendo VSCode, WebStorm ou qualquer outro editor de sua escolha).
#### 4 - Configure o banco de dados MySQL (ou qualquer outro de sua escolha):
Ajuste o arquivo application.properties para configurar o banco de dado
```
spring.datasource.url=jdbc:mysql://localhost:3306/barbearia
spring.datasource.username=username
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

```
#### 5 - Execute o projeto com o comando:
```
./mvnw spring-boot:run
```
Agora, a API estará rodando localmente na porta configurada (por padrão, http://localhost:8080).

#### Testes
Para executar os testes automatizados do Backend:
```
mvn test
```
### Contribuição
Se você quiser contribuir para o projeto, sinta-se à vontade para abrir issues ou enviar pull requests. Toda contribuição será bem-vinda!

### Nota: Este repositório contém apenas o código do Backend. O código do Frontend pode ser encontrado em outro repositório.