package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ITDashboard {
	
	@FindBy(xpath="(//*[@width='100%'])[4]")
	private WebElement ITdashboard;

	
	@FindBy(xpath="//*[@placeholder='Search by File Name']")
	private WebElement SearchByFileName;
	WebDriver driver;
	
	@FindBy(xpath="(//*[@height='100%'])[8]")
	private WebElement Theme;
	
    public ITDashboard(WebDriver driver) {
    	this.driver= driver;
		PageFactory.initElements(driver, this);
	}
    public void itdashboard() {
    	ITdashboard.click();
    }
    public void searchbyfilename() {
    	SearchByFileName.sendKeys("abc");
    }
    public void theme() throws InterruptedException, IOException {
    	Theme.click();
    	TakesScreenshot ts1 = (TakesScreenshot)driver;
    	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	Files.copy(f, new File("C:\\Users\\joela\\eclipse-workspace\\Grdb1\\Themetestresults\\"+2+"theme.png"));
    	Thread.sleep(6000);
    	Theme.click();
    	
    }
    
}
