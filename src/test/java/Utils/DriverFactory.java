package Utils;

//Imports Selenium's core WebDriver interface and the ChromeDriver class to launch and control the Chrome browser..import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; //Eliminates the need to manually manage chromedriver.exe

public class DriverFactory //This class will contain methods to create and manage the WebDriver instance.
{
	private static WebDriver driver;//Declares a static WebDriver variable.

	public static WebDriver getDriver() //static method that returns the WebDriver instance.
	{
		if(driver==null) //Prevents multiple browser instances from being created.
		{
			WebDriverManager.chromedriver().setup(); //Automatically downloads and sets up the correct version of ChromeDriverEnsures compatibility with your installed Chrome browser. Ensures compatibility with your installed Chrome browser. 
			driver = new ChromeDriver();//Instantiates the Chrome browser and Assigns it to the driver variable.
			driver.manage().window().maximize();//Assigns it to the driver variable.
		}
		return driver;//Returns the initialized WebDriver instance to the calling method.
	}
	public static void quitDriver()//A method to close and clean up the browser session.
	{
		if(driver!=null)//Checks if the driver is active before trying to quit it.
		{
			driver.quit();//Closes all browser windows and ends the WebDriver session.
			driver=null;//Resets the driver to null so it can be reinitialized later if needed.
		}
	}
}
