package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class JobLogs {
	@FindBy(xpath="(//*[@fill='none'])[2]")
	private WebElement JobLogs;
	@FindBy(xpath="//*[@autocomplete='off'][1]")
	private WebElement FilterByCustomerName;
	@FindBy(xpath="(//*[@autocomplete='off'])[2]")
	private WebElement FilterByMemberCode;
	@FindBy(xpath="(//*[@autocomplete='off'])[3]")
	private WebElement FilterByFileName;
	@FindBy(xpath="(//*[@autocomplete='off'])[4]")
	private WebElement FilterByUser;
	@FindBy(xpath="(//*[@autocomplete='off'])[5]")
	private WebElement FilterByJobID;
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
	@FindBy(xpath="(//*[@formcontrolname='start'])")
	private WebElement StartDate;
	@FindBy(xpath="(//*[@formcontrolname='end'])")
	private WebElement EndDate;
	@FindBy(xpath="(//*[@width='100%'])[10]")
	private WebElement ShowMoreData;
	@FindBy(xpath="(//*[@width='100%'])[11]")
	private WebElement Delete;
	@FindBy(xpath="(//*[@id='fileprocessing_joblogs_row_filenameanchor'])")
	private WebElement FileName;
	@FindBy(xpath="//button[text()='OK']")
	private WebElement Ok;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement Checkbox;
	@FindBy(xpath="(//*[@height='100%'])[8]")
	private WebElement Theme;
	@FindBy(xpath="(//*[@opacity='.3'])[1]")
	private WebElement DownloadLogIcon;
	@FindBy(xpath="(//*[@opacity='.3'])[2]")
	private WebElement DownloadError;
	
	
	
	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	public JobLogs(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		act= new Actions(driver);
		wait= new WebDriverWait(driver,Duration.ofSeconds(80));
		
		
	}
	public void joblogs() {
		JobLogs.click();
	}
	public void today() throws InterruptedException {
		Today.click();
		FilterByCustomerName.clear();
		Thread.sleep(1000);
		FilterByCustomerName.sendKeys("BOLLORE");
		FilterByMemberCode.clear();
		Thread.sleep(1000);
		FilterByMemberCode.sendKeys("SHPT");
		FilterByFileName.clear();
		Thread.sleep(1000);
		FilterByFileName.sendKeys("SHPT_FOB_BOLLORE");
		Thread.sleep(1000);
		FilterByUser.clear();
		FilterByUser.sendKeys("ency");
		
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
		Thread.sleep(500);
		FilterByCustomerName.sendKeys("MDCTEST");
		FilterByMemberCode.clear();
		Thread.sleep(1000);
		FilterByMemberCode.sendKeys("SHPT");
        FilterByFileName.clear();
        Thread.sleep(1000);
		FilterByFileName.sendKeys("SHPT_OFR_MDCTEST");
		FilterByUser.clear();
		Thread.sleep(1000);
		FilterByUser.sendKeys("ency");
		FilterByJobID.clear();
		Thread.sleep(1000);
		FilterByJobID.sendKeys("1");
	}
	public void customedates() throws InterruptedException {
		CustomeDates.click();
		Thread.sleep(2000);
		StartDate.sendKeys("11/12/2022");
		Thread.sleep(1000);
		EndDate.sendKeys("12/12/20222");
	}
	public void downloadlog() {
		DownloadLog.click();
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
	public void showmoredata() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(ShowMoreData));
		Thread.sleep(1000);
		act.moveToElement(ShowMoreData).perform();
		Thread.sleep(2000);
		ShowMoreData.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ShowMoreData);
		ShowMoreData.click();
	}
	public void deletejob() throws InterruptedException {
		Thread.sleep(1000);
		act.moveToElement(Delete).perform();
	}
	public void filename() throws InterruptedException {
		Thread.sleep(1000);
		act.moveToElement(FileName).perform();
	}
	public void downloadfile() throws InterruptedException {
		Thread.sleep(500);
		FileName.click();
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(Ok));
		Ok.click();
		Thread.sleep(5000);
		
	    }
	
	  public void checkbox() throws InterruptedException {
		Thread.sleep(1000);
		Checkbox.click();
		Thread.sleep(1000);
	    }
	
	  public void theme() throws InterruptedException, IOException {
	    Theme.click();
	    File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(f1, new File("C:\\Users\\joela\\eclipse-workspace\\Grdb1\\Themetestresults\\2theme.png"));
	    Thread.sleep(6000);
	    Theme.click();
	    	
	    }
	  
	  public void downloadLogIcon() throws InterruptedException {
		act.moveToElement(DownloadLogIcon).perform();
	    Thread.sleep(1000);
	    act.moveToElement(DownloadLogIcon).click().build().perform();
	    wait.until(ExpectedConditions.elementToBeClickable(Ok));
	    Ok.click();
	    }
	  
	  public void downloaderror() throws InterruptedException {
	    act.moveToElement(DownloadError).perform();
	    Thread.sleep(1000);
	    act.moveToElement(DownloadLogIcon).click().build().perform();
	    wait.until(ExpectedConditions.elementToBeClickable(Ok));
	    Ok.click();
	    }
	  
	  public void footerdropdown() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='1']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='2']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='3']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='4']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@fill='none'])[14]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//*[@fill='none'])[14]")).click();
	    }
	
	
}
