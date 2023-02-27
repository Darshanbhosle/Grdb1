package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	static ExtentReports extent;
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\reports\\GRDB.html";
	
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.STANDARD);
		
		reporter.config().setReportName("GRDB dashboard execution report");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		
		extent.setSystemInfo("Executed by", "Darshan Bhosale");
		
		extent.setSystemInfo("Environment used", "");
		
		return extent;
	
	}
}
