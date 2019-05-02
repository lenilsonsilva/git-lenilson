
class Imc
    def calcula(peso, altura)
        imc = (peso.to_i / (altura.to_f * 2)).round(2)
        puts imc
        if imc > 22
            return 'IMC deu ruim. #PartiuAcademia #NoPainNoGain'

         elsif imc > 18.00 and imc < 21.99 
            return 'IMC Ok. #PartiuBK'
           else
            return 'IMC Baixo. #PassarNoMedico'

        end    
        
    end
    
end
