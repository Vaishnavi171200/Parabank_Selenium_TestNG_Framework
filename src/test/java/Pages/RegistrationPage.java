package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	private WebDriver driver;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(name ="customer.firstName")
	private WebElement FirstName;
	
	@FindBy(name = "customer.lastName")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@id = 'customer.address.street']")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@id = 'customer.address.city']")
	private WebElement City;
	
	@FindBy(name = "customer.address.state")
	private WebElement State;
	
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	private WebElement Zipcode;
	
	@FindBy(xpath = "//input[@id = 'customer.phoneNumber']")
	private WebElement PhoneNumber;
	
	@FindBy(id = "customer.ssn")
	private WebElement SSN;
	
	@FindBy(name = "customer.username")
	private WebElement UserName;
	
	@FindBy(id="customer.password")
	private WebElement Password;
	
	@FindBy(id="repeatedPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement Registerbtn;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void register(String fName, String lName, String addr, String cityName, String stateName,
            String zip, String phoneNum, String ssnNum, String uname, String pwd, String rpwd)
	{
		
		RegisterLink.click();
		FirstName.sendKeys(fName);
		LastName.sendKeys(lName);
		Address.sendKeys(addr);
		City.sendKeys(cityName);
		State.sendKeys(stateName);
		Zipcode.sendKeys(zip);
		PhoneNumber.sendKeys(phoneNum);
		SSN.sendKeys(ssnNum);
		UserName.sendKeys(uname);
		Password.sendKeys(pwd);
		ConfirmPassword.sendKeys(rpwd);
		Registerbtn.click();
	}

}
