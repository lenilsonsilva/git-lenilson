result = ''
loop do
  puts result 
  puts 'Selecione uma das seguintes opções'
  puts '1- Soma'
  puts '2- Subtração'
  puts '3- Multiplicação'
  puts '4- Divisão'
  puts '0- Sair'
  print 'Opção: '
  
  option = gets.chomp.to_i
  
  case option 
  when 1
    print 'Digite o numero 1: '
    n1 = gets.chomp.to_i
    print 'Digite o numero 2: '
    n2 = gets.chomp.to_i
    soma = n1 + n2
    result = "O Valor da Soma é: #{soma}"

  when 2
    print 'Digite o numero 1: '
    n1 = gets.chomp.to_i
    print 'Digite o numero 2: '
    n2 = gets.chomp.to_i
    su = n1 - n2
    result = "O Valor da Subtração é: #{su}"

  when 3
    print 'Digite o numero 1: '
    n1 = gets.chomp.to_i
    print 'Digite o numero 2: '
    n2 = gets.chomp.to_i
    dv = n1/ n2
    result = "O Valor da Divisão é: #{dv}"

  when  4
    print 'Digite o numero 1: '
    n1 = gets.chomp.to_i
    print 'Digite o numero 2: '
    n2 = gets.chomp.to_i
    mult = n1*n2
    result = "O Valor da Multiplicação é: #{mult}"
  if option == 0 
    break
  else
    result = 'Opção inválida'
  end
  # Comando que limpa o console
  system "clear"  
end