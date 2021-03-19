package allClassFilesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test2_SwagDemo {
  @Test
  public void swagLogin() throws InterruptedException, FindFailed {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://www.saucedemo.com/index.html");
		
		Thread.sleep(5000);
		Screen s=new Screen();
		Thread.sleep(5000);
		s.type("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\type_UserName.PNG","standard_user");

		Thread.sleep(5000);
		s.type("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\type_Password.PNG","secret_sauce");
		Thread.sleep(5000);
		s.click("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\click_Login.PNG");
		Thread.sleep(5000);
		driver.close();
  }
}
