package allClassFilesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test1SikuliScript {
  @Test
  public void sikuliScript() throws InterruptedException, FindFailed {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//TS-2 Goto TestURL https://www.facebook.com/
		driver.get("https://smallpdf.com/jpg-to-pdf");
		
		Thread.sleep(5000);
		Screen s=new Screen();
		s.click("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\ChooseFile.PNG");
		

		Thread.sleep(5000);
		Pattern fileInput=new Pattern("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\type_PathInput.PNG");
		Pattern openButton=new Pattern("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\click_Open.PNG");
		Thread.sleep(5000);
		s.type(fileInput,"D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\FiletoUpload.PNG");
		Thread.sleep(3000);
		s.click(openButton);
		Thread.sleep(8000);
		s.click("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\click_Convert.PNG");
		Thread.sleep(14000);
		s.click("D:\\Disk-E\\Regular Batch\\Batch_Jan5th_2021\\GUITesting\\sikuliProject\\SikuliLocators\\click_Download.PNG");
		Thread.sleep(10000);
		driver.quit();
	
  }
}
