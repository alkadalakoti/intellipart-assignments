package Module3_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		/*Test scenario
		 TS 1 open chrome browser
		 TS2 open facebook
		 TS3 maximize screen
		 TS 4 initilize wait
		 TS 5 get page title
		 TS 6 click on create account
		 TS 7 Complete sign up
		 TS 8 close browser
		 */
		
		
        //TS 1 open chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//TS2 open facebook
		driver.get("https://www.facebook.com/");
		
		//TS3 maximize screen
		driver.manage().window().maximize();
		
		//TS 4 initilize wait
		Thread.sleep(400);
		
		//TS 5 get page title
		String pageTitle1=driver.getTitle();
		System.out.println(pageTitle1);
		
		// TS 6 click on create account
		 driver.findElement(By.linkText("Create New Account")).click();
		 Thread.sleep(1000);
		
		
		//TS 7 first name input with text
		 driver.findElement(By.name("firstname")).sendKeys("alka25");
		 Thread.sleep(5000);
		 //TS 8 last name input with text
		 driver.findElement(By.name("lastname")).sendKeys("dalakoti");
		 Thread.sleep(5000);
		 //TS 9 mobile name input
		 driver.findElement(By.name("reg_email__")).sendKeys("8860538699");
		 Thread.sleep(5000);
		 
		 //TS 10 Enter new password
		 driver.findElement(By.name("reg_passwd__")).sendKeys("alka@1989");
		 
		 
		 
		 //TS 11 select date from drop down
	      Select day=new Select(driver.findElement(By.id("day")));
	      day.selectByValue("30");
	      Thread.sleep(5000);
	     
	      //TS 11-1 select month from drop down
	      Select month=new Select(driver.findElement(By.id("month")));
	      month.selectByIndex(1);
	      Thread.sleep(5000);
	      
	      Select year=new Select(driver.findElement(By.id("year")));
	      year.selectByValue("1987");
	      Thread.sleep(5000);
	      
	      
	      //TS 12 selct gender
	      driver.findElement(By.name("sex")).click();
	      Thread.sleep(5000);
	      
	      //TS 13 submit form
	      driver.findElement(By.name("websubmit")).click();
	      Thread.sleep(5000);
	      
	      //TS 14 Close browser
	      driver.close();
	      
	      
	      
	      
		 
		 
		 
		 
		 
		
	
	}

}
