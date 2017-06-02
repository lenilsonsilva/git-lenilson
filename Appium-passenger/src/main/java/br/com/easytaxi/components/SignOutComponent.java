package br.com.easytaxi.components;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.easytaxi.control.BaseTest;

public class SignOutComponent extends BaseTest {

	WebDriverWait wait;
	public static final String MENU_ITEM = ("br.com.easytaxi.homolog:id/design_menu_item_text");
	public static final int INDEX_VALUE_7 = 7;
	public static final String BUTTON_01 = ("android:id/button1");
	public static final String IMG_LOGO = ("br.com.easytaxi.homolog:id/img_logo");

	public void waitHome() {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(IMG_LOGO)));

	}

	public void waitPopUp() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BUTTON_01))).click();

	}

	public void clickMenuSignOut() {
		driver.findElementsById(MENU_ITEM).get(INDEX_VALUE_7).click();
		driver.findElementById(BUTTON_01).click();
	}

}
