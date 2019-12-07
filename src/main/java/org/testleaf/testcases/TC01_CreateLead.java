package org.testleaf.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testleaf.base.ProjectSpecificMethod;
import org.testleaf.pages.CreateLead;
import org.testleaf.pages.Homepage;
import org.testleaf.pages.LoginPage;
import org.testleaf.pages.MyhomePage;
import org.testleaf.pages.Mylead;
import org.testleaf.pages.ViewLead;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_CreateLead extends ProjectSpecificMethod {

	//public String SnapName = "Snapshot1";
	
	
	@BeforeTest
	
	public void setdata()
	{
		ExcelFilename ="TestData";
		Sheetname="CreateLead";

	}
	
	
	
	@Test(dataProvider="senddata")
	public void createLead(String Usernname ,String Pass , String Companyname , String FirstName , String LastName) throws IOException
	{
		
		new LoginPage().enterUsername(Usernname).enterPassword(Pass).login();
		new Screenshot().capture("snap01");
		new Homepage().crmlink();
		new Screenshot().capture("snap02");
		new MyhomePage().clickLeadtab();
		new Screenshot().capture("snap03");
		new Mylead().clickCreateLead();
		new Screenshot().capture("snap04");
		new CreateLead().enterCompany(Companyname).enterFname(FirstName).enterLname(LastName);
		new Screenshot().capture("snap05");
		new CreateLead().submit();
		new Screenshot().capture("snap06");
		

		
	}
	
}
