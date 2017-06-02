package br.com.easytaxi.components;

import br.com.easytaxi.control.BaseTest;

public class RegisterComponent extends BaseTest {

	public static final String BUTTON_CREATE_ACCOUNT = ("br.com.easytaxi.homolog:id/container_create_account");
	public static final String NAME_FIELD = ("br.com.easytaxi.homolog:id/user");
	public static final String PHONE_FIELD = ("br.com.easytaxi.homolog:id/phone");
	public static final String EMAIL_FIELD = ("br.com.easytaxi.homolog:id/email");
	public static final String PASSWORD_FIELD = ("br.com.easytaxi.homolog:id/password");
	public static final String BUTTON_REGISTER = ("br.com.easytaxi.homolog:id/btComplete");

	public void clickCreateAccount() {
		driver.findElementById(BUTTON_CREATE_ACCOUNT).click();
	}

	public void setName(String name) {
		driver.findElementById(NAME_FIELD).setValue(name);
	}

	public void setPhone(String phone) {
		driver.findElementById(PHONE_FIELD).setValue(phone);
	}

	public void setEmail(String email) {
		driver.findElementById(EMAIL_FIELD).setValue(email);
	}

	public void setPassword(String password) {
		driver.findElementById(PASSWORD_FIELD).setValue(password);
	}

	public void clickRegister() {
		driver.findElementById(BUTTON_REGISTER).click();
	}

}
