package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod{
	
	
	public CreateLead enterCompany(String Company)
	{
		 driver.findElementById("createLeadForm_companyName").sendKeys(Company);
		 return this;
	}

	public CreateLead enterFname(String Fname)
	{
		 driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		return this;
	}
	
	
	public CreateLead enterLname(String Lname)
	{
	 
		 driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		 return this;
	}
	
	
	public ViewLead submit()
	{
		driver.findElementByName("submitButton").click();
		return new ViewLead();
	}
	
	public LoginPage logout()
	{
		
		driver.findElementByLinkText("//input[@value='submit']").click();
		return new LoginPage();
	}

}
