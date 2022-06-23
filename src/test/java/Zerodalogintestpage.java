import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.browser12;
import pom.Zerodaloginpage;
import uitility.Parametrization;
import uitility.Screenshot;

public class Zerodalogintestpage {
	WebDriver driver;

	@BeforeMethod
	public void browser() {
		driver=browser12.openBrowser();
	}
	@AfterMethod
	public void snapshot() throws IOException {
		Screenshot.snapshot(driver);
	}

	@Test
	public void LoginWithValidCredentialTest() throws EncryptedDocumentException, IOException {
		Zerodaloginpage zerodhaloginpage = new Zerodaloginpage(driver);
		String userid = Parametrization.snap(0, 1);
		String pass = Parametrization.snap(1, 1);
		zerodhaloginpage.enteruserid(userid);
		zerodhaloginpage.enterpassword(pass);
		zerodhaloginpage.clickonlogin();
	}
	@Test 
	public void forgotpasswordlinkTest() {
		Zerodaloginpage zerodhaloginpage = new Zerodaloginpage(driver);
		zerodhaloginpage.clickonforgotpassword();
	}

	@Test
	public void signuplinkTest() {
		Zerodaloginpage zerodhaloginpage = new Zerodaloginpage(driver);
		zerodhaloginpage.clickonsignup();
	}
   
	
	
	
}
