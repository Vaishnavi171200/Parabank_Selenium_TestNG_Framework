package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//All interactions related to login are defined here.
public class LoginPage {
	
	private WebDriver driver;//used to locate and interact with web elements on the login page : Private is to ensure encapsulation
	
//@FindBy annotation to locate the username/password/loginbtn input field by its name/xpath attribute via page factory
//Automatically initializes this element when the page is loaded.
//WebElement represents the actual input box.

	@FindBy(name = "username")
	private WebElement usernameField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(xpath ="//input[@value='Log In']")
	private WebElement loginButton;
    
	
	public LoginPage(WebDriver driver)//Constructor for the login page class that accepts a WebDriver instance from the test class
	{
		this.driver=driver; // assigns the passed-in driver to the class level driver variable this allows the page class to use the same browser session as the test
		PageFactory.initElements(driver, this); // Initialises all the @findBy method annotated elements in this class
	}
	
	public void login(String username, String password)// To perform the login action using page elements
	{
		usernameField.sendKeys("Srija");
		passwordField.sendKeys("Srija@123");
		loginButton.click();
	}
}
