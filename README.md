# desafioRpg
Repositório criado para inclusão do projeto

Banco de dados: mysql

Executar o script: create DATABASE jogo_rpg

Caso o banco local possua senha, alterar o arquivo application.properties
password=****

Caso precise alterar a porta para execução, alterar o application.properties
porta padrão definida como 8080


Teste serviço no postman:
--buscar personagem
GET /personagem/idPersonagem

--calcular iniciativa de jogo
GET /jogo/calcularIniciativa?personagem01=?&personagem02=?

--Realizar ataque
GET /jogo/realizarAtaque?personagemAtaque=?&personagemDefesa=?

--CalcularDano
GET /jogo/calcularDano?personagemAtaque=?&personagemDefesa=?
