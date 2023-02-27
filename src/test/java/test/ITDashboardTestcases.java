package test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.internal.annotations.IDataProvidable;

import listeners.TestNGListeners;

public class ITDashboardTestcases extends TestNGListeners {
	@Test(priority=1)
	public void Click_On_ITDashBoard() {
		test.info("Click on ITdashboard is in progress");
		ID.itdashboard();
		test.info("Click on ITdashboard is validated");
	}
	@Test(priority=2)
	public void Verify_SearchBYfileName() {
		test.info("Click on search by File Name is in progress");
		ID.searchbyfilename();
		test.info("Click on search by File Name is validated On ITdashboard page");
	}
	@Test(priority=3)
	public void Verify_Theme_Button() throws InterruptedException, IOException {
		test.info("Click on Theme Icon is in progress");
		HP.theme();
		test.info("Click on Theme Icon is validated on ITdashboard Page");
	}
	
}
