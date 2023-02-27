package test;

import java.io.IOException;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class LaneDashboardTestcases extends TestNGListeners {

	@Test(priority=0)
	public void Click_On_Lanedashboard() {
		test.info("Click On Lanedashboard icon on header is in progress");
		LD.lanedashboard();
		test.info("Click On Lanedashboard icon on header is tested");
	}
	@Test(priority=1)
	public void Verify_Theme_WorksOrNot() throws InterruptedException, IOException {
		test.info("Click On Theme icon on Lanedashboard Page is in progress");
		LD.theme();
		test.info("Click On Theme Lanedashboard Page is validated");
	}
}
