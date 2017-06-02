package br.com.easytaxi.components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.easytaxi.control.BaseTest;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidElement;

public class HistoryComponent extends BaseTest {

	WebDriverWait wait;

	public static final String designMenuItemText = ("br.com.easytaxi.homolog:id/design_menu_item_text");
	public static final String textView = ("android.widget.TextView");
	public static final String historyDriverName = ("br.com.easytaxi.homolog:id/history_driver_name");
	public static final String BUTTON_01 = ("android:id/button1");


	public void waitHome() {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("br.com.easytaxi.homolog:id/img_logo")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(BUTTON_01))).click();

	}


	public void clickMenuHistory() {
		driver.findElementsById(designMenuItemText).get(3).click();

	}

	public void clickLastMonth() {
		driver.findElementsByClassName(textView).get(3).click();
	}

	public void clickNextMonth() {
		driver.findElementsByClassName(textView).get(5).click();
	}

	public void listElements(String className) {
		List<AndroidElement> listMonth = driver.findElementsByClassName(className);
		int i = 0;
		for (AndroidElement element : listMonth) {
			System.out.println("Element: " + element.getAttribute("name") + " In position: " + i);
			i++;
		}
	}

	public void checkRides() {
		int qnt = driver.findElementsById(historyDriverName).size();
		System.out.println("Encontrado: " + qnt + " corridas");

	}

	public void swipeDirection(SwipeElementDirection arg) {
		Dimension size = driver.manage().window().getSize();
		int duration = 1000;

		int startX = (int) (size.width * 0.5);
		int endX = (int) (size.width * 0.5);
		int startY = (int) (size.height * 0.5);
		int endY = (int) (size.height * 0.5);

		if (SwipeElementDirection.UP.equals(arg)) {
			endY = (int) (size.height * 0.9);
			startY = (int) (size.height * 0.1);
		} else if (SwipeElementDirection.DOWN.equals(arg)) {
			endY = (int) (size.height * 0.1);
			startY = (int) (size.height * 0.9);
		} else if (SwipeElementDirection.LEFT.equals(arg)) {
			endX = (int) (size.width * 0.1);
			startX = (int) (size.width * 0.9);
		} else if (SwipeElementDirection.RIGHT.equals(arg)) {
			endX = (int) (size.width * 0.9);
			startX = (int) (size.width * 0.1);
		}

		driver.swipe(startX, startY, endX, endY, duration);

	}

}
