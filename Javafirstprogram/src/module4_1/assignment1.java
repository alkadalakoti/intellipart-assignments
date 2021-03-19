package module4_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		//Assignment-2
		//.	Automate  Oracle  Registration Page in Chrome Browser   
		    //https://profile.oracle.com/myprofile/account/create-account.jspx


		//2.	Automate  dropdowns part of Oracle  Registration Page in Firefox Browser  
		 //   https://profile.oracle.com/myprofile/account/create-account.jspx

		
		//TC-1	Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				//TC-2	Go to Test URL  https://www.google.com
					driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
					
					
				//TC-3	Maximize the Browser Window
					driver.manage().window().maximize();
					Thread.sleep(5000);
					
				//Automate Registration Page
				
	    	   
	    	    	
	    	    	driver.findElement(By.name("email")).sendKeys("alka@gmail.com");
	    	    	driver.findElement(By.name("password")).sendKeys("Bhatt@112");
	    	    	driver.findElement(By.name("retypePassword")).sendKeys("Bhatt@112");
	    	    	
	    	    
	    	    	
	    	    	driver.findElement(By.name("firstName")).sendKeys("alka");
	    	    	driver.findElement(By.name("lastName")).sendKeys("bhatt");
	    	    	driver.findElement(By.name("jobTitle")).sendKeys("Tester");
	    	    	driver.findElement(By.name("workPhone")).sendKeys("Tester");
	    	    	driver.findElement(By.name("companyName")).sendKeys("Tester");
	    	    	driver.findElement(By.name("address1")).sendKeys("Tester");
	    	    	driver.findElement(By.name("city")).sendKeys("Tester");
	    	    
	    	    	driver.findElement(By.name("postalCode")).sendKeys("263601");
	    	    	
	    	    	driver.findElement(By.linkText("Create Account")).click();
	    	    	
	    	    	//Close window
	    	    	driver.close();
					
	    	    
	    	    	
	    	         
	    	    	//TC-1	Launch firefox Browser
	    			System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
	    			WebDriver driver2=new FirefoxDriver();
					
					
					//TC-2	Go to Test URL  https://www.google.com
						driver2.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
						
						
					//TC-3	Maximize the Browser Window
						driver2.manage().window().maximize();
						Thread.sleep(5000);
						
						Select country=new Select(driver.findElement(By.name("country")));
		    	    	country.selectByIndex(1);
		    	    	Thread.sleep(2000);
		    	    	Select state=new Select(driver.findElement(By.name("state")));
		    	    	state.selectByIndex(10);
		    	    	Thread.sleep(500);
						
							    	    	
	    	    	//clos2e window
	    	    	driver2.close();
	    	    	
	    	    	
	    	    	
}
}
