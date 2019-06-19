class Navbar < SitePrism::Page
    element :menu_user, '.profile-address'
    element :link_sair, 'a[href$=logout]'

    def sair
        menu_user.click
        link_sair.click
     
    end
    
end