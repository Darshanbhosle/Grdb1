package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobtimeLine {
       @FindBy(xpath="(//*[@tabindex='0'])[5]")
       private WebElement Jobtimeline;
       
       @FindBy(xpath="//*[@fill='currentColor']")
   	   private WebElement Theme;
       
       @FindBy(xpath="//*[text()='Sign out']")
       private WebElement Signout;
       
       @FindBy(xpath="//*[@class='relative']")
       private WebElement Profile;
	 WebDriver driver;
	 WebDriverWait wait;
		public JobtimeLine(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	    }
		public void jobtimeline() throws InterruptedException {
			Jobtimeline.click();
			Thread.sleep(3000);
		}
		public void theme() throws InterruptedException {
			Theme.click();
			Thread.sleep(2500);
			Theme.click();
		}
		public void profile() throws InterruptedException {
			Profile.click();
			Thread.sleep(2000);
			
		}
		public void signOut() {
			wait.until(ExpectedConditions.elementToBeClickable(Signout));
			Signout.click();
		}
}
