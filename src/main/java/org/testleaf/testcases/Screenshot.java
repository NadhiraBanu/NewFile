package org.testleaf.testcases;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testleaf.base.ProjectSpecificMethod;

public class Screenshot extends ProjectSpecificMethod{
	
	
	public void capture(String SnapName) throws IOException
	{
		
		
		
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date = new Date();
		File Source1 = driver.getScreenshotAs(OutputType.FILE);
		File Destination2 = new File("./Snaps/"+SnapName+"-"+dateFormat.format(date)+".png");
		FileUtils.copyFile(Source1, Destination2);
		
	}

}
