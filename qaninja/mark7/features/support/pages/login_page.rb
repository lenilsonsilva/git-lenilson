class LoginPage
    include Capybara::DSL
       
        def login_email
            find('#login_email')
        end
    
        def login_password
            find('#login_password')
        end
        
        def login_button
            find('button[id*=btnLogin]')
        end

        
end   