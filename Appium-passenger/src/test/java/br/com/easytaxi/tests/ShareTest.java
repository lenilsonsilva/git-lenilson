package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.components.ShareComponent;
import br.com.easytaxi.control.BaseTest;

public class ShareTest extends BaseTest{
    LoginComponent login = new LoginComponent();
    ShareComponent share = new ShareComponent();
    
    
    @Test
    public void checkShare() throws Exception{
    	login.logar();
    	login.clickMenu();
    	share.clickMenuShare();
    	
    }

}
