package module7;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.glass.events.KeyEvent;

public class assignment7_1 {
	public static void main(String[] args) throws InterruptedException, Exception
	{
		 //Assignment-1

		 //Test Scenario I:  File Upload
		// Step-1 Launch Chrome Browser
		// Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		// Step-3 Click on ChooseFile Button
		 //Step-4 Automate Window Alert by Uploading File   
		 //Step-5 Close Browser
		// Step-1 Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://smallpdf.com/word-to-pdf");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
			Thread.sleep(5000);

			//Put data into clipboard

			StringSelection s=new  StringSelection("C:\\1.docx");


			//Send the data from clipboard to scrren
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);


			//Using Java Robot


			Robot r=new Robot();

			Thread.sleep(3000);


			//Paste 
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//Java Wait 
			Thread.sleep(8000);




			//implicit wait 

			/*  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);*/


			//Explicit wait

			/*   WebDriverWait w=new WebDriverWait(driver,100);

				      w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));


			 */







			//Fluent Wait
			//Wait <WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(100, TimeUnit.SECONDS) .pollingEvery(3, TimeUnit.SECONDS);

			//w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));



			///invisibilityOfElementLocated(By.className("raDiv"))); 


			driver.findElement(By.xpath("//span[@class='wnolmd-2 etrSPs']")).click();

			Thread.sleep(5000);

			driver.close();

}
}
