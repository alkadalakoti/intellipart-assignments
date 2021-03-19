package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class assignment1 {
	public WebDriver driver;
	//Write a TestScript to Automate https://www.saucedemo.com/index.html  Login in TestNG
		//-Use Hard Coded Values 
	
	//SwagDemo Login
	
		@Test
		public void asetup() throws InterruptedException
		{


			//TS-1 	Launch Chrome Browser
				
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				 driver=new ChromeDriver();
				
		}
		
		@Test
		public void bgotoURL()
		{
		//TS-2 Goto TestURL 
				driver.get("https://www.saucedemo.com/");
		}
		
		@Test
		public void cmaximizeWindow() throws InterruptedException
		{
		
			//TS-3 Maximize Browser window
				driver.manage().window().maximize();
				Thread.sleep(4000);
		}
				
			@Test	
			public void dtype_UserName() throws InterruptedException	
			{
				//TS-4 
				
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				Thread.sleep(4000);
			
			}
			
			
			@Test
			public void etype_Password() throws InterruptedException
			{
			//TS-5
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				Thread.sleep(4000);
			
			}	
			
			
			@Test
			public void fclick_Login() throws InterruptedException
			{
				//TS-6
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(4000);
			}
			
			
			@Test
			public void gverifyswgDemoLogin() throws InterruptedException
			{
				//TS-7
			
		String ExpURL="inventory.html";
		String ActURL=driver.getCurrentUrl();
				
				System.out.println(ActURL);
				
				
				
				Thread.sleep(4000);
		if(ActURL.contains(ExpURL))
		{
			System.out.println("saucedemo Login sucess -Test Passed");
		}
		else
		{
			System.out.println("Login Failed-Test Failed");
		}
				
				
				Thread.sleep(4000);
			
				
			}	
			
			
			
			
			@Test
			public void hteardown()
			
			{
				//TS-8 	Close Browser 
				driver.close();
			}	
					
		}

