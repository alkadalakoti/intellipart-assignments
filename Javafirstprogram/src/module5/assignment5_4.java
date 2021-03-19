package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment5_4 {

	public static void main(String[] args) throws InterruptedException {


		//Assignment-4

		//Step-1 Launch Firefox Browser
		//Step-2 Open Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1  in Chrome Browser
		//Step-3 Click on  Click here to show confirm alert Button 
		//Step-4 Get the text displayed on Alert into Console
		//Step-5 Accept  the Web Alert to Delete Account  
		//Step-6 Get the text displayed on Alert into Console 
		//Step-6 Accept the Alert 
		//Step-6 Close Browser

			
		
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		//TC-2	Go to Test URL 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
			driver1.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
			
			//TC-3	Maximize the Browser Window
			driver1.manage().window().maximize();
			Thread.sleep(5000);
			
			//Step-3 Click on  Click here to show confirm alert Button 
			
			driver1.findElement(By.xpath("//button[@onclick='confirmalert()']")).click();
			Thread.sleep(1000);
			driver1.switchTo().alert().accept();
			Thread.sleep(1000);
			String Alert=driver1.switchTo().alert().getText();
			System.out.println(Alert);
			Thread.sleep(1000);
			driver1.switchTo().alert().accept();
			Thread.sleep(1000);
			
	    	
	    	
	    	//clos2e window
			driver.close();
	    	driver1.close();

	}

}
