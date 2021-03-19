package topic_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestCase2 {
	
	static LoginPage login;
	static WebDriver driver;
	
	
	@Test(priority=1)
	public static void myTest() throws InterruptedException
	{
		//TS-1 	Launch Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		 driver=new ChromeDriver();
	//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://www.saucedemo.com/index.html");
		
	//TS-3 Maximize Browser window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Fill UserNAme Textbox
		login=new LoginPage(driver);
		Thread.sleep(4000);
		login.type_UserName("standard_user");
		Thread.sleep(4000);
		login.type_Password("secret_sauce");
		Thread.sleep(4000);
		login.click_Login();
		Thread.sleep(4000);

	//Verification Point
		String ExpPlaintext="Products";
		String ActPlaintext=login.thePlaintext();
		Assert.assertEquals(ExpPlaintext, ActPlaintext);
		
		driver.close();
	}
	
	

}
