class Esportista
    def competir
        puts 'Participando de uma competição'
    end

    def treinamento
        puts 'Treinamento com Peso'
    end
    
end

class JogadorDeFutebol < Esportista
    def correr
        puts 'Correndo atrás da Bola'
    end 
    def treinamento
        puts 'Treinamento Chute ao Gol'
    end
end

class Maratonista < Esportista
    def correr
        puts 'Percorrendo o circuito' 
    end 
    def treinamento
        puts 'Treinamento de musculação'
    end
end

jogador = JogadorDeFutebol.new
jogador.competir
jogador.correr
jogador.treinamento

maratonista = Maratonista.new
maratonista.competir
maratonista.correr
maratonista.treinamento
