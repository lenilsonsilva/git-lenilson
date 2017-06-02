package br.com.easytaxi.components;

import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.easytaxi.control.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class RegisterCardComponent extends BaseTest {

	WebDriverWait wait;

	public static final String MENU_ITEM = ("br.com.easytaxi.homolog:id/design_menu_item_text");
	public static final int INDEX_VALUE_1 = 1;
	public static final int INDEX_VALUE_2 = 2;
	public static final String BUTTON_01 = ("android:id/button1");
	public static final String BUTTON_ADD_CREDIT_CARD = ("br.com.easytaxi.homolog:id/bt_add_credit_card");
	public static final String NAME_FIELD = ("br.com.easytaxi.homolog:id/name");
	public static final String CARD_NUMBER = ("br.com.easytaxi.homolog:id/cardNumber");
	public static final String EXPIRE_CARD = ("br.com.easytaxi.homolog:id/expireCard");
	public static final String CVV_CARD = ("br.com.easytaxi.homolog:id/cvv");
	public static final String BUTTON_ADD_CARD = ("br.com.easytaxi.homolog:id/btn_add");
	public static final String BUTTON_SEND = ("br.com.easytaxi.homolog:id/btSend");
	public static final String IMG_CARD = ("br.com.easytaxi.homolog:id/img_credit_card");
	public static final String NUMBER_CARD = ("br.com.easytaxi.homolog:id/number");
	public static final String RADIOCHECK = ("br.com.easytaxi.homolog:id/radioCheck");
	public static final String BUTTON_FAVORITE = ("br.com.easytaxi.homolog:id/bt_favorite");
	
	public static final String BUTTON_VISA_CHECKOUT = ("br.com.easytaxi.homolog:id/com_visa_checkout_exo_card_art");

	public void clickMyCards() {
		driver.findElementsById(MENU_ITEM).get(INDEX_VALUE_2).click();
	}

	public void clickButtonAddCard() {
		driver.findElementById(BUTTON_ADD_CREDIT_CARD).click();

	}

	public void setNameCard(String namecard) {
		driver.findElementById(NAME_FIELD).setValue(namecard);
	}

	public void setCardNumber(String cardnumber) {
		driver.findElementById(CARD_NUMBER).setValue(cardnumber);
	}

	public void setExpireCard(String expirecard) {
		driver.findElementById(EXPIRE_CARD).setValue(expirecard);
	}

	public void setCvv(String cvv) {
		driver.findElementById(CVV_CARD).setValue(cvv);
	}

	public void clickAddCard() {
		driver.findElementById(BUTTON_ADD_CARD).click();
	}

	public void invalidLogin() {
		driver.findElementsById(BUTTON_SEND);

	}

	public void verificCardREgister() {
		driver.findElementById(IMG_CARD);
		driver.findElementById(NAME_FIELD);
		driver.findElementById(NUMBER_CARD);

	}

	public void clickButtonFavorite() {
		driver.findElementsById(BUTTON_FAVORITE).get(INDEX_VALUE_1).click();
	}
	public void clicRadioCheck(){
		driver.findElementById(RADIOCHECK).click();
	}
	

	public void pressDelete() {
		AndroidElement card = driver.findElementById(NUMBER_CARD);
		TouchAction tca = new TouchAction(driver);
		tca.longPress(card);
		tca.release().perform();
		driver.findElementById(BUTTON_01).click();

	}
	
	public void pressButtonVisaCheckout() {
		AndroidElement card = driver.findElementById(BUTTON_VISA_CHECKOUT);
		TouchAction tca = new TouchAction(driver);
		tca.longPress(card);
		tca.release().perform();
	}

	public void checkScreenNewCard() {
		driver.findElementById(BUTTON_ADD_CARD);
	}
	public void clickButtonOK(){
		driver.findElementById(BUTTON_01).click();
	}

	public void checkScreenMycard() {
		driver.findElementById(BUTTON_ADD_CREDIT_CARD);
	}
    
	public void clickButtonVisaCheckout(){
		driver.findElementById(BUTTON_VISA_CHECKOUT);
	}
	public int checkCardQnt() {
		int qnt = driver.findElementsById(IMG_CARD).size();
		return qnt;

	}

}
