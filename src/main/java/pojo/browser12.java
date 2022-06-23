package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser12 {

	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\selinium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.get("https://kite.zerodha.com/");
         return driver;
	}
	
	
	
	
}
