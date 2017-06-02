package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.ContactComponent;
import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.control.BaseTest;

public class ContactTest extends BaseTest{
		LoginComponent login = new LoginComponent();
		ContactComponent contact = new ContactComponent();
		
		
		@Test
		public void checkContact() throws Exception{
			login.logar();
			login.clickMenu();
			contact.clickMenuContact();
			
			
		}
		
}
