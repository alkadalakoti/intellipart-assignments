package Java_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2_1 {

	public static void main(String[] args) throws InterruptedException {
	//TC-1 Launch Chrome Browser 
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		
	//TC-2 Goto Test URL https://www.google.com
		driver2.get("https://www.google.com/");
		
	//TC-3 Specify Wait Time for 5 Sec
		Thread.sleep(5000);
		
		
	//TC-4 Get the Title of Page into Console
		String pageTitle=driver2.getTitle();
        System.out.println(pageTitle);
        
     
     //TC-5 Close the Browser 
        driver2.close();
		
	
		
	}

}
