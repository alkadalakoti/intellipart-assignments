package topic_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {

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
						
				
}
	@Test(priority=2)
	public static  void vpoint1()
	{
		//Verification Point
		String ExpPlaintext="Sauce Labs Backpack";
		String ActPlaintext=login.theItem();
		Assert.assertEquals(ExpPlaintext, ActPlaintext);
		
	}
	@Test(priority=3)
	public static  void clickItem() throws InterruptedException
	{
		Thread.sleep(4000);
		login.click_Item();
		Thread.sleep(4000);
		driver.close();
	}
	
}
