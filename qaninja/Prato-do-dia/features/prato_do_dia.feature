#language:pt

Funcionalidade: Prato do dia!
  Queremos saber qual o prato do dia na capital paulista

  Cenário: Hoje é dia de virado a paulista
    Dado que hoje é "segunda-feira"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Virado a Paulista"


  Cenário: Hoje é dia de dobradinha
    Dado que hoje é "terça-feira"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Dobradinha"


  Cenário: Hoje é dia de feijoada
    Dado que hoje é "quarta-feira"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Feijoada"


  Cenário: Hoje é dia de lasanha
    Dado que hoje é "quinta-feira"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Lasanha"


  Cenário: Hoje é dia de hot-dog
    Dado que hoje é "sexta-feira"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Hot-Dog"


  Cenário: Hoje é dia de pizza
    Dado que hoje é "sabado"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Pizza"

 
  Cenário: Hoje é dia de churrasco
    Dado que hoje é "domingo"
    Quando eu pergunto qual é o prato do dia
    Então a resposta deve ser "Churrasco"


 # Funcionalidade: Prato do dia!
 # Queremos saber qual o prato do dia na capital paulista

 # Esquema do Cenário: Descubra o prato do dia

 #     Dado que hoje é "<dia>"
 #     Quando eu pergunto qual é o prato do dia
 #     Então a resposta deve ser "<resposta>"

  #      Exemplos:
  #          | dia           | resposta          |
  #          | segunda-feira | Virado a Paulista |
  #          | terça-feira   | Dobradinha        |
  #          | quarta-feira  | Feijoada          |
  #          | quinta-feira  | Macarrão          |
  #          | sexta-feira   | Filé de Peixe     |


