package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodaloginpage {

	@FindBy(xpath="//input[@id='userid']") private WebElement userid;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
    @FindBy(xpath="//button[@class='button-orange wide']") private WebElement login;
    @FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgotid;
    @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
    
    
    
    public Zerodaloginpage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    public void enteruserid(String id) {
    	userid.sendKeys(id);
    }
    
    public void enterpassword(String pass) {
    	password.sendKeys(pass);
    }
    
   public void clickonlogin() {
	   login.click();
   }
    public void clickonforgotpassword() {
    	forgotid.click();
    }
    public void clickonsignup() {
    	signup.click();
    }	
}
