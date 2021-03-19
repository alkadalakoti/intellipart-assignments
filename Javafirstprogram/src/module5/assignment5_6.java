package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment5_6{

	public static void main(String[] args) throws InterruptedException {

		//Assignment-6
		//Step-1 Launch ChromeBrowser
		//Step-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  in Chrome Browser
		//Step-3 Switch into 0th  Frame 
		//Step-3 Get plain text into Console You've found my HTML tutorial site, which is my final year computing project.
		//Step-4 Switch into 1st  Frame
		//Step-5 Clear text from Browser and versions: Text box 
		//Step-6 Send text into Browser and versions: Text box 
		//Step-7 Get given input into Console from Browser and versions: Text Box 
	       // Step-8 Switch into 2nd  Frame
	       // Step-9 Get plain text into Console A Tag in HTML denotes certain.............
	       // Step-10 Close Browser  
		//TC-1	Launch firefox Browser
				System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("http://www.google.com");
		
		//TC-2	Go to Test URL 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
			driver1.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
			
			//TC-3	Maximize the Browser Window
			driver1.manage().window().maximize();
			Thread.sleep(1000);
			//switch into Frame to perform operation on elements inside a frame 
			driver1.switchTo().frame(0);
			
			String text=driver1.findElement(By.xpath("//p[contains(text(),'my HTML tutorial')]")).getText();
			System.out.println(text);
			
			// To perform switching from one frame to another frame we need to switch into defaultcontent/topwindow 
			driver1.switchTo().defaultContent();
			//  switch into Frame1 to perform operation on elements inside a frame 
			driver1.switchTo().frame(1);
			WebElement textbox=driver1.findElement(By.xpath("//textarea[@name='browser']"));
			textbox.clear();
			Thread.sleep(5000);
			textbox.sendKeys("Alka dalakoti*****************");
			Thread.sleep(5000);
			
			
		// To perform switching from one frame to another frame we need to switch into defaultcontent/topwindow 
					driver1.switchTo().defaultContent();
		//  switch into Frame2 to perform operation on elements inside a frame 
					driver1.switchTo().frame(2);
			
			WebElement para=driver1.findElement(By.xpath("//font[contains(text(),'elements such as')]"));
			String paratext=para.getText();
			System.out.println(paratext);
			Thread.sleep(5000);
			driver.close();
			
		
	}
			
	}  	
