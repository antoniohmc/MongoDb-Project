🎭 Show API
Uma API para gerenciar shows, utilizando Spring Boot e MongoDB como banco de dados. Este projeto permite adicionar e listar shows por meio de endpoints REST.

📋 Funcionalidades
* Adicionar um show ao banco de dados.
* Listar todos os shows cadastrados.

🛠 Tecnologias Utilizadas
* Java: Linguagem principal do projeto.
* Spring Boot: Framework para simplificar o desenvolvimento de aplicações.
* MongoDB: Banco de dados NoSQL utilizado para armazenar os shows.
* Postman: Ferramenta para testar os endpoints da API.

🚀 Como Executar o Projeto
1. Pré-requisitos
2. JDK 17+ ou superior
3. Maven configurado
4. MongoDB instalado e em execução
5. Postman (opcional, mas recomendado para testes)

Passos para Rodar o Projeto
1. Clone o repositório:
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

2.Acesse o diretório do projeto:

bash
Copiar código
cd nome-do-repositorio
Configure o arquivo application.properties para o MongoDB:

properties
Copiar código
spring.data.mongodb.uri=mongodb://localhost:27017/sua-base-de-dados
spring.data.mongodb.database=sua-base-de-dados
Compile e execute o projeto:

bash
Copiar código
mvn spring-boot:run
🧪 Testando os Endpoints
Adicionar um show
Endpoint:

POST /show/addShow
Parâmetros:

showId (Integer): ID único do show.
location (String): Localização do show.
date (String): Data do show.
avaliableTickets (String): Número de ingressos disponíveis.
Exemplo no Postman:

Configure o método como POST.
Use a URL: http://localhost:8080/show/addShow.
Adicione os parâmetros no Body em formato JSON:
json
Copiar código
{
  "showId": 1,
  "location": "São Paulo",
  "date": "2024-11-20",
  "avaliableTickets": "200"
}
Listar todos os shows
Endpoint:

GET /show/returnShow
Descrição: Retorna uma lista de todos os shows cadastrados no banco de dados.

Exemplo no Postman:

Configure o método como GET.
Use a URL: http://localhost:8080/show/returnShow.
📝 Estrutura do Projeto
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
📄 Modelo de Dados
Um exemplo de estrutura de dados de um show no MongoDB:

json
Copiar código
{
  "_id": "<ObjectId gerado automaticamente>",
  "showId": 1,
  "location": "São Paulo",
  "date": "2024-11-20",
  "avaliableTickets": "200"
}
🛡️ Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

🤝 Contribuindo
Faça um fork do projeto.
Crie uma branch para sua feature:
bash
Copiar código
git checkout -b feature/MinhaFeature
Commit suas alterações:
bash
Copiar código
git commit -m 'Adicionei MinhaFeature'
Faça um push para a branch:
bash
Copiar código
git push origin feature/MinhaFeature
Abra um Pull Request.
