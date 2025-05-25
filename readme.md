# Game List

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/PedroHCN-git/ds-list/blob/main/LICENSE)

# Sobre o Projeto

O projeto foi feito durante a semana Intensivão Java Spring, promovida pela equipe da [DevSuperior](https://devsuperior.com.br/). Mais voltado para o backend o projeto oferece uma API Rest que disponibiliza uma lista de jogos, organizados por tipo (RPG, Aventura, Ação, etc...), E nos deixa reposicioná-los dentro do banco de dados.

# Modelo de Domínio

![Imagem do Modelo](https://github.com/PedroHCN-git/ds-list/blob/main/src/assets/dslist-model.png)

# Tecnologias utilizadas

## Backend

- Java
- Spring Boot
- PostgreSQL
- Maven

## Implantação

O projeto tem três ambientes configurados, um para teste, outro para desenvolvimento e um para implantação,
para alterar entre os ambientes basta entrar no diretório raiz do projeto e modificar o valor da variável de
ambiente APP_PROFILE (para ambiente de teste - "test", para ambiente dev - "dev", para ambiente de produção - "prod")

\src\main\resources\application.properties

### teste (test)

Para o ambiente de teste utilizamos um banco H2, bem simples de utilizar, basta rodar o projeto e o banco já sobe simultaneamente.

para mais configurações acesse \src\main\resources\application-test.properties

### desenvolvimento (dev)

Para desenvolvimento utilizamos um banco SQL, podendo optar por configurar em um docker ou intalar o postgres localmente com pgadmin, já temos um arquivo docker-compose configurado no projeto caso opte pela opção do docker

para mais configurações acesse \src\main\resources\application-dev.properties

### produção (prod)

Para produção deixei pré configuradas as variáveis de ambiente no arquivo \src\main\resources\application-prod.properties podendo optar por qualquer tipo de provedor em nuvem, RailWay, Heroku, etc...

# Como executar o projeto

Pré-requisitos: Java 21

```bash
# clonar repositório
git clone https://github.com/PedroHCN-git/ds-list

# executar o projeto
./mvnw spring-boot:run
```


