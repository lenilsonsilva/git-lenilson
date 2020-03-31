puts "Calculo do Devedor"
print "Digite o seu nome: "
nome = gets.chomp
print "Digite o seu telefone: "
telefone = gets.chomp
print "Digite o seu endereço: "
endereco = gets.chomp

puts "Olá #{nome} Seja Bem Vindo !!!"
puts "Seu telefone é #{telefone} e o seu endereço é #{endereco}"


print "Digite o valor da compra 1: "
compra1 = gets.chomp.to_i

print "Digite o valor da compra 1: "
compra2 = gets.chomp.to_i

puts "Calculos"
addition = compra1 + compra2
su = compra1 - compra2
div = compra1/compra2
mult = compra1*compra2
puts "O resultados da adição entre os dois números é #{addition}"
puts "O resultados da subtração entre os dois números é #{su}"
puts "O resultados da divisão entre os dois números é #{div}"
puts "O resultados da multiplicação entre os dois números é #{mult}"
