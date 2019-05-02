#language:pt
Funcionalidade: Cálculo de IMC
    Sendo um usuário que está preocupado com a minha saúde
    Posso calular meu nível de IMC
    Para saber se devo ir para o BK ou para a Academia

    @happiness
    Cenario: Peso ideal

        Dado que meu peso é "70" kilos
        E minha altura é "1.70"
        Quando faço o cálculo do IMC
        Então vejo a mensagem "IMC Ok. #PartiuBK"

    Cenario: Sobrepeso

        Dado que meu peso é "90" kilos
        E minha altura é "1.70"
        Quando faço o cálculo do IMC
        Então vejo a mensagem "IMC deu ruim. #PartiuAcademia #NoPainNoGain"


    Cenario: Peso leve

        Dado que meu peso é "50" kilos
        E minha altura é "1.70"
        Quando faço o cálculo do IMC
        Então vejo a mensagem "IMC Baixo. #PassarNoMedico"