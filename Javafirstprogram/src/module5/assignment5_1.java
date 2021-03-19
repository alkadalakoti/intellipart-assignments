package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5_1 {

	public static void main(String[] args) throws InterruptedException {
		// Assignment-1
		//1.	Automate Facebook Registration Page  using Relative X-path  in 2 different  Browsers
		//https://www.facebook.com/  

			// Assignment-2
			//1.	Automate Facebook Login Page  using Relative X-path  in 2 different  Browsers
			//https://www.facebook.com/    

				//Assignment-3
				//	Automate Facebook Login Page  using Relative X-path Axis   in 2 different  Browsers
				// https://www.facebook.com/  

				//TC-1	Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();


		//TC-2	Go to Test URL 
		driver.get("https://www.facebook.com/");
		
	  	driver.findElement(By.partialLinkText("//a[@id='u_0_2_VJ']")).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("//input[@id='u_30_b_03']")).sendKeys("alka");
    	driver.findElement(By.xpath("//input[@id='u_30_d_y3']")).sendKeys("bhatt");
    	driver.findElement(By.xpath("//input[@id='u_30_g_LZ']")).sendKeys("8860538699");
    	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("alka@1009");
    	Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
    	day.selectByValue("30");
    	Thread.sleep(500);
    	
    	
         
    	
    	Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
    	month.selectByIndex(7);
    	Thread.sleep(500);
    	
    	Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
    	year.selectByVisibleText("2002");
    	Thread.sleep(500);
    	
    	//click on radio button
    	driver.findElement(By.xpath("//*[@id='u_30_2_EH']")).click();
    	Thread.sleep(500);
    	//click on submit
   
    	driver.findElement(By.xpath("//button[@id='u_30_s_jo']")).click();
    	
    	//clos2e window
    	driver.close();

		

		
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		
		
		//TC-2	Go to Test URL 
			driver2.get("https://www.facebook.com/");
			
			//TC-3	Maximize the Browser Window
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.partialLinkText("//a[@id='u_0_2_VJ']")).click();
	    	Thread.sleep(1000);
	    	
	    	driver.findElement(By.xpath("//input[@id='u_30_b_03']")).sendKeys("alka");
	    	driver.findElement(By.xpath("//input[@id='u_30_d_y3']")).sendKeys("bhatt");
	    	driver.findElement(By.xpath("//input[@id='u_30_g_LZ']")).sendKeys("8860538699");
	    	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("alka@1009");
	    	Select day1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
	    	day1.selectByValue("30");
	    	Thread.sleep(500);
	    	
	    	
	         
	    	
	    	Select month1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
	    	month1.selectByIndex(7);
	    	Thread.sleep(500);
	    	
	    	Select year1=new Select(driver.findElement(By.xpath("//select[@id='year']")));
	    	year1.selectByVisibleText("2002");
	    	Thread.sleep(500);
	    	
	    	//click on radio button
	    	driver.findElement(By.xpath("//*[@id='u_30_2_EH']")).click();
	    	Thread.sleep(500);
	    	//click on submit
	   
	    	driver.findElement(By.xpath("//button[@id='u_30_s_jo']")).click();
	    	
	    	//clos2e window
	    	driver.close();

	}

}
