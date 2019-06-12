class LoginPage < SitePrism::Page
       element :login_email, '#login_email'
       element :login_password, '#login_password'
       element :login_button, 'button[id*=btnLogin]'

      def logar(email, senha)
        login_email.set email
        login_password.set senha
        login_button.click
      end   

   # include Capybara::DSL
       
        #def login_email
            #find('#login_email')
        #end
    
        #def login_password
            #find('#login_password')
        #end

        #def login_button
            #find('button[id*=btnLogin]')
        #end

        
end   