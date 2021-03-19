package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment5_2 {

	public static void main(String[] args) throws InterruptedException {


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
		
    	
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dalakoti91@gmail.com");
    	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("alka@1989");
    	driver.findElement(By.xpath("//*[text()='Log In']")).click();
    	Thread.sleep(5000);
    	
    	//clos2e window
    	driver.close();

		

		
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		
		
		//TC-2	Go to Test URL 
			driver2.get("https://www.facebook.com/");
			
			//TC-3	Maximize the Browser Window
			driver2.manage().window().maximize();
			Thread.sleep(5000);
			
			driver2.findElement(By.xpath("//input[@id='email']")).sendKeys("dalakoti91@gmail.com");
	    	driver2.findElement(By.xpath("//input[@id='pass']")).sendKeys("alka@1989");
	    	driver2.findElement(By.xpath("//*[text()='Log In']")).click();
	    	Thread.sleep(5000);
	    	
	    	//clos2e window
	    	driver2.close();

	}

}
