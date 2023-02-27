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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Reports {
	@FindBy(xpath="//*[text()=' Reports ']")
	private WebElement Reports;
	
	@FindBy(xpath="//*[text()=' Upload Log ']")
	private WebElement UploadLog;
	WebDriver driver;
	
	@FindBy(xpath="//*[text()=' Today ']")
	private WebElement Today;
	@FindBy(xpath="(//*[text()=' Week '])[1]")
	private WebElement Week;
	@FindBy(xpath="(//*[text()=' Month '])[1]")
	private WebElement Month;
	@FindBy(xpath="(//*[text()=' Custom dates '])[1]")
	private WebElement CustomeDates;
	
	@FindBy(xpath="//*[text()='All']")
	private WebElement All;
	@FindBy(xpath="//*[text()='FOB']")
	private WebElement Fob;
	@FindBy(xpath="//*[text()='PLC']")
	private WebElement Plc;
	@FindBy(xpath="//*[text()='OFR']")
	private WebElement Ofr;
	@FindBy(xpath="(//*[@class='mat-ripple mat-button-ripple'])[6]")
	private WebElement DownloadLog;
	
	
	@FindBy(xpath="(//*[@class='mat-button-wrapper'])[9]")
	private WebElement AllDataSource;
	@FindBy(xpath="//*[text()='All data source']")
	private WebElement All_Data_Source;
	@FindBy(xpath="//*[text()='S3 data source']")
	private WebElement S3_Data_Source;
	@FindBy(xpath="//*[text()='External data source']")
	private WebElement External_Data_Source;
	@FindBy(xpath="//*[text()='API data source']")
	private WebElement Api_Data_Source;
	@FindBy(xpath="//*[text()='FTP data source']")
	private WebElement Ftp_Data_Source;
	@FindBy(xpath="//*[text()='All status']")
	private WebElement AllStatus;
	@FindBy(xpath="//*[text()='Queued status']")
	private WebElement Queuedstatus;
	@FindBy(xpath="//*[text()='Validating status']")
	private WebElement Validatingstatus;
	@FindBy(xpath="//*[text()='Waiting status']")
	private WebElement Waitingstatus;
	@FindBy(xpath="//*[text()='Inserting status']")
	private WebElement Insertingstatus;
	@FindBy(xpath="//*[text()='Completed status']")
	private WebElement Completedstatus;
	@FindBy(xpath="//*[text()='Error status']")
	private WebElement Errorstatus;

	@FindBy(xpath="(//*[@autocomplete='off'])[1]")
    private WebElement FilterByCustomerName;
	@FindBy(xpath="(//*[@autocomplete='off'])[2]")
	private WebElement FilterByMemberCode;
	@FindBy(xpath="(//*[@autocomplete='off'])[3]")
	private WebElement FilterByFileName;
	@FindBy(xpath="(//*[@autocomplete='off'])[4]")
	private WebElement FilterByUser;
	@FindBy(xpath="(//*[@autocomplete='off'])[5]")
	private WebElement FilterByJobID;
	@FindBy(xpath="(//*[@formcontrolname='start'])")
	private WebElement StartDate;
	@FindBy(xpath="(//*[@formcontrolname='end'])")
	private WebElement EndDate;
	@FindBy(xpath="//*[text()=' Locking Rates ']")
	private WebElement LockingRates;
	
	@FindBy(xpath="(//*[@height='100%'])[8]")
	private WebElement Theme;
	
	Actions act;
	WebDriverWait wait;
   public Reports(WebDriver driver) {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
	   act= new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(80));
   }
   public void reports() {
	   Reports.click();
   }
   public void uploadLog() {
	   wait.until(ExpectedConditions.elementToBeClickable(UploadLog));
	   UploadLog.click();
   }
   public void today() throws InterruptedException {
		Today.click();
		FilterByCustomerName.clear();
		FilterByCustomerName.sendKeys("MDCTEST");
		Thread.sleep(1000);
		FilterByMemberCode.clear();
		FilterByMemberCode.sendKeys("SHPT");
		Thread.sleep(1000);
		FilterByFileName.clear();
		FilterByFileName.sendKeys("SHPT_OFR_MDCTEST");
		Thread.sleep(1000);
		FilterByUser.clear();
		FilterByUser.sendKeys("ency");
		Thread.sleep(1000);
		FilterByJobID.clear();
		FilterByJobID.sendKeys("1");
	}
	public void week() throws InterruptedException {
		Week.click();
		FilterByCustomerName.clear();
		FilterByCustomerName.sendKeys("MDCTEST");
		Thread.sleep(1000);
		FilterByMemberCode.clear();
		FilterByMemberCode.sendKeys("SHPT");
		Thread.sleep(1000);
		FilterByFileName.clear();
		FilterByFileName.sendKeys("SHPT_OFR_MDCTEST");
		Thread.sleep(1000);
		FilterByUser.clear();
		FilterByUser.sendKeys("ency");
		Thread.sleep(1000);
		FilterByJobID.clear();
		FilterByJobID.sendKeys("1");
	}
	public void month() throws InterruptedException {
		Month.click();
		FilterByCustomerName.clear();
		FilterByCustomerName.sendKeys("MDCTEST");
		Thread.sleep(1000);
		FilterByMemberCode.clear();
		FilterByMemberCode.sendKeys("SHPT");
		Thread.sleep(1000);
		FilterByFileName.clear();
		FilterByFileName.sendKeys("SHPT_OFR_MDCTEST");
		Thread.sleep(1000);
		FilterByUser.clear();
		FilterByUser.sendKeys("ency");
		Thread.sleep(1000);
		FilterByJobID.clear();
		FilterByJobID.sendKeys("1");
	}
	public void customedates() throws InterruptedException {
		Thread.sleep(1000);
		CustomeDates.click();
		StartDate.sendKeys("11/12/2022");
		EndDate.sendKeys("12/12/20222");
	}
	public void downloadlog() throws InterruptedException {
		Thread.sleep(1000);
		DownloadLog.click();
	}
	
	public void lockingrates() {
		LockingRates.click();
	}
	public void all() throws InterruptedException {
		All.click();
		wait.until(ExpectedConditions.elementToBeClickable(Fob));
		Fob.click();
		Thread.sleep(1000);
		Fob.click();
		wait.until(ExpectedConditions.elementToBeClickable(Plc));
		Plc.click();
		Thread.sleep(1000);
		Plc.click();
		wait.until(ExpectedConditions.elementToBeClickable(Ofr));
		Ofr.click();
		
	}
	public void alldatasource() throws InterruptedException {
		
		All_Data_Source.click();
		wait.until(ExpectedConditions.elementToBeClickable(All_Data_Source));
		S3_Data_Source.click();
		Thread.sleep(1000);
		S3_Data_Source.click();
		wait.until(ExpectedConditions.elementToBeClickable(External_Data_Source));
		External_Data_Source.click();
		Thread.sleep(1000);
		External_Data_Source.click();
		wait.until(ExpectedConditions.elementToBeClickable(Api_Data_Source));
		Api_Data_Source.click();
		Thread.sleep(1000);
		Api_Data_Source.click();
		wait.until(ExpectedConditions.elementToBeClickable(Ftp_Data_Source));
		Ftp_Data_Source.click();
		Thread.sleep(1000);
		
		}
	public void allstatus() throws InterruptedException {
		AllStatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(Queuedstatus));
		Queuedstatus.click();
		Thread.sleep(1000);
		Queuedstatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(Validatingstatus));
		Validatingstatus.click();
		Thread.sleep(1000);
		Validatingstatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(Waitingstatus));
		Waitingstatus.click();
		Thread.sleep(1000);
		Waitingstatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(Insertingstatus));
		Insertingstatus.click();
		Thread.sleep(1000);
		Insertingstatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(Completedstatus));
		Completedstatus.click();
		Thread.sleep(1000);
	    Completedstatus.click();
	    wait.until(ExpectedConditions.elementToBeClickable(Errorstatus));
		Errorstatus.click();
		Thread.sleep(1000);
		
	}
	  public void theme() throws InterruptedException, IOException {
	    	Theme.click();
	    	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	Files.copy(f, new File("C:\\Users\\joela\\eclipse-workspace\\Grdb1\\Themetestresults\\"+3+"theme.png"));
	    	Thread.sleep(4000);
	    	Theme.click();
	    	
	    }
}
