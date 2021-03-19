package Java_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment2_3 {

	public static void main(String[] args) throws InterruptedException {
	//TC-1 Launch Chrome Browser 
		System.setProperty("webdriver.ie.driver","D:\\Automation\\IEDriverServer.exe");
		WebDriver driver4=new InternetExplorerDriver();
		
	//TC-2 Goto Test URL https://www.google.com
		driver4.get("https://www.google.com/");
		driver4.manage().window().maximize();
		
	//TC-3 Specify Wait Time for 5 Sec
	Thread.sleep(5000);
		
		
	//TC-4 Get the Title of Page into Console
		String pageTitle=driver4.getTitle();
        System.out.println(pageTitle);
        
     
     //TC-5 Close the Browser 
        driver4.close();
		
	
		
	}

}
