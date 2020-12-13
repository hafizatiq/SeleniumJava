package com.WebTAproject;

import org.testng.annotations.Test;
import Helper.HelperClass;
import PageObjects.AddCustomer;
import PageObjects.LoginPage;

public class AddCustomerTest extends BaseTest{
	
	@Test
	public void addCustomerTest() {
		
		LoginPage lp = new LoginPage(driver);
        lp.setUserNmae(userName);
		lp.setPassword(password);
		lp.clickBtnLogin();
		HelperClass hp = new HelperClass(driver);
		hp.clickMenuNavigation("New Customer");
		AddCustomer addCust = new AddCustomer(driver);
		addCust.addCustomerName("Test Customer");
		addCust.selectCustomerGender("Male");
		addCust.enterDateOfBirth("01", "01", "1990");
		addCust.enterCustomerAddress(" 13 abd road, 12345");
		addCust.addCustomerCity("New York");
		addCust.addCustomerState("New York");
		addCust.addCustomerPin("123456");
		addCust.addCustomerPhoneNumber("0123456798");
		addCust.addCustomerEmailID("abc@test.com");
		addCust.addCustomerPassowrd("test1234");
		addCust.clickSubmitButton();
		hp.acceptAlert();	 		
	}

}
