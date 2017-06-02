package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.control.BaseTest;

public class LoginTest extends BaseTest {

	LoginComponent login;

	@Test
	public void loginValidCredentials() throws Exception{
		login = new LoginComponent();
		login.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clearEmail();
		login.setEmail("lenilson.pires@easytaxi.com.br");
		login.setPassword("123456");
		login.clickSend();
		login.waitHome();
		
	}

	@Test
	public void loginWithoutCredentials() throws Exception{
		login = new LoginComponent();
		login.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clickSend();
		login.invalidLogin();
	}
	
	@Test	
	public void loginWithoutEmail()throws Exception{
		login = new LoginComponent();
		login.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clearEmail();
		login.setPassword("123456");
		login.clickSend();
		login.invalidLogin();
		
	}
	
	@Test
	public void loginWithoutPassword()throws Exception{
		login = new LoginComponent();
		login.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clearEmail();
		login.setEmail("lenilson.pires@easytaxi.com.br");
		login.clickSend();
		login.invalidLogin();
		
	}
	
	
	@Test
	public void loginInvalidPassword()throws Exception{
		login = new LoginComponent();
		login.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clearEmail();
		login.setEmail("lenilson.pires@easytaxi.com.br");
		login.setPassword("lenilson123");
		login.clickSend();
		login.invalidLogin();

	}
	@Test
	public void loginInvalidEmail() throws Exception{
		login = new LoginComponent();
		//applogin.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clearEmail();
		login.clearEmail();
		login.setEmail("lenilson.pires@easytaxi.com");
		login.setPassword("123456");
		login.clickSend();
		login.invalidLogin();

	}
	
	@Test
	public void loginForgotEmail()throws Exception{
		login = new LoginComponent();
		login.waitHome();
		login.waitPopUp();
		login.clickMenu();
		login.clickLogin();
		login.clickForgotPassword();
		login.clearForgotEmail();
		login.setForgotEmail("lenilson.pires@easytaxi.com.br");
		login.clickButtonNewPassWord();
		login.clickButtonAletar();
		login.invalidLogin();
		
	}
	

}
