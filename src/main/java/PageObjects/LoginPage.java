package PageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver ldriver;
	private WebDriver wait;
		
	public LoginPage(WebDriver rdriver) {
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "uid") WebElement txtUserName;
	@FindBy(name = "password") WebElement txtpassword;
	@FindBy(name = "btnLogin") WebElement btnLogin;
	
	public void setUserNmae(String uName){
		txtUserName.sendKeys(uName);
	}
	
	public void setPassword(String uPassword) {
		
		txtpassword.sendKeys(uPassword);
	}
	
	public void clickBtnLogin() {
		
		btnLogin.click();
	}

}
