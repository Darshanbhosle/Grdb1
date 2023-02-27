package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.ITDashboard;
import pages.JobLogs;
import pages.JobtimeLine;
import pages.LaneDashboard;
import pages.Reports;
import pages.SignInPage;
import utility.ReadDataFromPropFile;
import utility.ScreenShot;

public class BaseTest {
	public static WebDriver driver;
	public SignInPage SI;
	public HomePage HP;
	public JobLogs JL;
	public ITDashboard ID;
	public Reports RE;
	public LaneDashboard LD;
	public JobtimeLine JT;
	public static ExtentTest test ;
	@BeforeSuite
    public void InItBrowser() throws IOException {
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--incognito");
		
		options.addArguments("--headless");
	    String Siteurl = ReadDataFromPropFile.readConfigData("url");
        driver = new ChromeDriver(options);
        driver.get(Siteurl);
    }
	@BeforeClass
	public void Vaiable() throws Exception {
		SI= new SignInPage(driver);
		HP = new HomePage(driver);
		JL = new JobLogs(driver);
		ID = new ITDashboard(driver);
		RE = new Reports(driver);
		LD = new LaneDashboard(driver);
		JT = new JobtimeLine(driver);
	}
	
}
