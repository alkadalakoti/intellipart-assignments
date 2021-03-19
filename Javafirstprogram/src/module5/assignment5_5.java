package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment5_5{

	public static void main(String[] args) throws InterruptedException {

		//Assignment-5

		//Step-1 Launch Firefox Browser
		//Step-2 Open Test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt  in Chrome Browser
		//Step-3 Switch into Frame 
		//Step-3 Click on  Try it  Button 
		//Step-4 Send the text into Alert 
		//Step-5 Accept  the Web Alert 
		//Step-6 Get the text displayed on page into Console 
		//Step-7 Close Browser	
			
		
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		//TC-2	Go to Test URL 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
			driver1.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			
			//TC-3	Maximize the Browser Window
			driver1.manage().window().maximize();
			Thread.sleep(5000);
			
			//frame switching
			 Thread.sleep(500);

		               
				
				
				//Printing the text in inner frame
			  driver1.switchTo().frame("iframeResult");
		               
		
			 
	    	////Step-3 Click on  Try it  Button 
			driver1.findElement(By.xpath("/html/body/button")).click(); 
		        Thread.sleep(2000);
		        
		      //Step-4 Send the text into Alert 
		        driver1.switchTo().alert().sendKeys("harry potter");
		        Thread.sleep(2000);
		    	//Step-5 Accept  the Web Alert 
		        driver1.switchTo().alert().accept();
		        Thread.sleep(2000);
		      //Step-6 Get the text displayed on page into Console 
		        String Alert=driver1.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
				System.out.println(Alert);
				 Thread.sleep(2000);
	    	
	    	//clos2e window
				 driver.close();
			driver1.close();
 }
}
		        
	    	
