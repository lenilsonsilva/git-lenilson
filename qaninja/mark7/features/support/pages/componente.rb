class Navbar 
include Capybara::DSL

    #element :menu_user, '.profile-address'
    #element :link_sair, 'a[href$=logout]'
    def menu_user
        find('.profile-address')
        
    end  

    def sair
        menu_user.click
        find('a[href$=logout]').click
    end
end

class SideBar
    include Capybara::DSL

    def perfil
        click_link 'Perfil'
    end
     
end    