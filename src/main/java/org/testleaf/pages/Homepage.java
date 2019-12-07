package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod {

	public MyhomePage crmlink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyhomePage();
	}
	
	public LoginPage logout()
	{
		
		driver.findElementByLinkText("//input[@value='submit']").click();
		return new LoginPage();
	}

	
}
