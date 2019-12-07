package org.testleaf.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.testcases.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class ProjectSpecificMethod {
	
	
	public static ChromeDriver driver;
	public String ExcelFilename;
public 	String Sheetname;
	
	
	@BeforeMethod
	public void Launch()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
       driver.get("http://leaftaps.com/opentaps/control/main");
       driver.manage().window().maximize();
       
	}
	
	

	@AfterMethod
	
	public void close() throws IOException
	{
		
		
		
 driver.close();
		
	}
	
	@DataProvider
	
	public String[][] senddata() throws IOException
	{
       org.testleaf.utils.Excel e = new org.testleaf.utils.Excel();
		
		return e.readExcel(ExcelFilename, Sheetname);
		
	}
	

}
