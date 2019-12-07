package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethod;

public class MyhomePage extends ProjectSpecificMethod{
	
	
	public Mylead clickLeadtab()
	{
		
        driver.findElementByXPath("//*[text()='Leads']").click();
		return new Mylead();
	}

	
	public LoginPage logout()
	{
		
		driver.findElementByLinkText("//input[@value='submit']").click();
		return new LoginPage();
	}

	
}
