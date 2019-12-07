package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage enterUsername(String USNAME)
	{
	    driver.findElementById("username").sendKeys(USNAME);
	    return this;
	}
	
	
	public LoginPage enterPassword(String PASS)
	{
		driver.findElementById("password").sendKeys(PASS);
		return this;
	}
	
	
	public Homepage login()
	{
		 driver.findElementByClassName("decorativeSubmit").click();
		 return new Homepage();
	}

	
	
}
