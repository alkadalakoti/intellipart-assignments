package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginpage {
	//Assignment-2
	//Write a TestScript to Automate https://www.saucedemo.com/index.html Login in TestNG
		//-Apply Data Driven Testing Framework 
		//-Use JXL jar File 
	
		
		WebDriver driver;
		//Specify the object/Element Locators
		By UserNameField=By.xpath("//input[@id='user-name']");
		By PwdField=By.xpath("//input[@id='password']");
		By login=By.xpath("//input[@id='login-button']");
	    By plaintext=By.xpath("//div[@class='product_label']");
	    By itemName=By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
	    By clickitemName=By.xpath("//div[text()='Sauce Labs Backpack']");
				

		
		
		
		public Loginpage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		public void setup() throws InterruptedException
		{
			//TS-1 	Launch Chrome Browser
			
					System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
					 driver=new ChromeDriver();
				//TS-2 Goto TestURL https://www.facebook.com/
					driver.get("https://www.saucedemo.com");
					
				//TS-3 Maximize Browser window
					driver.manage().window().maximize();
					Thread.sleep(1000);
		}
		
		public void type_UserName(String uname)
		{
			driver.findElement(UserNameField).sendKeys(uname);
		}


		public void type_Password(String pwd)
		{
			driver.findElement(PwdField).sendKeys(pwd);
			

		}
        

		public void click_Login()
		{
			driver.findElement(login).click();
		}
		
		
		public String thePlaintext()
		{
			return driver.findElement(plaintext).getText();
		}
		public String theItem()
		{
			return driver.findElement(itemName).getText();
		}
		public void click_Item()
		{
			driver.findElement(clickitemName).click();
		}
		
	}
