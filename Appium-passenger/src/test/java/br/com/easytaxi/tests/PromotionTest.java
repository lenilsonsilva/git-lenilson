package br.com.easytaxi.tests;

import org.testng.annotations.Test;

import br.com.easytaxi.components.LoginComponent;
import br.com.easytaxi.components.PromotionComponent;
import br.com.easytaxi.control.BaseTest;

public class PromotionTest extends BaseTest{
    LoginComponent login = new LoginComponent();
    PromotionComponent promo = new PromotionComponent();
    
    @Test
    public void checkPromotion()throws Exception{
   	 login.logar();
   	 login.clickMenu();
     promo.clickMenuPromotion();
     Thread.sleep(5000);
     promo.checkPromotion(); 
    }
    
    
}
