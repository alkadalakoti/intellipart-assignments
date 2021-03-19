package allClassFilesHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_ChromeBrowser {

	public static void main(String[] args) {
		
		
	/*	TestScenario
		************
		Launch Chrome Browser
		Goto TestURL https://www.facebook.com/
		Maximize Browser window
		Get the Title of page
		Get Current URL of Page
		Click on Create New Account 
		Complete Registration From
		Close Browser 
	*/
	//TS-1 	Launch Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
	//TS-3 Maximize Browser window
		driver.manage().window().maximize();
		
	//TS-4 Get the Title of page
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
	//TS-5 	Get Current URL of Page
		String urlofPage=driver.getCurrentUrl();
		System.out.println(urlofPage);
	//TS-6 	Close Browser 
		driver.close();
		
		
		
		
	}

}
