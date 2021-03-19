package Java_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
	//TC-1 Launch Chrome Browser 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//TC-2 Goto Test URL https://www.google.com
		driver.navigate().to("https://www.google.com/");
		
	//TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(5000);
		
		
	//TC-4 Get the Title of Page into Console
		String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        
     
     //TC-5 Close the Browser 
        driver.close();
		
	
		
	}

}
