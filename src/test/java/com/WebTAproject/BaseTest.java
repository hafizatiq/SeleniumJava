package com.WebTAproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

	public String baseURL = "http://demo.guru99.com/V1/index.php";
	public String userName ="mngr298452";
	public String password ="AzYsupu";
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
