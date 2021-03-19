package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignmet6_4 {

	public static void main(String[] args) throws InterruptedException {

		// Assignment-4

		 //Test Scenario I:   Actions 
		// Step-1 Launch Chrome Browser
		// Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
		 //Step-3 Drag the Slider up to 50% and drop the Slider  
		// Step-4 Close Browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			//Step-3 Drag the Slider up to 50% and drop the Slider  
			WebElement e=driver.findElement(By.xpath("//div[@id='slider']"));
			
			
			Actions a =new Actions(driver);

			a.dragAndDropBy(e, 50, 0).build().perform();
			
			Thread.sleep(5000);

			JavascriptExecutor  js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(50,document.body.scrollHeight);");
			Thread.sleep(5000);
			//Scroll from  Bottom to Top 
			js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
			Thread.sleep(5000);
			
	        
			
			//Step-6 Close Browser    
			driver.close();
			
 

	}

}
