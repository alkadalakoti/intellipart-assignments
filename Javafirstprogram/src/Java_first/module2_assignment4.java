package Java_first;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class module2_assignment4 {

	public static void main(String[] args) throws InterruptedException{
		//TC-1 Launch Internet Explorer 
		      System.setProperty("webdriver.ie.driver","D:\\Automation\\IEDriverServer.exe");
		       WebDriver driver=new InternetExplorerDriver();
						
			//TC-2 Goto Test URL https://www.google.com
				driver.get("https://www.google.com/");
						
				//TC-3 Specify Wait Time for 5 Sec
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
				//TC-4 Get the Title of Page into Console
						String pageTitle=driver.getTitle();
				        System.out.println(pageTitle);
				        
				        
				//TC-5 Close the Browser 
				        driver.close();
						

	}

}
