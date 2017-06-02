package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.components.SignOutComponent;
import br.com.easytaxi.control.BaseTest;

public class SignOutTest extends BaseTest{
	
	LoginComponent login = new LoginComponent();
	SignOutComponent sign = new SignOutComponent();
	
	
	@Test
	public void checkSignOutTest() throws Exception{
		login.logar();
		login.clickMenu();
		sign.clickMenuSignOut();	
		
	}

}
