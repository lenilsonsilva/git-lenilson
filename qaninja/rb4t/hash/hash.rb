hash_notas = {
    :alice => 100,
    :bob => 60,
    :james => 97,
    :jonas => 1000
  }

  puts hash_notas.select {|nome, notas| notas > 97} 