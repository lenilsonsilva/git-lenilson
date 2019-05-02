
# Loop para imprimir 5 vezes

timer = 1

5.times do
    #puts 'rodada numero ' + timer.to_s
    puts "rodada numero #{timer}"
    timer = timer + 1
end  

#########################################
vingadores = ['name 1', 'name 2', 'name 3' ]


#FOR
for item in(0...vingadores.size)
    puts vingadores[item]

end
####################################
vingadores.each do |v|
    puts v

end    

#####################
posicao = 0

vingadores.size.times do
    puts vingadores[posicao]
    posicao += 1
end

