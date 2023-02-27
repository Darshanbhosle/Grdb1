package test;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class ReportsTestcases extends TestNGListeners{
	@Test(priority=1)
   public void clickOnReports() {
		test.info("Click Reporticon on header is in progress");
	   RE.reports();
	   test.info("Click Reporticon on header is Validated");
   }
   @Test(priority=2)
   public void clickOnUploadLog() {
	   test.info("Click UploadLog on Report is in progress");
	   RE.uploadLog();
	   test.info("Click UploadLog on Report is validated");
   }
   @Test(priority=3)
	public void Verify_All_Functionalities_In_Today() throws InterruptedException {
	   test.info("Click Today and check all functionality is in progress");
		RE.today();
		test.info("Click Today and check all functionality is validated");
	}
	@Test(priority=4)
	public void Verify_ClickOn_AllDropDown_Element() throws InterruptedException {
		test.info("Click All dropdown is in progress on Report page(upload log)");
		JL.all();
		test.info("click on FOB is validated");
		test.info("click on PLC is validated");
		test.info("click on OFR is validated");
	}
	@Test(priority=5)
	public void Verify_ClickOn_AllDataSourceDropDownElements() throws InterruptedException {
		test.info("Click on All Datasource dropdown is in progress on Reports page(upload log");
		JL.alldatasource();
		test.info("click on Alldata source is validated");
		test.info("click on S3 source is validated");
		test.info("click on External source is validated");
		test.info("click on API source is validated");
		test.info("click on FTP source is validated");
	}
	@Test(priority=6)
	public void Verify_ClickOn_AllStatusDropdownElement() throws InterruptedException {
		test.info("Click on All Status dropdown is in progress On upload log Page");
		JL.allstatus();
		test.info("click on AllStatus is validated");
		test.info("click on QueuedStatus is validated");
		test.info("click on VlidatingStatus is validated");
		test.info("click on WaitingStatus is validated");
		test.info("click on InsertingStatus is validated");
		test.info("click on CompletedStatus is validated");
		test.info("click on ErrorStatus is validated");
	}
	@Test(priority=7)
	public void Verify_All_Functionalities_In_Week() throws InterruptedException {
		test.info("Click week and check all functionality is in progress");
		RE.week();
		test.info("Click week and check all functionality is validated");
	}
	@Test(priority=8)
	public void Verify_All_Functionalities_In_Month() throws InterruptedException {
		test.info("Click month and check all functionality is in progress");
		RE.month();
		test.info("Click month and check all functionality is validated");
		
	}
	@Test(priority=9)
	public void Verify_All_Functionalities_In_Customedates() throws InterruptedException {
		test.info("Click customdates and check all functionality is in progress");
		test.info("giving random input in start date");
		test.info("giving random input in end date");
		RE.customedates();;
		test.info("CLick On Customedates is verified");
	}
	@Test(priority=10)
	public void click_On_LockingRates() {
		test.info("Clicking On LockingRates ");
		RE.reports();
		RE.lockingrates();
		test.info("Clicking On LockingRates is Validated ");
	}
	@Test(priority=11)
	public void Verify_All_Functionalities_In_Today_lockingrates() throws InterruptedException {
		test.info("Click today on Locking rates");
		RE.today();
		test.info("Click today on Locking rates is validated");
	}
	@Test(priority=12)
	public void Verify_ClickOn_AllDropDown_Element_LockingRates() throws InterruptedException {
		test.info("Click All dropdown is in progress on LockingRates page");
		JL.all();
		test.info("click on FOB is validated");
		test.info("click on PLC is validated");
		test.info("click on OFR is validated");
	}
	@Test(priority=13)
	public void Verify_ClickOn_AllDataSourceDropDownElements_LockingRates() throws InterruptedException {
		test.info("Click on All Datasource dropdown is in progress on LockingRates page");
		JL.alldatasource();
		test.info("click on Alldata source is validated");
		test.info("click on S3 source is validated");
		test.info("click on External source is validated");
		test.info("click on API source is validated");
		test.info("click on FTP source is validated");
	}
	@Test(priority=14)
	public void Verify_ClickOn_AllStatusDropdownElement_LockingRates() throws InterruptedException {
		test.info("Click on All status dropdown is in progress On Locking rates Page");
		JL.allstatus();
		test.info("click on AllStatus is validated");
		test.info("click on QueuedStatus is validated");
		test.info("click on VlidatingStatus is validated");
		test.info("click on WaitingStatus is validated");
		test.info("click on InsertingStatus is validated");
		test.info("click on CompletedStatus is validated");
		test.info("click on ErrorStatus is validated");
	}
	@Test(priority=15)
	public void Verify_All_Functionalities_In_Week_lockingrates() throws InterruptedException {
		test.info("click week on lockingrates is in progress");
		RE.week();
		test.info("click week on lockingrates is validated");
	}
	@Test(priority=16)
	public void Verify_All_Functionalities_In_Month_lockingrates() throws InterruptedException {
		test.info("click month on lockingrates is in progress");
		RE.month();
		test.info("click month on lockingrates is validated");
	}
	@Test(priority=17)
	public void Verify_All_Functionalities_In_Customedates_lockingrates() throws InterruptedException {
		test.info("click customedates on lockingrates is in progress");
		RE.customedates();;
		test.info("click customedates on lockingrates is validated");
	}
	@Test(priority=18)
	public void Verify_Theme_Button() throws InterruptedException, IOException {
		test.info("click themeicon on lockingrates is in progress");
		HP.theme();
		test.info("click themeicon on lockingrates is validated");
	}
	
}
