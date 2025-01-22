# desafio-academia-digital
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

Criação de API RESTful com ênfase na modelagem de suas entidades, no domínio de uma academia de ginástica.
### Tecnologias Utilizadas
- [MySQL](https://www.mysql.com)
- [Lombok](https://projectlombok.org)

# Instalação
1. Clone o repositório:
````
git clone https://github.com/Ca7ulo/Spring-Data-Jpa
````
2. Instale as dependências com o Maven.

3. Instale MySQL.
   
4. Criar um database no mysql.
   
5. Configurar o application properties. 
 


# Como rodar o projeto
1.Inicie o aplicativo com o Maven.

2.A API estará acessível em http://localhost:8080.

# API Endpoints

| Rotas                | Descrição                                         
|----------------------|-----------------------------------------------------
| <kbd>GET    /alunos</kbd>                   | Mostrar todos os alunos cadastrados.
| <kbd>GET    /alunos/avaliacoes/id</kbd>     | Retornar as avaliações físicas do aluno pelo id.
| <kbd>POST   /alunos</kbd>                  |  Adicionar um aluno.
| <kbd>POST   /matriculas</kbd>              | Adicionar uma avaliação física.
| <kbd>DELETE /alunos/id</kbd>             | Deletar um aluno pelo id.
| <kbd>GET    /avaliacoes</kbd>               | Retornar todas as avaliações físicas.
| <kbd>GET    /matriculas</kbd>               | Mostrar todas as matrículas.
| <kbd>DELETE /avaliacoes/index</kbd>       | Deletar uma avaliação pelo index.
| <kbd>DELETE /matriculas/id</kbd>       | Deletar uma matrícula pelo id.


### POST /alunos
##### REQUEST
```
{
    "nome":"Larissa",
    "cpf":"152368459",
    "bairro":"Assunção",
    "dataDeNascimento": "05/10/2020"

}
```
##### RESPONSE
```
{
    "id": 1,
    "nome": "Larissa",
    "cpf": "152368459",
    "bairro": "Assunção",
    "dataDeNascimento": "05/10/2020"
}
```
### POST /matriculas
##### REQUEST
```
{
    "alunoId":1
}
```
##### RESPONSE
```
{
    "id": 1,
    "aluno": {
        "id": 1,
        "nome": "Larissa",
        "cpf": "152368459",
        "bairro": "Assunção",
        "dataDeNascimento": "05/10/2020"
    },
    "dataDaMatricula": "21/01/2024 12:24:39"
}
```
### POST /avaliacoes
##### REQUEST
```
{
    "alunoId":1,
    "peso":75.4,
    "altura":1.72

}
```
##### RESPONSE
```
{
    "id": 1,
    "aluno": {
        "id": 1,
        "nome": "Larissa",
        "cpf": "152368459",
        "bairro": "Assunção",
        "dataDeNascimento": "05/10/2020"
    },
    "dataDaAvaliacao": "21/01/2024 12:26:10",
    "peso": 75.4,
    "altura": 1.72
}
```
# Database
O projeto utiliza o MySQL como banco de dados. E é necessário que seja passado para o application properties o endereço do banco de dados que será integrado a aplicação, as tabelas serão criadas automaticamente assim que vc rodar a aplicação pela primeira vez.
