# desafioRpg
Repositório criado para inclusão do projeto

Banco de dados: mysql

Executar o script: create DATABASE jogo_rpg

Caso o banco local possua senha, alterar o arquivo application.properties
password=****

Caso precise alterar a porta para execução, alterar o application.properties
porta padrão definida como 8080


.Teste serviço no postman:

**_Buscar personagem_**

GET /personagem/idPersonagem

**_Listar personagens_**

GET /personagem/listarpersonagens

**_Calcular iniciativa de jogo_**

GET /jogo/calcularIniciativa?personagem01=?&personagem02=?

**_Realizar ataque_**

GET /jogo/realizarAtaque?personagemAtaque=?&personagemDefesa=?

**_CalcularDano_**

GET /jogo/calcularDano?personagemAtaque=?&personagemDefesa=?
