package com.WebTAproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginPageTest extends BaseTest {
	
//	WebDriver driver;
	
	@Test
	public void LoginTest() {
		
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		driver = new ChromeDriver(options);
//		//driver.get(baseURL);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.navigate().to("http://demo.guru99.com/V1/index.php");
		
//		setup();
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserNmae("mngr298452");
		lp.setPassword("AzYsupu");
		lp.clickBtnLogin();
		
//		tearDown();
		
//		driver.close();
//		driver.quit();
		//lp.loginWithValidUser("mngr298452","AzYsupu");
	}
}
