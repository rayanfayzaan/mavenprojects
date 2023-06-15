package MyMavenProject.MymavenProject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.BaseTest;
import POM.LoginPage;

public class MainTestPOM extends BaseTest{
	
	
	@BeforeSuite
	public void setup() 
	{
		launchbrowser("chrome");
	}
	
	/*@AfterSuite
	public void teardown()
	{
		driver.close();
	}*/
	@Test
	public void validlog() throws InterruptedException
	{
		LoginPage lgn = new LoginPage(driver);
		lgn.validlogin("automatioantestacademy@gmail.com", "Test@9999");
		Thread.sleep(10000);
	
	}
	

}
