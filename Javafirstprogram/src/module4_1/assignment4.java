package module4_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {
	
	public static void main(String[] args) throws InterruptedException
	{
    //Assignment-4
		//1.	Write a Test Script to get no of links available on Facebook Page 
	    // https://www.facebook.com/	
		
		//TC-1	Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				//TC-2	Go to Test URL  https://www.google.com
					driver.get("https://www.facebook.com/");
					
					
				//TC-3	Maximize the Browser Window
					driver.manage().window().maximize();
					Thread.sleep(5000);
					
					//TC-4	Write a Test Script to get no of links available on Facebook Page 
					//webclass and java class combination with the help of size method
					List<WebElement> e=driver.findElements(By.tagName("a"));
					System.out.println(e.size());//to get the count
					//to fetch text of all the links into console
					for(int i=0;i<e.size();i++)
					{
						System.out.println(e.get(i).getText());
					}
					Thread.sleep(2000);
					
					driver.close();
	}
}
