package module4_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {
	
	public static void main(String[] args) throws InterruptedException
	{
    //Assignment-3
		//1.	Automate Facebook Registration Page  using Absolute X-path in Chrome Browser
	     //https://www.facebook.com/	
		 
		
		//TC-1	Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				//TC-2	Go to Test URL  https://www.google.com
					driver.get("https://www.facebook.com/");
					
					
				//TC-3	Maximize the Browser Window
					driver.manage().window().maximize();
					Thread.sleep(5000);
					
				//Automate Facebook Registration Page
					
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
	    	    	Thread.sleep(1000);
	    	    	
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("alka");
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("bhatt");
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("8860538699");
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("alka@1009");
	    	    	Select day=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[1]")));
	    	    	day.selectByValue("23");
	    	    	Thread.sleep(500);
	    	    	
	    	    	Select month=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[2]")));
	    	    	month.selectByIndex(7);
	    	    	Thread.sleep(500);
	    	    	
	    	    	Select year=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[2]/span[1]/span[1]/select[3]")));
	    	    	year.selectByVisibleText("2002");
	    	    	Thread.sleep(500);
	    	    	
	    	    	//click on radio button
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/label[1]")).click();
	    	    	Thread.sleep(500);
	    	    	//click on submit
	    	   
	    	    	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]")).click();
	    	         
	    	    
	    	    	
	    	    	//clos2e window
	    	    	driver.close();
	    	    	
	    	    	
	    	    	
}
}
