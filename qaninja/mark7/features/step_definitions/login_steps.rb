
Dado("que estou na página de login") do
   #visit 'https://mark7.herokuapp.com/login'
   #visit 'https://mark7-sandbox.herokuapp.com/login'
   visit 'https://mark7-sandbox.herokuapp.com'
end
  
Quando("faço login com {string} e {string}") do |email, senha|
   #Find 1
    #find('#login_email').set email
    #find('#login_password').set senha
   #click_button 'Login'
   #Fill_in funciona quando o elemento inout possui id ou name 
  #fill_in 'login_email', with: email
   #fill_in 'login_password', with: senha
   #find('button[id*=btnLogin]').click
 @login_page = LoginPage.new
 @login_page.campo_email.set email
 @login_page.campo_senha.set senha
 @login_page.botao_entrar.click
    sleep 5
 

end
  
Então("devo ver a mensagem {string}") do |mensagem|
    ola = find('#task-board h3')
   expect(ola.text).to eql mensagem
end

Então("devo ver a mensagem de alerta {string}") do |mensagem|
   alerta_login = find('.alert-login')
   expect(alerta_login.text).to eql mensagem
 end

#Tentativas
 Dado("a quantidade maxima de login é {int} tentativas") do |tentativas|
  @tentativas = tentativas + 1
 end
 
 Quando("tento logar com {string} e {string}") do |email, senha|
   @tentativas.times do
      #fill_in 'login_email', with: email
      #fill_in 'login_password', with: senha
      #find('button[id*=btnLogin]').click find('button[id*=btnLogin]').click
      @login_page = LoginPage.new
      @login_page.campo_email.set email
      @login_page.campo_senha.set senha
      @login_page.botao_entrar.click
      sleep 1.5
   end

 end
 
  
  