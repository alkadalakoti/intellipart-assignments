package topic_ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadProperties {
	static WebDriver driver;
	
	@Test
	public void swagDemoPage() throws IOException, InterruptedException
	{
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("D:/Automation/newproject/src/test/config.properties");
		prop.load(ip);
		System.out.println("name");
		/*System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));*/
		//Name
		String Name=prop.getProperty("name");
		System.out.println(Name);
		
		//Age
		String Age=prop.getProperty("age");
		System.out.println(Age); 
		//URL
				String URL=prop.getProperty("url");
				System.out.println(URL);
				//Browser
				String BrowserName=prop.getProperty("browser");
				System.out.println(BrowserName);
				
				 if(BrowserName.equalsIgnoreCase("Chrome"))
				  {
					//Launch Chrome Browser 
						System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
						 driver=new ChromeDriver();
						 System.out.println("Launched Chrome Browser");
					
				  }
				  else if(BrowserName.equalsIgnoreCase("ff"))
				  {
					//Launch Chrome Browser 
						System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
						 driver=new FirefoxDriver();
						 System.out.println("Launched Firefox Browser");
						
				  }
				  else if(BrowserName.equalsIgnoreCase("edge"))
				  {
					//Launch Chrome Browser 
						System.setProperty("webdriver.edge.driver","D:\\Automation\\edgedriver.exe");
						 driver=new EdgeDriver();
						 System.out.println("Launched Edge Browser");
						 
				  }
				  
				 
				  driver.get(URL);
				  Thread.sleep(4000);
				  //Fill UserName TextBox
				  
				  driver.findElement(By.name(prop.getProperty("UserNameField"))).sendKeys(prop.getProperty("username"));
				  Thread.sleep(4000);
				  //Fill Password TextBox
				  driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
				  Thread.sleep(4000);
				//Click on Login TextBox
				  driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click();
				  Thread.sleep(4000);
				  
driver.close();
		
	}

}
