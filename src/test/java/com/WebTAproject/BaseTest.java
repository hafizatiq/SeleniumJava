package com.WebTAproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.TestConfig.readTestConfig;


public class BaseTest {
	
	readTestConfig rtc = new readTestConfig();

	public String baseURL = rtc.getURL();//"http://demo.guru99.com/V1/index.php"; 
	public String userName =rtc.getUserName();
	public String password =rtc.getPassword();
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",rtc.getChromeDriver());
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
