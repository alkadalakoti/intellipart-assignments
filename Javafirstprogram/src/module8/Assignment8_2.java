package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_2 {

	public static void main(String[] args) throws InterruptedException, Exception {
		//Assignment-2

		//Test Scenario I:  File Upload
		//Step-1 Launch Chrome Browser
		//Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		//Step-3 Click on ChooseFile Button
		//Step-4 Automate Window Alert by Uploading File  
		//Step-5 Specify implicit Wait to Complete file Conversion and Download button get's displayed 
		//Step-6 Click on Download Button
		//Step-5 Close Browser

		//Step-1 Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://smallpdf.com/word-to-pdf");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/*")).click();
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

			//Step-5 Close Browser
			driver.close();
			
	}

}
