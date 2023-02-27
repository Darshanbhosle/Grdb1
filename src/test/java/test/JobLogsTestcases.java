package test;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class JobLogsTestcases extends TestNGListeners{

	@Test(priority=1)
	public void Click_On_JobLogs() {
		test.info("Clicking On Joblogs Icon on header");
		JL.joblogs();
		test.info("Click On Joblogs Icon on header is validated");
	}
	@Test(priority=2)
	public void Verify_All_Functionalities_In_Today() throws InterruptedException {
		test.info("Click today on Joblogs page is in progress");
		JL.today();
		test.info("Click today on Joblogs page is validated");
	}
	@Test(priority=3)
	public void Verify_Hover_On_Show_MoreData() throws InterruptedException {
		test.info("Hover ShowMoredata on Joblogs page is in progress");
		test.info("Click ShowMoreData on Joblogs page is in progress");
		test.info("Click ShowLessData on Joblogs page is in progress");
		JL.showmoredata();
		test.info("ShowMoreData on Joblogs page is validated");
		
		
	}
	@Test(priority=4)
	public void Verify_Hover_On_DeleteJob() throws InterruptedException {
		test.info("Hover deletejob on Joblogs page is in progress");
		test.info("Click deletejob on Joblogs page is in progress");
		JL.deletejob();
		test.info("DeleteJob on Joblogs page is validated");
	}
	@Test(priority=5)
	public void Verify_Hover_On_FileName() throws InterruptedException {
		test.info("Hover FileName on Joblogs page is in progress");
		test.info("Click FileName on Joblogs page is in progress");
		JL.filename();
		test.info("FileName on Joblogs page is validated");
		
	}
	@Test(priority=6)
	public void Verify_File_Gets_Download_Or_Not() throws InterruptedException {
		test.info("Click Downloadfile on Joblogs page is in progress");
		JL.downloadfile();
		test.info("Click Downloadfile on Joblogs page is validated");
	}
	@Test(priority=7)
	public void Verify_Download_Icon_Worksornot() throws InterruptedException {
		test.info("Click DownloadLogIcon on Joblogs page is in progress");
		JL.downloadLogIcon();
		test.info("Click DownloadLogIcon on Joblogs page is validated");
	}
	@Test(priority=8)
	public void Verify_Download_Errors_Works_Or_Not() throws InterruptedException {
		test.info("Hover download error on Joblogs page is in progress");
		test.info("Click download error on Joblogs page is in progress");
		test.info("Click download error on Joblogs page is in progress");
		JL.downloaderror();
		test.info("downloaderror button on Joblogs page is validated");
	}
	@Test(priority=9,enabled=false)
	public void Verify_FooterDropdown_WorksOrNot() throws InterruptedException {
		JL.footerdropdown();
	}
	@Test(priority=10)
	public void Verify_user_is_able_to_click_on_checkbox() throws InterruptedException {
		test.info("Click on checkbox is in progress");
		JL.checkbox();
		test.info("Click on checkbox is validated");
	}
	@Test(priority=11)
	public void Verify_ClickOn_AllDropDown_Element() throws InterruptedException {
		test.info("Click on All dropdown is in progress");
		JL.all();
		test.info("click on FOB is validated");
		test.info("click on PLC is validated");
		test.info("click on OFR is validated");
	}
	@Test(priority=12)
	public void Verify_ClickOn_AllDataSource_DropDownElements() throws InterruptedException {
		test.info("Click on All Datasource dropdown is in progress on JobLogs page");
		JL.alldatasource();
		test.info("click on Alldata source is validated");
		test.info("click on S3 source is validated");
		test.info("click on External source is validated");
		test.info("click on API source is validated");
		test.info("click on FTP source is validated");
	}
	@Test(priority=13)
	public void Verify_ClickOn_AllStatus_DropdownElement() throws InterruptedException {
		test.info("Click on All Datasource dropdown is in progress On Joblogs Page");
		JL.allstatus();
		test.info("click on AllStatus is validated");
		test.info("click on QueuedStatus is validated");
		test.info("click on VlidatingStatus is validated");
		test.info("click on WaitingStatus is validated");
		test.info("click on InsertingStatus is validated");
		test.info("click on CompletedStatus is validated");
		test.info("click on ErrorStatus is validated");
	}
	
	@Test(priority=14)
	public void Verify_All_Functionalities_In_Week() throws InterruptedException {
		test.info("Click on week is in progress On Joblogs Page");
		JL.week();
		test.info("Click on week is Validated");
		
	}
	@Test(priority=15)
	public void Verify_All_Functionalities_In_Month() throws InterruptedException {
		test.info("Click on Month is in progress On Joblogs Page");
		JL.month();
		test.info("Click on Month is validated on JobLogs page");
	}
	@Test(priority=16)
	public void Verify_All_Functionalities_In_Customedates() throws InterruptedException {
		test.info("Click on CustomeDates is in progress On Joblogs Page");
		JL.customedates();
		test.info("Click on CustomeDates is validated");
	}
	@Test(priority=17)
	public void Verify_Theme_Button() throws InterruptedException, IOException {
		test.info("Click on ThemeIcon is in progress On Joblogs Page");
		HP.theme();
		test.info("Click on ThemeIcon is validated");
	}
	
	

}
