package test;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class JobtimeLineTestcases extends TestNGListeners {
	@Test(priority=0)
     public void Click_On_JobTimeline() throws InterruptedException {
		test.info("Click On Jobtimeline icon on header is in progress");
    	 JT.jobtimeline();
    	 test.info("Click On Jobtimeline icon on header Validated");
     }
	@Test(priority=1)
     public void Click_On_Theme_Icon() throws InterruptedException {
		test.info("Click On Theme icon on Jobtimeline Page is in progress");
    	 JT.theme();
    	 test.info("Click On Theme icon on Jobtimeline Page is Validated");
     }
	@Test(priority=2)
	public void Click_On_ProfileIcon() throws InterruptedException {
		test.info("Click On Profile icon on Jobtimeline Page is in progress");
		JT.profile();
		 test.info("Click On Profile icon on Jobtimeline Page is Validated");
	}
	@Test(priority=3)
	public void Click_On_SignOut() {
		test.info("Click On Signout option on Jobtimeline Page is in progress");
		JT.signOut();
		test.info("click on signout is done");
	}
}
