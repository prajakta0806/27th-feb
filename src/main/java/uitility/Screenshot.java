package uitility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	public static void snapshot(WebDriver driver) throws IOException{
		
		Date A=Calendar.getInstance().getTime();
			String timestamp=A.toString().replace(":","").replace("", "");
			
			File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File location=new File(".//snapdetails//"+timestamp+".jpg");
	FileHandler.copy(snap, location);		
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
