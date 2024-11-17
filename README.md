Show API
Uma API para gerenciar shows, utilizando Spring Boot e MongoDB como banco de dados. Este projeto permite adicionar e listar shows por meio de endpoints REST.

📋 Funcionalidades
Adicionar um show ao banco de dados.
Listar todos os shows cadastrados.
🛠 Tecnologias utilizadas
Java: Linguagem principal do projeto.
Spring Boot: Framework para simplificar o desenvolvimento.
MongoDB: Banco de dados NoSQL utilizado para armazenar os shows.
Postman: Ferramenta para testar e hospedar os endpoints da API.
🚀 Como executar o projeto
Pré-requisitos
JDK 17+ ou superior
Maven configurado
MongoDB instalado e em execução
Postman para testar os endpoints
Passos para rodar o projeto
Clone o repositório:
bash
Copiar código
git clone https://github.com/seu-usuario/nome-do-repositorio.git
Acesse o diretório do projeto:
bash
Copiar código
cd nome-do-repositorio
Configure o arquivo application.properties para o MongoDB:
properties
Copiar código
spring.data.mongodb.uri=mongodb://localhost:27017/sua-base-de-dados
spring.data.mongodb.database=sua-base-de-dados
Compile e rode o projeto:
bash
Copiar código
mvn spring-boot:run
🧪 Testando os endpoints
Com o Postman, você pode acessar os seguintes endpoints:

Adicionar um show
POST /show/addShow
Parâmetros:

showId (Integer): ID único do show.
location (String): Localização do show.
date (String): Data do show.
avaliableTickets (String): Número de ingressos disponíveis.
Exemplo de uso no Postman:

Configure o método como POST.
Use a URL: http://localhost:8080/show/addShow.
Adicione os parâmetros na aba Params ou no corpo da requisição.
Listar todos os shows
GET /show/returnShow

Este endpoint retorna uma lista de todos os shows cadastrados no banco de dados.

Exemplo de uso no Postman:

Configure o método como GET.
Use a URL: http://localhost:8080/show/returnShow.
📝 Estrutura básica do projeto
plaintext
Copiar código
src
├── main
│   ├── java
│   │   └── tabd.com.projeto.mongo
│   │       ├── controller
│   │       │   └── ShowController.java
│   │       ├── model
│   │       │   └── Show.java
│   │       └── repository
│   │           └── ShowRepository.java
│   └── resources
│       └── application.properties
📄 Modelo de dados
A estrutura de um show no MongoDB é a seguinte:

json
Copiar código
{
  "_id": "<ObjectId gerado automaticamente>",
  "showId": <número inteiro>,
  "location": "<string>",
  "date": "<string>",
  "avaliableTickets": "<string>"
}
🛡️ Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

🤝 Contribuindo
Faça um fork do projeto.
Crie uma branch para sua feature (git checkout -b feature/MinhaFeature).
Commit suas alterações (git commit -m 'Adicionei MinhaFeature').
Faça um push para a branch (git push origin feature/MinhaFeature).
Abra um Pull Request.
