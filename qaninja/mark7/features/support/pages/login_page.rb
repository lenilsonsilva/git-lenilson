class LoginPage
    include Capybara::DSL
    def load
       visit '/login'
    end    

        #set_url '/login'
       
       #element :login_email, '#login_email'
       #element :login_password, '#login_password'
       #element :login_button, 'button[id*=btnLogin]'
       #element :alerta, '.alert-login'

      def logar(email, senha)
        find('#login_email').set email
        find('#login_password').set senha
        find('button[id*=btnLogin]').click
        #login_button.click
      end   

      def alerta
        find('.alert-login')
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