package test;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class HomeTestcase extends TestNGListeners {
	@Test(priority=1)
	public void Hover_On_FilesByToday() throws InterruptedException {
		test.info("Hovering on filesByToday is in progress");
		HP.filestoday();
		test.info("Hovering on filesByToday is done");
	}
	@Test(priority=2)
	public void Hover_On_Error() throws InterruptedException {
		test.info("Hovering on Error is in progress");
		HP.error();
		test.info("Hovering on filesByToday is done");
	}
    @Test(priority=3)
	public void Hover_On_Queued() throws InterruptedException {
    	test.info("Hovering on Queued is in progress");
		HP.queued();
		test.info("Hovering on filesByToday is done");
	}
	@Test(priority=4)
	public void Hover_On_Validating() throws InterruptedException {
		test.info("Hovering on Validating is in progress");
		HP.validating();
		test.info("Hovering on Validating is done");
	}
	@Test(priority=5)
	public void Hover_On_Waiting() throws InterruptedException {
		test.info("Hovering on Waiting is in progress");
		HP.waiting();
		test.info("Hovering on Waiting is done");
	}
	@Test(priority=6)
	public void Hover_On_Inserting() throws InterruptedException {
		test.info("Hovering on Inserting is in progress");
		HP.inserting();
		test.info("Hovering on Inserting is done");
	}
	@Test(priority=7)
	public void Hover_On_Completed() throws InterruptedException {
		test.info("Hovering on Completed is in progress");
		HP.completed();
		test.info("Hovering on Completed is done");
	}
	@Test(priority=8)
	public void Hover_On_Api() throws InterruptedException {
		test.info("Hovering on Api is in progress");
		HP.api();
		test.info("Hovering on Api is done");
	}
	@Test(priority=9)
	public void Hover_On_Ftp() throws InterruptedException {
		test.info("Hovering on Ftp is in progress");
		HP.ftp();
		test.info("Hovering on Ftp is done");
	}
	@Test(priority=10)
	public void Hover_On_External() throws InterruptedException {
		test.info("Hovering on External is in progress");
		HP.external();
		test.info("Hovering on External is done");
	}
	@Test(priority=11)
	public void Hover_On_S3() throws InterruptedException {
		test.info("Hovering on S3 is in progress");
		HP.s3();
		test.info("Hovering on S3 is done");
	}
	@Test(priority=12)
	public void Hover_On_FOB() throws InterruptedException {
		test.info("Hovering on FOB is in progress");
		HP.fob();
		test.info("Hovering on FOB is done");
	}
	@Test(priority=13)
	public void Hover_On_OFR() throws InterruptedException {
		test.info("Hovering on OFR is in progress");
		HP.ofr();
		test.info("Hovering on OFR is done");
	}
	@Test(priority=14)
	public void Hover_On_PLC() throws InterruptedException {
		test.info("Hovering on PLC is in progress");
		HP.plc();
		test.info("Hovering on PLC is done");
	}
	@Test(priority=15)
	public void Hover_On_CompletedElement() throws InterruptedException {
		test.info("Hovering on CompletedElement is in progress");
		HP.completedd();
		test.info("Hovering on CompletedElement is done");
	}
	@Test(priority=15)
	public void Hover_On_DataSourceWise_Tooltip() throws InterruptedException {
		test.info("Hovering on DataSourceWise is in progress");
		HP.dataSourcewise();
		test.info("Hovering on DataSourceWise is done");
	}
	@Test(priority=16)
	public void HoverOn_CustomerWiseFilestatus_Tooltip() throws InterruptedException {
		test.info("Hovering on CustomerWiseFilestatus is in progress");
		HP.customerwisefilestatus();
		test.info("Hovering on CustomerWiseFilestatus is done");
	}
	@Test(priority=17)
	public void HoverOn_MemberWiseFilestatus_Tooltip() throws InterruptedException {
		test.info("Hovering on MemberWiseFilestatus is in progress");
		HP.memberwisefilestatus();
		test.info("Hovering on MemberWiseFilestatus is done");
	}
	@Test(priority=18)
	public void verify_filter_By_CustomerField() throws InterruptedException {
		test.info("Click on CustomerField");
		test.info("Giving random input in FilterByCustomerfield");
		HP.filterbycustomername();
		test.info("Filter By Customer name Field is validated");
	}
	@Test(priority=19)
	public void verify_FilterByMemeberSCAC() throws InterruptedException {
		test.info("Click on FilterByMemeberSCAC");
		test.info("Giving random input in FilterByMemeberSCAC");
		HP.filterbymemberSCAC();
		test.info("Filter By MemberSCAC Field is validated");
	}
	
	@Test(priority=21)
	public void VerifyClickOnToday() throws Exception {
		test.info("Click on today is in progress");
		HP.today();
		test.info("Click on today functionality is validated");
	}
	@Test(priority=22)
	public void VerifyClickOnWeek() throws Exception {
		test.info("Click on Week is in progress");
		HP.week();
		test.info("Click on Week functionality is validated");
	}
	@Test(priority=23)
	public void VerifyClickOnMonth() throws Exception {
		test.info("Click on Month is in progress");
		HP.month();
		test.info("Click on Month functionality is validated");
	}
	@Test(priority=24)
	public void VerifyClickOnCustomeDates() throws Exception {
		test.info("Click on Customerdates");
		test.info("giving some random input in startdate");
		test.info("giving some random input in enddate");
		HP.customedates();
		test.info("Customdates Functinality is validated");
		
	}

	@Test(priority=26)
	public void Verify_ClickOn_logo() throws InterruptedException {
		test.info("Click on logo is in progress");
		HP.worldwidealliance();
		test.info("Click on logo is validated");
	}
	@Test(priority=27,enabled=false)
	public void Verify_TogglescreenIcongets() throws InterruptedException {
		test.info("Click on toggleFullScreen is in progress");
		HP.togglefullscreen();
		test.info("Click on toggleFullScreen is validated");
	}
	@Test(priority=28)
	public void Verify_Theme_Button() throws InterruptedException, IOException {
		test.info("Click on ThemeIcon is in progress");
		HP.theme();
		test.info("Click on ThemeIcon is validated");
	}
	@Test(priority=29)
	public void Verify_Scroll_worksorNot() {
		HP.scrolldown();
		test.info("Vertical scroll is working properly");
	}
	
}
