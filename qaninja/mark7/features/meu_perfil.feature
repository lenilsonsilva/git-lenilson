            #language: pt

            Funcionalidade: Me perfil
            Para que eu possa manter menus dados atualizados
            Sendo um usuário o que fez o cadastro simplificado
            Posso completar o cadastro do meu perfil

            @perfil
            Esquema do Cenario: Atualizar meu perfil

            Dado que estou logado com "<email>" e "<senha>"
            E acesso o meu perfil
            Quando completo o meu cadastro com "<empresa>" e "<cargo>"
            Então devo ver a mensagem de atualização cadastral:
            """
            Perfil atualizado com sucesso.
            """

            Exemplos:
            | email          | senha  | empresa | cargo     |
            | test1@test.com | 123456 | Google  | Developer |
            #| qa@test.com  | 1234569  | Apple   | QA    |
            #| ceo@test.com | 123456   | Amazon  | CEO   |
            #| cto@test.com | 1234598  | Yahoo   | DEV   |
            #| est@test.com | 1234598  | Google  | Estagiario |


