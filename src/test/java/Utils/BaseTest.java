package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Declares a public class named BaseTest.Other test classes (like LoginTest, TransferFundsTest) will extend this class to inherit its setup and teardown logic.
public class BaseTest {
	protected WebDriver driver;//protected means child classes can access it directly. This driver will be used to interact with the browser during tests.

	@BeforeMethod //@BeforeMethod is a TestNG annotation that runs before each test method in the class. Ensures a fresh browser session for every test.
	public void setUp()
	{
		driver = DriverFactory.getDriver();//Calls the getDriver() method from your DriverFactory utility
		driver.get("https://parabank.parasoft.com/parabank/index.htm");//Navigates the browser to the ParaBank demo site.

	}
	
	@AfterMethod//@AfterMethod is another TestNG annotation that runs after each test method. Ensures the browser is closed and memory is freed.
	public void tearDown()
	{
		DriverFactory.quitDriver();//Calls the quitDriver() method from DriverFactory. Closes the browser and resets the driver to null.
	}
	
}
