package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class HomePage {
	@FindBy(xpath="(//*[@class='fuse-horizontal-navigation-item-title'])[1]")
	private WebElement Home;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-red-600'])[1]")
	private WebElement Error;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-yellow-600'])[1]")
	private WebElement FilesToday;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-yellow-600'])[2]")
	private WebElement Queued;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-yellow-600'])[3]")
	private WebElement Api;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-orange-600'])[1]")
	private WebElement Validating;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-orange-600'])[2]")
	private WebElement Ftp;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-orange-600'])[3]")
	private WebElement Fob;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-orange-600'])[4]")
	private WebElement Ofr;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-orange-600'])[5]")
	private WebElement Plc;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-blue-600'])[1]")
	private WebElement Waiting;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-purple-600'])[1]")
	private WebElement Inserting;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-purple-600'])[2]")
	private WebElement External;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-green-600'])[1]")
	private WebElement Completed;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-green-600'])[2]")
	private WebElement S3;
	
	@FindBy(xpath="(//*[@class='tooltip text-right text-blue-600'])[2]")
	private WebElement Completed1;
	@FindBy(xpath="(//*[@class='tooltip text-right text-blue-600'])[3]")
	private WebElement Completed2;
	@FindBy(xpath="(//*[@class='tooltip text-right text-blue-600'])[4]")
	private WebElement Completed3;
	@FindBy(xpath="(//*[@class='tooltip text-right text-blue-600'])[5]")
	private WebElement Completed4;
	
	@FindBy(xpath="(//*[@class='tooltip'])[1]")
	private WebElement Datasourcewise;
	
	@FindBy(xpath="(//*[@class='tooltip'])[2]")
	private WebElement CustomerWiseFilestatus;
	
	@FindBy(xpath="(//*[@class='tooltip'])[3]")
	private WebElement Memberwisefilestatus;
	
	@FindBy(xpath="(//*[@aria-required='false'])[2]")
	private WebElement FilterByCustomerName;
	
	@FindBy(xpath="(//*[@aria-required='false'])[3]")
	private WebElement FilterByMemberSCAC;
	
	@FindBy(xpath="(//*[@class='mat-button-focus-overlay'])[1]")
	private WebElement ToggleFullScreen;
	
	@FindBy(xpath="(//*[@class='mat-button-focus-overlay'])[2]")
	private WebElement Profileicon;
	
	@FindBy(xpath="(//*[@class='mat-ripple mat-button-ripple'])[1]")
	private WebElement Today;
	@FindBy(xpath="(//*[@class='mat-ripple mat-button-ripple'])[2]")
	private WebElement Week;
	@FindBy(xpath="(//*[@class='mat-ripple mat-button-ripple'])[3]")
	private WebElement Month;
	@FindBy(xpath="(//*[@class='mat-ripple mat-button-ripple'])[4]")
	private WebElement CustomeDates;
	@FindBy(xpath="//*[text()='OK']")
	private WebElement Ok;
	
	@FindBy(xpath="//*[@class='hidden lg:flex']")
	private WebElement WorldWideAlliance;
	@FindBy(xpath="//*[text()='ALL']")
	private WebElement All;
	@FindBy(xpath="//*[text()='FOB']")
	private WebElement Fob1;
	@FindBy(xpath="//*[text()='PLC']")
	private WebElement Plc1;
	@FindBy(xpath="//*[text()='OFR']")
	private WebElement Ofr1;

	@FindBy(xpath="//*[@fill='currentColor']")
	private WebElement Theme;
	

	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		act= new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		
		
		
	}
    public void home(){
    	Home.click();
    }
    public void error() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Error).perform();
    }
    public void filestoday() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(FilesToday).perform();
    }
    public void queued() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Queued).perform();
    }
    
    public void api() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Api).perform();
    }
    public void validating() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Validating).perform();
    }
    public void ftp() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Ftp).perform();
    }
    public void fob() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Fob).perform();
    }
    public void ofr() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Ofr).perform();
    }
    public void plc() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Plc).perform();
    }
    public void waiting() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Waiting).perform();
    }
    public void external() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(External).perform();
    }
    public void inserting() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Inserting).perform();
    }
    public void completed() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Completed).perform();
    }
    public void s3() throws InterruptedException {
    	Thread.sleep(200);
	act.moveToElement(S3).perform();
    }
    public void dataSourcewise() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Datasourcewise).perform();
    }
    public void customerwisefilestatus() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(CustomerWiseFilestatus).perform();
    }
    public void memberwisefilestatus() throws InterruptedException {
    	Thread.sleep(200);
    	act.moveToElement(Memberwisefilestatus).perform();
    }
    public void filterbycustomername() throws InterruptedException {
    	Thread.sleep(1000);
    	FilterByCustomerName.sendKeys("abc123");
    }
    public void filterbymemberSCAC() throws InterruptedException {
    	Thread.sleep(1000);
    	FilterByMemberSCAC.sendKeys("xyzabc");
    }
    public void togglefullscreen() throws InterruptedException {
    	
    	ToggleFullScreen.click();
    	Thread.sleep(3000);
    	ToggleFullScreen.click();
    }
    public void today() throws InterruptedException  {
    	Thread.sleep(2000);
  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=' Today ']"))).click();
  Thread.sleep(2000);
    	
    }
    public void week() throws InterruptedException {
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()=' Week '])[1]"))).click();
    }
    public void month() throws InterruptedException  {
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()=' Month '])[1]"))).click();
    }
    public void customedates() throws InterruptedException {
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()=' Custom dates '])[1]"))).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@formcontrolname='start']")).sendKeys("2/7/2023");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@formcontrolname='end']")).sendKeys("2/10/2023");
    
    }
    public void all() throws InterruptedException {
    	All.click();
		wait.until(ExpectedConditions.elementToBeClickable(Fob));
		Fob1.click();
		Thread.sleep(1000);
		Fob1.click();
		wait.until(ExpectedConditions.elementToBeClickable(Plc));
		Plc1.click();
		Thread.sleep(1000);
		Plc1.click();
		wait.until(ExpectedConditions.elementToBeClickable(Ofr));
		Ofr1.click();
		
    	
    }
    public void completedd() throws InterruptedException {
    	Thread.sleep(1000);
    	act.moveToElement(Completed1).perform();
    	Thread.sleep(1000);
    	act.moveToElement(Completed2).perform();
    	Thread.sleep(1000);
    	act.moveToElement(Completed3).perform();
    	Thread.sleep(1000);
    	act.moveToElement(Completed4).perform();
    }
    public void worldwidealliance() throws InterruptedException {
    	WorldWideAlliance.click();
    	Thread.sleep(1000);
    }
    public void theme() throws InterruptedException, IOException {
    	Theme.click();
    	
    	Thread.sleep(6000);
    	Theme.click();
    	
    } 
    public void scrolldown() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;  
    	   js.executeScript("window.scrollBy(0,250)");
    }
  }
