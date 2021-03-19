package module7;//a[contains(text(),'sikulixide-2.0.5.jar')]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment7_4 {
	public static void main(String[] args) throws InterruptedException, Exception
	{
	
		// Assignment-4

		 //Test Scenario I:---File Download  
		// Step-1 Launch Firefox Browser
		// Step-2 Open Test URL https://www.selenium.dev/downloads/
		// Step-3 In table Selenium Client & WebDriver Language Bindings, automate the plain text   
		 //Step-4 Get the plain text Java , Python  into Console   
		// Step-5 Close Browser

		
		//TC-1	Launch firefox Browser
		//TC-1	Launch firefox Browser
				System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.selenium.dev/downloads/");
					Thread.sleep(1000);
					driver.manage().window().maximize();
					
					// Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
					
					WebElement text=driver.findElement(By.xpath("//p[contains(text(),'In order to create scripts that interact with the ')]"));
					String paratext=text.getText();
					System.out.println(paratext);
					Thread.sleep(2000);
					 //Step-4 Get the plain text Java , Python  into Console   
					WebElement para=driver.findElement(By.xpath("//body/div[@class='container basic dark-background']/table[@class='data-list']/tbody/tr[2]/td[1]"));
					String paratext2=para.getText();
					System.out.println(paratext2);
					Thread.sleep(5000);

					 //Step-5 Close Browser
					driver.close();
}
}
