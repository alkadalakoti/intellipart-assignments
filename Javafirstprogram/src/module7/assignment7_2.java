package module7;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class assignment7_2 {
	public static void main(String[] args) throws InterruptedException, Exception
	{
	// Assignment-2

		 //Test Scenario I:---File Download  
		// Step-1 Launch Firefox Browser
		// Step-2 Open Test URL https://www.selenium.dev/downloads/
		// Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
		 //Step-4 Automate File Download    
		 //Step-5 Close Browser
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			
			// Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
			
			driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
			Thread.sleep(5000);
			
			
			
			//applying java robot
			Robot r=new Robot();
			
			//Perform Paste Operation
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
			
			///Perform Enter Operation
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(8000);
		
			
			driver.close();
}
}
