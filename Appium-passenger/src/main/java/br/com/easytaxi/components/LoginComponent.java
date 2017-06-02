package br.com.easytaxi.components;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.easytaxi.control.BaseTest;

public class LoginComponent extends BaseTest {

	WebDriverWait wait;
	
	public static final String BUTTTON_LOGIN = ("br.com.easytaxi.homolog:id/design_menu_item_text");
	public static final int INDEX_0 = 0;
	public static final String EMAIL_LOGIN  = ("br.com.easytaxi.homolog:id/login");
	//public static final String CLEAR_EMAIL_LOGIN = ("br.com.easytaxi.homolog:id/login");
	public static final String FIELD_PASSWORD_EMAIL = ("br.com.easytaxi.homolog:id/password");
	public static final String BUTTON_SEND_LOGIN = ("br.com.easytaxi.homolog:id/btSend");
	public static final String BUTTON_FORGOT_PASSWORD = ("br.com.easytaxi.homolog:id/forgot_password");
	public static final String FIELD_EMAIL_FORGOT = ("br.com.easytaxi.homolog:id/email");	
	public static final String BUTTON_01 = ("android:id/button1");
	public static final String IMG_LOGO = ("br.com.easytaxi.homolog:id/img_logo");
	

	

	public void clickMenu() {
		driver.findElementsByClassName("android.widget.ImageButton").get(INDEX_0).click();

	}

	public void clickLogin() {
		driver.findElementsById(BUTTTON_LOGIN).get(INDEX_0).click();

	}
    public void clearEmail(){
    	driver.findElementById(EMAIL_LOGIN).clear();
    }
	public void setEmail(String email) {
		driver.findElementById(EMAIL_LOGIN).setValue(email);

	}

	public void setPassword(String senha) {
		driver.findElementById(FIELD_PASSWORD_EMAIL).setValue(senha);

	}

	public void clickSend() {
		driver.findElementById(BUTTON_SEND_LOGIN).click();

	}

	public void clickForgotPassword() {
		driver.findElementById(BUTTON_FORGOT_PASSWORD).click();
	}

	public void setForgotEmail(String email) {
		driver.findElementById(FIELD_EMAIL_FORGOT).setValue(email);
	}
	
	public void clearForgotEmail(){
		driver.findElementById(FIELD_EMAIL_FORGOT).clear();
	}

	public void clickButtonNewPassWord() {
		driver.findElementById(BUTTON_SEND_LOGIN).click();
	}

	public void clickButtonAletar() {
		driver.findElementById(BUTTON_01).click();
	}

	public void waitHome() {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(IMG_LOGO)));

	}

	public void waitPopUp() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BUTTON_01))).click();

	}

	public void invalidLogin() {
		driver.findElementsById(BUTTON_SEND_LOGIN );

	}
	

	public void logar() throws Exception{
		waitHome();
		waitPopUp();
		clickMenu();
		clickLogin();
		clearEmail();
		setEmail("lenilson.pires@easytaxi.com.br");
		setPassword("123456");
		clickSend();
		waitHome();

	}
	
	

}
