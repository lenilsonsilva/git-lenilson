package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.components.ProfileComponent;
import br.com.easytaxi.control.BaseTest;

public class ProfileTest extends BaseTest {

	LoginComponent login = new LoginComponent();
	ProfileComponent profile = new ProfileComponent();

	@Test
	public void editProfileName() throws Exception {
		login.logar();
		login.clickMenu();
		profile.clickProfileName("Lenilson Pires");
		Thread.sleep(5000);
		driver.hideKeyboard();
		profile.clickButtonSave();

	}

	@Test
	public void editProfilePhone() throws Exception {
		login.logar();
		login.clickMenu();
		profile.clickProfilePhone("11975124187");
		driver.hideKeyboard();
		profile.clickButtonSave();

	}
    @Test
	public void editProfilePassword() throws Exception {
		login.logar();
		login.clickMenu();
		profile.clickProfilePassword("123456");
		driver.hideKeyboard();
		profile.clickButtonSave();

	}

}
