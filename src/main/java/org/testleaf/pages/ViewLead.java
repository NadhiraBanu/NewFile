package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod {
	
	
	
	
	
	
	
	
	public LoginPage logout()
	{
		
		driver.findElementByLinkText("//input[@value='submit']").click();
		return new LoginPage();
	}

	
	
	

}
