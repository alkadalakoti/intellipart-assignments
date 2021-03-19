package module4_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {
	
	public static void main(String[] args) throws InterruptedException
	{
		//Assignment-5
		//1. Write a TestScript for  following

		 // TC-1 Launch Chrome Browser 
		  //TC-2 Goto Facebook Registration Page       
		  //TC-3 Fill FirstName TextBox with Input
		 // TC-4 Clear the input from  FirstName TextBox
		 // TC-5 Again Fill the  FirstName TextBox with Input
		  //TC-6 Get the Input from TextBox  and display it in Console 
		//  TC-6 Close Browser 
		 
		
		//TC-1	Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				//TC-2	Go to Test URL 
					driver.get("https://www.facebook.com/");
					
					
				//TC-3	Maximize the Browser Window
					driver.manage().window().maximize();
					Thread.sleep(5000);
					
				//Automate Facebook Registration Page
					
	    	    	driver.findElement(By.partialLinkText("Create")).click();
	    	    	Thread.sleep(1000);
	    	    	
	    	    	//TC-3 Fill FirstName TextBox with Input
	    	    	
	    	    	WebElement firstname=driver.findElement(By.name("firstname"));
	    	    	firstname.sendKeys("Alka");
	    	    	
	    	    	Thread.sleep(2000);
	    	    	
	    	    	// TC-4 Clear the input from  FirstName TextBox
	    	    	firstname.clear();
	    	    	Thread.sleep(2000);
	    	    	 // TC-5 Again Fill the  FirstName TextBox with Input
	    	    	WebElement firstname1=driver.findElement(By.name("firstname"));
	    	    	firstname1.sendKeys("Alka");
	    	    	
	    	    	
	    	    	  //TC-6 Get the Input from TextBox  and display it in Console 
	    	    	
	    	    	String val = firstname1.getAttribute("value");
	    	        System.out.println("Entered text is: " + val);
	    	    	System.out.println(firstname1.isDisplayed());
	    	    	
	    	    	
	    	    //  TC-6 Close Browser 
	    	    	driver.close();
	    	    	
	}
}