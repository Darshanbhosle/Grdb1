package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.google.common.io.Files;

public class LaneDashboard {
	
 @FindBy(xpath="//*[text()=' Lane Dashboard ']")
 private WebElement Lanedashboard;
 
 @FindBy(xpath="//*[@fill='currentColor']")
	private WebElement Theme;


 WebDriver driver;
	public LaneDashboard(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
   }
   
   public void lanedashboard() {
	   Lanedashboard.click();
   }
   public void theme() throws InterruptedException, IOException {
   	Theme.click();
   	Thread.sleep(3000);
   	Theme.click();
   	
   }
   
}
