#language: pt

Funcionalidade: Login
    Para que eu possa cadastrar e gerenciar minhas atividades
    Sendo um usuário cadastrado
    Posso acessar o sistema com meu email e minha senha

   @temp
    Cenário: Usuário autenticado

        Dado que estou na página de login
        Quando faço login com "test1@test.com" e "123456"
        Então devo ver a mensagem "Olá, Lenilson"


  Esquema do Cenario: Tentativa de logar
        Dado que estou na página de login
        Quando faço login com "<email>" e "<senha>"
        Então devo ver a mensagem de alerta "<mensagem>"


    Exemplos:
        |email         |senha|mensagem|
        |test1@test.com|12345698|Senha inválida.|
        |test1#test.com|123456  |Email incorreto ou ausente.|
        | |12345698|Email incorreto ou ausente.|
        |test1@test.com||Senha ausente.|
        |test54@test.com|123456|Usuário não cadastrado.     |
        
        
        Cenario: Bloqueia apos 5 tentativas

            Dado que estou na página de login
            E a quantidade maxima de login é 5 tentativas
            Quando tento logar com "test1@test.com" e "123xpt"
            Então devo ver a mensagem de alerta "Usuário bloqueado. Por favor aguarde 10 segundos, e tente novamente."

            