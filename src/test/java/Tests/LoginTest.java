package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;//Imports TestNG’s Assert class.
import org.testng.annotations.Test; //Imports the @Test annotation from TestNG. Marks methods that should be executed as test cases.

import Pages.LoginPage; //Allows you to use LoginPage class's login() method to interact with the login screen
import Utils.BaseTest; //gives the test access to browser setup and teardown logic.

//inherits the driver and @BeforeMethod/@AfterMethod setup from BaseTest class.
public class LoginTest extends BaseTest{

	@Test //Marks the following method as a TestNG test case.
	public void testValidLogin() //This method will perform the login test using valid credentials.
	{
		LoginPage loginpage = new LoginPage(driver);//Creates an instance of LoginPage, passing the driver from BaseTest.
		loginpage.login("Srija", "Srija@123");//Calls the login() method from LoginPage, entering the username and password.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Accounts Overview')]")));
	    
	    //Validates that the login was successful by checking if the page contains the text "Accounts Overview". If this condition is false, the test will fail.
		Assert.assertTrue(driver.getPageSource().contains("Accounts Overview"));
	}
}
