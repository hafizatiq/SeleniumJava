package com.WebTAproject;

import org.testng.annotations.Test;
import Helper.HelperClass;
import PageObjects.LoginPage;

public class LoginPageTest extends BaseTest {
	
	
	@Test
	public void LoginTest() throws InterruptedException {		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserNmae(userName);
		lp.setPassword(password);
		lp.clickBtnLogin();
		Thread.sleep(3000);
		HelperClass  hp = new HelperClass(driver);
		hp.clickMenuNavigation("Log Out");
		Thread.sleep(3000);

	}
}
