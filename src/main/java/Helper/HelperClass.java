package Helper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HelperClass {

	static WebDriver ldriver;
	static WebDriverWait wait;
		
	public HelperClass(WebDriver rdriver) {  
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	public void clickMenuNavigation(String navMenuName) {

		java.util.List<WebElement> links = ldriver.findElements(By.tagName("li"));
		for (WebElement elem : links)
			if (elem.getAttribute("innerHTML").contains(navMenuName)) {
				elem.click();
				break;
			}
	}
	
	public void acceptAlert() {
		
		ldriver.switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		
		ldriver.switchTo().alert().dismiss();
	}
	 
	public String getAlertText() {
		
		return ldriver.switchTo().alert().getText().toString();
	}
	
	
	
	
}
