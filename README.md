# desafioRpg

> Repositório criado para inclusão do projeto


### Banco de dados: 
mysql

#### Executar o script: 
create DATABASE jogo_rpg

#### Observações:
1. Se o banco de dados possuir senha, alterar o arquivo application.properties
password=****

2. Alterar porta para execução do projeto, alterar o application.properties
porta padrão definida como 8080


### Teste serviço no postman:

**_Buscar personagem:_**

GET /personagem/idPersonagem

**_Listar personagens:_**

GET /personagem/listarpersonagens

**_Calcular iniciativa de jogo:_**

GET /jogo/calcularIniciativa?personagem01=?&personagem02=?

**_Realizar ataque:_**

GET /jogo/realizarAtaque?personagemAtaque=?&personagemDefesa=?

**_CalcularDano:_**

GET /jogo/calcularDano?personagemAtaque=?&personagemDefesa=?

