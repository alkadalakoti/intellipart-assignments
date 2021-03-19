package module7;//a[contains(text(),'sikulixide-2.0.5.jar')]

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class assignment7_3 {
	public static void main(String[] args) throws InterruptedException, Exception
	{
	
		//Assignment-3

		//Test Scenario I:
		//Test Scenario IV:---File Download
		//1. Launch https://launchpad.net/sikuli  in Firefox Browser
		//2. Click  on sikulixsetup-1.1.2.jar  to Download
		//3. Go to Window Alert and Select  Save 
		//4. Specify Wait  
		//5. Close Site

		
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://launchpad.net/sikuli");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			//2. Click  on sikulixsetup-1.1.2.jar  to Download
			driver.findElement(By.xpath("//a[contains(text(),'sikulixide-2.0.5.jar')]")).click();
			Thread.sleep(1000);
			//3. Go to Window Alert and Select  Save    
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
		
			
		        

					 //Step-5 Close Browser
					driver.close();
}
}
