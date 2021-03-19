package module8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment8_4 {
	public WebDriver driver;
		// Assignment-4
		 
		// Write a Test Script to Automate Way2sms Login using Page Object Model 
		 
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
		//TS-2 Goto TestURL https://www.facebook.com/
				driver.get("http://way2sms.com/Login");
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
				
				driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("8860538699");
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
				driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
				Thread.sleep(4000);
			}
			
			
			
			@Test
			public void hteardown()
			
			{
				//TS-8 	Close Browser 
				driver.close();
			}	
					
		}



