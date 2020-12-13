package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	
	private WebDriver ldriver;
	
	public AddCustomer(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name = "name") WebElement txtCustName;
	@FindBy(css = "input[type=radio]:nth-child(1)") WebElement radioGenderMale;
	@FindBy(css = "input[type=radio]:nth-child(2)") WebElement radioGenderFemale;
	@FindBy(id = "dob") WebElement dateOfBirth;
	@FindBy(name = "addr") WebElement custAddress;
	@FindBy(name = "city") WebElement custCity;
	@FindBy(name = "state") WebElement custState;
	@FindBy(name = "pinno") WebElement custPin;
	@FindBy(name = "telephoneno") WebElement custPhoneNumber;
	@FindBy(name = "emailid") WebElement custEmailID;
	@FindBy(name = "sub") WebElement btnSubmit;
	
	public void addCustomerName(String name) {
		txtCustName.sendKeys(name);
		
	}
	
	public void selectCustomerGender(String gender){
		
		if(gender == "Male") {
		radioGenderMale.click();
		}
		
		else if(gender =="Female") {
			radioGenderFemale.click();
		}
		
	}
	public void enterDateOfBirth(String dd, String mm, String yyyy) {
		
	dateOfBirth.sendKeys(dd);
	dateOfBirth.sendKeys(mm);
	dateOfBirth.sendKeys(yyyy);
	}
	
	public void enterCustomerAddress(String address) {
		custAddress.sendKeys(address);
		
	}
	
	public void addCustomerCity(String city) {
		
		custCity.sendKeys(city);
	}
	
	public void addCustomerState(String state) {
		
		custState.sendKeys(state);
	}
	
	public void addCustomerPin(String pin) {
		custPin.sendKeys(pin);
	}
	
	public void addCustomerPhoneNumber(String phone) {
		custPhoneNumber.sendKeys(phone);
	}
	
	public void addCustomerEmailID(String email) {
		custEmailID.sendKeys(email);
		
	}
	
	public void addCustomerPassowrd(String password) {
		custEmailID.sendKeys(password);
		
	}
	
	public void clickSubmitButton() {
		btnSubmit.click();
		
	}
	
	

}
