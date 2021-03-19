package Java_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Module2_Assignment3 {
	
	public static void main(String[] args) throws InterruptedException {
	//TC-1 Launch Firefox Browser 
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
				
	//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.google.com/");
				
		//TC-3 Specify Wait Time for 5 Sec
			Thread.sleep(500);
				
		//TC-4 Get the Title of Page into Console
				String pageTitle=driver.getTitle();
		        System.out.println(pageTitle);
		     
		//TC-5 Close the Browser 
		        driver.close();
				

	}

}
