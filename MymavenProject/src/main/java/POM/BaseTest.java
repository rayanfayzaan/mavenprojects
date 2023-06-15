package POM;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public WebDriver launchbrowser(String browser){
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver = new ChromeDriver();
		
		}
		else if(browser.equals("firefox"))
		{
			
			System.setProperty("webdriver.gekco.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		return driver;
	}
	
	
}
