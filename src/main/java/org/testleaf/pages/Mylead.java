package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethod;

public class Mylead extends ProjectSpecificMethod {
	
	public CreateLead clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}
	
	

	public LoginPage logout()
	{
		
		driver.findElementByLinkText("//input[@value='submit']").click();
		return new LoginPage();
	}


}
