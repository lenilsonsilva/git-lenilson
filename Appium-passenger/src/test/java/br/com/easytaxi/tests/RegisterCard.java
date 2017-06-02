package br.com.easytaxi.tests;

import org.openqa.selenium.html5.Location;
import org.testng.Assert;
import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.components.RegisterCardComponent;
import br.com.easytaxi.control.BaseTest;

public class RegisterCard extends BaseTest {

	LoginComponent login = new LoginComponent();
	RegisterCardComponent addcard = new RegisterCardComponent();

	
	
	@Test
	public void addCreditCard() throws Exception{
		driver.setLocation(this.GPS_SAO);
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonAddCard();
		addcard.setNameCard("Lenilson");
		addcard.setCardNumber("5305513120001485");
		addcard.setExpireCard("10/20");
		addcard.setCvv("394");
		addcard.clicRadioCheck();
		driver.hideKeyboard();
		addcard.clickAddCard();
		addcard.clickButtonOK();
		addcard.verificCardREgister();

	}

	@Test
	public void cardAlreadyRegister() throws Exception {
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		int before = addcard.checkCardQnt();
		addcard.clickButtonAddCard();
		addcard.setNameCard("EasyTaxiBR");
		addcard.setCardNumber("5276480630000644");
		addcard.setExpireCard("01/17");
		addcard.setCvv("211");
		addcard.clickAddCard();
		int after = addcard.checkCardQnt();
		Assert.assertEquals(after, before);

	}

	@Test
	public void addCreditCardNumberEmpty() throws Exception {
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonAddCard();
		addcard.setNameCard("EasyTaxiBR");
		addcard.setExpireCard("01/17");
		addcard.setCvv("618");
		addcard.clickAddCard();
		addcard.checkScreenNewCard();

	}

	@Test
	public void addCreditCardNameEmpty() throws Exception {
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonAddCard();
		addcard.setCardNumber("525664021972687");
		addcard.setExpireCard("02/18");
		addcard.setCvv("132");
		addcard.clickAddCard();
		addcard.checkScreenNewCard();

	}

	@Test
	public void addCreditCardExpiresEmpty() throws Exception {
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonAddCard();
		addcard.setNameCard("EasyTaxiBR");
		addcard.setCardNumber("525664021972687");
		addcard.setCvv("132");
		addcard.clickAddCard();
		addcard.checkScreenNewCard();

	}
	
	@Test
	public void addCreditCardCvvEmpty() throws Exception{
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonAddCard();
		addcard.setNameCard("EasyTaxi");
		addcard.setCardNumber("525664021972687");
		addcard.setExpireCard("02/18");
		addcard.clickAddCard();
		addcard.checkScreenNewCard();
		
	}
	
	@Test
	public void addCreditCardInvalidExpires() throws Exception {
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonAddCard();
		addcard.setNameCard("EasyTaxiBR");
		addcard.setCardNumber("5276482810000758");
		addcard.setExpireCard("01/16");
		addcard.setCvv("618");
		addcard.clickAddCard();
		addcard.checkScreenNewCard();

	}
	
	@Test
	public void deleteCreditCard() throws Exception{
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.pressDelete();
		addcard.checkScreenMycard();

	}
	
	@Test
	public void selectCardFavorite() throws Exception{
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonFavorite();
		driver.navigate().back();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.checkScreenMycard();
	}
	
	@Test
	public void selectVisaCheckout() throws Exception{
		login.logar();
		login.clickMenu();
		addcard.clickMyCards();
		addcard.clickButtonVisaCheckout();
		addcard.pressButtonVisaCheckout();
		Thread.sleep(10000);
	}
	

}
