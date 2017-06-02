package br.com.easytaxi.components;

import org.openqa.selenium.By;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.easytaxi.control.BaseTest;

public class ShareComponent extends BaseTest {

	public static final int INDEX_VALUE_4 = 4;
	public static final int INDEX_VALUE_0 = 0;
	public static final String MENU_ITEM = ("br.com.easytaxi.homolog:id/design_menu_item_text");
	public static final String IMG_LOGO = ("br.com.easytaxi.homolog:id/img_logo");
	public static final String BUTTON_01 = ("android:id/button1");

	WebDriverWait wait;

	public void waitHome() {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(IMG_LOGO)));

	}

	public void waitPopUp() throws Exception {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BUTTON_01))).click();

	}

	public void clickMenuShare() {
		driver.findElementsById(MENU_ITEM).get(INDEX_VALUE_4).click();
		driver.findElementsByClassName("android.widget.Button").get(INDEX_VALUE_0).click();

	}

}
