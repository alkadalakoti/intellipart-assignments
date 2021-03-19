package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmet6_3 {

	public static void main(String[] args) throws InterruptedException {

		  //Assignment-3

		//Test Scenario I:   Actions 
		//Step-1 Launch Chrome Browser
		//Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
		//Step-3 Right  Click on Double-Click Me To See Alert Button  
		//Step-4 Close Browser

		//TC-1	Go to Test URL 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			 //Step-4  Double Click on Double-Click Me To See Alert Button  to generate Alert
			Actions actions = new Actions(driver);
			WebElement elementLocator = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
			actions.doubleClick(elementLocator).perform();
			
			Thread.sleep(2000);
			//Switch to the alert box and click on OK button
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert Text\n" +alert.getText());
			alert.accept();
			//Step-6 Close Browser    
			driver.close();
			
 

	}

}
