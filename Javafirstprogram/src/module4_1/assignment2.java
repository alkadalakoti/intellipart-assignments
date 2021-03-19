package module4_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {
	
	public static void main(String[] args) throws InterruptedException
	{
    //1.	Automate Facebook Registration Page  using Direct Locator's in Chrome Browser
	     //https://www.facebook.com/
	    	 //2.	Automate dropdowns part of Facebook Registration Page  using Direct Locator's in firefox Browser 
	    	   // https://www.facebook.com/
		
		//TC-1	Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				//TC-2	Go to Test URL  https://www.google.com
					driver.get("https://www.facebook.com/");
					
					
				//TC-3	Maximize the Browser Window
					driver.manage().window().maximize();
					Thread.sleep(5000);
					
				//Automate Facebook Registration Page
					
	    	    	driver.findElement(By.partialLinkText("Create")).click();
	    	    	Thread.sleep(1000);
	    	    	
	    	    	driver.findElement(By.name("firstname")).sendKeys("alka");
	    	    	driver.findElement(By.name("lastname")).sendKeys("bhatt");
	    	    	driver.findElement(By.name("reg_email__")).sendKeys("8860538699");
	    	    	driver.findElement(By.id("password_step_input")).sendKeys("alka@1009");
	    	    	Select day=new Select(driver.findElement(By.name("birthday_day")));
	    	    	day.selectByValue("30");
	    	    	Thread.sleep(500);
	    	    	
	    	    	
	    	         
	    	    	//TC-1	Launch firefox Browser
	    			System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
	    			WebDriver driver2=new FirefoxDriver();
					
					
					//TC-2	Go to Test URL  https://www.google.com
						driver2.get("https://www.facebook.com/");
						
						
					//TC-3	Maximize the Browser Window
						driver2.manage().window().maximize();
						Thread.sleep(5000);
						
						//Automate Facebook Registration Page
						
		    	    	driver2.findElement(By.partialLinkText("Create")).click();
		    	    	Thread.sleep(1000);
	    	    	
	    	    	Select month=new Select(driver2.findElement(By.name("birthday_month")));
	    	    	month.selectByIndex(7);
	    	    	Thread.sleep(500);
	    	    	
	    	    	Select year=new Select(driver2.findElement(By.name("birthday_year")));
	    	    	year.selectByVisibleText("2002");
	    	    	Thread.sleep(500);
	    	    	
	    	    	//click on radio button
	    	    	driver2.findElement(By.name("sex")).click();
	    	    	Thread.sleep(500);
	    	    	//click on submit
	    	   
	    	    	driver2.findElement(By.name("websubmit")).click();
	    	    	
	    	    	//clos2e window
	    	    	driver2.close();
	    	    	
	    	    	
	    	    	
}
}
