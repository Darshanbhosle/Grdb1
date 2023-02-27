package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseClass {
	@FindBy(xpath="//*[@id='text']")
	private WebElement Username;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//*[text()=' Sign in ']")
	private WebElement Signin;
	
	@FindBy(xpath="//*[@clip-rule='evenodd']")
	private WebElement ViewPasswordIcon;
	WebDriverWait wait;
	WebDriver driver;
	public SignInPage(WebDriver driver) throws IOException {
		this.driver =driver ;
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
  		PageFactory.initElements(driver, this);
	}
	
   public void SignInToApplication(String username,String password) throws InterruptedException {
	   
	new WebDriverWait(driver,Duration.ofMinutes(1)).until(ExpectedConditions.elementToBeClickable(Username)).sendKeys(username);;
	  Password.sendKeys(password);
	  Thread.sleep(2000);
	  Signin.click();
	  
   }
   public String titleOfPage() {
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  String title = driver.getTitle();
		  System.out.println(title);
		  return title;
	  }
  
}
