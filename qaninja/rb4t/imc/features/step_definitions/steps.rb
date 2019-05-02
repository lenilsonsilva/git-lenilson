require_relative '../../src/imc.rb'

Dado("que meu peso é {string} kilos") do |peso|
    @peso = peso
  end
  
  Dado("minha altura é {string}") do |altura|
    @altura = altura
  end
  
  Quando("faço o cálculo do IMC") do
    imc = Imc.new
    @resultado = imc.calcula(@peso, @altura)
  end
  
  Então("vejo a mensagem {string}") do |mensagem|
    expect(@resultado). to eql mensagem
  end
  