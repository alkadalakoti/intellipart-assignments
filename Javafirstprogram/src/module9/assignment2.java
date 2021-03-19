package module9;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class assignment2 {
	//Assignment-2
	//Write a TestScript to Automate https://www.saucedemo.com/index.html Login in TestNG
		//-Apply Data Driven Testing Framework 
		//-Use JXL jar File 
	


		
		static Loginpage login;
		static WebDriver driver;
		
		
		@Test(dataProvider="TestData")
		public static void myTest(String uname,String pwd) throws InterruptedException
		{
		
			//Fill UserNAme Textbox
			login=new Loginpage(driver);
			login.setup();
			Thread.sleep(4000);
			login.type_UserName(uname);
			Thread.sleep(4000);
			login.type_Password(pwd);
			Thread.sleep(4000);
			login.click_Login();
			Thread.sleep(4000);
			driver.close();
		}
		

		
		
		@DataProvider(name="TestData")
		public Object[][] readExcel() throws BiffException, IOException
		{
			//Open the Excel File for read and write ,which is available under same package
			File f=new File("D:\\Automation\\Javafirstprogram\\src\\module9\\TestData_SauceDemo.xls");
			Workbook w=Workbook.getWorkbook(f);
			Sheet s=w.getSheet(0);
			int noofrows=s.getRows();
			//System.out.println(s.getRows());
			int noofColu=s.getColumns();
			//System.out.println(s.getColumns());
			String inputData[][]=new String[noofrows-1][noofColu];
			
			int count =0;
			
			for (int i=1;i<noofrows;i++)
			{
				for(int j=0;j<noofColu;j++)
				{
					Cell c=s.getCell(j,i);
					inputData[count][j]=c.getContents();
					
				}
				count++;
			}
			return inputData;

							
		}

		
		
		

	}

	

