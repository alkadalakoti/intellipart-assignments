package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmet6_1 {

	public static void main(String[] args) throws InterruptedException {
		//Assignment-1

//Test Scenario I:   Actions 
//Step-1 Launch Chrome Browser
//Step-2 Open Test URL https://www.flipkart.com/ 
//Step-3 If found any screen hiding actual page Close the Screen
//Step-4  Move mouse Pointer  towards Women
//Step-5  Click on Shoes
//Step-6 Close Browser    
		
		//TC-1	Go to Test URL 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			//Step-3 If found any screen hiding actual page Close the Screen
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			//Step-4  Move mouse Pointer  towards Women
			Actions builder = new Actions(driver);  

			WebElement Element = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]")); 

			builder.moveToElement(Element, 5, 5).click().build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/footer/div/div[1]/div/div[9]/a[17]")).click();
			Thread.sleep(4000);
		//Scroll from Top to Bottom
			
			JavascriptExecutor  js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
			Thread.sleep(5000);
			//Scroll from  Bottom to Top 
			js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
			Thread.sleep(5000);
			driver.close();
			
			//Step-6 Close Browser    
			//driver.close();
			
 

	}

}
