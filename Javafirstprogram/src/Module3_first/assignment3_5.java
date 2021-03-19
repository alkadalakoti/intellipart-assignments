package Module3_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3_5 {

	public static void main(String[] args) throws InterruptedException{
		/*test scenario
		 =====================
		TC-1	Launch Chrome  Browser
TC-2	Go to Test URL  https://www.google.com
TC-3	Maximize the Browser Window
TC-4	Get the URL of Page
TC-5	Navigate to Test URL  https://www.selenium.dev/
TC-6	Get the URL of Page
TC-7	Navigate back to Test URL  https://www.google.com
TC-8    Get the URL of Page 
TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
TC-9    Get the URL of Page 
TC-10	Refresh the Current Page 
TC-11	Get the URL of Page 
TC-12   Close the Browser 

		 */
		
		
		//TC-1	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//TC-2	Go to Test URL  https://www.google.com
			driver.get(" https://www.google.com");
			
			
		//TC-3	Maximize the Browser Window
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
	    // TC-4	Get the URL of Page
			String strUrl = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl);
			
			//TC-5	Navigate to Test URL  https://www.selenium.dev/
			driver.navigate().to("https://www.selenium.dev/");
			
			//TC-6    Get the URL of Page 
			String strUrl1 = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl1);
			
			//TC-7	Navigate back to Test URL  https://www.google.com
			driver.navigate().back();
			
			//TC-8    Get the URL of Page 
			
			String strUrl2 = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl2);
			
			//TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
			driver.navigate().forward();
			//TC-9    Get the URL of Page 
			String strUrl3 = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl3);
			//TC-10	Refresh the Current Page 
			driver.navigate().refresh();
			//TC-11	Get the URL of Page 
			String strUrl4 = driver.getCurrentUrl();
		      System.out.println("Current Url is:"+ strUrl4);
			
			//TC-12   Close the Browser 
			
			driver.close();
		
			
		
		
		
		

	}

}
