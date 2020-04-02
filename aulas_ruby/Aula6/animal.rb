class Animal 
    def pular
      puts 'Toing! tóim! bóim! póim!'
    end

    def comer
        puts 'Come come'
    end
    
    def dormir
      puts 'ZzZzzz!'
    end
end     
   class Cachorro < Animal
     def latir
      puts 'Au Au'
     end
    end
    class Gato < Animal
        def meow
        puts 'O Gato ...'
          puts 'meow meow'
        end
    end

    
   cachorro = Cachorro.new
   cachorro.latir
   cachorro.pular
   cachorro.dormir

    gato = Gato.new
    gato.meow
    gato.pular
    gato.comer
    gato.dormir