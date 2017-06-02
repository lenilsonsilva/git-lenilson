package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.HistoryComponent;
import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.control.BaseTest;

public class HistoryTest extends BaseTest {
	
     LoginComponent login = new LoginComponent();
     HistoryComponent history = new HistoryComponent();
     
     @Test
     public void checkCurrentHistory()throws Exception{
    	 login.logar();
    	 login.clickMenu();
    	 history.clickMenuHistory();
    	 history.checkRides();
    	 
     }
     
     @Test
     public void checkLastMonth() throws Exception{
    	 login.logar();
    	 login.clickMenu();
    	 history.clickMenuHistory();
    	 history.clickLastMonth();
    	 history.checkRides();
     }
     
     @Test
     public void checkNextMonth() throws Exception{
    	 login.logar();
    	 login.clickMenu();
    	 history.clickMenuHistory();
    	 history.clickNextMonth();
    	 history.checkRides();
     }
    
}
