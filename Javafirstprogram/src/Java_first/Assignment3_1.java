package Java_first;



import java.util.concurrent.TimeUnit;       
import org.openqa.selenium.By;        
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_1 {

	public static void main(String[] args) throws InterruptedException {
	//TC-1 Launch Chrome Browser 
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	//TC-2 Goto Test URL https://www.google.com
		driver.navigate().to("https://www.facebook.com/");
		
	//TC-3 Specify Wait Time for 5 Sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	//TC-4 Get the Title of Page into Console
		String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
     //TC-5 click on create account
        driver.findElement(By.partialLinkText("Create New A")).click();
        Thread.sleep(3000);
        //TC-6 enter sign up
        driver.findElement(By.name("firstname")).sendKeys("Alka");
        driver.findElement(By.name("lastname")).sendKeys("Dalakoti");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("8860538699");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("alka@1989");
        Thread.sleep(1000);
        //select day
        Select day=new Select(driver.findElement(By.id("day")));
        day.selectByIndex(16);
        Thread.sleep(1000);
        //select month
        Select month=new Select(driver.findElement(By.name("birthday_month")));
        month.selectByIndex(8);
        Thread.sleep(1000);
        //select year
     Select year=new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1998");
        Thread.sleep(1000);
        
        //Select gender by radio button
        driver.findElement(By.name("sex")).click();
        Thread.sleep(1000);
        
        //sign up
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        
        //pop up handleing
     
     //TC-5 Close the Browser 
       // driver.close();
		
	
		
	}

}
