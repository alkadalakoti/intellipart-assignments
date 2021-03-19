package allClassFilesHere;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6_Test_BM_AM {
	public WebDriver driver;
	
	//SwagDemo Login
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{


		//TS-1 	Launch Chrome Browser
			
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			 driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException

	{
		
	Thread.sleep(5000);
		
	driver.close();
	
	}
	
	
	
	@Test(priority=1)
	public void verifyswagDemo() throws InterruptedException
	{

		//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://www.saucedemo.com");
		
	//TS-3 Maximize Browser window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		String ExpTitle="Swag Labs";
		String ActTitle=driver.getTitle();
				
				System.out.println(ActTitle);	
				Assert.assertEquals(ActTitle, ExpTitle);	
				
	}
	
	
	@Test(priority=2)
	public void verifyFBTitle() throws InterruptedException
	{

		//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
	//TS-3 Maximize Browser window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		String ExpTitle="Facebook � log in or sign up";
		String ActTitle=driver.getTitle();
				
				System.out.println(ActTitle);	
				Assert.assertEquals(ActTitle, ExpTitle);	
				
	}
	
	
	@Test(priority=3)
	public void verifySeleniumTitle() throws InterruptedException
	{

		//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://www.selenium.dev/");
		
	//TS-3 Maximize Browser window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		String ExpTitle="SeleniumHQ Browser Automation";
		String ActTitle=driver.getTitle();
				
				System.out.println(ActTitle);	
				Assert.assertEquals(ActTitle, ExpTitle);	
				
	}
	
			
				

			
				
	}


