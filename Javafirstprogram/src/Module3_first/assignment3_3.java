package Module3_first;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment3_3 {

	public static void main(String[] args) throws InterruptedException{
		/*test scenario
		 =====================
		
TC-1	Launch Firefox Browser
TC-2	Go to Test URL  https://netbanking.hdfcbank.com/netbanking/
TC-3	Maximize the Browser Window
TC-4	Get the Title of Page
TC-5	Click on knowmore Link Text 
TC-6	Switch from 0th   Window to 1st   Window
TC-7	After Switching Get the Title of Page 
TC-8	Switch from 1sr   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10		Close 0th Window  
		 */
		
		
		//TC-1	Launch firefox Browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		//TC-2	Go to Test URL  https://netbanking.hdfcbank.com/netbanking/
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
			
			
		//TC-3	Maximize the Browser Window
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
	    // TC-4	Get the Title of Page
			String pageTitle1=driver.getTitle();
			System.out.println(pageTitle1);
			Thread.sleep(5000);
			String parent_window = driver.getWindowHandle();
			driver.switchTo().frame("login_page");
			driver.findElement(By.xpath("//span[text()='Transfer Money']/following::*[1]")).click();
			Thread.sleep(5000);
			Set<String> window = driver.getWindowHandles();
//			System.out.println(window);
			Thread.sleep(50000);
			for (String window1:window)
				if (!parent_window.equals(window1))
				{
					driver.switchTo().window(window1);
					System.out.println(driver.getTitle());
					Thread.sleep(5000);
				}
			System.out.println(driver.switchTo().window(parent_window).getTitle());
			
		       // TC-10		Close 0th Window  
			    driver.close();
			
			
		
			
		
		
		
		

	}

}
