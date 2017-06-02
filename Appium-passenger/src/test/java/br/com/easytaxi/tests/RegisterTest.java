package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.components.RegisterComponent;
import br.com.easytaxi.control.BaseTest;

public class RegisterTest extends BaseTest {

	LoginComponent login = new LoginComponent();
	RegisterComponent register = new RegisterComponent();

	@Test
	public void registerValidUser() {
		login.waitHome();
		login.clickMenu();
		login.clickLogin();
		register.clickCreateAccount();
		register.setName("Lenilson Tester");
		register.setPhone("11975124791");
		register.setEmail("lenisontest2@mailismagic.com");
		register.setPassword("123456");
		register.clickRegister();
		login.waitHome();
	}

}
