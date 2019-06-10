class LoginPage
    include Capybara::DSL
    
   
    def login_email
        return find('fill_in 'login_email', with: email')
    end

    def login_password
        return find('fill_in 'login_password', with: senha')
    end
    
    def login_button
        return find ('find('button[id*=btnLogin]').click') 
    end
end