# frozen_string_literal: true

Dado('que estou na página de login') do
  @login_page = LoginPage.new
  @login_page.load
  # visit 'https://mark7.herokuapp.com/login'
  # visit 'https://mark7-sandbox.herokuapp.com/login'
  # visit 'https://mark7-sandbox.herokuapp.com'
end

Quando('faço login com {string} e {string}') do |email, senha|
  # Find 1
  # find('#login_email').set email
  # find('#login_password').set senha
  # click_button 'Login'

  # Fill_in funciona quando o elemento inout possui id ou name
  # fill_in 'login_email', with: email
  # fill_in 'login_password', with: senha
  # find('button[id*=btnLogin]').click

  # @login_page=LoginPage.new
  # @login_page.login_email.set email
  # @login_page.login_password.set senha
  # @login_page.login_button.click
  @login_page.logar(email, senha)

  sleep 5
end

Então('devo ver a mensagem {string}') do |mensagem|
  @tarefas_page = TarefasPage.new
  expect(@tarefas_page.ola.text).to eql mensagem

  # ola = find('#task-board h3')
  # expect(ola.text).to eql mensagem
end

Então('devo ver a mensagem de alerta {string}') do |mensagem|
  # alerta_login = find('.alert-login')
  # expect(alerta_login.text).to eql mensagem
  expect(@login_page.alerta.text).to eql mensagem
end

# Tentativas
Dado('a quantidade maxima de login é {int} tentativas') do |tentativas|
  @tentativas = tentativas + 1
end

Quando('tento logar com {string} e {string}') do |email, senha|
  @tentativas.times do
    # fill_in 'login_email', with: email
    # fill_in 'login_password', with: senha
    # find('button[id*=btnLogin]').click

    # @login_page=LoginPage.new
    # @login_page.login_email.set email
    # @login_page.login_password.set senha
    # @login_page.login_button.click
    @login_page.logar(email, senha)
    sleep 2
  end
end
