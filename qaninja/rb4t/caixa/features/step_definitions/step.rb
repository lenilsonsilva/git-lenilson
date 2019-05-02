require_relative '../../src/conta.rb'

Dado("que eu tenho uma conta com {int} reais") do |saldo|
  @conta = Conta.new(saldo)
end
  
Quando("faço um saque no valor de {int} reais") do |valor|
   @conta.saque(valor) 
end

Então("devo ver a mensagem {string}") do |mensagem|
  expect(@conta.retorno).to eql mensagem
end

Então("{int} reais será meu saldo final") do |saldo_final|
    expect(@conta.saldo).to eql saldo_final
end 