package br.com.easytaxi.components;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.easytaxi.control.BaseTest;

public class ProfileComponent extends BaseTest {
	WebDriverWait wait;
	public static final String BUTTON_01 = ("android:id/button1");
	public static final String TITLE = ("br.com.easytaxi.homolog:id/title");
	public static final int INDEX_VALUE_0 = 0;
	public static final int INDEX_VALUE_1 = 1;
	public static final int INDEX_VALUE_2 = 2;
	public static final String NAME_FIELD = ("br.com.easytaxi.homolog:id/user_name_input");
	public static final String PHONE_FIELD = ("br.com.easytaxi.homolog:id/user_phone_input");
	public static final String PASSWORD_FIELD = ("br.com.easytaxi.homolog:id/user_password_input");
	public static final String BUTTON_SAVE = ("br.com.easytaxi.homolog:id/save_changes_button");

	public void waitHome() {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("br.com.easytaxi.homolog:id/img_logo")));
		Location gps = new Location(-23.541008, -46.733843, 726);
		driver.setLocation(gps);

	}

	public void waitPopUp() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BUTTON_01))).click();

	}

	public void clickProfileName(String name) {
		driver.findElementsById(TITLE).get(INDEX_VALUE_0).click();
		driver.findElementsByClassName("android.widget.EditText").get(INDEX_VALUE_0).clear();
		driver.findElementById(NAME_FIELD).setValue(name);
	}

	public void clickProfilePhone(String phone) {
		driver.findElementsById(TITLE).get(INDEX_VALUE_0).click();
		driver.findElementsByClassName("android.widget.EditText").get(INDEX_VALUE_1).clear();
		driver.findElementById(PHONE_FIELD).setValue(phone);

	}

	public void clickProfilePassword(String password) {
		driver.findElementsById(TITLE).get(INDEX_VALUE_0).click();
		driver.findElementsByClassName("android.widget.EditText").get(INDEX_VALUE_2).clear();
		driver.findElementById(PASSWORD_FIELD).setValue(password);

	}

	public void clickButtonSave() {
		driver.findElementById(BUTTON_SAVE).click();
	}

}
