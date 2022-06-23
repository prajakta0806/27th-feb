package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodaforgotpage {

		
	@FindBy(xpath="//input[@label='I remember my user ID']")private WebElement rememberuserid;
	@FindBy(xpath="//input[@label='I forgot my user ID']")private WebElement forgotuserid;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement PAN;
	
	
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath="//input[@class='button-orange wide']")private WebElement reset;
	@FindBy(xpath=	"//a href@text-xsmall text-light reset-account-button']")private WebElement backpage;
		
	
	
	
    public Zerodaforgotpage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    
   public void rememberuserid() {
	   rememberuserid.click();
   }

	   public void forgotuserid() {
		   forgotuserid.click();
	   }
	   
	  public void PAN(String id) {
	    	PAN.sendKeys(id);
	   
	  }
	  	  public void reset() {
	  		   reset.click();
	  	  }
	  		
	  		   public void backpage() {
	 	    	backpage.click();
	 	    
	  		   
	  		   }
}
