package module7;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class assignment7_5 {
	public static void main(String[] args) throws InterruptedException, Exception
	{
	
		//Launch Chrome Browser 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Goto Test URL https://www.facebook.com/
		driver.get("https://smallpdf.com/jpg-to-pdf");
		//Maximize Window
		driver.manage().window().maximize();
		
		//Specify Wait Time
		Thread.sleep(5000);
		//click on Signup
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/*")).click();
			Thread.sleep(2000);
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			WebElement elementLocator =driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']"));
			actions.doubleClick(elementLocator).perform();
		//Handling File Upload using Java Robot 
		
		//Getting the path of image into clipboard 
		StringSelection  s=new StringSelection("C:\\1.jpg");
		Thread.sleep(2000);
		//Get data from clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(2000);
		
		//applying java robot
		Robot r=new Robot();
		
		//Perform Paste Operation
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		
		///Perform Enter Operation
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='Convert']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		
		Thread.sleep(9000);
		
		driver.close();
		
}
}
