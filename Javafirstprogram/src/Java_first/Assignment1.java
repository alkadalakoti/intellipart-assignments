package Java_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		
	//TS 1 Open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
        driver1.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(5000);
        driver1.close();
        
	//TS 2 open firefox browser
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(5000);
        driver2.close();
        
		 
		
	//TS 3 Open EDGE browser
		System.setProperty("webdriver.edge.driver","D:\\Automation\\msedgedriver.exe");
		WebDriver driver3=new EdgeDriver();
		driver3.get("https://netbanking.hdfcbank.com/netbanking/");
        driver3.close();
		
	//TS 4 Open IE browser
		System.setProperty("webdriver.ie.driver","D:\\Automation\\IEDriverServer.exe");
		WebDriver driver4=new InternetExplorerDriver();
		driver4.get("https://netbanking.hdfcbank.com/netbanking/");
        driver4.close();
	}
	
}
