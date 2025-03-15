# Sistema de Agendamento para Barbearia
<h1 align="center">
    <img alt="Gobarber" src="img\home.jpeg" width="300px"
    />
</h1>

### Descrição do Projeto
Este projeto tem como objetivo o desenvolvimento de um sistema de agendamento para barbearias, proporcionando uma solução simples, eficiente e intuitiva para gerenciar os agendamentos de serviços. Foi criado durante o programa DecolaTech.

### Objetivos do Projeto:
- Facilitar o agendamento de serviços para clientes de barbearias.
- Otimizar o processo de gestão de horários e disponibilidade de profissionais.
- Oferecer uma interface amigável tanto para os clientes quanto para os administradores.
- Garantir a segurança das informações e dos agendamentos.

## ⛏️ Tecnologias utilizadas (Pré-requisitos): 
- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- Hibernate
- Maven
- MySQL
- Flyway (Migrations)
- HTML5/CSS3
- JavaScript
- Bootstrap 5
- Thymeleaf

### Capturas de Tela da Execução do Projeto

Abaixo estão algumas capturas de tela que ilustram a funcionalidade e a interface do sistema de agendamento para barbearias:

#### Tela 1: 
<h1 align="center">
    <img alt="" src="img\swagger.png"/>
</h1>

#### Tela 2:

<h1 align="center">
    <img alt="" src="img\swagger_post.png"/>
</h1>

#### Tela 3: 

<h1 align="center">
    <img alt="" src="img\swagger_get.png"/>
</h1>

##### Tela 4: 

<h1 align="center">
    <img alt="" src="img\swagger_get_json.png"/>
</h1>

#  ⚙️ Como Rodar o Projeto Localmente:  <a name = "tinstall"></a>

### Instalação
#### 1 - Clone este repositório:
```
git clone https://github.com/viniciosmucheirone/DIO-APP-Agendamento-Barbearia.git
```
#### 2 - Navegue até o diretório do projeto:
```
cd DIO-APP-Agendamento-Barbearia
```
#### 3 - Abra o projeto em sua IDE favorita (como IntelliJ IDEA ou Eclipse).

#### 4 - Configure seu banco de dados (pode ser um banco de dados MySQL, PostgreSQL ou qualquer outro de sua escolha).
```
Ajuste o arquivo application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/barbearia
spring.datasource.username=username
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```
#### 5 - Execute o projeto com o comando:
```
./mvnw spring-boot:run
```
Agora, seu sistema estará rodando localmente e você pode começar a fazer requisições.

## 🧪 Testes
Para executar os testes automatizados:
```
mvn test
```

###  Conclusão:
O Sistema de Agendamento para Barbearia foi uma excelente oportunidade de aplicar conhecimentos adquiridos no programa DecolaTech. Utilizando tecnologias como Spring Boot, Hibernate e MySQL, desenvolvi uma solução prática e eficiente para a gestão de agendamentos. A implementação de Spring Security garantiu a segurança do sistema, enquanto o deploy na nuvem (Railway) tornou o sistema acessível online. Esse projeto reforçou minhas habilidades em backend, segurança e deploy, além de proporcionar uma solução real para o mercado de barbearias.
